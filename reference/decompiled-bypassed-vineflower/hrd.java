import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityChest;

public class hrd extends rw8 {
   public static final qx_ gse;
   public final int whs;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public hrd(int var1) {
      super(p3y.fdu);
      this.y8l(this._8_.c32().zvi(gse, vt2.z9q));
      this.whs = var1;
      this.i3l(uja.qqf);
      this.xl4(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
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
   public int kfj() {
      return 2;
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
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 1
      // 005: aload 2
      // 006: invokevirtual mew.idu ()Lmew;
      // 009: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 00e: invokeinterface zfz.r_y ()Le0x; 1
      // 013: aload 0
      // 014: iload 3
      // 015: ifne 056
      // 018: if_acmpne 03f
      // 01b: goto 022
      // 01e: invokestatic hrd.a (Loov;)Loov;
      // 021: athrow
      // 022: aload 0
      // 023: ldc 0.0625
      // 025: nop
      // 026: fconst_0
      // 027: fconst_0
      // 028: ldc 0.9375
      // 02a: nop
      // 02b: ldc 0.875
      // 02d: nop
      // 02e: ldc 0.9375
      // 030: nop
      // 031: invokevirtual hrd.xl4 (FFFFFF)V
      // 034: iload 3
      // 035: ifeq 115
      // 038: goto 03f
      // 03b: invokestatic hrd.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 1
      // 040: aload 2
      // 041: invokevirtual mew.z6x ()Lmew;
      // 044: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 049: invokeinterface zfz.r_y ()Le0x; 1
      // 04e: aload 0
      // 04f: goto 056
      // 052: invokestatic hrd.a (Loov;)Loov;
      // 055: athrow
      // 056: iload 3
      // 057: ifne 098
      // 05a: if_acmpne 081
      // 05d: goto 064
      // 060: invokestatic hrd.a (Loov;)Loov;
      // 063: athrow
      // 064: aload 0
      // 065: ldc 0.0625
      // 067: nop
      // 068: fconst_0
      // 069: ldc 0.0625
      // 06b: nop
      // 06c: ldc 0.9375
      // 06e: nop
      // 06f: ldc 0.875
      // 071: nop
      // 072: fconst_1
      // 073: invokevirtual hrd.xl4 (FFFFFF)V
      // 076: iload 3
      // 077: ifeq 115
      // 07a: goto 081
      // 07d: invokestatic hrd.a (Loov;)Loov;
      // 080: athrow
      // 081: aload 1
      // 082: aload 2
      // 083: invokevirtual mew.y8e ()Lmew;
      // 086: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 08b: invokeinterface zfz.r_y ()Le0x; 1
      // 090: aload 0
      // 091: goto 098
      // 094: invokestatic hrd.a (Loov;)Loov;
      // 097: athrow
      // 098: iload 3
      // 099: ifne 0da
      // 09c: if_acmpne 0c3
      // 09f: goto 0a6
      // 0a2: invokestatic hrd.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: fconst_0
      // 0a8: fconst_0
      // 0a9: ldc 0.0625
      // 0ab: nop
      // 0ac: ldc 0.9375
      // 0ae: nop
      // 0af: ldc 0.875
      // 0b1: nop
      // 0b2: ldc 0.9375
      // 0b4: nop
      // 0b5: invokevirtual hrd.xl4 (FFFFFF)V
      // 0b8: iload 3
      // 0b9: ifeq 115
      // 0bc: goto 0c3
      // 0bf: invokestatic hrd.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 1
      // 0c4: aload 2
      // 0c5: invokevirtual mew.o_8 ()Lmew;
      // 0c8: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0cd: invokeinterface zfz.r_y ()Le0x; 1
      // 0d2: aload 0
      // 0d3: goto 0da
      // 0d6: invokestatic hrd.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: if_acmpne 0fa
      // 0dd: aload 0
      // 0de: ldc 0.0625
      // 0e0: nop
      // 0e1: fconst_0
      // 0e2: ldc 0.0625
      // 0e4: nop
      // 0e5: fconst_1
      // 0e6: ldc 0.875
      // 0e8: nop
      // 0e9: ldc 0.9375
      // 0eb: nop
      // 0ec: invokevirtual hrd.xl4 (FFFFFF)V
      // 0ef: iload 3
      // 0f0: ifeq 115
      // 0f3: goto 0fa
      // 0f6: invokestatic hrd.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: ldc 0.0625
      // 0fd: nop
      // 0fe: fconst_0
      // 0ff: ldc 0.0625
      // 101: nop
      // 102: ldc 0.9375
      // 104: nop
      // 105: ldc 0.875
      // 107: nop
      // 108: ldc 0.9375
      // 10a: nop
      // 10b: invokevirtual hrd.xl4 (FFFFFF)V
      // 10e: goto 115
      // 111: invokestatic hrd.a (Loov;)Loov;
      // 114: athrow
      // 115: return
   }

   @Override
   public void tfc(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: invokevirtual hrd.fro (Lt9d;Lmew;Lzfz;)Lzfz;
      // 07: pop
      // 08: invokestatic t9d.b ()I
      // 0b: getstatic vt2$unz.fzl Lvt2$unz;
      // 0e: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 11: astore 5
      // 13: istore 4
      // 15: aload 5
      // 17: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1c: ifeq 68
      // 1f: aload 5
      // 21: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26: checkcast vt2
      // 29: astore 6
      // 2b: aload 2
      // 2c: aload 6
      // 2e: invokevirtual mew.offset (Lvt2;)Lmew;
      // 31: astore 7
      // 33: aload 1
      // 34: aload 7
      // 36: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 39: astore 8
      // 3b: aload 8
      // 3d: iload 4
      // 3f: ifeq 62
      // 42: invokeinterface zfz.r_y ()Le0x; 1
      // 47: aload 0
      // 48: if_acmpne 63
      // 4b: goto 52
      // 4e: invokestatic hrd.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: aload 1
      // 54: aload 7
      // 56: aload 8
      // 58: invokevirtual hrd.fro (Lt9d;Lmew;Lzfz;)Lzfz;
      // 5b: goto 62
      // 5e: invokestatic hrd.a (Loov;)Loov;
      // 61: athrow
      // 62: pop
      // 63: iload 4
      // 65: ifne 15
      // 68: return
   }

   @Override
   public zfz qk_(t9d var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, g_3 var8) {
      return this.l4i().zvi(gse, var8.u0f());
   }

   @Override
   public void qh0(t9d param1, mew param2, zfz param3, g_3 param4, erg param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 4
      // 002: getfield g_3.x5k F
      // 005: ldc 4.0
      // 007: nop
      // 008: fmul
      // 009: ldc 360.0
      // 00b: nop
      // 00c: fdiv
      // 00d: f2d
      // 00e: ldc2_w 0.5
      // 011: dadd
      // 012: invokestatic fe6.jqf (D)I
      // 015: bipush 3
      // 016: iand
      // 017: invokestatic vt2.bm6 (I)Lvt2;
      // 01a: invokevirtual vt2.b4b ()Lvt2;
      // 01d: astore 7
      // 01f: aload 3
      // 020: getstatic hrd.gse Lqx_;
      // 023: aload 7
      // 025: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 02a: astore 3
      // 02b: aload 2
      // 02c: invokevirtual mew.idu ()Lmew;
      // 02f: astore 8
      // 031: invokestatic t9d.b ()I
      // 034: aload 2
      // 035: invokevirtual mew.z6x ()Lmew;
      // 038: astore 9
      // 03a: aload 2
      // 03b: invokevirtual mew.y8e ()Lmew;
      // 03e: astore 10
      // 040: istore 6
      // 042: aload 2
      // 043: invokevirtual mew.o_8 ()Lmew;
      // 046: astore 11
      // 048: aload 0
      // 049: aload 1
      // 04a: aload 8
      // 04c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 04f: invokeinterface zfz.r_y ()Le0x; 1
      // 054: if_acmpne 05f
      // 057: bipush 1
      // 058: goto 060
      // 05b: invokestatic hrd.a (Loov;)Loov;
      // 05e: athrow
      // 05f: bipush 0
      // 060: istore 12
      // 062: aload 0
      // 063: aload 1
      // 064: aload 9
      // 066: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 069: invokeinterface zfz.r_y ()Le0x; 1
      // 06e: if_acmpne 079
      // 071: bipush 1
      // 072: goto 07a
      // 075: invokestatic hrd.a (Loov;)Loov;
      // 078: athrow
      // 079: bipush 0
      // 07a: istore 13
      // 07c: aload 0
      // 07d: aload 1
      // 07e: aload 10
      // 080: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 083: invokeinterface zfz.r_y ()Le0x; 1
      // 088: if_acmpne 093
      // 08b: bipush 1
      // 08c: goto 094
      // 08f: invokestatic hrd.a (Loov;)Loov;
      // 092: athrow
      // 093: bipush 0
      // 094: istore 14
      // 096: aload 0
      // 097: aload 1
      // 098: aload 11
      // 09a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 09d: invokeinterface zfz.r_y ()Le0x; 1
      // 0a2: if_acmpne 0ad
      // 0a5: bipush 1
      // 0a6: goto 0ae
      // 0a9: invokestatic hrd.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: bipush 0
      // 0ae: istore 15
      // 0b0: iload 12
      // 0b2: iload 6
      // 0b4: ifeq 0c3
      // 0b7: ifne 108
      // 0ba: goto 0c1
      // 0bd: invokestatic hrd.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: iload 13
      // 0c3: iload 6
      // 0c5: ifeq 0d4
      // 0c8: ifne 108
      // 0cb: goto 0d2
      // 0ce: invokestatic hrd.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: iload 14
      // 0d4: iload 6
      // 0d6: ifeq 0e5
      // 0d9: ifne 108
      // 0dc: goto 0e3
      // 0df: invokestatic hrd.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: iload 15
      // 0e5: iload 6
      // 0e7: ifeq 102
      // 0ea: ifne 108
      // 0ed: goto 0f4
      // 0f0: invokestatic hrd.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: aload 1
      // 0f5: aload 2
      // 0f6: aload 3
      // 0f7: bipush 3
      // 0f8: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 0fb: goto 102
      // 0fe: invokestatic hrd.a (Loov;)Loov;
      // 101: athrow
      // 102: pop
      // 103: iload 6
      // 105: ifne 220
      // 108: aload 7
      // 10a: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 10d: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 110: iload 6
      // 112: ifeq 165
      // 115: goto 11c
      // 118: invokestatic hrd.a (Loov;)Loov;
      // 11b: athrow
      // 11c: if_acmpne 156
      // 11f: goto 126
      // 122: invokestatic hrd.a (Loov;)Loov;
      // 125: athrow
      // 126: iload 12
      // 128: iload 6
      // 12a: ifeq 1e4
      // 12d: goto 134
      // 130: invokestatic hrd.a (Loov;)Loov;
      // 133: athrow
      // 134: ifne 1db
      // 137: goto 13e
      // 13a: invokestatic hrd.a (Loov;)Loov;
      // 13d: athrow
      // 13e: iload 13
      // 140: iload 6
      // 142: ifeq 1e4
      // 145: goto 14c
      // 148: invokestatic hrd.a (Loov;)Loov;
      // 14b: athrow
      // 14c: ifne 1db
      // 14f: goto 156
      // 152: invokestatic hrd.a (Loov;)Loov;
      // 155: athrow
      // 156: aload 7
      // 158: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 15b: getstatic vt2$y0s.zty Lvt2$y0s;
      // 15e: goto 165
      // 161: invokestatic hrd.a (Loov;)Loov;
      // 164: athrow
      // 165: if_acmpne 220
      // 168: iload 14
      // 16a: iload 6
      // 16c: ifeq 19a
      // 16f: goto 176
      // 172: invokestatic hrd.a (Loov;)Loov;
      // 175: athrow
      // 176: ifne 198
      // 179: goto 180
      // 17c: invokestatic hrd.a (Loov;)Loov;
      // 17f: athrow
      // 180: iload 15
      // 182: iload 6
      // 184: ifeq 225
      // 187: goto 18e
      // 18a: invokestatic hrd.a (Loov;)Loov;
      // 18d: athrow
      // 18e: ifeq 220
      // 191: goto 198
      // 194: invokestatic hrd.a (Loov;)Loov;
      // 197: athrow
      // 198: iload 14
      // 19a: iload 6
      // 19c: ifeq 1cd
      // 19f: ifeq 1be
      // 1a2: goto 1a9
      // 1a5: invokestatic hrd.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: aload 1
      // 1aa: aload 10
      // 1ac: aload 3
      // 1ad: bipush 3
      // 1ae: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1b1: pop
      // 1b2: iload 6
      // 1b4: ifne 1ce
      // 1b7: goto 1be
      // 1ba: invokestatic hrd.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: aload 1
      // 1bf: aload 11
      // 1c1: aload 3
      // 1c2: bipush 3
      // 1c3: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1c6: goto 1cd
      // 1c9: invokestatic hrd.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: pop
      // 1ce: aload 1
      // 1cf: aload 2
      // 1d0: aload 3
      // 1d1: bipush 3
      // 1d2: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1d5: pop
      // 1d6: iload 6
      // 1d8: ifne 220
      // 1db: iload 12
      // 1dd: goto 1e4
      // 1e0: invokestatic hrd.a (Loov;)Loov;
      // 1e3: athrow
      // 1e4: iload 6
      // 1e6: ifeq 217
      // 1e9: ifeq 208
      // 1ec: goto 1f3
      // 1ef: invokestatic hrd.a (Loov;)Loov;
      // 1f2: athrow
      // 1f3: aload 1
      // 1f4: aload 8
      // 1f6: aload 3
      // 1f7: bipush 3
      // 1f8: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1fb: pop
      // 1fc: iload 6
      // 1fe: ifne 218
      // 201: goto 208
      // 204: invokestatic hrd.a (Loov;)Loov;
      // 207: athrow
      // 208: aload 1
      // 209: aload 9
      // 20b: aload 3
      // 20c: bipush 3
      // 20d: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 210: goto 217
      // 213: invokestatic hrd.a (Loov;)Loov;
      // 216: athrow
      // 217: pop
      // 218: aload 1
      // 219: aload 2
      // 21a: aload 3
      // 21b: bipush 3
      // 21c: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 21f: pop
      // 220: aload 5
      // 222: invokevirtual erg.x4w ()Z
      // 225: ifeq 257
      // 228: aload 1
      // 229: aload 2
      // 22a: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 22d: astore 16
      // 22f: aload 16
      // 231: iload 6
      // 233: ifeq 24c
      // 236: instanceof net/minecraft/tileentity/TileEntityChest
      // 239: ifeq 257
      // 23c: goto 243
      // 23f: invokestatic hrd.a (Loov;)Loov;
      // 242: athrow
      // 243: aload 16
      // 245: goto 24c
      // 248: invokestatic hrd.a (Loov;)Loov;
      // 24b: athrow
      // 24c: checkcast net/minecraft/tileentity/TileEntityChest
      // 24f: aload 5
      // 251: invokevirtual erg.zow ()Ljava/lang/String;
      // 254: invokevirtual net/minecraft/tileentity/TileEntityChest.id8 (Ljava/lang/String;)V
      // 257: return
   }

   public zfz fro(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: aload 1
      // 006: iload 4
      // 008: ifeq 01f
      // 00b: getfield t9d.v0f Z
      // 00e: ifeq 01e
      // 011: goto 018
      // 014: invokestatic hrd.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 3
      // 019: areturn
      // 01a: invokestatic hrd.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 1
      // 01f: aload 2
      // 020: invokevirtual mew.idu ()Lmew;
      // 023: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 026: astore 5
      // 028: aload 1
      // 029: aload 2
      // 02a: invokevirtual mew.z6x ()Lmew;
      // 02d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 030: astore 6
      // 032: aload 1
      // 033: aload 2
      // 034: invokevirtual mew.y8e ()Lmew;
      // 037: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 03a: astore 7
      // 03c: aload 1
      // 03d: aload 2
      // 03e: invokevirtual mew.o_8 ()Lmew;
      // 041: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 044: astore 8
      // 046: aload 3
      // 047: getstatic hrd.gse Lqx_;
      // 04a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 04f: checkcast vt2
      // 052: astore 9
      // 054: aload 5
      // 056: invokeinterface zfz.r_y ()Le0x; 1
      // 05b: astore 10
      // 05d: aload 6
      // 05f: invokeinterface zfz.r_y ()Le0x; 1
      // 064: astore 11
      // 066: aload 7
      // 068: invokeinterface zfz.r_y ()Le0x; 1
      // 06d: astore 12
      // 06f: aload 8
      // 071: invokeinterface zfz.r_y ()Le0x; 1
      // 076: astore 13
      // 078: aload 10
      // 07a: aload 0
      // 07b: iload 4
      // 07d: ifeq 239
      // 080: if_acmpeq 22f
      // 083: goto 08a
      // 086: invokestatic hrd.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 11
      // 08c: aload 0
      // 08d: iload 4
      // 08f: ifeq 239
      // 092: goto 099
      // 095: invokestatic hrd.a (Loov;)Loov;
      // 098: athrow
      // 099: if_acmpeq 22f
      // 09c: goto 0a3
      // 09f: invokestatic hrd.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 10
      // 0a5: invokevirtual e0x.z4c ()Z
      // 0a8: istore 14
      // 0aa: aload 11
      // 0ac: invokevirtual e0x.z4c ()Z
      // 0af: istore 15
      // 0b1: aload 12
      // 0b3: aload 0
      // 0b4: iload 4
      // 0b6: ifeq 0e6
      // 0b9: if_acmpeq 0dc
      // 0bc: goto 0c3
      // 0bf: invokestatic hrd.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 13
      // 0c5: aload 0
      // 0c6: iload 4
      // 0c8: ifeq 0e6
      // 0cb: goto 0d2
      // 0ce: invokestatic hrd.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: if_acmpne 22a
      // 0d5: goto 0dc
      // 0d8: invokestatic hrd.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 12
      // 0de: aload 0
      // 0df: goto 0e6
      // 0e2: invokestatic hrd.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: if_acmpne 0f4
      // 0e9: aload 2
      // 0ea: invokevirtual mew.y8e ()Lmew;
      // 0ed: goto 0f8
      // 0f0: invokestatic hrd.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: aload 2
      // 0f5: invokevirtual mew.o_8 ()Lmew;
      // 0f8: astore 16
      // 0fa: aload 1
      // 0fb: aload 16
      // 0fd: invokevirtual mew.idu ()Lmew;
      // 100: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 103: astore 17
      // 105: aload 1
      // 106: aload 16
      // 108: invokevirtual mew.z6x ()Lmew;
      // 10b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 10e: astore 18
      // 110: getstatic vt2.mxp Lvt2;
      // 113: iload 4
      // 115: ifeq 148
      // 118: astore 9
      // 11a: aload 12
      // 11c: aload 0
      // 11d: if_acmpne 134
      // 120: aload 7
      // 122: getstatic hrd.gse Lqx_;
      // 125: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 12a: checkcast vt2
      // 12d: astore 19
      // 12f: iload 4
      // 131: ifne 14a
      // 134: aload 8
      // 136: getstatic hrd.gse Lqx_;
      // 139: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13e: checkcast vt2
      // 141: goto 148
      // 144: invokestatic hrd.a (Loov;)Loov;
      // 147: athrow
      // 148: astore 19
      // 14a: aload 19
      // 14c: iload 4
      // 14e: ifeq 168
      // 151: getstatic vt2.z9q Lvt2;
      // 154: if_acmpne 16a
      // 157: goto 15e
      // 15a: invokestatic hrd.a (Loov;)Loov;
      // 15d: athrow
      // 15e: getstatic vt2.z9q Lvt2;
      // 161: goto 168
      // 164: invokestatic hrd.a (Loov;)Loov;
      // 167: athrow
      // 168: astore 9
      // 16a: aload 17
      // 16c: invokeinterface zfz.r_y ()Le0x; 1
      // 171: astore 20
      // 173: aload 18
      // 175: invokeinterface zfz.r_y ()Le0x; 1
      // 17a: astore 21
      // 17c: iload 14
      // 17e: iload 4
      // 180: ifeq 1aa
      // 183: ifne 1a8
      // 186: goto 18d
      // 189: invokestatic hrd.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 20
      // 18f: invokevirtual e0x.z4c ()Z
      // 192: iload 4
      // 194: ifeq 1db
      // 197: goto 19e
      // 19a: invokestatic hrd.a (Loov;)Loov;
      // 19d: athrow
      // 19e: ifeq 1d9
      // 1a1: goto 1a8
      // 1a4: invokestatic hrd.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: iload 15
      // 1aa: iload 4
      // 1ac: ifeq 1db
      // 1af: ifne 1d9
      // 1b2: goto 1b9
      // 1b5: invokestatic hrd.a (Loov;)Loov;
      // 1b8: athrow
      // 1b9: aload 21
      // 1bb: invokevirtual e0x.z4c ()Z
      // 1be: iload 4
      // 1c0: ifeq 1db
      // 1c3: goto 1ca
      // 1c6: invokestatic hrd.a (Loov;)Loov;
      // 1c9: athrow
      // 1ca: ifne 1d9
      // 1cd: goto 1d4
      // 1d0: invokestatic hrd.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: getstatic vt2.mxp Lvt2;
      // 1d7: astore 9
      // 1d9: iload 15
      // 1db: iload 4
      // 1dd: ifeq 207
      // 1e0: ifne 205
      // 1e3: goto 1ea
      // 1e6: invokestatic hrd.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: aload 21
      // 1ec: invokevirtual e0x.z4c ()Z
      // 1ef: iload 4
      // 1f1: ifeq 207
      // 1f4: goto 1fb
      // 1f7: invokestatic hrd.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: ifeq 22a
      // 1fe: goto 205
      // 201: invokestatic hrd.a (Loov;)Loov;
      // 204: athrow
      // 205: iload 14
      // 207: iload 4
      // 209: ifeq 222
      // 20c: ifne 22a
      // 20f: goto 216
      // 212: invokestatic hrd.a (Loov;)Loov;
      // 215: athrow
      // 216: aload 20
      // 218: invokevirtual e0x.z4c ()Z
      // 21b: goto 222
      // 21e: invokestatic hrd.a (Loov;)Loov;
      // 221: athrow
      // 222: ifne 22a
      // 225: getstatic vt2.z9q Lvt2;
      // 228: astore 9
      // 22a: iload 4
      // 22c: ifne 3a3
      // 22f: aload 10
      // 231: aload 0
      // 232: goto 239
      // 235: invokestatic hrd.a (Loov;)Loov;
      // 238: athrow
      // 239: if_acmpne 247
      // 23c: aload 2
      // 23d: invokevirtual mew.idu ()Lmew;
      // 240: goto 24b
      // 243: invokestatic hrd.a (Loov;)Loov;
      // 246: athrow
      // 247: aload 2
      // 248: invokevirtual mew.z6x ()Lmew;
      // 24b: astore 14
      // 24d: aload 1
      // 24e: aload 14
      // 250: invokevirtual mew.y8e ()Lmew;
      // 253: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 256: astore 15
      // 258: aload 1
      // 259: aload 14
      // 25b: invokevirtual mew.o_8 ()Lmew;
      // 25e: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 261: astore 16
      // 263: getstatic vt2.zk4 Lvt2;
      // 266: iload 4
      // 268: ifeq 29b
      // 26b: astore 9
      // 26d: aload 10
      // 26f: aload 0
      // 270: if_acmpne 287
      // 273: aload 5
      // 275: getstatic hrd.gse Lqx_;
      // 278: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 27d: checkcast vt2
      // 280: astore 17
      // 282: iload 4
      // 284: ifne 29d
      // 287: aload 6
      // 289: getstatic hrd.gse Lqx_;
      // 28c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 291: checkcast vt2
      // 294: goto 29b
      // 297: invokestatic hrd.a (Loov;)Loov;
      // 29a: athrow
      // 29b: astore 17
      // 29d: aload 17
      // 29f: iload 4
      // 2a1: ifeq 2bb
      // 2a4: getstatic vt2.te4 Lvt2;
      // 2a7: if_acmpne 2bd
      // 2aa: goto 2b1
      // 2ad: invokestatic hrd.a (Loov;)Loov;
      // 2b0: athrow
      // 2b1: getstatic vt2.te4 Lvt2;
      // 2b4: goto 2bb
      // 2b7: invokestatic hrd.a (Loov;)Loov;
      // 2ba: athrow
      // 2bb: astore 9
      // 2bd: aload 15
      // 2bf: invokeinterface zfz.r_y ()Le0x; 1
      // 2c4: astore 18
      // 2c6: aload 16
      // 2c8: invokeinterface zfz.r_y ()Le0x; 1
      // 2cd: astore 19
      // 2cf: aload 12
      // 2d1: invokevirtual e0x.z4c ()Z
      // 2d4: iload 4
      // 2d6: ifeq 30a
      // 2d9: ifne 2fe
      // 2dc: goto 2e3
      // 2df: invokestatic hrd.a (Loov;)Loov;
      // 2e2: athrow
      // 2e3: aload 18
      // 2e5: invokevirtual e0x.z4c ()Z
      // 2e8: iload 4
      // 2ea: ifeq 33e
      // 2ed: goto 2f4
      // 2f0: invokestatic hrd.a (Loov;)Loov;
      // 2f3: athrow
      // 2f4: ifeq 339
      // 2f7: goto 2fe
      // 2fa: invokestatic hrd.a (Loov;)Loov;
      // 2fd: athrow
      // 2fe: aload 13
      // 300: invokevirtual e0x.z4c ()Z
      // 303: goto 30a
      // 306: invokestatic hrd.a (Loov;)Loov;
      // 309: athrow
      // 30a: iload 4
      // 30c: ifeq 33e
      // 30f: ifne 339
      // 312: goto 319
      // 315: invokestatic hrd.a (Loov;)Loov;
      // 318: athrow
      // 319: aload 19
      // 31b: invokevirtual e0x.z4c ()Z
      // 31e: iload 4
      // 320: ifeq 33e
      // 323: goto 32a
      // 326: invokestatic hrd.a (Loov;)Loov;
      // 329: athrow
      // 32a: ifne 339
      // 32d: goto 334
      // 330: invokestatic hrd.a (Loov;)Loov;
      // 333: athrow
      // 334: getstatic vt2.zk4 Lvt2;
      // 337: astore 9
      // 339: aload 13
      // 33b: invokevirtual e0x.z4c ()Z
      // 33e: iload 4
      // 340: ifeq 374
      // 343: ifne 368
      // 346: goto 34d
      // 349: invokestatic hrd.a (Loov;)Loov;
      // 34c: athrow
      // 34d: aload 19
      // 34f: invokevirtual e0x.z4c ()Z
      // 352: iload 4
      // 354: ifeq 3b6
      // 357: goto 35e
      // 35a: invokestatic hrd.a (Loov;)Loov;
      // 35d: athrow
      // 35e: ifeq 3a3
      // 361: goto 368
      // 364: invokestatic hrd.a (Loov;)Loov;
      // 367: athrow
      // 368: aload 12
      // 36a: invokevirtual e0x.z4c ()Z
      // 36d: goto 374
      // 370: invokestatic hrd.a (Loov;)Loov;
      // 373: athrow
      // 374: iload 4
      // 376: ifeq 3b6
      // 379: ifne 3a3
      // 37c: goto 383
      // 37f: invokestatic hrd.a (Loov;)Loov;
      // 382: athrow
      // 383: aload 18
      // 385: invokevirtual e0x.z4c ()Z
      // 388: iload 4
      // 38a: ifeq 3b6
      // 38d: goto 394
      // 390: invokestatic hrd.a (Loov;)Loov;
      // 393: athrow
      // 394: ifne 3a3
      // 397: goto 39e
      // 39a: invokestatic hrd.a (Loov;)Loov;
      // 39d: athrow
      // 39e: getstatic vt2.te4 Lvt2;
      // 3a1: astore 9
      // 3a3: aload 3
      // 3a4: getstatic hrd.gse Lqx_;
      // 3a7: aload 9
      // 3a9: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3ae: astore 3
      // 3af: aload 1
      // 3b0: aload 2
      // 3b1: aload 3
      // 3b2: bipush 3
      // 3b3: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 3b6: pop
      // 3b7: aload 3
      // 3b8: areturn
   }

   public zfz a1g(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 5
      // 003: invokestatic t9d.c ()I
      // 006: getstatic vt2$unz.fzl Lvt2$unz;
      // 009: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 00c: astore 6
      // 00e: istore 4
      // 010: aload 6
      // 012: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 017: ifeq 08f
      // 01a: aload 6
      // 01c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 021: checkcast vt2
      // 024: astore 7
      // 026: aload 1
      // 027: aload 2
      // 028: aload 7
      // 02a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 02d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 030: astore 8
      // 032: aload 8
      // 034: iload 4
      // 036: ifne 0b4
      // 039: invokeinterface zfz.r_y ()Le0x; 1
      // 03e: iload 4
      // 040: ifne 062
      // 043: goto 04a
      // 046: invokestatic hrd.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 0
      // 04b: if_acmpne 05b
      // 04e: goto 055
      // 051: invokestatic hrd.a (Loov;)Loov;
      // 054: athrow
      // 055: aload 3
      // 056: areturn
      // 057: invokestatic hrd.a (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 8
      // 05d: invokeinterface zfz.r_y ()Le0x; 1
      // 062: invokevirtual e0x.z4c ()Z
      // 065: ifeq 08a
      // 068: aload 5
      // 06a: iload 4
      // 06c: ifne 088
      // 06f: goto 076
      // 072: invokestatic hrd.a (Loov;)Loov;
      // 075: athrow
      // 076: ifnull 086
      // 079: goto 080
      // 07c: invokestatic hrd.a (Loov;)Loov;
      // 07f: athrow
      // 080: aconst_null
      // 081: astore 5
      // 083: goto 08f
      // 086: aload 7
      // 088: astore 5
      // 08a: iload 4
      // 08c: ifeq 010
      // 08f: aload 5
      // 091: iload 4
      // 093: ifne 0bf
      // 096: ifnull 0b3
      // 099: goto 0a0
      // 09c: invokestatic hrd.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: aload 3
      // 0a1: getstatic hrd.gse Lqx_;
      // 0a4: aload 5
      // 0a6: invokevirtual vt2.b4b ()Lvt2;
      // 0a9: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0ae: areturn
      // 0af: invokestatic hrd.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 3
      // 0b4: getstatic hrd.gse Lqx_;
      // 0b7: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0bc: checkcast vt2
      // 0bf: astore 6
      // 0c1: aload 1
      // 0c2: aload 2
      // 0c3: aload 6
      // 0c5: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0c8: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0cb: invokeinterface zfz.r_y ()Le0x; 1
      // 0d0: invokevirtual e0x.z4c ()Z
      // 0d3: iload 4
      // 0d5: ifne 0fb
      // 0d8: ifeq 0e9
      // 0db: goto 0e2
      // 0de: invokestatic hrd.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: aload 6
      // 0e4: invokevirtual vt2.b4b ()Lvt2;
      // 0e7: astore 6
      // 0e9: aload 1
      // 0ea: aload 2
      // 0eb: aload 6
      // 0ed: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0f0: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0f3: invokeinterface zfz.r_y ()Le0x; 1
      // 0f8: invokevirtual e0x.z4c ()Z
      // 0fb: iload 4
      // 0fd: ifne 12f
      // 100: ifeq 111
      // 103: goto 10a
      // 106: invokestatic hrd.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 6
      // 10c: invokevirtual vt2.drv ()Lvt2;
      // 10f: astore 6
      // 111: aload 1
      // 112: aload 2
      // 113: aload 6
      // 115: invokevirtual mew.offset (Lvt2;)Lmew;
      // 118: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 11b: iload 4
      // 11d: ifne 144
      // 120: invokeinterface zfz.r_y ()Le0x; 1
      // 125: invokevirtual e0x.z4c ()Z
      // 128: goto 12f
      // 12b: invokestatic hrd.a (Loov;)Loov;
      // 12e: athrow
      // 12f: ifeq 139
      // 132: aload 6
      // 134: invokevirtual vt2.b4b ()Lvt2;
      // 137: astore 6
      // 139: aload 3
      // 13a: getstatic hrd.gse Lqx_;
      // 13d: aload 6
      // 13f: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 144: areturn
   }

   @Override
   public boolean ctq(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 4
      // 003: aload 2
      // 004: invokevirtual mew.y8e ()Lmew;
      // 007: astore 5
      // 009: invokestatic t9d.c ()I
      // 00c: aload 2
      // 00d: invokevirtual mew.o_8 ()Lmew;
      // 010: astore 6
      // 012: istore 3
      // 013: aload 2
      // 014: invokevirtual mew.idu ()Lmew;
      // 017: astore 7
      // 019: aload 2
      // 01a: invokevirtual mew.z6x ()Lmew;
      // 01d: astore 8
      // 01f: aload 1
      // 020: aload 5
      // 022: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 025: invokeinterface zfz.r_y ()Le0x; 1
      // 02a: aload 0
      // 02b: iload 3
      // 02c: ifne 066
      // 02f: if_acmpne 05a
      // 032: goto 039
      // 035: invokestatic hrd.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 0
      // 03a: aload 1
      // 03b: aload 5
      // 03d: invokespecial hrd.psb (Lt9d;Lmew;)Z
      // 040: iload 3
      // 041: ifne 056
      // 044: goto 04b
      // 047: invokestatic hrd.a (Loov;)Loov;
      // 04a: athrow
      // 04b: ifeq 057
      // 04e: goto 055
      // 051: invokestatic hrd.a (Loov;)Loov;
      // 054: athrow
      // 055: bipush 0
      // 056: ireturn
      // 057: iinc 4 1
      // 05a: aload 1
      // 05b: aload 6
      // 05d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 060: invokeinterface zfz.r_y ()Le0x; 1
      // 065: aload 0
      // 066: iload 3
      // 067: ifne 0a1
      // 06a: if_acmpne 095
      // 06d: goto 074
      // 070: invokestatic hrd.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: aload 1
      // 076: aload 6
      // 078: invokespecial hrd.psb (Lt9d;Lmew;)Z
      // 07b: iload 3
      // 07c: ifne 091
      // 07f: goto 086
      // 082: invokestatic hrd.a (Loov;)Loov;
      // 085: athrow
      // 086: ifeq 092
      // 089: goto 090
      // 08c: invokestatic hrd.a (Loov;)Loov;
      // 08f: athrow
      // 090: bipush 0
      // 091: ireturn
      // 092: iinc 4 1
      // 095: aload 1
      // 096: aload 7
      // 098: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 09b: invokeinterface zfz.r_y ()Le0x; 1
      // 0a0: aload 0
      // 0a1: iload 3
      // 0a2: ifne 0dc
      // 0a5: if_acmpne 0d0
      // 0a8: goto 0af
      // 0ab: invokestatic hrd.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: aload 7
      // 0b3: invokespecial hrd.psb (Lt9d;Lmew;)Z
      // 0b6: iload 3
      // 0b7: ifne 0cc
      // 0ba: goto 0c1
      // 0bd: invokestatic hrd.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: ifeq 0cd
      // 0c4: goto 0cb
      // 0c7: invokestatic hrd.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: bipush 0
      // 0cc: ireturn
      // 0cd: iinc 4 1
      // 0d0: aload 1
      // 0d1: aload 8
      // 0d3: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0d6: invokeinterface zfz.r_y ()Le0x; 1
      // 0db: aload 0
      // 0dc: if_acmpne 100
      // 0df: aload 0
      // 0e0: aload 1
      // 0e1: aload 8
      // 0e3: invokespecial hrd.psb (Lt9d;Lmew;)Z
      // 0e6: iload 3
      // 0e7: ifne 0fc
      // 0ea: goto 0f1
      // 0ed: invokestatic hrd.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: ifeq 0fd
      // 0f4: goto 0fb
      // 0f7: invokestatic hrd.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: bipush 0
      // 0fc: ireturn
      // 0fd: iinc 4 1
      // 100: iload 4
      // 102: iload 3
      // 103: ifne 119
      // 106: bipush 1
      // 107: if_icmpgt 11c
      // 10a: goto 111
      // 10d: invokestatic hrd.a (Loov;)Loov;
      // 110: athrow
      // 111: bipush 1
      // 112: goto 119
      // 115: invokestatic hrd.a (Loov;)Loov;
      // 118: athrow
      // 119: goto 11d
      // 11c: bipush 0
      // 11d: ireturn
   }

   private boolean psb(t9d var1, mew var2) {
      int var3 = t9d.b();

      try {
         if (var1.getBlockState(var2).r_y() != this) {
            return false;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      for (vt2 var5 : vt2$unz.fzl) {
         try {
            if (var1.getBlockState(var2.offset(var5)).r_y() == this) {
               return true;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         if (var3 == 0) {
            break;
         }
      }

      return false;
   }

   @Override
   public void z3l(t9d param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: aload 4
      // 06: invokespecial rw8.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // 09: invokestatic t9d.c ()I
      // 0c: aload 1
      // 0d: aload 2
      // 0e: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 11: astore 6
      // 13: istore 5
      // 15: aload 6
      // 17: iload 5
      // 19: ifne 32
      // 1c: instanceof net/minecraft/tileentity/TileEntityChest
      // 1f: ifeq 35
      // 22: goto 29
      // 25: invokestatic hrd.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 6
      // 2b: goto 32
      // 2e: invokestatic hrd.a (Loov;)Loov;
      // 31: athrow
      // 32: invokevirtual pyk.xur ()V
      // 35: return
   }

   @Override
   public void b8f(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 0a: astore 5
      // 0c: iload 4
      // 0e: ifne 3e
      // 11: aload 5
      // 13: instanceof rsi
      // 16: ifeq 37
      // 19: goto 20
      // 1c: invokestatic hrd.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: aload 2
      // 22: aload 5
      // 24: checkcast rsi
      // 27: invokestatic py1.hkj (Lt9d;Lmew;Lrsi;)V
      // 2a: aload 1
      // 2b: aload 2
      // 2c: aload 0
      // 2d: invokevirtual t9d.lw8 (Lmew;Le0x;)V
      // 30: goto 37
      // 33: invokestatic hrd.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: aload 2
      // 3a: aload 3
      // 3b: invokespecial rw8.b8f (Lt9d;Lmew;Lzfz;)V
      // 3e: return
   }

   @Override
   public boolean cl2(t9d param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 9
      // 05: aload 1
      // 06: getfield t9d.v0f Z
      // 09: iload 9
      // 0b: ifne 19
      // 0e: ifeq 1a
      // 11: goto 18
      // 14: invokestatic hrd.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: aload 0
      // 1b: aload 1
      // 1c: aload 2
      // 1d: invokevirtual hrd.ffe (Lt9d;Lmew;)Lfl3;
      // 20: astore 10
      // 22: iload 9
      // 24: ifne 41
      // 27: aload 10
      // 29: ifnull 92
      // 2c: goto 33
      // 2f: invokestatic hrd.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 4
      // 35: aload 10
      // 37: invokevirtual ha9.a_o (Lrsi;)V
      // 3a: goto 41
      // 3d: invokestatic hrd.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: getfield hrd.whs I
      // 45: iload 9
      // 47: ifne 73
      // 4a: ifne 68
      // 4d: goto 54
      // 50: invokestatic hrd.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 4
      // 56: getstatic l9p.gb7 L_ss;
      // 59: invokevirtual ha9.aex (L_ss;)V
      // 5c: iload 9
      // 5e: ifeq 92
      // 61: goto 68
      // 64: invokestatic hrd.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: getfield hrd.whs I
      // 6c: goto 73
      // 6f: invokestatic hrd.a (Loov;)Loov;
      // 72: athrow
      // 73: iload 9
      // 75: ifne 93
      // 78: bipush 1
      // 79: if_icmpne 92
      // 7c: goto 83
      // 7f: invokestatic hrd.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 4
      // 85: getstatic l9p.e4_ L_ss;
      // 88: invokevirtual ha9.aex (L_ss;)V
      // 8b: goto 92
      // 8e: invokestatic hrd.a (Loov;)Loov;
      // 91: athrow
      // 92: bipush 1
      // 93: ireturn
   }

   public fl3 ffe(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hrd.b J
      // 003: ldc2_w 68107851541566
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 1
      // 00e: aload 2
      // 00f: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 012: astore 6
      // 014: aload 6
      // 016: iload 5
      // 018: ifeq 030
      // 01b: instanceof net/minecraft/tileentity/TileEntityChest
      // 01e: ifne 02e
      // 021: goto 028
      // 024: invokestatic hrd.a (Loov;)Loov;
      // 027: athrow
      // 028: aconst_null
      // 029: areturn
      // 02a: invokestatic hrd.a (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 6
      // 030: checkcast net/minecraft/tileentity/TileEntityChest
      // 033: astore 7
      // 035: aload 0
      // 036: aload 1
      // 037: aload 2
      // 038: invokespecial hrd.r1l (Lt9d;Lmew;)Z
      // 03b: ifeq 044
      // 03e: aconst_null
      // 03f: areturn
      // 040: invokestatic hrd.a (Loov;)Loov;
      // 043: athrow
      // 044: getstatic vt2$unz.fzl Lvt2$unz;
      // 047: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 04a: astore 8
      // 04c: aload 8
      // 04e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 053: ifeq 114
      // 056: aload 8
      // 058: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05d: checkcast vt2
      // 060: astore 9
      // 062: aload 2
      // 063: aload 9
      // 065: invokevirtual mew.offset (Lvt2;)Lmew;
      // 068: astore 10
      // 06a: aload 1
      // 06b: aload 10
      // 06d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 070: invokeinterface zfz.r_y ()Le0x; 1
      // 075: astore 11
      // 077: aload 11
      // 079: aload 0
      // 07a: if_acmpne 10f
      // 07d: aload 0
      // 07e: aload 1
      // 07f: aload 10
      // 081: invokespecial hrd.r1l (Lt9d;Lmew;)Z
      // 084: ifeq 094
      // 087: goto 08e
      // 08a: invokestatic hrd.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aconst_null
      // 08f: areturn
      // 090: invokestatic hrd.a (Loov;)Loov;
      // 093: athrow
      // 094: aload 1
      // 095: aload 10
      // 097: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 09a: astore 12
      // 09c: aload 12
      // 09e: instanceof net/minecraft/tileentity/TileEntityChest
      // 0a1: ifeq 10f
      // 0a4: aload 9
      // 0a6: getstatic vt2.te4 Lvt2;
      // 0a9: iload 5
      // 0ab: ifeq 0cb
      // 0ae: goto 0b5
      // 0b1: invokestatic hrd.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: if_acmpeq 0f1
      // 0b8: goto 0bf
      // 0bb: invokestatic hrd.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 9
      // 0c1: getstatic vt2.z9q Lvt2;
      // 0c4: goto 0cb
      // 0c7: invokestatic hrd.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: if_acmpeq 0f1
      // 0ce: new xd0
      // 0d1: dup
      // 0d2: sipush 24014
      // 0d5: ldc2_w 1656975119687722025
      // 0d8: lload 3
      // 0d9: lxor
      // 0da: invokedynamic m (IJ)Ljava/lang/String; bsm=hrd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: aload 7
      // 0e2: aload 12
      // 0e4: checkcast net/minecraft/tileentity/TileEntityChest
      // 0e7: invokespecial xd0.<init> (Ljava/lang/String;Lfl3;Lfl3;)V
      // 0ea: astore 7
      // 0ec: iload 5
      // 0ee: ifne 10f
      // 0f1: new xd0
      // 0f4: dup
      // 0f5: sipush 31643
      // 0f8: ldc2_w 4212461713390371453
      // 0fb: lload 3
      // 0fc: lxor
      // 0fd: invokedynamic m (IJ)Ljava/lang/String; bsm=hrd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: nop
      // 103: aload 12
      // 105: checkcast net/minecraft/tileentity/TileEntityChest
      // 108: aload 7
      // 10a: invokespecial xd0.<init> (Ljava/lang/String;Lfl3;Lfl3;)V
      // 10d: astore 7
      // 10f: iload 5
      // 111: ifne 04c
      // 114: aload 7
      // 116: areturn
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return new TileEntityChest();
   }

   @Override
   public boolean scl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hrd.whs I
      // 08: iload 1
      // 09: ifne 1f
      // 0c: bipush 1
      // 0d: if_icmpne 22
      // 10: goto 17
      // 13: invokestatic hrd.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic hrd.a (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   @Override
   public int gpi(m5n param1, mew param2, zfz param3, vt2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: invokevirtual hrd.scl ()Z
      // 09: iload 5
      // 0b: ifeq 1f
      // 0e: ifne 1e
      // 11: goto 18
      // 14: invokestatic hrd.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 0
      // 19: ireturn
      // 1a: invokestatic hrd.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: istore 6
      // 21: aload 1
      // 22: aload 2
      // 23: invokeinterface m5n.getTileEntity (Lmew;)Lpyk; 2
      // 28: astore 7
      // 2a: aload 7
      // 2c: instanceof net/minecraft/tileentity/TileEntityChest
      // 2f: iload 5
      // 31: ifeq 50
      // 34: ifeq 48
      // 37: goto 3e
      // 3a: invokestatic hrd.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 7
      // 40: checkcast net/minecraft/tileentity/TileEntityChest
      // 43: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 46: istore 6
      // 48: iload 6
      // 4a: bipush 0
      // 4b: bipush 15
      // 4d: invokestatic fe6.faa (III)I
      // 50: ireturn
   }

   @Override
   public int sqt(m5n var1, mew var2, zfz var3, vt2 var4) {
      try {
         if (var4 == vt2.rf3) {
            return this.gpi(var1, var2, var3, var4);
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return 0;
   }

   private boolean r1l(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial hrd.g5q (Lt9d;Lmew;)Z
      // 0a: iload 3
      // 0b: ifeq 34
      // 0e: ifne 33
      // 11: goto 18
      // 14: invokestatic hrd.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokespecial hrd.b8k (Lt9d;Lmew;)Z
      // 1e: iload 3
      // 1f: ifeq 34
      // 22: goto 29
      // 25: invokestatic hrd.a (Loov;)Loov;
      // 28: athrow
      // 29: ifeq 37
      // 2c: goto 33
      // 2f: invokestatic hrd.a (Loov;)Loov;
      // 32: athrow
      // 33: bipush 1
      // 34: goto 38
      // 37: bipush 0
      // 38: ireturn
   }

   private boolean g5q(t9d var1, mew var2) {
      return var1.getBlockState(var2.nuv()).r_y().y0n();
   }

   private boolean b8k(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: ldc hu3
      // 07: nop
      // 08: new nh4
      // 0b: dup
      // 0c: aload 2
      // 0d: invokevirtual mew.getX ()I
      // 10: i2d
      // 11: aload 2
      // 12: invokevirtual mew.getY ()I
      // 15: bipush 1
      // 16: iadd
      // 17: i2d
      // 18: aload 2
      // 19: invokevirtual mew.getZ ()I
      // 1c: i2d
      // 1d: aload 2
      // 1e: invokevirtual mew.getX ()I
      // 21: bipush 1
      // 22: iadd
      // 23: i2d
      // 24: aload 2
      // 25: invokevirtual mew.getY ()I
      // 28: bipush 2
      // 29: iadd
      // 2a: i2d
      // 2b: aload 2
      // 2c: invokevirtual mew.getZ ()I
      // 2f: bipush 1
      // 30: iadd
      // 31: i2d
      // 32: invokespecial nh4.<init> (DDDDDD)V
      // 35: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 38: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3d: astore 4
      // 3f: aload 4
      // 41: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 46: ifeq 80
      // 49: aload 4
      // 4b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 50: checkcast i2h
      // 53: astore 5
      // 55: aload 5
      // 57: checkcast hu3
      // 5a: astore 6
      // 5c: aload 6
      // 5e: invokevirtual hu3.ird ()Z
      // 61: iload 3
      // 62: ifne 81
      // 65: iload 3
      // 66: ifne 7b
      // 69: goto 70
      // 6c: invokestatic hrd.a (Loov;)Loov;
      // 6f: athrow
      // 70: ifeq 7c
      // 73: goto 7a
      // 76: invokestatic hrd.a (Loov;)Loov;
      // 79: athrow
      // 7a: bipush 1
      // 7b: ireturn
      // 7c: iload 3
      // 7d: ifeq 3f
      // 80: bipush 0
      // 81: ireturn
   }

   @Override
   public boolean ge5() {
      return true;
   }

   @Override
   public int mya(t9d var1, mew var2) {
      return _jc.ngl(this.ffe(var1, var2));
   }

   @Override
   public zfz kig(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: invokestatic vt2.jw6 (I)Lvt2;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifeq 28
      // 0e: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 11: getstatic vt2$y0s.abn Lvt2$y0s;
      // 14: if_acmpne 29
      // 17: goto 1e
      // 1a: invokestatic hrd.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic vt2.z9q Lvt2;
      // 21: goto 28
      // 24: invokestatic hrd.a (Loov;)Loov;
      // 27: athrow
      // 28: astore 3
      // 29: aload 0
      // 2a: invokevirtual hrd.l4i ()Lzfz;
      // 2d: getstatic hrd.gse Lqx_;
      // 30: aload 3
      // 31: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 36: areturn
   }

   @Override
   public int hvp(zfz var1) {
      return ((vt2)var1.dil(gse)).c3s();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{gse});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8124301534664658754L, -4763317710658088027L, MethodHandles.lookup().lookupClass()).a(263938667795796L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 100981163864116L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "âú¿ÔÑ§=úÄ\u0081\u001fBÄºÁµG\u0087Â\t&\u001c¯nx7GÒè\u0094T*ó·¯N\u0018¼¬6(Ò\u000f<\u0006g\u001b×ôw|6çá\u009amÖó©½\u0017\u0098\u001cMtñ\u0093¯£Ü\u00ad³\u008dËÄoö\\rzÌ\u0010<\u0019ã\t<Zçâ_È\r\u008aWiïã";
      int var6 = "âú¿ÔÑ§=úÄ\u0081\u001fBÄºÁµG\u0087Â\t&\u001c¯nx7GÒè\u0094T*ó·¯N\u0018¼¬6(Ò\u000f<\u0006g\u001b×ôw|6çá\u009amÖó©½\u0017\u0098\u001cMtñ\u0093¯£Ü\u00ad³\u008dËÄoö\\rzÌ\u0010<\u0019ã\t<Zçâ_È\r\u008aWiïã"
         .length();
      char var3 = '(';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[3];
            gse = qx_.q0o(b<"m">(6797, 2143707720599404387L ^ var9), vt2$unz.fzl);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9761;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("hrd", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("hrd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
