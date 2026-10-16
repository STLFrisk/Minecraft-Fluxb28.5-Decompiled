import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cny extends gdw {
   private static final long a;
   private static final String b;

   public cny() {
   }

   public cny(byte[] var1) {
      this.r5a = var1;
   }

   @Override
   public void b_8(DataOutput var1) {
      var1.writeInt(this.r5a.length);
      var1.write(this.r5a);
   }

   @Override
   public void zwk(DataInput var1, int var2, btc var3) {
      var3.es9(192L);
      int var4 = var1.readInt();
      var3.es9((long)(8 * var4));
      this.r5a = new byte[var4];
      var1.readFully(this.r5a);
   }

   @Override
   public byte ky0() {
      return 7;
   }

   @Override
   public String toString() {
      long var1 = a ^ 54785743406830L;
      return "[" + this.r5a.length + b;
   }

   @Override
   public gdw h33() {
      byte[] var1 = new byte[this.r5a.length];
      System.arraycopy(this.r5a, 0, var1, 0, this.r5a.length);
      return new cny(var1);
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial gdw.equals (Ljava/lang/Object;)Z
      // 09: iload 2
      // 0a: ifeq 2c
      // 0d: ifeq 2f
      // 10: goto 17
      // 13: invokestatic cny.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield cny.r5a [B
      // 1b: aload 1
      // 1c: checkcast cny
      // 1f: getfield cny.r5a [B
      // 22: invokestatic java/util/Arrays.equals ([B[B)Z
      // 25: goto 2c
      // 28: invokestatic cny.a (Loov;)Loov;
      // 2b: athrow
      // 2c: goto 30
      // 2f: bipush 0
      // 30: ireturn
   }

   @Override
   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.r5a);
   }

   public byte[] uov() {
      return this.r5a;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1366031217344774458L, -792567667730663282L, MethodHandles.lookup().lookupClass()).a(17463166491401L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 114499790258102L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u001c¢k>¬³£\"".getBytes("ISO-8859-1"));
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
