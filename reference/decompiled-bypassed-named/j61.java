import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class j61 implements gnj {
   public j61(bbe var1) {
      this.ydp = var1;
   }

   public void gv0(EntitySkeleton param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 9
      // 05: aload 1
      // 06: invokevirtual EntitySkeleton.pap ()Z
      // 09: iload 9
      // 0b: ifeq 23
      // 0e: ifeq c5
      // 11: goto 18
      // 14: invokestatic j61.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: invokevirtual EntitySkeleton.h5u ()Z
      // 1c: goto 23
      // 1f: invokestatic j61.a (Loov;)Loov;
      // 22: athrow
      // 23: istore 10
      // 25: iload 10
      // 27: iload 9
      // 29: ifeq 37
      // 2c: ifne 3a
      // 2f: goto 36
      // 32: invokestatic j61.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3b
      // 3a: bipush 0
      // 3b: invokestatic hzu.jun (Z)V
      // 3e: aload 0
      // 3f: getfield j61.ydp Lbbe;
      // 42: getstatic j61.k14 Lgdz;
      // 45: invokevirtual bbe.gu4 (Lgdz;)V
      // 48: sipush 5890
      // 4b: invokestatic hzu.ah8 (I)V
      // 4e: invokestatic hzu.zwy ()V
      // 51: aload 1
      // 52: getfield EntitySkeleton.g25 I
      // 55: i2f
      // 56: fload 4
      // 58: fadd
      // 59: fstore 11
      // 5b: fload 11
      // 5d: ldc 0.01
      // 5f: nop
      // 60: fmul
      // 61: fload 11
      // 63: ldc 0.01
      // 65: nop
      // 66: fmul
      // 67: fconst_0
      // 68: invokestatic hzu.a4k (FFF)V
      // 6b: sipush 5888
      // 6e: invokestatic hzu.ah8 (I)V
      // 71: invokestatic hzu.spd ()V
      // 74: ldc 0.5
      // 76: nop
      // 77: fstore 12
      // 79: fload 12
      // 7b: fload 12
      // 7d: fload 12
      // 7f: fconst_1
      // 80: invokestatic hzu.wn0 (FFFF)V
      // 83: invokestatic hzu.fpt ()V
      // 86: bipush 1
      // 87: bipush 1
      // 88: invokestatic hzu.ru7 (II)V
      // 8b: aload 0
      // 8c: getfield j61.onc Lt4e;
      // 8f: aload 0
      // 90: getfield j61.ydp Lbbe;
      // 93: invokevirtual bbe.fy4 ()Lg6r;
      // 96: invokevirtual t4e.jxr (Lg6r;)V
      // 99: aload 0
      // 9a: getfield j61.onc Lt4e;
      // 9d: aload 1
      // 9e: fload 2
      // 9f: fload 3
      // a0: fload 5
      // a2: fload 6
      // a4: fload 7
      // a6: fload 8
      // a8: invokevirtual t4e.s_q (Li2h;FFFFFF)V
      // ab: sipush 5890
      // ae: invokestatic hzu.ah8 (I)V
      // b1: invokestatic hzu.zwy ()V
      // b4: sipush 5888
      // b7: invokestatic hzu.ah8 (I)V
      // ba: invokestatic hzu.s7q ()V
      // bd: invokestatic hzu.ux6 ()V
      // c0: iload 10
      // c2: invokestatic hzu.jun (Z)V
      // c5: return
   }

   @Override
   public boolean shouldCombineTextures() {
      return false;
   }

   @Override
   public void doRenderLayer(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.gv0((EntitySkeleton)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4194960886817073523L, -4829914161117320266L, MethodHandles.lookup().lookupClass()).a(94292597001615L);
      // $VF: monitorexit
      long var4 = var10000 ^ 120889198027368L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "¶È\u0010\u0019¤Íik\u0087Qü\u000f\u009d¹Ä\u0005\t²îåß\u001fU\u001bì\u0003\u0015-pÁý¸lÉ\u0003K0\u001c\u000bõ\u008e@¡å³Ù²i".getBytes("ISO-8859-1")
      );
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      k14 = new gdz(var0);
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
