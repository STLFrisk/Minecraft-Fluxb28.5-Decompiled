import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wxy extends flo {
   private static final gdz x1m;
   private static final be7 fe5;
   private int izm;
   private int whi;
   private lc5 hj1;
   private float tn0;

   public wxy(lc5 var1, OpaquePredicate var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      super(var2, var3, var5, var7, 0.0, 0.0, 0.0);
      this.hj1 = var1;
      this.whi = 6 + this.z2d.nextInt(4);
      this.aeh = this.li4 = this.v5a = this.z2d.nextFloat() * 0.6F + 0.4F;
      this.tn0 = 1.0F - (float)var9 * 0.5F;
   }

   @Override
   public void oss(q3g param1, EntityLivingBase param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 9
      // 005: aload 0
      // 006: getfield wxy.izm I
      // 009: i2f
      // 00a: fload 3
      // 00b: fadd
      // 00c: ldc 15.0
      // 00e: nop
      // 00f: fmul
      // 010: aload 0
      // 011: getfield wxy.whi I
      // 014: i2f
      // 015: fdiv
      // 016: f2i
      // 017: istore 10
      // 019: iload 10
      // 01b: bipush 15
      // 01d: iload 9
      // 01f: ifeq 040
      // 022: if_icmpgt 222
      // 025: goto 02c
      // 028: invokestatic wxy.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield wxy.hj1 Llc5;
      // 030: getstatic wxy.x1m Lgdz;
      // 033: invokevirtual lc5.anl (Lgdz;)V
      // 036: iload 10
      // 038: bipush 4
      // 039: goto 040
      // 03c: invokestatic wxy.a (Loov;)Loov;
      // 03f: athrow
      // 040: irem
      // 041: i2f
      // 042: ldc 4.0
      // 044: nop
      // 045: fdiv
      // 046: fstore 11
      // 048: fload 11
      // 04a: ldc 0.24975
      // 04c: nop
      // 04d: fadd
      // 04e: fstore 12
      // 050: iload 10
      // 052: bipush 4
      // 053: idiv
      // 054: i2f
      // 055: ldc 4.0
      // 057: nop
      // 058: fdiv
      // 059: fstore 13
      // 05b: fload 13
      // 05d: ldc 0.24975
      // 05f: nop
      // 060: fadd
      // 061: fstore 14
      // 063: fconst_2
      // 064: aload 0
      // 065: getfield wxy.tn0 F
      // 068: fmul
      // 069: fstore 15
      // 06b: aload 0
      // 06c: getfield wxy.bc1 D
      // 06f: aload 0
      // 070: getfield wxy.o2v D
      // 073: aload 0
      // 074: getfield wxy.bc1 D
      // 077: dsub
      // 078: fload 3
      // 079: f2d
      // 07a: dmul
      // 07b: dadd
      // 07c: getstatic wxy.mrd D
      // 07f: dsub
      // 080: d2f
      // 081: fstore 16
      // 083: aload 0
      // 084: getfield wxy.o_z D
      // 087: aload 0
      // 088: getfield wxy.kfp D
      // 08b: aload 0
      // 08c: getfield wxy.o_z D
      // 08f: dsub
      // 090: fload 3
      // 091: f2d
      // 092: dmul
      // 093: dadd
      // 094: getstatic wxy.txo D
      // 097: dsub
      // 098: d2f
      // 099: fstore 17
      // 09b: aload 0
      // 09c: getfield wxy.a4d D
      // 09f: aload 0
      // 0a0: getfield wxy.vbd D
      // 0a3: aload 0
      // 0a4: getfield wxy.a4d D
      // 0a7: dsub
      // 0a8: fload 3
      // 0a9: f2d
      // 0aa: dmul
      // 0ab: dadd
      // 0ac: getstatic wxy.bta D
      // 0af: dsub
      // 0b0: d2f
      // 0b1: fstore 18
      // 0b3: fconst_1
      // 0b4: fconst_1
      // 0b5: fconst_1
      // 0b6: fconst_1
      // 0b7: invokestatic hzu.wn0 (FFFF)V
      // 0ba: invokestatic hzu.fpt ()V
      // 0bd: invokestatic qpm.cng ()V
      // 0c0: aload 1
      // 0c1: bipush 7
      // 0c3: getstatic wxy.fe5 Lbe7;
      // 0c6: invokevirtual q3g.ezr (ILbe7;)V
      // 0c9: aload 1
      // 0ca: fload 16
      // 0cc: fload 4
      // 0ce: fload 15
      // 0d0: fmul
      // 0d1: fsub
      // 0d2: fload 7
      // 0d4: fload 15
      // 0d6: fmul
      // 0d7: fsub
      // 0d8: f2d
      // 0d9: fload 17
      // 0db: fload 5
      // 0dd: fload 15
      // 0df: fmul
      // 0e0: fsub
      // 0e1: f2d
      // 0e2: fload 18
      // 0e4: fload 6
      // 0e6: fload 15
      // 0e8: fmul
      // 0e9: fsub
      // 0ea: fload 8
      // 0ec: fload 15
      // 0ee: fmul
      // 0ef: fsub
      // 0f0: f2d
      // 0f1: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0f4: fload 12
      // 0f6: f2d
      // 0f7: fload 14
      // 0f9: f2d
      // 0fa: invokevirtual q3g.h0a (DD)Lq3g;
      // 0fd: aload 0
      // 0fe: getfield wxy.aeh F
      // 101: aload 0
      // 102: getfield wxy.li4 F
      // 105: aload 0
      // 106: getfield wxy.v5a F
      // 109: fconst_1
      // 10a: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 10d: bipush 0
      // 10e: sipush 240
      // 111: invokevirtual q3g.iu0 (II)Lq3g;
      // 114: fconst_0
      // 115: fconst_1
      // 116: fconst_0
      // 117: invokevirtual q3g.h3y (FFF)Lq3g;
      // 11a: invokevirtual q3g.pzw ()V
      // 11d: aload 1
      // 11e: fload 16
      // 120: fload 4
      // 122: fload 15
      // 124: fmul
      // 125: fsub
      // 126: fload 7
      // 128: fload 15
      // 12a: fmul
      // 12b: fadd
      // 12c: f2d
      // 12d: fload 17
      // 12f: fload 5
      // 131: fload 15
      // 133: fmul
      // 134: fadd
      // 135: f2d
      // 136: fload 18
      // 138: fload 6
      // 13a: fload 15
      // 13c: fmul
      // 13d: fsub
      // 13e: fload 8
      // 140: fload 15
      // 142: fmul
      // 143: fadd
      // 144: f2d
      // 145: invokevirtual q3g.g5o (DDD)Lq3g;
      // 148: fload 12
      // 14a: f2d
      // 14b: fload 13
      // 14d: f2d
      // 14e: invokevirtual q3g.h0a (DD)Lq3g;
      // 151: aload 0
      // 152: getfield wxy.aeh F
      // 155: aload 0
      // 156: getfield wxy.li4 F
      // 159: aload 0
      // 15a: getfield wxy.v5a F
      // 15d: fconst_1
      // 15e: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 161: bipush 0
      // 162: sipush 240
      // 165: invokevirtual q3g.iu0 (II)Lq3g;
      // 168: fconst_0
      // 169: fconst_1
      // 16a: fconst_0
      // 16b: invokevirtual q3g.h3y (FFF)Lq3g;
      // 16e: invokevirtual q3g.pzw ()V
      // 171: aload 1
      // 172: fload 16
      // 174: fload 4
      // 176: fload 15
      // 178: fmul
      // 179: fadd
      // 17a: fload 7
      // 17c: fload 15
      // 17e: fmul
      // 17f: fadd
      // 180: f2d
      // 181: fload 17
      // 183: fload 5
      // 185: fload 15
      // 187: fmul
      // 188: fadd
      // 189: f2d
      // 18a: fload 18
      // 18c: fload 6
      // 18e: fload 15
      // 190: fmul
      // 191: fadd
      // 192: fload 8
      // 194: fload 15
      // 196: fmul
      // 197: fadd
      // 198: f2d
      // 199: invokevirtual q3g.g5o (DDD)Lq3g;
      // 19c: fload 11
      // 19e: f2d
      // 19f: fload 13
      // 1a1: f2d
      // 1a2: invokevirtual q3g.h0a (DD)Lq3g;
      // 1a5: aload 0
      // 1a6: getfield wxy.aeh F
      // 1a9: aload 0
      // 1aa: getfield wxy.li4 F
      // 1ad: aload 0
      // 1ae: getfield wxy.v5a F
      // 1b1: fconst_1
      // 1b2: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 1b5: bipush 0
      // 1b6: sipush 240
      // 1b9: invokevirtual q3g.iu0 (II)Lq3g;
      // 1bc: fconst_0
      // 1bd: fconst_1
      // 1be: fconst_0
      // 1bf: invokevirtual q3g.h3y (FFF)Lq3g;
      // 1c2: invokevirtual q3g.pzw ()V
      // 1c5: aload 1
      // 1c6: fload 16
      // 1c8: fload 4
      // 1ca: fload 15
      // 1cc: fmul
      // 1cd: fadd
      // 1ce: fload 7
      // 1d0: fload 15
      // 1d2: fmul
      // 1d3: fsub
      // 1d4: f2d
      // 1d5: fload 17
      // 1d7: fload 5
      // 1d9: fload 15
      // 1db: fmul
      // 1dc: fsub
      // 1dd: f2d
      // 1de: fload 18
      // 1e0: fload 6
      // 1e2: fload 15
      // 1e4: fmul
      // 1e5: fadd
      // 1e6: fload 8
      // 1e8: fload 15
      // 1ea: fmul
      // 1eb: fsub
      // 1ec: f2d
      // 1ed: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1f0: fload 11
      // 1f2: f2d
      // 1f3: fload 14
      // 1f5: f2d
      // 1f6: invokevirtual q3g.h0a (DD)Lq3g;
      // 1f9: aload 0
      // 1fa: getfield wxy.aeh F
      // 1fd: aload 0
      // 1fe: getfield wxy.li4 F
      // 201: aload 0
      // 202: getfield wxy.v5a F
      // 205: fconst_1
      // 206: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 209: bipush 0
      // 20a: sipush 240
      // 20d: invokevirtual q3g.iu0 (II)Lq3g;
      // 210: fconst_0
      // 211: fconst_1
      // 212: fconst_0
      // 213: invokevirtual q3g.h3y (FFF)Lq3g;
      // 216: invokevirtual q3g.pzw ()V
      // 219: invokestatic jom.yut ()Ljom;
      // 21c: invokevirtual jom.q7g ()V
      // 21f: invokestatic hzu.s7q ()V
      // 222: return
   }

   @Override
   public int azk(float var1) {
      return 61680;
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 0
      // 02: getfield wxy.o2v D
      // 05: putfield wxy.bc1 D
      // 08: aload 0
      // 09: aload 0
      // 0a: getfield wxy.kfp D
      // 0d: putfield wxy.o_z D
      // 10: aload 0
      // 11: aload 0
      // 12: getfield wxy.vbd D
      // 15: putfield wxy.a4d D
      // 18: invokestatic OpaquePredicate.b ()I
      // 1b: aload 0
      // 1c: dup
      // 1d: getfield wxy.izm I
      // 20: bipush 1
      // 21: iadd
      // 22: putfield wxy.izm I
      // 25: istore 1
      // 26: aload 0
      // 27: iload 1
      // 28: ifeq 44
      // 2b: getfield wxy.izm I
      // 2e: aload 0
      // 2f: getfield wxy.whi I
      // 32: if_icmpne 47
      // 35: goto 3c
      // 38: invokestatic wxy.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: goto 44
      // 40: invokestatic wxy.a (Loov;)Loov;
      // 43: athrow
      // 44: invokevirtual wxy._kl ()V
      // 47: return
   }

   @Override
   public int ikr() {
      return 3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5140207793041051561L, 516087557553962678L, MethodHandles.lookup().lookupClass()).a(200388900959399L);
      // $VF: monitorexit
      long var4 = var10000 ^ 33501962852781L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("Q`³= ü5\u0012C\u0006\u0019\u0015\u0019/½\u0004÷pÉ\u008c\rY\u001d`\u0091þ X\u0002Úùt".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      x1m = new gdz(var0);
      fe5 = new be7().cmt(gnl.rb9).cmt(gnl.uf0).cmt(gnl.ohw).cmt(gnl.jbs).cmt(gnl.la9).cmt(gnl.h9e);
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
}
