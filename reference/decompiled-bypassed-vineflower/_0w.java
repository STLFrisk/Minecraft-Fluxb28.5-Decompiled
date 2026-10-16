import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _0w extends so9 {
   public _0w(hr_ var1, g6r var2, float var3) {
      super(var1, var2, var3);
      this.d4f(new bpv(this));
   }

   public float ljg(gse var1, float var2) {
      return var1.qbh();
   }

   public void i3i(gse param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 10
      // 05: aload 1
      // 06: iload 10
      // 08: ifeq 20
      // 0b: invokevirtual gse.n8j ()Z
      // 0e: ifeq 37
      // 11: goto 18
      // 14: invokestatic _0w.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: goto 20
      // 1c: invokestatic _0w.a (Loov;)Loov;
      // 1f: athrow
      // 20: fload 9
      // 22: invokevirtual gse.xeu (F)F
      // 25: aload 1
      // 26: fload 9
      // 28: invokevirtual gse.rnc (F)F
      // 2b: fmul
      // 2c: fstore 11
      // 2e: fload 11
      // 30: fload 11
      // 32: fload 11
      // 34: invokestatic hzu.oxa (FFF)V
      // 37: aload 0
      // 38: aload 1
      // 39: dload 2
      // 3a: dload 4
      // 3c: dload 6
      // 3e: fload 8
      // 40: fload 9
      // 42: invokespecial so9.w_x (Lyqv;DDDFF)V
      // 45: return
   }

   public gdz uuq(gse param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual gse.j1j ()Z
      // 08: iload 2
      // 09: ifne 24
      // 0c: ifeq 20
      // 0f: goto 16
      // 12: invokestatic _0w.a (Loov;)Loov;
      // 15: athrow
      // 16: getstatic _0w.fwf Lgdz;
      // 19: goto 34
      // 1c: invokestatic _0w.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: invokevirtual gse.iki ()Z
      // 24: ifeq 31
      // 27: getstatic _0w.o0z Lgdz;
      // 2a: goto 34
      // 2d: invokestatic _0w.a (Loov;)Loov;
      // 30: athrow
      // 31: getstatic _0w.avm Lgdz;
      // 34: areturn
   }

   @Override
   public void w_x(yqv var1, double var2, double var4, double var6, float var8, float var9) {
      this.i3i((gse)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public float xwp(g_3 var1, float var2) {
      return this.ljg((gse)var1, var2);
   }

   @Override
   public void l1o(g_3 var1, double var2, double var4, double var6, float var8, float var9) {
      this.i3i((gse)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.uuq((gse)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.i3i((gse)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1803998316088600710L, -3903479901558287818L, MethodHandles.lookup().lookupClass()).a(265776470443822L);
      // $VF: monitorexit
      long var10 = var10000 ^ 20969525015269L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[3];
      int var6 = 0;
      String var5 = "3KZL\u0093ì\u008b®ì\u0096+\u0089f\rÍ.\u008d|_0\u0090³\u001db\u0003KäÞ\u0007c\u001fo×úÍs\u008eo\u008d\u009f 3KZL\u0093ì\u008b®ì\u0096+\u0089f\rÍ.\u008d|_0\u0090³\u001db\u0093\u000e\u0015\u001f\u0011Rm0(3KZL\u0093ì\u008b®ì\u0096+\u0089f\rÍ.\u008d|_0\u0090³\u001db\u000f\u008cÓ|\u0092¦°?²+Èg\fÕE×";
      int var7 = "3KZL\u0093ì\u008b®ì\u0096+\u0089f\rÍ.\u008d|_0\u0090³\u001db\u0003KäÞ\u0007c\u001fo×úÍs\u008eo\u008d\u009f 3KZL\u0093ì\u008b®ì\u0096+\u0089f\rÍ.\u008d|_0\u0090³\u001db\u0093\u000e\u0015\u001f\u0011Rm0(3KZL\u0093ì\u008b®ì\u0096+\u0089f\rÍ.\u008d|_0\u0090³\u001db\u000f\u008cÓ|\u0092¦°?²+Èg\fÕE×"
         .length();
      char var4 = '(';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = c(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            avm = new gdz(var8[1]);
            fwf = new gdz(var8[2]);
            o0z = new gdz(var8[0]);
            return;
         }

         var4 = var5.charAt(var3);
      }
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
