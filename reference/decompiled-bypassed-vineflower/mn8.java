import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class mn8 implements w9p {
   private static final long a;
   private static final String c;

   public mn8(w9p var1, String var2, double var3) {
      long var5 = a ^ 138880364949098L;
      super();
      this.elr = var1;
      this.gco = var2;
      this.ekn = var3;
      if (var2 == null) {
         throw new IllegalArgumentException(c);
      }
   }

   @Override
   public String ugh() {
      return this.gco;
   }

   @Override
   public double o3r() {
      return this.ekn;
   }

   @Override
   public boolean db8() {
      return this.efs;
   }

   public mn8 g6f(boolean var1) {
      this.efs = var1;
      return this;
   }

   @Override
   public w9p z1n() {
      return this.elr;
   }

   @Override
   public int hashCode() {
      return this.gco.hashCode();
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
      // 04: aload 1
      // 05: instanceof w9p
      // 08: iload 2
      // 09: ifne 2d
      // 0c: ifeq 3f
      // 0f: goto 16
      // 12: invokestatic mn8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield mn8.gco Ljava/lang/String;
      // 1a: aload 1
      // 1b: checkcast w9p
      // 1e: invokeinterface w9p.ugh ()Ljava/lang/String; 1
      // 23: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 26: goto 2d
      // 29: invokestatic mn8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: iload 2
      // 2e: ifne 3c
      // 31: ifeq 3f
      // 34: goto 3b
      // 37: invokestatic mn8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: bipush 1
      // 3c: goto 40
      // 3f: bipush 0
      // 40: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4746984988999373811L, 1476351250600215646L, MethodHandles.lookup().lookupClass()).a(258195596190081L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 43724274339423L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0016x\bS\u008fÕ\b\u001a@¨l\u0098ûÞVRÕV.ªóúüO".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      c = var6;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
