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
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraft.world.gen.structure.StructureOceanMonument;

public class eiu implements g6k {
   private Random kz7;
   private b_x f1g;
   private b_x vai;
   private b_x cm_;
   private uwf s9t;
   public b_x gem;
   public b_x ikb;
   public b_x gak;
   private OpaquePredicate b01;
   private final boolean xjr;
   private gxq jl5;
   private final double[] xje;
   private final float[] lg0;
   private y_h wo4;
   private e0x i4t;
   private double[] ego;
   private uk2 yqm;
   private MapGenStronghold a7k;
   private MapGenVillage s9l;
   private xi0 hj_;
   private MapGenScatteredFeature h02;
   private uk2 EntityMob;
   private StructureOceanMonument lq4;
   private gyu[] y4o;
   public double[] fgk;
   public double[] y9v;
   public double[] fzc;
   public double[] krp;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public eiu(OpaquePredicate param1, long param2, boolean param4, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: aload 0
      // 005: getstatic ox_.gdz Les2;
      // 008: putfield eiu.i4t Le0x;
      // 00b: aload 0
      // 00c: sipush 256
      // 00f: newarray 7
      // 011: putfield eiu.ego [D
      // 014: invokestatic OpaquePredicate.c ()I
      // 017: aload 0
      // 018: new h9u
      // 01b: dup
      // 01c: invokespecial h9u.<init> ()V
      // 01f: putfield eiu.yqm Luk2;
      // 022: aload 0
      // 023: new net/minecraft/world/gen/structure/MapGenStronghold
      // 026: dup
      // 027: invokespecial net/minecraft/world/gen/structure/MapGenStronghold.<init> ()V
      // 02a: putfield eiu.a7k Lnet/minecraft/world/gen/structure/MapGenStronghold;
      // 02d: aload 0
      // 02e: new net/minecraft/world/gen/structure/MapGenVillage
      // 031: dup
      // 032: invokespecial net/minecraft/world/gen/structure/MapGenVillage.<init> ()V
      // 035: putfield eiu.s9l Lnet/minecraft/world/gen/structure/MapGenVillage;
      // 038: aload 0
      // 039: new xi0
      // 03c: dup
      // 03d: invokespecial xi0.<init> ()V
      // 040: putfield eiu.hj_ Lxi0;
      // 043: aload 0
      // 044: new net/minecraft/world/gen/structure/MapGenScatteredFeature
      // 047: dup
      // 048: invokespecial net/minecraft/world/gen/structure/MapGenScatteredFeature.<init> ()V
      // 04b: putfield eiu.h02 Lnet/minecraft/world/gen/structure/MapGenScatteredFeature;
      // 04e: aload 0
      // 04f: new cvu
      // 052: dup
      // 053: invokespecial cvu.<init> ()V
      // 056: putfield eiu.w8s Luk2;
      // 059: aload 0
      // 05a: new net/minecraft/world/gen/structure/StructureOceanMonument
      // 05d: dup
      // 05e: invokespecial net/minecraft/world/gen/structure/StructureOceanMonument.<init> ()V
      // 061: putfield eiu.lq4 Lnet/minecraft/world/gen/structure/StructureOceanMonument;
      // 064: aload 0
      // 065: aload 1
      // 066: putfield eiu.b01 Lt9d;
      // 069: aload 0
      // 06a: iload 4
      // 06c: putfield eiu.xjr Z
      // 06f: aload 0
      // 070: aload 1
      // 071: invokevirtual OpaquePredicate.r7d ()Lcog;
      // 074: invokevirtual cog.z28 ()Lgxq;
      // 077: putfield eiu.jl5 Lgxq;
      // 07a: aload 0
      // 07b: new java/util/Random
      // 07e: dup
      // 07f: lload 2
      // 080: invokespecial java/util/Random.<init> (J)V
      // 083: putfield eiu.kz7 Ljava/util/Random;
      // 086: istore 6
      // 088: aload 0
      // 089: new b_x
      // 08c: dup
      // 08d: aload 0
      // 08e: getfield eiu.kz7 Ljava/util/Random;
      // 091: bipush 16
      // 093: invokespecial b_x.<init> (Ljava/util/Random;I)V
      // 096: putfield eiu.f1g Lb_x;
      // 099: aload 0
      // 09a: new b_x
      // 09d: dup
      // 09e: aload 0
      // 09f: getfield eiu.kz7 Ljava/util/Random;
      // 0a2: bipush 16
      // 0a4: invokespecial b_x.<init> (Ljava/util/Random;I)V
      // 0a7: putfield eiu.vai Lb_x;
      // 0aa: aload 0
      // 0ab: new b_x
      // 0ae: dup
      // 0af: aload 0
      // 0b0: getfield eiu.kz7 Ljava/util/Random;
      // 0b3: bipush 8
      // 0b5: invokespecial b_x.<init> (Ljava/util/Random;I)V
      // 0b8: putfield eiu.cm_ Lb_x;
      // 0bb: aload 0
      // 0bc: new uwf
      // 0bf: dup
      // 0c0: aload 0
      // 0c1: getfield eiu.kz7 Ljava/util/Random;
      // 0c4: bipush 4
      // 0c5: invokespecial uwf.<init> (Ljava/util/Random;I)V
      // 0c8: putfield eiu.s9t Luwf;
      // 0cb: aload 0
      // 0cc: new b_x
      // 0cf: dup
      // 0d0: aload 0
      // 0d1: getfield eiu.kz7 Ljava/util/Random;
      // 0d4: bipush 10
      // 0d6: invokespecial b_x.<init> (Ljava/util/Random;I)V
      // 0d9: putfield eiu.gem Lb_x;
      // 0dc: aload 0
      // 0dd: new b_x
      // 0e0: dup
      // 0e1: aload 0
      // 0e2: getfield eiu.kz7 Ljava/util/Random;
      // 0e5: bipush 16
      // 0e7: invokespecial b_x.<init> (Ljava/util/Random;I)V
      // 0ea: putfield eiu.ikb Lb_x;
      // 0ed: aload 0
      // 0ee: new b_x
      // 0f1: dup
      // 0f2: aload 0
      // 0f3: getfield eiu.kz7 Ljava/util/Random;
      // 0f6: bipush 8
      // 0f8: invokespecial b_x.<init> (Ljava/util/Random;I)V
      // 0fb: putfield eiu.gak Lb_x;
      // 0fe: aload 0
      // 0ff: sipush 825
      // 102: newarray 7
      // 104: putfield eiu.xje [D
      // 107: aload 0
      // 108: bipush 25
      // 10a: newarray 6
      // 10c: putfield eiu.lg0 [F
      // 10f: bipush -2
      // 111: istore 7
      // 113: iload 7
      // 115: bipush 2
      // 116: if_icmpgt 16a
      // 119: bipush -2
      // 11b: istore 8
      // 11d: iload 8
      // 11f: bipush 2
      // 120: if_icmpgt 162
      // 123: ldc 10.0
      // 125: nop
      // 126: iload 7
      // 128: iload 7
      // 12a: imul
      // 12b: iload 8
      // 12d: iload 8
      // 12f: imul
      // 130: iadd
      // 131: i2f
      // 132: ldc 0.2
      // 134: nop
      // 135: fadd
      // 136: invokestatic fe6.bug (F)F
      // 139: fdiv
      // 13a: fstore 9
      // 13c: aload 0
      // 13d: getfield eiu.lg0 [F
      // 140: iload 7
      // 142: bipush 2
      // 143: iadd
      // 144: iload 8
      // 146: bipush 2
      // 147: iadd
      // 148: bipush 5
      // 149: imul
      // 14a: iadd
      // 14b: fload 9
      // 14d: fastore
      // 14e: iinc 8 1
      // 151: iload 6
      // 153: ifne 165
      // 156: iload 6
      // 158: ifeq 11d
      // 15b: goto 162
      // 15e: invokestatic eiu.a (Loov;)Loov;
      // 161: athrow
      // 162: iinc 7 1
      // 165: iload 6
      // 167: ifeq 113
      // 16a: aload 5
      // 16c: ifnull 1a8
      // 16f: aload 0
      // 170: aload 5
      // 172: invokestatic y_h$xfc.a2n (Ljava/lang/String;)Ly_h$xfc;
      // 175: invokevirtual y_h$xfc.dnk ()Ly_h;
      // 178: putfield eiu.wo4 Ly_h;
      // 17b: aload 0
      // 17c: aload 0
      // 17d: getfield eiu.wo4 Ly_h;
      // 180: getfield y_h.jr9 Z
      // 183: ifeq 197
      // 186: goto 18d
      // 189: invokestatic eiu.a (Loov;)Loov;
      // 18c: athrow
      // 18d: getstatic ox_.ska Les2;
      // 190: goto 19a
      // 193: invokestatic eiu.a (Loov;)Loov;
      // 196: athrow
      // 197: getstatic ox_.gdz Les2;
      // 19a: putfield eiu.i4t Le0x;
      // 19d: aload 1
      // 19e: aload 0
      // 19f: getfield eiu.wo4 Ly_h;
      // 1a2: getfield y_h.zei I
      // 1a5: invokevirtual OpaquePredicate.g5c (I)V
      // 1a8: return
   }

