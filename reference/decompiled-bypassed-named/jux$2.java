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

public class jux$2 implements Callable {
   public final int mdi;
   public final jux uyh;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public jux$2(jux var1, int var2) {
      this.uyh = var1;
      this.mdi = var2;
   }

   public String call() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic jux$2.a J
      // 03: ldc2_w 80377938367095
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield jux$2.mdi I
      // 10: iload 3
      // 11: ifne 37
      // 14: ifne 33
      // 17: goto 1e
      // 1a: invokestatic jux$2.a (Loov;)Loov;
      // 1d: athrow
      // 1e: sipush 22927
      // 21: ldc2_w 2786185373022646376
      // 24: lload 1
      // 25: lxor
      // 26: invokedynamic a (IJ)Ljava/lang/String; bsm=jux$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: nop
      // 2c: goto 9a
      // 2f: invokestatic jux$2.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield jux$2.mdi I
      // 37: bipush 1
      // 38: iload 3
      // 39: ifne 60
      // 3c: if_icmpne 5b
      // 3f: goto 46
      // 42: invokestatic jux$2.a (Loov;)Loov;
      // 45: athrow
      // 46: sipush 9286
      // 49: ldc2_w 928399980163861920
      // 4c: lload 1
      // 4d: lxor
      // 4e: invokedynamic a (IJ)Ljava/lang/String; bsm=jux$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: goto 9a
      // 57: invokestatic jux$2.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield jux$2.mdi I
      // 5f: bipush 3
      // 60: if_icmpne 78
      // 63: sipush 21598
      // 66: ldc2_w 2371209384460418490
      // 69: lload 1
      // 6a: lxor
      // 6b: invokedynamic a (IJ)Ljava/lang/String; bsm=jux$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: nop
      // 71: goto 9a
      // 74: invokestatic jux$2.a (Loov;)Loov;
      // 77: athrow
      // 78: new java/lang/StringBuilder
      // 7b: dup
      // 7c: invokespecial java/lang/StringBuilder.<init> ()V
      // 7f: sipush 32017
      // 82: ldc2_w 7672455680621335796
      // 85: lload 1
      // 86: lxor
      // 87: invokedynamic a (IJ)Ljava/lang/String; bsm=jux$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: nop
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: aload 0
      // 91: getfield jux$2.mdi I
      // 94: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 97: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9a: areturn
   }

   @Override
   public Object call() {
      return this.call();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-963662911347867459L, -1068410823149814819L, MethodHandles.lookup().lookupClass()).a(249098008445190L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 28467384388108L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "ÖÞ 3(\u008fÅ: Ûé5û\u008b?ÇV®Ò\u0080\u0087\u0001\u008d¬ôÄæ\u008f<\u0013©,(l\u0090du¢\u001d\u0000\u001eÑÜ\n\u001cMO)Ñ*ßÕJL\f\u0091â*nZ¨5U áZ\n\u0089º´D\u008dÃ";
      int var8 = "ÖÞ 3(\u008fÅ: Ûé5û\u008b?ÇV®Ò\u0080\u0087\u0001\u008d¬ôÄæ\u008f<\u0013©,(l\u0090du¢\u001d\u0000\u001eÑÜ\n\u001cMO)Ñ*ßÕJL\f\u0091â*nZ¨5U áZ\n\u0089º´D\u008dÃ"
         .length();
      char var5 = ' ';
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
                     c = new String[4];
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

                  var6 = "\u001bs\u008e\u0096®@\u0001#\u0088N¡Å»°5ó¡;¯Y¢\u0086ÃÀñ2Û\nd\u0085³Z 0Íj\u0081[$Q\u0087¤${·\u0007p^Ç)ñ2\"ìò\u0002ìÒå\u0000i\u000bØ\u0098\u0004";
                  var8 = "\u001bs\u008e\u0096®@\u0001#\u0088N¡Å»°5ó¡;¯Y¢\u0086ÃÀñ2Û\nd\u0085³Z 0Íj\u0081[$Q\u0087¤${·\u0007p^Ç)ñ2\"ìò\u0002ìÒå\u0000i\u000bØ\u0098\u0004"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4444;
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
            throw new RuntimeException("jux$2", var10);
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
         throw new RuntimeException("jux$2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
