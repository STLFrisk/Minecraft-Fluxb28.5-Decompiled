import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bbe extends so9 {
   public bbe(hr_ var1) {
      super(var1, new t4e(), 0.5F);
      this.d4f(new j61(this));
   }

   public void yoo(gze var1, float var2) {
      float var3 = var1.x9h(var2);
      float var4 = 1.0F + fe6.rtn(var3 * 100.0F) * var3 * 0.01F;
      var3 = fe6._f3(var3, 0.0F, 1.0F);
      var3 *= var3;
      var3 *= var3;
      float var5 = (1.0F + var3 * 0.4F) * var4;
      float var6 = (1.0F + var3 * 0.1F) / var4;
      hzu.syc(var5, var6, var5);
   }

   public int i25(gze param1, float param2, float param3) {
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
      // 06: fload 3
      // 07: invokevirtual gze.x9h (F)F
      // 0a: fstore 5
      // 0c: fload 5
      // 0e: ldc 10.0
      // 10: nop
      // 11: fmul
      // 12: f2i
      // 13: bipush 2
      // 14: irem
      // 15: iload 4
      // 17: ifne 35
      // 1a: ifne 2a
      // 1d: goto 24
      // 20: invokestatic bbe.a (Loov;)Loov;
      // 23: athrow
      // 24: bipush 0
      // 25: ireturn
      // 26: invokestatic bbe.a (Loov;)Loov;
      // 29: athrow
      // 2a: fload 5
      // 2c: ldc 0.2
      // 2e: nop
      // 2f: fmul
      // 30: ldc 255.0
      // 32: nop
      // 33: fmul
      // 34: f2i
      // 35: istore 6
      // 37: iload 6
      // 39: bipush 0
      // 3a: sipush 255
      // 3d: invokestatic fe6.faa (III)I
      // 40: istore 6
      // 42: iload 6
      // 44: bipush 24
      // 46: ishl
      // 47: ldc 16777215
      // 49: nop
      // 4a: ior
      // 4b: ireturn
   }

   public gdz xzx(gze var1) {
      return hz_;
   }

   @Override
   public void e2w(g_3 var1, float var2) {
      this.yoo((gze)var1, var2);
   }

   @Override
   public int mq9(g_3 var1, float var2, float var3) {
      return this.i25((gze)var1, var2, var3);
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.xzx((gze)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1266905151986182583L, 823592883533893463L, MethodHandles.lookup().lookupClass()).a(180368134530989L);
      // $VF: monitorexit
      long var4 = var10000 ^ 71889963091979L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "Ù\u001aÛJ#ªb6\u001f¦½ïó#\u001a \u0000\u0019\u009e`Òä\u0019ÎD.\u0010X¤à\u0080'\u007f}\u001a\u001f \u0018¾z".getBytes("ISO-8859-1")
      );
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      hz_ = new gdz(var0);
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