   public void ju3(int param1, int param2, lno param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: getfield eiu.b01 Lt9d;
      // 005: invokevirtual OpaquePredicate.ql0 ()Lcdp;
      // 008: aload 0
      // 009: getfield eiu.y4o [Lgyu;
      // 00c: iload 1
      // 00d: bipush 4
      // 00e: imul
      // 00f: bipush 2
      // 010: isub
      // 011: iload 2
      // 012: bipush 4
      // 013: imul
      // 014: bipush 2
      // 015: isub
      // 016: bipush 10
      // 018: bipush 10
      // 01a: invokevirtual cdp.f8i ([Lgyu;IIII)[Lgyu;
      // 01d: putfield eiu.y4o [Lgyu;
      // 020: invokestatic OpaquePredicate.c ()I
      // 023: aload 0
      // 024: iload 1
      // 025: bipush 4
      // 026: imul
      // 027: bipush 0
      // 028: iload 2
      // 029: bipush 4
      // 02a: imul
      // 02b: invokespecial eiu.hbt (III)V
      // 02e: bipush 0
      // 02f: istore 5
      // 031: istore 4
      // 033: iload 5
      // 035: bipush 4
      // 036: if_icmpge 257
      // 039: iload 5
      // 03b: bipush 5
      // 03c: imul
      // 03d: istore 6
      // 03f: iload 5
      // 041: bipush 1
      // 042: iadd
      // 043: bipush 5
      // 044: imul
      // 045: istore 7
      // 047: bipush 0
      // 048: istore 8
      // 04a: iload 8
      // 04c: bipush 4
      // 04d: if_icmpge 24f
      // 050: iload 6
      // 052: iload 8
      // 054: iadd
      // 055: bipush 33
      // 057: imul
      // 058: istore 9
      // 05a: iload 6
      // 05c: iload 8
      // 05e: iadd
      // 05f: bipush 1
      // 060: iadd
      // 061: bipush 33
      // 063: imul
      // 064: istore 10
      // 066: iload 7
      // 068: iload 8
      // 06a: iadd
      // 06b: bipush 33
      // 06d: imul
      // 06e: istore 11
      // 070: iload 7
      // 072: iload 8
      // 074: iadd
      // 075: bipush 1
      // 076: iadd
      // 077: bipush 33
      // 079: imul
      // 07a: istore 12
      // 07c: bipush 0
      // 07d: iload 4
      // 07f: ifne 035
      // 082: istore 13
      // 084: iload 13
      // 086: bipush 32
      // 088: if_icmpge 247
      // 08b: ldc2_w 0.125
      // 08e: dstore 14
      // 090: aload 0
      // 091: getfield eiu.xje [D
      // 094: iload 9
      // 096: iload 13
      // 098: iadd
      // 099: daload
      // 09a: dstore 16
      // 09c: aload 0
      // 09d: getfield eiu.xje [D
      // 0a0: iload 10
      // 0a2: iload 13
      // 0a4: iadd
      // 0a5: daload
      // 0a6: dstore 18
      // 0a8: aload 0
      // 0a9: getfield eiu.xje [D
      // 0ac: iload 11
      // 0ae: iload 13
      // 0b0: iadd
      // 0b1: daload
      // 0b2: dstore 20
      // 0b4: aload 0
      // 0b5: getfield eiu.xje [D
      // 0b8: iload 12
      // 0ba: iload 13
      // 0bc: iadd
      // 0bd: daload
      // 0be: dstore 22
      // 0c0: aload 0
      // 0c1: getfield eiu.xje [D
      // 0c4: iload 9
      // 0c6: iload 13
      // 0c8: iadd
      // 0c9: bipush 1
      // 0ca: iadd
      // 0cb: daload
      // 0cc: dload 16
      // 0ce: dsub
      // 0cf: dload 14
      // 0d1: dmul
      // 0d2: dstore 24
      // 0d4: aload 0
      // 0d5: getfield eiu.xje [D
      // 0d8: iload 10
      // 0da: iload 13
      // 0dc: iadd
      // 0dd: bipush 1
      // 0de: iadd
      // 0df: daload
      // 0e0: dload 18
      // 0e2: dsub
      // 0e3: dload 14
      // 0e5: dmul
      // 0e6: dstore 26
      // 0e8: aload 0
      // 0e9: getfield eiu.xje [D
      // 0ec: iload 11
      // 0ee: iload 13
      // 0f0: iadd
      // 0f1: bipush 1
      // 0f2: iadd
      // 0f3: daload
      // 0f4: dload 20
      // 0f6: dsub
      // 0f7: dload 14
      // 0f9: dmul
      // 0fa: dstore 28
      // 0fc: aload 0
      // 0fd: getfield eiu.xje [D
      // 100: iload 12
      // 102: iload 13
      // 104: iadd
      // 105: bipush 1
      // 106: iadd
      // 107: daload
      // 108: dload 22
      // 10a: dsub
      // 10b: dload 14
      // 10d: dmul
      // 10e: dstore 30
      // 110: bipush 0
      // 111: iload 4
      // 113: ifne 04c
      // 116: istore 32
      // 118: iload 32
      // 11a: bipush 8
      // 11c: if_icmpge 23f
      // 11f: ldc2_w 0.25
      // 122: dstore 33
      // 124: dload 16
      // 126: dstore 35
      // 128: dload 18
      // 12a: dstore 37
      // 12c: dload 20
      // 12e: dload 16
      // 130: dsub
      // 131: dload 33
      // 133: dmul
      // 134: dstore 39
      // 136: dload 22
      // 138: dload 18
      // 13a: dsub
      // 13b: dload 33
      // 13d: dmul
      // 13e: dstore 41
      // 140: bipush 0
      // 141: iload 4
      // 143: ifne 086
      // 146: istore 43
      // 148: iload 43
      // 14a: bipush 4
      // 14b: if_icmpge 21b
      // 14e: ldc2_w 0.25
      // 151: dstore 44
      // 153: dload 37
      // 155: dload 35
      // 157: dsub
      // 158: dload 44
      // 15a: dmul
      // 15b: dstore 46
      // 15d: dload 35
      // 15f: dload 46
      // 161: dsub
      // 162: dstore 48
      // 164: bipush 0
      // 165: iload 4
      // 167: ifne 11a
      // 16a: istore 50
      // 16c: iload 50
      // 16e: bipush 4
      // 16f: if_icmpge 205
      // 172: dload 48
      // 174: dload 46
      // 176: dadd
      // 177: dup2
      // 178: dstore 48
      // 17a: dconst_0
      // 17b: dcmpl
      // 17c: iload 4
      // 17e: ifne 14a
      // 181: iload 4
      // 183: ifne 1cb
      // 186: ifle 1bc
      // 189: goto 190
      // 18c: invokestatic eiu.a (Loov;)Loov;
      // 18f: athrow
      // 190: aload 3
      // 191: iload 5
      // 193: bipush 4
      // 194: imul
      // 195: iload 43
      // 197: iadd
      // 198: iload 13
      // 19a: bipush 8
      // 19c: imul
      // 19d: iload 32
      // 19f: iadd
      // 1a0: iload 8
      // 1a2: bipush 4
      // 1a3: imul
      // 1a4: iload 50
      // 1a6: iadd
      // 1a7: getstatic ox_.pu8 Le0x;
      // 1aa: invokevirtual e0x.l4i ()Lzfz;
      // 1ad: invokevirtual lno.x6f (IIILzfz;)V
      // 1b0: iload 4
      // 1b2: ifeq 1fd
      // 1b5: goto 1bc
      // 1b8: invokestatic eiu.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: iload 13
      // 1be: bipush 8
      // 1c0: imul
      // 1c1: iload 32
      // 1c3: iadd
      // 1c4: goto 1cb
      // 1c7: invokestatic eiu.a (Loov;)Loov;
      // 1ca: athrow
      // 1cb: aload 0
      // 1cc: getfield eiu.wo4 Ly_h;
      // 1cf: getfield y_h.zei I
      // 1d2: if_icmpge 1fd
      // 1d5: aload 3
      // 1d6: iload 5
      // 1d8: bipush 4
      // 1d9: imul
      // 1da: iload 43
      // 1dc: iadd
      // 1dd: iload 13
      // 1df: bipush 8
      // 1e1: imul
      // 1e2: iload 32
      // 1e4: iadd
      // 1e5: iload 8
      // 1e7: bipush 4
      // 1e8: imul
      // 1e9: iload 50
      // 1eb: iadd
      // 1ec: aload 0
      // 1ed: getfield eiu.i4t Le0x;
      // 1f0: invokevirtual e0x.l4i ()Lzfz;
      // 1f3: invokevirtual lno.x6f (IIILzfz;)V
      // 1f6: goto 1fd
      // 1f9: invokestatic eiu.a (Loov;)Loov;
      // 1fc: athrow
      // 1fd: iinc 50 1
      // 200: iload 4
      // 202: ifeq 16c
      // 205: dload 35
      // 207: dload 39
      // 209: dadd
      // 20a: dstore 35
      // 20c: dload 37
      // 20e: dload 41
      // 210: dadd
      // 211: dstore 37
      // 213: iinc 43 1
      // 216: iload 4
      // 218: ifeq 148
      // 21b: dload 16
      // 21d: dload 24
      // 21f: dadd
      // 220: dstore 16
      // 222: dload 18
      // 224: dload 26
      // 226: dadd
      // 227: dstore 18
      // 229: dload 20
      // 22b: dload 28
      // 22d: dadd
      // 22e: dstore 20
      // 230: dload 22
      // 232: dload 30
      // 234: dadd
      // 235: dstore 22
      // 237: iinc 32 1
      // 23a: iload 4
      // 23c: ifeq 118
      // 23f: iinc 13 1
      // 242: iload 4
      // 244: ifeq 084
      // 247: iinc 8 1
      // 24a: iload 4
      // 24c: ifeq 04a
      // 24f: iinc 5 1
      // 252: iload 4
      // 254: ifeq 033
      // 257: return
   }

   public void vgd(int var1, int var2, lno var3, gyu[] var4) {
      double var6 = 0.03125;
      int var10000 = OpaquePredicate.b();
      this.ego = this.s9t.w76(this.ego, (double)(var1 * 16), (double)(var2 * 16), 16, 16, var6 * 2.0, var6 * 2.0, 1.0);
      int var8 = 0;
      int var5 = var10000;

      while (var8 < 16) {
         int var9 = 0;

         while (true) {
            if (var9 < 16) {
               gyu var10 = var4[var9 + var8 * 16];

               try {
                  var10.rci(this.b01, this.kz7, var3, var1 * 16 + var8, var2 * 16 + var9, this.ego[var9 + var8 * 16]);
                  var9++;
                  if (var5 == 0) {
                     break;
                  }

                  if (var5 != 0) {
                     continue;
                  }
               } catch (oov var11) {
                  throw a(var11);
               }
            }

            var8++;
            break;
         }

         if (var5 == 0) {
            break;
         }
      }
   }

