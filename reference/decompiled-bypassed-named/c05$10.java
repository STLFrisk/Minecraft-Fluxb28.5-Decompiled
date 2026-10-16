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

public class c05$10 implements Callable {
   public final Minecraft wzi;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public c05$10(Minecraft var1) {
      this.wzi = var1;
   }

   public String call() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic c05$10.a J
      // 03: ldc2_w 58252148493199
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: invokestatic g4v.a68 ()Ljava/lang/String;
      // 0f: astore 4
      // 11: aload 4
      // 13: iload 3
      // 14: ifne 5f
      // 17: sipush 3704
      // 1a: ldc2_w 8635459047961390746
      // 1d: lload 1
      // 1e: lxor
      // 1f: invokedynamic g (IJ)Ljava/lang/String; bsm=c05$10.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: nop
      // 25: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 28: ifne 62
      // 2b: goto 32
      // 2e: invokestatic c05$10.a (Loov;)Loov;
      // 31: athrow
      // 32: new java/lang/StringBuilder
      // 35: dup
      // 36: invokespecial java/lang/StringBuilder.<init> ()V
      // 39: sipush 29496
      // 3c: ldc2_w 5021432655454507995
      // 3f: lload 1
      // 40: lxor
      // 41: invokedynamic g (IJ)Ljava/lang/String; bsm=c05$10.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a: aload 4
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: ldc "'"
      // 51: nop
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 58: goto 5f
      // 5b: invokestatic c05$10.a (Loov;)Loov;
      // 5e: athrow
      // 5f: goto 8e
      // 62: ldc Minecraft
      // 64: nop
      // 65: invokevirtual java/lang/Class.getSigners ()[Ljava/lang/Object;
      // 68: ifnonnull 80
      // 6b: sipush 23203
      // 6e: ldc2_w 7432933562634648130
      // 71: lload 1
      // 72: lxor
      // 73: invokedynamic g (IJ)Ljava/lang/String; bsm=c05$10.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: nop
      // 79: goto 8e
      // 7c: invokestatic c05$10.a (Loov;)Loov;
      // 7f: athrow
      // 80: sipush 17103
      // 83: ldc2_w 7126698022986719791
      // 86: lload 1
      // 87: lxor
      // 88: invokedynamic g (IJ)Ljava/lang/String; bsm=c05$10.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: nop
      // 8e: areturn
   }

   @Override
   public Object call() {
      return this.call();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2398656436337413091L, 5712082021828196912L, MethodHandles.lookup().lookupClass()).a(170877112427973L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 9168129062153L;
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
      String var6 = "y´#yÑR\u0014Ç²GA\u0000n¸åÆ\u000býä¿\u008c\u001bÉ\u0090!öÞ+®ì\\)M5\u001aÑñ\u008c]S âÃÌpË\u0013\u001c¸Û\u008fÆ\u0011E\u0012\u0019\b\u009fÿÒ\u0015\u00125\u009fx\u001faÇ\u0018Ï½G©á\u008eî[/µ-\u0088ª9US\u0091Kj¢\u0013³¯\u000fÅâ?§ç|¦{¼Ô\u0004X\u0090ÉÙ¥.oB[á?Ó\u001f\u0083Ø\u0011¨\u000bmO\u0098Ñ¹\u0081õæ¦AÅ=\u0010¤\r'¹[ûøÉw\u001a\u0098T\u0094;¿M\u0016\u001fÃYÓ£²Q\u0000\u0012\u0005\u009báãä\u008f'_.\u007fuEu\u0084\u0091\u000bA:\u0012½Ý\u008e=ì";
      int var8 = "y´#yÑR\u0014Ç²GA\u0000n¸åÆ\u000býä¿\u008c\u001bÉ\u0090!öÞ+®ì\\)M5\u001aÑñ\u008c]S âÃÌpË\u0013\u001c¸Û\u008fÆ\u0011E\u0012\u0019\b\u009fÿÒ\u0015\u00125\u009fx\u001faÇ\u0018Ï½G©á\u008eî[/µ-\u0088ª9US\u0091Kj¢\u0013³¯\u000fÅâ?§ç|¦{¼Ô\u0004X\u0090ÉÙ¥.oB[á?Ó\u001f\u0083Ø\u0011¨\u000bmO\u0098Ñ¹\u0081õæ¦AÅ=\u0010¤\r'¹[ûøÉw\u001a\u0098T\u0094;¿M\u0016\u001fÃYÓ£²Q\u0000\u0012\u0005\u009báãä\u008f'_.\u007fuEu\u0084\u0091\u000bA:\u0012½Ý\u008e=ì"
         .length();
      char var5 = '@';
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

                  var6 = "Î2\u0006DS/§\u001e\u0017PÜ\u0001\u001aÇ®¦-\u0004Ö ç,ú¨rå\u0014ýµÜ\\\u0019\u0015\u0019må8µ\u00146¨\u009c$ÂiSÏ\u009f\u0083¦u8A¼E#À\u008eÑ7êä\u009eh\u0010L~©£\u0013ï¢þ\u008d\u009c*\u0085´à\u0006\u0018";
                  var8 = "Î2\u0006DS/§\u001e\u0017PÜ\u0001\u001aÇ®¦-\u0004Ö ç,ú¨rå\u0014ýµÜ\\\u0019\u0015\u0019må8µ\u00146¨\u009c$ÂiSÏ\u009f\u0083¦u8A¼E#À\u008eÑ7êä\u009eh\u0010L~©£\u0013ï¢þ\u008d\u009c*\u0085´à\u0006\u0018"
                     .length();
                  var5 = '@';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22228;
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
            throw new RuntimeException("c05$10", var10);
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
         throw new RuntimeException("c05$10" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
