import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class sla$1 implements Callable {
   public final int[][] gx8;
   public final sla jed;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public sla$1(sla var1, int[][] var2) {
      this.jed = var1;
      this.gx8 = var2;
   }

   public String call() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic sla$1.a J
      // 03: ldc2_w 53682941476843
      // 06: lxor
      // 07: lstore 1
      // 08: new java/lang/StringBuilder
      // 0b: dup
      // 0c: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f: astore 4
      // 11: aload 0
      // 12: getfield sla$1.gx8 [[I
      // 15: astore 5
      // 17: invokestatic OpaquePredicate.c ()I
      // 1a: aload 5
      // 1c: arraylength
      // 1d: istore 6
      // 1f: istore 3
      // 20: bipush 0
      // 21: istore 7
      // 23: iload 7
      // 25: iload 6
      // 27: if_icmpge a2
      // 2a: aload 5
      // 2c: iload 7
      // 2e: aaload
      // 2f: astore 8
      // 31: aload 4
      // 33: iload 3
      // 34: ifne a4
      // 37: iload 3
      // 38: ifne 6c
      // 3b: goto 42
      // 3e: invokestatic sla$1.a (Loov;)Loov;
      // 41: athrow
      // 42: invokevirtual java/lang/StringBuilder.length ()I
      // 45: ifle 6a
      // 48: goto 4f
      // 4b: invokestatic sla$1.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 4
      // 51: sipush 19267
      // 54: ldc2_w 7362373621584250989
      // 57: lload 1
      // 58: lxor
      // 59: invokedynamic l (IJ)Ljava/lang/String; bsm=sla$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: nop
      // 5f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 62: pop
      // 63: goto 6a
      // 66: invokestatic sla$1.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 4
      // 6c: aload 8
      // 6e: iload 3
      // 6f: ifne 93
      // 72: ifnonnull 91
      // 75: goto 7c
      // 78: invokestatic sla$1.a (Loov;)Loov;
      // 7b: athrow
      // 7c: sipush 5033
      // 7f: ldc2_w 7413740157049311366
      // 82: lload 1
      // 83: lxor
      // 84: invokedynamic l (IJ)Ljava/lang/String; bsm=sla$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: nop
      // 8a: goto 97
      // 8d: invokestatic sla$1.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 8
      // 93: arraylength
      // 94: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: iinc 7 1
      // 9e: iload 3
      // 9f: ifeq 23
      // a2: aload 4
      // a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a7: areturn
   }

   @Override
   public Object call() {
      return this.call();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7413956669319907529L, -4264395212811993145L, MethodHandles.lookup().lookupClass()).a(1459817934822L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 134269012366971L;
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
      String var6 = "p!\u0016+EÚÄ^Ó9\u001dÀú÷\u0003C\u0010=\u0013\u0002\u0098ö¤U±ÂÙ\u0094BZ<ew";
      int var8 = "p!\u0016+EÚÄ^Ó9\u001dÀú÷\u0003C\u0010=\u0013\u0002\u0098ö¤U±ÂÙ\u0094BZ<ew".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8770;
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
            throw new RuntimeException("sla$1", var10);
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
         throw new RuntimeException("sla$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
