package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
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

public class ComponentScatteredFeaturePieces$JunglePyramid extends ComponentScatteredFeaturePieces$Feature {
   private boolean _jy;
   private boolean xzf;
   private boolean a9v;
   private boolean ifk;
   private static final List jsk;
   private static final List _b0;
   private static ComponentScatteredFeaturePieces$JunglePyramid$d3n e5j;
   private static final long a;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public ComponentScatteredFeaturePieces$JunglePyramid() {
   }

   public ComponentScatteredFeaturePieces$JunglePyramid(Random var1, int var2, int var3) {
      super(var1, var2, 64, var3, 12, 10, 15);
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 77389758617725L;
      super.z0d(var1);
      var1.zyu(c<"m">(26047, 1619734947052305033L ^ var2), this._jy);
      var1.zyu(c<"m">(3062, 3803762354819093700L ^ var2), this.xzf);
      var1.zyu(c<"m">(25975, 5495471019899435590L ^ var2), this.a9v);
      var1.zyu(c<"m">(12637, 4001966431067631214L ^ var2), this.ifk);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 61783518351638L;
      super.oqf(var1);
      this._jy = var1.dvl(c<"m">(4977, 613583326442587434L ^ var2));
      this.xzf = var1.dvl(c<"m">(3128, 8969076020451646054L ^ var2));
      this.a9v = var1.dvl(c<"m">(7302, 8955022780182956761L ^ var2));
      this.ifk = var1.dvl(c<"m">(17688, 7570900317002945348L ^ var2));
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
      // 008: bipush 0
      // 009: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.s8h (Lt9d;Lyve;I)Z
      // 00c: aload 4
      // 00e: ifnull 029
      // 011: ifne 021
      // 014: goto 01b
      // 017: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 01a: athrow
      // 01b: bipush 0
      // 01c: ireturn
      // 01d: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: getstatic ox_.l3f Le0x;
      // 025: bipush 3
      // 026: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // 029: istore 5
      // 02b: aload 0
      // 02c: getstatic ox_.l3f Le0x;
      // 02f: bipush 2
      // 030: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // 033: istore 6
      // 035: aload 0
      // 036: getstatic ox_.l3f Le0x;
      // 039: bipush 0
      // 03a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // 03d: istore 7
      // 03f: aload 0
      // 040: getstatic ox_.l3f Le0x;
      // 043: bipush 1
      // 044: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // 047: istore 8
      // 049: aload 0
      // 04a: aload 1
      // 04b: aload 3
      // 04c: bipush 0
      // 04d: bipush -4
      // 04f: bipush 0
      // 050: aload 0
      // 051: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.cu2 I
      // 054: bipush 1
      // 055: isub
      // 056: bipush 0
      // 057: aload 0
      // 058: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.kr0 I
      // 05b: bipush 1
      // 05c: isub
      // 05d: bipush 0
      // 05e: aload 2
      // 05f: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 062: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 065: aload 0
      // 066: aload 1
      // 067: aload 3
      // 068: bipush 2
      // 069: bipush 1
      // 06a: bipush 2
      // 06b: bipush 9
      // 06d: bipush 2
      // 06e: bipush 2
      // 06f: bipush 0
      // 070: aload 2
      // 071: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 074: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 077: aload 0
      // 078: aload 1
      // 079: aload 3
      // 07a: bipush 2
      // 07b: bipush 1
      // 07c: bipush 12
      // 07e: bipush 9
      // 080: bipush 2
      // 081: bipush 12
      // 083: bipush 0
      // 084: aload 2
      // 085: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 088: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 08b: aload 0
      // 08c: aload 1
      // 08d: aload 3
      // 08e: bipush 2
      // 08f: bipush 1
      // 090: bipush 3
      // 091: bipush 2
      // 092: bipush 2
      // 093: bipush 11
      // 095: bipush 0
      // 096: aload 2
      // 097: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 09a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 09d: aload 0
      // 09e: aload 1
      // 09f: aload 3
      // 0a0: bipush 9
      // 0a2: bipush 1
      // 0a3: bipush 3
      // 0a4: bipush 9
      // 0a6: bipush 2
      // 0a7: bipush 11
      // 0a9: bipush 0
      // 0aa: aload 2
      // 0ab: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 0ae: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 0b1: aload 0
      // 0b2: aload 1
      // 0b3: aload 3
      // 0b4: bipush 1
      // 0b5: bipush 3
      // 0b6: bipush 1
      // 0b7: bipush 10
      // 0b9: bipush 6
      // 0bb: bipush 1
      // 0bc: bipush 0
      // 0bd: aload 2
      // 0be: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 0c1: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 0c4: aload 0
      // 0c5: aload 1
      // 0c6: aload 3
      // 0c7: bipush 1
      // 0c8: bipush 3
      // 0c9: bipush 13
      // 0cb: bipush 10
      // 0cd: bipush 6
      // 0cf: bipush 13
      // 0d1: bipush 0
      // 0d2: aload 2
      // 0d3: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 0d6: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 0d9: aload 0
      // 0da: aload 1
      // 0db: aload 3
      // 0dc: bipush 1
      // 0dd: bipush 3
      // 0de: bipush 2
      // 0df: bipush 1
      // 0e0: bipush 6
      // 0e2: bipush 12
      // 0e4: bipush 0
      // 0e5: aload 2
      // 0e6: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 0e9: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 0ec: aload 0
      // 0ed: aload 1
      // 0ee: aload 3
      // 0ef: bipush 10
      // 0f1: bipush 3
      // 0f2: bipush 2
      // 0f3: bipush 10
      // 0f5: bipush 6
      // 0f7: bipush 12
      // 0f9: bipush 0
      // 0fa: aload 2
      // 0fb: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 0fe: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 101: aload 0
      // 102: aload 1
      // 103: aload 3
      // 104: bipush 2
      // 105: bipush 3
      // 106: bipush 2
      // 107: bipush 9
      // 109: bipush 3
      // 10a: bipush 12
      // 10c: bipush 0
      // 10d: aload 2
      // 10e: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 111: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 114: aload 0
      // 115: aload 1
      // 116: aload 3
      // 117: bipush 2
      // 118: bipush 6
      // 11a: bipush 2
      // 11b: bipush 9
      // 11d: bipush 6
      // 11f: bipush 12
      // 121: bipush 0
      // 122: aload 2
      // 123: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 126: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 129: aload 0
      // 12a: aload 1
      // 12b: aload 3
      // 12c: bipush 3
      // 12d: bipush 7
      // 12f: bipush 3
      // 130: bipush 8
      // 132: bipush 7
      // 134: bipush 11
      // 136: bipush 0
      // 137: aload 2
      // 138: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 13b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 13e: aload 0
      // 13f: aload 1
      // 140: aload 3
      // 141: bipush 4
      // 142: bipush 8
      // 144: bipush 4
      // 145: bipush 7
      // 147: bipush 8
      // 149: bipush 10
      // 14b: bipush 0
      // 14c: aload 2
      // 14d: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 150: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 153: aload 0
      // 154: aload 1
      // 155: aload 3
      // 156: bipush 3
      // 157: bipush 1
      // 158: bipush 3
      // 159: bipush 8
      // 15b: bipush 2
      // 15c: bipush 11
      // 15e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 161: aload 0
      // 162: aload 1
      // 163: aload 3
      // 164: bipush 4
      // 165: bipush 3
      // 166: bipush 6
      // 168: bipush 7
      // 16a: bipush 3
      // 16b: bipush 9
      // 16d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 170: aload 0
      // 171: aload 1
      // 172: aload 3
      // 173: bipush 2
      // 174: bipush 4
      // 175: bipush 2
      // 176: bipush 9
      // 178: bipush 5
      // 179: bipush 12
      // 17b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 17e: aload 0
      // 17f: aload 1
      // 180: aload 3
      // 181: bipush 4
      // 182: bipush 6
      // 184: bipush 5
      // 185: bipush 7
      // 187: bipush 6
      // 189: bipush 9
      // 18b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 18e: aload 0
      // 18f: aload 1
      // 190: aload 3
      // 191: bipush 5
      // 192: bipush 7
      // 194: bipush 6
      // 196: bipush 6
      // 198: bipush 7
      // 19a: bipush 8
      // 19c: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 19f: aload 0
      // 1a0: aload 1
      // 1a1: aload 3
      // 1a2: bipush 5
      // 1a3: bipush 1
      // 1a4: bipush 2
      // 1a5: bipush 6
      // 1a7: bipush 2
      // 1a8: bipush 2
      // 1a9: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 1ac: aload 0
      // 1ad: aload 1
      // 1ae: aload 3
      // 1af: bipush 5
      // 1b0: bipush 2
      // 1b1: bipush 12
      // 1b3: bipush 6
      // 1b5: bipush 2
      // 1b6: bipush 12
      // 1b8: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 1bb: aload 0
      // 1bc: aload 1
      // 1bd: aload 3
      // 1be: bipush 5
      // 1bf: bipush 5
      // 1c0: bipush 1
      // 1c1: bipush 6
      // 1c3: bipush 5
      // 1c4: bipush 1
      // 1c5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 1c8: aload 0
      // 1c9: aload 1
      // 1ca: aload 3
      // 1cb: bipush 5
      // 1cc: bipush 5
      // 1cd: bipush 13
      // 1cf: bipush 6
      // 1d1: bipush 5
      // 1d2: bipush 13
      // 1d4: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 1d7: aload 0
      // 1d8: aload 1
      // 1d9: getstatic ox_.ibw Le0x;
      // 1dc: invokevirtual e0x.l4i ()Lzfz;
      // 1df: bipush 1
      // 1e0: bipush 5
      // 1e1: bipush 5
      // 1e2: aload 3
      // 1e3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1e6: aload 0
      // 1e7: aload 1
      // 1e8: getstatic ox_.ibw Le0x;
      // 1eb: invokevirtual e0x.l4i ()Lzfz;
      // 1ee: bipush 10
      // 1f0: bipush 5
      // 1f1: bipush 5
      // 1f2: aload 3
      // 1f3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 1f6: aload 0
      // 1f7: aload 1
      // 1f8: getstatic ox_.ibw Le0x;
      // 1fb: invokevirtual e0x.l4i ()Lzfz;
      // 1fe: bipush 1
      // 1ff: bipush 5
      // 200: bipush 9
      // 202: aload 3
      // 203: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 206: aload 0
      // 207: aload 1
      // 208: getstatic ox_.ibw Le0x;
      // 20b: invokevirtual e0x.l4i ()Lzfz;
      // 20e: bipush 10
      // 210: bipush 5
      // 211: bipush 9
      // 213: aload 3
      // 214: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 217: bipush 0
      // 218: istore 9
      // 21a: iload 9
      // 21c: bipush 14
      // 21e: if_icmpgt 285
      // 221: aload 0
      // 222: aload 1
      // 223: aload 3
      // 224: bipush 2
      // 225: bipush 4
      // 226: iload 9
      // 228: bipush 2
      // 229: bipush 5
      // 22a: iload 9
      // 22c: bipush 0
      // 22d: aload 2
      // 22e: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 231: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 234: aload 0
      // 235: aload 1
      // 236: aload 3
      // 237: bipush 4
      // 238: bipush 4
      // 239: iload 9
      // 23b: bipush 4
      // 23c: bipush 5
      // 23d: iload 9
      // 23f: bipush 0
      // 240: aload 2
      // 241: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 244: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 247: aload 0
      // 248: aload 1
      // 249: aload 3
      // 24a: bipush 7
      // 24c: bipush 4
      // 24d: iload 9
      // 24f: bipush 7
      // 251: bipush 5
      // 252: iload 9
      // 254: bipush 0
      // 255: aload 2
      // 256: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 259: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 25c: aload 0
      // 25d: aload 1
      // 25e: aload 3
      // 25f: bipush 9
      // 261: bipush 4
      // 262: iload 9
      // 264: bipush 9
      // 266: bipush 5
      // 267: iload 9
      // 269: bipush 0
      // 26a: aload 2
      // 26b: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 26e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 271: iinc 9 14
      // 274: aload 4
      // 276: ifnull 299
      // 279: aload 4
      // 27b: ifnonnull 21a
      // 27e: goto 285
      // 281: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 284: athrow
      // 285: aload 0
      // 286: aload 1
      // 287: aload 3
      // 288: bipush 5
      // 289: bipush 6
      // 28b: bipush 0
      // 28c: bipush 6
      // 28e: bipush 6
      // 290: bipush 0
      // 291: bipush 0
      // 292: aload 2
      // 293: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 296: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 299: bipush 0
      // 29a: istore 9
      // 29c: iload 9
      // 29e: bipush 11
      // 2a0: if_icmpgt 30f
      // 2a3: bipush 2
      // 2a4: aload 4
      // 2a6: ifnull 542
      // 2a9: istore 10
      // 2ab: iload 10
      // 2ad: bipush 12
      // 2af: if_icmpgt 2db
      // 2b2: aload 0
      // 2b3: aload 1
      // 2b4: aload 3
      // 2b5: iload 9
      // 2b7: bipush 4
      // 2b8: iload 10
      // 2ba: iload 9
      // 2bc: bipush 5
      // 2bd: iload 10
      // 2bf: bipush 0
      // 2c0: aload 2
      // 2c1: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 2c4: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 2c7: iinc 10 2
      // 2ca: aload 4
      // 2cc: ifnull 30a
      // 2cf: aload 4
      // 2d1: ifnonnull 2ab
      // 2d4: goto 2db
      // 2d7: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 2da: athrow
      // 2db: aload 0
      // 2dc: aload 1
      // 2dd: aload 3
      // 2de: iload 9
      // 2e0: bipush 6
      // 2e2: bipush 5
      // 2e3: iload 9
      // 2e5: bipush 6
      // 2e7: bipush 5
      // 2e8: bipush 0
      // 2e9: aload 2
      // 2ea: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 2ed: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 2f0: aload 0
      // 2f1: aload 1
      // 2f2: aload 3
      // 2f3: iload 9
      // 2f5: bipush 6
      // 2f7: bipush 9
      // 2f9: iload 9
      // 2fb: bipush 6
      // 2fd: bipush 9
      // 2ff: bipush 0
      // 300: aload 2
      // 301: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 304: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 307: iinc 9 11
      // 30a: aload 4
      // 30c: ifnonnull 29c
      // 30f: aload 0
      // 310: aload 1
      // 311: aload 3
      // 312: bipush 2
      // 313: bipush 7
      // 315: bipush 2
      // 316: bipush 2
      // 317: bipush 9
      // 319: bipush 2
      // 31a: bipush 0
      // 31b: aload 2
      // 31c: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 31f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 322: aload 0
      // 323: aload 1
      // 324: aload 3
      // 325: bipush 9
      // 327: bipush 7
      // 329: bipush 2
      // 32a: bipush 9
      // 32c: bipush 9
      // 32e: bipush 2
      // 32f: bipush 0
      // 330: aload 2
      // 331: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 334: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 337: aload 0
      // 338: aload 1
      // 339: aload 3
      // 33a: bipush 2
      // 33b: bipush 7
      // 33d: bipush 12
      // 33f: bipush 2
      // 340: bipush 9
      // 342: bipush 12
      // 344: bipush 0
      // 345: aload 2
      // 346: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 349: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 34c: aload 0
      // 34d: aload 1
      // 34e: aload 3
      // 34f: bipush 9
      // 351: bipush 7
      // 353: bipush 12
      // 355: bipush 9
      // 357: bipush 9
      // 359: bipush 12
      // 35b: bipush 0
      // 35c: aload 2
      // 35d: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 360: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 363: aload 0
      // 364: aload 1
      // 365: aload 3
      // 366: bipush 4
      // 367: bipush 9
      // 369: bipush 4
      // 36a: bipush 4
      // 36b: bipush 9
      // 36d: bipush 4
      // 36e: bipush 0
      // 36f: aload 2
      // 370: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 373: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 376: aload 0
      // 377: aload 1
      // 378: aload 3
      // 379: bipush 7
      // 37b: bipush 9
      // 37d: bipush 4
      // 37e: bipush 7
      // 380: bipush 9
      // 382: bipush 4
      // 383: bipush 0
      // 384: aload 2
      // 385: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 388: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 38b: aload 0
      // 38c: aload 1
      // 38d: aload 3
      // 38e: bipush 4
      // 38f: bipush 9
      // 391: bipush 10
      // 393: bipush 4
      // 394: bipush 9
      // 396: bipush 10
      // 398: bipush 0
      // 399: aload 2
      // 39a: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 39d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 3a0: aload 0
      // 3a1: aload 1
      // 3a2: aload 3
      // 3a3: bipush 7
      // 3a5: bipush 9
      // 3a7: bipush 10
      // 3a9: bipush 7
      // 3ab: bipush 9
      // 3ad: bipush 10
      // 3af: bipush 0
      // 3b0: aload 2
      // 3b1: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 3b4: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 3b7: aload 0
      // 3b8: aload 1
      // 3b9: aload 3
      // 3ba: bipush 5
      // 3bb: bipush 9
      // 3bd: bipush 7
      // 3bf: bipush 6
      // 3c1: bipush 9
      // 3c3: bipush 7
      // 3c5: bipush 0
      // 3c6: aload 2
      // 3c7: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 3ca: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 3cd: aload 0
      // 3ce: aload 1
      // 3cf: getstatic ox_.l3f Le0x;
      // 3d2: iload 5
      // 3d4: invokevirtual e0x.kig (I)Lzfz;
      // 3d7: bipush 5
      // 3d8: bipush 9
      // 3da: bipush 6
      // 3dc: aload 3
      // 3dd: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3e0: aload 0
      // 3e1: aload 1
      // 3e2: getstatic ox_.l3f Le0x;
      // 3e5: iload 5
      // 3e7: invokevirtual e0x.kig (I)Lzfz;
      // 3ea: bipush 6
      // 3ec: bipush 9
      // 3ee: bipush 6
      // 3f0: aload 3
      // 3f1: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3f4: aload 0
      // 3f5: aload 1
      // 3f6: getstatic ox_.l3f Le0x;
      // 3f9: iload 6
      // 3fb: invokevirtual e0x.kig (I)Lzfz;
      // 3fe: bipush 5
      // 3ff: bipush 9
      // 401: bipush 8
      // 403: aload 3
      // 404: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 407: aload 0
      // 408: aload 1
      // 409: getstatic ox_.l3f Le0x;
      // 40c: iload 6
      // 40e: invokevirtual e0x.kig (I)Lzfz;
      // 411: bipush 6
      // 413: bipush 9
      // 415: bipush 8
      // 417: aload 3
      // 418: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 41b: aload 0
      // 41c: aload 1
      // 41d: getstatic ox_.l3f Le0x;
      // 420: iload 5
      // 422: invokevirtual e0x.kig (I)Lzfz;
      // 425: bipush 4
      // 426: bipush 0
      // 427: bipush 0
      // 428: aload 3
      // 429: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 42c: aload 0
      // 42d: aload 1
      // 42e: getstatic ox_.l3f Le0x;
      // 431: iload 5
      // 433: invokevirtual e0x.kig (I)Lzfz;
      // 436: bipush 5
      // 437: bipush 0
      // 438: bipush 0
      // 439: aload 3
      // 43a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 43d: aload 0
      // 43e: aload 1
      // 43f: getstatic ox_.l3f Le0x;
      // 442: iload 5
      // 444: invokevirtual e0x.kig (I)Lzfz;
      // 447: bipush 6
      // 449: bipush 0
      // 44a: bipush 0
      // 44b: aload 3
      // 44c: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 44f: aload 0
      // 450: aload 1
      // 451: getstatic ox_.l3f Le0x;
      // 454: iload 5
      // 456: invokevirtual e0x.kig (I)Lzfz;
      // 459: bipush 7
      // 45b: bipush 0
      // 45c: bipush 0
      // 45d: aload 3
      // 45e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 461: aload 0
      // 462: aload 1
      // 463: getstatic ox_.l3f Le0x;
      // 466: iload 5
      // 468: invokevirtual e0x.kig (I)Lzfz;
      // 46b: bipush 4
      // 46c: bipush 1
      // 46d: bipush 8
      // 46f: aload 3
      // 470: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 473: aload 0
      // 474: aload 1
      // 475: getstatic ox_.l3f Le0x;
      // 478: iload 5
      // 47a: invokevirtual e0x.kig (I)Lzfz;
      // 47d: bipush 4
      // 47e: bipush 2
      // 47f: bipush 9
      // 481: aload 3
      // 482: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 485: aload 0
      // 486: aload 1
      // 487: getstatic ox_.l3f Le0x;
      // 48a: iload 5
      // 48c: invokevirtual e0x.kig (I)Lzfz;
      // 48f: bipush 4
      // 490: bipush 3
      // 491: bipush 10
      // 493: aload 3
      // 494: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 497: aload 0
      // 498: aload 1
      // 499: getstatic ox_.l3f Le0x;
      // 49c: iload 5
      // 49e: invokevirtual e0x.kig (I)Lzfz;
      // 4a1: bipush 7
      // 4a3: bipush 1
      // 4a4: bipush 8
      // 4a6: aload 3
      // 4a7: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4aa: aload 0
      // 4ab: aload 1
      // 4ac: getstatic ox_.l3f Le0x;
      // 4af: iload 5
      // 4b1: invokevirtual e0x.kig (I)Lzfz;
      // 4b4: bipush 7
      // 4b6: bipush 2
      // 4b7: bipush 9
      // 4b9: aload 3
      // 4ba: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4bd: aload 0
      // 4be: aload 1
      // 4bf: getstatic ox_.l3f Le0x;
      // 4c2: iload 5
      // 4c4: invokevirtual e0x.kig (I)Lzfz;
      // 4c7: bipush 7
      // 4c9: bipush 3
      // 4ca: bipush 10
      // 4cc: aload 3
      // 4cd: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4d0: aload 0
      // 4d1: aload 1
      // 4d2: aload 3
      // 4d3: bipush 4
      // 4d4: bipush 1
      // 4d5: bipush 9
      // 4d7: bipush 4
      // 4d8: bipush 1
      // 4d9: bipush 9
      // 4db: bipush 0
      // 4dc: aload 2
      // 4dd: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 4e0: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 4e3: aload 0
      // 4e4: aload 1
      // 4e5: aload 3
      // 4e6: bipush 7
      // 4e8: bipush 1
      // 4e9: bipush 9
      // 4eb: bipush 7
      // 4ed: bipush 1
      // 4ee: bipush 9
      // 4f0: bipush 0
      // 4f1: aload 2
      // 4f2: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 4f5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 4f8: aload 0
      // 4f9: aload 1
      // 4fa: aload 3
      // 4fb: bipush 4
      // 4fc: bipush 1
      // 4fd: bipush 10
      // 4ff: bipush 7
      // 501: bipush 2
      // 502: bipush 10
      // 504: bipush 0
      // 505: aload 2
      // 506: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 509: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 50c: aload 0
      // 50d: aload 1
      // 50e: aload 3
      // 50f: bipush 5
      // 510: bipush 4
      // 511: bipush 5
      // 512: bipush 6
      // 514: bipush 4
      // 515: bipush 5
      // 516: bipush 0
      // 517: aload 2
      // 518: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 51b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 51e: aload 0
      // 51f: aload 1
      // 520: getstatic ox_.l3f Le0x;
      // 523: iload 7
      // 525: invokevirtual e0x.kig (I)Lzfz;
      // 528: bipush 4
      // 529: bipush 4
      // 52a: bipush 5
      // 52b: aload 3
      // 52c: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 52f: aload 0
      // 530: aload 1
      // 531: getstatic ox_.l3f Le0x;
      // 534: iload 8
      // 536: invokevirtual e0x.kig (I)Lzfz;
      // 539: bipush 7
      // 53b: bipush 4
      // 53c: bipush 5
      // 53d: aload 3
      // 53e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 541: bipush 0
      // 542: istore 9
      // 544: iload 9
      // 546: bipush 4
      // 547: if_icmpge 5aa
      // 54a: aload 0
      // 54b: aload 1
      // 54c: getstatic ox_.l3f Le0x;
      // 54f: iload 6
      // 551: invokevirtual e0x.kig (I)Lzfz;
      // 554: bipush 5
      // 555: bipush 0
      // 556: iload 9
      // 558: isub
      // 559: bipush 6
      // 55b: iload 9
      // 55d: iadd
      // 55e: aload 3
      // 55f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 562: aload 0
      // 563: aload 1
      // 564: getstatic ox_.l3f Le0x;
      // 567: iload 6
      // 569: invokevirtual e0x.kig (I)Lzfz;
      // 56c: bipush 6
      // 56e: bipush 0
      // 56f: iload 9
      // 571: isub
      // 572: bipush 6
      // 574: iload 9
      // 576: iadd
      // 577: aload 3
      // 578: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 57b: aload 0
      // 57c: aload 1
      // 57d: aload 3
      // 57e: bipush 5
      // 57f: bipush 0
      // 580: iload 9
      // 582: isub
      // 583: bipush 7
      // 585: iload 9
      // 587: iadd
      // 588: bipush 6
      // 58a: bipush 0
      // 58b: iload 9
      // 58d: isub
      // 58e: bipush 9
      // 590: iload 9
      // 592: iadd
      // 593: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 596: iinc 9 1
      // 599: aload 4
      // 59b: ifnull 5d6
      // 59e: aload 4
      // 5a0: ifnonnull 544
      // 5a3: goto 5aa
      // 5a6: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 5a9: athrow
      // 5aa: aload 0
      // 5ab: aload 1
      // 5ac: aload 3
      // 5ad: bipush 1
      // 5ae: bipush -3
      // 5b0: bipush 12
      // 5b2: bipush 10
      // 5b4: bipush -1
      // 5b5: bipush 13
      // 5b7: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 5ba: aload 0
      // 5bb: aload 1
      // 5bc: aload 3
      // 5bd: bipush 1
      // 5be: bipush -3
      // 5c0: bipush 1
      // 5c1: bipush 3
      // 5c2: bipush -1
      // 5c3: bipush 13
      // 5c5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 5c8: aload 0
      // 5c9: aload 1
      // 5ca: aload 3
      // 5cb: bipush 1
      // 5cc: bipush -3
      // 5ce: bipush 1
      // 5cf: bipush 9
      // 5d1: bipush -1
      // 5d2: bipush 5
      // 5d3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // 5d6: bipush 1
      // 5d7: istore 9
      // 5d9: iload 9
      // 5db: bipush 13
      // 5dd: if_icmpgt 609
      // 5e0: aload 0
      // 5e1: aload 1
      // 5e2: aload 3
      // 5e3: bipush 1
      // 5e4: bipush -3
      // 5e6: iload 9
      // 5e8: bipush 1
      // 5e9: bipush -2
      // 5eb: iload 9
      // 5ed: bipush 0
      // 5ee: aload 2
      // 5ef: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 5f2: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 5f5: iinc 9 2
      // 5f8: aload 4
      // 5fa: ifnull 60c
      // 5fd: aload 4
      // 5ff: ifnonnull 5d9
      // 602: goto 609
      // 605: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 608: athrow
      // 609: bipush 2
      // 60a: istore 9
      // 60c: iload 9
      // 60e: bipush 12
      // 610: if_icmpgt 641
      // 613: aload 0
      // 614: aload 1
      // 615: aload 3
      // 616: bipush 1
      // 617: bipush -1
      // 618: iload 9
      // 61a: bipush 3
      // 61b: bipush -1
      // 61c: iload 9
      // 61e: bipush 0
      // 61f: aload 2
      // 620: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 623: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 626: iinc 9 2
      // 629: aload 4
      // 62b: ifnull 7b1
      // 62e: goto 635
      // 631: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 634: athrow
      // 635: aload 4
      // 637: ifnonnull 60c
      // 63a: goto 641
      // 63d: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 640: athrow
      // 641: aload 0
      // 642: aload 1
      // 643: aload 3
      // 644: bipush 2
      // 645: bipush -2
      // 647: bipush 1
      // 648: bipush 5
      // 649: bipush -2
      // 64b: bipush 1
      // 64c: bipush 0
      // 64d: aload 2
      // 64e: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 651: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 654: aload 0
      // 655: aload 1
      // 656: aload 3
      // 657: bipush 7
      // 659: bipush -2
      // 65b: bipush 1
      // 65c: bipush 9
      // 65e: bipush -2
      // 660: bipush 1
      // 661: bipush 0
      // 662: aload 2
      // 663: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 666: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 669: aload 0
      // 66a: aload 1
      // 66b: aload 3
      // 66c: bipush 6
      // 66e: bipush -3
      // 670: bipush 1
      // 671: bipush 6
      // 673: bipush -3
      // 675: bipush 1
      // 676: bipush 0
      // 677: aload 2
      // 678: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 67b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 67e: aload 0
      // 67f: aload 1
      // 680: aload 3
      // 681: bipush 6
      // 683: bipush -1
      // 684: bipush 1
      // 685: bipush 6
      // 687: bipush -1
      // 688: bipush 1
      // 689: bipush 0
      // 68a: aload 2
      // 68b: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // 68e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 691: aload 0
      // 692: aload 1
      // 693: getstatic ox_.r11 Ll2c;
      // 696: aload 0
      // 697: getstatic ox_.r11 Ll2c;
      // 69a: getstatic vt2.zk4 Lvt2;
      // 69d: invokevirtual vt2.tmy ()I
      // 6a0: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // 6a3: invokevirtual l2c.kig (I)Lzfz;
      // 6a6: getstatic l2c.k82 Lh76;
      // 6a9: bipush 1
      // 6aa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6ad: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6b2: bipush 1
      // 6b3: bipush -3
      // 6b5: bipush 8
      // 6b7: aload 3
      // 6b8: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 6bb: aload 0
      // 6bc: aload 1
      // 6bd: getstatic ox_.r11 Ll2c;
      // 6c0: aload 0
      // 6c1: getstatic ox_.r11 Ll2c;
      // 6c4: getstatic vt2.te4 Lvt2;
      // 6c7: invokevirtual vt2.tmy ()I
      // 6ca: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // 6cd: invokevirtual l2c.kig (I)Lzfz;
      // 6d0: getstatic l2c.k82 Lh76;
      // 6d3: bipush 1
      // 6d4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6d7: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6dc: bipush 4
      // 6dd: bipush -3
      // 6df: bipush 8
      // 6e1: aload 3
      // 6e2: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 6e5: aload 0
      // 6e6: aload 1
      // 6e7: getstatic ox_.s7a Le0x;
      // 6ea: invokevirtual e0x.l4i ()Lzfz;
      // 6ed: getstatic evg.h98 Lh76;
      // 6f0: bipush 1
      // 6f1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6f4: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6f9: bipush 2
      // 6fa: bipush -3
      // 6fc: bipush 8
      // 6fe: aload 3
      // 6ff: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 702: aload 0
      // 703: aload 1
      // 704: getstatic ox_.s7a Le0x;
      // 707: invokevirtual e0x.l4i ()Lzfz;
      // 70a: getstatic evg.h98 Lh76;
      // 70d: bipush 1
      // 70e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 711: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 716: bipush 3
      // 717: bipush -3
      // 719: bipush 8
      // 71b: aload 3
      // 71c: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 71f: aload 0
      // 720: aload 1
      // 721: getstatic ox_.s0f Lfcu;
      // 724: invokevirtual fcu.l4i ()Lzfz;
      // 727: bipush 5
      // 728: bipush -3
      // 72a: bipush 7
      // 72c: aload 3
      // 72d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 730: aload 0
      // 731: aload 1
      // 732: getstatic ox_.s0f Lfcu;
      // 735: invokevirtual fcu.l4i ()Lzfz;
      // 738: bipush 5
      // 739: bipush -3
      // 73b: bipush 6
      // 73d: aload 3
      // 73e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 741: aload 0
      // 742: aload 1
      // 743: getstatic ox_.s0f Lfcu;
      // 746: invokevirtual fcu.l4i ()Lzfz;
      // 749: bipush 5
      // 74a: bipush -3
      // 74c: bipush 5
      // 74d: aload 3
      // 74e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 751: aload 0
      // 752: aload 1
      // 753: getstatic ox_.s0f Lfcu;
      // 756: invokevirtual fcu.l4i ()Lzfz;
      // 759: bipush 5
      // 75a: bipush -3
      // 75c: bipush 4
      // 75d: aload 3
      // 75e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 761: aload 0
      // 762: aload 1
      // 763: getstatic ox_.s0f Lfcu;
      // 766: invokevirtual fcu.l4i ()Lzfz;
      // 769: bipush 5
      // 76a: bipush -3
      // 76c: bipush 3
      // 76d: aload 3
      // 76e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 771: aload 0
      // 772: aload 1
      // 773: getstatic ox_.s0f Lfcu;
      // 776: invokevirtual fcu.l4i ()Lzfz;
      // 779: bipush 5
      // 77a: bipush -3
      // 77c: bipush 2
      // 77d: aload 3
      // 77e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 781: aload 0
      // 782: aload 1
      // 783: getstatic ox_.s0f Lfcu;
      // 786: invokevirtual fcu.l4i ()Lzfz;
      // 789: bipush 5
      // 78a: bipush -3
      // 78c: bipush 1
      // 78d: aload 3
      // 78e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 791: aload 0
      // 792: aload 1
      // 793: getstatic ox_.s0f Lfcu;
      // 796: invokevirtual fcu.l4i ()Lzfz;
      // 799: bipush 4
      // 79a: bipush -3
      // 79c: bipush 1
      // 79d: aload 3
      // 79e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 7a1: aload 0
      // 7a2: aload 1
      // 7a3: getstatic ox_.jwk Le0x;
      // 7a6: invokevirtual e0x.l4i ()Lzfz;
      // 7a9: bipush 3
      // 7aa: bipush -3
      // 7ac: bipush 1
      // 7ad: aload 3
      // 7ae: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 7b1: aload 0
      // 7b2: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a9v Z
      // 7b5: aload 4
      // 7b7: ifnull 8fc
      // 7ba: ifne 7e4
      // 7bd: goto 7c4
      // 7c0: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 7c3: athrow
      // 7c4: aload 0
      // 7c5: aload 0
      // 7c6: aload 1
      // 7c7: aload 3
      // 7c8: aload 2
      // 7c9: bipush 3
      // 7ca: bipush -2
      // 7cc: bipush 1
      // 7cd: getstatic vt2.z9q Lvt2;
      // 7d0: invokevirtual vt2.c3s ()I
      // 7d3: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid._b0 Ljava/util/List;
      // 7d6: bipush 2
      // 7d7: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xzy (Lt9d;Lyve;Ljava/util/Random;IIIILjava/util/List;I)Z
      // 7da: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a9v Z
      // 7dd: goto 7e4
      // 7e0: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 7e3: athrow
      // 7e4: aload 0
      // 7e5: aload 1
      // 7e6: getstatic ox_.s25 Le0x;
      // 7e9: bipush 15
      // 7eb: invokevirtual e0x.kig (I)Lzfz;
      // 7ee: bipush 3
      // 7ef: bipush -2
      // 7f1: bipush 2
      // 7f2: aload 3
      // 7f3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 7f6: aload 0
      // 7f7: aload 1
      // 7f8: getstatic ox_.r11 Ll2c;
      // 7fb: aload 0
      // 7fc: getstatic ox_.r11 Ll2c;
      // 7ff: getstatic vt2.z9q Lvt2;
      // 802: invokevirtual vt2.tmy ()I
      // 805: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // 808: invokevirtual l2c.kig (I)Lzfz;
      // 80b: getstatic l2c.k82 Lh76;
      // 80e: bipush 1
      // 80f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 812: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 817: bipush 7
      // 819: bipush -3
      // 81b: bipush 1
      // 81c: aload 3
      // 81d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 820: aload 0
      // 821: aload 1
      // 822: getstatic ox_.r11 Ll2c;
      // 825: aload 0
      // 826: getstatic ox_.r11 Ll2c;
      // 829: getstatic vt2.mxp Lvt2;
      // 82c: invokevirtual vt2.tmy ()I
      // 82f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // 832: invokevirtual l2c.kig (I)Lzfz;
      // 835: getstatic l2c.k82 Lh76;
      // 838: bipush 1
      // 839: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 83c: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 841: bipush 7
      // 843: bipush -3
      // 845: bipush 5
      // 846: aload 3
      // 847: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 84a: aload 0
      // 84b: aload 1
      // 84c: getstatic ox_.s7a Le0x;
      // 84f: invokevirtual e0x.l4i ()Lzfz;
      // 852: getstatic evg.h98 Lh76;
      // 855: bipush 1
      // 856: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 859: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 85e: bipush 7
      // 860: bipush -3
      // 862: bipush 2
      // 863: aload 3
      // 864: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 867: aload 0
      // 868: aload 1
      // 869: getstatic ox_.s7a Le0x;
      // 86c: invokevirtual e0x.l4i ()Lzfz;
      // 86f: getstatic evg.h98 Lh76;
      // 872: bipush 1
      // 873: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 876: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 87b: bipush 7
      // 87d: bipush -3
      // 87f: bipush 3
      // 880: aload 3
      // 881: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 884: aload 0
      // 885: aload 1
      // 886: getstatic ox_.s7a Le0x;
      // 889: invokevirtual e0x.l4i ()Lzfz;
      // 88c: getstatic evg.h98 Lh76;
      // 88f: bipush 1
      // 890: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 893: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 898: bipush 7
      // 89a: bipush -3
      // 89c: bipush 4
      // 89d: aload 3
      // 89e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 8a1: aload 0
      // 8a2: aload 1
      // 8a3: getstatic ox_.s0f Lfcu;
      // 8a6: invokevirtual fcu.l4i ()Lzfz;
      // 8a9: bipush 8
      // 8ab: bipush -3
      // 8ad: bipush 6
      // 8af: aload 3
      // 8b0: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 8b3: aload 0
      // 8b4: aload 1
      // 8b5: getstatic ox_.s0f Lfcu;
      // 8b8: invokevirtual fcu.l4i ()Lzfz;
      // 8bb: bipush 9
      // 8bd: bipush -3
      // 8bf: bipush 6
      // 8c1: aload 3
      // 8c2: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 8c5: aload 0
      // 8c6: aload 1
      // 8c7: getstatic ox_.s0f Lfcu;
      // 8ca: invokevirtual fcu.l4i ()Lzfz;
      // 8cd: bipush 9
      // 8cf: bipush -3
      // 8d1: bipush 5
      // 8d2: aload 3
      // 8d3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 8d6: aload 0
      // 8d7: aload 1
      // 8d8: getstatic ox_.jwk Le0x;
      // 8db: invokevirtual e0x.l4i ()Lzfz;
      // 8de: bipush 9
      // 8e0: bipush -3
      // 8e2: bipush 4
      // 8e3: aload 3
      // 8e4: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 8e7: aload 0
      // 8e8: aload 1
      // 8e9: getstatic ox_.s0f Lfcu;
      // 8ec: invokevirtual fcu.l4i ()Lzfz;
      // 8ef: bipush 9
      // 8f1: bipush -2
      // 8f3: bipush 4
      // 8f4: aload 3
      // 8f5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 8f8: aload 0
      // 8f9: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ifk Z
      // 8fc: aload 4
      // 8fe: ifnull 955
      // 901: ifne 92c
      // 904: goto 90b
      // 907: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 90a: athrow
      // 90b: aload 0
      // 90c: aload 0
      // 90d: aload 1
      // 90e: aload 3
      // 90f: aload 2
      // 910: bipush 9
      // 912: bipush -2
      // 914: bipush 3
      // 915: getstatic vt2.te4 Lvt2;
      // 918: invokevirtual vt2.c3s ()I
      // 91b: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid._b0 Ljava/util/List;
      // 91e: bipush 2
      // 91f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xzy (Lt9d;Lyve;Ljava/util/Random;IIIILjava/util/List;I)Z
      // 922: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ifk Z
      // 925: goto 92c
      // 928: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 92b: athrow
      // 92c: aload 0
      // 92d: aload 1
      // 92e: getstatic ox_.s25 Le0x;
      // 931: bipush 15
      // 933: invokevirtual e0x.kig (I)Lzfz;
      // 936: bipush 8
      // 938: bipush -1
      // 939: bipush 3
      // 93a: aload 3
      // 93b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 93e: aload 0
      // 93f: aload 1
      // 940: getstatic ox_.s25 Le0x;
      // 943: bipush 15
      // 945: invokevirtual e0x.kig (I)Lzfz;
      // 948: bipush 8
      // 94a: bipush -2
      // 94c: bipush 3
      // 94d: aload 3
      // 94e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 951: aload 0
      // 952: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid._jy Z
      // 955: aload 4
      // 957: ifnull be9
      // 95a: ifne 996
      // 95d: goto 964
      // 960: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 963: athrow
      // 964: aload 0
      // 965: aload 0
      // 966: aload 1
      // 967: aload 3
      // 968: aload 2
      // 969: bipush 8
      // 96b: bipush -3
      // 96d: bipush 3
      // 96e: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.jsk Ljava/util/List;
      // 971: bipush 1
      // 972: anewarray 192
      // 975: dup
      // 976: bipush 0
      // 977: getstatic xbr.frz Lnmo;
      // 97a: aload 2
      // 97b: invokevirtual nmo.z0_ (Ljava/util/Random;)Lypi;
      // 97e: aastore
      // 97f: invokestatic ypi.voc (Ljava/util/List;[Lypi;)Ljava/util/List;
      // 982: bipush 2
      // 983: aload 2
      // 984: bipush 5
      // 985: invokevirtual java/util/Random.nextInt (I)I
      // 988: iadd
      // 989: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // 98c: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid._jy Z
      // 98f: goto 996
      // 992: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // 995: athrow
      // 996: aload 0
      // 997: aload 1
      // 998: getstatic ox_.jwk Le0x;
      // 99b: invokevirtual e0x.l4i ()Lzfz;
      // 99e: bipush 9
      // 9a0: bipush -3
      // 9a2: bipush 2
      // 9a3: aload 3
      // 9a4: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 9a7: aload 0
      // 9a8: aload 1
      // 9a9: getstatic ox_.jwk Le0x;
      // 9ac: invokevirtual e0x.l4i ()Lzfz;
      // 9af: bipush 8
      // 9b1: bipush -3
      // 9b3: bipush 1
      // 9b4: aload 3
      // 9b5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 9b8: aload 0
      // 9b9: aload 1
      // 9ba: getstatic ox_.jwk Le0x;
      // 9bd: invokevirtual e0x.l4i ()Lzfz;
      // 9c0: bipush 4
      // 9c1: bipush -3
      // 9c3: bipush 5
      // 9c4: aload 3
      // 9c5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 9c8: aload 0
      // 9c9: aload 1
      // 9ca: getstatic ox_.jwk Le0x;
      // 9cd: invokevirtual e0x.l4i ()Lzfz;
      // 9d0: bipush 5
      // 9d1: bipush -2
      // 9d3: bipush 5
      // 9d4: aload 3
      // 9d5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 9d8: aload 0
      // 9d9: aload 1
      // 9da: getstatic ox_.jwk Le0x;
      // 9dd: invokevirtual e0x.l4i ()Lzfz;
      // 9e0: bipush 5
      // 9e1: bipush -1
      // 9e2: bipush 5
      // 9e3: aload 3
      // 9e4: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 9e7: aload 0
      // 9e8: aload 1
      // 9e9: getstatic ox_.jwk Le0x;
      // 9ec: invokevirtual e0x.l4i ()Lzfz;
      // 9ef: bipush 6
      // 9f1: bipush -3
      // 9f3: bipush 5
      // 9f4: aload 3
      // 9f5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 9f8: aload 0
      // 9f9: aload 1
      // 9fa: getstatic ox_.jwk Le0x;
      // 9fd: invokevirtual e0x.l4i ()Lzfz;
      // a00: bipush 7
      // a02: bipush -2
      // a04: bipush 5
      // a05: aload 3
      // a06: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // a09: aload 0
      // a0a: aload 1
      // a0b: getstatic ox_.jwk Le0x;
      // a0e: invokevirtual e0x.l4i ()Lzfz;
      // a11: bipush 7
      // a13: bipush -1
      // a14: bipush 5
      // a15: aload 3
      // a16: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // a19: aload 0
      // a1a: aload 1
      // a1b: getstatic ox_.jwk Le0x;
      // a1e: invokevirtual e0x.l4i ()Lzfz;
      // a21: bipush 8
      // a23: bipush -3
      // a25: bipush 5
      // a26: aload 3
      // a27: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // a2a: aload 0
      // a2b: aload 1
      // a2c: aload 3
      // a2d: bipush 9
      // a2f: bipush -1
      // a30: bipush 1
      // a31: bipush 9
      // a33: bipush -1
      // a34: bipush 5
      // a35: bipush 0
      // a36: aload 2
      // a37: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // a3a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // a3d: aload 0
      // a3e: aload 1
      // a3f: aload 3
      // a40: bipush 8
      // a42: bipush -3
      // a44: bipush 8
      // a46: bipush 10
      // a48: bipush -1
      // a49: bipush 10
      // a4b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.t_a (Lt9d;Lyve;IIIIII)V
      // a4e: aload 0
      // a4f: aload 1
      // a50: getstatic ox_.ow_ Le0x;
      // a53: getstatic kuo.s3w I
      // a56: invokevirtual e0x.kig (I)Lzfz;
      // a59: bipush 8
      // a5b: bipush -2
      // a5d: bipush 11
      // a5f: aload 3
      // a60: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // a63: aload 0
      // a64: aload 1
      // dispatchTo: getstatic ox_.ow_ Le0x;
      // a68: getstatic kuo.s3w I
      // a6b: invokevirtual e0x.kig (I)Lzfz;
      // a6e: bipush 9
      // a70: bipush -2
      // a72: bipush 11
      // a74: aload 3
      // a75: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // a78: aload 0
      // a79: aload 1
      // a7a: getstatic ox_.ow_ Le0x;
      // a7d: getstatic kuo.s3w I
      // a80: invokevirtual e0x.kig (I)Lzfz;
      // a83: bipush 10
      // a85: bipush -2
      // a87: bipush 11
      // a89: aload 3
      // a8a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // a8d: aload 0
      // a8e: aload 1
      // a8f: getstatic ox_.lqx Le0x;
      // a92: aload 0
      // a93: getstatic ox_.lqx Le0x;
      // a96: getstatic vt2.z9q Lvt2;
      // a99: invokevirtual vt2.c3s ()I
      // a9c: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // a9f: invokestatic vt2.jw6 (I)Lvt2;
      // aa2: invokestatic _0t.o2_ (Lvt2;)I
      // aa5: invokevirtual e0x.kig (I)Lzfz;
      // aa8: bipush 8
      // aaa: bipush -2
      // aac: bipush 12
      // aae: aload 3
      // aaf: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // ab2: aload 0
      // ab3: aload 1
      // ab4: getstatic ox_.lqx Le0x;
      // ab7: aload 0
      // ab8: getstatic ox_.lqx Le0x;
      // abb: getstatic vt2.z9q Lvt2;
      // abe: invokevirtual vt2.c3s ()I
      // ac1: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // ac4: invokestatic vt2.jw6 (I)Lvt2;
      // ac7: invokestatic _0t.o2_ (Lvt2;)I
      // aca: invokevirtual e0x.kig (I)Lzfz;
      // acd: bipush 9
      // acf: bipush -2
      // ad1: bipush 12
      // ad3: aload 3
      // ad4: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // ad7: aload 0
      // ad8: aload 1
      // ad9: getstatic ox_.lqx Le0x;
      // adc: aload 0
      // add: getstatic ox_.lqx Le0x;
      // ae0: getstatic vt2.z9q Lvt2;
      // ae3: invokevirtual vt2.c3s ()I
      // ae6: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // ae9: invokestatic vt2.jw6 (I)Lvt2;
      // aec: invokestatic _0t.o2_ (Lvt2;)I
      // aef: invokevirtual e0x.kig (I)Lzfz;
      // af2: bipush 10
      // af4: bipush -2
      // af6: bipush 12
      // af8: aload 3
      // af9: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // afc: aload 0
      // afd: aload 1
      // afe: aload 3
      // aff: bipush 8
      // b01: bipush -3
      // b03: bipush 8
      // b05: bipush 8
      // b07: bipush -3
      // b09: bipush 10
      // b0b: bipush 0
      // b0c: aload 2
      // b0d: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // b10: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // b13: aload 0
      // b14: aload 1
      // b15: aload 3
      // b16: bipush 10
      // b18: bipush -3
      // b1a: bipush 8
      // b1c: bipush 10
      // b1e: bipush -3
      // b20: bipush 10
      // b22: bipush 0
      // b23: aload 2
      // b24: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.e5j Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$d3n;
      // b27: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // b2a: aload 0
      // b2b: aload 1
      // b2c: getstatic ox_.jwk Le0x;
      // b2f: invokevirtual e0x.l4i ()Lzfz;
      // b32: bipush 10
      // b34: bipush -2
      // b36: bipush 9
      // b38: aload 3
      // b39: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // b3c: aload 0
      // b3d: aload 1
      // b3e: getstatic ox_.s0f Lfcu;
      // b41: invokevirtual fcu.l4i ()Lzfz;
      // b44: bipush 8
      // b46: bipush -2
      // b48: bipush 9
      // b4a: aload 3
      // b4b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // b4e: aload 0
      // b4f: aload 1
      // b50: getstatic ox_.s0f Lfcu;
      // b53: invokevirtual fcu.l4i ()Lzfz;
      // b56: bipush 8
      // b58: bipush -2
      // b5a: bipush 10
      // b5c: aload 3
      // b5d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // b60: aload 0
      // b61: aload 1
      // b62: getstatic ox_.s0f Lfcu;
      // b65: invokevirtual fcu.l4i ()Lzfz;
      // b68: bipush 10
      // b6a: bipush -1
      // b6b: bipush 9
      // b6d: aload 3
      // b6e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // b71: aload 0
      // b72: aload 1
      // b73: getstatic ox_.wdk Laog;
      // b76: getstatic vt2.rf3 Lvt2;
      // b79: invokevirtual vt2.c3s ()I
      // b7c: invokevirtual aog.kig (I)Lzfz;
      // b7f: bipush 9
      // b81: bipush -2
      // b83: bipush 8
      // b85: aload 3
      // b86: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // b89: aload 0
      // b8a: aload 1
      // b8b: getstatic ox_.wdk Laog;
      // b8e: aload 0
      // b8f: getstatic ox_.wdk Laog;
      // b92: getstatic vt2.te4 Lvt2;
      // b95: invokevirtual vt2.c3s ()I
      // b98: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // b9b: invokevirtual aog.kig (I)Lzfz;
      // b9e: bipush 10
      // ba0: bipush -2
      // ba2: bipush 8
      // ba4: aload 3
      // ba5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // ba8: aload 0
      // ba9: aload 1
      // baa: getstatic ox_.wdk Laog;
      // bad: aload 0
      // bae: getstatic ox_.wdk Laog;
      // bb1: getstatic vt2.te4 Lvt2;
      // bb4: invokevirtual vt2.c3s ()I
      // bb7: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // bba: invokevirtual aog.kig (I)Lzfz;
      // bbd: bipush 10
      // bbf: bipush -1
      // bc0: bipush 8
      // bc2: aload 3
      // bc3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // bc6: aload 0
      // bc7: aload 1
      // bc8: getstatic ox_.r0f Lamu;
      // bcb: aload 0
      // bcc: getstatic ox_.r0f Lamu;
      // bcf: getstatic vt2.z9q Lvt2;
      // bd2: invokevirtual vt2.tmy ()I
      // bd5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.ujv (Le0x;I)I
      // bd8: invokevirtual amu.kig (I)Lzfz;
      // bdb: bipush 10
      // bdd: bipush -2
      // bdf: bipush 10
      // be1: aload 3
      // be2: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // be5: aload 0
      // be6: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xzf Z
      // be9: aload 4
      // beb: ifnull c2c
      // bee: ifne c2b
      // bf1: goto bf8
      // bf4: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // bf7: athrow
      // bf8: aload 0
      // bf9: aload 0
      // bfa: aload 1
      // bfb: aload 3
      // bfc: aload 2
      // bfd: bipush 9
      // bff: bipush -3
      // c01: bipush 10
      // c03: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.jsk Ljava/util/List;
      // c06: bipush 1
      // c07: anewarray 192
      // c0a: dup
      // c0b: bipush 0
      // c0c: getstatic xbr.frz Lnmo;
      // c0f: aload 2
      // c10: invokevirtual nmo.z0_ (Ljava/util/Random;)Lypi;
      // c13: aastore
      // c14: invokestatic ypi.voc (Ljava/util/List;[Lypi;)Ljava/util/List;
      // c17: bipush 2
      // c18: aload 2
      // c19: bipush 5
      // c1a: invokevirtual java/util/Random.nextInt (I)I
      // c1d: iadd
      // c1e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // c21: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.xzf Z
      // c24: goto c2b
      // c27: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid.a (Loov;)Loov;
      // c2a: athrow
      // c2b: bipush 1
      // c2c: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2218487761589292712L, -2516317520486283178L, MethodHandles.lookup().lookupClass()).a(134133062070689L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 116028782079591L;
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
      String var6 = "\u0002s9LÌ×BÔe\u0017¹7\u0010xSÔ\u0091\b\u0003§\u0006÷(2\u0013\u0000\u008b\u008aâÝgÉ\u0018\u0084ïð\u0085BÆ\u007fÏó,\u0015Ös8[ÈÕ\u0016\u009cº¤\u0015Å\\\u0018&ÂÅ\u0091¤Ô¯ºiôqíàÝâ\u008e`kdQ°ZÜ°0\u009f7¦I\fÁ4\u0002é)\u001cç´ô/ñZxõ\u0094ýg\u009dI\u0014ÑÂvØNMZ2OîfÛ?YÎBÚFÌ\u0086ÇV«(TOÄ£EnrsP@0 \u0098%çÁ2õp~â\u0098OÞ}E¶¯û{ï\u001at/\u0090 ÁG\u009f¨ hqáÀ\u0092\u0007º\u0005Çý¤m\u009fh\f\\ä¤¥gdY\u0098á\u0099=\u0093\b×æ£¢";
      int var8 = "\u0002s9LÌ×BÔe\u0017¹7\u0010xSÔ\u0091\b\u0003§\u0006÷(2\u0013\u0000\u008b\u008aâÝgÉ\u0018\u0084ïð\u0085BÆ\u007fÏó,\u0015Ös8[ÈÕ\u0016\u009cº¤\u0015Å\\\u0018&ÂÅ\u0091¤Ô¯ºiôqíàÝâ\u008e`kdQ°ZÜ°0\u009f7¦I\fÁ4\u0002é)\u001cç´ô/ñZxõ\u0094ýg\u009dI\u0014ÑÂvØNMZ2OîfÛ?YÎBÚFÌ\u0086ÇV«(TOÄ£EnrsP@0 \u0098%çÁ2õp~â\u0098OÞ}E¶¯û{ï\u001at/\u0090 ÁG\u009f¨ hqáÀ\u0092\u0007º\u0005Çý¤m\u009fh\f\\ä¤¥gdY\u0098á\u0099=\u0093\b×æ£¢"
         .length();
      char var5 = ' ';
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
                     j = var9;
                     k = new String[8];
                     jsk = Lists.newArrayList(
                        new ypi[]{
                           new ypi(xbr.exg, 0, 1, 3, 3),
                           new ypi(xbr.icz, 0, 1, 5, 10),
                           new ypi(xbr.jtr, 0, 2, 7, 15),
                           new ypi(xbr.cu7, 0, 1, 3, 2),
                           new ypi(xbr.pl_, 0, 4, 6, 20),
                           new ypi(xbr.ii5, 0, 3, 7, 16),
                           new ypi(xbr.fpq, 0, 1, 1, 3),
                           new ypi(xbr.mhm, 0, 1, 1, 1),
                           new ypi(xbr.fps, 0, 1, 1, 1),
                           new ypi(xbr.krl, 0, 1, 1, 1)
                        }
                     );
                     _b0 = Lists.newArrayList(new ypi[]{new ypi(xbr.tzx, 0, 2, 7, 30)});
                     e5j = new ComponentScatteredFeaturePieces$JunglePyramid$d3n(null);
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

                  var6 = "]\u0007â¨\r;ÇððJ×L\u00929\u0086\u000e¦\u0000ï\u0011B\tèØ\u0018ì~Eý\u001e\u0000¡^n-\u0082¶µÏ¨ÞÐú2Ñß1\t\u0016";
                  var8 = "]\u0007â¨\r;ÇððJ×L\u00929\u0086\u000e¦\u0000ï\u0011B\tèØ\u0018ì~Eý\u001e\u0000¡^n-\u0082¶µÏ¨ÞÐú2Ñß1\t\u0016".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6768;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid", var10);
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
         throw new RuntimeException(
            "net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid" + " : " + var1 + " : " + var2.toString(), var5
         );
      }
   }
}