   @Override
   public tts et2(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield eiu.kz7 Ljava/util/Random;
      // 004: iload 1
      // 005: i2l
      // 006: ldc2_w 341873128712
      // 009: lmul
      // 00a: iload 2
      // 00b: i2l
      // 00c: ldc2_w 132897987541
      // 00f: lmul
      // 010: ladd
      // 011: invokevirtual java/util/Random.setSeed (J)V
      // 014: invokestatic OpaquePredicate.c ()I
      // 017: new lno
      // 01a: dup
      // 01b: invokespecial lno.<init> ()V
      // 01e: astore 4
      // 020: istore 3
      // 021: aload 0
      // 022: iload 1
      // 023: iload 2
      // 024: aload 4
      // 026: invokevirtual eiu.ju3 (IILlno;)V
      // 029: aload 0
      // 02a: aload 0
      // 02b: getfield eiu.b01 Lt9d;
      // 02e: invokevirtual OpaquePredicate.ql0 ()Lcdp;
      // 031: aload 0
      // 032: getfield eiu.y4o [Lgyu;
      // 035: iload 1
      // 036: bipush 16
      // 038: imul
      // 039: iload 2
      // 03a: bipush 16
      // 03c: imul
      // 03d: bipush 16
      // 03f: bipush 16
      // 041: invokevirtual cdp.twf ([Lgyu;IIII)[Lgyu;
      // 044: putfield eiu.y4o [Lgyu;
      // 047: aload 0
      // 048: iload 1
      // 049: iload 2
      // 04a: aload 4
      // 04c: aload 0
      // 04d: getfield eiu.y4o [Lgyu;
      // 050: invokevirtual eiu.vgd (IILlno;[Lgyu;)V
      // 053: aload 0
      // 054: getfield eiu.wo4 Ly_h;
      // 057: getfield y_h.wgt Z
      // 05a: iload 3
      // 05b: ifne 086
      // 05e: ifeq 07f
      // 061: goto 068
      // 064: invokestatic eiu.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 0
      // 069: getfield eiu.yqm Luk2;
      // 06c: aload 0
      // 06d: aload 0
      // 06e: getfield eiu.b01 Lt9d;
      // 071: iload 1
      // 072: iload 2
      // 073: aload 4
      // 075: invokevirtual uk2.vyh (Lg6k;Lt9d;IILlno;)V
      // 078: goto 07f
      // 07b: invokestatic eiu.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 0
      // 080: getfield eiu.wo4 Ly_h;
      // 083: getfield y_h.fji Z
      // 086: iload 3
      // 087: ifne 0b2
      // 08a: ifeq 0ab
      // 08d: goto 094
      // 090: invokestatic eiu.a (Loov;)Loov;
      // 093: athrow
      // 094: aload 0
      // 095: getfield eiu.w8s Luk2;
      // 098: aload 0
      // 099: aload 0
      // 09a: getfield eiu.b01 Lt9d;
      // 09d: iload 1
      // 09e: iload 2
      // 09f: aload 4
      // 0a1: invokevirtual uk2.vyh (Lg6k;Lt9d;IILlno;)V
      // 0a4: goto 0ab
      // 0a7: invokestatic eiu.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: getfield eiu.wo4 Ly_h;
      // 0af: getfield y_h.q1e Z
      // 0b2: iload 3
      // 0b3: ifne 0f7
      // 0b6: ifeq 0f0
      // 0b9: goto 0c0
      // 0bc: invokestatic eiu.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield eiu.xjr Z
      // 0c4: iload 3
      // 0c5: ifne 0f7
      // 0c8: goto 0cf
      // 0cb: invokestatic eiu.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: ifeq 0f0
      // 0d2: goto 0d9
      // 0d5: invokestatic eiu.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: getfield eiu.hj_ Lxi0;
      // 0dd: aload 0
      // 0de: aload 0
      // 0df: getfield eiu.b01 Lt9d;
      // 0e2: iload 1
      // 0e3: iload 2
      // 0e4: aload 4
      // 0e6: invokevirtual xi0.vyh (Lg6k;Lt9d;IILlno;)V
      // 0e9: goto 0f0
      // 0ec: invokestatic eiu.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: getfield eiu.wo4 Ly_h;
      // 0f4: getfield y_h.cc4 Z
      // 0f7: iload 3
      // 0f8: ifne 13c
      // 0fb: ifeq 135
      // 0fe: goto 105
      // 101: invokestatic eiu.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 0
      // 106: getfield eiu.xjr Z
      // 109: iload 3
      // 10a: ifne 13c
      // 10d: goto 114
      // 110: invokestatic eiu.a (Loov;)Loov;
      // 113: athrow
      // 114: ifeq 135
      // 117: goto 11e
      // 11a: invokestatic eiu.a (Loov;)Loov;
      // 11d: athrow
      // 11e: aload 0
      // 11f: getfield eiu.s9l Lnet/minecraft/world/gen/structure/MapGenVillage;
      // 122: aload 0
      // 123: aload 0
      // 124: getfield eiu.b01 Lt9d;
      // 127: iload 1
      // 128: iload 2
      // 129: aload 4
      // 12b: invokevirtual net/minecraft/world/gen/structure/MapGenVillage.vyh (Lg6k;Lt9d;IILlno;)V
      // 12e: goto 135
      // 131: invokestatic eiu.a (Loov;)Loov;
      // 134: athrow
      // 135: aload 0
      // 136: getfield eiu.wo4 Ly_h;
      // 139: getfield y_h.x3e Z
      // 13c: iload 3
      // 13d: ifne 181
      // 140: ifeq 17a
      // 143: goto 14a
      // 146: invokestatic eiu.a (Loov;)Loov;
      // 149: athrow
      // 14a: aload 0
      // 14b: getfield eiu.xjr Z
      // 14e: iload 3
      // 14f: ifne 181
      // 152: goto 159
      // 155: invokestatic eiu.a (Loov;)Loov;
      // 158: athrow
      // 159: ifeq 17a
      // 15c: goto 163
      // 15f: invokestatic eiu.a (Loov;)Loov;
      // 162: athrow
      // 163: aload 0
      // 164: getfield eiu.a7k Lnet/minecraft/world/gen/structure/MapGenStronghold;
      // 167: aload 0
      // 168: aload 0
      // 169: getfield eiu.b01 Lt9d;
      // 16c: iload 1
      // 16d: iload 2
      // 16e: aload 4
      // 170: invokevirtual net/minecraft/world/gen/structure/MapGenStronghold.vyh (Lg6k;Lt9d;IILlno;)V
      // 173: goto 17a
      // 176: invokestatic eiu.a (Loov;)Loov;
      // 179: athrow
      // 17a: aload 0
      // 17b: getfield eiu.wo4 Ly_h;
      // 17e: getfield y_h._27 Z
      // 181: iload 3
      // 182: ifne 1c6
      // 185: ifeq 1bf
      // 188: goto 18f
      // 18b: invokestatic eiu.a (Loov;)Loov;
      // 18e: athrow
      // 18f: aload 0
      // 190: getfield eiu.xjr Z
      // 193: iload 3
      // 194: ifne 1c6
      // 197: goto 19e
      // 19a: invokestatic eiu.a (Loov;)Loov;
      // 19d: athrow
      // 19e: ifeq 1bf
      // 1a1: goto 1a8
      // 1a4: invokestatic eiu.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: getfield eiu.h02 Lnet/minecraft/world/gen/structure/MapGenScatteredFeature;
      // 1ac: aload 0
      // 1ad: aload 0
      // 1ae: getfield eiu.b01 Lt9d;
      // 1b1: iload 1
      // 1b2: iload 2
      // 1b3: aload 4
      // 1b5: invokevirtual net/minecraft/world/gen/structure/MapGenScatteredFeature.vyh (Lg6k;Lt9d;IILlno;)V
      // 1b8: goto 1bf
      // 1bb: invokestatic eiu.a (Loov;)Loov;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: getfield eiu.wo4 Ly_h;
      // 1c3: getfield y_h.s3x Z
      // 1c6: iload 3
      // 1c7: ifne 1ea
      // 1ca: ifeq 1fd
      // 1cd: goto 1d4
      // 1d0: invokestatic eiu.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: aload 0
      // 1d5: iload 3
      // 1d6: ifne 1ee
      // 1d9: goto 1e0
      // 1dc: invokestatic eiu.a (Loov;)Loov;
      // 1df: athrow
      // 1e0: getfield eiu.xjr Z
      // 1e3: goto 1ea
      // 1e6: invokestatic eiu.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: ifeq 1fd
      // 1ed: aload 0
      // 1ee: getfield eiu.lq4 Lnet/minecraft/world/gen/structure/StructureOceanMonument;
      // 1f1: aload 0
      // 1f2: aload 0
      // 1f3: getfield eiu.b01 Lt9d;
      // 1f6: iload 1
      // 1f7: iload 2
      // 1f8: aload 4
      // 1fa: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonument.vyh (Lg6k;Lt9d;IILlno;)V
      // 1fd: new tts
      // 200: dup
      // 201: aload 0
      // 202: getfield eiu.b01 Lt9d;
      // 205: aload 4
      // 207: iload 1
      // 208: iload 2
      // 209: invokespecial tts.<init> (Lt9d;Llno;II)V
      // 20c: astore 5
      // 20e: aload 5
      // 210: invokevirtual tts.xtk ()[B
      // 213: astore 6
      // 215: bipush 0
      // 216: istore 7
      // 218: iload 7
      // 21a: aload 6
      // 21c: arraylength
      // 21d: if_icmpge 242
      // 220: aload 6
      // 222: iload 7
      // 224: aload 0
      // 225: getfield eiu.y4o [Lgyu;
      // 228: iload 7
      // 22a: aaload
      // 22b: getfield gyu.mu9 I
      // 22e: i2b
      // 22f: bastore
      // 230: iinc 7 1
      // 233: iload 3
      // 234: ifne 247
      // 237: iload 3
      // 238: ifeq 218
      // 23b: goto 242
      // 23e: invokestatic eiu.a (Loov;)Loov;
      // 241: athrow
      // 242: aload 5
      // 244: invokevirtual tts.vm4 ()V
      // 247: aload 5
      // 249: areturn
   }

