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
import org.apache.logging.log4j.LogManager;

public class q38 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void xhu() {
      x1y = new q38();
   }

   public static q38 x7d() {
      return x1y;
   }

   public void vqm(jn3 var1) {
      var1.bfo().btz(var1);
      var1.t6v().btz(var1);
      gis.r5r(var1.x_a());
   }

   public int slb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic q38.a J
      // 03: ldc2_w 117858674531870
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: invokestatic gis.hjm ()I
      // 0f: istore 4
      // 11: iload 4
      // 13: iload 3
      // 14: ifeq 55
      // 17: ifgt 53
      // 1a: goto 21
      // 1d: invokestatic q38.a (Loov;)Loov;
      // 20: athrow
      // 21: new kcc
      // 24: dup
      // 25: new java/lang/StringBuilder
      // 28: dup
      // 29: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c: sipush 8032
      // 2f: ldc2_w 8854619880987481386
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic w (IJ)Ljava/lang/String; bsm=q38.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d: iload 4
      // 3f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 42: ldc ")"
      // 44: nop
      // 45: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4b: invokespecial kcc.<init> (Ljava/lang/String;)V
      // 4e: athrow
      // 4f: invokestatic q38.a (Loov;)Loov;
      // 52: athrow
      // 53: iload 4
      // 55: ireturn
   }

   public void ns1(jn3 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic q38.a J
      // 03: ldc2_w 129715155517345
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: invokevirtual jn3.bfo ()Lblv;
      // 0c: aload 1
      // 0d: invokevirtual blv.n8m (Ljn3;)V
      // 10: invokestatic OpaquePredicate.c ()I
      // 13: aload 1
      // 14: invokevirtual jn3.t6v ()Lblv;
      // 17: aload 1
      // 18: invokevirtual blv.n8m (Ljn3;)V
      // 1b: istore 4
      // 1d: aload 1
      // 1e: invokevirtual jn3.x_a ()I
      // 21: invokestatic gis.nkp (I)V
      // 24: aload 1
      // 25: invokevirtual jn3.x_a ()I
      // 28: getstatic gis.ojo I
      // 2b: invokestatic gis.k5x (II)I
      // 2e: istore 5
      // 30: iload 4
      // 32: ifne a1
      // 35: iload 5
      // 37: ifne b3
      // 3a: goto 41
      // 3d: invokestatic q38.a (Loov;)Loov;
      // 40: athrow
      // 41: getstatic q38.igt Lorg/apache/logging/log4j/Logger;
      // 44: new java/lang/StringBuilder
      // 47: dup
      // 48: invokespecial java/lang/StringBuilder.<init> ()V
      // 4b: sipush 2994
      // 4e: ldc2_w 6805963307661631556
      // 51: lload 2
      // 52: lxor
      // 53: invokedynamic w (IJ)Ljava/lang/String; bsm=q38.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: nop
      // 59: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c: aload 1
      // 5d: invokevirtual jn3.t6v ()Lblv;
      // 60: invokevirtual blv.ik9 ()Ljava/lang/String;
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: sipush 27899
      // 69: ldc2_w 4702135711404771087
      // 6c: lload 2
      // 6d: lxor
      // 6e: invokedynamic w (IJ)Ljava/lang/String; bsm=q38.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: nop
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: aload 1
      // 78: invokevirtual jn3.bfo ()Lblv;
      // 7b: invokevirtual blv.ik9 ()Ljava/lang/String;
      // 7e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 81: sipush 2373
      // 84: ldc2_w 3645328316700762802
      // 87: lload 2
      // 88: lxor
      // 89: invokedynamic w (IJ)Ljava/lang/String; bsm=q38.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: nop
      // 8f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 92: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 95: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 9a: goto a1
      // 9d: invokestatic q38.a (Loov;)Loov;
      // a0: athrow
      // a1: getstatic q38.igt Lorg/apache/logging/log4j/Logger;
      // a4: aload 1
      // a5: invokevirtual jn3.x_a ()I
      // a8: ldc 32768
      // aa: nop
      // ab: invokestatic gis.ni_ (II)Ljava/lang/String;
      // ae: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // b3: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1693025615213307817L, -4735299754808363782L, MethodHandles.lookup().lookupClass()).a(274390593611033L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 84232774127045L;
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
      String var6 = "\u0087 6Úð¸\u0001\u009añ\u008b.Gò W\u009eE\u000eÿu\u0015ºüA0\u0098MP\u0086\u000b5Ãrò\u0099¯\u0018?èó\u007fð\u00837¥Ò\u0006\u0096ßiø;x\u0010ÜG\u001aÖ%«Å\u0085»; ÚYPôù\u0013\u001dh¤sýkl,O\u001c\u001dDB\u0092j\u001d\u009d&¨\u0016ÎÊU\u0092\n x¥»\u0018ä\u0001.6<ÒWÃ\u0016\u0095ÌDR\u0004\u0002Ðw¿$É.\bø£ï¦fó";
      int var8 = "\u0087 6Úð¸\u0001\u009añ\u008b.Gò W\u009eE\u000eÿu\u0015ºüA0\u0098MP\u0086\u000b5Ãrò\u0099¯\u0018?èó\u007fð\u00837¥Ò\u0006\u0096ßiø;x\u0010ÜG\u001aÖ%«Å\u0085»; ÚYPôù\u0013\u001dh¤sýkl,O\u001c\u001dDB\u0092j\u001d\u009d&¨\u0016ÎÊU\u0092\n x¥»\u0018ä\u0001.6<ÒWÃ\u0016\u0095ÌDR\u0004\u0002Ðw¿$É.\bø£ï¦fó"
         .length();
      char var5 = '`';
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
                     igt = LogManager.getLogger();
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

                  var6 = "\u009eP\"©ÅëÈòt$\u0002Ë3\u0093úEJu\u000eÄKÜ¾åûêoÇ\u0003\u001c\u0002\u0007`8D\u0013Ü$Ã°¶\u0092¡ó\u009f~þ°3\u000bø(\u0001²%,pÅ\u0012Û\b\u0086#\rË§\u0007Þm ×\u0007+(©\u001e\u001f\u001d\u009c¨Uÿ\u001289Ïi\u0086Ë©\u001a£ã¦Ã\u0089ÞÅ\u001c¯÷\u0097Ë\u00013U\u0083U\u0093Ì\u0083ÖßØ!ÏX\u0011\"ë9\u0006©\u0006\u008e\u0080É\u001d\u000e";
                  var8 = "\u009eP\"©ÅëÈòt$\u0002Ë3\u0093úEJu\u000eÄKÜ¾åûêoÇ\u0003\u001c\u0002\u0007`8D\u0013Ü$Ã°¶\u0092¡ó\u009f~þ°3\u000bø(\u0001²%,pÅ\u0012Û\b\u0086#\rË§\u0007Þm ×\u0007+(©\u001e\u001f\u001d\u009c¨Uÿ\u001289Ïi\u0086Ë©\u001a£ã¦Ã\u0089ÞÅ\u001c¯÷\u0097Ë\u00013U\u0083U\u0093Ì\u0083ÖßØ!ÏX\u0011\"ë9\u0006©\u0006\u008e\u0080É\u001d\u000e"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16886;
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
            throw new RuntimeException("q38", var10);
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
         throw new RuntimeException("q38" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
