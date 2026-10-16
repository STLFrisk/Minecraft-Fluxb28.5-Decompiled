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

public class ComponentScatteredFeaturePieces$DesertPyramid extends ComponentScatteredFeaturePieces$Feature {
   private boolean[] pys = new boolean[4];
   private static final List c8n;
   private static final long a;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public ComponentScatteredFeaturePieces$DesertPyramid() {
   }

   public ComponentScatteredFeaturePieces$DesertPyramid(Random var1, int var2, int var3) {
      super(var1, var2, 64, var3, 21, 15, 21);
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 59647863846607L;
      super.z0d(var1);
      var1.zyu(c<"m">(1616, 4935428984185157614L ^ var2), this.pys[0]);
      var1.zyu(c<"m">(21050, 5319301740307850119L ^ var2), this.pys[1]);
      var1.zyu(c<"m">(9379, 69979287474984218L ^ var2), this.pys[2]);
      var1.zyu(c<"m">(23574, 7484638694049328556L ^ var2), this.pys[3]);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 79630640103332L;
      super.oqf(var1);
      this.pys[0] = var1.dvl(c<"m">(5479, 1952662593537093044L ^ var2));
      this.pys[1] = var1.dvl(c<"m">(15690, 5973504944522888606L ^ var2));
      this.pys[2] = var1.dvl(c<"m">(1158, 5090980665801030742L ^ var2));
      this.pys[3] = var1.dvl(c<"m">(27786, 6839924515725169757L ^ var2));
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
      // 0000: aload 0
      // 0001: aload 1
      // 0002: aload 3
      // 0003: bipush 0
      // 0004: bipush -4
      // 0006: bipush 0
      // 0007: aload 0
      // 0008: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 000b: bipush 1
      // 000c: isub
      // 000d: bipush 0
      // 000e: aload 0
      // 000f: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.kr0 I
      // 0012: bipush 1
      // 0013: isub
      // 0014: getstatic ox_.umb Le0x;
      // 0017: invokevirtual e0x.l4i ()Lzfz;
      // 001a: getstatic ox_.umb Le0x;
      // 001d: invokevirtual e0x.l4i ()Lzfz;
      // 0020: bipush 0
      // 0021: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0024: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 0027: bipush 1
      // 0028: istore 5
      // 002a: astore 4
      // 002c: iload 5
      // 002e: bipush 9
      // 0030: if_icmpgt 00ac
      // 0033: aload 0
      // 0034: aload 1
      // 0035: aload 3
      // 0036: iload 5
      // 0038: iload 5
      // 003a: iload 5
      // 003c: aload 0
      // 003d: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0040: bipush 1
      // 0041: isub
      // 0042: iload 5
      // 0044: isub
      // 0045: iload 5
      // 0047: aload 0
      // 0048: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.kr0 I
      // 004b: bipush 1
      // 004c: isub
      // 004d: iload 5
      // 004f: isub
      // 0050: getstatic ox_.umb Le0x;
      // 0053: invokevirtual e0x.l4i ()Lzfz;
      // 0056: getstatic ox_.umb Le0x;
      // 0059: invokevirtual e0x.l4i ()Lzfz;
      // 005c: bipush 0
      // 005d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0060: aload 0
      // 0061: aload 1
      // 0062: aload 3
      // 0063: iload 5
      // 0065: bipush 1
      // 0066: iadd
      // 0067: iload 5
      // 0069: iload 5
      // 006b: bipush 1
      // 006c: iadd
      // 006d: aload 0
      // 006e: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0071: bipush 2
      // 0072: isub
      // 0073: iload 5
      // 0075: isub
      // 0076: iload 5
      // 0078: aload 0
      // 0079: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.kr0 I
      // 007c: bipush 2
      // 007d: isub
      // 007e: iload 5
      // 0080: isub
      // 0081: getstatic ox_.ibw Le0x;
      // 0084: invokevirtual e0x.l4i ()Lzfz;
      // 0087: getstatic ox_.ibw Le0x;
      // 008a: invokevirtual e0x.l4i ()Lzfz;
      // 008d: bipush 0
      // 008e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0091: iinc 5 1
      // 0094: aload 4
      // 0096: ifnull 00af
      // 0099: aload 4
      // 009b: ifnonnull 002c
      // 009e: goto 00a5
      // 00a1: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.a (Loov;)Loov;
      // 00a4: athrow
      // 00a5: bipush 2
      // 00a6: anewarray 257
      // 00a9: invokestatic i2h.b ([Li2h;)V
      // 00ac: bipush 0
      // 00ad: istore 5
      // 00af: iload 5
      // 00b1: aload 0
      // 00b2: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 00b5: if_icmpge 0102
      // 00b8: bipush 0
      // 00b9: aload 4
      // 00bb: ifnull 0114
      // 00be: goto 00c5
      // 00c1: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.a (Loov;)Loov;
      // 00c4: athrow
      // 00c5: istore 6
      // 00c7: iload 6
      // 00c9: aload 0
      // 00ca: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.kr0 I
      // 00cd: if_icmpge 00fa
      // 00d0: bipush -5
      // 00d2: istore 7
      // 00d4: aload 0
      // 00d5: aload 1
      // 00d6: getstatic ox_.umb Le0x;
      // 00d9: invokevirtual e0x.l4i ()Lzfz;
      // 00dc: iload 5
      // 00de: iload 7
      // 00e0: iload 6
      // 00e2: aload 3
      // 00e3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.doc (Lt9d;Lzfz;IIILyve;)V
      // 00e6: iinc 6 1
      // 00e9: aload 4
      // 00eb: ifnull 00fd
      // 00ee: aload 4
      // 00f0: ifnonnull 00c7
      // 00f3: goto 00fa
      // 00f6: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.a (Loov;)Loov;
      // 00f9: athrow
      // 00fa: iinc 5 1
      // 00fd: aload 4
      // 00ff: ifnonnull 00af
      // 0102: aload 0
      // 0103: getstatic ox_.qci Le0x;
      // 0106: bipush 3
      // 0107: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.ujv (Le0x;I)I
      // 010a: istore 5
      // 010c: aload 0
      // 010d: getstatic ox_.qci Le0x;
      // 0110: bipush 2
      // 0111: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.ujv (Le0x;I)I
      // 0114: istore 6
      // 0116: aload 0
      // 0117: getstatic ox_.qci Le0x;
      // 011a: bipush 0
      // 011b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.ujv (Le0x;I)I
      // 011e: istore 7
      // 0120: aload 0
      // 0121: getstatic ox_.qci Le0x;
      // 0124: bipush 1
      // 0125: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.ujv (Le0x;I)I
      // 0128: istore 8
      // 012a: getstatic qvg.y0w Lqvg;
      // 012d: invokevirtual qvg.b9d ()I
      // 0130: bipush -1
      // 0131: ixor
      // 0132: bipush 15
      // 0134: iand
      // 0135: istore 9
      // 0137: getstatic qvg.o71 Lqvg;
      // 013a: invokevirtual qvg.b9d ()I
      // 013d: bipush -1
      // 013e: ixor
      // 013f: bipush 15
      // 0141: iand
      // 0142: istore 10
      // 0144: aload 0
      // 0145: aload 1
      // 0146: aload 3
      // 0147: bipush 0
      // 0148: bipush 0
      // 0149: bipush 0
      // 014a: bipush 4
      // 014b: bipush 9
      // 014d: bipush 4
      // 014e: getstatic ox_.umb Le0x;
      // 0151: invokevirtual e0x.l4i ()Lzfz;
      // 0154: getstatic ox_.ibw Le0x;
      // 0157: invokevirtual e0x.l4i ()Lzfz;
      // 015a: bipush 0
      // 015b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 015e: aload 0
      // 015f: aload 1
      // 0160: aload 3
      // 0161: bipush 1
      // 0162: bipush 10
      // 0164: bipush 1
      // 0165: bipush 3
      // 0166: bipush 10
      // 0168: bipush 3
      // 0169: getstatic ox_.umb Le0x;
      // 016c: invokevirtual e0x.l4i ()Lzfz;
      // 016f: getstatic ox_.umb Le0x;
      // 0172: invokevirtual e0x.l4i ()Lzfz;
      // 0175: bipush 0
      // 0176: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0179: aload 0
      // 017a: aload 1
      // 017b: getstatic ox_.qci Le0x;
      // 017e: iload 5
      // 0180: invokevirtual e0x.kig (I)Lzfz;
      // 0183: bipush 2
      // 0184: bipush 10
      // 0186: bipush 0
      // 0187: aload 3
      // 0188: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 018b: aload 0
      // 018c: aload 1
      // 018d: getstatic ox_.qci Le0x;
      // 0190: iload 6
      // 0192: invokevirtual e0x.kig (I)Lzfz;
      // 0195: bipush 2
      // 0196: bipush 10
      // 0198: bipush 4
      // 0199: aload 3
      // 019a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 019d: aload 0
      // 019e: aload 1
      // 019f: getstatic ox_.qci Le0x;
      // 01a2: iload 7
      // 01a4: invokevirtual e0x.kig (I)Lzfz;
      // 01a7: bipush 0
      // 01a8: bipush 10
      // 01aa: bipush 2
      // 01ab: aload 3
      // 01ac: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 01af: aload 0
      // 01b0: aload 1
      // 01b1: getstatic ox_.qci Le0x;
      // 01b4: iload 8
      // 01b6: invokevirtual e0x.kig (I)Lzfz;
      // 01b9: bipush 4
      // 01ba: bipush 10
      // 01bc: bipush 2
      // 01bd: aload 3
      // 01be: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 01c1: aload 0
      // 01c2: aload 1
      // 01c3: aload 3
      // 01c4: aload 0
      // 01c5: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 01c8: bipush 5
      // 01c9: isub
      // 01ca: bipush 0
      // 01cb: bipush 0
      // 01cc: aload 0
      // 01cd: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 01d0: bipush 1
      // 01d1: isub
      // 01d2: bipush 9
      // 01d4: bipush 4
      // 01d5: getstatic ox_.umb Le0x;
      // 01d8: invokevirtual e0x.l4i ()Lzfz;
      // 01db: getstatic ox_.ibw Le0x;
      // 01de: invokevirtual e0x.l4i ()Lzfz;
      // 01e1: bipush 0
      // 01e2: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 01e5: aload 0
      // 01e6: aload 1
      // 01e7: aload 3
      // 01e8: aload 0
      // 01e9: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 01ec: bipush 4
      // 01ed: isub
      // 01ee: bipush 10
      // 01f0: bipush 1
      // 01f1: aload 0
      // 01f2: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 01f5: bipush 2
      // 01f6: isub
      // 01f7: bipush 10
      // 01f9: bipush 3
      // 01fa: getstatic ox_.umb Le0x;
      // 01fd: invokevirtual e0x.l4i ()Lzfz;
      // 0200: getstatic ox_.umb Le0x;
      // 0203: invokevirtual e0x.l4i ()Lzfz;
      // 0206: bipush 0
      // 0207: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 020a: aload 0
      // 020b: aload 1
      // 020c: getstatic ox_.qci Le0x;
      // 020f: iload 5
      // 0211: invokevirtual e0x.kig (I)Lzfz;
      // 0214: aload 0
      // 0215: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0218: bipush 3
      // 0219: isub
      // 021a: bipush 10
      // 021c: bipush 0
      // 021d: aload 3
      // 021e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0221: aload 0
      // 0222: aload 1
      // 0223: getstatic ox_.qci Le0x;
      // 0226: iload 6
      // 0228: invokevirtual e0x.kig (I)Lzfz;
      // 022b: aload 0
      // 022c: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 022f: bipush 3
      // 0230: isub
      // 0231: bipush 10
      // 0233: bipush 4
      // 0234: aload 3
      // 0235: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0238: aload 0
      // 0239: aload 1
      // 023a: getstatic ox_.qci Le0x;
      // 023d: iload 7
      // 023f: invokevirtual e0x.kig (I)Lzfz;
      // 0242: aload 0
      // 0243: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0246: bipush 5
      // 0247: isub
      // 0248: bipush 10
      // 024a: bipush 2
      // 024b: aload 3
      // 024c: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 024f: aload 0
      // 0250: aload 1
      // 0251: getstatic ox_.qci Le0x;
      // 0254: iload 8
      // 0256: invokevirtual e0x.kig (I)Lzfz;
      // 0259: aload 0
      // 025a: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 025d: bipush 1
      // 025e: isub
      // 025f: bipush 10
      // 0261: bipush 2
      // 0262: aload 3
      // 0263: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0266: aload 0
      // 0267: aload 1
      // 0268: aload 3
      // 0269: bipush 8
      // 026b: bipush 0
      // 026c: bipush 0
      // 026d: bipush 12
      // 026f: bipush 4
      // 0270: bipush 4
      // 0271: getstatic ox_.umb Le0x;
      // 0274: invokevirtual e0x.l4i ()Lzfz;
      // 0277: getstatic ox_.ibw Le0x;
      // 027a: invokevirtual e0x.l4i ()Lzfz;
      // 027d: bipush 0
      // 027e: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0281: aload 0
      // 0282: aload 1
      // 0283: aload 3
      // 0284: bipush 9
      // 0286: bipush 1
      // 0287: bipush 0
      // 0288: bipush 11
      // 028a: bipush 3
      // 028b: bipush 4
      // 028c: getstatic ox_.ibw Le0x;
      // 028f: invokevirtual e0x.l4i ()Lzfz;
      // 0292: getstatic ox_.ibw Le0x;
      // 0295: invokevirtual e0x.l4i ()Lzfz;
      // 0298: bipush 0
      // 0299: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 029c: aload 0
      // 029d: aload 1
      // 029e: getstatic ox_.umb Le0x;
      // 02a1: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 02a4: invokevirtual cp8$vxz.a1g ()I
      // 02a7: invokevirtual e0x.kig (I)Lzfz;
      // 02aa: bipush 9
      // 02ac: bipush 1
      // 02ad: bipush 1
      // 02ae: aload 3
      // 02af: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 02b2: aload 0
      // 02b3: aload 1
      // 02b4: getstatic ox_.umb Le0x;
      // 02b7: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 02ba: invokevirtual cp8$vxz.a1g ()I
      // 02bd: invokevirtual e0x.kig (I)Lzfz;
      // 02c0: bipush 9
      // 02c2: bipush 2
      // 02c3: bipush 1
      // 02c4: aload 3
      // 02c5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 02c8: aload 0
      // 02c9: aload 1
      // 02ca: getstatic ox_.umb Le0x;
      // 02cd: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 02d0: invokevirtual cp8$vxz.a1g ()I
      // 02d3: invokevirtual e0x.kig (I)Lzfz;
      // 02d6: bipush 9
      // 02d8: bipush 3
      // 02d9: bipush 1
      // 02da: aload 3
      // 02db: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 02de: aload 0
      // 02df: aload 1
      // 02e0: getstatic ox_.umb Le0x;
      // 02e3: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 02e6: invokevirtual cp8$vxz.a1g ()I
      // 02e9: invokevirtual e0x.kig (I)Lzfz;
      // 02ec: bipush 10
      // 02ee: bipush 3
      // 02ef: bipush 1
      // 02f0: aload 3
      // 02f1: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 02f4: aload 0
      // 02f5: aload 1
      // 02f6: getstatic ox_.umb Le0x;
      // 02f9: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 02fc: invokevirtual cp8$vxz.a1g ()I
      // 02ff: invokevirtual e0x.kig (I)Lzfz;
      // 0302: bipush 11
      // 0304: bipush 3
      // 0305: bipush 1
      // 0306: aload 3
      // 0307: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 030a: aload 0
      // 030b: aload 1
      // 030c: getstatic ox_.umb Le0x;
      // 030f: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0312: invokevirtual cp8$vxz.a1g ()I
      // 0315: invokevirtual e0x.kig (I)Lzfz;
      // 0318: bipush 11
      // 031a: bipush 2
      // 031b: bipush 1
      // 031c: aload 3
      // 031d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0320: aload 0
      // 0321: aload 1
      // 0322: getstatic ox_.umb Le0x;
      // 0325: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0328: invokevirtual cp8$vxz.a1g ()I
      // 032b: invokevirtual e0x.kig (I)Lzfz;
      // 032e: bipush 11
      // 0330: bipush 1
      // 0331: bipush 1
      // 0332: aload 3
      // 0333: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0336: aload 0
      // 0337: aload 1
      // 0338: aload 3
      // 0339: bipush 4
      // 033a: bipush 1
      // 033b: bipush 1
      // 033c: bipush 8
      // 033e: bipush 3
      // 033f: bipush 3
      // 0340: getstatic ox_.umb Le0x;
      // 0343: invokevirtual e0x.l4i ()Lzfz;
      // 0346: getstatic ox_.ibw Le0x;
      // 0349: invokevirtual e0x.l4i ()Lzfz;
      // 034c: bipush 0
      // 034d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0350: aload 0
      // 0351: aload 1
      // 0352: aload 3
      // 0353: bipush 4
      // 0354: bipush 1
      // 0355: bipush 2
      // 0356: bipush 8
      // 0358: bipush 2
      // 0359: bipush 2
      // 035a: getstatic ox_.ibw Le0x;
      // 035d: invokevirtual e0x.l4i ()Lzfz;
      // 0360: getstatic ox_.ibw Le0x;
      // 0363: invokevirtual e0x.l4i ()Lzfz;
      // 0366: bipush 0
      // 0367: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 036a: aload 0
      // 036b: aload 1
      // 036c: aload 3
      // 036d: bipush 12
      // 036f: bipush 1
      // 0370: bipush 1
      // 0371: bipush 16
      // 0373: bipush 3
      // 0374: bipush 3
      // 0375: getstatic ox_.umb Le0x;
      // 0378: invokevirtual e0x.l4i ()Lzfz;
      // 037b: getstatic ox_.ibw Le0x;
      // 037e: invokevirtual e0x.l4i ()Lzfz;
      // 0381: bipush 0
      // 0382: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0385: aload 0
      // 0386: aload 1
      // 0387: aload 3
      // 0388: bipush 12
      // 038a: bipush 1
      // 038b: bipush 2
      // 038c: bipush 16
      // 038e: bipush 2
      // 038f: bipush 2
      // 0390: getstatic ox_.ibw Le0x;
      // 0393: invokevirtual e0x.l4i ()Lzfz;
      // 0396: getstatic ox_.ibw Le0x;
      // 0399: invokevirtual e0x.l4i ()Lzfz;
      // 039c: bipush 0
      // 039d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 03a0: aload 0
      // 03a1: aload 1
      // 03a2: aload 3
      // 03a3: bipush 5
      // 03a4: bipush 4
      // 03a5: bipush 5
      // 03a6: aload 0
      // 03a7: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 03aa: bipush 6
      // 03ac: isub
      // 03ad: bipush 4
      // 03ae: aload 0
      // 03af: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.kr0 I
      // 03b2: bipush 6
      // 03b4: isub
      // 03b5: getstatic ox_.umb Le0x;
      // 03b8: invokevirtual e0x.l4i ()Lzfz;
      // 03bb: getstatic ox_.umb Le0x;
      // 03be: invokevirtual e0x.l4i ()Lzfz;
      // 03c1: bipush 0
      // 03c2: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 03c5: aload 0
      // 03c6: aload 1
      // 03c7: aload 3
      // 03c8: bipush 9
      // 03ca: bipush 4
      // 03cb: bipush 9
      // 03cd: bipush 11
      // 03cf: bipush 4
      // 03d0: bipush 11
      // 03d2: getstatic ox_.ibw Le0x;
      // 03d5: invokevirtual e0x.l4i ()Lzfz;
      // 03d8: getstatic ox_.ibw Le0x;
      // 03db: invokevirtual e0x.l4i ()Lzfz;
      // 03de: bipush 0
      // 03df: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 03e2: aload 0
      // 03e3: aload 1
      // 03e4: aload 3
      // 03e5: bipush 8
      // 03e7: bipush 1
      // 03e8: bipush 8
      // 03ea: bipush 8
      // 03ec: bipush 3
      // 03ed: bipush 8
      // 03ef: getstatic ox_.umb Le0x;
      // 03f2: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 03f5: invokevirtual cp8$vxz.a1g ()I
      // 03f8: invokevirtual e0x.kig (I)Lzfz;
      // 03fb: getstatic ox_.umb Le0x;
      // 03fe: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0401: invokevirtual cp8$vxz.a1g ()I
      // 0404: invokevirtual e0x.kig (I)Lzfz;
      // 0407: bipush 0
      // 0408: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 040b: aload 0
      // 040c: aload 1
      // 040d: aload 3
      // 040e: bipush 12
      // 0410: bipush 1
      // 0411: bipush 8
      // 0413: bipush 12
      // 0415: bipush 3
      // 0416: bipush 8
      // 0418: getstatic ox_.umb Le0x;
      // 041b: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 041e: invokevirtual cp8$vxz.a1g ()I
      // 0421: invokevirtual e0x.kig (I)Lzfz;
      // 0424: getstatic ox_.umb Le0x;
      // 0427: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 042a: invokevirtual cp8$vxz.a1g ()I
      // 042d: invokevirtual e0x.kig (I)Lzfz;
      // 0430: bipush 0
      // 0431: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0434: aload 0
      // 0435: aload 1
      // 0436: aload 3
      // 0437: bipush 8
      // 0439: bipush 1
      // 043a: bipush 12
      // 043c: bipush 8
      // 043e: bipush 3
      // 043f: bipush 12
      // 0441: getstatic ox_.umb Le0x;
      // 0444: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0447: invokevirtual cp8$vxz.a1g ()I
      // 044a: invokevirtual e0x.kig (I)Lzfz;
      // 044d: getstatic ox_.umb Le0x;
      // 0450: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0453: invokevirtual cp8$vxz.a1g ()I
      // 0456: invokevirtual e0x.kig (I)Lzfz;
      // 0459: bipush 0
      // 045a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 045d: aload 0
      // 045e: aload 1
      // 045f: aload 3
      // 0460: bipush 12
      // 0462: bipush 1
      // 0463: bipush 12
      // 0465: bipush 12
      // 0467: bipush 3
      // 0468: bipush 12
      // 046a: getstatic ox_.umb Le0x;
      // 046d: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0470: invokevirtual cp8$vxz.a1g ()I
      // 0473: invokevirtual e0x.kig (I)Lzfz;
      // 0476: getstatic ox_.umb Le0x;
      // 0479: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 047c: invokevirtual cp8$vxz.a1g ()I
      // 047f: invokevirtual e0x.kig (I)Lzfz;
      // 0482: bipush 0
      // 0483: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0486: aload 0
      // 0487: aload 1
      // 0488: aload 3
      // 0489: bipush 1
      // 048a: bipush 1
      // 048b: bipush 5
      // 048c: bipush 4
      // 048d: bipush 4
      // 048e: bipush 11
      // 0490: getstatic ox_.umb Le0x;
      // 0493: invokevirtual e0x.l4i ()Lzfz;
      // 0496: getstatic ox_.umb Le0x;
      // 0499: invokevirtual e0x.l4i ()Lzfz;
      // 049c: bipush 0
      // 049d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 04a0: aload 0
      // 04a1: aload 1
      // 04a2: aload 3
      // 04a3: aload 0
      // 04a4: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 04a7: bipush 5
      // 04a8: isub
      // 04a9: bipush 1
      // 04aa: bipush 5
      // 04ab: aload 0
      // 04ac: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 04af: bipush 2
      // 04b0: isub
      // 04b1: bipush 4
      // 04b2: bipush 11
      // 04b4: getstatic ox_.umb Le0x;
      // 04b7: invokevirtual e0x.l4i ()Lzfz;
      // 04ba: getstatic ox_.umb Le0x;
      // 04bd: invokevirtual e0x.l4i ()Lzfz;
      // 04c0: bipush 0
      // 04c1: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 04c4: aload 0
      // 04c5: aload 1
      // 04c6: aload 3
      // 04c7: bipush 6
      // 04c9: bipush 7
      // 04cb: bipush 9
      // 04cd: bipush 6
      // 04cf: bipush 7
      // 04d1: bipush 11
      // 04d3: getstatic ox_.umb Le0x;
      // 04d6: invokevirtual e0x.l4i ()Lzfz;
      // 04d9: getstatic ox_.umb Le0x;
      // 04dc: invokevirtual e0x.l4i ()Lzfz;
      // 04df: bipush 0
      // 04e0: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 04e3: aload 0
      // 04e4: aload 1
      // 04e5: aload 3
      // 04e6: aload 0
      // 04e7: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 04ea: bipush 7
      // 04ec: isub
      // 04ed: bipush 7
      // 04ef: bipush 9
      // 04f1: aload 0
      // 04f2: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 04f5: bipush 7
      // 04f7: isub
      // 04f8: bipush 7
      // 04fa: bipush 11
      // 04fc: getstatic ox_.umb Le0x;
      // 04ff: invokevirtual e0x.l4i ()Lzfz;
      // 0502: getstatic ox_.umb Le0x;
      // 0505: invokevirtual e0x.l4i ()Lzfz;
      // 0508: bipush 0
      // 0509: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 050c: aload 0
      // 050d: aload 1
      // 050e: aload 3
      // 050f: bipush 5
      // 0510: bipush 5
      // 0511: bipush 9
      // 0513: bipush 5
      // 0514: bipush 7
      // 0516: bipush 11
      // 0518: getstatic ox_.umb Le0x;
      // 051b: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 051e: invokevirtual cp8$vxz.a1g ()I
      // 0521: invokevirtual e0x.kig (I)Lzfz;
      // 0524: getstatic ox_.umb Le0x;
      // 0527: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 052a: invokevirtual cp8$vxz.a1g ()I
      // 052d: invokevirtual e0x.kig (I)Lzfz;
      // 0530: bipush 0
      // 0531: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0534: aload 0
      // 0535: aload 1
      // 0536: aload 3
      // 0537: aload 0
      // 0538: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 053b: bipush 6
      // 053d: isub
      // 053e: bipush 5
      // 053f: bipush 9
      // 0541: aload 0
      // 0542: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0545: bipush 6
      // 0547: isub
      // 0548: bipush 7
      // 054a: bipush 11
      // 054c: getstatic ox_.umb Le0x;
      // 054f: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0552: invokevirtual cp8$vxz.a1g ()I
      // 0555: invokevirtual e0x.kig (I)Lzfz;
      // 0558: getstatic ox_.umb Le0x;
      // 055b: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 055e: invokevirtual cp8$vxz.a1g ()I
      // 0561: invokevirtual e0x.kig (I)Lzfz;
      // 0564: bipush 0
      // 0565: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0568: aload 0
      // 0569: aload 1
      // 056a: getstatic ox_.ibw Le0x;
      // 056d: invokevirtual e0x.l4i ()Lzfz;
      // 0570: bipush 5
      // 0571: bipush 5
      // 0572: bipush 10
      // 0574: aload 3
      // 0575: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0578: aload 0
      // 0579: aload 1
      // 057a: getstatic ox_.ibw Le0x;
      // 057d: invokevirtual e0x.l4i ()Lzfz;
      // 0580: bipush 5
      // 0581: bipush 6
      // 0583: bipush 10
      // 0585: aload 3
      // 0586: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0589: aload 0
      // 058a: aload 1
      // 058b: getstatic ox_.ibw Le0x;
      // 058e: invokevirtual e0x.l4i ()Lzfz;
      // 0591: bipush 6
      // 0593: bipush 6
      // 0595: bipush 10
      // 0597: aload 3
      // 0598: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 059b: aload 0
      // 059c: aload 1
      // 059d: getstatic ox_.ibw Le0x;
      // 05a0: invokevirtual e0x.l4i ()Lzfz;
      // 05a3: aload 0
      // 05a4: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 05a7: bipush 6
      // 05a9: isub
      // 05aa: bipush 5
      // 05ab: bipush 10
      // 05ad: aload 3
      // 05ae: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 05b1: aload 0
      // 05b2: aload 1
      // 05b3: getstatic ox_.ibw Le0x;
      // 05b6: invokevirtual e0x.l4i ()Lzfz;
      // 05b9: aload 0
      // 05ba: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 05bd: bipush 6
      // 05bf: isub
      // 05c0: bipush 6
      // 05c2: bipush 10
      // 05c4: aload 3
      // 05c5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 05c8: aload 0
      // 05c9: aload 1
      // 05ca: getstatic ox_.ibw Le0x;
      // 05cd: invokevirtual e0x.l4i ()Lzfz;
      // 05d0: aload 0
      // 05d1: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 05d4: bipush 7
      // 05d6: isub
      // 05d7: bipush 6
      // 05d9: bipush 10
      // 05db: aload 3
      // 05dc: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 05df: aload 0
      // 05e0: aload 1
      // 05e1: aload 3
      // 05e2: bipush 2
      // 05e3: bipush 4
      // 05e4: bipush 4
      // 05e5: bipush 2
      // 05e6: bipush 6
      // 05e8: bipush 4
      // 05e9: getstatic ox_.ibw Le0x;
      // 05ec: invokevirtual e0x.l4i ()Lzfz;
      // 05ef: getstatic ox_.ibw Le0x;
      // 05f2: invokevirtual e0x.l4i ()Lzfz;
      // 05f5: bipush 0
      // 05f6: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 05f9: aload 0
      // 05fa: aload 1
      // 05fb: aload 3
      // 05fc: aload 0
      // 05fd: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0600: bipush 3
      // 0601: isub
      // 0602: bipush 4
      // 0603: bipush 4
      // 0604: aload 0
      // 0605: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0608: bipush 3
      // 0609: isub
      // 060a: bipush 6
      // 060c: bipush 4
      // 060d: getstatic ox_.ibw Le0x;
      // 0610: invokevirtual e0x.l4i ()Lzfz;
      // 0613: getstatic ox_.ibw Le0x;
      // 0616: invokevirtual e0x.l4i ()Lzfz;
      // 0619: bipush 0
      // 061a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 061d: aload 0
      // 061e: aload 1
      // 061f: getstatic ox_.qci Le0x;
      // 0622: iload 5
      // 0624: invokevirtual e0x.kig (I)Lzfz;
      // 0627: bipush 2
      // 0628: bipush 4
      // 0629: bipush 5
      // 062a: aload 3
      // 062b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 062e: aload 0
      // 062f: aload 1
      // 0630: getstatic ox_.qci Le0x;
      // 0633: iload 5
      // 0635: invokevirtual e0x.kig (I)Lzfz;
      // 0638: bipush 2
      // 0639: bipush 3
      // 063a: bipush 4
      // 063b: aload 3
      // 063c: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 063f: aload 0
      // 0640: aload 1
      // 0641: getstatic ox_.qci Le0x;
      // 0644: iload 5
      // 0646: invokevirtual e0x.kig (I)Lzfz;
      // 0649: aload 0
      // 064a: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 064d: bipush 3
      // 064e: isub
      // 064f: bipush 4
      // 0650: bipush 5
      // 0651: aload 3
      // 0652: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0655: aload 0
      // 0656: aload 1
      // 0657: getstatic ox_.qci Le0x;
      // 065a: iload 5
      // 065c: invokevirtual e0x.kig (I)Lzfz;
      // 065f: aload 0
      // 0660: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0663: bipush 3
      // 0664: isub
      // 0665: bipush 3
      // 0666: bipush 4
      // 0667: aload 3
      // 0668: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 066b: aload 0
      // 066c: aload 1
      // 066d: aload 3
      // 066e: bipush 1
      // 066f: bipush 1
      // 0670: bipush 3
      // 0671: bipush 2
      // 0672: bipush 2
      // 0673: bipush 3
      // 0674: getstatic ox_.umb Le0x;
      // 0677: invokevirtual e0x.l4i ()Lzfz;
      // 067a: getstatic ox_.umb Le0x;
      // 067d: invokevirtual e0x.l4i ()Lzfz;
      // 0680: bipush 0
      // 0681: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0684: aload 0
      // 0685: aload 1
      // 0686: aload 3
      // 0687: aload 0
      // 0688: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 068b: bipush 3
      // 068c: isub
      // 068d: bipush 1
      // 068e: bipush 3
      // 068f: aload 0
      // 0690: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0693: bipush 2
      // 0694: isub
      // 0695: bipush 2
      // 0696: bipush 3
      // 0697: getstatic ox_.umb Le0x;
      // 069a: invokevirtual e0x.l4i ()Lzfz;
      // 069d: getstatic ox_.umb Le0x;
      // 06a0: invokevirtual e0x.l4i ()Lzfz;
      // 06a3: bipush 0
      // 06a4: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 06a7: aload 0
      // 06a8: aload 1
      // 06a9: getstatic ox_.qci Le0x;
      // 06ac: invokevirtual e0x.l4i ()Lzfz;
      // 06af: bipush 1
      // 06b0: bipush 1
      // 06b1: bipush 2
      // 06b2: aload 3
      // 06b3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 06b6: aload 0
      // 06b7: aload 1
      // 06b8: getstatic ox_.qci Le0x;
      // 06bb: invokevirtual e0x.l4i ()Lzfz;
      // 06be: aload 0
      // 06bf: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 06c2: bipush 2
      // 06c3: isub
      // 06c4: bipush 1
      // 06c5: bipush 2
      // 06c6: aload 3
      // 06c7: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 06ca: aload 0
      // 06cb: aload 1
      // 06cc: getstatic ox_.bj8 Lizd;
      // 06cf: getstatic hvn$dyo.oy2 Lhvn$dyo;
      // 06d2: invokevirtual hvn$dyo.run ()I
      // 06d5: invokevirtual izd.kig (I)Lzfz;
      // 06d8: bipush 1
      // 06d9: bipush 2
      // 06da: bipush 2
      // 06db: aload 3
      // 06dc: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 06df: aload 0
      // 06e0: aload 1
      // 06e1: getstatic ox_.bj8 Lizd;
      // 06e4: getstatic hvn$dyo.oy2 Lhvn$dyo;
      // 06e7: invokevirtual hvn$dyo.run ()I
      // 06ea: invokevirtual izd.kig (I)Lzfz;
      // 06ed: aload 0
      // 06ee: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 06f1: bipush 2
      // 06f2: isub
      // 06f3: bipush 2
      // 06f4: bipush 2
      // 06f5: aload 3
      // 06f6: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 06f9: aload 0
      // 06fa: aload 1
      // 06fb: getstatic ox_.qci Le0x;
      // 06fe: iload 8
      // 0700: invokevirtual e0x.kig (I)Lzfz;
      // 0703: bipush 2
      // 0704: bipush 1
      // 0705: bipush 2
      // 0706: aload 3
      // 0707: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 070a: aload 0
      // 070b: aload 1
      // 070c: getstatic ox_.qci Le0x;
      // 070f: iload 7
      // 0711: invokevirtual e0x.kig (I)Lzfz;
      // 0714: aload 0
      // 0715: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0718: bipush 3
      // 0719: isub
      // 071a: bipush 1
      // 071b: bipush 2
      // 071c: aload 3
      // 071d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0720: aload 0
      // 0721: aload 1
      // 0722: aload 3
      // 0723: bipush 4
      // 0724: bipush 3
      // 0725: bipush 5
      // 0726: bipush 4
      // 0727: bipush 3
      // 0728: bipush 18
      // 072a: getstatic ox_.umb Le0x;
      // 072d: invokevirtual e0x.l4i ()Lzfz;
      // 0730: getstatic ox_.umb Le0x;
      // 0733: invokevirtual e0x.l4i ()Lzfz;
      // 0736: bipush 0
      // 0737: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 073a: aload 0
      // 073b: aload 1
      // 073c: aload 3
      // 073d: aload 0
      // 073e: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0741: bipush 5
      // 0742: isub
      // 0743: bipush 3
      // 0744: bipush 5
      // 0745: aload 0
      // 0746: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0749: bipush 5
      // 074a: isub
      // 074b: bipush 3
      // 074c: bipush 17
      // 074e: getstatic ox_.umb Le0x;
      // 0751: invokevirtual e0x.l4i ()Lzfz;
      // 0754: getstatic ox_.umb Le0x;
      // 0757: invokevirtual e0x.l4i ()Lzfz;
      // 075a: bipush 0
      // 075b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 075e: aload 0
      // 075f: aload 1
      // 0760: aload 3
      // 0761: bipush 3
      // 0762: bipush 1
      // 0763: bipush 5
      // 0764: bipush 4
      // 0765: bipush 2
      // 0766: bipush 16
      // 0768: getstatic ox_.ibw Le0x;
      // 076b: invokevirtual e0x.l4i ()Lzfz;
      // 076e: getstatic ox_.ibw Le0x;
      // 0771: invokevirtual e0x.l4i ()Lzfz;
      // 0774: bipush 0
      // 0775: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0778: aload 0
      // 0779: aload 1
      // 077a: aload 3
      // 077b: aload 0
      // 077c: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 077f: bipush 6
      // 0781: isub
      // 0782: bipush 1
      // 0783: bipush 5
      // 0784: aload 0
      // 0785: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0788: bipush 5
      // 0789: isub
      // 078a: bipush 2
      // 078b: bipush 16
      // 078d: getstatic ox_.ibw Le0x;
      // 0790: invokevirtual e0x.l4i ()Lzfz;
      // 0793: getstatic ox_.ibw Le0x;
      // 0796: invokevirtual e0x.l4i ()Lzfz;
      // 0799: bipush 0
      // 079a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 079d: bipush 5
      // 079e: istore 11
      // 07a0: iload 11
      // 07a2: bipush 17
      // 07a4: if_icmpgt 081d
      // 07a7: aload 0
      // 07a8: aload 1
      // 07a9: getstatic ox_.umb Le0x;
      // 07ac: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 07af: invokevirtual cp8$vxz.a1g ()I
      // 07b2: invokevirtual e0x.kig (I)Lzfz;
      // 07b5: bipush 4
      // 07b6: bipush 1
      // 07b7: iload 11
      // 07b9: aload 3
      // 07ba: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 07bd: aload 0
      // 07be: aload 1
      // 07bf: getstatic ox_.umb Le0x;
      // 07c2: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 07c5: invokevirtual cp8$vxz.a1g ()I
      // 07c8: invokevirtual e0x.kig (I)Lzfz;
      // 07cb: bipush 4
      // 07cc: bipush 2
      // 07cd: iload 11
      // 07cf: aload 3
      // 07d0: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 07d3: aload 0
      // 07d4: aload 1
      // 07d5: getstatic ox_.umb Le0x;
      // 07d8: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 07db: invokevirtual cp8$vxz.a1g ()I
      // 07de: invokevirtual e0x.kig (I)Lzfz;
      // 07e1: aload 0
      // 07e2: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 07e5: bipush 5
      // 07e6: isub
      // 07e7: bipush 1
      // 07e8: iload 11
      // 07ea: aload 3
      // 07eb: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 07ee: aload 0
      // 07ef: aload 1
      // 07f0: getstatic ox_.umb Le0x;
      // 07f3: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 07f6: invokevirtual cp8$vxz.a1g ()I
      // 07f9: invokevirtual e0x.kig (I)Lzfz;
      // 07fc: aload 0
      // 07fd: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0800: bipush 5
      // 0801: isub
      // 0802: bipush 2
      // 0803: iload 11
      // 0805: aload 3
      // 0806: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0809: iinc 11 2
      // 080c: aload 4
      // 080e: ifnull 0914
      // 0811: aload 4
      // 0813: ifnonnull 07a0
      // 0816: goto 081d
      // 0819: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.a (Loov;)Loov;
      // 081c: athrow
      // 081d: aload 0
      // 081e: aload 1
      // 081f: getstatic ox_.f6z Le0x;
      // 0822: iload 9
      // 0824: invokevirtual e0x.kig (I)Lzfz;
      // 0827: bipush 10
      // 0829: bipush 0
      // 082a: bipush 7
      // 082c: aload 3
      // 082d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0830: aload 0
      // 0831: aload 1
      // 0832: getstatic ox_.f6z Le0x;
      // 0835: iload 9
      // 0837: invokevirtual e0x.kig (I)Lzfz;
      // 083a: bipush 10
      // 083c: bipush 0
      // 083d: bipush 8
      // 083f: aload 3
      // 0840: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0843: aload 0
      // 0844: aload 1
      // 0845: getstatic ox_.f6z Le0x;
      // 0848: iload 9
      // 084a: invokevirtual e0x.kig (I)Lzfz;
      // 084d: bipush 9
      // 084f: bipush 0
      // 0850: bipush 9
      // 0852: aload 3
      // 0853: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0856: aload 0
      // 0857: aload 1
      // 0858: getstatic ox_.f6z Le0x;
      // 085b: iload 9
      // 085d: invokevirtual e0x.kig (I)Lzfz;
      // 0860: bipush 11
      // 0862: bipush 0
      // 0863: bipush 9
      // 0865: aload 3
      // 0866: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0869: aload 0
      // 086a: aload 1
      // 086b: getstatic ox_.f6z Le0x;
      // 086e: iload 9
      // 0870: invokevirtual e0x.kig (I)Lzfz;
      // 0873: bipush 8
      // 0875: bipush 0
      // 0876: bipush 10
      // 0878: aload 3
      // 0879: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 087c: aload 0
      // 087d: aload 1
      // 087e: getstatic ox_.f6z Le0x;
      // 0881: iload 9
      // 0883: invokevirtual e0x.kig (I)Lzfz;
      // 0886: bipush 12
      // 0888: bipush 0
      // 0889: bipush 10
      // 088b: aload 3
      // 088c: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 088f: aload 0
      // 0890: aload 1
      // 0891: getstatic ox_.f6z Le0x;
      // 0894: iload 9
      // 0896: invokevirtual e0x.kig (I)Lzfz;
      // 0899: bipush 7
      // 089b: bipush 0
      // 089c: bipush 10
      // 089e: aload 3
      // 089f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 08a2: aload 0
      // 08a3: aload 1
      // 08a4: getstatic ox_.f6z Le0x;
      // 08a7: iload 9
      // 08a9: invokevirtual e0x.kig (I)Lzfz;
      // 08ac: bipush 13
      // 08ae: bipush 0
      // 08af: bipush 10
      // 08b1: aload 3
      // 08b2: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 08b5: aload 0
      // 08b6: aload 1
      // 08b7: getstatic ox_.f6z Le0x;
      // 08ba: iload 9
      // 08bc: invokevirtual e0x.kig (I)Lzfz;
      // 08bf: bipush 9
      // 08c1: bipush 0
      // 08c2: bipush 11
      // 08c4: aload 3
      // 08c5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 08c8: aload 0
      // 08c9: aload 1
      // 08ca: getstatic ox_.f6z Le0x;
      // 08cd: iload 9
      // 08cf: invokevirtual e0x.kig (I)Lzfz;
      // 08d2: bipush 11
      // 08d4: bipush 0
      // 08d5: bipush 11
      // 08d7: aload 3
      // 08d8: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 08db: aload 0
      // 08dc: aload 1
      // 08dd: getstatic ox_.f6z Le0x;
      // 08e0: iload 9
      // 08e2: invokevirtual e0x.kig (I)Lzfz;
      // 08e5: bipush 10
      // 08e7: bipush 0
      // 08e8: bipush 12
      // 08ea: aload 3
      // 08eb: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 08ee: aload 0
      // 08ef: aload 1
      // 08f0: getstatic ox_.f6z Le0x;
      // 08f3: iload 9
      // 08f5: invokevirtual e0x.kig (I)Lzfz;
      // 08f8: bipush 10
      // 08fa: bipush 0
      // 08fb: bipush 13
      // 08fd: aload 3
      // 08fe: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0901: aload 0
      // 0902: aload 1
      // 0903: getstatic ox_.f6z Le0x;
      // 0906: iload 10
      // 0908: invokevirtual e0x.kig (I)Lzfz;
      // 090b: bipush 10
      // 090d: bipush 0
      // 090e: bipush 10
      // 0910: aload 3
      // 0911: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0914: bipush 0
      // 0915: istore 11
      // 0917: iload 11
      // 0919: aload 0
      // 091a: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 091d: bipush 1
      // 091e: isub
      // 091f: if_icmpgt 0aed
      // 0922: aload 0
      // 0923: aload 1
      // 0924: getstatic ox_.umb Le0x;
      // 0927: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 092a: invokevirtual cp8$vxz.a1g ()I
      // 092d: invokevirtual e0x.kig (I)Lzfz;
      // 0930: iload 11
      // 0932: bipush 2
      // 0933: bipush 1
      // 0934: aload 3
      // 0935: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0938: aload 0
      // 0939: aload 1
      // 093a: getstatic ox_.f6z Le0x;
      // 093d: iload 9
      // 093f: invokevirtual e0x.kig (I)Lzfz;
      // 0942: iload 11
      // 0944: bipush 2
      // 0945: bipush 2
      // 0946: aload 3
      // 0947: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 094a: aload 0
      // 094b: aload 1
      // 094c: getstatic ox_.umb Le0x;
      // 094f: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0952: invokevirtual cp8$vxz.a1g ()I
      // 0955: invokevirtual e0x.kig (I)Lzfz;
      // 0958: iload 11
      // 095a: bipush 2
      // 095b: bipush 3
      // 095c: aload 3
      // 095d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0960: aload 0
      // 0961: aload 1
      // 0962: getstatic ox_.umb Le0x;
      // 0965: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0968: invokevirtual cp8$vxz.a1g ()I
      // 096b: invokevirtual e0x.kig (I)Lzfz;
      // 096e: iload 11
      // 0970: bipush 3
      // 0971: bipush 1
      // 0972: aload 3
      // 0973: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0976: aload 0
      // 0977: aload 1
      // 0978: getstatic ox_.f6z Le0x;
      // 097b: iload 9
      // 097d: invokevirtual e0x.kig (I)Lzfz;
      // 0980: iload 11
      // 0982: bipush 3
      // 0983: bipush 2
      // 0984: aload 3
      // 0985: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0988: aload 0
      // 0989: aload 1
      // 098a: getstatic ox_.umb Le0x;
      // 098d: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0990: invokevirtual cp8$vxz.a1g ()I
      // 0993: invokevirtual e0x.kig (I)Lzfz;
      // 0996: iload 11
      // 0998: bipush 3
      // 0999: bipush 3
      // 099a: aload 3
      // 099b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 099e: aload 0
      // 099f: aload 1
      // 09a0: getstatic ox_.f6z Le0x;
      // 09a3: iload 9
      // 09a5: invokevirtual e0x.kig (I)Lzfz;
      // 09a8: iload 11
      // 09aa: bipush 4
      // 09ab: bipush 1
      // 09ac: aload 3
      // 09ad: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 09b0: aload 0
      // 09b1: aload 1
      // 09b2: getstatic ox_.umb Le0x;
      // 09b5: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 09b8: invokevirtual cp8$vxz.a1g ()I
      // 09bb: invokevirtual e0x.kig (I)Lzfz;
      // 09be: iload 11
      // 09c0: bipush 4
      // 09c1: bipush 2
      // 09c2: aload 3
      // 09c3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 09c6: aload 0
      // 09c7: aload 1
      // 09c8: getstatic ox_.f6z Le0x;
      // 09cb: iload 9
      // 09cd: invokevirtual e0x.kig (I)Lzfz;
      // 09d0: iload 11
      // 09d2: bipush 4
      // 09d3: bipush 3
      // 09d4: aload 3
      // 09d5: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 09d8: aload 0
      // 09d9: aload 1
      // 09da: getstatic ox_.umb Le0x;
      // 09dd: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 09e0: invokevirtual cp8$vxz.a1g ()I
      // 09e3: invokevirtual e0x.kig (I)Lzfz;
      // 09e6: iload 11
      // 09e8: bipush 5
      // 09e9: bipush 1
      // 09ea: aload 3
      // 09eb: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 09ee: aload 0
      // 09ef: aload 1
      // 09f0: getstatic ox_.f6z Le0x;
      // 09f3: iload 9
      // 09f5: invokevirtual e0x.kig (I)Lzfz;
      // 09f8: iload 11
      // 09fa: bipush 5
      // 09fb: bipush 2
      // 09fc: aload 3
      // 09fd: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a00: aload 0
      // 0a01: aload 1
      // 0a02: getstatic ox_.umb Le0x;
      // 0a05: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0a08: invokevirtual cp8$vxz.a1g ()I
      // 0a0b: invokevirtual e0x.kig (I)Lzfz;
      // 0a0e: iload 11
      // 0a10: bipush 5
      // 0a11: bipush 3
      // 0a12: aload 3
      // 0a13: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a16: aload 0
      // 0a17: aload 1
      // 0a18: getstatic ox_.f6z Le0x;
      // 0a1b: iload 9
      // 0a1d: invokevirtual e0x.kig (I)Lzfz;
      // 0a20: iload 11
      // 0a22: bipush 6
      // 0a24: bipush 1
      // 0a25: aload 3
      // 0a26: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a29: aload 0
      // 0a2a: aload 1
      // 0a2b: getstatic ox_.umb Le0x;
      // 0a2e: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 0a31: invokevirtual cp8$vxz.a1g ()I
      // 0a34: invokevirtual e0x.kig (I)Lzfz;
      // 0a37: iload 11
      // 0a39: bipush 6
      // 0a3b: bipush 2
      // 0a3c: aload 3
      // 0a3d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a40: aload 0
      // 0a41: aload 1
      // 0a42: getstatic ox_.f6z Le0x;
      // 0a45: iload 9
      // 0a47: invokevirtual e0x.kig (I)Lzfz;
      // 0a4a: iload 11
      // 0a4c: bipush 6
      // 0a4e: bipush 3
      // 0a4f: aload 3
      // 0a50: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a53: aload 0
      // 0a54: aload 1
      // 0a55: getstatic ox_.f6z Le0x;
      // 0a58: iload 9
      // 0a5a: invokevirtual e0x.kig (I)Lzfz;
      // 0a5d: iload 11
      // 0a5f: bipush 7
      // 0a61: bipush 1
      // 0a62: aload 3
      // 0a63: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a66: aload 0
      // 0a67: aload 1
      // 0a68: getstatic ox_.f6z Le0x;
      // 0a6b: iload 9
      // 0a6d: invokevirtual e0x.kig (I)Lzfz;
      // 0a70: iload 11
      // 0a72: bipush 7
      // 0a74: bipush 2
      // 0a75: aload 3
      // 0a76: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a79: aload 0
      // 0a7a: aload 1
      // 0a7b: getstatic ox_.f6z Le0x;
      // 0a7e: iload 9
      // 0a80: invokevirtual e0x.kig (I)Lzfz;
      // 0a83: iload 11
      // 0a85: bipush 7
      // 0a87: bipush 3
      // 0a88: aload 3
      // 0a89: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a8c: aload 0
      // 0a8d: aload 1
      // 0a8e: getstatic ox_.umb Le0x;
      // 0a91: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0a94: invokevirtual cp8$vxz.a1g ()I
      // 0a97: invokevirtual e0x.kig (I)Lzfz;
      // 0a9a: iload 11
      // 0a9c: bipush 8
      // 0a9e: bipush 1
      // 0a9f: aload 3
      // 0aa0: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0aa3: aload 0
      // 0aa4: aload 1
      // 0aa5: getstatic ox_.umb Le0x;
      // 0aa8: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0aab: invokevirtual cp8$vxz.a1g ()I
      // 0aae: invokevirtual e0x.kig (I)Lzfz;
      // 0ab1: iload 11
      // 0ab3: bipush 8
      // 0ab5: bipush 2
      // 0ab6: aload 3
      // 0ab7: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0aba: aload 0
      // 0abb: aload 1
      // 0abc: getstatic ox_.umb Le0x;
      // 0abf: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0ac2: invokevirtual cp8$vxz.a1g ()I
      // 0ac5: invokevirtual e0x.kig (I)Lzfz;
      // 0ac8: iload 11
      // 0aca: bipush 8
      // 0acc: bipush 3
      // 0acd: aload 3
      // 0ace: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ad1: iload 11
      // 0ad3: aload 0
      // 0ad4: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0ad7: bipush 1
      // 0ad8: isub
      // 0ad9: iadd
      // 0ada: istore 11
      // 0adc: aload 4
      // 0ade: ifnull 0af0
      // 0ae1: aload 4
      // 0ae3: ifnonnull 0917
      // 0ae6: goto 0aed
      // 0ae9: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.a (Loov;)Loov;
      // 0aec: athrow
      // 0aed: bipush 2
      // 0aee: istore 11
      // 0af0: iload 11
      // 0af2: aload 0
      // 0af3: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0af6: bipush 3
      // 0af7: isub
      // 0af8: if_icmpgt 0ce4
      // 0afb: aload 0
      // 0afc: aload 1
      // 0afd: getstatic ox_.umb Le0x;
      // 0b00: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0b03: invokevirtual cp8$vxz.a1g ()I
      // 0b06: invokevirtual e0x.kig (I)Lzfz;
      // 0b09: iload 11
      // 0b0b: bipush 1
      // 0b0c: isub
      // 0b0d: bipush 2
      // 0b0e: bipush 0
      // 0b0f: aload 3
      // 0b10: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b13: aload 0
      // 0b14: aload 1
      // 0b15: getstatic ox_.f6z Le0x;
      // 0b18: iload 9
      // 0b1a: invokevirtual e0x.kig (I)Lzfz;
      // 0b1d: iload 11
      // 0b1f: bipush 2
      // 0b20: bipush 0
      // 0b21: aload 3
      // 0b22: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b25: aload 0
      // 0b26: aload 1
      // 0b27: getstatic ox_.umb Le0x;
      // 0b2a: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0b2d: invokevirtual cp8$vxz.a1g ()I
      // 0b30: invokevirtual e0x.kig (I)Lzfz;
      // 0b33: iload 11
      // 0b35: bipush 1
      // 0b36: iadd
      // 0b37: bipush 2
      // 0b38: bipush 0
      // 0b39: aload 3
      // 0b3a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b3d: aload 0
      // 0b3e: aload 1
      // 0b3f: getstatic ox_.umb Le0x;
      // 0b42: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0b45: invokevirtual cp8$vxz.a1g ()I
      // 0b48: invokevirtual e0x.kig (I)Lzfz;
      // 0b4b: iload 11
      // 0b4d: bipush 1
      // 0b4e: isub
      // 0b4f: bipush 3
      // 0b50: bipush 0
      // 0b51: aload 3
      // 0b52: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b55: aload 0
      // 0b56: aload 1
      // 0b57: getstatic ox_.f6z Le0x;
      // 0b5a: iload 9
      // 0b5c: invokevirtual e0x.kig (I)Lzfz;
      // 0b5f: iload 11
      // 0b61: bipush 3
      // 0b62: bipush 0
      // 0b63: aload 3
      // 0b64: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b67: aload 0
      // 0b68: aload 1
      // 0b69: getstatic ox_.umb Le0x;
      // 0b6c: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0b6f: invokevirtual cp8$vxz.a1g ()I
      // 0b72: invokevirtual e0x.kig (I)Lzfz;
      // 0b75: iload 11
      // 0b77: bipush 1
      // 0b78: iadd
      // 0b79: bipush 3
      // 0b7a: bipush 0
      // 0b7b: aload 3
      // 0b7c: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b7f: aload 0
      // 0b80: aload 1
      // 0b81: getstatic ox_.f6z Le0x;
      // 0b84: iload 9
      // 0b86: invokevirtual e0x.kig (I)Lzfz;
      // 0b89: iload 11
      // 0b8b: bipush 1
      // 0b8c: isub
      // 0b8d: bipush 4
      // 0b8e: bipush 0
      // 0b8f: aload 3
      // 0b90: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b93: aload 0
      // 0b94: aload 1
      // 0b95: getstatic ox_.umb Le0x;
      // 0b98: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 0b9b: invokevirtual cp8$vxz.a1g ()I
      // 0b9e: invokevirtual e0x.kig (I)Lzfz;
      // 0ba1: iload 11
      // 0ba3: bipush 4
      // 0ba4: bipush 0
      // 0ba5: aload 3
      // 0ba6: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ba9: aload 0
      // 0baa: aload 1
      // 0bab: getstatic ox_.f6z Le0x;
      // 0bae: iload 9
      // 0bb0: invokevirtual e0x.kig (I)Lzfz;
      // 0bb3: iload 11
      // 0bb5: bipush 1
      // 0bb6: iadd
      // 0bb7: bipush 4
      // 0bb8: bipush 0
      // 0bb9: aload 3
      // 0bba: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0bbd: aload 0
      // 0bbe: aload 1
      // 0bbf: getstatic ox_.umb Le0x;
      // 0bc2: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0bc5: invokevirtual cp8$vxz.a1g ()I
      // 0bc8: invokevirtual e0x.kig (I)Lzfz;
      // 0bcb: iload 11
      // 0bcd: bipush 1
      // 0bce: isub
      // 0bcf: bipush 5
      // 0bd0: bipush 0
      // 0bd1: aload 3
      // 0bd2: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0bd5: aload 0
      // 0bd6: aload 1
      // 0bd7: getstatic ox_.f6z Le0x;
      // 0bda: iload 9
      // 0bdc: invokevirtual e0x.kig (I)Lzfz;
      // 0bdf: iload 11
      // 0be1: bipush 5
      // 0be2: bipush 0
      // 0be3: aload 3
      // 0be4: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0be7: aload 0
      // 0be8: aload 1
      // 0be9: getstatic ox_.umb Le0x;
      // 0bec: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0bef: invokevirtual cp8$vxz.a1g ()I
      // 0bf2: invokevirtual e0x.kig (I)Lzfz;
      // 0bf5: iload 11
      // 0bf7: bipush 1
      // 0bf8: iadd
      // 0bf9: bipush 5
      // 0bfa: bipush 0
      // 0bfb: aload 3
      // 0bfc: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0bff: aload 0
      // 0c00: aload 1
      // 0c01: getstatic ox_.f6z Le0x;
      // 0c04: iload 9
      // 0c06: invokevirtual e0x.kig (I)Lzfz;
      // 0c09: iload 11
      // 0c0b: bipush 1
      // 0c0c: isub
      // 0c0d: bipush 6
      // 0c0f: bipush 0
      // 0c10: aload 3
      // 0c11: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c14: aload 0
      // 0c15: aload 1
      // 0c16: getstatic ox_.umb Le0x;
      // 0c19: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 0c1c: invokevirtual cp8$vxz.a1g ()I
      // 0c1f: invokevirtual e0x.kig (I)Lzfz;
      // 0c22: iload 11
      // 0c24: bipush 6
      // 0c26: bipush 0
      // 0c27: aload 3
      // 0c28: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c2b: aload 0
      // 0c2c: aload 1
      // 0c2d: getstatic ox_.f6z Le0x;
      // 0c30: iload 9
      // 0c32: invokevirtual e0x.kig (I)Lzfz;
      // 0c35: iload 11
      // 0c37: bipush 1
      // 0c38: iadd
      // 0c39: bipush 6
      // 0c3b: bipush 0
      // 0c3c: aload 3
      // 0c3d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c40: aload 0
      // 0c41: aload 1
      // 0c42: getstatic ox_.f6z Le0x;
      // 0c45: iload 9
      // 0c47: invokevirtual e0x.kig (I)Lzfz;
      // 0c4a: iload 11
      // 0c4c: bipush 1
      // 0c4d: isub
      // 0c4e: bipush 7
      // 0c50: bipush 0
      // 0c51: aload 3
      // 0c52: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c55: aload 0
      // 0c56: aload 1
      // 0c57: getstatic ox_.f6z Le0x;
      // 0c5a: iload 9
      // 0c5c: invokevirtual e0x.kig (I)Lzfz;
      // 0c5f: iload 11
      // 0c61: bipush 7
      // 0c63: bipush 0
      // 0c64: aload 3
      // 0c65: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c68: aload 0
      // 0c69: aload 1
      // 0c6a: getstatic ox_.f6z Le0x;
      // 0c6d: iload 9
      // 0c6f: invokevirtual e0x.kig (I)Lzfz;
      // 0c72: iload 11
      // 0c74: bipush 1
      // 0c75: iadd
      // 0c76: bipush 7
      // 0c78: bipush 0
      // 0c79: aload 3
      // 0c7a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c7d: aload 0
      // 0c7e: aload 1
      // 0c7f: getstatic ox_.umb Le0x;
      // 0c82: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0c85: invokevirtual cp8$vxz.a1g ()I
      // 0c88: invokevirtual e0x.kig (I)Lzfz;
      // 0c8b: iload 11
      // 0c8d: bipush 1
      // 0c8e: isub
      // 0c8f: bipush 8
      // 0c91: bipush 0
      // 0c92: aload 3
      // 0c93: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0c96: aload 0
      // 0c97: aload 1
      // 0c98: getstatic ox_.umb Le0x;
      // 0c9b: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0c9e: invokevirtual cp8$vxz.a1g ()I
      // 0ca1: invokevirtual e0x.kig (I)Lzfz;
      // 0ca4: iload 11
      // 0ca6: bipush 8
      // 0ca8: bipush 0
      // 0ca9: aload 3
      // 0caa: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0cad: aload 0
      // 0cae: aload 1
      // 0caf: getstatic ox_.umb Le0x;
      // 0cb2: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0cb5: invokevirtual cp8$vxz.a1g ()I
      // 0cb8: invokevirtual e0x.kig (I)Lzfz;
      // 0cbb: iload 11
      // 0cbd: bipush 1
      // 0cbe: iadd
      // 0cbf: bipush 8
      // 0cc1: bipush 0
      // 0cc2: aload 3
      // 0cc3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0cc6: iload 11
      // 0cc8: aload 0
      // 0cc9: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.cu2 I
      // 0ccc: bipush 3
      // 0ccd: isub
      // 0cce: bipush 2
      // 0ccf: isub
      // 0cd0: iadd
      // 0cd1: istore 11
      // 0cd3: aload 4
      // 0cd5: ifnull 0fa6
      // 0cd8: aload 4
      // 0cda: ifnonnull 0af0
      // 0cdd: goto 0ce4
      // 0ce0: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.a (Loov;)Loov;
      // 0ce3: athrow
      // 0ce4: aload 0
      // 0ce5: aload 1
      // 0ce6: aload 3
      // 0ce7: bipush 8
      // 0ce9: bipush 4
      // 0cea: bipush 0
      // 0ceb: bipush 12
      // 0ced: bipush 6
      // 0cef: bipush 0
      // 0cf0: getstatic ox_.umb Le0x;
      // 0cf3: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0cf6: invokevirtual cp8$vxz.a1g ()I
      // 0cf9: invokevirtual e0x.kig (I)Lzfz;
      // 0cfc: getstatic ox_.umb Le0x;
      // 0cff: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0d02: invokevirtual cp8$vxz.a1g ()I
      // 0d05: invokevirtual e0x.kig (I)Lzfz;
      // 0d08: bipush 0
      // 0d09: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0d0c: aload 0
      // 0d0d: aload 1
      // 0d0e: getstatic ox_.ibw Le0x;
      // 0d11: invokevirtual e0x.l4i ()Lzfz;
      // 0d14: bipush 8
      // 0d16: bipush 6
      // 0d18: bipush 0
      // 0d19: aload 3
      // 0d1a: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0d1d: aload 0
      // 0d1e: aload 1
      // 0d1f: getstatic ox_.ibw Le0x;
      // 0d22: invokevirtual e0x.l4i ()Lzfz;
      // 0d25: bipush 12
      // 0d27: bipush 6
      // 0d29: bipush 0
      // 0d2a: aload 3
      // 0d2b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0d2e: aload 0
      // 0d2f: aload 1
      // 0d30: getstatic ox_.f6z Le0x;
      // 0d33: iload 9
      // 0d35: invokevirtual e0x.kig (I)Lzfz;
      // 0d38: bipush 9
      // 0d3a: bipush 5
      // 0d3b: bipush 0
      // 0d3c: aload 3
      // 0d3d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0d40: aload 0
      // 0d41: aload 1
      // 0d42: getstatic ox_.umb Le0x;
      // 0d45: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 0d48: invokevirtual cp8$vxz.a1g ()I
      // 0d4b: invokevirtual e0x.kig (I)Lzfz;
      // 0d4e: bipush 10
      // 0d50: bipush 5
      // 0d51: bipush 0
      // 0d52: aload 3
      // 0d53: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0d56: aload 0
      // 0d57: aload 1
      // 0d58: getstatic ox_.f6z Le0x;
      // 0d5b: iload 9
      // 0d5d: invokevirtual e0x.kig (I)Lzfz;
      // 0d60: bipush 11
      // 0d62: bipush 5
      // 0d63: bipush 0
      // 0d64: aload 3
      // 0d65: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0d68: aload 0
      // 0d69: aload 1
      // 0d6a: aload 3
      // 0d6b: bipush 8
      // 0d6d: bipush -14
      // 0d6f: bipush 8
      // 0d71: bipush 12
      // 0d73: bipush -11
      // 0d75: bipush 12
      // 0d77: getstatic ox_.umb Le0x;
      // 0d7a: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0d7d: invokevirtual cp8$vxz.a1g ()I
      // 0d80: invokevirtual e0x.kig (I)Lzfz;
      // 0d83: getstatic ox_.umb Le0x;
      // 0d86: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0d89: invokevirtual cp8$vxz.a1g ()I
      // 0d8c: invokevirtual e0x.kig (I)Lzfz;
      // 0d8f: bipush 0
      // 0d90: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0d93: aload 0
      // 0d94: aload 1
      // 0d95: aload 3
      // 0d96: bipush 8
      // 0d98: bipush -10
      // 0d9a: bipush 8
      // 0d9c: bipush 12
      // 0d9e: bipush -10
      // 0da0: bipush 12
      // 0da2: getstatic ox_.umb Le0x;
      // 0da5: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 0da8: invokevirtual cp8$vxz.a1g ()I
      // 0dab: invokevirtual e0x.kig (I)Lzfz;
      // 0dae: getstatic ox_.umb Le0x;
      // 0db1: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 0db4: invokevirtual cp8$vxz.a1g ()I
      // 0db7: invokevirtual e0x.kig (I)Lzfz;
      // 0dba: bipush 0
      // 0dbb: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0dbe: aload 0
      // 0dbf: aload 1
      // 0dc0: aload 3
      // 0dc1: bipush 8
      // 0dc3: bipush -9
      // 0dc5: bipush 8
      // 0dc7: bipush 12
      // 0dc9: bipush -9
      // 0dcb: bipush 12
      // 0dcd: getstatic ox_.umb Le0x;
      // 0dd0: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0dd3: invokevirtual cp8$vxz.a1g ()I
      // 0dd6: invokevirtual e0x.kig (I)Lzfz;
      // 0dd9: getstatic ox_.umb Le0x;
      // 0ddc: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0ddf: invokevirtual cp8$vxz.a1g ()I
      // 0de2: invokevirtual e0x.kig (I)Lzfz;
      // 0de5: bipush 0
      // 0de6: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0de9: aload 0
      // 0dea: aload 1
      // 0deb: aload 3
      // 0dec: bipush 8
      // 0dee: bipush -8
      // 0df0: bipush 8
      // 0df2: bipush 12
      // 0df4: bipush -1
      // 0df5: bipush 12
      // 0df7: getstatic ox_.umb Le0x;
      // 0dfa: invokevirtual e0x.l4i ()Lzfz;
      // 0dfd: getstatic ox_.umb Le0x;
      // 0e00: invokevirtual e0x.l4i ()Lzfz;
      // 0e03: bipush 0
      // 0e04: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e07: aload 0
      // 0e08: aload 1
      // 0e09: aload 3
      // 0e0a: bipush 9
      // 0e0c: bipush -11
      // 0e0e: bipush 9
      // 0e10: bipush 11
      // 0e12: bipush -1
      // 0e13: bipush 11
      // 0e15: getstatic ox_.ibw Le0x;
      // 0e18: invokevirtual e0x.l4i ()Lzfz;
      // 0e1b: getstatic ox_.ibw Le0x;
      // 0e1e: invokevirtual e0x.l4i ()Lzfz;
      // 0e21: bipush 0
      // 0e22: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e25: aload 0
      // 0e26: aload 1
      // 0e27: getstatic ox_.n7h Le0x;
      // 0e2a: invokevirtual e0x.l4i ()Lzfz;
      // 0e2d: bipush 10
      // 0e2f: bipush -11
      // 0e31: bipush 10
      // 0e33: aload 3
      // 0e34: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0e37: aload 0
      // 0e38: aload 1
      // 0e39: aload 3
      // 0e3a: bipush 9
      // 0e3c: bipush -13
      // 0e3e: bipush 9
      // 0e40: bipush 11
      // 0e42: bipush -13
      // 0e44: bipush 11
      // 0e46: getstatic ox_.od1 Le0x;
      // 0e49: invokevirtual e0x.l4i ()Lzfz;
      // 0e4c: getstatic ox_.ibw Le0x;
      // 0e4f: invokevirtual e0x.l4i ()Lzfz;
      // 0e52: bipush 0
      // 0e53: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e56: aload 0
      // 0e57: aload 1
      // 0e58: getstatic ox_.ibw Le0x;
      // 0e5b: invokevirtual e0x.l4i ()Lzfz;
      // 0e5e: bipush 8
      // 0e60: bipush -11
      // 0e62: bipush 10
      // 0e64: aload 3
      // 0e65: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0e68: aload 0
      // 0e69: aload 1
      // 0e6a: getstatic ox_.ibw Le0x;
      // 0e6d: invokevirtual e0x.l4i ()Lzfz;
      // 0e70: bipush 8
      // 0e72: bipush -10
      // 0e74: bipush 10
      // 0e76: aload 3
      // 0e77: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0e7a: aload 0
      // 0e7b: aload 1
      // 0e7c: getstatic ox_.umb Le0x;
      // 0e7f: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 0e82: invokevirtual cp8$vxz.a1g ()I
      // 0e85: invokevirtual e0x.kig (I)Lzfz;
      // 0e88: bipush 7
      // 0e8a: bipush -10
      // 0e8c: bipush 10
      // 0e8e: aload 3
      // 0e8f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0e92: aload 0
      // 0e93: aload 1
      // 0e94: getstatic ox_.umb Le0x;
      // 0e97: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0e9a: invokevirtual cp8$vxz.a1g ()I
      // 0e9d: invokevirtual e0x.kig (I)Lzfz;
      // 0ea0: bipush 7
      // 0ea2: bipush -11
      // 0ea4: bipush 10
      // 0ea6: aload 3
      // 0ea7: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0eaa: aload 0
      // 0eab: aload 1
      // 0eac: getstatic ox_.ibw Le0x;
      // 0eaf: invokevirtual e0x.l4i ()Lzfz;
      // 0eb2: bipush 12
      // 0eb4: bipush -11
      // 0eb6: bipush 10
      // 0eb8: aload 3
      // 0eb9: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ebc: aload 0
      // 0ebd: aload 1
      // 0ebe: getstatic ox_.ibw Le0x;
      // 0ec1: invokevirtual e0x.l4i ()Lzfz;
      // 0ec4: bipush 12
      // 0ec6: bipush -10
      // 0ec8: bipush 10
      // 0eca: aload 3
      // 0ecb: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ece: aload 0
      // 0ecf: aload 1
      // 0ed0: getstatic ox_.umb Le0x;
      // 0ed3: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 0ed6: invokevirtual cp8$vxz.a1g ()I
      // 0ed9: invokevirtual e0x.kig (I)Lzfz;
      // 0edc: bipush 13
      // 0ede: bipush -10
      // 0ee0: bipush 10
      // 0ee2: aload 3
      // 0ee3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ee6: aload 0
      // 0ee7: aload 1
      // 0ee8: getstatic ox_.umb Le0x;
      // 0eeb: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0eee: invokevirtual cp8$vxz.a1g ()I
      // 0ef1: invokevirtual e0x.kig (I)Lzfz;
      // 0ef4: bipush 13
      // 0ef6: bipush -11
      // 0ef8: bipush 10
      // 0efa: aload 3
      // 0efb: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0efe: aload 0
      // 0eff: aload 1
      // 0f00: getstatic ox_.ibw Le0x;
      // 0f03: invokevirtual e0x.l4i ()Lzfz;
      // 0f06: bipush 10
      // 0f08: bipush -11
      // 0f0a: bipush 8
      // 0f0c: aload 3
      // 0f0d: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f10: aload 0
      // 0f11: aload 1
      // 0f12: getstatic ox_.ibw Le0x;
      // 0f15: invokevirtual e0x.l4i ()Lzfz;
      // 0f18: bipush 10
      // 0f1a: bipush -10
      // 0f1c: bipush 8
      // 0f1e: aload 3
      // 0f1f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f22: aload 0
      // 0f23: aload 1
      // 0f24: getstatic ox_.umb Le0x;
      // 0f27: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 0f2a: invokevirtual cp8$vxz.a1g ()I
      // 0f2d: invokevirtual e0x.kig (I)Lzfz;
      // 0f30: bipush 10
      // 0f32: bipush -10
      // 0f34: bipush 7
      // 0f36: aload 3
      // 0f37: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f3a: aload 0
      // 0f3b: aload 1
      // 0f3c: getstatic ox_.umb Le0x;
      // 0f3f: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0f42: invokevirtual cp8$vxz.a1g ()I
      // 0f45: invokevirtual e0x.kig (I)Lzfz;
      // 0f48: bipush 10
      // 0f4a: bipush -11
      // 0f4c: bipush 7
      // 0f4e: aload 3
      // 0f4f: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f52: aload 0
      // 0f53: aload 1
      // 0f54: getstatic ox_.ibw Le0x;
      // 0f57: invokevirtual e0x.l4i ()Lzfz;
      // 0f5a: bipush 10
      // 0f5c: bipush -11
      // 0f5e: bipush 12
      // 0f60: aload 3
      // 0f61: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f64: aload 0
      // 0f65: aload 1
      // 0f66: getstatic ox_.ibw Le0x;
      // 0f69: invokevirtual e0x.l4i ()Lzfz;
      // 0f6c: bipush 10
      // 0f6e: bipush -10
      // 0f70: bipush 12
      // 0f72: aload 3
      // 0f73: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f76: aload 0
      // 0f77: aload 1
      // 0f78: getstatic ox_.umb Le0x;
      // 0f7b: getstatic cp8$vxz.jxy Lcp8$vxz;
      // 0f7e: invokevirtual cp8$vxz.a1g ()I
      // 0f81: invokevirtual e0x.kig (I)Lzfz;
      // 0f84: bipush 10
      // 0f86: bipush -10
      // 0f88: bipush 13
      // 0f8a: aload 3
      // 0f8b: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0f8e: aload 0
      // 0f8f: aload 1
      // 0f90: getstatic ox_.umb Le0x;
      // 0f93: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 0f96: invokevirtual cp8$vxz.a1g ()I
      // 0f99: invokevirtual e0x.kig (I)Lzfz;
      // 0f9c: bipush 10
      // 0f9e: bipush -11
      // 0fa0: bipush 13
      // 0fa2: aload 3
      // 0fa3: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0fa6: getstatic vt2$unz.fzl Lvt2$unz;
      // 0fa9: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 0fac: astore 11
      // 0fae: aload 11
      // 0fb0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0fb5: ifeq 103f
      // 0fb8: aload 11
      // 0fba: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0fbf: checkcast vt2
      // 0fc2: astore 12
      // 0fc4: aload 0
      // 0fc5: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.pys [Z
      // 0fc8: aload 12
      // 0fca: invokevirtual vt2.tmy ()I
      // 0fcd: baload
      // 0fce: aload 4
      // 0fd0: ifnull 1040
      // 0fd3: aload 4
      // 0fd5: ifnull 0ff7
      // 0fd8: goto 0fdf
      // 0fdb: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.a (Loov;)Loov;
      // 0fde: athrow
      // 0fdf: ifne 103a
      // 0fe2: goto 0fe9
      // 0fe5: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.a (Loov;)Loov;
      // 0fe8: athrow
      // 0fe9: aload 12
      // 0feb: invokevirtual vt2.n67 ()I
      // 0fee: bipush 2
      // 0fef: imul
      // 0ff0: goto 0ff7
      // 0ff3: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.a (Loov;)Loov;
      // 0ff6: athrow
      // 0ff7: istore 13
      // 0ff9: aload 12
      // 0ffb: invokevirtual vt2.ozy ()I
      // 0ffe: bipush 2
      // 0fff: imul
      // 1000: istore 14
      // 1002: aload 0
      // 1003: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.pys [Z
      // 1006: aload 12
      // 1008: invokevirtual vt2.tmy ()I
      // 100b: aload 0
      // 100c: aload 1
      // 100d: aload 3
      // 100e: aload 2
      // 100f: bipush 10
      // 1011: iload 13
      // 1013: iadd
      // 1014: bipush -11
      // 1016: bipush 10
      // 1018: iload 14
      // 101a: iadd
      // 101b: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.c8n Ljava/util/List;
      // 101e: bipush 1
      // 101f: anewarray 183
      // 1022: dup
      // 1023: bipush 0
      // 1024: getstatic xbr.frz Lnmo;
      // 1027: aload 2
      // 1028: invokevirtual nmo.z0_ (Ljava/util/Random;)Lypi;
      // 102b: aastore
      // 102c: invokestatic ypi.voc (Ljava/util/List;[Lypi;)Ljava/util/List;
      // 102f: bipush 2
      // 1030: aload 2
      // 1031: bipush 5
      // 1032: invokevirtual java/util/Random.nextInt (I)I
      // 1035: iadd
      // 1036: invokevirtual net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // 1039: bastore
      // 103a: aload 4
      // 103c: ifnonnull 0fae
      // 103f: bipush 1
      // 1040: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6394816402457781524L, 1696837865934054053L, MethodHandles.lookup().lookupClass()).a(118397433390457L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 11398690362447L;
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
      String var6 = "\u0088ãQÒ3Ë¯e\bý\u0017M\u008f{'\u008eWÜ§2_íªR)lÙåW¾?\r -/Þà\u008fùÍuÆæÅTdÅ\u0080j\u0083×¨Ób´_\bÒ\u0091C\u009f'Òz² Øæh\u0082v\u008f\u0002RÀ>øÿ\u0004\rÜÂp\u009c¹\u008bþ\u000b²\u008dü´YnìàÃa\u0018ÓK\u0096\u001c#\u009b\f¦ÅFEêM\t@\u0019Æ\\]\u0092z\u0092\u0015þ\u0018\u0081¸¢¤ø\u0019vèo\u0089ÏÙ#a_\u0005ëÆo\u007fä\u0095ó\u0015 ¿\u0019»µ»\u0088¬û#]¸[C²>\u0091Òø\u0013ã\u0086\u0096o\u0003ÏÑP\u008fc*8D";
      int var8 = "\u0088ãQÒ3Ë¯e\bý\u0017M\u008f{'\u008eWÜ§2_íªR)lÙåW¾?\r -/Þà\u008fùÍuÆæÅTdÅ\u0080j\u0083×¨Ób´_\bÒ\u0091C\u009f'Òz² Øæh\u0082v\u008f\u0002RÀ>øÿ\u0004\rÜÂp\u009c¹\u008bþ\u000b²\u008dü´YnìàÃa\u0018ÓK\u0096\u001c#\u009b\f¦ÅFEêM\t@\u0019Æ\\]\u0092z\u0092\u0015þ\u0018\u0081¸¢¤ø\u0019vèo\u0089ÏÙ#a_\u0005ëÆo\u007fä\u0095ó\u0015 ¿\u0019»µ»\u0088¬û#]¸[C²>\u0091Òø\u0013ã\u0086\u0096o\u0003ÏÑP\u008fc*8D"
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
                     c8n = Lists.newArrayList(
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

                  var6 = "4\u0013°|É\u009dú4¶tªÿr-\u0087\u001bÝÜë\u001e\u00ad<¤[\u009b¤5Ì\u0001S\u0097F \u0082Ë\u0088¤\u0002\u0084ü^\u008c3!ÏX\u008d£\u000bú)1\u0097¼xD\u0018ú\u00ads®D\u0099*[";
                  var8 = "4\u0013°|É\u009dú4¶tªÿr-\u0087\u001bÝÜë\u001e\u00ad<¤[\u009b¤5Ì\u0001S\u0097F \u0082Ë\u0088¤\u0002\u0084ü^\u008c3!ÏX\u008d£\u000bú)1\u0097¼xD\u0018ú\u00ads®D\u0099*["
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13566;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid", var10);
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
            "net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$DesertPyramid" + " : " + var1 + " : " + var2.toString(), var5
         );
      }
   }
}
