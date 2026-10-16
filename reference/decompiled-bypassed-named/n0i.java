import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class n0i {
   private static final Logger ydr;
   private final n0i$p_w ayc;
   private final n0i$pto jli;
   private int xsq;
   private int ic2;
   private static final long a;
   private static final String b;

   public n0i(int var1, n0i$p_w var2, n0i$pto var3, int var4) {
      long var5 = a ^ 66843888337076L;
      super();
      if (!this.fa8(var1, var3)) {
         ydr.warn(b);
         this.jli = n0i$pto.yu9;
      } else {
         this.jli = var3;
      }

      this.ayc = var2;
      this.xsq = var1;
      this.ic2 = var4;
   }

   private final boolean fa8(int param1, n0i$pto param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: ifeq 12
      // 04: aload 2
      // 05: getstatic n0i$pto.yu9 Ln0i$pto;
      // 08: if_acmpne 1a
      // 0b: goto 12
      // 0e: invokestatic n0i.a (Loov;)Loov;
      // 11: athrow
      // 12: bipush 1
      // 13: goto 1b
      // 16: invokestatic n0i.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 0
      // 1b: ireturn
   }

   public final n0i$p_w __g() {
      return this.ayc;
   }

   public final n0i$pto rk2() {
      return this.jli;
   }

   public final int j5z() {
      return this.ic2;
   }

   public final int uik() {
      return this.xsq;
   }

   @Override
   public String toString() {
      return this.ic2 + "," + this.jli.om4() + "," + this.ayc.mc6();
   }

   public final int j6_() {
      return this.ayc.sme() * this.ic2;
   }

   public final boolean gqv() {
      try {
         if (this.jli == n0i$pto.rrf) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic n0i.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic n0i.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: ifnull b6
      // 1e: aload 0
      // 1f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 22: iload 2
      // 23: ifne 43
      // 26: goto 2d
      // 29: invokestatic n0i.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 31: if_acmpne b6
      // 34: goto 3b
      // 37: invokestatic n0i.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 1
      // 3c: goto 43
      // 3f: invokestatic n0i.a (Loov;)Loov;
      // 42: athrow
      // 43: checkcast n0i
      // 46: astore 3
      // 47: aload 0
      // 48: getfield n0i.ic2 I
      // 4b: aload 3
      // 4c: getfield n0i.ic2 I
      // 4f: iload 2
      // 50: ifne 78
      // 53: if_icmpeq 65
      // 56: goto 5d
      // 59: invokestatic n0i.a (Loov;)Loov;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: goto b5
      // 61: invokestatic n0i.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: iload 2
      // 67: ifne 84
      // 6a: getfield n0i.xsq I
      // 6d: aload 3
      // 6e: getfield n0i.xsq I
      // 71: goto 78
      // 74: invokestatic n0i.a (Loov;)Loov;
      // 77: athrow
      // 78: if_icmpeq 83
      // 7b: bipush 0
      // 7c: goto b5
      // 7f: invokestatic n0i.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 0
      // 84: iload 2
      // 85: ifne a2
      // 88: getfield n0i.ayc Ln0i$p_w;
      // 8b: aload 3
      // 8c: getfield n0i.ayc Ln0i$p_w;
      // 8f: if_acmpeq a1
      // 92: goto 99
      // 95: invokestatic n0i.a (Loov;)Loov;
      // 98: athrow
      // 99: bipush 0
      // 9a: goto b5
      // 9d: invokestatic n0i.a (Loov;)Loov;
      // a0: athrow
      // a1: aload 0
      // a2: getfield n0i.jli Ln0i$pto;
      // a5: aload 3
      // a6: getfield n0i.jli Ln0i$pto;
      // a9: if_acmpne b4
      // ac: bipush 1
      // ad: goto b5
      // b0: invokestatic n0i.a (Loov;)Loov;
      // b3: athrow
      // b4: bipush 0
      // b5: ireturn
      // b6: bipush 0
      // b7: ireturn
   }

   @Override
   public int hashCode() {
      int var1 = this.ayc.hashCode();
      var1 = 31 * var1 + this.jli.hashCode();
      var1 = 31 * var1 + this.xsq;
      return 31 * var1 + this.ic2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7253609527241912193L, -1613142445212725442L, MethodHandles.lookup().lookupClass()).a(220313210284535L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 90004968425047L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "IÛ_ö\u0095t½Ð¾mb\u00adj=KCým#¶¼\u0019\u0084\u0099éSó$WBñ¼öÞYV*\u0094þ\\\u0093Jú[\u008féÝÀMZÝKóôFjL¤ÒhJxß>â4;»ZÃèÈ ühV¹$Ò\u0094îã±î\u0083w\u008fãªCS¿} \u0013»"
            .getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      ydr = LogManager.getLogger();
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
