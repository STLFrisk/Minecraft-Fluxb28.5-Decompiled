import java.io.File;
import java.io.FileFilter;
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

public final class w69$1 implements FileFilter {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public boolean accept(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic w69$1.a J
      // 03: ldc2_w 80884609041807
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual java/io/File.isFile ()Z
      // 11: iload 4
      // 13: ifeq 3c
      // 16: ifeq 4f
      // 19: goto 20
      // 1c: invokestatic w69$1.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 24: sipush 18640
      // 27: ldc2_w 5798376032729227196
      // 2a: lload 2
      // 2b: lxor
      // 2c: invokedynamic t (IJ)Ljava/lang/String; bsm=w69$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: nop
      // 32: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 35: goto 3c
      // 38: invokestatic w69$1.a (Loov;)Loov;
      // 3b: athrow
      // 3c: iload 4
      // 3e: ifeq 4c
      // 41: ifeq 4f
      // 44: goto 4b
      // 47: invokestatic w69$1.a (Loov;)Loov;
      // 4a: athrow
      // 4b: bipush 1
      // 4c: goto 50
      // 4f: bipush 0
      // 50: istore 5
      // 52: aload 1
      // 53: invokevirtual java/io/File.isDirectory ()Z
      // 56: iload 4
      // 58: ifeq 85
      // 5b: ifeq 98
      // 5e: goto 65
      // 61: invokestatic w69$1.a (Loov;)Loov;
      // 64: athrow
      // 65: new java/io/File
      // 68: dup
      // 69: aload 1
      // 6a: sipush 825
      // 6d: ldc2_w 638895393932481620
      // 70: lload 2
      // 71: lxor
      // 72: invokedynamic t (IJ)Ljava/lang/String; bsm=w69$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: nop
      // 78: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 7b: invokevirtual java/io/File.isFile ()Z
      // 7e: goto 85
      // 81: invokestatic w69$1.a (Loov;)Loov;
      // 84: athrow
      // 85: iload 4
      // 87: ifeq 95
      // 8a: ifeq 98
      // 8d: goto 94
      // 90: invokestatic w69$1.a (Loov;)Loov;
      // 93: athrow
      // 94: bipush 1
      // 95: goto 99
      // 98: bipush 0
      // 99: istore 6
      // 9b: iload 5
      // 9d: iload 4
      // 9f: ifeq c5
      // a2: ifne c4
      // a5: goto ac
      // a8: invokestatic w69$1.a (Loov;)Loov;
      // ab: athrow
      // ac: iload 6
      // ae: iload 4
      // b0: ifeq c5
      // b3: goto ba
      // b6: invokestatic w69$1.a (Loov;)Loov;
      // b9: athrow
      // ba: ifeq c8
      // bd: goto c4
      // c0: invokestatic w69$1.a (Loov;)Loov;
      // c3: athrow
      // c4: bipush 1
      // c5: goto c9
      // c8: bipush 0
      // c9: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-280182373504490938L, -8075957375431256236L, MethodHandles.lookup().lookupClass()).a(195170569592368L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 99295867376669L;
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
      String var6 = "¬\u0086þôõS0Lñ\u0086vÏ2\u0086_±ÁJ\r/·ÿµ_\u0010ío!l\"m>´\u009a\u0016\u0019½;\u001e5\u0014";
      int var8 = "¬\u0086þôõS0Lñ\u0086vÏ2\u0086_±ÁJ\r/·ÿµ_\u0010ío!l\"m>´\u009a\u0016\u0019½;\u001e5\u0014".length();
      char var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5324;
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
            throw new RuntimeException("w69$1", var10);
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
         throw new RuntimeException("w69$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
