import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class stt extends so9 {
   public stt(hr_ var1) {
      super(var1, new e_y(), 0.5F);
      this.d4f(new r8t(this));
   }

   public gdz l8p(osf var1) {
      return hyk;
   }

   public void sgj(osf param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: fload 2
      // 08: fload 3
      // 09: fload 4
      // 0b: invokespecial so9.ur9 (Lg_3;FFF)V
      // 0e: aload 1
      // 0f: getfield osf.zzf F
      // 12: iload 5
      // 14: ifne 30
      // 17: f2d
      // 18: ldc2_w 0.01
      // 1b: dcmpl
      // 1c: iflt 71
      // 1f: goto 26
      // 22: invokestatic stt.a (Loov;)Loov;
      // 25: athrow
      // 26: ldc 13.0
      // 28: nop
      // 29: goto 30
      // 2c: invokestatic stt.a (Loov;)Loov;
      // 2f: athrow
      // 30: fstore 6
      // 32: aload 1
      // 33: getfield osf.pcb F
      // 36: aload 1
      // 37: getfield osf.zzf F
      // 3a: fconst_1
      // 3b: fload 4
      // 3d: fsub
      // 3e: fmul
      // 3f: fsub
      // 40: ldc 6.0
      // 42: nop
      // 43: fadd
      // 44: fstore 7
      // 46: fload 7
      // 48: fload 6
      // 4a: frem
      // 4b: fload 6
      // 4d: ldc 0.5
      // 4f: nop
      // 50: fmul
      // 51: fsub
      // 52: invokestatic java/lang/Math.abs (F)F
      // 55: fload 6
      // 57: ldc 0.25
      // 59: nop
      // 5a: fmul
      // 5b: fsub
      // 5c: fload 6
      // 5e: ldc 0.25
      // 60: nop
      // 61: fmul
      // 62: fdiv
      // 63: fstore 8
      // 65: ldc 6.5
      // 67: nop
      // 68: fload 8
      // 6a: fmul
      // 6b: fconst_0
      // 6c: fconst_0
      // 6d: fconst_1
      // 6e: invokestatic hzu.a2h (FFFF)V
      // 71: return
   }

   @Override
   public void ur9(g_3 var1, float var2, float var3, float var4) {
      this.sgj((osf)var1, var2, var3, var4);
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.l8p((osf)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8425025865623782245L, -723710300797861745L, MethodHandles.lookup().lookupClass()).a(171478057980317L);
      // $VF: monitorexit
      long var4 = var10000 ^ 26527104027008L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0091Pô\u0094ì§LÌÌ\u007fçþ*p¡\rÑá\u007f\u00001\u0015Ã\u0011hº\u009d5\u0012\u0014\\\u008b".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      hyk = new gdz(var0);
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
