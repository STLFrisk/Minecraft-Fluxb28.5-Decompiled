import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bx0 extends e0x {
   public static final zb_ nln;
   public static final h76 g1_;

   public bx0() {
      super(p3y.v19);
      this.y8l(this._8_.c32().zvi(nln, bx0$b_z.rg3).zvi(g1_, false));
      this.i3l(uja.mqu);
   }

   @Override
   public _mi uoz(zfz var1) {
      return ((bx0$b_z)var1.dil(nln)).vf1();
   }

   @Override
   public zfz w1b(zfz param1, m5n param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 6b
      // 0b: getstatic bx0.nln Lzb_;
      // 0e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13: getstatic bx0$b_z.sos Lbx0$b_z;
      // 16: if_acmpne 6a
      // 19: goto 20
      // 1c: invokestatic bx0.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: aload 3
      // 22: invokevirtual mew.nuv ()Lmew;
      // 25: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 2a: invokeinterface zfz.r_y ()Le0x; 1
      // 2f: astore 5
      // 31: aload 1
      // 32: getstatic bx0.g1_ Lh76;
      // 35: aload 5
      // 37: getstatic ox_._mc Le0x;
      // 3a: iload 4
      // 3c: ifne 55
      // 3f: if_acmpeq 58
      // 42: goto 49
      // 45: invokestatic bx0.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 5
      // 4b: getstatic ox_.dxo Le0x;
      // 4e: goto 55
      // 51: invokestatic bx0.a (Loov;)Loov;
      // 54: athrow
      // 55: if_acmpne 60
      // 58: bipush 1
      // 59: goto 61
      // 5c: invokestatic bx0.a (Loov;)Loov;
      // 5f: athrow
      // 60: bipush 0
      // 61: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 64: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 69: astore 1
      // 6a: aload 1
      // 6b: areturn
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      var3.add(new erg(this, 1, bx0$b_z.rg3.d74()));
      var3.add(new erg(this, 1, bx0$b_z.ryg.d74()));
      var3.add(new erg(this, 1, bx0$b_z.sos.d74()));
   }

   @Override
   public int qu2(t9d param1, mew param2) {
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
      // 06: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 09: astore 4
      // 0b: aload 4
      // 0d: iload 3
      // 0e: ifeq 2b
      // 11: invokeinterface zfz.r_y ()Le0x; 1
      // 16: aload 0
      // 17: if_acmpeq 29
      // 1a: goto 21
      // 1d: invokestatic bx0.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 0
      // 22: goto 39
      // 25: invokestatic bx0.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 4
      // 2b: getstatic bx0.nln Lzb_;
      // 2e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 33: checkcast bx0$b_z
      // 36: invokevirtual bx0$b_z.d74 ()I
      // 39: ireturn
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(nln, bx0$b_z.brn(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((bx0$b_z)var1.dil(nln)).d74();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{nln, g1_});
   }

   @Override
   public int crg(zfz var1) {
      int var2 = t9d.b();
      bx0$b_z var3 = (bx0$b_z)var1.dil(nln);

      try {
         if (var2 == 0) {
            return var3.d74();
         }

         if (var3 != bx0$b_z.sos) {
            return var3.d74();
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 = bx0$b_z.rg3;
      return var3.d74();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-703032574056136044L, -7799083414255748435L, MethodHandles.lookup().lookupClass()).a(208614309810563L);
      // $VF: monitorexit
      long var10 = var10000 ^ 95997170706491L;
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
      String var5 = "«²\u009eR\u0000\u008c\u0013-\b½\u0087F\u009bÀ\u0004I\u0017";
      int var7 = "«²\u009eR\u0000\u008c\u0013-\b½\u0087F\u009bÀ\u0004I\u0017".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            nln = zb_.pq4(var8[0], bx0$b_z.class);
            g1_ = h76.d_1(var8[1]);
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
