import com.google.common.base.Function;
import java.lang.invoke.MethodHandles;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class j0s$1 implements Function {
   private static final long a;
   private static final String b;

   public String p_w(Entry param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic j0s$1.a J
      // 03: ldc2_w 13904049042889
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifne 2c
      // 13: ifnonnull 26
      // 16: goto 1d
      // 19: invokestatic j0s$1.a (Loov;)Loov;
      // 1c: athrow
      // 1d: getstatic j0s$1.b Ljava/lang/String;
      // 20: nop
      // 21: areturn
      // 22: invokestatic j0s$1.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 1
      // 27: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2c: checkcast xny
      // 2f: astore 5
      // 31: new java/lang/StringBuilder
      // 34: dup
      // 35: invokespecial java/lang/StringBuilder.<init> ()V
      // 38: aload 5
      // 3a: invokeinterface xny.w6i ()Ljava/lang/String; 1
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: ldc "="
      // 44: nop
      // 45: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48: aload 5
      // 4a: aload 1
      // 4b: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 50: checkcast java/lang/Comparable
      // 53: invokeinterface xny._lf (Ljava/lang/Comparable;)Ljava/lang/String; 2
      // 58: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5e: areturn
   }

   public Object apply(Object var1) {
      return this.p_w((Entry)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5626532122674991249L, 3107986925310154959L, MethodHandles.lookup().lookupClass()).a(242278535146491L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 69327312517990L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("RuJE³#\u0084\u008c".getBytes("ISO-8859-1"));
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
