import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f5a$yqd {
   private final ucr phw;
   private final p9u o8y;
   private final gdz u4n;
   private final int[] pg1;
   public final f5a _be;
   private static final long a;
   private static final String b;

   private f5a$yqd(f5a var1, ucr var2) {
      long var3 = a ^ 52314459102322L;
      this._be = var1;
      super();
      this.phw = var2;
      int var10000 = OpaquePredicate.b();
      this.o8y = new p9u(128, 128);
      int var5 = var10000;
      this.pg1 = this.o8y.k8b();
      this.u4n = f5a.y66(var1).v5m(b + var2.tg4, this.o8y);
      int var6 = 0;

      while (var6 < this.pg1.length) {
         this.pg1[var6] = 0;
         var6++;
         if (var5 == 0) {
            break;
         }
      }
   }

   private void eht() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: sipush 16384
      // 0a: if_icmpge 7b
      // 0d: aload 0
      // 0e: getfield f5a$yqd.phw Lucr;
      // 11: getfield ucr.quz [B
      // 14: iload 2
      // 15: baload
      // 16: sipush 255
      // 19: iand
      // 1a: istore 3
      // 1b: iload 1
      // 1c: ifne 82
      // 1f: iload 1
      // 20: ifne 56
      // 23: goto 2a
      // 26: invokestatic f5a$yqd.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 3
      // 2b: bipush 4
      // 2c: idiv
      // 2d: ifne 5a
      // 30: goto 37
      // 33: invokestatic f5a$yqd.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield f5a$yqd.pg1 [I
      // 3b: iload 2
      // 3c: iload 2
      // 3d: iload 2
      // 3e: sipush 128
      // 41: idiv
      // 42: iadd
      // 43: bipush 1
      // 44: iand
      // 45: bipush 8
      // 47: imul
      // 48: bipush 16
      // 4a: iadd
      // 4b: bipush 24
      // 4d: ishl
      // 4e: iastore
      // 4f: goto 56
      // 52: invokestatic f5a$yqd.a (Loov;)Loov;
      // 55: athrow
      // 56: iload 1
      // 57: ifeq 74
      // 5a: aload 0
      // 5b: getfield f5a$yqd.pg1 [I
      // 5e: iload 2
      // 5f: getstatic _mi.ijo [L_mi;
      // 62: iload 3
      // 63: bipush 4
      // 64: idiv
      // 65: aaload
      // 66: iload 3
      // 67: bipush 3
      // 68: iand
      // 69: invokevirtual _mi.ghu (I)I
      // 6c: iastore
      // 6d: goto 74
      // 70: invokestatic f5a$yqd.a (Loov;)Loov;
      // 73: athrow
      // 74: iinc 2 1
      // 77: iload 1
      // 78: ifeq 06
      // 7b: aload 0
      // 7c: getfield f5a$yqd.o8y Lp9u;
      // 7f: invokevirtual p9u.oj6 ()V
      // 82: return
   }

   private void oaw(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 3
      // 002: bipush 0
      // 003: istore 4
      // 005: invokestatic jom.yut ()Ljom;
      // 008: astore 5
      // 00a: aload 5
      // 00c: invokevirtual jom.zuq ()Lq3g;
      // 00f: astore 6
      // 011: fconst_0
      // 012: fstore 7
      // 014: invokestatic OpaquePredicate.b ()I
      // 017: aload 0
      // 018: getfield f5a$yqd._be Lf5a;
      // 01b: invokestatic f5a.y66 (Lf5a;)Llc5;
      // 01e: aload 0
      // 01f: getfield f5a$yqd.u4n Lgdz;
      // 022: invokevirtual lc5.anl (Lgdz;)V
      // 025: invokestatic hzu.spd ()V
      // 028: bipush 1
      // 029: sipush 771
      // 02c: bipush 0
      // 02d: bipush 1
      // 02e: invokestatic hzu.u39 (IIII)V
      // 031: invokestatic hzu.vtj ()V
      // 034: aload 6
      // 036: bipush 7
      // 038: getstatic gnl._r5 Lbe7;
      // 03b: invokevirtual q3g.ezr (ILbe7;)V
      // 03e: aload 6
      // 040: iload 3
      // 041: bipush 0
      // 042: iadd
      // 043: i2f
      // 044: fload 7
      // 046: fadd
      // 047: f2d
      // 048: iload 4
      // 04a: sipush 128
      // 04d: iadd
      // 04e: i2f
      // 04f: fload 7
      // 051: fsub
      // 052: f2d
      // 053: ldc2_w -0.009999999776482582
      // 056: invokevirtual q3g.g5o (DDD)Lq3g;
      // 059: dconst_0
      // 05a: dconst_1
      // 05b: invokevirtual q3g.h0a (DD)Lq3g;
      // 05e: invokevirtual q3g.pzw ()V
      // 061: aload 6
      // 063: iload 3
      // 064: sipush 128
      // 067: iadd
      // 068: i2f
      // 069: fload 7
      // 06b: fsub
      // 06c: f2d
      // 06d: iload 4
      // 06f: sipush 128
      // 072: iadd
      // 073: i2f
      // 074: fload 7
      // 076: fsub
      // 077: f2d
      // 078: ldc2_w -0.009999999776482582
      // 07b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 07e: dconst_1
      // 07f: dconst_1
      // 080: invokevirtual q3g.h0a (DD)Lq3g;
      // 083: invokevirtual q3g.pzw ()V
      // 086: aload 6
      // 088: iload 3
      // 089: sipush 128
      // 08c: iadd
      // 08d: i2f
      // 08e: fload 7
      // 090: fsub
      // 091: f2d
      // 092: iload 4
      // 094: bipush 0
      // 095: iadd
      // 096: i2f
      // 097: fload 7
      // 099: fadd
      // 09a: f2d
      // 09b: ldc2_w -0.009999999776482582
      // 09e: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0a1: dconst_1
      // 0a2: dconst_0
      // 0a3: invokevirtual q3g.h0a (DD)Lq3g;
      // 0a6: invokevirtual q3g.pzw ()V
      // 0a9: aload 6
      // 0ab: iload 3
      // 0ac: bipush 0
      // 0ad: iadd
      // 0ae: i2f
      // 0af: fload 7
      // 0b1: fadd
      // 0b2: f2d
      // 0b3: iload 4
      // 0b5: bipush 0
      // 0b6: iadd
      // 0b7: i2f
      // 0b8: fload 7
      // 0ba: fadd
      // 0bb: f2d
      // 0bc: ldc2_w -0.009999999776482582
      // 0bf: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0c2: dconst_0
      // 0c3: dconst_0
      // 0c4: invokevirtual q3g.h0a (DD)Lq3g;
      // 0c7: invokevirtual q3g.pzw ()V
      // 0ca: istore 2
      // 0cb: aload 5
      // 0cd: invokevirtual jom.q7g ()V
      // 0d0: invokestatic hzu.if9 ()V
      // 0d3: invokestatic hzu.ux6 ()V
      // 0d6: aload 0
      // 0d7: getfield f5a$yqd._be Lf5a;
      // 0da: invokestatic f5a.y66 (Lf5a;)Llc5;
      // 0dd: invokestatic f5a.zix ()Lgdz;
      // 0e0: invokevirtual lc5.anl (Lgdz;)V
      // 0e3: bipush 0
      // 0e4: istore 8
      // 0e6: aload 0
      // 0e7: getfield f5a$yqd.phw Lucr;
      // 0ea: getfield ucr.xoj Ljava/util/Map;
      // 0ed: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 0f2: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0f7: astore 9
      // 0f9: aload 9
      // 0fb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 100: ifeq 26a
      // 103: aload 9
      // 105: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10a: checkcast lib
      // 10d: astore 10
      // 10f: iload 2
      // 110: ifeq 27e
      // 113: iload 1
      // 114: iload 2
      // 115: ifeq 1a2
      // 118: goto 11f
      // 11b: invokestatic f5a$yqd.a (Loov;)Loov;
      // 11e: athrow
      // 11f: ifeq 144
      // 122: goto 129
      // 125: invokestatic f5a$yqd.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 10
      // 12b: invokevirtual lib.c0r ()B
      // 12e: bipush 1
      // 12f: iload 2
      // 130: ifeq 17b
      // 133: goto 13a
      // 136: invokestatic f5a$yqd.a (Loov;)Loov;
      // 139: athrow
      // 13a: if_icmpne 266
      // 13d: goto 144
      // 140: invokestatic f5a$yqd.a (Loov;)Loov;
      // 143: athrow
      // 144: invokestatic hzu.dp2 ()V
      // 147: iload 3
      // 148: i2f
      // 149: aload 10
      // 14b: invokevirtual lib.fr4 ()B
      // 14e: i2f
      // 14f: fconst_2
      // 150: fdiv
      // 151: fadd
      // 152: ldc 64.0
      // 154: nop
      // 155: fadd
      // 156: iload 4
      // 158: i2f
      // 159: aload 10
      // 15b: invokevirtual lib.rxw ()B
      // 15e: i2f
      // 15f: fconst_2
      // 160: fdiv
      // 161: fadd
      // 162: ldc 64.0
      // 164: nop
      // 165: fadd
      // 166: ldc -0.02
      // 168: nop
      // 169: invokestatic hzu.a4k (FFF)V
      // 16c: aload 10
      // 16e: invokevirtual lib.txm ()B
      // 171: sipush 360
      // 174: goto 17b
      // 177: invokestatic f5a$yqd.a (Loov;)Loov;
      // 17a: athrow
      // 17b: imul
      // 17c: i2f
      // 17d: ldc 16.0
      // 17f: nop
      // 180: fdiv
      // 181: fconst_0
      // 182: fconst_0
      // 183: fconst_1
      // 184: invokestatic hzu.a2h (FFFF)V
      // 187: ldc 4.0
      // 189: nop
      // 18a: ldc 4.0
      // 18c: nop
      // 18d: ldc 3.0
      // 18f: nop
      // 190: invokestatic hzu.syc (FFF)V
      // 193: ldc -0.125
      // 195: nop
      // 196: ldc 0.125
      // 198: nop
      // 199: fconst_0
      // 19a: invokestatic hzu.a4k (FFF)V
      // 19d: aload 10
      // 19f: invokevirtual lib.c0r ()B
      // 1a2: istore 11
      // 1a4: iload 11
      // 1a6: bipush 4
      // 1a7: irem
      // 1a8: bipush 0
      // 1a9: iadd
      // 1aa: i2f
      // 1ab: ldc 4.0
      // 1ad: nop
      // 1ae: fdiv
      // 1af: fstore 12
      // 1b1: iload 11
      // 1b3: bipush 4
      // 1b4: idiv
      // 1b5: bipush 0
      // 1b6: iadd
      // 1b7: i2f
      // 1b8: ldc 4.0
      // 1ba: nop
      // 1bb: fdiv
      // 1bc: fstore 13
      // 1be: iload 11
      // 1c0: bipush 4
      // 1c1: irem
      // 1c2: bipush 1
      // 1c3: iadd
      // 1c4: i2f
      // 1c5: ldc 4.0
      // 1c7: nop
      // 1c8: fdiv
      // 1c9: fstore 14
      // 1cb: iload 11
      // 1cd: bipush 4
      // 1ce: idiv
      // 1cf: bipush 1
      // 1d0: iadd
      // 1d1: i2f
      // 1d2: ldc 4.0
      // 1d4: nop
      // 1d5: fdiv
      // 1d6: fstore 15
      // 1d8: aload 6
      // 1da: bipush 7
      // 1dc: getstatic gnl._r5 Lbe7;
      // 1df: invokevirtual q3g.ezr (ILbe7;)V
      // 1e2: ldc -0.001
      // 1e4: nop
      // 1e5: fstore 16
      // 1e7: aload 6
      // 1e9: ldc2_w -1.0
      // 1ec: dconst_1
      // 1ed: iload 8
      // 1ef: i2f
      // 1f0: ldc -0.001
      // 1f2: nop
      // 1f3: fmul
      // 1f4: f2d
      // 1f5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1f8: fload 12
      // 1fa: f2d
      // 1fb: fload 13
      // 1fd: f2d
      // 1fe: invokevirtual q3g.h0a (DD)Lq3g;
      // 201: invokevirtual q3g.pzw ()V
      // 204: aload 6
      // 206: dconst_1
      // 207: dconst_1
      // 208: iload 8
      // 20a: i2f
      // 20b: ldc -0.001
      // 20d: nop
      // 20e: fmul
      // 20f: f2d
      // 210: invokevirtual q3g.g5o (DDD)Lq3g;
      // 213: fload 14
      // 215: f2d
      // 216: fload 13
      // 218: f2d
      // 219: invokevirtual q3g.h0a (DD)Lq3g;
      // 21c: invokevirtual q3g.pzw ()V
      // 21f: aload 6
      // 221: dconst_1
      // 222: ldc2_w -1.0
      // 225: iload 8
      // 227: i2f
      // 228: ldc -0.001
      // 22a: nop
      // 22b: fmul
      // 22c: f2d
      // 22d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 230: fload 14
      // 232: f2d
      // 233: fload 15
      // 235: f2d
      // 236: invokevirtual q3g.h0a (DD)Lq3g;
      // 239: invokevirtual q3g.pzw ()V
      // 23c: aload 6
      // 23e: ldc2_w -1.0
      // 241: ldc2_w -1.0
      // 244: iload 8
      // 246: i2f
      // 247: ldc -0.001
      // 249: nop
      // 24a: fmul
      // 24b: f2d
      // 24c: invokevirtual q3g.g5o (DDD)Lq3g;
      // 24f: fload 12
      // 251: f2d
      // 252: fload 15
      // 254: f2d
      // 255: invokevirtual q3g.h0a (DD)Lq3g;
      // 258: invokevirtual q3g.pzw ()V
      // 25b: aload 5
      // 25d: invokevirtual jom.q7g ()V
      // 260: invokestatic hzu.x3w ()V
      // 263: iinc 8 1
      // 266: iload 2
      // 267: ifne 0f9
      // 26a: invokestatic hzu.dp2 ()V
      // 26d: fconst_0
      // 26e: fconst_0
      // 26f: ldc -0.04
      // 271: nop
      // 272: invokestatic hzu.a4k (FFF)V
      // 275: fconst_1
      // 276: fconst_1
      // 277: fconst_1
      // 278: invokestatic hzu.syc (FFF)V
      // 27b: invokestatic hzu.x3w ()V
      // 27e: return
   }

   public static void ogj(f5a$yqd var0) {
      var0.eht();
   }

   public static void toe(f5a$yqd var0, boolean var1) {
      var0.oaw(var1);
   }

   public f5a$yqd(f5a var1, ucr var2, f5a$1 var3) {
      this(var1, var2);
   }

   public static gdz uxl(f5a$yqd var0) {
      return var0.u4n;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3458943056153684817L, -7606159347806217584L, MethodHandles.lookup().lookupClass()).a(8437959129902L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 97295515306695L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0097³éß·þ+F".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