   private void hbt(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: getfield eiu.ikb Lb_x;
      // 005: aload 0
      // 006: getfield eiu.krp [D
      // 009: iload 1
      // 00a: iload 3
      // 00b: bipush 5
      // 00c: bipush 5
      // 00d: aload 0
      // 00e: getfield eiu.wo4 Ly_h;
      // 011: getfield y_h.h8s F
      // 014: f2d
      // 015: aload 0
      // 016: getfield eiu.wo4 Ly_h;
      // 019: getfield y_h.nef F
      // 01c: f2d
      // 01d: aload 0
      // 01e: getfield eiu.wo4 Ly_h;
      // 021: getfield y_h.cvl F
      // 024: f2d
      // 025: invokevirtual b_x.svg ([DIIIIDDD)[D
      // 028: putfield eiu.krp [D
      // 02b: aload 0
      // 02c: getfield eiu.wo4 Ly_h;
      // 02f: getfield y_h.ls8 F
      // 032: fstore 5
      // 034: aload 0
      // 035: getfield eiu.wo4 Ly_h;
      // 038: getfield y_h.hxu F
      // 03b: fstore 6
      // 03d: aload 0
      // 03e: aload 0
      // 03f: getfield eiu.cm_ Lb_x;
      // 042: aload 0
      // 043: getfield eiu.fgk [D
      // 046: iload 1
      // 047: iload 2
      // 048: iload 3
      // 049: bipush 5
      // 04a: bipush 33
      // 04c: bipush 5
      // 04d: fload 5
      // 04f: aload 0
      // 050: getfield eiu.wo4 Ly_h;
      // 053: getfield y_h.pr7 F
      // 056: fdiv
      // 057: f2d
      // 058: fload 6
      // 05a: aload 0
      // 05b: getfield eiu.wo4 Ly_h;
      // 05e: getfield y_h.tkz F
      // 061: fdiv
      // 062: f2d
      // 063: fload 5
      // 065: aload 0
      // 066: getfield eiu.wo4 Ly_h;
      // 069: getfield y_h.tzr F
      // 06c: fdiv
      // 06d: f2d
      // 06e: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 071: putfield eiu.fgk [D
      // 074: aload 0
      // 075: aload 0
      // 076: getfield eiu.f1g Lb_x;
      // 079: aload 0
      // 07a: getfield eiu.y9v [D
      // 07d: iload 1
      // 07e: iload 2
      // 07f: iload 3
      // 080: bipush 5
      // 081: bipush 33
      // 083: bipush 5
      // 084: fload 5
      // 086: f2d
      // 087: fload 6
      // 089: f2d
      // 08a: fload 5
      // 08c: f2d
      // 08d: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 090: putfield eiu.y9v [D
      // 093: invokestatic OpaquePredicate.b ()I
      // 096: aload 0
      // 097: aload 0
      // 098: getfield eiu.vai Lb_x;
      // 09b: aload 0
      // 09c: getfield eiu.fzc [D
      // 09f: iload 1
      // 0a0: iload 2
      // 0a1: iload 3
      // 0a2: bipush 5
      // 0a3: bipush 33
      // 0a5: bipush 5
      // 0a6: fload 5
      // 0a8: f2d
      // 0a9: fload 6
      // 0ab: f2d
      // 0ac: fload 5
      // 0ae: f2d
      // 0af: invokevirtual b_x.w4w ([DIIIIIIDDD)[D
      // 0b2: putfield eiu.fzc [D
      // 0b5: bipush 0
      // 0b6: istore 3
      // 0b7: bipush 0
      // 0b8: istore 1
      // 0b9: bipush 0
      // 0ba: istore 7
      // 0bc: bipush 0
      // 0bd: istore 8
      // 0bf: istore 4
      // 0c1: bipush 0
      // 0c2: istore 9
      // 0c4: iload 9
      // 0c6: bipush 5
      // 0c7: if_icmpge 3f0
      // 0ca: bipush 0
      // 0cb: istore 10
      // 0cd: iload 10
      // 0cf: bipush 5
      // 0d0: if_icmpge 3e8
      // 0d3: fconst_0
      // 0d4: fstore 11
      // 0d6: fconst_0
      // 0d7: fstore 12
      // 0d9: fconst_0
      // 0da: fstore 13
      // 0dc: bipush 2
      // 0dd: istore 14
      // 0df: aload 0
      // 0e0: getfield eiu.y4o [Lgyu;
      // 0e3: iload 9
      // 0e5: bipush 2
      // 0e6: iadd
      // 0e7: iload 10
      // 0e9: bipush 2
      // 0ea: iadd
      // 0eb: bipush 10
      // 0ed: imul
      // 0ee: iadd
      // 0ef: aaload
      // 0f0: astore 15
      // 0f2: iload 14
      // 0f4: ineg
      // 0f5: iload 4
      // 0f7: ifeq 0c6
      // 0fa: istore 16
      // 0fc: iload 16
      // 0fe: iload 14
      // 100: if_icmpgt 20b
      // 103: iload 14
      // 105: ineg
      // 106: iload 4
      // 108: ifeq 0cf
      // 10b: istore 17
      // 10d: iload 17
      // 10f: iload 14
      // 111: if_icmpgt 203
      // 114: aload 0
      // 115: getfield eiu.y4o [Lgyu;
      // 118: iload 9
      // 11a: iload 16
      // 11c: iadd
      // 11d: bipush 2
      // 11e: iadd
      // 11f: iload 10
      // 121: iload 17
      // 123: iadd
      // 124: bipush 2
      // 125: iadd
      // 126: bipush 10
      // 128: imul
      // 129: iadd
      // 12a: aaload
      // 12b: astore 18
      // 12d: aload 0
      // 12e: getfield eiu.wo4 Ly_h;
      // 131: getfield y_h.jvi F
      // 134: aload 18
      // 136: getfield gyu.f6x F
      // 139: aload 0
      // 13a: getfield eiu.wo4 Ly_h;
      // 13d: getfield y_h.v3k F
      // 140: fmul
      // 141: fadd
      // 142: fstore 19
      // 144: aload 0
      // 145: getfield eiu.wo4 Ly_h;
      // 148: getfield y_h.nl1 F
      // 14b: aload 18
      // 14d: getfield gyu.yeh F
      // 150: aload 0
      // 151: getfield eiu.wo4 Ly_h;
      // 154: getfield y_h.ef8 F
      // 157: fmul
      // 158: fadd
      // 159: fstore 20
      // 15b: aload 0
      // 15c: iload 4
      // 15e: ifeq 234
      // 161: iload 4
      // 163: ifeq 1aa
      // 166: goto 16d
      // 169: invokestatic eiu.a (Loov;)Loov;
      // 16c: athrow
      // 16d: getfield eiu.jl5 Lgxq;
      // 170: getstatic gxq._12 Lgxq;
      // 173: if_acmpne 1a9
      // 176: goto 17d
      // 179: invokestatic eiu.a (Loov;)Loov;
      // 17c: athrow
      // 17d: fload 19
      // 17f: fconst_0
      // 180: iload 4
      // 182: ifeq 1bd
      // 185: goto 18c
      // 188: invokestatic eiu.a (Loov;)Loov;
      // 18b: athrow
      // 18c: fcmpl
      // 18d: ifle 1a9
      // 190: goto 197
      // 193: invokestatic eiu.a (Loov;)Loov;
      // 196: athrow
      // 197: fconst_1
      // 198: fload 19
      // 19a: fconst_2
      // 19b: fmul
      // 19c: fadd
      // 19d: fstore 19
      // 19f: fconst_1
      // 1a0: fload 20
      // 1a2: ldc 4.0
      // 1a4: nop
      // 1a5: fmul
      // 1a6: fadd
      // 1a7: fstore 20
      // 1a9: aload 0
      // 1aa: getfield eiu.lg0 [F
      // 1ad: iload 16
      // 1af: bipush 2
      // 1b0: iadd
      // 1b1: iload 17
      // 1b3: bipush 2
      // 1b4: iadd
      // 1b5: bipush 5
      // 1b6: imul
      // 1b7: iadd
      // 1b8: faload
      // 1b9: fload 19
      // 1bb: fconst_2
      // 1bc: fadd
      // 1bd: fdiv
      // 1be: fstore 21
      // 1c0: aload 18
      // 1c2: getfield gyu.f6x F
      // 1c5: aload 15
      // 1c7: getfield gyu.f6x F
      // 1ca: iload 4
      // 1cc: ifeq 1f8
      // 1cf: fcmpl
      // 1d0: ifle 1e0
      // 1d3: goto 1da
      // 1d6: invokestatic eiu.a (Loov;)Loov;
      // 1d9: athrow
      // 1da: fload 21
      // 1dc: fconst_2
      // 1dd: fdiv
      // 1de: fstore 21
      // 1e0: fload 11
      // 1e2: fload 20
      // 1e4: fload 21
      // 1e6: fmul
      // 1e7: fadd
      // 1e8: fstore 11
      // 1ea: fload 12
      // 1ec: fload 19
      // 1ee: fload 21
      // 1f0: fmul
      // 1f1: fadd
      // 1f2: fstore 12
      // 1f4: fload 13
      // 1f6: fload 21
      // 1f8: fadd
      // 1f9: fstore 13
      // 1fb: iinc 17 1
      // 1fe: iload 4
      // 200: ifne 10d
      // 203: iinc 16 1
      // 206: iload 4
      // 208: ifne 0fc
      // 20b: fload 11
      // 20d: fload 13
      // 20f: fdiv
      // 210: fstore 11
      // 212: fload 12
      // 214: fload 13
      // 216: fdiv
      // 217: fstore 12
      // 219: fload 11
      // 21b: ldc 0.9
      // 21d: nop
      // 21e: fmul
      // 21f: ldc 0.1
      // 221: nop
      // 222: fadd
      // 223: fstore 11
      // 225: fload 12
      // 227: ldc 4.0
      // 229: nop
      // 22a: fmul
      // 22b: fconst_1
      // 22c: fsub
      // 22d: ldc 8.0
      // 22f: nop
      // 230: fdiv
      // 231: fstore 12
      // 233: aload 0
      // 234: getfield eiu.krp [D
      // 237: iload 8
      // 239: daload
      // 23a: ldc2_w 8000.0
      // 23d: ddiv
      // 23e: dstore 16
      // 240: dload 16
      // 242: dconst_0
      // 243: dcmpg
      // 244: iload 4
      // 246: ifeq 26c
      // 249: ifge 25c
      // 24c: goto 253
      // 24f: invokestatic eiu.a (Loov;)Loov;
      // 252: athrow
      // 253: dload 16
      // 255: dneg
      // 256: ldc2_w 0.3
      // 259: dmul
      // 25a: dstore 16
      // 25c: dload 16
      // 25e: ldc2_w 3.0
      // 261: dmul
      // 262: ldc2_w 2.0
      // 265: dsub
      // 266: dstore 16
      // 268: dload 16
      // 26a: dconst_0
      // 26b: dcmpg
      // 26c: iload 4
      // 26e: ifeq 2c9
      // 271: ifge 2b2
      // 274: goto 27b
      // 277: invokestatic eiu.a (Loov;)Loov;
      // 27a: athrow
      // 27b: dload 16
      // 27d: ldc2_w 2.0
      // 280: ddiv
      // 281: dstore 16
      // 283: dload 16
      // 285: ldc2_w -1.0
      // 288: iload 4
      // 28a: ifeq 2aa
      // 28d: dcmpg
      // 28e: ifge 29d
      // 291: goto 298
      // 294: invokestatic eiu.a (Loov;)Loov;
      // 297: athrow
      // 298: ldc2_w -1.0
      // 29b: dstore 16
      // 29d: dload 16
      // 29f: ldc2_w 1.4
      // 2a2: ddiv
      // 2a3: dstore 16
      // 2a5: dload 16
      // 2a7: ldc2_w 2.0
      // 2aa: ddiv
      // 2ab: dstore 16
      // 2ad: iload 4
      // 2af: ifne 2d7
      // 2b2: dload 16
      // 2b4: dconst_1
      // 2b5: iload 4
      // 2b7: ifeq 2d4
      // 2ba: goto 2c1
      // 2bd: invokestatic eiu.a (Loov;)Loov;
      // 2c0: athrow
      // 2c1: dcmpl
      // 2c2: goto 2c9
      // 2c5: invokestatic eiu.a (Loov;)Loov;
      // 2c8: athrow
      // 2c9: ifle 2cf
      // 2cc: dconst_1
      // 2cd: dstore 16
      // 2cf: dload 16
      // 2d1: ldc2_w 8.0
      // 2d4: ddiv
      // 2d5: dstore 16
      // 2d7: iinc 8 1
      // 2da: fload 12
      // 2dc: f2d
      // 2dd: dstore 18
      // 2df: fload 11
      // 2e1: f2d
      // 2e2: dstore 20
      // 2e4: dload 18
      // 2e6: dload 16
      // 2e8: ldc2_w 0.2
      // 2eb: dmul
      // 2ec: dadd
      // 2ed: dstore 18
      // 2ef: dload 18
      // 2f1: aload 0
      // 2f2: getfield eiu.wo4 Ly_h;
      // 2f5: getfield y_h.fy6 F
      // 2f8: f2d
      // 2f9: dmul
      // 2fa: ldc2_w 8.0
      // 2fd: ddiv
      // 2fe: dstore 18
      // 300: aload 0
      // 301: getfield eiu.wo4 Ly_h;
      // 304: getfield y_h.fy6 F
      // 307: f2d
      // 308: dload 18
      // 30a: ldc2_w 4.0
      // 30d: dmul
      // 30e: dadd
      // 30f: dstore 22
      // 311: bipush 0
      // 312: istore 24
      // 314: iload 24
      // 316: bipush 33
      // 318: if_icmpge 3e0
      // 31b: iload 24
      // 31d: i2d
      // 31e: dload 22
      // 320: dsub
      // 321: aload 0
      // 322: getfield eiu.wo4 Ly_h;
      // 325: getfield y_h.gby F
      // 328: f2d
      // 329: dmul
      // 32a: ldc2_w 128.0
      // 32d: dmul
      // 32e: ldc2_w 256.0
      // 331: ddiv
      // 332: dload 20
      // 334: ddiv
      // 335: dstore 25
      // 337: dload 25
      // 339: dconst_0
      // 33a: iload 4
      // 33c: ifeq 366
      // 33f: dcmpg
      // 340: iload 4
      // 342: ifeq 0cf
      // 345: goto 34c
      // 348: invokestatic eiu.a (Loov;)Loov;
      // 34b: athrow
      // 34c: ifge 357
      // 34f: dload 25
      // 351: ldc2_w 4.0
      // 354: dmul
      // 355: dstore 25
      // 357: aload 0
      // 358: getfield eiu.y9v [D
      // 35b: iload 7
      // 35d: daload
      // 35e: aload 0
      // 35f: getfield eiu.wo4 Ly_h;
      // 362: getfield y_h.aiq F
      // 365: f2d
      // 366: ddiv
      // 367: dstore 27
      // 369: aload 0
      // 36a: getfield eiu.fzc [D
      // 36d: iload 7
      // 36f: daload
      // 370: aload 0
      // 371: getfield eiu.wo4 Ly_h;
      // 374: getfield y_h.uz7 F
      // 377: f2d
      // 378: ddiv
      // 379: dstore 29
      // 37b: aload 0
      // 37c: getfield eiu.fgk [D
      // 37f: iload 7
      // 381: daload
      // 382: ldc2_w 10.0
      // 385: ddiv
      // 386: dconst_1
      // 387: dadd
      // 388: ldc2_w 2.0
      // 38b: ddiv
      // 38c: dstore 31
      // 38e: dload 27
      // 390: dload 29
      // 392: dload 31
      // 394: invokestatic fe6.ldq (DDD)D
      // 397: dload 25
      // 399: dsub
      // 39a: dstore 33
      // 39c: iload 4
      // 39e: ifeq 3db
      // 3a1: iload 24
      // 3a3: bipush 29
      // 3a5: if_icmple 3cc
      // 3a8: goto 3af
      // 3ab: invokestatic eiu.a (Loov;)Loov;
      // 3ae: athrow
      // 3af: iload 24
      // 3b1: bipush 29
      // 3b3: isub
      // 3b4: i2f
      // 3b5: ldc 3.0
      // 3b7: nop
      // 3b8: fdiv
      // 3b9: f2d
      // 3ba: dstore 35
      // 3bc: dload 33
      // 3be: dconst_1
      // 3bf: dload 35
      // 3c1: dsub
      // 3c2: dmul
      // 3c3: ldc2_w -10.0
      // 3c6: dload 35
      // 3c8: dmul
      // 3c9: dadd
      // 3ca: dstore 33
      // 3cc: aload 0
      // 3cd: getfield eiu.xje [D
      // 3d0: iload 7
      // 3d2: dload 33
      // 3d4: dastore
      // 3d5: iinc 7 1
      // 3d8: iinc 24 1
      // 3db: iload 4
      // 3dd: ifne 314
      // 3e0: iinc 10 1
      // 3e3: iload 4
      // 3e5: ifne 0cd
      // 3e8: iinc 9 1
      // 3eb: iload 4
      // 3ed: ifne 0c4
      // 3f0: return
   }

