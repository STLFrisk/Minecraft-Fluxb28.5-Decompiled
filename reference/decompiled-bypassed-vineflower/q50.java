import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityEndPortal;

public class q50 extends q9h {
   private static final gdz g3c;
   private static final gdz a_k;
   private static final Random nqi;
   public FloatBuffer bfw = nkx.dyc(16);

   public void ob3(TileEntityEndPortal param1, double param2, double param4, double param6, float param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 10
      // 005: invokestatic hxt.ly3 ()Z
      // 008: iload 10
      // 00a: ifeq 02e
      // 00d: ifeq 031
      // 010: goto 017
      // 013: invokestatic q50.a (Loov;)Loov;
      // 016: athrow
      // 017: aload 1
      // 018: dload 2
      // 019: dload 4
      // 01b: dload 6
      // 01d: fload 8
      // 01f: iload 9
      // 021: ldc 0.75
      // 023: nop
      // 024: invokestatic net/optifine/shaders/ShadersRender.renderEndPortal (Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)Z
      // 027: goto 02e
      // 02a: invokestatic q50.a (Loov;)Loov;
      // 02d: athrow
      // 02e: ifne 370
      // 031: aload 0
      // 032: getfield q50.qrn Lxv4;
      // 035: getfield xv4.td6 D
      // 038: d2f
      // 039: fstore 11
      // 03b: aload 0
      // 03c: getfield q50.qrn Lxv4;
      // 03f: getfield xv4.tq0 D
      // 042: d2f
      // 043: fstore 12
      // 045: aload 0
      // 046: getfield q50.qrn Lxv4;
      // 049: getfield xv4.zcy D
      // 04c: d2f
      // 04d: fstore 13
      // 04f: invokestatic hzu.fpt ()V
      // 052: getstatic q50.nqi Ljava/util/Random;
      // 055: ldc2_w 31100
      // 058: invokevirtual java/util/Random.setSeed (J)V
      // 05b: ldc 0.75
      // 05d: nop
      // 05e: fstore 14
      // 060: bipush 0
      // 061: istore 15
      // 063: iload 15
      // 065: bipush 16
      // 067: if_icmpge 352
      // 06a: invokestatic hzu.dp2 ()V
      // 06d: bipush 16
      // 06f: iload 15
      // 071: isub
      // 072: i2f
      // 073: fstore 16
      // 075: ldc 0.0625
      // 077: nop
      // 078: fstore 17
      // 07a: fconst_1
      // 07b: fload 16
      // 07d: fconst_1
      // 07e: fadd
      // 07f: fdiv
      // 080: fstore 18
      // 082: iload 10
      // 084: ifeq 36d
      // 087: iload 15
      // 089: iload 10
      // 08b: ifeq 0c3
      // 08e: goto 095
      // 091: invokestatic q50.a (Loov;)Loov;
      // 094: athrow
      // 095: ifne 0c1
      // 098: goto 09f
      // 09b: invokestatic q50.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: getstatic q50.g3c Lgdz;
      // 0a3: invokevirtual q50.g3j (Lgdz;)V
      // 0a6: ldc 0.1
      // 0a8: nop
      // 0a9: fstore 18
      // 0ab: ldc 65.0
      // 0ad: nop
      // 0ae: fstore 16
      // 0b0: ldc 0.125
      // 0b2: nop
      // 0b3: fstore 17
      // 0b5: invokestatic hzu.spd ()V
      // 0b8: sipush 770
      // 0bb: sipush 771
      // 0be: invokestatic hzu.ru7 (II)V
      // 0c1: iload 15
      // 0c3: bipush 1
      // 0c4: iload 10
      // 0c6: ifeq 0e4
      // 0c9: if_icmplt 0e1
      // 0cc: goto 0d3
      // 0cf: invokestatic q50.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getstatic q50.a_k Lgdz;
      // 0d7: invokevirtual q50.g3j (Lgdz;)V
      // 0da: goto 0e1
      // 0dd: invokestatic q50.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: iload 15
      // 0e3: bipush 1
      // 0e4: iload 10
      // 0e6: ifeq 0ff
      // 0e9: if_icmpne 107
      // 0ec: goto 0f3
      // 0ef: invokestatic q50.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: invokestatic hzu.spd ()V
      // 0f6: bipush 1
      // 0f7: bipush 1
      // 0f8: goto 0ff
      // 0fb: invokestatic q50.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: invokestatic hzu.ru7 (II)V
      // 102: ldc 0.5
      // 104: nop
      // 105: fstore 17
      // 107: dload 4
      // 109: fload 14
      // 10b: f2d
      // 10c: dadd
      // 10d: dneg
      // 10e: d2f
      // 10f: fstore 19
      // 111: fload 19
      // 113: invokestatic bm4.g62 ()Lfqr;
      // 116: getfield fqr.gn5 D
      // 119: d2f
      // 11a: fadd
      // 11b: fstore 20
      // 11d: fload 19
      // 11f: fload 16
      // 121: fadd
      // 122: invokestatic bm4.g62 ()Lfqr;
      // 125: getfield fqr.gn5 D
      // 128: d2f
      // 129: fadd
      // 12a: fstore 21
      // 12c: fload 20
      // 12e: fload 21
      // 130: fdiv
      // 131: fstore 22
      // 133: dload 4
      // 135: fload 14
      // 137: f2d
      // 138: dadd
      // 139: d2f
      // 13a: fload 22
      // 13c: fadd
      // 13d: fstore 22
      // 13f: fload 11
      // 141: fload 22
      // 143: fload 13
      // 145: invokestatic hzu.a4k (FFF)V
      // 148: getstatic hzu$lzb.hwv Lhzu$lzb;
      // 14b: sipush 9217
      // 14e: invokestatic hzu._z3 (Lhzu$lzb;I)V
      // 151: getstatic hzu$lzb.ajy Lhzu$lzb;
      // 154: sipush 9217
      // 157: invokestatic hzu._z3 (Lhzu$lzb;I)V
      // 15a: getstatic hzu$lzb.rx9 Lhzu$lzb;
      // 15d: sipush 9217
      // 160: invokestatic hzu._z3 (Lhzu$lzb;I)V
      // 163: getstatic hzu$lzb.w74 Lhzu$lzb;
      // 166: sipush 9216
      // 169: invokestatic hzu._z3 (Lhzu$lzb;I)V
      // 16c: getstatic hzu$lzb.hwv Lhzu$lzb;
      // 16f: sipush 9473
      // 172: aload 0
      // 173: fconst_1
      // 174: fconst_0
      // 175: fconst_0
      // 176: fconst_0
      // 177: invokespecial q50.lit (FFFF)Ljava/nio/FloatBuffer;
      // 17a: invokestatic hzu._p4 (Lhzu$lzb;ILjava/nio/FloatBuffer;)V
      // 17d: getstatic hzu$lzb.ajy Lhzu$lzb;
      // 180: sipush 9473
      // 183: aload 0
      // 184: fconst_0
      // 185: fconst_0
      // 186: fconst_1
      // 187: fconst_0
      // 188: invokespecial q50.lit (FFFF)Ljava/nio/FloatBuffer;
      // 18b: invokestatic hzu._p4 (Lhzu$lzb;ILjava/nio/FloatBuffer;)V
      // 18e: getstatic hzu$lzb.rx9 Lhzu$lzb;
      // 191: sipush 9473
      // 194: aload 0
      // 195: fconst_0
      // 196: fconst_0
      // 197: fconst_0
      // 198: fconst_1
      // 199: invokespecial q50.lit (FFFF)Ljava/nio/FloatBuffer;
      // 19c: invokestatic hzu._p4 (Lhzu$lzb;ILjava/nio/FloatBuffer;)V
      // 19f: getstatic hzu$lzb.w74 Lhzu$lzb;
      // 1a2: sipush 9474
      // 1a5: aload 0
      // 1a6: fconst_0
      // 1a7: fconst_1
      // 1a8: fconst_0
      // 1a9: fconst_0
      // 1aa: invokespecial q50.lit (FFFF)Ljava/nio/FloatBuffer;
      // 1ad: invokestatic hzu._p4 (Lhzu$lzb;ILjava/nio/FloatBuffer;)V
      // 1b0: getstatic hzu$lzb.hwv Lhzu$lzb;
      // 1b3: invokestatic hzu.bwb (Lhzu$lzb;)V
      // 1b6: getstatic hzu$lzb.ajy Lhzu$lzb;
      // 1b9: invokestatic hzu.bwb (Lhzu$lzb;)V
      // 1bc: getstatic hzu$lzb.rx9 Lhzu$lzb;
      // 1bf: invokestatic hzu.bwb (Lhzu$lzb;)V
      // 1c2: getstatic hzu$lzb.w74 Lhzu$lzb;
      // 1c5: invokestatic hzu.bwb (Lhzu$lzb;)V
      // 1c8: invokestatic hzu.x3w ()V
      // 1cb: sipush 5890
      // 1ce: invokestatic hzu.ah8 (I)V
      // 1d1: invokestatic hzu.dp2 ()V
      // 1d4: invokestatic hzu.zwy ()V
      // 1d7: fconst_0
      // 1d8: invokestatic c05.qgs ()J
      // 1db: ldc2_w 700000
      // 1de: lrem
      // 1df: l2f
      // 1e0: ldc 700000.0
      // 1e2: nop
      // 1e3: fdiv
      // 1e4: fconst_0
      // 1e5: invokestatic hzu.a4k (FFF)V
      // 1e8: fload 17
      // 1ea: fload 17
      // 1ec: fload 17
      // 1ee: invokestatic hzu.syc (FFF)V
      // 1f1: ldc 0.5
      // 1f3: nop
      // 1f4: ldc 0.5
      // 1f6: nop
      // 1f7: fconst_0
      // 1f8: invokestatic hzu.a4k (FFF)V
      // 1fb: iload 15
      // 1fd: iload 15
      // 1ff: imul
      // 200: sipush 4321
      // 203: imul
      // 204: iload 15
      // 206: bipush 9
      // 208: imul
      // 209: iadd
      // 20a: i2f
      // 20b: fconst_2
      // 20c: fmul
      // 20d: fconst_0
      // 20e: fconst_0
      // 20f: fconst_1
      // 210: invokestatic hzu.a2h (FFFF)V
      // 213: ldc -0.5
      // 215: nop
      // 216: ldc -0.5
      // 218: nop
      // 219: fconst_0
      // 21a: invokestatic hzu.a4k (FFF)V
      // 21d: fload 11
      // 21f: fneg
      // 220: fload 13
      // 222: fneg
      // 223: fload 12
      // 225: fneg
      // 226: invokestatic hzu.a4k (FFF)V
      // 229: fload 19
      // 22b: invokestatic bm4.g62 ()Lfqr;
      // 22e: getfield fqr.gn5 D
      // 231: d2f
      // 232: fadd
      // 233: fstore 20
      // 235: invokestatic bm4.g62 ()Lfqr;
      // 238: getfield fqr.lvi D
      // 23b: d2f
      // 23c: fload 16
      // 23e: fmul
      // 23f: fload 20
      // 241: fdiv
      // 242: invokestatic bm4.g62 ()Lfqr;
      // 245: getfield fqr.bn2 D
      // 248: d2f
      // 249: fload 16
      // 24b: fmul
      // 24c: fload 20
      // 24e: fdiv
      // 24f: fload 12
      // 251: fneg
      // 252: invokestatic hzu.a4k (FFF)V
      // 255: invokestatic jom.yut ()Ljom;
      // 258: astore 23
      // 25a: aload 23
      // 25c: invokevirtual jom.zuq ()Lq3g;
      // 25f: astore 24
      // 261: aload 24
      // 263: bipush 7
      // 265: getstatic gnl.gec Lbe7;
      // 268: invokevirtual q3g.ezr (ILbe7;)V
      // 26b: getstatic q50.nqi Ljava/util/Random;
      // 26e: invokevirtual java/util/Random.nextFloat ()F
      // 271: ldc 0.5
      // 273: nop
      // 274: fmul
      // 275: ldc 0.1
      // 277: nop
      // 278: fadd
      // 279: fload 18
      // 27b: fmul
      // 27c: fstore 25
      // 27e: getstatic q50.nqi Ljava/util/Random;
      // 281: invokevirtual java/util/Random.nextFloat ()F
      // 284: ldc 0.5
      // 286: nop
      // 287: fmul
      // 288: ldc 0.4
      // 28a: nop
      // 28b: fadd
      // 28c: fload 18
      // 28e: fmul
      // 28f: fstore 26
      // 291: getstatic q50.nqi Ljava/util/Random;
      // 294: invokevirtual java/util/Random.nextFloat ()F
      // 297: ldc 0.5
      // 299: nop
      // 29a: fmul
      // 29b: ldc 0.5
      // 29d: nop
      // 29e: fadd
      // 29f: fload 18
      // 2a1: fmul
      // 2a2: fstore 27
      // 2a4: iload 15
      // 2a6: iload 10
      // 2a8: ifeq 340
      // 2ab: ifne 2c1
      // 2ae: goto 2b5
      // 2b1: invokestatic q50.a (Loov;)Loov;
      // 2b4: athrow
      // 2b5: fconst_1
      // 2b6: fload 18
      // 2b8: fmul
      // 2b9: dup
      // 2ba: fstore 27
      // 2bc: dup
      // 2bd: fstore 26
      // 2bf: fstore 25
      // 2c1: aload 24
      // 2c3: dload 2
      // 2c4: dload 4
      // 2c6: fload 14
      // 2c8: f2d
      // 2c9: dadd
      // 2ca: dload 6
      // 2cc: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2cf: fload 25
      // 2d1: fload 26
      // 2d3: fload 27
      // 2d5: fconst_1
      // 2d6: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 2d9: invokevirtual q3g.pzw ()V
      // 2dc: aload 24
      // 2de: dload 2
      // 2df: dload 4
      // 2e1: fload 14
      // 2e3: f2d
      // 2e4: dadd
      // 2e5: dload 6
      // 2e7: dconst_1
      // 2e8: dadd
      // 2e9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2ec: fload 25
      // 2ee: fload 26
      // 2f0: fload 27
      // 2f2: fconst_1
      // 2f3: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 2f6: invokevirtual q3g.pzw ()V
      // 2f9: aload 24
      // 2fb: dload 2
      // 2fc: dconst_1
      // 2fd: dadd
      // 2fe: dload 4
      // 300: fload 14
      // 302: f2d
      // 303: dadd
      // 304: dload 6
      // 306: dconst_1
      // 307: dadd
      // 308: invokevirtual q3g.g5o (DDD)Lq3g;
      // 30b: fload 25
      // 30d: fload 26
      // 30f: fload 27
      // 311: fconst_1
      // 312: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 315: invokevirtual q3g.pzw ()V
      // 318: aload 24
      // 31a: dload 2
      // 31b: dconst_1
      // 31c: dadd
      // 31d: dload 4
      // 31f: fload 14
      // 321: f2d
      // 322: dadd
      // 323: dload 6
      // 325: invokevirtual q3g.g5o (DDD)Lq3g;
      // 328: fload 25
      // 32a: fload 26
      // 32c: fload 27
      // 32e: fconst_1
      // 32f: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 332: invokevirtual q3g.pzw ()V
      // 335: aload 23
      // 337: invokevirtual jom.q7g ()V
      // 33a: invokestatic hzu.x3w ()V
      // 33d: sipush 5888
      // 340: invokestatic hzu.ah8 (I)V
      // 343: aload 0
      // 344: getstatic q50.g3c Lgdz;
      // 347: invokevirtual q50.g3j (Lgdz;)V
      // 34a: iinc 15 1
      // 34d: iload 10
      // 34f: ifne 063
      // 352: invokestatic hzu.ux6 ()V
      // 355: getstatic hzu$lzb.hwv Lhzu$lzb;
      // 358: invokestatic hzu.ea_ (Lhzu$lzb;)V
      // 35b: getstatic hzu$lzb.ajy Lhzu$lzb;
      // 35e: invokestatic hzu.ea_ (Lhzu$lzb;)V
      // 361: getstatic hzu$lzb.rx9 Lhzu$lzb;
      // 364: invokestatic hzu.ea_ (Lhzu$lzb;)V
      // 367: getstatic hzu$lzb.w74 Lhzu$lzb;
      // 36a: invokestatic hzu.ea_ (Lhzu$lzb;)V
      // 36d: invokestatic hzu.s7q ()V
      // 370: return
   }

