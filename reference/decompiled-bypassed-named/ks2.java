import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ks2 extends flo {
   private static final gdz iyl;
   private int mz9;
   private int hw6;
   private lc5 fd8;

   public ks2(lc5 var1, OpaquePredicate var2, double var3, double var5, double var7) {
      super(var2, var3, var5, var7, 0.0, 0.0, 0.0);
      this.fd8 = var1;
      this.icv = this.mop = this.bw4 = 0.0;
      this.hw6 = 200;
   }

   @Override
   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var10 = ((float)this.mz9 + var3) / (float)this.hw6;
      int var10000 = OpaquePredicate.c();
      var10 *= var10;
      int var9 = var10000;
      float var11 = 2.0F - var10 * 2.0F;

      float var10001;
      label21: {
         label20: {
            try {
               var20 = var11;
               var10001 = 1.0F;
               if (var9 != 0) {
                  break label21;
               }

               if (!(var11 > 1.0F)) {
                  break label20;
               }
            } catch (oov var17) {
               throw a(var17);
            }

            var11 = 1.0F;
         }

         var20 = var11;
         var10001 = 0.2F;
      }

      var11 = var20 * var10001;
      hzu.fpt();
      float var12 = 0.125F;
      float var13 = (float)(this.o2v - mrd);
      float var14 = (float)(this.kfp - txo);
      float var15 = (float)(this.vbd - bta);
      float var16 = this.oay.rgh(new mew(this));
      this.fd8.anl(iyl);
      hzu.spd();
      hzu.ru7(770, 771);
      var1.ezr(7, gnl.rad);
      var1.g5o((double)(var13 - 0.125F), (double)var14, (double)(var15 + 0.125F)).h0a(0.0, 1.0).gs4(var16, var16, var16, var11).pzw();
      var1.g5o((double)(var13 + 0.125F), (double)var14, (double)(var15 + 0.125F)).h0a(1.0, 1.0).gs4(var16, var16, var16, var11).pzw();
      var1.g5o((double)(var13 + 0.125F), (double)var14, (double)(var15 - 0.125F)).h0a(1.0, 0.0).gs4(var16, var16, var16, var11).pzw();
      var1.g5o((double)(var13 - 0.125F), (double)var14, (double)(var15 - 0.125F)).h0a(0.0, 0.0).gs4(var16, var16, var16, var11).pzw();
      jom.yut().q7g();
      hzu.ux6();
      hzu.s7q();
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: dup
      // 06: getfield ks2.mz9 I
      // 09: bipush 1
      // 0a: iadd
      // 0b: putfield ks2.mz9 I
      // 0e: aload 0
      // 0f: iload 1
      // 10: ifne 2c
      // 13: getfield ks2.mz9 I
      // 16: aload 0
      // 17: getfield ks2.hw6 I
      // 1a: if_icmpne 2f
      // 1d: goto 24
      // 20: invokestatic ks2.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: goto 2c
      // 28: invokestatic ks2.a (Loov;)Loov;
      // 2b: athrow
      // 2c: invokevirtual ks2._kl ()V
      // 2f: return
   }

   @Override
   public int ikr() {
      return 3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2225020282474297270L, -8956452364846222035L, MethodHandles.lookup().lookupClass()).a(82350843196003L);
      // $VF: monitorexit
      long var4 = var10000 ^ 22726157141253L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u008f{÷\u009aN%îáq\u0000ïT\u000b\u0091\u001ba\u0012ã\u0096J´&ôÒ\u008fíÂ¡:\flô".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      iyl = new gdz(var0);
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