   @Override
   public boolean pnt(int var1, int var2) {
      return true;
   }

   @Override
   public void fbq(g6k param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 1
      // 001: putstatic d26.trk Z
      // 004: iload 2
      // 005: bipush 16
      // 007: imul
      // 008: istore 5
      // 00a: invokestatic OpaquePredicate.b ()I
      // 00d: iload 3
      // 00e: bipush 16
      // 010: imul
      // 011: istore 6
      // 013: new mew
      // 016: dup
      // 017: iload 5
      // 019: bipush 0
      // 01a: iload 6
      // 01c: invokespecial mew.<init> (III)V
      // 01f: astore 7
      // 021: aload 0
      // 022: getfield eiu.b01 Lt9d;
      // 025: aload 7
      // 027: bipush 16
      // 029: bipush 0
      // 02a: bipush 16
      // 02c: invokevirtual mew.ec4 (III)Lmew;
      // 02f: invokevirtual OpaquePredicate.getBiomeGenForCoords (Lmew;)Lgyu;
      // 032: astore 8
      // 034: aload 0
      // 035: getfield eiu.kz7 Ljava/util/Random;
      // 038: aload 0
      // 039: getfield eiu.b01 Lt9d;
      // 03c: invokevirtual OpaquePredicate.x2p ()J
      // 03f: invokevirtual java/util/Random.setSeed (J)V
      // 042: istore 4
      // 044: aload 0
      // 045: getfield eiu.kz7 Ljava/util/Random;
      // 048: invokevirtual java/util/Random.nextLong ()J
      // 04b: ldc2_w 2
      // 04e: ldiv
      // 04f: ldc2_w 2
      // 052: lmul
      // 053: lconst_1
      // 054: ladd
      // 055: lstore 9
      // 057: aload 0
      // 058: getfield eiu.kz7 Ljava/util/Random;
      // 05b: invokevirtual java/util/Random.nextLong ()J
      // 05e: ldc2_w 2
      // 061: ldiv
      // 062: ldc2_w 2
      // 065: lmul
      // 066: lconst_1
      // 067: ladd
      // 068: lstore 11
      // 06a: aload 0
      // 06b: getfield eiu.kz7 Ljava/util/Random;
      // 06e: iload 2
      // 06f: i2l
      // 070: lload 9
      // 072: lmul
      // 073: iload 3
      // 074: i2l
      // 075: lload 11
      // 077: lmul
      // 078: ladd
      // 079: aload 0
      // 07a: getfield eiu.b01 Lt9d;
      // 07d: invokevirtual OpaquePredicate.x2p ()J
      // 080: lxor
      // 081: invokevirtual java/util/Random.setSeed (J)V
      // 084: bipush 0
      // 085: istore 13
      // 087: new h2f
      // 08a: dup
      // 08b: iload 2
      // 08c: iload 3
      // 08d: invokespecial h2f.<init> (II)V
      // 090: astore 14
      // 092: aload 0
      // 093: getfield eiu.wo4 Ly_h;
      // 096: getfield y_h.q1e Z
      // 099: iload 4
      // 09b: ifeq 0e2
      // 09e: ifeq 0db
      // 0a1: goto 0a8
      // 0a4: invokestatic eiu.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: getfield eiu.xjr Z
      // 0ac: iload 4
      // 0ae: ifeq 0e2
      // 0b1: goto 0b8
      // 0b4: invokestatic eiu.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: ifeq 0db
      // 0bb: goto 0c2
      // 0be: invokestatic eiu.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: getfield eiu.hj_ Lxi0;
      // 0c6: aload 0
      // 0c7: getfield eiu.b01 Lt9d;
      // 0ca: aload 0
      // 0cb: getfield eiu.kz7 Ljava/util/Random;
      // 0ce: aload 14
      // 0d0: invokevirtual xi0.vd1 (Lt9d;Ljava/util/Random;Lh2f;)Z
      // 0d3: pop
      // 0d4: goto 0db
      // 0d7: invokestatic eiu.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: getfield eiu.wo4 Ly_h;
      // 0df: getfield y_h.cc4 Z
      // 0e2: iload 4
      // 0e4: ifeq 125
      // 0e7: ifeq 11e
      // 0ea: goto 0f1
      // 0ed: invokestatic eiu.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: getfield eiu.xjr Z
      // 0f5: iload 4
      // 0f7: ifeq 125
      // 0fa: goto 101
      // 0fd: invokestatic eiu.a (Loov;)Loov;
      // 100: athrow
      // 101: ifeq 11e
      // 104: goto 10b
      // 107: invokestatic eiu.a (Loov;)Loov;
      // 10a: athrow
      // 10b: aload 0
      // 10c: getfield eiu.s9l Lnet/minecraft/world/gen/structure/MapGenVillage;
      // 10f: aload 0
      // 110: getfield eiu.b01 Lt9d;
      // 113: aload 0
      // 114: getfield eiu.kz7 Ljava/util/Random;
      // 117: aload 14
      // 119: invokevirtual net/minecraft/world/gen/structure/MapGenVillage.vd1 (Lt9d;Ljava/util/Random;Lh2f;)Z
      // 11c: istore 13
      // 11e: aload 0
      // 11f: getfield eiu.wo4 Ly_h;
      // 122: getfield y_h.x3e Z
      // 125: iload 4
      // 127: ifeq 16e
      // 12a: ifeq 167
      // 12d: goto 134
      // 130: invokestatic eiu.a (Loov;)Loov;
      // 133: athrow
      // 134: aload 0
      // 135: getfield eiu.xjr Z
      // 138: iload 4
      // 13a: ifeq 16e
      // 13d: goto 144
      // 140: invokestatic eiu.a (Loov;)Loov;
      // 143: athrow
      // 144: ifeq 167
      // 147: goto 14e
      // 14a: invokestatic eiu.a (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 0
      // 14f: getfield eiu.a7k Lnet/minecraft/world/gen/structure/MapGenStronghold;
      // 152: aload 0
      // 153: getfield eiu.b01 Lt9d;
      // 156: aload 0
      // 157: getfield eiu.kz7 Ljava/util/Random;
      // 15a: aload 14
      // 15c: invokevirtual net/minecraft/world/gen/structure/MapGenStronghold.vd1 (Lt9d;Ljava/util/Random;Lh2f;)Z
      // 15f: pop
      // 160: goto 167
      // 163: invokestatic eiu.a (Loov;)Loov;
      // 166: athrow
      // 167: aload 0
      // 168: getfield eiu.wo4 Ly_h;
      // 16b: getfield y_h._27 Z
      // 16e: iload 4
      // 170: ifeq 1b7
      // 173: ifeq 1b0
      // 176: goto 17d
      // 179: invokestatic eiu.a (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 0
      // 17e: getfield eiu.xjr Z
      // 181: iload 4
      // 183: ifeq 1b7
      // 186: goto 18d
      // 189: invokestatic eiu.a (Loov;)Loov;
      // 18c: athrow
      // 18d: ifeq 1b0
      // 190: goto 197
      // 193: invokestatic eiu.a (Loov;)Loov;
      // 196: athrow
      // 197: aload 0
      // 198: getfield eiu.h02 Lnet/minecraft/world/gen/structure/MapGenScatteredFeature;
      // 19b: aload 0
      // 19c: getfield eiu.b01 Lt9d;
      // 19f: aload 0
      // 1a0: getfield eiu.kz7 Ljava/util/Random;
      // 1a3: aload 14
      // 1a5: invokevirtual net/minecraft/world/gen/structure/MapGenScatteredFeature.vd1 (Lt9d;Ljava/util/Random;Lh2f;)Z
      // 1a8: pop
      // 1a9: goto 1b0
      // 1ac: invokestatic eiu.a (Loov;)Loov;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: getfield eiu.wo4 Ly_h;
      // 1b4: getfield y_h.s3x Z
      // 1b7: iload 4
      // 1b9: ifeq 1d1
      // 1bc: ifeq 1f9
      // 1bf: goto 1c6
      // 1c2: invokestatic eiu.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: getfield eiu.xjr Z
      // 1ca: goto 1d1
      // 1cd: invokestatic eiu.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: iload 4
      // 1d3: ifeq 1f8
      // 1d6: ifeq 1f9
      // 1d9: goto 1e0
      // 1dc: invokestatic eiu.a (Loov;)Loov;
      // 1df: athrow
      // 1e0: aload 0
      // 1e1: getfield eiu.lq4 Lnet/minecraft/world/gen/structure/StructureOceanMonument;
      // 1e4: aload 0
      // 1e5: getfield eiu.b01 Lt9d;
      // 1e8: aload 0
      // 1e9: getfield eiu.kz7 Ljava/util/Random;
      // 1ec: aload 14
      // 1ee: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonument.vd1 (Lt9d;Ljava/util/Random;Lh2f;)Z
      // 1f1: goto 1f8
      // 1f4: invokestatic eiu.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: pop
      // 1f9: aload 8
      // 1fb: getstatic gyu._cz Lgyu;
      // 1fe: iload 4
      // 200: ifeq 219
      // 203: if_acmpeq 2be
      // 206: goto 20d
      // 209: invokestatic eiu.a (Loov;)Loov;
      // 20c: athrow
      // 20d: aload 8
      // 20f: getstatic gyu.txo Lgyu;
      // 212: goto 219
      // 215: invokestatic eiu.a (Loov;)Loov;
      // 218: athrow
      // 219: if_acmpeq 2be
      // 21c: aload 0
      // 21d: getfield eiu.wo4 Ly_h;
      // 220: getfield y_h.g5x Z
      // 223: iload 4
      // 225: ifeq 2c0
      // 228: goto 22f
      // 22b: invokestatic eiu.a (Loov;)Loov;
      // 22e: athrow
      // 22f: ifeq 2be
      // 232: goto 239
      // 235: invokestatic eiu.a (Loov;)Loov;
      // 238: athrow
      // 239: iload 13
      // 23b: iload 4
      // 23d: ifeq 2c0
      // 240: goto 247
      // 243: invokestatic eiu.a (Loov;)Loov;
      // 246: athrow
      // 247: ifne 2be
      // 24a: goto 251
      // 24d: invokestatic eiu.a (Loov;)Loov;
      // 250: athrow
      // 251: aload 0
      // 252: getfield eiu.kz7 Ljava/util/Random;
      // 255: aload 0
      // 256: getfield eiu.wo4 Ly_h;
      // 259: getfield y_h.gcv I
      // 25c: invokevirtual java/util/Random.nextInt (I)I
      // 25f: iload 4
      // 261: ifeq 2c0
      // 264: goto 26b
      // 267: invokestatic eiu.a (Loov;)Loov;
      // 26a: athrow
      // 26b: ifne 2be
      // 26e: goto 275
      // 271: invokestatic eiu.a (Loov;)Loov;
      // 274: athrow
      // 275: aload 0
      // 276: getfield eiu.kz7 Ljava/util/Random;
      // 279: bipush 16
      // 27b: invokevirtual java/util/Random.nextInt (I)I
      // 27e: bipush 8
      // 280: iadd
      // 281: istore 15
      // 283: aload 0
      // 284: getfield eiu.kz7 Ljava/util/Random;
      // 287: sipush 256
      // 28a: invokevirtual java/util/Random.nextInt (I)I
      // 28d: istore 16
      // 28f: aload 0
      // 290: getfield eiu.kz7 Ljava/util/Random;
      // 293: bipush 16
      // 295: invokevirtual java/util/Random.nextInt (I)I
      // 298: bipush 8
      // 29a: iadd
      // 29b: istore 17
      // 29d: new h3g
      // 2a0: dup
      // 2a1: getstatic ox_.gdz Les2;
      // 2a4: invokespecial h3g.<init> (Le0x;)V
      // 2a7: aload 0
      // 2a8: getfield eiu.b01 Lt9d;
      // 2ab: aload 0
      // 2ac: getfield eiu.kz7 Ljava/util/Random;
      // 2af: aload 7
      // 2b1: iload 15
      // 2b3: iload 16
      // 2b5: iload 17
      // 2b7: invokevirtual mew.ec4 (III)Lmew;
      // 2ba: invokevirtual h3g.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 2bd: pop
      // 2be: iload 13
      // 2c0: iload 4
      // 2c2: ifeq 3b3
      // 2c5: ifne 3ac
      // 2c8: goto 2cf
      // 2cb: invokestatic eiu.a (Loov;)Loov;
      // 2ce: athrow
      // 2cf: aload 0
      // 2d0: getfield eiu.kz7 Ljava/util/Random;
      // 2d3: aload 0
      // 2d4: getfield eiu.wo4 Ly_h;
      // 2d7: getfield y_h.aqa I
      // 2da: bipush 10
      // 2dc: idiv
      // 2dd: invokevirtual java/util/Random.nextInt (I)I
      // 2e0: iload 4
      // 2e2: ifeq 3b3
      // 2e5: goto 2ec
      // 2e8: invokestatic eiu.a (Loov;)Loov;
      // 2eb: athrow
      // 2ec: ifne 3ac
      // 2ef: goto 2f6
      // 2f2: invokestatic eiu.a (Loov;)Loov;
      // 2f5: athrow
      // 2f6: aload 0
      // 2f7: getfield eiu.wo4 Ly_h;
      // 2fa: getfield y_h.hwi Z
      // 2fd: iload 4
      // 2ff: ifeq 3b3
      // 302: goto 309
      // 305: invokestatic eiu.a (Loov;)Loov;
      // 308: athrow
      // 309: ifeq 3ac
      // 30c: goto 313
      // 30f: invokestatic eiu.a (Loov;)Loov;
      // 312: athrow
      // 313: aload 0
      // 314: getfield eiu.kz7 Ljava/util/Random;
      // 317: bipush 16
      // 319: invokevirtual java/util/Random.nextInt (I)I
      // 31c: bipush 8
      // 31e: iadd
      // 31f: istore 15
      // 321: aload 0
      // 322: getfield eiu.kz7 Ljava/util/Random;
      // 325: aload 0
      // 326: getfield eiu.kz7 Ljava/util/Random;
      // 329: sipush 248
      // 32c: invokevirtual java/util/Random.nextInt (I)I
      // 32f: bipush 8
      // 331: iadd
      // 332: invokevirtual java/util/Random.nextInt (I)I
      // 335: istore 16
      // 337: aload 0
      // 338: getfield eiu.kz7 Ljava/util/Random;
      // 33b: bipush 16
      // 33d: invokevirtual java/util/Random.nextInt (I)I
      // 340: bipush 8
      // 342: iadd
      // 343: istore 17
      // 345: iload 16
      // 347: iload 4
      // 349: ifeq 3ab
      // 34c: aload 0
      // 34d: getfield eiu.b01 Lt9d;
      // 350: invokevirtual OpaquePredicate._s3 ()I
      // 353: if_icmplt 384
      // 356: goto 35d
      // 359: invokestatic eiu.a (Loov;)Loov;
      // 35c: athrow
      // 35d: aload 0
      // 35e: getfield eiu.kz7 Ljava/util/Random;
      // 361: aload 0
      // 362: getfield eiu.wo4 Ly_h;
      // 365: getfield y_h.aqa I
      // 368: bipush 8
      // 36a: idiv
      // 36b: invokevirtual java/util/Random.nextInt (I)I
      // 36e: iload 4
      // 370: ifeq 3b3
      // 373: goto 37a
      // 376: invokestatic eiu.a (Loov;)Loov;
      // 379: athrow
      // 37a: ifne 3ac
      // 37d: goto 384
      // 380: invokestatic eiu.a (Loov;)Loov;
      // 383: athrow
      // 384: new h3g
      // 387: dup
      // 388: getstatic ox_.ska Les2;
      // 38b: invokespecial h3g.<init> (Le0x;)V
      // 38e: aload 0
      // 38f: getfield eiu.b01 Lt9d;
      // 392: aload 0
      // 393: getfield eiu.kz7 Ljava/util/Random;
      // 396: aload 7
      // 398: iload 15
      // 39a: iload 16
      // 39c: iload 17
      // 39e: invokevirtual mew.ec4 (III)Lmew;
      // 3a1: invokevirtual h3g.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 3a4: goto 3ab
      // 3a7: invokestatic eiu.a (Loov;)Loov;
      // 3aa: athrow
      // 3ab: pop
      // 3ac: aload 0
      // 3ad: getfield eiu.wo4 Ly_h;
      // 3b0: getfield y_h._ja Z
      // 3b3: iload 4
      // 3b5: ifeq 465
      // 3b8: ifeq 424
      // 3bb: goto 3c2
      // 3be: invokestatic eiu.a (Loov;)Loov;
      // 3c1: athrow
      // 3c2: bipush 0
      // 3c3: istore 15
      // 3c5: iload 15
      // 3c7: aload 0
      // 3c8: getfield eiu.wo4 Ly_h;
      // 3cb: getfield y_h.mws I
      // 3ce: if_icmpge 424
      // 3d1: aload 0
      // 3d2: getfield eiu.kz7 Ljava/util/Random;
      // 3d5: bipush 16
      // 3d7: invokevirtual java/util/Random.nextInt (I)I
      // 3da: bipush 8
      // 3dc: iadd
      // 3dd: istore 16
      // 3df: aload 0
      // 3e0: getfield eiu.kz7 Ljava/util/Random;
      // 3e3: sipush 256
      // 3e6: invokevirtual java/util/Random.nextInt (I)I
      // 3e9: istore 17
      // 3eb: aload 0
      // 3ec: getfield eiu.kz7 Ljava/util/Random;
      // 3ef: bipush 16
      // 3f1: invokevirtual java/util/Random.nextInt (I)I
      // 3f4: bipush 8
      // 3f6: iadd
      // 3f7: istore 18
      // 3f9: new zuh
      // 3fc: dup
      // 3fd: invokespecial zuh.<init> ()V
      // 400: aload 0
      // 401: getfield eiu.b01 Lt9d;
      // 404: aload 0
      // 405: getfield eiu.kz7 Ljava/util/Random;
      // 408: aload 7
      // 40a: iload 16
      // 40c: iload 17
      // 40e: iload 18
      // 410: invokevirtual mew.ec4 (III)Lmew;
      // 413: invokevirtual zuh.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 416: pop
      // 417: iinc 15 1
      // 41a: iload 4
      // 41c: ifeq 464
      // 41f: iload 4
      // 421: ifne 3c5
      // 424: aload 8
      // 426: aload 0
      // 427: getfield eiu.b01 Lt9d;
      // 42a: aload 0
      // 42b: getfield eiu.kz7 Ljava/util/Random;
      // 42e: new mew
      // 431: dup
      // 432: iload 5
      // 434: bipush 0
      // 435: iload 6
      // 437: invokespecial mew.<init> (III)V
      // 43a: invokevirtual gyu.u0r (Lt9d;Ljava/util/Random;Lmew;)V
      // 43d: aload 0
      // 43e: getfield eiu.b01 Lt9d;
      // 441: aload 8
      // 443: iload 5
      // 445: bipush 8
      // 447: iadd
      // 448: iload 6
      // 44a: bipush 8
      // 44c: iadd
      // 44d: bipush 16
      // 44f: bipush 16
      // 451: aload 0
      // 452: getfield eiu.kz7 Ljava/util/Random;
      // 455: invokestatic v7y.zik (Lt9d;Lgyu;IIIILjava/util/Random;)V
      // 458: aload 7
      // 45a: bipush 8
      // 45c: bipush 0
      // 45d: bipush 8
      // 45f: invokevirtual mew.ec4 (III)Lmew;
      // 462: astore 7
      // 464: bipush 0
      // 465: istore 15
      // 467: iload 15
      // 469: bipush 16
      // 46b: if_icmpge 50d
      // 46e: bipush 0
      // 46f: iload 4
      // 471: ifeq 50e
      // 474: istore 16
      // 476: iload 16
      // 478: bipush 16
      // 47a: if_icmpge 505
      // 47d: aload 0
      // 47e: getfield eiu.b01 Lt9d;
      // 481: aload 7
      // 483: iload 15
      // 485: bipush 0
      // 486: iload 16
      // 488: invokevirtual mew.ec4 (III)Lmew;
      // 48b: invokevirtual OpaquePredicate.k62 (Lmew;)Lmew;
      // 48e: astore 17
      // 490: aload 17
      // 492: invokevirtual mew.eve ()Lmew;
      // 495: astore 18
      // 497: aload 0
      // 498: getfield eiu.b01 Lt9d;
      // 49b: aload 18
      // 49d: invokevirtual OpaquePredicate.mjf (Lmew;)Z
      // 4a0: iload 4
      // 4a2: ifeq 469
      // 4a5: iload 4
      // 4a7: ifeq 4d6
      // 4aa: ifeq 4cc
      // 4ad: goto 4b4
      // 4b0: invokestatic eiu.a (Loov;)Loov;
      // 4b3: athrow
      // 4b4: aload 0
      // 4b5: getfield eiu.b01 Lt9d;
      // 4b8: aload 18
      // 4ba: getstatic ox_.f02 Le0x;
      // 4bd: invokevirtual e0x.l4i ()Lzfz;
      // 4c0: bipush 2
      // 4c1: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 4c4: pop
      // 4c5: goto 4cc
      // 4c8: invokestatic eiu.a (Loov;)Loov;
      // 4cb: athrow
      // 4cc: aload 0
      // 4cd: getfield eiu.b01 Lt9d;
      // 4d0: aload 17
      // 4d2: bipush 1
      // 4d3: invokevirtual OpaquePredicate.l2a (Lmew;Z)Z
      // 4d6: iload 4
      // 4d8: ifeq 4fc
      // 4db: ifeq 4fd
      // 4de: goto 4e5
      // 4e1: invokestatic eiu.a (Loov;)Loov;
      // 4e4: athrow
      // 4e5: aload 0
      // 4e6: getfield eiu.b01 Lt9d;
      // 4e9: aload 17
      // 4eb: getstatic ox_.dxo Le0x;
      // 4ee: invokevirtual e0x.l4i ()Lzfz;
      // 4f1: bipush 2
      // 4f2: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 4f5: goto 4fc
      // 4f8: invokestatic eiu.a (Loov;)Loov;
      // 4fb: athrow
      // 4fc: pop
      // 4fd: iinc 16 1
      // 500: iload 4
      // 502: ifne 476
      // 505: iinc 15 1
      // 508: iload 4
      // 50a: ifne 467
      // 50d: bipush 0
      // 50e: putstatic d26.trk Z
      // 511: return
   }

