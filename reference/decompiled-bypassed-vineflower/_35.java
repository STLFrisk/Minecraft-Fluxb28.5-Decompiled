import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _35 extends so9 {
   public _35(hr_ var1) {
      super(var1, new rno(0.0F), 1.0F);
      this.d4f(new cu5(this));
   }

   public void gdz(ju8 var1, double var2, double var4, double var6, float var8, float var9) {
      pq9.ojo(var1, true);
      super.w_x(var1, var2, var4, var6, var8, var9);
   }

   public gdz vz_(ju8 param1) {
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
      // 05: invokevirtual ju8.vhe ()I
      // 08: istore 3
      // 09: iload 3
      // 0a: iload 2
      // 0b: ifne 19
      // 0e: ifle 43
      // 11: goto 18
      // 14: invokestatic _35.a (Loov;)Loov;
      // 17: athrow
      // 18: iload 3
      // 19: bipush 80
      // 1b: iload 2
      // 1c: ifne 36
      // 1f: if_icmpgt 39
      // 22: goto 29
      // 25: invokestatic _35.a (Loov;)Loov;
      // 28: athrow
      // 29: iload 3
      // 2a: bipush 5
      // 2b: idiv
      // 2c: bipush 2
      // 2d: irem
      // 2e: bipush 1
      // 2f: goto 36
      // 32: invokestatic _35.a (Loov;)Loov;
      // 35: athrow
      // 36: if_icmpeq 43
      // 39: getstatic _35.csz Lgdz;
      // 3c: goto 46
      // 3f: invokestatic _35.a (Loov;)Loov;
      // 42: athrow
      // 43: getstatic _35.ls0 Lgdz;
      // 46: areturn
   }

   public void t8z(ju8 var1, float var2) {
      int var3 = t9d.c();
      float var4 = 2.0F;
      int var5 = var1.vhe();

      label20: {
         try {
            if (var3 != 0) {
               return;
            }

            if (var5 <= 0) {
               break label20;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var4 -= ((float)var5 - var2) / 220.0F * 0.5F;
      }

      hzu.syc(var4, var4, var4);
   }

   @Override
   public void w_x(yqv var1, double var2, double var4, double var6, float var8, float var9) {
      this.gdz((ju8)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public void e2w(g_3 var1, float var2) {
      this.t8z((ju8)var1, var2);
   }

   @Override
   public void l1o(g_3 var1, double var2, double var4, double var6, float var8, float var9) {
      this.gdz((ju8)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.vz_((ju8)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.gdz((ju8)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1723577057865921290L, -620217865055267779L, MethodHandles.lookup().lookupClass()).a(196415347790643L);
      // $VF: monitorexit
      long var10 = var10000 ^ 18036184246095L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "\u009d}0ÒyÐ\fò\u0007ñ\u0006\u0094v\u0002\u0006K{é\b\u0086\u0086À\u0087\u008es]\u0019\u0019M(õ\u0080ºäè¶çQ[\u00180\u009d}0ÒyÐ\fò\u0007ñ\u0006\u0094v\u0002\u0006K{é\b\u0086\u0086À\u0087\u008eèùÜ\u00adSÅB\u007feò\u000ei¨\f\fº¹IÝ\u0006Ü´<l";
      int var7 = "\u009d}0ÒyÐ\fò\u0007ñ\u0006\u0094v\u0002\u0006K{é\b\u0086\u0086À\u0087\u008es]\u0019\u0019M(õ\u0080ºäè¶çQ[\u00180\u009d}0ÒyÐ\fò\u0007ñ\u0006\u0094v\u0002\u0006K{é\b\u0086\u0086À\u0087\u008eèùÜ\u00adSÅB\u007feò\u000ei¨\f\fº¹IÝ\u0006Ü´<l"
         .length();
      char var4 = '(';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = c(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            csz = new gdz(var8[1]);
            ls0 = new gdz(var8[0]);
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
