import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cu5 implements gnj {
   public cu5(_35 var1) {
      this.ghy = var1;
   }

   public void a8_(ju8 param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: aload 1
      // 06: invokevirtual ju8.kvl ()Z
      // 09: iload 9
      // 0b: ifne 23
      // 0e: ifeq d7
      // 11: goto 18
      // 14: invokestatic cu5.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: invokevirtual ju8.h5u ()Z
      // 1c: goto 23
      // 1f: invokestatic cu5.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 9
      // 25: ifne 33
      // 28: ifne 36
      // 2b: goto 32
      // 2e: invokestatic cu5.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: invokestatic hzu.jun (Z)V
      // 3a: aload 0
      // 3b: getfield cu5.ghy L_35;
      // 3e: getstatic cu5.gc0 Lgdz;
      // 41: invokevirtual _35.gu4 (Lgdz;)V
      // 44: sipush 5890
      // 47: invokestatic hzu.ah8 (I)V
      // 4a: invokestatic hzu.zwy ()V
      // 4d: aload 1
      // 4e: getfield ju8.g25 I
      // 51: i2f
      // 52: fload 4
      // 54: fadd
      // 55: fstore 10
      // 57: fload 10
      // 59: ldc 0.02
      // 5b: nop
      // 5c: fmul
      // 5d: invokestatic fe6.ssk (F)F
      // 60: ldc 3.0
      // 62: nop
      // 63: fmul
      // 64: fstore 11
      // 66: fload 10
      // 68: ldc 0.01
      // 6a: nop
      // 6b: fmul
      // 6c: fstore 12
      // 6e: fload 11
      // 70: fload 12
      // 72: fconst_0
      // 73: invokestatic hzu.a4k (FFF)V
      // 76: sipush 5888
      // 79: invokestatic hzu.ah8 (I)V
      // 7c: invokestatic hzu.spd ()V
      // 7f: ldc 0.5
      // 81: nop
      // 82: fstore 13
      // 84: fload 13
      // 86: fload 13
      // 88: fload 13
      // 8a: fconst_1
      // 8b: invokestatic hzu.wn0 (FFFF)V
      // 8e: invokestatic hzu.fpt ()V
      // 91: bipush 1
      // 92: bipush 1
      // 93: invokestatic hzu.ru7 (II)V
      // 96: aload 0
      // 97: getfield cu5.g9z Lrno;
      // 9a: aload 1
      // 9b: fload 2
      // 9c: fload 3
      // 9d: fload 4
      // 9f: invokevirtual rno.v3g (Lg_3;FFF)V
      // a2: aload 0
      // a3: getfield cu5.g9z Lrno;
      // a6: aload 0
      // a7: getfield cu5.ghy L_35;
      // aa: invokevirtual _35.fy4 ()Lg6r;
      // ad: invokevirtual rno.jxr (Lg6r;)V
      // b0: aload 0
      // b1: getfield cu5.g9z Lrno;
      // b4: aload 1
      // b5: fload 2
      // b6: fload 3
      // b7: fload 5
      // b9: fload 6
      // bb: fload 7
      // bd: fload 8
      // bf: invokevirtual rno.s_q (Li2h;FFFFFF)V
      // c2: sipush 5890
      // c5: invokestatic hzu.ah8 (I)V
      // c8: invokestatic hzu.zwy ()V
      // cb: sipush 5888
      // ce: invokestatic hzu.ah8 (I)V
      // d1: invokestatic hzu.s7q ()V
      // d4: invokestatic hzu.ux6 ()V
      // d7: return
   }

   @Override
   public boolean shouldCombineTextures() {
      return false;
   }

   @Override
   public void doRenderLayer(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.a8_((ju8)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3432726061412254030L, -3387275722494734426L, MethodHandles.lookup().lookupClass()).a(177961591074400L);
      // $VF: monitorexit
      long var4 = var10000 ^ 60495257445219L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "\u0003\u0011GÔ¦å\u001d³\u001d;\u001eui2\u0080\u0012eúýQýð\u0005\u008d\u0098Ý¼¬®\u0091÷EÕ/\u0019\u0006}6Ö4".getBytes("ISO-8859-1")
      );
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      gc0 = new gdz(var0);
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
