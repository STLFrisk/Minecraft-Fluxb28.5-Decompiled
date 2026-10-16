import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bpv implements gnj {
   public bpv(_0w var1) {
      this.kxx = var1;
   }

   public void xon(gse param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 1
      // 06: invokevirtual gse.j1j ()Z
      // 09: iload 9
      // 0b: ifeq 23
      // 0e: ifeq 95
      // 11: goto 18
      // 14: invokestatic bpv.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: invokevirtual gse.h5u ()Z
      // 1c: goto 23
      // 1f: invokestatic bpv.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 9
      // 25: ifeq 4a
      // 28: ifne 95
      // 2b: goto 32
      // 2e: invokestatic bpv.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield bpv.kxx L_0w;
      // 36: getstatic bpv.koz Lgdz;
      // 39: invokevirtual _0w.gu4 (Lgdz;)V
      // 3c: aload 1
      // 3d: invokevirtual gse.lwj ()Lqvg;
      // 40: invokevirtual qvg.hoo ()I
      // 43: goto 4a
      // 46: invokestatic bpv.a (Loov;)Loov;
      // 49: athrow
      // 4a: invokestatic qvg.hup (I)Lqvg;
      // 4d: astore 10
      // 4f: aload 10
      // 51: invokestatic ia2.kn7 (Lqvg;)[F
      // 54: astore 11
      // 56: iload 9
      // 58: ifeq 80
      // 5b: invokestatic hxt.xe2 ()Z
      // 5e: ifeq 71
      // 61: goto 68
      // 64: invokestatic bpv.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 10
      // 6a: aload 11
      // 6c: invokestatic net/optifine/CustomColors.getWolfCollarColors (Lqvg;[F)[F
      // 6f: astore 11
      // 71: aload 11
      // 73: bipush 0
      // 74: faload
      // 75: aload 11
      // 77: bipush 1
      // 78: faload
      // 79: aload 11
      // 7b: bipush 2
      // 7c: faload
      // 7d: invokestatic hzu.oxa (FFF)V
      // 80: aload 0
      // 81: getfield bpv.kxx L_0w;
      // 84: invokevirtual _0w.fy4 ()Lg6r;
      // 87: aload 1
      // 88: fload 2
      // 89: fload 3
      // 8a: fload 5
      // 8c: fload 6
      // 8e: fload 7
      // 90: fload 8
      // 92: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 95: return
   }

   @Override
   public boolean shouldCombineTextures() {
      return true;
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.xon((gse)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6407777019785210499L, -8644501056772496823L, MethodHandles.lookup().lookupClass()).a(152892551929843L);
      // $VF: monitorexit
      long var4 = var10000 ^ 7117409918382L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("z\\b \u0016@Ðä\u008f0\u0018¹\u0091\u0089\u0088²ä¸¥ãdH=\u009c§q\u000fµ~Ï\u008dNØ¥%ú\u009a}.4".getBytes("ISO-8859-1"));
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      koz = new gdz(var0);
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
