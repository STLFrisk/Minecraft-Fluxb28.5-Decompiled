import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class lnz implements Serializable, Cloneable {
   public static final long serialVersionUID = -8226727741811898211L;
   public byte qv5;
   public byte aun;
   public byte yhg;
   public byte wln;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public lnz(byte var1, byte var2, byte var3, byte var4) {
      this.qv5 = var1;
      this.aun = var2;
      this.yhg = var3;
      this.wln = var4;
   }

   public lnz(byte[] var1) {
      this.qv5 = var1[0];
      this.aun = var1[1];
      this.yhg = var1[2];
      this.wln = var1[3];
   }

   public lnz(lnz var1) {
      this.qv5 = var1.qv5;
      this.aun = var1.aun;
      this.yhg = var1.yhg;
      this.wln = var1.wln;
   }

   public lnz() {
      this.qv5 = 0;
      this.aun = 0;
      this.yhg = 0;
      this.wln = 0;
   }

   @Override
   public String toString() {
      long var1 = a ^ 100171060730573L;
      return "("
         + (this.qv5 & 0xFF)
         + a<"e">(5584, 2759853791106923686L ^ var1)
         + (this.aun & 0xFF)
         + a<"e">(18965, 3384826228945986402L ^ var1)
         + (this.yhg & 0xFF)
         + a<"e">(18965, 3384826228945986402L ^ var1)
         + (this.wln & 0xFF)
         + ")";
   }

   public final void ed0(byte[] var1) {
      var1[0] = this.qv5;
      var1[1] = this.aun;
      var1[2] = this.yhg;
      var1[3] = this.wln;
   }

   public final void i73(lnz var1) {
      var1.qv5 = this.qv5;
      var1.aun = this.aun;
      var1.yhg = this.yhg;
      var1.wln = this.wln;
   }

   public final void xxd(lnz var1) {
      this.qv5 = var1.qv5;
      this.aun = var1.aun;
      this.yhg = var1.yhg;
      this.wln = var1.wln;
   }

   public final void so8(byte[] var1) {
      this.qv5 = var1[0];
      this.aun = var1[1];
      this.yhg = var1[2];
      this.wln = var1[3];
   }

   public boolean l_5(lnz param1) {
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
      // 05: getfield lnz.qv5 B
      // 08: aload 1
      // 09: getfield lnz.qv5 B
      // 0c: iload 2
      // 0d: ifne 29
      // 10: if_icmpne 75
      // 13: goto 1a
      // 16: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield lnz.aun B
      // 1e: aload 1
      // 1f: getfield lnz.aun B
      // 22: goto 29
      // 25: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 28: athrow
      // 29: iload 2
      // 2a: ifne 46
      // 2d: if_icmpne 75
      // 30: goto 37
      // 33: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield lnz.yhg B
      // 3b: aload 1
      // 3c: getfield lnz.yhg B
      // 3f: goto 46
      // 42: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 45: athrow
      // 46: iload 2
      // 47: ifne 6e
      // 4a: if_icmpne 75
      // 4d: goto 54
      // 50: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 53: athrow
      // 54: aload 0
      // 55: getfield lnz.wln B
      // 58: iload 2
      // 59: ifne 72
      // 5c: goto 63
      // 5f: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 62: athrow
      // 63: aload 1
      // 64: getfield lnz.wln B
      // 67: goto 6e
      // 6a: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 6d: athrow
      // 6e: if_icmpne 75
      // 71: bipush 1
      // 72: goto 76
      // 75: bipush 0
      // 76: ireturn
      // 77: astore 3
      // 78: bipush 0
      // 79: ireturn
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
      // 04: aload 1
      // 05: checkcast lnz
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield lnz.qv5 B
      // 0d: aload 3
      // 0e: getfield lnz.qv5 B
      // 11: iload 2
      // 12: ifne 2e
      // 15: if_icmpne 7a
      // 18: goto 1f
      // 1b: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield lnz.aun B
      // 23: aload 3
      // 24: getfield lnz.aun B
      // 27: goto 2e
      // 2a: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2d: athrow
      // 2e: iload 2
      // 2f: ifne 4b
      // 32: if_icmpne 7a
      // 35: goto 3c
      // 38: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield lnz.yhg B
      // 40: aload 3
      // 41: getfield lnz.yhg B
      // 44: goto 4b
      // 47: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4a: athrow
      // 4b: iload 2
      // 4c: ifne 73
      // 4f: if_icmpne 7a
      // 52: goto 59
      // 55: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 58: athrow
      // 59: aload 0
      // 5a: getfield lnz.wln B
      // 5d: iload 2
      // 5e: ifne 77
      // 61: goto 68
      // 64: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 67: athrow
      // 68: aload 3
      // 69: getfield lnz.wln B
      // 6c: goto 73
      // 6f: invokestatic lnz.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 72: athrow
      // 73: if_icmpne 7a
      // 76: bipush 1
      // 77: goto 7b
      // 7a: bipush 0
      // 7b: ireturn
      // 7c: astore 3
      // 7d: bipush 0
      // 7e: ireturn
      // 7f: astore 3
      // 80: bipush 0
      // 81: ireturn
   }

   @Override
   public int hashCode() {
      return (this.qv5 & 0xFF) << 0 | (this.aun & 0xFF) << 8 | (this.yhg & 0xFF) << 16 | (this.wln & 0xFF) << 24;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final byte j6w() {
      return this.qv5;
   }

   public final void uyk(byte var1) {
      this.qv5 = var1;
   }

   public final byte gz2() {
      return this.aun;
   }

   public final void nrk(byte var1) {
      this.aun = var1;
   }

   public final byte c8u() {
      return this.yhg;
   }

   public final void ht5(byte var1) {
      this.yhg = var1;
   }

   public final byte mos() {
      return this.wln;
   }

   public final void uzw(byte var1) {
      this.wln = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5289088855060806L, 6283754969447961839L, MethodHandles.lookup().lookupClass()).a(110350264231573L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 22998492242412L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "Î\u0003\u0085Z\u0088+\u0003\u0081gJ7\u009d¥=YÉ\u0010\u0089]¯\u000e\f2\u0094««Nm4ù\u008d \u0006";
      int var8 = "Î\u0003\u0085Z\u0088+\u0003\u0081gJ7\u009d¥=YÉ\u0010\u0089]¯\u000e\f2\u0094««Nm4ù\u008d \u0006".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static NullPointerException a(NullPointerException var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14181;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("lnz", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("lnz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