   @Override
   public boolean zzc(g6k param1, tts param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: bipush 0
      // 06: istore 6
      // 08: aload 0
      // 09: getfield eiu.wo4 Ly_h;
      // 0c: getfield y_h.s3x Z
      // 0f: iload 5
      // 11: ifeq 76
      // 14: ifeq 74
      // 17: goto 1e
      // 1a: invokestatic eiu.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield eiu.xjr Z
      // 22: iload 5
      // 24: ifeq 76
      // 27: goto 2e
      // 2a: invokestatic eiu.a (Loov;)Loov;
      // 2d: athrow
      // 2e: ifeq 74
      // 31: goto 38
      // 34: invokestatic eiu.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 2
      // 39: invokevirtual tts.zuf ()J
      // 3c: ldc2_w 3600
      // 3f: lcmp
      // 40: iload 5
      // 42: ifeq 76
      // 45: goto 4c
      // 48: invokestatic eiu.a (Loov;)Loov;
      // 4b: athrow
      // 4c: ifge 74
      // 4f: goto 56
      // 52: invokestatic eiu.a (Loov;)Loov;
      // 55: athrow
      // 56: iload 6
      // 58: aload 0
      // 59: getfield eiu.lq4 Lnet/minecraft/world/gen/structure/StructureOceanMonument;
      // 5c: aload 0
      // 5d: getfield eiu.b01 Lt9d;
      // 60: aload 0
      // 61: getfield eiu.kz7 Ljava/util/Random;
      // 64: new h2f
      // 67: dup
      // 68: iload 3
      // 69: iload 4
      // 6b: invokespecial h2f.<init> (II)V
      // 6e: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonument.vd1 (Lt9d;Ljava/util/Random;Lh2f;)Z
      // 71: ior
      // 72: istore 6
      // 74: iload 6
      // 76: ireturn
   }

