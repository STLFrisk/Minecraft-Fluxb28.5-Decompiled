import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jlc implements Comparable {
   private static final long a;
   private static final String b;

   public jlc(String var1, String var2, String var3, boolean var4) {
      this.kax = var1;
      this.ezr = var2;
      this.ole = var3;
      this.sqr = var4;
   }

   public String emt() {
      return this.kax;
   }

   public boolean qga() {
      return this.sqr;
   }

   @Override
   public String toString() {
      long var1 = a ^ 83759897512830L;
      return String.format(b, this.ole, this.ezr);
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1d
      // 09: aload 1
      // 0a: if_acmpne 1c
      // 0d: goto 14
      // 10: invokestatic jlc.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: goto 40
      // 18: invokestatic jlc.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: instanceof jlc
      // 20: iload 2
      // 21: ifne 2f
      // 24: ifne 32
      // 27: goto 2e
      // 2a: invokestatic jlc.a (Loov;)Loov;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: goto 40
      // 32: aload 0
      // 33: getfield jlc.kax Ljava/lang/String;
      // 36: aload 1
      // 37: checkcast jlc
      // 3a: getfield jlc.kax Ljava/lang/String;
      // 3d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 40: ireturn
   }

   @Override
   public int hashCode() {
      return this.kax.hashCode();
   }

   public int fro(jlc var1) {
      return this.kax.compareTo(var1.kax);
   }

   @Override
   public int compareTo(Object var1) {
      return this.fro((jlc)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4734414570838880049L, -2473333431775576588L, MethodHandles.lookup().lookupClass()).a(249077058509262L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 21435119322647L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ô\u007fC\u0012\u0007Î\u001d¿".getBytes("ISO-8859-1"));
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
