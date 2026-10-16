import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class nce implements gnj {
   public static void uu2() {
      k4c = hxt._u1(qm8);
   }

   public nce(fqu var1) {
      this.t28 = var1;
      this.t23 = new tf8(this.t28.m5v);
      this.t23.swi(16, 16);
      this.t23._ki = -6.0F;
      this.t23.kit = -8.0F;
      this.t23.r80 = fe6.dss / 4.0F;
      int[][] var2 = new int[][]{null, null, {16, 16, 0, 0}, {16, 16, 0, 0}, null, null};
      this.t23.rm2(var2, 0.0F, 0.0F, 10.0F, 20.0F, 16.0F, 0.0F, 0.0F);
      int[][] var3 = new int[][]{null, null, null, null, {16, 16, 0, 0}, {16, 16, 0, 0}};
      this.t23.rm2(var3, 10.0F, 0.0F, 0.0F, 0.0F, 16.0F, 20.0F, 0.0F);
   }

   public void eng(ld0 param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 9
      // 005: aload 1
      // 006: invokevirtual ld0.ejl ()Z
      // 009: iload 9
      // 00b: ifne 023
      // 00e: ifne 1c4
      // 011: goto 018
      // 014: invokestatic nce.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 1
      // 019: invokevirtual ld0.h5u ()Z
      // 01c: goto 023
      // 01f: invokestatic nce.a (Loov;)Loov;
      // 022: athrow
      // 023: ifne 1c4
      // 026: invokestatic c05.vz1 ()Lc05;
      // 029: invokevirtual c05.dwz ()Lqfn;
      // 02c: astore 10
      // 02e: iload 9
      // 030: ifne 051
      // 033: getstatic nce.k4c Z
      // 036: ifeq 056
      // 039: goto 040
      // 03c: invokestatic nce.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield nce.t28 Lfqu;
      // 044: getstatic nce.qm8 Lgdz;
      // 047: invokevirtual fqu.gu4 (Lgdz;)V
      // 04a: goto 051
      // 04d: invokestatic nce.a (Loov;)Loov;
      // 050: athrow
      // 051: iload 9
      // 053: ifeq 067
      // 056: aload 0
      // 057: getfield nce.t28 Lfqu;
      // 05a: getstatic yu2.nu_ Lgdz;
      // 05d: invokevirtual fqu.gu4 (Lgdz;)V
      // 060: goto 067
      // 063: invokestatic nce.a (Loov;)Loov;
      // 066: athrow
      // 067: invokestatic hzu.gp4 ()V
      // 06a: sipush 1028
      // 06d: invokestatic hzu.cf8 (I)V
      // 070: invokestatic hzu.dp2 ()V
      // 073: fconst_1
      // 074: ldc -1.0
      // 076: nop
      // 077: fconst_1
      // 078: invokestatic hzu.syc (FFF)V
      // 07b: ldc 0.2
      // 07d: nop
      // 07e: ldc 0.35
      // 080: nop
      // 081: ldc 0.5
      // 083: nop
      // 084: invokestatic hzu.a4k (FFF)V
      // 087: ldc 42.0
      // 089: nop
      // 08a: fconst_0
      // 08b: fconst_1
      // 08c: fconst_0
      // 08d: invokestatic hzu.a2h (FFFF)V
      // 090: invokestatic hzu.dp2 ()V
      // 093: ldc -0.5
      // 095: nop
      // 096: ldc -0.5
      // 098: nop
      // 099: ldc 0.5
      // 09b: nop
      // 09c: invokestatic hzu.a4k (FFF)V
      // 09f: iload 9
      // 0a1: ifne 0c2
      // 0a4: getstatic nce.k4c Z
      // 0a7: ifeq 0c7
      // 0aa: goto 0b1
      // 0ad: invokestatic nce.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield nce.t23 Ltf8;
      // 0b5: ldc 0.0625
      // 0b7: nop
      // 0b8: invokevirtual tf8.vca (F)V
      // 0bb: goto 0c2
      // 0be: invokestatic nce.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: iload 9
      // 0c4: ifeq 0da
      // 0c7: aload 10
      // 0c9: getstatic ox_.ae9 Lrrw;
      // 0cc: invokevirtual rrw.l4i ()Lzfz;
      // 0cf: fconst_1
      // 0d0: invokevirtual qfn._qd (Lzfz;F)V
      // 0d3: goto 0da
      // 0d6: invokestatic nce.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: invokestatic hzu.x3w ()V
      // 0dd: invokestatic hzu.dp2 ()V
      // 0e0: ldc 0.1
      // 0e2: nop
      // 0e3: fconst_0
      // 0e4: ldc -0.6
      // 0e6: nop
      // 0e7: invokestatic hzu.a4k (FFF)V
      // 0ea: ldc 42.0
      // 0ec: nop
      // 0ed: fconst_0
      // 0ee: fconst_1
      // 0ef: fconst_0
      // 0f0: invokestatic hzu.a2h (FFFF)V
      // 0f3: ldc -0.5
      // 0f5: nop
      // 0f6: ldc -0.5
      // 0f8: nop
      // 0f9: ldc 0.5
      // 0fb: nop
      // 0fc: invokestatic hzu.a4k (FFF)V
      // 0ff: iload 9
      // 101: ifne 122
      // 104: getstatic nce.k4c Z
      // 107: ifeq 127
      // 10a: goto 111
      // 10d: invokestatic nce.a (Loov;)Loov;
      // 110: athrow
      // 111: aload 0
      // 112: getfield nce.t23 Ltf8;
      // 115: ldc 0.0625
      // 117: nop
      // 118: invokevirtual tf8.vca (F)V
      // 11b: goto 122
      // 11e: invokestatic nce.a (Loov;)Loov;
      // 121: athrow
      // 122: iload 9
      // 124: ifeq 13a
      // 127: aload 10
      // 129: getstatic ox_.ae9 Lrrw;
      // 12c: invokevirtual rrw.l4i ()Lzfz;
      // 12f: fconst_1
      // 130: invokevirtual qfn._qd (Lzfz;F)V
      // 133: goto 13a
      // 136: invokestatic nce.a (Loov;)Loov;
      // 139: athrow
      // 13a: invokestatic hzu.x3w ()V
      // 13d: invokestatic hzu.x3w ()V
      // 140: invokestatic hzu.dp2 ()V
      // 143: aload 0
      // 144: getfield nce.t28 Lfqu;
      // 147: invokevirtual fqu.fy4 ()Lg6r;
      // 14a: checkcast tv9
      // 14d: getfield tv9._48 Ltf8;
      // 150: ldc 0.0625
      // 152: nop
      // 153: invokevirtual tf8.f2u (F)V
      // 156: fconst_1
      // 157: ldc -1.0
      // 159: nop
      // 15a: fconst_1
      // 15b: invokestatic hzu.syc (FFF)V
      // 15e: fconst_0
      // 15f: ldc 0.7
      // 161: nop
      // 162: ldc -0.2
      // 164: nop
      // 165: invokestatic hzu.a4k (FFF)V
      // 168: ldc 12.0
      // 16a: nop
      // 16b: fconst_0
      // 16c: fconst_1
      // 16d: fconst_0
      // 16e: invokestatic hzu.a2h (FFFF)V
      // 171: ldc -0.5
      // 173: nop
      // 174: ldc -0.5
      // 176: nop
      // 177: ldc 0.5
      // 179: nop
      // 17a: invokestatic hzu.a4k (FFF)V
      // 17d: iload 9
      // 17f: ifne 1a0
      // 182: getstatic nce.k4c Z
      // 185: ifeq 1a5
      // 188: goto 18f
      // 18b: invokestatic nce.a (Loov;)Loov;
      // 18e: athrow
      // 18f: aload 0
      // 190: getfield nce.t23 Ltf8;
      // 193: ldc 0.0625
      // 195: nop
      // 196: invokevirtual tf8.vca (F)V
      // 199: goto 1a0
      // 19c: invokestatic nce.a (Loov;)Loov;
      // 19f: athrow
      // 1a0: iload 9
      // 1a2: ifeq 1b8
      // 1a5: aload 10
      // 1a7: getstatic ox_.ae9 Lrrw;
      // 1aa: invokevirtual rrw.l4i ()Lzfz;
      // 1ad: fconst_1
      // 1ae: invokevirtual qfn._qd (Lzfz;F)V
      // 1b1: goto 1b8
      // 1b4: invokestatic nce.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: invokestatic hzu.x3w ()V
      // 1bb: sipush 1029
      // 1be: invokestatic hzu.cf8 (I)V
      // 1c1: invokestatic hzu.o1b ()V
      // 1c4: return
   }

   @Override
   public boolean shouldCombineTextures() {
      return true;
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.eng((ld0)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4397697531892758967L, 4154618654437136521L, MethodHandles.lookup().lookupClass()).a(43729294372958L);
      // $VF: monitorexit
      long var4 = var10000 ^ 99056355075325L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("~Ú\u0085ªØ'³\u0097¶Ng\u009e\u0015%ñ\u0099L^ÏT\u0000OÞ['LGâ\u008bËÖ\u0095oàî,ò{*ß".getBytes("ISO-8859-1"));
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      qm8 = new gdz(var0);
      k4c = false;
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
