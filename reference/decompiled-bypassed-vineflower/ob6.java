import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ob6 extends e0x {
   public static final h76 hwn;
   public static final h76 rb5;
   public static final h76 j0m;
   public static final h76 hoe;

   public ob6(p3y var1, boolean var2) {
      super(var1);
      this.y8l(this._8_.c32().zvi(hwn, false).zvi(rb5, false).zvi(j0m, false).zvi(hoe, false));
      this.j1_ = var2;
      this.i3l(uja.qqf);
   }

   @Override
   public zfz w1b(zfz var1, m5n var2, mew var3) {
      return var1.zvi(hwn, this.qqa(var2.getBlockState(var3.idu()).r_y()))
         .zvi(j0m, this.qqa(var2.getBlockState(var3.z6x()).r_y()))
         .zvi(hoe, this.qqa(var2.getBlockState(var3.y8e()).r_y()))
         .zvi(rb5, this.qqa(var2.getBlockState(var3.o_8()).r_y()));
   }

   @Override
   public u7m j39(zfz param1, Random param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 21
      // 0b: getfield ob6.j1_ Z
      // 0e: ifne 20
      // 11: goto 18
      // 14: invokestatic ob6.b (Loov;)Loov;
      // 17: athrow
      // 18: aconst_null
      // 19: goto 27
      // 1c: invokestatic ob6.b (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: aload 2
      // 23: iload 3
      // 24: invokespecial e0x.j39 (Lzfz;Ljava/util/Random;I)Lu7m;
      // 27: areturn
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      try {
         if (var1.getBlockState(var2).r_y() == this) {
            return false;
         }
      } catch (oov var4) {
         throw b(var4);
      }

      return super.ron(var1, var2, var3);
   }

   @Override
   public void c76(t9d param1, mew param2, zfz param3, nh4 param4, List param5, i2h param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: aload 2
      // 003: invokevirtual mew.idu ()Lmew;
      // 006: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 009: invokeinterface zfz.r_y ()Le0x; 1
      // 00e: invokevirtual ob6.qqa (Le0x;)Z
      // 011: istore 8
      // 013: aload 0
      // 014: aload 1
      // 015: aload 2
      // 016: invokevirtual mew.z6x ()Lmew;
      // 019: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 01c: invokeinterface zfz.r_y ()Le0x; 1
      // 021: invokevirtual ob6.qqa (Le0x;)Z
      // 024: istore 9
      // 026: invokestatic t9d.c ()I
      // 029: aload 0
      // 02a: aload 1
      // 02b: aload 2
      // 02c: invokevirtual mew.y8e ()Lmew;
      // 02f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 032: invokeinterface zfz.r_y ()Le0x; 1
      // 037: invokevirtual ob6.qqa (Le0x;)Z
      // 03a: istore 10
      // 03c: aload 0
      // 03d: aload 1
      // 03e: aload 2
      // 03f: invokevirtual mew.o_8 ()Lmew;
      // 042: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 045: invokeinterface zfz.r_y ()Le0x; 1
      // 04a: invokevirtual ob6.qqa (Le0x;)Z
      // 04d: istore 11
      // 04f: istore 7
      // 051: iload 10
      // 053: iload 7
      // 055: ifne 07c
      // 058: ifeq 07a
      // 05b: goto 062
      // 05e: invokestatic ob6.b (Loov;)Loov;
      // 061: athrow
      // 062: iload 11
      // 064: iload 7
      // 066: ifne 07c
      // 069: goto 070
      // 06c: invokestatic ob6.b (Loov;)Loov;
      // 06f: athrow
      // 070: ifne 14e
      // 073: goto 07a
      // 076: invokestatic ob6.b (Loov;)Loov;
      // 079: athrow
      // 07a: iload 10
      // 07c: iload 7
      // 07e: ifne 0d5
      // 081: ifne 0d3
      // 084: goto 08b
      // 087: invokestatic ob6.b (Loov;)Loov;
      // 08a: athrow
      // 08b: iload 11
      // 08d: iload 7
      // 08f: ifne 0d5
      // 092: goto 099
      // 095: invokestatic ob6.b (Loov;)Loov;
      // 098: athrow
      // 099: ifne 0d3
      // 09c: goto 0a3
      // 09f: invokestatic ob6.b (Loov;)Loov;
      // 0a2: athrow
      // 0a3: iload 8
      // 0a5: iload 7
      // 0a7: ifne 0d5
      // 0aa: goto 0b1
      // 0ad: invokestatic ob6.b (Loov;)Loov;
      // 0b0: athrow
      // 0b1: ifne 0d3
      // 0b4: goto 0bb
      // 0b7: invokestatic ob6.b (Loov;)Loov;
      // 0ba: athrow
      // 0bb: iload 9
      // 0bd: iload 7
      // 0bf: ifne 0d5
      // 0c2: goto 0c9
      // 0c5: invokestatic ob6.b (Loov;)Loov;
      // 0c8: athrow
      // 0c9: ifeq 14e
      // 0cc: goto 0d3
      // 0cf: invokestatic ob6.b (Loov;)Loov;
      // 0d2: athrow
      // 0d3: iload 10
      // 0d5: iload 7
      // 0d7: ifne 116
      // 0da: ifeq 10d
      // 0dd: goto 0e4
      // 0e0: invokestatic ob6.b (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: fconst_0
      // 0e6: fconst_0
      // 0e7: ldc 0.4375
      // 0e9: nop
      // 0ea: ldc 0.5
      // 0ec: nop
      // 0ed: fconst_1
      // 0ee: ldc 0.5625
      // 0f0: nop
      // 0f1: invokevirtual ob6.xl4 (FFFFFF)V
      // 0f4: aload 0
      // 0f5: aload 1
      // 0f6: aload 2
      // 0f7: aload 3
      // 0f8: aload 4
      // 0fa: aload 5
      // 0fc: aload 6
      // 0fe: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 101: iload 7
      // 103: ifeq 170
      // 106: goto 10d
      // 109: invokestatic ob6.b (Loov;)Loov;
      // 10c: athrow
      // 10d: iload 11
      // 10f: goto 116
      // 112: invokestatic ob6.b (Loov;)Loov;
      // 115: athrow
      // 116: iload 7
      // 118: ifne 172
      // 11b: ifeq 170
      // 11e: goto 125
      // 121: invokestatic ob6.b (Loov;)Loov;
      // 124: athrow
      // 125: aload 0
      // 126: ldc 0.5
      // 128: nop
      // 129: fconst_0
      // 12a: ldc 0.4375
      // 12c: nop
      // 12d: fconst_1
      // 12e: fconst_1
      // 12f: ldc 0.5625
      // 131: nop
      // 132: invokevirtual ob6.xl4 (FFFFFF)V
      // 135: aload 0
      // 136: aload 1
      // 137: aload 2
      // 138: aload 3
      // 139: aload 4
      // 13b: aload 5
      // 13d: aload 6
      // 13f: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 142: iload 7
      // 144: ifeq 170
      // 147: goto 14e
      // 14a: invokestatic ob6.b (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 0
      // 14f: fconst_0
      // 150: fconst_0
      // 151: ldc 0.4375
      // 153: nop
      // 154: fconst_1
      // 155: fconst_1
      // 156: ldc 0.5625
      // 158: nop
      // 159: invokevirtual ob6.xl4 (FFFFFF)V
      // 15c: aload 0
      // 15d: aload 1
      // 15e: aload 2
      // 15f: aload 3
      // 160: aload 4
      // 162: aload 5
      // 164: aload 6
      // 166: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 169: goto 170
      // 16c: invokestatic ob6.b (Loov;)Loov;
      // 16f: athrow
      // 170: iload 8
      // 172: iload 7
      // 174: ifne 19b
      // 177: ifeq 199
      // 17a: goto 181
      // 17d: invokestatic ob6.b (Loov;)Loov;
      // 180: athrow
      // 181: iload 9
      // 183: iload 7
      // 185: ifne 19b
      // 188: goto 18f
      // 18b: invokestatic ob6.b (Loov;)Loov;
      // 18e: athrow
      // 18f: ifne 261
      // 192: goto 199
      // 195: invokestatic ob6.b (Loov;)Loov;
      // 198: athrow
      // 199: iload 10
      // 19b: iload 7
      // 19d: ifne 1f4
      // 1a0: ifne 1f2
      // 1a3: goto 1aa
      // 1a6: invokestatic ob6.b (Loov;)Loov;
      // 1a9: athrow
      // 1aa: iload 11
      // 1ac: iload 7
      // 1ae: ifne 1f4
      // 1b1: goto 1b8
      // 1b4: invokestatic ob6.b (Loov;)Loov;
      // 1b7: athrow
      // 1b8: ifne 1f2
      // 1bb: goto 1c2
      // 1be: invokestatic ob6.b (Loov;)Loov;
      // 1c1: athrow
      // 1c2: iload 8
      // 1c4: iload 7
      // 1c6: ifne 1f4
      // 1c9: goto 1d0
      // 1cc: invokestatic ob6.b (Loov;)Loov;
      // 1cf: athrow
      // 1d0: ifne 1f2
      // 1d3: goto 1da
      // 1d6: invokestatic ob6.b (Loov;)Loov;
      // 1d9: athrow
      // 1da: iload 9
      // 1dc: iload 7
      // 1de: ifne 1f4
      // 1e1: goto 1e8
      // 1e4: invokestatic ob6.b (Loov;)Loov;
      // 1e7: athrow
      // 1e8: ifeq 261
      // 1eb: goto 1f2
      // 1ee: invokestatic ob6.b (Loov;)Loov;
      // 1f1: athrow
      // 1f2: iload 8
      // 1f4: iload 7
      // 1f6: ifne 235
      // 1f9: ifeq 22c
      // 1fc: goto 203
      // 1ff: invokestatic ob6.b (Loov;)Loov;
      // 202: athrow
      // 203: aload 0
      // 204: ldc 0.4375
      // 206: nop
      // 207: fconst_0
      // 208: fconst_0
      // 209: ldc 0.5625
      // 20b: nop
      // 20c: fconst_1
      // 20d: ldc 0.5
      // 20f: nop
      // 210: invokevirtual ob6.xl4 (FFFFFF)V
      // 213: aload 0
      // 214: aload 1
      // 215: aload 2
      // 216: aload 3
      // 217: aload 4
      // 219: aload 5
      // 21b: aload 6
      // 21d: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 220: iload 7
      // 222: ifeq 283
      // 225: goto 22c
      // 228: invokestatic ob6.b (Loov;)Loov;
      // 22b: athrow
      // 22c: iload 9
      // 22e: goto 235
      // 231: invokestatic ob6.b (Loov;)Loov;
      // 234: athrow
      // 235: ifeq 283
      // 238: aload 0
      // 239: ldc 0.4375
      // 23b: nop
      // 23c: fconst_0
      // 23d: ldc 0.5
      // 23f: nop
      // 240: ldc 0.5625
      // 242: nop
      // 243: fconst_1
      // 244: fconst_1
      // 245: invokevirtual ob6.xl4 (FFFFFF)V
      // 248: aload 0
      // 249: aload 1
      // 24a: aload 2
      // 24b: aload 3
      // 24c: aload 4
      // 24e: aload 5
      // 250: aload 6
      // 252: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 255: iload 7
      // 257: ifeq 283
      // 25a: goto 261
      // 25d: invokestatic ob6.b (Loov;)Loov;
      // 260: athrow
      // 261: aload 0
      // 262: ldc 0.4375
      // 264: nop
      // 265: fconst_0
      // 266: fconst_0
      // 267: ldc 0.5625
      // 269: nop
      // 26a: fconst_1
      // 26b: fconst_1
      // 26c: invokevirtual ob6.xl4 (FFFFFF)V
      // 26f: aload 0
      // 270: aload 1
      // 271: aload 2
      // 272: aload 3
      // 273: aload 4
      // 275: aload 5
      // 277: aload 6
      // 279: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 27c: goto 283
      // 27f: invokestatic ob6.b (Loov;)Loov;
      // 282: athrow
      // 283: return
   }

   @Override
   public void bf6() {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void c7i(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 0.4375
      // 002: nop
      // 003: fstore 4
      // 005: ldc 0.5625
      // 007: nop
      // 008: fstore 5
      // 00a: invokestatic t9d.c ()I
      // 00d: ldc 0.4375
      // 00f: nop
      // 010: fstore 6
      // 012: istore 3
      // 013: ldc 0.5625
      // 015: nop
      // 016: fstore 7
      // 018: aload 0
      // 019: aload 1
      // 01a: aload 2
      // 01b: invokevirtual mew.idu ()Lmew;
      // 01e: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 023: invokeinterface zfz.r_y ()Le0x; 1
      // 028: invokevirtual ob6.qqa (Le0x;)Z
      // 02b: istore 8
      // 02d: aload 0
      // 02e: aload 1
      // 02f: aload 2
      // 030: invokevirtual mew.z6x ()Lmew;
      // 033: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 038: invokeinterface zfz.r_y ()Le0x; 1
      // 03d: invokevirtual ob6.qqa (Le0x;)Z
      // 040: istore 9
      // 042: aload 0
      // 043: aload 1
      // 044: aload 2
      // 045: invokevirtual mew.y8e ()Lmew;
      // 048: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 04d: invokeinterface zfz.r_y ()Le0x; 1
      // 052: invokevirtual ob6.qqa (Le0x;)Z
      // 055: istore 10
      // 057: aload 0
      // 058: aload 1
      // 059: aload 2
      // 05a: invokevirtual mew.o_8 ()Lmew;
      // 05d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 062: invokeinterface zfz.r_y ()Le0x; 1
      // 067: invokevirtual ob6.qqa (Le0x;)Z
      // 06a: istore 11
      // 06c: iload 10
      // 06e: iload 3
      // 06f: ifne 095
      // 072: ifeq 093
      // 075: goto 07c
      // 078: invokestatic ob6.b (Loov;)Loov;
      // 07b: athrow
      // 07c: iload 11
      // 07e: iload 3
      // 07f: ifne 095
      // 082: goto 089
      // 085: invokestatic ob6.b (Loov;)Loov;
      // 088: athrow
      // 089: ifne 11d
      // 08c: goto 093
      // 08f: invokestatic ob6.b (Loov;)Loov;
      // 092: athrow
      // 093: iload 10
      // 095: iload 3
      // 096: ifne 0ea
      // 099: ifne 0e8
      // 09c: goto 0a3
      // 09f: invokestatic ob6.b (Loov;)Loov;
      // 0a2: athrow
      // 0a3: iload 11
      // 0a5: iload 3
      // 0a6: ifne 0ea
      // 0a9: goto 0b0
      // 0ac: invokestatic ob6.b (Loov;)Loov;
      // 0af: athrow
      // 0b0: ifne 0e8
      // 0b3: goto 0ba
      // 0b6: invokestatic ob6.b (Loov;)Loov;
      // 0b9: athrow
      // 0ba: iload 8
      // 0bc: iload 3
      // 0bd: ifne 0ea
      // 0c0: goto 0c7
      // 0c3: invokestatic ob6.b (Loov;)Loov;
      // 0c6: athrow
      // 0c7: ifne 0e8
      // 0ca: goto 0d1
      // 0cd: invokestatic ob6.b (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iload 9
      // 0d3: iload 3
      // 0d4: ifne 0ea
      // 0d7: goto 0de
      // 0da: invokestatic ob6.b (Loov;)Loov;
      // 0dd: athrow
      // 0de: ifeq 11d
      // 0e1: goto 0e8
      // 0e4: invokestatic ob6.b (Loov;)Loov;
      // 0e7: athrow
      // 0e8: iload 10
      // 0ea: iload 3
      // 0eb: ifne 108
      // 0ee: ifeq 0ff
      // 0f1: goto 0f8
      // 0f4: invokestatic ob6.b (Loov;)Loov;
      // 0f7: athrow
      // 0f8: fconst_0
      // 0f9: fstore 4
      // 0fb: iload 3
      // 0fc: ifeq 123
      // 0ff: iload 11
      // 101: goto 108
      // 104: invokestatic ob6.b (Loov;)Loov;
      // 107: athrow
      // 108: iload 3
      // 109: ifne 125
      // 10c: ifeq 123
      // 10f: goto 116
      // 112: invokestatic ob6.b (Loov;)Loov;
      // 115: athrow
      // 116: fconst_1
      // 117: fstore 5
      // 119: iload 3
      // 11a: ifeq 123
      // 11d: fconst_0
      // 11e: fstore 4
      // 120: fconst_1
      // 121: fstore 5
      // 123: iload 8
      // 125: iload 3
      // 126: ifne 14c
      // 129: ifeq 14a
      // 12c: goto 133
      // 12f: invokestatic ob6.b (Loov;)Loov;
      // 132: athrow
      // 133: iload 9
      // 135: iload 3
      // 136: ifne 14c
      // 139: goto 140
      // 13c: invokestatic ob6.b (Loov;)Loov;
      // 13f: athrow
      // 140: ifne 1c9
      // 143: goto 14a
      // 146: invokestatic ob6.b (Loov;)Loov;
      // 149: athrow
      // 14a: iload 10
      // 14c: iload 3
      // 14d: ifne 1a1
      // 150: ifne 19f
      // 153: goto 15a
      // 156: invokestatic ob6.b (Loov;)Loov;
      // 159: athrow
      // 15a: iload 11
      // 15c: iload 3
      // 15d: ifne 1a1
      // 160: goto 167
      // 163: invokestatic ob6.b (Loov;)Loov;
      // 166: athrow
      // 167: ifne 19f
      // 16a: goto 171
      // 16d: invokestatic ob6.b (Loov;)Loov;
      // 170: athrow
      // 171: iload 8
      // 173: iload 3
      // 174: ifne 1a1
      // 177: goto 17e
      // 17a: invokestatic ob6.b (Loov;)Loov;
      // 17d: athrow
      // 17e: ifne 19f
      // 181: goto 188
      // 184: invokestatic ob6.b (Loov;)Loov;
      // 187: athrow
      // 188: iload 9
      // 18a: iload 3
      // 18b: ifne 1a1
      // 18e: goto 195
      // 191: invokestatic ob6.b (Loov;)Loov;
      // 194: athrow
      // 195: ifeq 1c9
      // 198: goto 19f
      // 19b: invokestatic ob6.b (Loov;)Loov;
      // 19e: athrow
      // 19f: iload 8
      // 1a1: iload 3
      // 1a2: ifne 1bf
      // 1a5: ifeq 1b6
      // 1a8: goto 1af
      // 1ab: invokestatic ob6.b (Loov;)Loov;
      // 1ae: athrow
      // 1af: fconst_0
      // 1b0: fstore 6
      // 1b2: iload 3
      // 1b3: ifeq 1cf
      // 1b6: iload 9
      // 1b8: goto 1bf
      // 1bb: invokestatic ob6.b (Loov;)Loov;
      // 1be: athrow
      // 1bf: ifeq 1cf
      // 1c2: fconst_1
      // 1c3: fstore 7
      // 1c5: iload 3
      // 1c6: ifeq 1cf
      // 1c9: fconst_0
      // 1ca: fstore 6
      // 1cc: fconst_1
      // 1cd: fstore 7
      // 1cf: aload 0
      // 1d0: fload 4
      // 1d2: fconst_0
      // 1d3: fload 6
      // 1d5: fload 5
      // 1d7: fconst_1
      // 1d8: fload 7
      // 1da: invokevirtual ob6.xl4 (FFFFFF)V
      // 1dd: return
   }

   public final boolean qqa(e0x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual e0x.z4c ()Z
      // 08: iload 2
      // 09: ifeq 8b
      // 0c: ifne 8a
      // 0f: goto 16
      // 12: invokestatic ob6.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: aload 0
      // 18: iload 2
      // 19: ifeq 43
      // 1c: goto 23
      // 1f: invokestatic ob6.b (Loov;)Loov;
      // 22: athrow
      // 23: if_acmpeq 8a
      // 26: goto 2d
      // 29: invokestatic ob6.b (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 1
      // 2e: iload 2
      // 2f: ifeq 47
      // 32: goto 39
      // 35: invokestatic ob6.b (Loov;)Loov;
      // 38: athrow
      // 39: getstatic ox_.fzi Le0x;
      // 3c: goto 43
      // 3f: invokestatic ob6.b (Loov;)Loov;
      // 42: athrow
      // 43: if_acmpeq 8a
      // 46: aload 1
      // 47: iload 2
      // 48: ifeq 60
      // 4b: getstatic ox_.dh_ Lowm;
      // 4e: if_acmpeq 8a
      // 51: goto 58
      // 54: invokestatic ob6.b (Loov;)Loov;
      // 57: athrow
      // 58: aload 1
      // 59: goto 60
      // 5c: invokestatic ob6.b (Loov;)Loov;
      // 5f: athrow
      // 60: iload 2
      // 61: ifeq 79
      // 64: getstatic ox_.pse Ljgy;
      // 67: if_acmpeq 8a
      // 6a: goto 71
      // 6d: invokestatic ob6.b (Loov;)Loov;
      // 70: athrow
      // 71: aload 1
      // 72: goto 79
      // 75: invokestatic ob6.b (Loov;)Loov;
      // 78: athrow
      // 79: instanceof ob6
      // 7c: iload 2
      // 7d: ifeq 8b
      // 80: ifeq 8e
      // 83: goto 8a
      // 86: invokestatic ob6.b (Loov;)Loov;
      // 89: athrow
      // 8a: bipush 1
      // 8b: goto 8f
      // 8e: bipush 0
      // 8f: ireturn
   }

   @Override
   public boolean row() {
      return true;
   }

   @Override
   public w51 w3x() {
      return w51.oja;
   }

   @Override
   public int hvp(zfz var1) {
      return 0;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{hwn, rb5, hoe, j0m});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3196530231478666966L, -6210193610467796455L, MethodHandles.lookup().lookupClass()).a(16532828534083L);
      // $VF: monitorexit
      long var10 = var10000 ^ 122561677219759L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[4];
      int var6 = 0;
      String var5 = "@b\u0089hMÒÍö\b7º\u0004yËL0ú";
      int var7 = "@b\u0089hMÒÍö\b7º\u0004yËL0ú".length();
      char var4 = '\b';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = b(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     hwn = h76.d_1(var8[0]);
                     rb5 = h76.d_1(var8[3]);
                     j0m = h76.d_1(var8[1]);
                     hoe = h76.d_1(var8[2]);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "Ú3>\u007fç Vÿ\bå{Ô\u0085\u0091§\u0097Q";
                  var7 = "Ú3>\u007fç Vÿ\bå{Ô\u0085\u0091§\u0097Q".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
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
}
