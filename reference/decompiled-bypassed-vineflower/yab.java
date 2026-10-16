import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class yab extends u7m {
   private static final long a;
   private static final String b;

   public yab() {
      this.rlr(64);
      this.cb3(1);
      this.qfy(uja.zip);
   }

   @Override
   public boolean t0m() {
      return true;
   }

   @Override
   public boolean dya() {
      return true;
   }

   @Override
   public erg r__(erg param1, t9d param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yab.a J
      // 03: ldc2_w 72377479407154
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.b ()I
      // 0c: istore 6
      // 0e: aload 3
      // 0f: getfield ha9.r44 Lsj_;
      // 12: iload 6
      // 14: ifeq 2c
      // 17: ifnull 41
      // 1a: goto 21
      // 1d: invokestatic yab.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 3
      // 22: getfield ha9.r44 Lsj_;
      // 25: goto 2c
      // 28: invokestatic yab.a (Loov;)Loov;
      // 2b: athrow
      // 2c: invokevirtual sj_.vpv ()I
      // 2f: istore 7
      // 31: aload 1
      // 32: iload 7
      // 34: aload 3
      // 35: invokevirtual erg.ybw (ILg_3;)V
      // 38: aload 3
      // 39: invokevirtual ha9.hgb ()V
      // 3c: iload 6
      // 3e: ifne 9e
      // 41: aload 2
      // 42: aload 3
      // 43: getstatic yab.b Ljava/lang/String;
      // 46: nop
      // 47: ldc 0.5
      // 49: nop
      // 4a: ldc 0.4
      // 4c: nop
      // 4d: getstatic yab.pq6 Ljava/util/Random;
      // 50: invokevirtual java/util/Random.nextFloat ()F
      // 53: ldc 0.4
      // 55: nop
      // 56: fmul
      // 57: ldc 0.8
      // 59: nop
      // 5a: fadd
      // 5b: fdiv
      // 5c: invokevirtual t9d.yfq (Li2h;Ljava/lang/String;FF)V
      // 5f: iload 6
      // 61: ifeq 92
      // 64: goto 6b
      // 67: invokestatic yab.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 2
      // 6c: getfield t9d.v0f Z
      // 6f: ifne 8e
      // 72: goto 79
      // 75: invokestatic yab.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 2
      // 7a: new sj_
      // 7d: dup
      // 7e: aload 2
      // 7f: aload 3
      // 80: invokespecial sj_.<init> (Lt9d;Lha9;)V
      // 83: invokevirtual t9d.xzq (Li2h;)Z
      // 86: pop
      // 87: goto 8e
      // 8a: invokestatic yab.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 3
      // 8f: invokevirtual ha9.hgb ()V
      // 92: aload 3
      // 93: getstatic l9p.foo [L_ss;
      // 96: aload 0
      // 97: invokestatic u7m._lo (Lu7m;)I
      // 9a: aaload
      // 9b: invokevirtual ha9.aex (L_ss;)V
      // 9e: aload 1
      // 9f: areturn
   }

   @Override
   public boolean azp(erg var1) {
      return super.azp(var1);
   }

   @Override
   public int k7x() {
      return 1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5779841144315644737L, -3436010684790273307L, MethodHandles.lookup().lookupClass()).a(178015449071265L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100282689579783L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("M)àÕ\f5r0\u001fþ\u0002\u008b\u001c\u0004ûu".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      b = var6;
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
