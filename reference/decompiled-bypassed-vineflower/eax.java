import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class eax extends ar7 {
   public float yzo;
   public float o5q;
   public float sen;
   public float b9b;
   private static final long a;
   private static final String f;

   public eax() {
      long var1 = a ^ 5609839929676L;
      super(f, _aj.sxc, false, new j1s[0]);
   }

   @jev(
      jn1 = 4
   )
   public void gvu(q8e var1) {
      this.yzo = var1.uto;
      this.o5q = var1._jg;
   }

   @jev
   public void tri(ccn var1) {
      this.sen = this.yzo;
      this.b9b = this.o5q;
   }

   @jev
   public void pz_(oc6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 24
      // 09: invokevirtual oc6.nwx ()Lg_3;
      // 0c: getstatic eax.ek1 Lc05;
      // 0f: getfield c05.vg8 Ll86;
      // 12: if_acmpne 84
      // 15: goto 1c
      // 18: invokestatic eax.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: goto 24
      // 20: invokestatic eax.a (Loov;)Loov;
      // 23: athrow
      // 24: invokevirtual oc6.kjn ()F
      // 27: fconst_1
      // 28: fcmpl
      // 29: ifeq 84
      // 2c: getstatic eax.ek1 Lc05;
      // 2f: getfield c05.vg8 Ll86;
      // 32: getfield l86.hzp Li2h;
      // 35: ifnonnull 84
      // 38: goto 3f
      // 3b: invokestatic eax.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 1
      // 40: aload 1
      // 41: invokevirtual oc6.kjn ()F
      // 44: aload 0
      // 45: getfield eax.sen F
      // 48: aload 0
      // 49: getfield eax.yzo F
      // 4c: invokestatic eax.r6w (FFF)F
      // 4f: invokevirtual oc6.tdl (F)V
      // 52: aload 1
      // 53: aload 1
      // 54: invokevirtual oc6.kjn ()F
      // 57: aload 0
      // 58: getfield eax.sen F
      // 5b: aload 0
      // 5c: getfield eax.yzo F
      // 5f: invokestatic eax.r6w (FFF)F
      // 62: aload 1
      // 63: invokevirtual oc6.zl3 ()F
      // 66: fsub
      // 67: invokevirtual oc6.eni (F)V
      // 6a: aload 1
      // 6b: aload 1
      // 6c: invokevirtual oc6.kjn ()F
      // 6f: aload 0
      // 70: getfield eax.b9b F
      // 73: aload 0
      // 74: getfield eax.o5q F
      // 77: invokestatic eax.m0l (FFF)F
      // 7a: invokevirtual oc6.n5r (F)V
      // 7d: goto 84
      // 80: invokestatic eax.a (Loov;)Loov;
      // 83: athrow
      // 84: return
   }

   public static float r6w(float var0, float var1, float var2) {
      return var1 + var0 * fe6.qsy(var2 - var1);
   }

   public static float m0l(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1224058711872270046L, 3398186259538459678L, MethodHandles.lookup().lookupClass()).a(28360197180413L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 22615526202410L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("sÇãhÐ\u0083\u0014 \u0018f»FRfs¢\u0017°{E#\u0019É\u008d".getBytes("ISO-8859-1"));
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
