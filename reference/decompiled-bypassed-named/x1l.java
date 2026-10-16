import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class x1l {
   public String erm;
   private static final long a;
   private static final String b;

   public x1l(String var1, String var2, String var3, String var4) {
      this(var1, var2, var3, false);
      this.erm = var4;
   }

   public x1l(String var1, String var2, String var3) {
      this(var1, var2, var3, false);
   }

   public x1l(String param1, String param2, String param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic x1l.a J
      // 03: ldc2_w 4024262748199
      // 06: lxor
      // 07: lstore 5
      // 09: aload 0
      // 0a: invokespecial java/lang/Object.<init> ()V
      // 0d: invokestatic OpaquePredicate.c ()I
      // 10: aload 0
      // 11: getstatic x1l.b Ljava/lang/String;
      // 14: nop
      // 15: putfield x1l.erm Ljava/lang/String;
      // 18: aload 0
      // 19: aload 1
      // 1a: putfield x1l.q7j Ljava/lang/String;
      // 1d: istore 7
      // 1f: aload 0
      // 20: iload 4
      // 22: putfield x1l.wpp Z
      // 25: iload 7
      // 27: ifne 5e
      // 2a: aload 2
      // 2b: ifnull 43
      // 2e: goto 35
      // 31: invokestatic x1l.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 2
      // 36: invokevirtual java/lang/String.isEmpty ()Z
      // 39: ifeq 63
      // 3c: goto 43
      // 3f: invokestatic x1l.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: bipush 1
      // 45: putfield x1l.uxg Z
      // 48: aload 0
      // 49: bipush 0
      // 4a: putfield x1l.t2r Z
      // 4d: aload 0
      // 4e: aload 1
      // 4f: putfield x1l.sa7 Ljava/lang/String;
      // 52: aload 0
      // 53: aconst_null
      // 54: putfield x1l.p43 Ljava/lang/String;
      // 57: goto 5e
      // 5a: invokestatic x1l.a (Loov;)Loov;
      // 5d: athrow
      // 5e: iload 7
      // 60: ifeq ac
      // 63: aload 0
      // 64: bipush 0
      // 65: iload 7
      // 67: ifne 9b
      // 6a: goto 71
      // 6d: invokestatic x1l.a (Loov;)Loov;
      // 70: athrow
      // 71: putfield x1l.uxg Z
      // 74: aload 0
      // 75: aload 3
      // 76: ifnull 9a
      // 79: goto 80
      // 7c: invokestatic x1l.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 3
      // 81: invokevirtual java/lang/String.isEmpty ()Z
      // 84: iload 7
      // 86: ifne 9b
      // 89: goto 90
      // 8c: invokestatic x1l.a (Loov;)Loov;
      // 8f: athrow
      // 90: ifeq 9e
      // 93: goto 9a
      // 96: invokestatic x1l.a (Loov;)Loov;
      // 99: athrow
      // 9a: bipush 1
      // 9b: goto 9f
      // 9e: bipush 0
      // 9f: putfield x1l.t2r Z
      // a2: aload 0
      // a3: aload 3
      // a4: putfield x1l.sa7 Ljava/lang/String;
      // a7: aload 0
      // a8: aload 2
      // a9: putfield x1l.p43 Ljava/lang/String;
      // ac: return
   }

   public String rii() {
      return this.q7j;
   }

   public String y0c() {
      return this.sa7;
   }

   public String wph() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 22
      // 09: getfield x1l.t2r Z
      // 0c: ifeq 21
      // 0f: goto 16
      // 12: invokestatic x1l.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield x1l.q7j Ljava/lang/String;
      // 1a: goto 25
      // 1d: invokestatic x1l.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield x1l.sa7 Ljava/lang/String;
      // 25: areturn
   }

   public String g9o() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield x1l.p43 Ljava/lang/String;
      // 08: iload 1
      // 09: ifeq 41
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic x1l.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield x1l.p43 Ljava/lang/String;
      // 1a: iload 1
      // 1b: ifeq 46
      // 1e: goto 25
      // 21: invokestatic x1l.a (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual java/lang/String.isEmpty ()Z
      // 28: ifeq 42
      // 2b: goto 32
      // 2e: invokestatic x1l.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: bipush 1
      // 34: putfield x1l.uxg Z
      // 37: ldc ""
      // 39: nop
      // 3a: goto 41
      // 3d: invokestatic x1l.a (Loov;)Loov;
      // 40: athrow
      // 41: areturn
      // 42: aload 0
      // 43: getfield x1l.p43 Ljava/lang/String;
      // 46: areturn
   }

   public boolean s2l() {
      return this.uxg;
   }

   public boolean wvc() {
      return this.wpp;
   }

   public void ay3(boolean var1) {
      this.wpp = var1;
   }

   public boolean rnb() {
      return this.t2r;
   }

   public void jcg(String var1) {
      this.sa7 = var1;
      this.t2r = false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1829681689084065058L, -4892846557842946565L, MethodHandles.lookup().lookupClass()).a(35538898106815L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 40674651526625L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("I>¥H\b\u0013ïx".getBytes("ISO-8859-1"));
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
