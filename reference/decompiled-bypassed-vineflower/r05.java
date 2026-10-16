import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class r05 extends q4x {
   private static final long a;
   private static final String b;

   public r05(_f3 var1) {
      long var2 = a ^ 66521619083309L;
      super(new gdz(b));
      this.o_e = 0.0F;
      this.p_f = var1;
      this.v4c = true;
      this.bye = 0;
   }

   @Override
   public void _21() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield r05.p_f L_f3;
      // 08: iload 1
      // 09: ifne 58
      // 0c: getfield _f3.ma9 Z
      // 0f: ifeq 29
      // 12: goto 19
      // 15: invokestatic r05.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: bipush 1
      // 1b: putfield r05.h5_ Z
      // 1e: iload 1
      // 1f: ifeq ca
      // 22: goto 29
      // 25: invokestatic r05.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: aload 0
      // 2b: getfield r05.p_f L_f3;
      // 2e: getfield _f3.o2v D
      // 31: d2f
      // 32: putfield r05.gsm F
      // 35: aload 0
      // 36: aload 0
      // 37: getfield r05.p_f L_f3;
      // 3a: getfield _f3.kfp D
      // 3d: d2f
      // 3e: putfield r05.w2a F
      // 41: aload 0
      // 42: aload 0
      // 43: getfield r05.p_f L_f3;
      // 46: getfield _f3.vbd D
      // 49: d2f
      // 4a: putfield r05.uso F
      // 4d: aload 0
      // 4e: getfield r05.p_f L_f3;
      // 51: goto 58
      // 54: invokestatic r05.a (Loov;)Loov;
      // 57: athrow
      // 58: getfield _f3.icv D
      // 5b: aload 0
      // 5c: getfield r05.p_f L_f3;
      // 5f: getfield _f3.icv D
      // 62: dmul
      // 63: aload 0
      // 64: getfield r05.p_f L_f3;
      // 67: getfield _f3.bw4 D
      // 6a: aload 0
      // 6b: getfield r05.p_f L_f3;
      // 6e: getfield _f3.bw4 D
      // 71: dmul
      // 72: dadd
      // 73: invokestatic fe6.dii (D)F
      // 76: fstore 2
      // 77: iload 1
      // 78: ifne c5
      // 7b: fload 2
      // 7c: f2d
      // 7d: ldc2_w 0.01
      // 80: dcmpl
      // 81: iflt b9
      // 84: goto 8b
      // 87: invokestatic r05.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 0
      // 8c: aload 0
      // 8d: getfield r05.o_e F
      // 90: ldc 0.0025
      // 92: nop
      // 93: fadd
      // 94: fconst_0
      // 95: fconst_1
      // 96: invokestatic fe6._f3 (FFF)F
      // 99: putfield r05.o_e F
      // 9c: aload 0
      // 9d: fconst_0
      // 9e: fload 2
      // 9f: fconst_0
      // a0: ldc 0.5
      // a2: nop
      // a3: invokestatic fe6._f3 (FFF)F
      // a6: ldc 0.7
      // a8: nop
      // a9: fmul
      // aa: fadd
      // ab: putfield r05.n1s F
      // ae: iload 1
      // af: ifeq ca
      // b2: goto b9
      // b5: invokestatic r05.a (Loov;)Loov;
      // b8: athrow
      // b9: aload 0
      // ba: fconst_0
      // bb: putfield r05.o_e F
      // be: goto c5
      // c1: invokestatic r05.a (Loov;)Loov;
      // c4: athrow
      // c5: aload 0
      // c6: fconst_0
      // c7: putfield r05.n1s F
      // ca: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5355474921079592483L, 8118904287324662334L, MethodHandles.lookup().lookupClass()).a(102144568704888L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 109898629362054L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¿pá0È:\u008a{D\u009e{RP\u000f2\u0013ÅI¾ú»\u0083[ª".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
