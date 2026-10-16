import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ym7 extends liu {
   public g6r cke = new z8o();

   public ym7(hr_ var1) {
      super(var1);
      this.o2u = 0.5F;
   }

   public void yfd(_f3 param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic hzu.dp2 ()V
      // 003: aload 0
      // 004: aload 1
      // 005: invokevirtual ym7.sat (Li2h;)Z
      // 008: pop
      // 009: invokestatic t9d.c ()I
      // 00c: aload 1
      // 00d: invokevirtual _f3.jwu ()I
      // 010: i2l
      // 011: ldc2_w 493286711
      // 014: lmul
      // 015: lstore 11
      // 017: istore 10
      // 019: lload 11
      // 01b: lload 11
      // 01d: lmul
      // 01e: ldc2_w 4392167121
      // 021: lmul
      // 022: lload 11
      // 024: ldc2_w 98761
      // 027: lmul
      // 028: ladd
      // 029: lstore 11
      // 02b: lload 11
      // 02d: bipush 16
      // 02f: lshr
      // 030: ldc2_w 7
      // 033: land
      // 034: l2f
      // 035: ldc 0.5
      // 037: nop
      // 038: fadd
      // 039: ldc 8.0
      // 03b: nop
      // 03c: fdiv
      // 03d: ldc 0.5
      // 03f: nop
      // 040: fsub
      // 041: ldc 0.004
      // 043: nop
      // 044: fmul
      // 045: fstore 13
      // 047: lload 11
      // 049: bipush 20
      // 04b: lshr
      // 04c: ldc2_w 7
      // 04f: land
      // 050: l2f
      // 051: ldc 0.5
      // 053: nop
      // 054: fadd
      // 055: ldc 8.0
      // 057: nop
      // 058: fdiv
      // 059: ldc 0.5
      // 05b: nop
      // 05c: fsub
      // 05d: ldc 0.004
      // 05f: nop
      // 060: fmul
      // 061: fstore 14
      // 063: lload 11
      // 065: bipush 24
      // 067: lshr
      // 068: ldc2_w 7
      // 06b: land
      // 06c: l2f
      // 06d: ldc 0.5
      // 06f: nop
      // 070: fadd
      // 071: ldc 8.0
      // 073: nop
      // 074: fdiv
      // 075: ldc 0.5
      // 077: nop
      // 078: fsub
      // 079: ldc 0.004
      // 07b: nop
      // 07c: fmul
      // 07d: fstore 15
      // 07f: fload 13
      // 081: fload 14
      // 083: fload 15
      // 085: invokestatic hzu.a4k (FFF)V
      // 088: aload 1
      // 089: getfield _f3.ivp D
      // 08c: aload 1
      // 08d: getfield _f3.o2v D
      // 090: aload 1
      // 091: getfield _f3.ivp D
      // 094: dsub
      // 095: fload 9
      // 097: f2d
      // 098: dmul
      // 099: dadd
      // 09a: dstore 16
      // 09c: aload 1
      // 09d: getfield _f3.c54 D
      // 0a0: aload 1
      // 0a1: getfield _f3.kfp D
      // 0a4: aload 1
      // 0a5: getfield _f3.c54 D
      // 0a8: dsub
      // 0a9: fload 9
      // 0ab: f2d
      // 0ac: dmul
      // 0ad: dadd
      // 0ae: dstore 18
      // 0b0: aload 1
      // 0b1: getfield _f3.e2b D
      // 0b4: aload 1
      // 0b5: getfield _f3.vbd D
      // 0b8: aload 1
      // 0b9: getfield _f3.e2b D
      // 0bc: dsub
      // 0bd: fload 9
      // 0bf: f2d
      // 0c0: dmul
      // 0c1: dadd
      // 0c2: dstore 20
      // 0c4: ldc2_w 0.30000001192092896
      // 0c7: dstore 22
      // 0c9: aload 1
      // 0ca: dload 16
      // 0cc: dload 18
      // 0ce: dload 20
      // 0d0: invokevirtual _f3.vag (DDD)Lfqr;
      // 0d3: astore 24
      // 0d5: aload 1
      // 0d6: getfield _f3.j25 F
      // 0d9: aload 1
      // 0da: getfield _f3.y2i F
      // 0dd: aload 1
      // 0de: getfield _f3.j25 F
      // 0e1: fsub
      // 0e2: fload 9
      // 0e4: fmul
      // 0e5: fadd
      // 0e6: fstore 25
      // 0e8: iload 10
      // 0ea: ifne 1f0
      // 0ed: aload 24
      // 0ef: ifnull 1cc
      // 0f2: goto 0f9
      // 0f5: invokestatic ym7.c (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 1
      // 0fa: dload 16
      // 0fc: dload 18
      // 0fe: dload 20
      // 100: dload 22
      // 102: invokevirtual _f3.zou (DDDD)Lfqr;
      // 105: astore 26
      // 107: aload 1
      // 108: dload 16
      // 10a: dload 18
      // 10c: dload 20
      // 10e: dload 22
      // 110: dneg
      // 111: invokevirtual _f3.zou (DDDD)Lfqr;
      // 114: astore 27
      // 116: aload 26
      // 118: iload 10
      // 11a: ifne 12d
      // 11d: ifnonnull 12b
      // 120: goto 127
      // 123: invokestatic ym7.c (Loov;)Loov;
      // 126: athrow
      // 127: aload 24
      // 129: astore 26
      // 12b: aload 27
      // 12d: iload 10
      // 12f: ifne 186
      // 132: ifnonnull 140
      // 135: goto 13c
      // 138: invokestatic ym7.c (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 24
      // 13e: astore 27
      // 140: dload 2
      // 141: aload 24
      // 143: getfield fqr.lvi D
      // 146: dload 16
      // 148: dsub
      // 149: dadd
      // 14a: dstore 2
      // 14b: dload 4
      // 14d: aload 26
      // 14f: getfield fqr.gn5 D
      // 152: aload 27
      // 154: getfield fqr.gn5 D
      // 157: dadd
      // 158: ldc2_w 2.0
      // 15b: ddiv
      // 15c: dload 18
      // 15e: dsub
      // 15f: dadd
      // 160: dstore 4
      // 162: dload 6
      // 164: aload 24
      // 166: getfield fqr.bn2 D
      // 169: dload 20
      // 16b: dsub
      // 16c: dadd
      // 16d: dstore 6
      // 16f: aload 27
      // 171: aload 26
      // 173: getfield fqr.lvi D
      // 176: dneg
      // 177: aload 26
      // 179: getfield fqr.gn5 D
      // 17c: dneg
      // 17d: aload 26
      // 17f: getfield fqr.bn2 D
      // 182: dneg
      // 183: invokevirtual fqr.r2x (DDD)Lfqr;
      // 186: astore 28
      // 188: aload 28
      // 18a: invokevirtual fqr.vtb ()D
      // 18d: dconst_0
      // 18e: dcmpl
      // 18f: iload 10
      // 191: ifne 1f4
      // 194: ifeq 1cc
      // 197: goto 19e
      // 19a: invokestatic ym7.c (Loov;)Loov;
      // 19d: athrow
      // 19e: aload 28
      // 1a0: invokevirtual fqr.kec ()Lfqr;
      // 1a3: astore 28
      // 1a5: aload 28
      // 1a7: getfield fqr.bn2 D
      // 1aa: aload 28
      // 1ac: getfield fqr.lvi D
      // 1af: invokestatic java/lang/Math.atan2 (DD)D
      // 1b2: ldc2_w 180.0
      // 1b5: dmul
      // 1b6: ldc2_w 3.141592653589793
      // 1b9: ddiv
      // 1ba: d2f
      // 1bb: fstore 8
      // 1bd: aload 28
      // 1bf: getfield fqr.gn5 D
      // 1c2: invokestatic java/lang/Math.atan (D)D
      // 1c5: ldc2_w 73.0
      // 1c8: dmul
      // 1c9: d2f
      // 1ca: fstore 25
      // 1cc: dload 2
      // 1cd: d2f
      // 1ce: dload 4
      // 1d0: d2f
      // 1d1: ldc 0.375
      // 1d3: nop
      // 1d4: fadd
      // 1d5: dload 6
      // 1d7: d2f
      // 1d8: invokestatic hzu.a4k (FFF)V
      // 1db: ldc 180.0
      // 1dd: nop
      // 1de: fload 8
      // 1e0: fsub
      // 1e1: fconst_0
      // 1e2: fconst_1
      // 1e3: fconst_0
      // 1e4: invokestatic hzu.a2h (FFFF)V
      // 1e7: fload 25
      // 1e9: fneg
      // 1ea: fconst_0
      // 1eb: fconst_0
      // 1ec: fconst_1
      // 1ed: invokestatic hzu.a2h (FFFF)V
      // 1f0: aload 1
      // 1f1: invokevirtual _f3.hg2 ()I
      // 1f4: i2f
      // 1f5: fload 9
      // 1f7: fsub
      // 1f8: fstore 26
      // 1fa: aload 1
      // 1fb: invokevirtual _f3._3r ()F
      // 1fe: fload 9
      // 200: fsub
      // 201: fstore 27
      // 203: fload 27
      // 205: fconst_0
      // 206: fcmpg
      // 207: iload 10
      // 209: ifne 21d
      // 20c: ifge 219
      // 20f: goto 216
      // 212: invokestatic ym7.c (Loov;)Loov;
      // 215: athrow
      // 216: fconst_0
      // 217: fstore 27
      // 219: fload 26
      // 21b: fconst_0
      // 21c: fcmpl
      // 21d: iload 10
      // 21f: ifne 252
      // 222: ifle 24e
      // 225: goto 22c
      // 228: invokestatic ym7.c (Loov;)Loov;
      // 22b: athrow
      // 22c: fload 26
      // 22e: invokestatic fe6.rtn (F)F
      // 231: fload 26
      // 233: fmul
      // 234: fload 27
      // 236: fmul
      // 237: ldc 10.0
      // 239: nop
      // 23a: fdiv
      // 23b: aload 1
      // 23c: invokevirtual _f3.ov7 ()I
      // 23f: i2f
      // 240: fmul
      // 241: fconst_1
      // 242: fconst_0
      // 243: fconst_0
      // 244: invokestatic hzu.a2h (FFFF)V
      // 247: goto 24e
      // 24a: invokestatic ym7.c (Loov;)Loov;
      // 24d: athrow
      // 24e: aload 1
      // 24f: invokevirtual _f3.qxx ()I
      // 252: istore 28
      // 254: aload 1
      // 255: invokevirtual _f3.joa ()Lzfz;
      // 258: astore 29
      // 25a: iload 10
      // 25c: ifne 2e5
      // 25f: aload 29
      // 261: invokeinterface zfz.r_y ()Le0x; 1
      // 266: invokevirtual e0x.kfj ()I
      // 269: bipush -1
      // 26a: if_icmpeq 2b8
      // 26d: goto 274
      // 270: invokestatic ym7.c (Loov;)Loov;
      // 273: athrow
      // 274: invokestatic hzu.dp2 ()V
      // 277: aload 0
      // 278: getstatic yu2.nu_ Lgdz;
      // 27b: invokevirtual ym7.gu4 (Lgdz;)V
      // 27e: ldc 0.75
      // 280: nop
      // 281: fstore 30
      // 283: fload 30
      // 285: fload 30
      // 287: fload 30
      // 289: invokestatic hzu.syc (FFF)V
      // 28c: ldc -0.5
      // 28e: nop
      // 28f: iload 28
      // 291: bipush 8
      // 293: isub
      // 294: i2f
      // 295: ldc 16.0
      // 297: nop
      // 298: fdiv
      // 299: ldc 0.5
      // 29b: nop
      // 29c: invokestatic hzu.a4k (FFF)V
      // 29f: aload 0
      // 2a0: aload 1
      // 2a1: fload 9
      // 2a3: aload 29
      // 2a5: invokevirtual ym7.zea (L_f3;FLzfz;)V
      // 2a8: invokestatic hzu.x3w ()V
      // 2ab: fconst_1
      // 2ac: fconst_1
      // 2ad: fconst_1
      // 2ae: fconst_1
      // 2af: invokestatic hzu.wn0 (FFFF)V
      // 2b2: aload 0
      // 2b3: aload 1
      // 2b4: invokevirtual ym7.sat (Li2h;)Z
      // 2b7: pop
      // 2b8: ldc -1.0
      // 2ba: nop
      // 2bb: ldc -1.0
      // 2bd: nop
      // 2be: fconst_1
      // 2bf: invokestatic hzu.syc (FFF)V
      // 2c2: aload 0
      // 2c3: getfield ym7.cke Lg6r;
      // 2c6: aload 1
      // 2c7: fconst_0
      // 2c8: fconst_0
      // 2c9: ldc -0.1
      // 2cb: nop
      // 2cc: fconst_0
      // 2cd: fconst_0
      // 2ce: ldc 0.0625
      // 2d0: nop
      // 2d1: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 2d4: invokestatic hzu.x3w ()V
      // 2d7: aload 0
      // 2d8: aload 1
      // 2d9: dload 2
      // 2da: dload 4
      // 2dc: dload 6
      // 2de: fload 8
      // 2e0: fload 9
      // 2e2: invokespecial liu.apl (Li2h;DDDFF)V
      // 2e5: return
   }

   public gdz ilp(_f3 var1) {
      return uoj;
   }

   public void zea(_f3 var1, float var2, zfz var3) {
      hzu.dp2();
      c05.vz1().dwz()._qd(var3, var1.xeu(var2));
      hzu.x3w();
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.ilp((_f3)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.yfd((_f3)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3033810098623051813L, -4045014407226449824L, MethodHandles.lookup().lookupClass()).a(62367546323716L);
      // $VF: monitorexit
      long var4 = var10000 ^ 68072129426322L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("¯\u008d\u0086´!QÕ¿þ\rV\u009fLNR1\u008e\u0017ØúqÂT\u001c(3\u0086\u0002RñNÖ".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      uoj = new gdz(var0);
   }

   private static oov c(oov var0) {
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
