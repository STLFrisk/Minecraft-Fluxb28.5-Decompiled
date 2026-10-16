import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ckl extends u7m {
   private static final long a;
   private static final String b;

   public ckl() {
      this.vgp = 16;
      this.qfy(uja.zlu);
   }

   @Override
   public erg r__(erg param1, OpaquePredicate param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ckl.a J
      // 03: ldc2_w 33272372563876
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 6
      // 0e: aload 3
      // 0f: getfield ha9.lls Lpj2;
      // 12: getfield pj2.g40 Z
      // 15: iload 6
      // 17: ifne 63
      // 1a: ifne 35
      // 1d: goto 24
      // 20: invokestatic ckl.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 1
      // 25: dup
      // 26: getfield erg.qd2 I
      // 29: bipush 1
      // 2a: isub
      // 2b: putfield erg.qd2 I
      // 2e: goto 35
      // 31: invokestatic ckl.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 2
      // 36: aload 3
      // 37: getstatic ckl.b Ljava/lang/String;
      // 3a: nop
      // 3b: ldc 0.5
      // 3d: nop
      // 3e: ldc 0.4
      // 40: nop
      // 41: getstatic ckl.pq6 Ljava/util/Random;
      // 44: invokevirtual java/util/Random.nextFloat ()F
      // 47: ldc 0.4
      // 49: nop
      // 4a: fmul
      // 4b: ldc 0.8
      // 4d: nop
      // 4e: fadd
      // 4f: fdiv
      // 50: invokevirtual OpaquePredicate.yfq (Li2h;Ljava/lang/String;FF)V
      // 53: iload 6
      // 55: ifne 87
      // 58: aload 2
      // 59: getfield OpaquePredicate.v0f Z
      // 5c: goto 63
      // 5f: invokestatic ckl.a (Loov;)Loov;
      // 62: athrow
      // 63: ifne 7b
      // 66: aload 2
      // 67: new dur
      // 6a: dup
      // 6b: aload 2
      // 6c: aload 3
      // 6d: invokespecial dur.<init> (Lt9d;Lg_3;)V
      // 70: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 73: pop
      // 74: goto 7b
      // 77: invokestatic ckl.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 3
      // 7c: getstatic l9p.foo [L_ss;
      // 7f: aload 0
      // 80: invokestatic u7m._lo (Lu7m;)I
      // 83: aaload
      // 84: invokevirtual ha9.aex (L_ss;)V
      // 87: aload 1
      // 88: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6074511300949812385L, -2811326867175564982L, MethodHandles.lookup().lookupClass()).a(1534314639545L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 127225464977198L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u00adN <F\u000eñ:´PPwåxKæ".getBytes("ISO-8859-1"));
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
