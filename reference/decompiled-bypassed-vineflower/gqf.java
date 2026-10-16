import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.Logger;

public class gqf {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static gqf$auu oa6() {
      long var0 = a ^ 70018772994474L;
      String var2 = System.getProperty(a<"i">(6946, 3595640860858688190L ^ var0)).toLowerCase();

      try {
         if (var2.contains(a<"i">(27524, 3843687667278565914L ^ var0))) {
            return gqf$auu.jx9;
         }
      } catch (oov var8) {
         throw a(var8);
      }

      try {
         if (var2.contains(a<"i">(26917, 483442427121553592L ^ var0))) {
            return gqf$auu.d9y;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      try {
         if (var2.contains(a<"i">(16150, 5500820476239316623L ^ var0))) {
            return gqf$auu._px;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      try {
         if (var2.contains(a<"i">(28206, 2616405506735626164L ^ var0))) {
            return gqf$auu._px;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      try {
         if (var2.contains(a<"i">(11483, 2243602508385129795L ^ var0))) {
            return gqf$auu.m31;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      try {
         if (var2.contains(a<"i">(27270, 5943822304754553629L ^ var0))) {
            return gqf$auu.m31;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return gqf$auu.jml;
   }

   public static Object sko(FutureTask param0, Logger param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic gqf.a J
      // 03: ldc2_w 67059257109841
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: invokevirtual java/util/concurrent/FutureTask.run ()V
      // 11: aload 0
      // 12: invokevirtual java/util/concurrent/FutureTask.get ()Ljava/lang/Object;
      // 15: areturn
      // 16: astore 5
      // 18: aload 1
      // 19: sipush 972
      // 1c: ldc2_w 1065896387018350248
      // 1f: lload 2
      // 20: lxor
      // 21: invokedynamic i (IJ)Ljava/lang/String; bsm=gqf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: nop
      // 27: aload 5
      // 29: invokeinterface org/apache/logging/log4j/Logger.fatal (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 2e: aload 5
      // 30: invokevirtual java/util/concurrent/ExecutionException.getCause ()Ljava/lang/Throwable;
      // 33: iload 4
      // 35: ifeq 51
      // 38: instanceof java/lang/OutOfMemoryError
      // 3b: ifeq 59
      // 3e: goto 45
      // 41: invokestatic gqf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: aload 5
      // 47: invokevirtual java/util/concurrent/ExecutionException.getCause ()Ljava/lang/Throwable;
      // 4a: goto 51
      // 4d: invokestatic gqf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: checkcast java/lang/OutOfMemoryError
      // 54: astore 6
      // 56: aload 6
      // 58: athrow
      // 59: goto 74
      // 5c: astore 5
      // 5e: aload 1
      // 5f: sipush 29145
      // 62: ldc2_w 9019689158299495604
      // 65: lload 2
      // 66: lxor
      // 67: invokedynamic i (IJ)Ljava/lang/String; bsm=gqf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: nop
      // 6d: aload 5
      // 6f: invokeinterface org/apache/logging/log4j/Logger.fatal (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 74: aconst_null
      // 75: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6939233811690944572L, 2865786807825417858L, MethodHandles.lookup().lookupClass()).a(183449750993632L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 132998658103691L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\u0010ÊÈYõ:w+\u000e\u009f?x\u0087ù¶õ(m+ÆÖï\u0084W;t\u0001§¢\u0090Ë±ÊZ \u000f5'kÃ!.ÁB\u009fþ ¼üàäûÑÿÆ²M\u0010×BP\u00adÚê·_ô\u0085O_\u001d ÑJ\u0010ÇVÈQë\u001cä4Æ_\u0017\u0096ß§³ã\u0010\u001f\u000eÀ¤\rL\u0003\u0092\u001a¼Cóú\u0013×á\u0010-oY[W\u008aA¼\u0087!\u0091\u001cnÙÇN\u0010vý\u0014J )KC\u0085\u0013ëv\r©1²";
      int var8 = "\u0010ÊÈYõ:w+\u000e\u009f?x\u0087ù¶õ(m+ÆÖï\u0084W;t\u0001§¢\u0090Ë±ÊZ \u000f5'kÃ!.ÁB\u009fþ ¼üàäûÑÿÆ²M\u0010×BP\u00adÚê·_ô\u0085O_\u001d ÑJ\u0010ÇVÈQë\u001cä4Æ_\u0017\u0096ß§³ã\u0010\u001f\u000eÀ¤\rL\u0003\u0092\u001a¼Cóú\u0013×á\u0010-oY[W\u008aA¼\u0087!\u0091\u001cnÙÇN\u0010vý\u0014J )KC\u0085\u0013ëv\r©1²"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[9];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "µÀøþ¶\u001a«å\u0097µ\u0087M?ÛX[(\u0095 zï2£½\u009eª`¹ñë\u00adØsc\u001f\u00132ºF'±Å\u008ft\u008c\u001b¨$x©É\u0082w¾À\u0097\u009a";
                  var8 = "µÀøþ¶\u001a«å\u0097µ\u0087M?ÛX[(\u0095 zï2£½\u009eª`¹ñë\u00adØsc\u001f\u00132ºF'±Å\u008ft\u008c\u001b¨$x©É\u0082w¾À\u0097\u009a"
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26380;
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
            throw new RuntimeException("gqf", var10);
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
         throw new RuntimeException("gqf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