   private FloatBuffer lit(float var1, float var2, float var3, float var4) {
      ((Buffer)this.bfw).clear();
      this.bfw.put(var1).put(var2).put(var3).put(var4);
      ((Buffer)this.bfw).flip();
      return this.bfw;
   }

   @Override
   public void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9) {
      this.ob3((TileEntityEndPortal)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1580790319520913123L, -4508014913497978198L, MethodHandles.lookup().lookupClass()).a(94149111673553L);
      // $VF: monitorexit
      long var10 = var10000 ^ 96147272933113L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "O\u001bînöí¢\u0005Ë:Ó-\u0095@\u0002Á¶(ÄNåÍ@81\u0096\u0088\u0094,Ã)\u000e(O\u001bînöí¢\u0005Ï*:\u001d\u008eT-ÜæÈû\b\u0014ÞÃÆËûµ\u0089c\u0017Û\u0013\u0082=\u0098å]ãe)";
      int var7 = "O\u001bînöí¢\u0005Ë:Ó-\u0095@\u0002Á¶(ÄNåÍ@81\u0096\u0088\u0094,Ã)\u000e(O\u001bînöí¢\u0005Ï*:\u001d\u008eT-ÜæÈû\b\u0014ÞÃÆËûµ\u0089c\u0017Û\u0013\u0082=\u0098å]ãe)"
         .length();
      char var4 = ' ';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            g3c = new gdz(var8[1]);
            a_k = new gdz(var8[0]);
            nqi = new Random(31100L);
            return;
         }

         var4 = var5.charAt(var3);
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
}
