import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class nrk$n3g extends nrk$ayj {
   private final int r1s;
   private final int fhy;
   public final nrk pxy;
   private static final long b;
   private static final String f;

   public nrk$n3g(nrk var1, int var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, zg9.w8u, 0 + mcs.ip9[var5].lgw() % 8 * 18, 198 + mcs.ip9[var5].lgw() / 8 * 18);
      this.pxy = var1;
      this.r1s = var5;
      this.fhy = var6;
   }

   @Override
   public void ssq(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nrk$n3g.b J
      // 03: ldc2_w 24676769116672
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: getstatic mcs.ip9 [Lmcs;
      // 10: aload 0
      // 11: getfield nrk$n3g.r1s I
      // 14: aaload
      // 15: invokevirtual mcs.zs1 ()Ljava/lang/String;
      // 18: bipush 0
      // 19: anewarray 51
      // 1c: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1f: astore 6
      // 21: aload 0
      // 22: iload 5
      // 24: ifeq 6e
      // 27: getfield nrk$n3g.fhy I
      // 2a: bipush 3
      // 2b: if_icmplt 6d
      // 2e: goto 35
      // 31: invokestatic nrk$n3g.d (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: iload 5
      // 38: ifeq 6e
      // 3b: goto 42
      // 3e: invokestatic nrk$n3g.d (Loov;)Loov;
      // 41: athrow
      // 42: getfield nrk$n3g.r1s I
      // 45: getstatic mcs.kkg Lmcs;
      // 48: getfield mcs.zr9 I
      // 4b: if_icmpeq 6d
      // 4e: goto 55
      // 51: invokestatic nrk$n3g.d (Loov;)Loov;
      // 54: athrow
      // 55: new java/lang/StringBuilder
      // 58: dup
      // 59: invokespecial java/lang/StringBuilder.<init> ()V
      // 5c: aload 6
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: getstatic nrk$n3g.f Ljava/lang/String;
      // 64: nop
      // 65: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 68: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6b: astore 6
      // 6d: aload 0
      // 6e: getfield nrk$n3g.pxy Lnrk;
      // 71: aload 6
      // 73: iload 1
      // 74: iload 2
      // 75: invokestatic nrk.azs (Lnrk;Ljava/lang/String;II)V
      // 78: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5910805790037025399L, 6656787066893370010L, MethodHandles.lookup().lookupClass()).a(63525612444513L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 69716714838974L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÎÎW³r\u008fVÞ".getBytes("ISO-8859-1"));
      String var6 = c(var4).intern();
      byte var10001 = -1;
      f = var6;
   }

   private static oov d(oov var0) {
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
