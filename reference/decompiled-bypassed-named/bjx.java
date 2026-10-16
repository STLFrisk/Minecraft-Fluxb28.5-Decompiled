import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bjx extends e0x {
   public static final qx_ d0q;
   public static final h76 i1i;

   public bjx() {
      super(p3y.zs8, _mi.oxf);
      this.y8l(this._8_.c32().zvi(d0q, vt2.z9q).zvi(i1i, false));
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public void bf6() {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
   }

   @Override
   public void c76(OpaquePredicate param1, mew param2, zfz param3, nh4 param4, List param5, EntityLivingBase param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 7
      // 05: aload 0
      // 06: fconst_0
      // 07: fconst_0
      // 08: fconst_0
      // 09: fconst_1
      // 0a: ldc 0.8125
      // 0c: nop
      // 0d: fconst_1
      // 0e: invokevirtual bjx.xl4 (FFFFFF)V
      // 11: aload 0
      // 12: aload 1
      // 13: aload 2
      // 14: aload 3
      // 15: aload 4
      // 17: aload 5
      // 19: aload 6
      // 1b: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 1e: iload 7
      // 20: ifeq 6c
      // 23: aload 1
      // 24: aload 2
      // 25: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 28: getstatic bjx.i1i Lh76;
      // 2b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 30: checkcast java/lang/Boolean
      // 33: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 36: ifeq 68
      // 39: goto 40
      // 3c: invokestatic bjx.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: ldc 0.3125
      // 43: nop
      // 44: ldc 0.8125
      // 46: nop
      // 47: ldc 0.3125
      // 49: nop
      // 4a: ldc 0.6875
      // 4c: nop
      // 4d: fconst_1
      // 4e: ldc 0.6875
      // 50: nop
      // 51: invokevirtual bjx.xl4 (FFFFFF)V
      // 54: aload 0
      // 55: aload 1
      // 56: aload 2
      // 57: aload 3
      // 58: aload 4
      // 5a: aload 5
      // 5c: aload 6
      // 5e: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 61: goto 68
      // 64: invokestatic bjx.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: invokevirtual bjx.bf6 ()V
      // 6c: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return null;
   }

   @Override
   public zfz qk_(OpaquePredicate var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, Entity var8) {
      return this.l4i().zvi(d0q, var8.u0f().b4b()).zvi(i1i, false);
   }

   @Override
   public boolean ge5() {
      return true;
   }

   @Override
   public int mya(OpaquePredicate var1, mew var2) {
      int var3 = OpaquePredicate.c();

      try {
         byte var10000 = (Boolean)var1.getBlockState(var2).dil(i1i);
         if (var3 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 15;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return 0;
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.c();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i();
         var10001 = i1i;
         int var10002 = var1 & 4;
         if (var2 != 0) {
            return var10000.zvi(i1i, Boolean.valueOf((boolean)var10002)).zvi(d0q, vt2.bm6(var1 & 3));
         }

         if (var10002 != 0) {
            return var10000.zvi(i1i, true).zvi(d0q, vt2.bm6(var1 & 3));
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false).zvi(d0q, vt2.bm6(var1 & 3));
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = OpaquePredicate.c();
      var3 |= ((vt2)var1.dil(d0q)).tmy();
      int var2 = var10000;

      try {
         byte var6 = (Boolean)var1.dil(i1i);
         if (var2 != 0) {
            return var6;
         }

         if (var6 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 |= 4;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{d0q, i1i});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2035933309601231792L, -201362156414795187L, MethodHandles.lookup().lookupClass()).a(198037344003888L);
      // $VF: monitorexit
      long var10 = var10000 ^ 92264822462659L;
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
      String var5 = "\u0011ß\u0084Ê\u0001àà?\b;6w\u0016ð\bßW";
      int var7 = "\u0011ß\u0084Ê\u0001àà?\b;6w\u0016ð\bßW".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            d0q = qx_.q0o(var8[0], vt2$unz.fzl);
            i1i = h76.d_1(var8[1]);
            return;
         }

         var4 = var5.charAt(var3);
      }
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