   @Override
   public boolean va4(boolean var1, sw6 var2) {
      return true;
   }

   @Override
   public void hua() {
   }

   @Override
   public boolean p68() {
      return false;
   }

   @Override
   public boolean pj4() {
      return true;
   }

   @Override
   public String y2l() {
      long var1 = a ^ 56142141386527L;
      return a<"h">(1257, 1278457193600943610L ^ var1);
   }

   @Override
   public List sbk(ek6 param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield eiu.b01 Lt9d;
      // 08: aload 2
      // 09: invokevirtual OpaquePredicate.getBiomeGenForCoords (Lmew;)Lgyu;
      // 0c: astore 4
      // 0e: aload 0
      // 0f: getfield eiu.xjr Z
      // 12: ifeq ad
      // 15: aload 1
      // 16: getstatic ek6.ywn Lek6;
      // 19: iload 3
      // 1a: ifeq 5e
      // 1d: goto 24
      // 20: invokestatic eiu.a (Loov;)Loov;
      // 23: athrow
      // 24: if_acmpne 5a
      // 27: goto 2e
      // 2a: invokestatic eiu.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield eiu.h02 Lnet/minecraft/world/gen/structure/MapGenScatteredFeature;
      // 32: iload 3
      // 33: ifeq 56
      // 36: goto 3d
      // 39: invokestatic eiu.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 2
      // 3e: invokevirtual net/minecraft/world/gen/structure/MapGenScatteredFeature.s28 (Lmew;)Z
      // 41: ifeq 5a
      // 44: goto 4b
      // 47: invokestatic eiu.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield eiu.h02 Lnet/minecraft/world/gen/structure/MapGenScatteredFeature;
      // 4f: goto 56
      // 52: invokestatic eiu.a (Loov;)Loov;
      // 55: athrow
      // 56: invokevirtual net/minecraft/world/gen/structure/MapGenScatteredFeature.wyu ()Ljava/util/List;
      // 59: areturn
      // 5a: aload 1
      // 5b: getstatic ek6.ywn Lek6;
      // 5e: if_acmpne ad
      // 61: aload 0
      // 62: getfield eiu.wo4 Ly_h;
      // 65: getfield y_h.s3x Z
      // 68: iload 3
      // 69: ifeq 9b
      // 6c: goto 73
      // 6f: invokestatic eiu.a (Loov;)Loov;
      // 72: athrow
      // 73: ifeq ad
      // 76: goto 7d
      // 79: invokestatic eiu.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 0
      // 7e: getfield eiu.lq4 Lnet/minecraft/world/gen/structure/StructureOceanMonument;
      // 81: iload 3
      // 82: ifeq a9
      // 85: goto 8c
      // 88: invokestatic eiu.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 0
      // 8d: getfield eiu.b01 Lt9d;
      // 90: aload 2
      // 91: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonument.g3m (Lt9d;Lmew;)Z
      // 94: goto 9b
      // 97: invokestatic eiu.a (Loov;)Loov;
      // 9a: athrow
      // 9b: ifeq ad
      // 9e: aload 0
      // 9f: getfield eiu.lq4 Lnet/minecraft/world/gen/structure/StructureOceanMonument;
      // a2: goto a9
      // a5: invokestatic eiu.a (Loov;)Loov;
      // a8: athrow
      // a9: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonument.f8d ()Ljava/util/List;
      // ac: areturn
      // ad: aload 4
      // af: aload 1
      // b0: invokevirtual gyu.gzj (Lek6;)Ljava/util/List;
      // b3: areturn
   }

