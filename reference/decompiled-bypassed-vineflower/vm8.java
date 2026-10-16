import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vm8 implements gnj {
   public vm8(fjt var1) {
      this.c64 = var1;
   }

   public void qi8(u10 param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield vm8.c64 Lfjt;
      // 04: getstatic vm8._se Lgdz;
      // 07: invokevirtual fjt.gu4 (Lgdz;)V
      // 0a: invokestatic t9d.c ()I
      // 0d: invokestatic hzu.spd ()V
      // 10: invokestatic hzu.vtj ()V
      // 13: istore 9
      // 15: bipush 1
      // 16: bipush 1
      // 17: invokestatic hzu.ru7 (II)V
      // 1a: aload 1
      // 1b: invokevirtual u10.h5u ()Z
      // 1e: iload 9
      // 20: ifne 45
      // 23: ifeq 3d
      // 26: goto 2d
      // 29: invokestatic vm8.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: invokestatic hzu.jun (Z)V
      // 31: iload 9
      // 33: ifeq 48
      // 36: goto 3d
      // 39: invokestatic vm8.a (Loov;)Loov;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 45
      // 41: invokestatic vm8.a (Loov;)Loov;
      // 44: athrow
      // 45: invokestatic hzu.jun (Z)V
      // 48: ldc 61680
      // 4a: nop
      // 4b: istore 10
      // 4d: iload 10
      // 4f: ldc 65536
      // 51: nop
      // 52: irem
      // 53: istore 11
      // 55: iload 10
      // 57: ldc 65536
      // 59: nop
      // 5a: idiv
      // 5b: istore 12
      // 5d: getstatic gis.exn I
      // 60: iload 11
      // 62: i2f
      // 63: fconst_1
      // 64: fdiv
      // 65: iload 12
      // 67: i2f
      // 68: fconst_1
      // 69: fdiv
      // 6a: invokestatic gis.w9e (IFF)V
      // 6d: fconst_1
      // 6e: fconst_1
      // 6f: fconst_1
      // 70: fconst_1
      // 71: invokestatic hzu.wn0 (FFFF)V
      // 74: invokestatic hxt.ly3 ()Z
      // 77: iload 9
      // 79: ifne af
      // 7c: ifeq 89
      // 7f: goto 86
      // 82: invokestatic vm8.a (Loov;)Loov;
      // 85: athrow
      // 86: invokestatic net/optifine/shaders/Shaders.beginSpiderEyes ()V
      // 89: invokestatic hxt.hm6 ()Lcrp;
      // 8c: bipush 1
      // 8d: putfield crp.oun Z
      // 90: aload 0
      // 91: getfield vm8.c64 Lfjt;
      // 94: invokevirtual fjt.fy4 ()Lg6r;
      // 97: aload 1
      // 98: fload 2
      // 99: fload 3
      // 9a: fload 5
      // 9c: fload 6
      // 9e: fload 7
      // a0: fload 8
      // a2: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // a5: invokestatic hxt.hm6 ()Lcrp;
      // a8: bipush 0
      // a9: putfield crp.oun Z
      // ac: invokestatic hxt.ly3 ()Z
      // af: iload 9
      // b1: ifne dc
      // b4: ifeq c1
      // b7: goto be
      // ba: invokestatic vm8.a (Loov;)Loov;
      // bd: athrow
      // be: invokestatic net/optifine/shaders/Shaders.endSpiderEyes ()V
      // c1: aload 1
      // c2: fload 4
      // c4: invokevirtual u10.azk (F)I
      // c7: istore 10
      // c9: iload 10
      // cb: ldc 65536
      // cd: nop
      // ce: irem
      // cf: istore 11
      // d1: iload 10
      // d3: ldc 65536
      // d5: nop
      // d6: idiv
      // d7: istore 12
      // d9: getstatic gis.exn I
      // dc: iload 11
      // de: i2f
      // df: fconst_1
      // e0: fdiv
      // e1: iload 12
      // e3: i2f
      // e4: fconst_1
      // e5: fdiv
      // e6: invokestatic gis.w9e (IFF)V
      // e9: aload 0
      // ea: getfield vm8.c64 Lfjt;
      // ed: aload 1
      // ee: fload 4
      // f0: invokevirtual fjt.r22 (Lyqv;F)V
      // f3: invokestatic hzu.ux6 ()V
      // f6: invokestatic hzu.if9 ()V
      // f9: return
   }

   @Override
   public boolean shouldCombineTextures() {
      return false;
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.qi8((u10)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5778350480161337965L, 3754111578825719614L, MethodHandles.lookup().lookupClass()).a(32449209891084L);
      // $VF: monitorexit
      long var4 = var10000 ^ 47053202885361L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("7¡\u0095uAfÜØÌ\u0007\u000bïtz\u0013í¿Í\"ýüo\u0017\u0086Zÿ$Ðÿ\r»\f".getBytes("ISO-8859-1"));
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      _se = new gdz(var0);
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
