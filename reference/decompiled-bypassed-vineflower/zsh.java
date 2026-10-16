import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zsh extends d26 {
   public static final qx_ glx;
   public static final _ku he4;

   public zsh() {
      super(p3y.kti);
      this.y8l(this._8_.c32().zvi(glx, vt2.z9q).zvi(he4, 0));
      this.opa(0);
      this.i3l(uja.qqf);
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public zfz qk_(t9d var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, g_3 var8) {
      vt2 var9 = var8.u0f().drv();
      return super.qk_(var1, var2, var3, var4, var5, var6, var7, var8).zvi(glx, var9).zvi(he4, var7 >> 2);
   }

   @Override
   public boolean cl2(t9d param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 9
      // 05: aload 1
      // 06: getfield t9d.v0f Z
      // 09: iload 9
      // 0b: ifne 2e
      // 0e: ifne 2d
      // 11: goto 18
      // 14: invokestatic zsh.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 4
      // 1a: new zsh$ccy
      // 1d: dup
      // 1e: aload 1
      // 1f: aload 2
      // 20: invokespecial zsh$ccy.<init> (Lt9d;Lmew;)V
      // 23: invokevirtual ha9.xz_ (L_83;)V
      // 26: goto 2d
      // 29: invokestatic zsh.b (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 1
      // 2e: ireturn
   }

   @Override
   public int crg(zfz var1) {
      return (Integer)var1.dil(he4);
   }

   @Override
   public void c7i(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0b: getstatic zsh.glx Lqx_;
      // 0e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13: checkcast vt2
      // 16: astore 4
      // 18: iload 3
      // 19: ifeq 43
      // 1c: aload 4
      // 1e: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 21: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 24: if_acmpne 47
      // 27: goto 2e
      // 2a: invokestatic zsh.b (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: fconst_0
      // 30: fconst_0
      // 31: ldc 0.125
      // 33: nop
      // 34: fconst_1
      // 35: fconst_1
      // 36: ldc 0.875
      // 38: nop
      // 39: invokevirtual zsh.xl4 (FFFFFF)V
      // 3c: goto 43
      // 3f: invokestatic zsh.b (Loov;)Loov;
      // 42: athrow
      // 43: iload 3
      // 44: ifne 5c
      // 47: aload 0
      // 48: ldc 0.125
      // 4a: nop
      // 4b: fconst_0
      // 4c: fconst_0
      // 4d: ldc 0.875
      // 4f: nop
      // 50: fconst_1
      // 51: fconst_1
      // 52: invokevirtual zsh.xl4 (FFFFFF)V
      // 55: goto 5c
      // 58: invokestatic zsh.b (Loov;)Loov;
      // 5b: athrow
      // 5c: return
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      var3.add(new erg(var1, 1, 0));
      var3.add(new erg(var1, 1, 1));
      var3.add(new erg(var1, 1, 2));
   }

   @Override
   public void cl9(vjf var1) {
      var1.iva(true);
   }

   @Override
   public void s5p(t9d var1, mew var2) {
      var1.qca(1022, var2, 0);
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      return true;
   }

   @Override
   public zfz v1x(zfz var1) {
      return this.l4i().zvi(glx, vt2.mxp);
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(glx, vt2.bm6(var1 & 3)).zvi(he4, (var1 & 15) >> 2);
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = 0;
      var2 |= ((vt2)var1.dil(glx)).tmy();
      return var2 | (Integer)var1.dil(he4) << 2;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{glx, he4});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4074625386876893650L, 6034238250668560161L, MethodHandles.lookup().lookupClass()).a(89269587146305L);
      // $VF: monitorexit
      long var10 = var10000 ^ 21021517575652L;
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
      String var5 = "s¹n\u009bù¼\u008bÏ\bû¥àÎt¿&F";
      int var7 = "s¹n\u009bù¼\u008bÏ\bû¥àÎt¿&F".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            glx = qx_.q0o(var8[1], vt2$unz.fzl);
            he4 = _ku.wgl(var8[0], 0, 2);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov b(oov var0) {
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
