import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jgy extends ob6 {
   public static final zb_ kcr;

   public jgy() {
      super(p3y.mg6, false);
      this.y8l(this._8_.c32().zvi(hwn, false).zvi(rb5, false).zvi(j0m, false).zvi(hoe, false).zvi(kcr, qvg.ft3));
      this.i3l(uja.qqf);
   }

   @Override
   public int crg(zfz var1) {
      return ((qvg)var1.dil(kcr)).hoo();
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      int var4 = OpaquePredicate.b();
      int var5 = 0;

      while (var5 < qvg.values().length) {
         var3.add(new erg(var1, 1, var5));
         var5++;
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public _mi uoz(zfz var1) {
      return ((qvg)var1.dil(kcr)).f0q();
   }

   @Override
   public w51 w3x() {
      return w51.mem;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(kcr, qvg.hup(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((qvg)var1.dil(kcr)).hoo();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{hwn, rb5, hoe, j0m, kcr});
   }

   @Override
   public void tfc(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifeq 20
      // 0b: getfield OpaquePredicate.v0f Z
      // 0e: ifne 24
      // 11: goto 18
      // 14: invokestatic jgy.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: goto 20
      // 1c: invokestatic jgy.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: invokestatic yk4.taa (Lt9d;Lmew;)V
      // 24: return
   }

   @Override
   public void b8f(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 20
      // 0b: getfield OpaquePredicate.v0f Z
      // 0e: ifne 24
      // 11: goto 18
      // 14: invokestatic jgy.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: goto 20
      // 1c: invokestatic jgy.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: invokestatic yk4.taa (Lt9d;Lmew;)V
      // 24: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7116573502415049013L, -7515048608453506009L, MethodHandles.lookup().lookupClass()).a(112833999909885L);
      // $VF: monitorexit
      long var4 = var10000 ^ 59336473361783L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("ÂMÔ\u009d©\u000e\u008dÔ".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      kcr = zb_.pq4(var0, qvg.class);
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
