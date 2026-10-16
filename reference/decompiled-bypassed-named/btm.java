import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class btm extends e0x {
   public static final zb_ juo;

   public btm() {
      super(p3y.n7o);
      this.y8l(this._8_.c32().zvi(juo, qvg.ft3));
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
      this._p_(true);
      this.i3l(uja.qqf);
      this.ogp(0);
   }

   @Override
   public _mi uoz(zfz var1) {
      return ((qvg)var1.dil(juo)).f0q();
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public void bf6() {
      this.ogp(0);
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.ogp(0);
   }

   public void ogp(int var1) {
      byte var2 = 0;
      float var3 = (float)(1 * (1 + var2)) / 16.0F;
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, var3, 1.0F);
   }

   @Override
   public boolean ctq(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial e0x.ctq (Lt9d;Lmew;)Z
      // 0a: iload 3
      // 0b: ifeq 25
      // 0e: ifeq 37
      // 11: goto 18
      // 14: invokestatic btm.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokespecial btm.nie (Lt9d;Lmew;)Z
      // 1e: goto 25
      // 21: invokestatic btm.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 3
      // 26: ifeq 34
      // 29: ifeq 37
      // 2c: goto 33
      // 2f: invokestatic btm.a (Loov;)Loov;
      // 32: athrow
      // 33: bipush 1
      // 34: goto 38
      // 37: bipush 0
      // 38: ireturn
   }

   @Override
   public void z3l(OpaquePredicate var1, mew var2, zfz var3, e0x var4) {
      this.d8r(var1, var2, var3);
   }

   private boolean d8r(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokespecial btm.nie (Lt9d;Lmew;)Z
      // 0b: iload 4
      // 0d: ifne 2f
      // 10: ifne 2e
      // 13: goto 1a
      // 16: invokestatic btm.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 1
      // 1c: aload 2
      // 1d: aload 3
      // 1e: bipush 0
      // 1f: invokevirtual btm.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 22: aload 1
      // 23: aload 2
      // 24: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 27: pop
      // 28: bipush 0
      // 29: ireturn
      // 2a: invokestatic btm.a (Loov;)Loov;
      // 2d: athrow
      // 2e: bipush 1
      // 2f: ireturn
   }

   private boolean nie(OpaquePredicate var1, mew var2) {
      int var3 = OpaquePredicate.c();

      try {
         boolean var10000 = var1.isAirBlock(var2.eve());
         if (var3 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return false;
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      try {
         if (var3 == vt2.rf3) {
            return true;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return super.ron(var1, var2, var3);
   }

   @Override
   public int crg(zfz var1) {
      return ((qvg)var1.dil(juo)).hoo();
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      int var4 = OpaquePredicate.c();
      int var5 = 0;

      while (var5 < 16) {
         var3.add(new erg(var1, 1, var5));
         var5++;
         if (var4 != 0) {
            break;
         }
      }
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(juo, qvg.hup(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((qvg)var1.dil(juo)).hoo();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{juo});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5286419635152562576L, -6834932429157650677L, MethodHandles.lookup().lookupClass()).a(269151006902104L);
      // $VF: monitorexit
      long var4 = var10000 ^ 32523635190682L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u000f\rõÄHÚâ\u000f".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      juo = zb_.pq4(var0, qvg.class);
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
