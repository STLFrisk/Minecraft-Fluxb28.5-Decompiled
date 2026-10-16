package net.minecraft.world.gen.structure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ComponentScatteredFeaturePieces$SwampHut extends ComponentScatteredFeaturePieces$Feature {
   private boolean phw;
   private static final long a;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public ComponentScatteredFeaturePieces$SwampHut() {
   }

   public ComponentScatteredFeaturePieces$SwampHut(Random var1, int var2, int var3) {
      super(var1, var2, 64, var3, 7, 7, 9);
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 89836958864397L;
      super.z0d(var1);
      var1.zyu(c<"v">(22314, 8587657607246868742L ^ var2), this.phw);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 52670823734630L;
      super.oqf(var1);
      this.phw = var1.dvl(c<"v">(3030, 3185534539135771792L ^ var2));
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
      // 008: bipush 0
      // 009: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.s8h (Lt9d;Lyve;I)Z
      // 00c: aload 4
      // 00e: ifnull 23e
      // 011: ifne 021
      // 014: goto 01b
      // 017: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.a (Loov;)Loov;
      // 01a: athrow
      // 01b: bipush 0
      // 01c: ireturn
      // 01d: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: aload 1
      // 023: aload 3
      // 024: bipush 1
      // 025: bipush 1
      // 026: bipush 1
      // 027: bipush 5
      // 028: bipush 1
      // 029: bipush 7
      // 02b: getstatic ox_.wb7 Le0x;
      // 02e: getstatic x54$lti.b4p Lx54$lti;
      // 031: invokevirtual x54$lti.h8z ()I
      // 034: invokevirtual e0x.kig (I)Lzfz;
      // 037: getstatic ox_.wb7 Le0x;
      // 03a: getstatic x54$lti.b4p Lx54$lti;
      // 03d: invokevirtual x54$lti.h8z ()I
      // 040: invokevirtual e0x.kig (I)Lzfz;
      // 043: bipush 0
      // 044: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 047: aload 0
      // 048: aload 1
      // 049: aload 3
      // 04a: bipush 1
      // 04b: bipush 4
      // 04c: bipush 2
      // 04d: bipush 5
      // 04e: bipush 4
      // 04f: bipush 7
      // 051: getstatic ox_.wb7 Le0x;
      // 054: getstatic x54$lti.b4p Lx54$lti;
      // 057: invokevirtual x54$lti.h8z ()I
      // 05a: invokevirtual e0x.kig (I)Lzfz;
      // 05d: getstatic ox_.wb7 Le0x;
      // 060: getstatic x54$lti.b4p Lx54$lti;
      // 063: invokevirtual x54$lti.h8z ()I
      // 066: invokevirtual e0x.kig (I)Lzfz;
      // 069: bipush 0
      // 06a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 06d: aload 0
      // 06e: aload 1
      // 06f: aload 3
      // 070: bipush 2
      // 071: bipush 1
      // 072: bipush 0
      // 073: bipush 4
      // 074: bipush 1
      // 075: bipush 0
      // 076: getstatic ox_.wb7 Le0x;
      // 079: getstatic x54$lti.b4p Lx54$lti;
      // 07c: invokevirtual x54$lti.h8z ()I
      // 07f: invokevirtual e0x.kig (I)Lzfz;
      // 082: getstatic ox_.wb7 Le0x;
      // 085: getstatic x54$lti.b4p Lx54$lti;
      // 088: invokevirtual x54$lti.h8z ()I
      // 08b: invokevirtual e0x.kig (I)Lzfz;
      // 08e: bipush 0
      // 08f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 092: aload 0
      // 093: aload 1
      // 094: aload 3
      // 095: bipush 2
      // 096: bipush 2
      // 097: bipush 2
      // 098: bipush 3
      // 099: bipush 3
      // 09a: bipush 2
      // 09b: getstatic ox_.wb7 Le0x;
      // 09e: getstatic x54$lti.b4p Lx54$lti;
      // 0a1: invokevirtual x54$lti.h8z ()I
      // 0a4: invokevirtual e0x.kig (I)Lzfz;
      // 0a7: getstatic ox_.wb7 Le0x;
      // 0aa: getstatic x54$lti.b4p Lx54$lti;
      // 0ad: invokevirtual x54$lti.h8z ()I
      // 0b0: invokevirtual e0x.kig (I)Lzfz;
      // 0b3: bipush 0
      // 0b4: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0b7: aload 0
      // 0b8: aload 1
      // 0b9: aload 3
      // 0ba: bipush 1
      // 0bb: bipush 2
      // 0bc: bipush 3
      // 0bd: bipush 1
      // 0be: bipush 3
      // 0bf: bipush 6
      // 0c1: getstatic ox_.wb7 Le0x;
      // 0c4: getstatic x54$lti.b4p Lx54$lti;
      // 0c7: invokevirtual x54$lti.h8z ()I
      // 0ca: invokevirtual e0x.kig (I)Lzfz;
      // 0cd: getstatic ox_.wb7 Le0x;
      // 0d0: getstatic x54$lti.b4p Lx54$lti;
      // 0d3: invokevirtual x54$lti.h8z ()I
      // 0d6: invokevirtual e0x.kig (I)Lzfz;
      // 0d9: bipush 0
      // 0da: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0dd: aload 0
      // 0de: aload 1
      // 0df: aload 3
      // 0e0: bipush 5
      // 0e1: bipush 2
      // 0e2: bipush 3
      // 0e3: bipush 5
      // 0e4: bipush 3
      // 0e5: bipush 6
      // 0e7: getstatic ox_.wb7 Le0x;
      // 0ea: getstatic x54$lti.b4p Lx54$lti;
      // 0ed: invokevirtual x54$lti.h8z ()I
      // 0f0: invokevirtual e0x.kig (I)Lzfz;
      // 0f3: getstatic ox_.wb7 Le0x;
      // 0f6: getstatic x54$lti.b4p Lx54$lti;
      // 0f9: invokevirtual x54$lti.h8z ()I
      // 0fc: invokevirtual e0x.kig (I)Lzfz;
      // 0ff: bipush 0
      // 100: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 103: aload 0
      // 104: aload 1
      // 105: aload 3
      // 106: bipush 2
      // 107: bipush 2
      // 108: bipush 7
      // 10a: bipush 4
      // 10b: bipush 3
      // 10c: bipush 7
      // 10e: getstatic ox_.wb7 Le0x;
      // 111: getstatic x54$lti.b4p Lx54$lti;
      // 114: invokevirtual x54$lti.h8z ()I
      // 117: invokevirtual e0x.kig (I)Lzfz;
      // 11a: getstatic ox_.wb7 Le0x;
      // 11d: getstatic x54$lti.b4p Lx54$lti;
      // 120: invokevirtual x54$lti.h8z ()I
      // 123: invokevirtual e0x.kig (I)Lzfz;
      // 126: bipush 0
      // 127: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 12a: aload 0
      // 12b: aload 1
      // 12c: aload 3
      // 12d: bipush 1
      // 12e: bipush 0
      // 12f: bipush 2
      // 130: bipush 1
      // 131: bipush 3
      // 132: bipush 2
      // 133: getstatic ox_.uom Le0x;
      // 136: invokevirtual e0x.l4i ()Lzfz;
      // 139: getstatic ox_.uom Le0x;
      // 13c: invokevirtual e0x.l4i ()Lzfz;
      // 13f: bipush 0
      // 140: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 143: aload 0
      // 144: aload 1
      // 145: aload 3
      // 146: bipush 5
      // 147: bipush 0
      // 148: bipush 2
      // 149: bipush 5
      // 14a: bipush 3
      // 14b: bipush 2
      // 14c: getstatic ox_.uom Le0x;
      // 14f: invokevirtual e0x.l4i ()Lzfz;
      // 152: getstatic ox_.uom Le0x;
      // 155: invokevirtual e0x.l4i ()Lzfz;
      // 158: bipush 0
      // 159: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 15c: aload 0
      // 15d: aload 1
      // 15e: aload 3
      // 15f: bipush 1
      // 160: bipush 0
      // 161: bipush 7
      // 163: bipush 1
      // 164: bipush 3
      // 165: bipush 7
      // 167: getstatic ox_.uom Le0x;
      // 16a: invokevirtual e0x.l4i ()Lzfz;
      // 16d: getstatic ox_.uom Le0x;
      // 170: invokevirtual e0x.l4i ()Lzfz;
      // 173: bipush 0
      // 174: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 177: aload 0
      // 178: aload 1
      // 179: aload 3
      // 17a: bipush 5
      // 17b: bipush 0
      // 17c: bipush 7
      // 17e: bipush 5
      // 17f: bipush 3
      // 180: bipush 7
      // 182: getstatic ox_.uom Le0x;
      // 185: invokevirtual e0x.l4i ()Lzfz;
      // 188: getstatic ox_.uom Le0x;
      // 18b: invokevirtual e0x.l4i ()Lzfz;
      // 18e: bipush 0
      // 18f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 192: aload 0
      // 193: aload 1
      // 194: getstatic ox_.j5b Le0x;
      // 197: invokevirtual e0x.l4i ()Lzfz;
      // 19a: bipush 2
      // 19b: bipush 3
      // 19c: bipush 2
      // 19d: aload 3
      // 19e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1a1: aload 0
      // 1a2: aload 1
      // 1a3: getstatic ox_.j5b Le0x;
      // 1a6: invokevirtual e0x.l4i ()Lzfz;
      // 1a9: bipush 3
      // 1aa: bipush 3
      // 1ab: bipush 7
      // 1ad: aload 3
      // 1ae: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1b1: aload 0
      // 1b2: aload 1
      // 1b3: getstatic ox_.ibw Le0x;
      // 1b6: invokevirtual e0x.l4i ()Lzfz;
      // 1b9: bipush 1
      // 1ba: bipush 3
      // 1bb: bipush 4
      // 1bc: aload 3
      // 1bd: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1c0: aload 0
      // 1c1: aload 1
      // 1c2: getstatic ox_.ibw Le0x;
      // 1c5: invokevirtual e0x.l4i ()Lzfz;
      // 1c8: bipush 5
      // 1c9: bipush 3
      // 1ca: bipush 4
      // 1cb: aload 3
      // 1cc: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1cf: aload 0
      // 1d0: aload 1
      // 1d1: getstatic ox_.ibw Le0x;
      // 1d4: invokevirtual e0x.l4i ()Lzfz;
      // 1d7: bipush 5
      // 1d8: bipush 3
      // 1d9: bipush 5
      // 1da: aload 3
      // 1db: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1de: aload 0
      // 1df: aload 1
      // 1e0: getstatic ox_.fl_ Le0x;
      // 1e3: invokevirtual e0x.l4i ()Lzfz;
      // 1e6: getstatic yip.jt7 Lzb_;
      // 1e9: getstatic yip$ob3.rxd Lyip$ob3;
      // 1ec: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1f1: bipush 1
      // 1f2: bipush 3
      // 1f3: bipush 5
      // 1f4: aload 3
      // 1f5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1f8: aload 0
      // 1f9: aload 1
      // 1fa: getstatic ox_.nxz Le0x;
      // 1fd: invokevirtual e0x.l4i ()Lzfz;
      // 200: bipush 3
      // 201: bipush 2
      // 202: bipush 6
      // 204: aload 3
      // 205: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 208: aload 0
      // 209: aload 1
      // 20a: getstatic ox_.lc9 Lmdv;
      // 20d: invokevirtual mdv.l4i ()Lzfz;
      // 210: bipush 4
      // 211: bipush 2
      // 212: bipush 6
      // 214: aload 3
      // 215: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 218: aload 0
      // 219: aload 1
      // 21a: getstatic ox_.j5b Le0x;
      // 21d: invokevirtual e0x.l4i ()Lzfz;
      // 220: bipush 1
      // 221: bipush 2
      // 222: bipush 1
      // 223: aload 3
      // 224: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 227: aload 0
      // 228: aload 1
      // 229: getstatic ox_.j5b Le0x;
      // 22c: invokevirtual e0x.l4i ()Lzfz;
      // 22f: bipush 5
      // 230: bipush 2
      // 231: bipush 1
      // 232: aload 3
      // 233: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.lzy (Lt9d;Lzfz;IIILyve;)V
      // 236: aload 0
      // 237: getstatic ox_.olk Le0x;
      // 23a: bipush 3
      // 23b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.ujv (Le0x;I)I
      // 23e: istore 5
      // 240: aload 0
      // 241: getstatic ox_.olk Le0x;
      // 244: bipush 1
      // 245: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.ujv (Le0x;I)I
      // 248: istore 6
      // 24a: aload 0
      // 24b: getstatic ox_.olk Le0x;
      // 24e: bipush 0
      // 24f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.ujv (Le0x;I)I
      // 252: istore 7
      // 254: aload 0
      // 255: getstatic ox_.olk Le0x;
      // 258: bipush 2
      // 259: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.ujv (Le0x;I)I
      // 25c: istore 8
      // 25e: aload 0
      // 25f: aload 1
      // 260: aload 3
      // 261: bipush 0
      // 262: bipush 4
      // 263: bipush 1
      // 264: bipush 6
      // 266: bipush 4
      // 267: bipush 1
      // 268: getstatic ox_.fhe Le0x;
      // 26b: iload 5
      // 26d: invokevirtual e0x.kig (I)Lzfz;
      // 270: getstatic ox_.fhe Le0x;
      // 273: iload 5
      // 275: invokevirtual e0x.kig (I)Lzfz;
      // 278: bipush 0
      // 279: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 27c: aload 0
      // 27d: aload 1
      // 27e: aload 3
      // 27f: bipush 0
      // 280: bipush 4
      // 281: bipush 2
      // 282: bipush 0
      // 283: bipush 4
      // 284: bipush 7
      // 286: getstatic ox_.fhe Le0x;
      // 289: iload 7
      // 28b: invokevirtual e0x.kig (I)Lzfz;
      // 28e: getstatic ox_.fhe Le0x;
      // 291: iload 7
      // 293: invokevirtual e0x.kig (I)Lzfz;
      // 296: bipush 0
      // 297: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 29a: aload 0
      // 29b: aload 1
      // 29c: aload 3
      // 29d: bipush 6
      // 29f: bipush 4
      // 2a0: bipush 2
      // 2a1: bipush 6
      // 2a3: bipush 4
      // 2a4: bipush 7
      // 2a6: getstatic ox_.fhe Le0x;
      // 2a9: iload 6
      // 2ab: invokevirtual e0x.kig (I)Lzfz;
      // 2ae: getstatic ox_.fhe Le0x;
      // 2b1: iload 6
      // 2b3: invokevirtual e0x.kig (I)Lzfz;
      // 2b6: bipush 0
      // 2b7: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2ba: aload 0
      // 2bb: aload 1
      // 2bc: aload 3
      // 2bd: bipush 0
      // 2be: bipush 4
      // 2bf: bipush 8
      // 2c1: bipush 6
      // 2c3: bipush 4
      // 2c4: bipush 8
      // 2c6: getstatic ox_.fhe Le0x;
      // 2c9: iload 8
      // 2cb: invokevirtual e0x.kig (I)Lzfz;
      // 2ce: getstatic ox_.fhe Le0x;
      // 2d1: iload 8
      // 2d3: invokevirtual e0x.kig (I)Lzfz;
      // 2d6: bipush 0
      // 2d7: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2da: bipush 2
      // 2db: istore 9
      // 2dd: iload 9
      // 2df: bipush 7
      // 2e1: if_icmpgt 31f
      // 2e4: bipush 1
      // 2e5: aload 4
      // 2e7: ifnull 323
      // 2ea: istore 10
      // 2ec: iload 10
      // 2ee: bipush 5
      // 2ef: if_icmpgt 317
      // 2f2: aload 0
      // 2f3: aload 1
      // 2f4: getstatic ox_.uom Le0x;
      // 2f7: invokevirtual e0x.l4i ()Lzfz;
      // 2fa: iload 10
      // 2fc: bipush -1
      // 2fd: iload 9
      // 2ff: aload 3
      // 300: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.doc (Lt9d;Lzfz;IIILyve;)V
      // 303: iinc 10 4
      // 306: aload 4
      // 308: ifnull 31a
      // 30b: aload 4
      // 30d: ifnonnull 2ec
      // 310: goto 317
      // 313: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.a (Loov;)Loov;
      // 316: athrow
      // 317: iinc 9 5
      // 31a: aload 4
      // 31c: ifnonnull 2dd
      // 31f: aload 0
      // 320: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.phw Z
      // 323: aload 4
      // 325: ifnull 3b3
      // 328: ifne 3b2
      // 32b: goto 332
      // 32e: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.a (Loov;)Loov;
      // 331: athrow
      // 332: aload 0
      // 333: bipush 2
      // 334: bipush 5
      // 335: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.q__ (II)I
      // 338: istore 9
      // 33a: aload 0
      // 33b: bipush 2
      // 33c: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut._tw (I)I
      // 33f: istore 10
      // 341: aload 0
      // 342: bipush 2
      // 343: bipush 5
      // 344: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut._ye (II)I
      // 347: istore 11
      // 349: aload 3
      // 34a: new mew
      // 34d: dup
      // 34e: iload 9
      // 350: iload 10
      // 352: iload 11
      // 354: invokespecial mew.<init> (III)V
      // 357: invokevirtual yve.vwy (Lwgo;)Z
      // 35a: aload 4
      // 35c: ifnull 3b3
      // 35f: ifeq 3b2
      // 362: goto 369
      // 365: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.a (Loov;)Loov;
      // 368: athrow
      // 369: aload 0
      // 36a: bipush 1
      // 36b: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut.phw Z
      // 36e: new zty
      // 371: dup
      // 372: aload 1
      // 373: invokespecial zty.<init> (Lt9d;)V
      // 376: astore 12
      // 378: aload 12
      // 37a: iload 9
      // 37c: i2d
      // 37d: ldc2_w 0.5
      // 380: dadd
      // 381: iload 10
      // 383: i2d
      // 384: iload 11
      // 386: i2d
      // 387: ldc2_w 0.5
      // 38a: dadd
      // 38b: fconst_0
      // 38c: fconst_0
      // 38d: invokevirtual zty.x24 (DDDFF)V
      // 390: aload 12
      // 392: aload 1
      // 393: new mew
      // 396: dup
      // 397: iload 9
      // 399: iload 10
      // 39b: iload 11
      // 39d: invokespecial mew.<init> (III)V
      // 3a0: invokevirtual t9d.sms (Lmew;)Lcss;
      // 3a3: aconst_null
      // 3a4: checkcast ps6
      // 3a7: invokevirtual zty.hx8 (Lcss;Lps6;)Lps6;
      // 3aa: pop
      // 3ab: aload 1
      // 3ac: aload 12
      // 3ae: invokevirtual t9d.xzq (Li2h;)Z
      // 3b1: pop
      // 3b2: bipush 1
      // 3b3: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3444008244460488289L, 8122333556829868824L, MethodHandles.lookup().lookupClass()).a(114398853712233L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 129015947853820L;
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
      String var6 = "\u0016Æ\u008aV<¬r\u0016z#ú\u007f_\u008eÊî\u0010k¶\u00ad!\u0004H\u0085Jg\u009eÎò\u0097\u0081ë\u0095";
      int var8 = "\u0016Æ\u008aV<¬r\u0016z#ú\u007f_\u008eÊî\u0010k¶\u00ad!\u0004H\u0085Jg\u009eÎò\u0097\u0081ë\u0095".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            j = var9;
            k = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25450;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
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
         throw new RuntimeException("net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
