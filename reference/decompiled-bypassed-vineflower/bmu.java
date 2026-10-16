import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bmu extends ar7 {
   private static final long a;
   private static final String f;

   public bmu() {
      long var1 = a ^ 89072620069948L;
      super(f, _aj.sxc, false, new j1s[0]);
   }

   @jev
   private void up8(_ts var1) {
      this.qf_();
   }

   private void qf_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: pop
      // 006: getstatic bmu.ek1 Lc05;
      // 009: getfield c05.oxn Lmoh;
      // 00c: getfield moh.i_y I
      // 00f: iload 1
      // 010: ifne 04a
      // 013: ifeq 01e
      // 016: goto 01d
      // 019: invokestatic bmu.a (Loov;)Loov;
      // 01c: athrow
      // 01d: return
      // 01e: invokestatic hzu._o4 ()V
      // 021: bipush 0
      // 022: invokestatic hzu.jun (Z)V
      // 025: bipush 0
      // 026: sipush 769
      // 029: bipush 1
      // 02a: bipush 0
      // 02b: invokestatic hzu.u39 (IIII)V
      // 02e: aload 0
      // 02f: pop
      // 030: getstatic bmu.ek1 Lc05;
      // 033: getfield c05.vg8 Ll86;
      // 036: invokevirtual l86.i55 ()F
      // 039: aload 0
      // 03a: pop
      // 03b: getstatic bmu.ek1 Lc05;
      // 03e: getfield c05.vg8 Ll86;
      // 041: invokevirtual l86.axb ()F
      // 044: fdiv
      // 045: ldc 100.0
      // 047: nop
      // 048: fmul
      // 049: f2i
      // 04a: istore 2
      // 04b: iload 2
      // 04c: bipush 10
      // 04e: iload 1
      // 04f: ifne 078
      // 052: if_icmpgt 06e
      // 055: goto 05c
      // 058: invokestatic bmu.a (Loov;)Loov;
      // 05b: athrow
      // 05c: fconst_0
      // 05d: fconst_1
      // 05e: fconst_1
      // 05f: fconst_1
      // 060: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 063: iload 1
      // 064: ifeq 0cd
      // 067: goto 06e
      // 06a: invokestatic bmu.a (Loov;)Loov;
      // 06d: athrow
      // 06e: iload 2
      // 06f: bipush 20
      // 071: goto 078
      // 074: invokestatic bmu.a (Loov;)Loov;
      // 077: athrow
      // 078: iload 1
      // 079: ifne 0a6
      // 07c: if_icmpgt 09c
      // 07f: goto 086
      // 082: invokestatic bmu.a (Loov;)Loov;
      // 085: athrow
      // 086: fconst_0
      // 087: ldc 0.8
      // 089: nop
      // 08a: ldc 0.8
      // 08c: nop
      // 08d: fconst_1
      // 08e: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 091: iload 1
      // 092: ifeq 0cd
      // 095: goto 09c
      // 098: invokestatic bmu.a (Loov;)Loov;
      // 09b: athrow
      // 09c: iload 2
      // 09d: bipush 50
      // 09f: goto 0a6
      // 0a2: invokestatic bmu.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: if_icmpgt 0bf
      // 0a9: fconst_0
      // 0aa: ldc 0.5
      // 0ac: nop
      // 0ad: ldc 0.5
      // 0af: nop
      // 0b0: fconst_1
      // 0b1: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 0b4: iload 1
      // 0b5: ifeq 0cd
      // 0b8: goto 0bf
      // 0bb: invokestatic bmu.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: fconst_0
      // 0c0: fconst_0
      // 0c1: fconst_0
      // 0c2: fconst_0
      // 0c3: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 0c6: goto 0cd
      // 0c9: invokestatic bmu.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: new eka
      // 0d0: dup
      // 0d1: getstatic bmu.ek1 Lc05;
      // 0d4: invokespecial eka.<init> (Lc05;)V
      // 0d7: astore 3
      // 0d8: aload 0
      // 0d9: pop
      // 0da: getstatic bmu.ek1 Lc05;
      // 0dd: invokevirtual c05.l22 ()Llc5;
      // 0e0: getstatic d1f.wau Lgdz;
      // 0e3: invokevirtual lc5.anl (Lgdz;)V
      // 0e6: invokestatic jom.yut ()Ljom;
      // 0e9: astore 4
      // 0eb: aload 4
      // 0ed: invokevirtual jom.zuq ()Lq3g;
      // 0f0: astore 5
      // 0f2: aload 5
      // 0f4: bipush 7
      // 0f6: getstatic gnl._r5 Lbe7;
      // 0f9: invokevirtual q3g.ezr (ILbe7;)V
      // 0fc: aload 5
      // 0fe: dconst_0
      // 0ff: aload 3
      // 100: invokevirtual eka.lrx ()I
      // 103: i2d
      // 104: ldc2_w -90.0
      // 107: invokevirtual q3g.g5o (DDD)Lq3g;
      // 10a: dconst_0
      // 10b: dconst_1
      // 10c: invokevirtual q3g.h0a (DD)Lq3g;
      // 10f: invokevirtual q3g.pzw ()V
      // 112: aload 5
      // 114: aload 3
      // 115: invokevirtual eka.x05 ()I
      // 118: i2d
      // 119: aload 3
      // 11a: invokevirtual eka.lrx ()I
      // 11d: i2d
      // 11e: ldc2_w -90.0
      // 121: invokevirtual q3g.g5o (DDD)Lq3g;
      // 124: dconst_1
      // 125: dconst_1
      // 126: invokevirtual q3g.h0a (DD)Lq3g;
      // 129: invokevirtual q3g.pzw ()V
      // 12c: aload 5
      // 12e: aload 3
      // 12f: invokevirtual eka.x05 ()I
      // 132: i2d
      // 133: dconst_0
      // 134: ldc2_w -90.0
      // 137: invokevirtual q3g.g5o (DDD)Lq3g;
      // 13a: dconst_1
      // 13b: dconst_0
      // 13c: invokevirtual q3g.h0a (DD)Lq3g;
      // 13f: invokevirtual q3g.pzw ()V
      // 142: aload 5
      // 144: dconst_0
      // 145: dconst_0
      // 146: ldc2_w -90.0
      // 149: invokevirtual q3g.g5o (DDD)Lq3g;
      // 14c: dconst_0
      // 14d: dconst_0
      // 14e: invokevirtual q3g.h0a (DD)Lq3g;
      // 151: invokevirtual q3g.pzw ()V
      // 154: aload 4
      // 156: invokevirtual jom.q7g ()V
      // 159: bipush 1
      // 15a: invokestatic hzu.jun (Z)V
      // 15d: invokestatic hzu.m45 ()V
      // 160: fconst_1
      // 161: fconst_1
      // 162: fconst_1
      // 163: fconst_1
      // 164: invokestatic hzu.wn0 (FFFF)V
      // 167: sipush 770
      // 16a: sipush 771
      // 16d: bipush 1
      // 16e: bipush 0
      // 16f: invokestatic hzu.u39 (IIII)V
      // 172: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8727534583444342624L, -3370751348211453503L, MethodHandles.lookup().lookupClass()).a(177486610682165L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 37695823087076L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ì\u0085ÌiU¸ \u008f\u008bÿ\f\u0092æî\u0082\u0004".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
