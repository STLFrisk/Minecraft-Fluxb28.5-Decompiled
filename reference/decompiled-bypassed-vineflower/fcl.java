import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fcl extends so9 {
   public fcl(hr_ var1) {
      super(var1, new lp1(), 0.25F);
   }

   public gdz i6n(l5f var1) {
      return a9w;
   }

   public void yaw(l5f var1, float var2) {
      hzu.syc(0.35F, 0.35F, 0.35F);
   }

   public void _bw(l5f param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: invokevirtual l5f.qm1 ()Z
      // 09: ifne 29
      // 0c: fconst_0
      // 0d: fload 2
      // 0e: ldc 0.3
      // 10: nop
      // 11: fmul
      // 12: invokestatic fe6.ssk (F)F
      // 15: ldc 0.1
      // 17: nop
      // 18: fmul
      // 19: fconst_0
      // 1a: invokestatic hzu.a4k (FFF)V
      // 1d: iload 5
      // 1f: ifne 38
      // 22: goto 29
      // 25: invokestatic fcl.a (Loov;)Loov;
      // 28: athrow
      // 29: fconst_0
      // 2a: ldc -0.1
      // 2c: nop
      // 2d: fconst_0
      // 2e: invokestatic hzu.a4k (FFF)V
      // 31: goto 38
      // 34: invokestatic fcl.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: aload 1
      // 3a: fload 2
      // 3b: fload 3
      // 3c: fload 4
      // 3e: invokespecial so9.ur9 (Lg_3;FFF)V
      // 41: return
   }

   @Override
   public void e2w(g_3 var1, float var2) {
      this.yaw((l5f)var1, var2);
   }

   @Override
   public void ur9(g_3 var1, float var2, float var3, float var4) {
      this._bw((l5f)var1, var2, var3, var4);
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.i6n((l5f)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5326064001481920098L, -5381550314998903278L, MethodHandles.lookup().lookupClass()).a(45208109079638L);
      // $VF: monitorexit
      long var4 = var10000 ^ 110519817145130L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("Ñn\u001c0û`¹m\u007f£W\u0082ý\u001aË\u000eø\tdÀ¢\u0015Î¥".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      a9w = new gdz(var0);
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
