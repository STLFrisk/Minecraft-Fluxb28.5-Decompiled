import com.google.common.base.Objects;
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

public abstract class ev3 implements xny {
   private final Class d7o;
   private final String tt0;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public ev3(String var1, Class var2) {
      this.d7o = var2;
      this.tt0 = var1;
   }

   @Override
   public String w6i() {
      return this.tt0;
   }

   @Override
   public Class pn7() {
      return this.d7o;
   }

   @Override
   public String toString() {
      long var1 = b ^ 93402492758292L;
      return Objects.toStringHelper(this)
         .add(a<"f">(3254, 7591466772473637679L ^ var1), this.tt0)
         .add(a<"f">(27403, 6882119991755443345L ^ var1), this.d7o)
         .add(a<"f">(9626, 5491885517291667970L ^ var1), this.isr())
         .toString();
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic ev3.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic ev3.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: ifnull 86
      // 1e: aload 0
      // 1f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 22: iload 2
      // 23: ifeq 43
      // 26: goto 2d
      // 29: invokestatic ev3.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 31: if_acmpne 86
      // 34: goto 3b
      // 37: invokestatic ev3.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 1
      // 3c: goto 43
      // 3f: invokestatic ev3.a (Loov;)Loov;
      // 42: athrow
      // 43: checkcast ev3
      // 46: astore 3
      // 47: aload 0
      // 48: getfield ev3.d7o Ljava/lang/Class;
      // 4b: aload 3
      // 4c: getfield ev3.d7o Ljava/lang/Class;
      // 4f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 52: iload 2
      // 53: ifeq 72
      // 56: ifeq 84
      // 59: goto 60
      // 5c: invokestatic ev3.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield ev3.tt0 Ljava/lang/String;
      // 64: aload 3
      // 65: getfield ev3.tt0 Ljava/lang/String;
      // 68: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6b: goto 72
      // 6e: invokestatic ev3.a (Loov;)Loov;
      // 71: athrow
      // 72: iload 2
      // 73: ifeq 81
      // 76: ifeq 84
      // 79: goto 80
      // 7c: invokestatic ev3.a (Loov;)Loov;
      // 7f: athrow
      // 80: bipush 1
      // 81: goto 85
      // 84: bipush 0
      // 85: ireturn
      // 86: bipush 0
      // 87: ireturn
   }

   @Override
   public int hashCode() {
      return 31 * this.d7o.hashCode() + this.tt0.hashCode();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7693501119301733324L, -4246766798032679327L, MethodHandles.lookup().lookupClass()).a(17488008188357L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 45547379165830L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "G\u007f\u0096âÜî\u008e\u000b\u0099è¢+\u0091\u0013ói\u0010\u009d¨V9]«)d¶ÈZÐyÛïs\u0010·´ËÁ²äþï\u0083GÄ!ÅóËá";
      int var8 = "G\u007f\u0096âÜî\u008e\u000b\u0099è¢+\u0091\u0013ói\u0010\u009d¨V9]«)d¶ÈZÐyÛïs\u0010·´ËÁ²äþï\u0083GÄ!ÅóËá".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6861;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ev3", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("ev3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
