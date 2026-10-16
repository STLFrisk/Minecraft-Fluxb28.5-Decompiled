import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pod implements rsi {
   private static final long a;
   private static final String b;

   @Override
   public int opt() {
      return 1;
   }

   @Override
   public erg ibn(int var1) {
      return this.t5o[0];
   }

   @Override
   public String noc() {
      long var1 = a ^ 63783511962196L;
      return b;
   }

   @Override
   public boolean qrh() {
      return false;
   }

   @Override
   public ekw xyw() {
      try {
         if (this.qrh()) {
            return new tao(this.noc());
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return new hsu(this.noc(), new Object[0]);
   }

   @Override
   public erg afc(int param1, int param2) {
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
      // 05: getfield pod.t5o [Lerg;
      // 08: bipush 0
      // 09: aaload
      // 0a: iload 3
      // 0b: ifeq 25
      // 0e: ifnull 31
      // 11: goto 18
      // 14: invokestatic pod.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield pod.t5o [Lerg;
      // 1c: bipush 0
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic pod.a (Loov;)Loov;
      // 24: athrow
      // 25: astore 4
      // 27: aload 0
      // 28: getfield pod.t5o [Lerg;
      // 2b: bipush 0
      // 2c: aconst_null
      // 2d: aastore
      // 2e: aload 4
      // 30: areturn
      // 31: aconst_null
      // 32: areturn
   }

   @Override
   public erg yvk(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield pod.t5o [Lerg;
      // 08: bipush 0
      // 09: aaload
      // 0a: iload 2
      // 0b: ifne 25
      // 0e: ifnull 2f
      // 11: goto 18
      // 14: invokestatic pod.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield pod.t5o [Lerg;
      // 1c: bipush 0
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic pod.a (Loov;)Loov;
      // 24: athrow
      // 25: astore 3
      // 26: aload 0
      // 27: getfield pod.t5o [Lerg;
      // 2a: bipush 0
      // 2b: aconst_null
      // 2c: aastore
      // 2d: aload 3
      // 2e: areturn
      // 2f: aconst_null
      // 30: areturn
   }

   @Override
   public void cxl(int var1, erg var2) {
      this.t5o[0] = var2;
   }

   @Override
   public int v6l() {
      return 64;
   }

   @Override
   public void r5t() {
   }

   @Override
   public boolean dnv(ha9 var1) {
      return true;
   }

   @Override
   public void dk0(ha9 var1) {
   }

   @Override
   public void vhz(ha9 var1) {
   }

   @Override
   public boolean er2(int var1, erg var2) {
      return true;
   }

   @Override
   public int czu(int var1) {
      return 0;
   }

   @Override
   public void r8i(int var1, int var2) {
   }

   @Override
   public int xa3() {
      return 0;
   }

   @Override
   public void nec() {
      int var1 = OpaquePredicate.c();
      int var2 = 0;

      while (var2 < this.t5o.length) {
         this.t5o[var2] = null;
         var2++;
         if (var1 != 0) {
            break;
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6790706687341881339L, 4157219688830027903L, MethodHandles.lookup().lookupClass()).a(164075133926041L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 89608343525729L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("b\u0085\u0088Î©\u0090ÎX".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
