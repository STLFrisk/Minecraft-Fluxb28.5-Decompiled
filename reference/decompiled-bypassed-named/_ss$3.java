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

public final class _ss$3 implements bx6 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public String dg6(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _ss$3.a J
      // 03: ldc2_w 98272913685461
      // 06: lxor
      // 07: lstore 2
      // 08: iload 1
      // 09: i2d
      // 0a: ldc2_w 100.0
      // 0d: ddiv
      // 0e: dstore 5
      // 10: invokestatic OpaquePredicate.b ()I
      // 13: dload 5
      // 15: ldc2_w 1000.0
      // 18: ddiv
      // 19: dstore 7
      // 1b: istore 4
      // 1d: dload 7
      // 1f: ldc2_w 0.5
      // 22: dcmpl
      // 23: iload 4
      // 25: ifeq 64
      // 28: ifle 5e
      // 2b: goto 32
      // 2e: invokestatic _ss$3.a (Loov;)Loov;
      // 31: athrow
      // 32: new java/lang/StringBuilder
      // 35: dup
      // 36: invokespecial java/lang/StringBuilder.<init> ()V
      // 39: invokestatic _ss.esp ()Ljava/text/DecimalFormat;
      // 3c: dload 7
      // 3e: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 41: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 44: bipush 12
      // 46: ldc2_w 3414577951398738334
      // 49: lload 2
      // 4a: lxor
      // 4b: invokedynamic o (IJ)Ljava/lang/String; bsm=_ss$3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: nop
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 57: goto b3
      // 5a: invokestatic _ss$3.a (Loov;)Loov;
      // 5d: athrow
      // 5e: dload 5
      // 60: ldc2_w 0.5
      // 63: dcmpl
      // 64: ifle 94
      // 67: new java/lang/StringBuilder
      // 6a: dup
      // 6b: invokespecial java/lang/StringBuilder.<init> ()V
      // 6e: invokestatic _ss.esp ()Ljava/text/DecimalFormat;
      // 71: dload 5
      // 73: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 79: sipush 18489
      // 7c: ldc2_w 7060942093629977001
      // 7f: lload 2
      // 80: lxor
      // 81: invokedynamic o (IJ)Ljava/lang/String; bsm=_ss$3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: nop
      // 87: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8d: goto b3
      // 90: invokestatic _ss$3.a (Loov;)Loov;
      // 93: athrow
      // 94: new java/lang/StringBuilder
      // 97: dup
      // 98: invokespecial java/lang/StringBuilder.<init> ()V
      // 9b: iload 1
      // 9c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 9f: sipush 25749
      // a2: ldc2_w 362974589447134470
      // a5: lload 2
      // a6: lxor
      // a7: invokedynamic o (IJ)Ljava/lang/String; bsm=_ss$3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: nop
      // ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b3: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4949274234672281753L, -3830206342313049996L, MethodHandles.lookup().lookupClass()).a(144198675747148L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 122682378358686L;
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
      String var6 = "¹\\\"g\b\u0088|\u001fë\u0094ÙU8§\u0088Ë\u0010V\u001aÇû\u0099+ÁXÇiÍ=.øà¾\u0010^\u008aK1è¨\u0082\u0018ç\u0006\u0011°ë~r\r";
      int var8 = "¹\\\"g\b\u0088|\u001fë\u0094ÙU8§\u0088Ë\u0010V\u001aÇû\u0099+ÁXÇiÍ=.øà¾\u0010^\u008aK1è¨\u0082\u0018ç\u0006\u0011°ë~r\r".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31838;
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
            throw new RuntimeException("_ss$3", var10);
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
         throw new RuntimeException("_ss$3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