   @Override
   public mew epl(OpaquePredicate param1, String param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic eiu.a J
      // 03: ldc2_w 43511136637384
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 6
      // 0e: sipush 21325
      // 11: ldc2_w 6934318880302328968
      // 14: lload 4
      // 16: lxor
      // 17: invokedynamic h (IJ)Ljava/lang/String; bsm=eiu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: nop
      // 1d: aload 2
      // 1e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 21: ifeq 51
      // 24: aload 0
      // 25: getfield eiu.a7k Lnet/minecraft/world/gen/structure/MapGenStronghold;
      // 28: iload 6
      // 2a: ifne 49
      // 2d: goto 34
      // 30: invokestatic eiu.a (Loov;)Loov;
      // 33: athrow
      // 34: ifnull 51
      // 37: goto 3e
      // 3a: invokestatic eiu.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield eiu.a7k Lnet/minecraft/world/gen/structure/MapGenStronghold;
      // 42: goto 49
      // 45: invokestatic eiu.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 1
      // 4a: aload 3
      // 4b: invokevirtual net/minecraft/world/gen/structure/MapGenStronghold.p3b (Lt9d;Lmew;)Lmew;
      // 4e: goto 52
      // 51: aconst_null
      // 52: areturn
   }

   @Override
   public int gkt() {
      return 0;
   }

   @Override
   public void nw5(tts param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield eiu.wo4 Ly_h;
      // 009: getfield y_h.q1e Z
      // 00c: iload 4
      // 00e: ifne 055
      // 011: ifeq 04e
      // 014: goto 01b
      // 017: invokestatic eiu.a (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield eiu.xjr Z
      // 01f: iload 4
      // 021: ifne 055
      // 024: goto 02b
      // 027: invokestatic eiu.a (Loov;)Loov;
      // 02a: athrow
      // 02b: ifeq 04e
      // 02e: goto 035
      // 031: invokestatic eiu.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: getfield eiu.hj_ Lxi0;
      // 039: aload 0
      // 03a: aload 0
      // 03b: getfield eiu.b01 Lt9d;
      // 03e: iload 2
      // 03f: iload 3
      // 040: aconst_null
      // 041: checkcast lno
      // 044: invokevirtual xi0.vyh (Lg6k;Lt9d;IILlno;)V
      // 047: goto 04e
      // 04a: invokestatic eiu.a (Loov;)Loov;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield eiu.wo4 Ly_h;
      // 052: getfield y_h.cc4 Z
      // 055: iload 4
      // 057: ifne 09e
      // 05a: ifeq 097
      // 05d: goto 064
      // 060: invokestatic eiu.a (Loov;)Loov;
      // 063: athrow
      // 064: aload 0
      // 065: getfield eiu.xjr Z
      // 068: iload 4
      // 06a: ifne 09e
      // 06d: goto 074
      // 070: invokestatic eiu.a (Loov;)Loov;
      // 073: athrow
      // 074: ifeq 097
      // 077: goto 07e
      // 07a: invokestatic eiu.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 0
      // 07f: getfield eiu.s9l Lnet/minecraft/world/gen/structure/MapGenVillage;
      // 082: aload 0
      // 083: aload 0
      // 084: getfield eiu.b01 Lt9d;
      // 087: iload 2
      // 088: iload 3
      // 089: aconst_null
      // 08a: checkcast lno
      // 08d: invokevirtual net/minecraft/world/gen/structure/MapGenVillage.vyh (Lg6k;Lt9d;IILlno;)V
      // 090: goto 097
      // 093: invokestatic eiu.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 0
      // 098: getfield eiu.wo4 Ly_h;
      // 09b: getfield y_h.x3e Z
      // 09e: iload 4
      // 0a0: ifne 0e7
      // 0a3: ifeq 0e0
      // 0a6: goto 0ad
      // 0a9: invokestatic eiu.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: getfield eiu.xjr Z
      // 0b1: iload 4
      // 0b3: ifne 0e7
      // 0b6: goto 0bd
      // 0b9: invokestatic eiu.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: ifeq 0e0
      // 0c0: goto 0c7
      // 0c3: invokestatic eiu.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: getfield eiu.a7k Lnet/minecraft/world/gen/structure/MapGenStronghold;
      // 0cb: aload 0
      // 0cc: aload 0
      // 0cd: getfield eiu.b01 Lt9d;
      // 0d0: iload 2
      // 0d1: iload 3
      // 0d2: aconst_null
      // 0d3: checkcast lno
      // 0d6: invokevirtual net/minecraft/world/gen/structure/MapGenStronghold.vyh (Lg6k;Lt9d;IILlno;)V
      // 0d9: goto 0e0
      // 0dc: invokestatic eiu.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: getfield eiu.wo4 Ly_h;
      // 0e4: getfield y_h._27 Z
      // 0e7: iload 4
      // 0e9: ifne 130
      // 0ec: ifeq 129
      // 0ef: goto 0f6
      // 0f2: invokestatic eiu.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: getfield eiu.xjr Z
      // 0fa: iload 4
      // 0fc: ifne 130
      // 0ff: goto 106
      // 102: invokestatic eiu.a (Loov;)Loov;
      // 105: athrow
      // 106: ifeq 129
      // 109: goto 110
      // 10c: invokestatic eiu.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield eiu.h02 Lnet/minecraft/world/gen/structure/MapGenScatteredFeature;
      // 114: aload 0
      // 115: aload 0
      // 116: getfield eiu.b01 Lt9d;
      // 119: iload 2
      // 11a: iload 3
      // 11b: aconst_null
      // 11c: checkcast lno
      // 11f: invokevirtual net/minecraft/world/gen/structure/MapGenScatteredFeature.vyh (Lg6k;Lt9d;IILlno;)V
      // 122: goto 129
      // 125: invokestatic eiu.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 0
      // 12a: getfield eiu.wo4 Ly_h;
      // 12d: getfield y_h.s3x Z
      // 130: iload 4
      // 132: ifne 156
      // 135: ifeq 16b
      // 138: goto 13f
      // 13b: invokestatic eiu.a (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 0
      // 140: iload 4
      // 142: ifne 15a
      // 145: goto 14c
      // 148: invokestatic eiu.a (Loov;)Loov;
      // 14b: athrow
      // 14c: getfield eiu.xjr Z
      // 14f: goto 156
      // 152: invokestatic eiu.a (Loov;)Loov;
      // 155: athrow
      // 156: ifeq 16b
      // 159: aload 0
      // 15a: getfield eiu.lq4 Lnet/minecraft/world/gen/structure/StructureOceanMonument;
      // 15d: aload 0
      // 15e: aload 0
      // 15f: getfield eiu.b01 Lt9d;
      // 162: iload 2
      // 163: iload 3
      // 164: aconst_null
      // 165: checkcast lno
      // 168: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonument.vyh (Lg6k;Lt9d;IILlno;)V
      // 16b: return
   }

   @Override
   public tts iqa(mew var1) {
      return this.et2(var1.getX() >> 4, var1.getZ() >> 4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5327392653738752020L, -4870356516903989931L, MethodHandles.lookup().lookupClass()).a(185771360513203L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 58313806920403L;
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
      String var6 = "k}~B³TÕÐ\u0085\u008cW±ÚK\u001fÆBËÌO¤¸à&\u009byÔ\u008e(\u001c.¿(Xæ/\u0005úZÌI%Ú\u0085?\t.¤xA}xAFÓh\u0082ü×Câ Å¡\u009a\u001fOÌ#%\u001a\u0006}";
      int var8 = "k}~B³TÕÐ\u0085\u008cW±ÚK\u001fÆBËÌO¤¸à&\u009byÔ\u008e(\u001c.¿(Xæ/\u0005úZÌI%Ú\u0085?\t.¤xA}xAFÓh\u0082ü×Câ Å¡\u009a\u001fOÌ#%\u001a\u0006}"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
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

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21819;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("eiu", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("eiu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
