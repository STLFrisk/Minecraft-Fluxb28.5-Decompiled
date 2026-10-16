import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class gdz {
   public final String jh0;
   public final String m7a;
   private static final long a;
   private static final String c;

   public gdz(int var1, String[] var2) {
      long var3 = a ^ 3797831303364L;
      super();
      this.jh0 = StringUtils.isEmpty(var2[0]) ? c : var2[0].toLowerCase();
      this.m7a = var2[1];
      Validate.notNull(this.m7a);
   }

   public gdz(String var1) {
      this(0, n17(var1));
   }

   public gdz(String var1, String var2) {
      this(0, new String[]{var1, var2});
   }

   public static String[] n17(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 2
      // 01: anewarray 27
      // 04: dup
      // 05: bipush 0
      // 06: aconst_null
      // 07: aastore
      // 08: dup
      // 09: bipush 1
      // 0a: aload 0
      // 0b: aastore
      // 0c: astore 1
      // 0d: aload 0
      // 0e: bipush 58
      // 10: invokevirtual java/lang/String.indexOf (I)I
      // 13: istore 2
      // 14: iload 2
      // 15: iflt 42
      // 18: aload 1
      // 19: bipush 1
      // 1a: aload 0
      // 1b: iload 2
      // 1c: bipush 1
      // 1d: iadd
      // 1e: aload 0
      // 1f: invokevirtual java/lang/String.length ()I
      // 22: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 25: aastore
      // 26: iload 2
      // 27: bipush 1
      // 28: if_icmple 42
      // 2b: goto 32
      // 2e: invokestatic gdz.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: bipush 0
      // 34: aload 0
      // 35: bipush 0
      // 36: iload 2
      // 37: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 3a: aastore
      // 3b: goto 42
      // 3e: invokestatic gdz.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 1
      // 43: areturn
   }

   public String xyp() {
      return this.m7a;
   }

   public String _a7() {
      return this.jh0;
   }

   @Override
   public String toString() {
      return this.jh0 + ':' + this.m7a;
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
      // 05: iload 2
      // 06: ifeq 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic gdz.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic gdz.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifeq 33
      // 1f: instanceof gdz
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic gdz.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic gdz.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast gdz
      // 36: astore 3
      // 37: aload 0
      // 38: getfield gdz.jh0 Ljava/lang/String;
      // 3b: aload 3
      // 3c: getfield gdz.jh0 Ljava/lang/String;
      // 3f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 42: iload 2
      // 43: ifeq 62
      // 46: ifeq 74
      // 49: goto 50
      // 4c: invokestatic gdz.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield gdz.m7a Ljava/lang/String;
      // 54: aload 3
      // 55: getfield gdz.m7a Ljava/lang/String;
      // 58: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5b: goto 62
      // 5e: invokestatic gdz.a (Loov;)Loov;
      // 61: athrow
      // 62: iload 2
      // 63: ifeq 71
      // 66: ifeq 74
      // 69: goto 70
      // 6c: invokestatic gdz.a (Loov;)Loov;
      // 6f: athrow
      // 70: bipush 1
      // 71: goto 75
      // 74: bipush 0
      // 75: ireturn
   }

   @Override
   public int hashCode() {
      return 31 * this.jh0.hashCode() + this.m7a.hashCode();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6734981062866330591L, -7390400600964936416L, MethodHandles.lookup().lookupClass()).a(36599427252113L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 17155310958098L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("+«On\u0090ñ\u0081\u008e¥7òòz_Ô\u009d".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      c = var6;
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
