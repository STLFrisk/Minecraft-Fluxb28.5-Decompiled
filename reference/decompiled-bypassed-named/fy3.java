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

public abstract class fy3 implements Serializable, Cloneable {
   public static final long serialVersionUID = -483782685323607044L;
   public byte vxv;
   public byte dia;
   public byte urv;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public fy3(byte var1, byte var2, byte var3) {
      this.vxv = var1;
      this.dia = var2;
      this.urv = var3;
   }

   public fy3(byte[] var1) {
      this.vxv = var1[0];
      this.dia = var1[1];
      this.urv = var1[2];
   }

   public fy3(fy3 var1) {
      this.vxv = var1.vxv;
      this.dia = var1.dia;
      this.urv = var1.urv;
   }

   public fy3() {
      this.vxv = 0;
      this.dia = 0;
      this.urv = 0;
   }

   @Override
   public String toString() {
      long var1 = a ^ 121986705280524L;
      return "("
         + (this.vxv & 0xFF)
         + a<"y">(16617, 8727649741361134260L ^ var1)
         + (this.dia & 0xFF)
         + a<"y">(16803, 92820612099619839L ^ var1)
         + (this.urv & 0xFF)
         + ")";
   }

   public final void js9(byte[] var1) {
      var1[0] = this.vxv;
      var1[1] = this.dia;
      var1[2] = this.urv;
   }

   public final void we6(fy3 var1) {
      var1.vxv = this.vxv;
      var1.dia = this.dia;
      var1.urv = this.urv;
   }

   public final void j0_(fy3 var1) {
      this.vxv = var1.vxv;
      this.dia = var1.dia;
      this.urv = var1.urv;
   }

   public final void m44(byte[] var1) {
      this.vxv = var1[0];
      this.dia = var1[1];
      this.urv = var1[2];
   }

   public boolean i8g(fy3 param1) {
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
      // 05: getfield fy3.vxv B
      // 08: aload 1
      // 09: getfield fy3.vxv B
      // 0c: iload 2
      // 0d: ifeq 29
      // 10: if_icmpne 58
      // 13: goto 1a
      // 16: invokestatic fy3.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield fy3.dia B
      // 1e: aload 1
      // 1f: getfield fy3.dia B
      // 22: goto 29
      // 25: invokestatic fy3.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 28: athrow
      // 29: iload 2
      // 2a: ifeq 51
      // 2d: if_icmpne 58
      // 30: goto 37
      // 33: invokestatic fy3.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield fy3.urv B
      // 3b: iload 2
      // 3c: ifeq 55
      // 3f: goto 46
      // 42: invokestatic fy3.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 45: athrow
      // 46: aload 1
      // 47: getfield fy3.urv B
      // 4a: goto 51
      // 4d: invokestatic fy3.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 50: athrow
      // 51: if_icmpne 58
      // 54: bipush 1
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
      // 5a: astore 3
      // 5b: bipush 0
      // 5c: ireturn
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
      // 05: checkcast fy3
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield fy3.vxv B
      // 0d: aload 3
      // 0e: getfield fy3.vxv B
      // 11: iload 2
      // 12: ifne 2e
      // 15: if_icmpne 5d
      // 18: goto 1f
      // 1b: invokestatic fy3.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield fy3.dia B
      // 23: aload 3
      // 24: getfield fy3.dia B
      // 27: goto 2e
      // 2a: invokestatic fy3.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2d: athrow
      // 2e: iload 2
      // 2f: ifne 56
      // 32: if_icmpne 5d
      // 35: goto 3c
      // 38: invokestatic fy3.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield fy3.urv B
      // 40: iload 2
      // 41: ifne 5a
      // 44: goto 4b
      // 47: invokestatic fy3.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4a: athrow
      // 4b: aload 3
      // 4c: getfield fy3.urv B
      // 4f: goto 56
      // 52: invokestatic fy3.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 55: athrow
      // 56: if_icmpne 5d
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: astore 3
      // 60: bipush 0
      // 61: ireturn
      // 62: astore 3
      // 63: bipush 0
      // 64: ireturn
   }

   @Override
   public int hashCode() {
      return (this.vxv & 0xFF) << 0 | (this.dia & 0xFF) << 8 | (this.urv & 0xFF) << 16;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final byte k9x() {
      return this.vxv;
   }

   public final void ehy(byte var1) {
      this.vxv = var1;
   }

   public final byte zrm() {
      return this.dia;
   }

   public final void skv(byte var1) {
      this.dia = var1;
   }

   public final byte h0t() {
      return this.urv;
   }

   public final void or8(byte var1) {
      this.urv = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1452817005021090955L, 5749360039296103981L, MethodHandles.lookup().lookupClass()).a(263155398322689L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 93586561997406L;
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
      String var6 = "Ad¢\u0085ÓJªgÛÅ« !JÍ6\u0010ªfV«Í\u008f³+sÃÉÈF¶#I";
      int var8 = "Ad¢\u0085ÓJªgÛÅ« !JÍ6\u0010ªfV«Í\u008f³+sÃÉÈF¶#I".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6887;
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
            throw new RuntimeException("fy3", var10);
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
         throw new RuntimeException("fy3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
