import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class weu extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 18332389599910L;
      return b<"v">(20479, 5708094923237756430L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 33337872135712L;
      return b<"v">(12862, 3464147606564974410L ^ var2);
   }

   @Override
   public void l3z(e7r var1, String[] var2) {
      long var3 = a ^ 22745783476195L;
      int var5 = OpaquePredicate.b();
      if (var2.length == 0) {
         z96 var6 = cfc(var1);
         var6.aqu();
         wxl(var1, this, b<"v">(8723, 1038942293881427621L ^ var3), new Object[]{var6.xyw()});
         if (var5 != 0) {
            return;
         }
      }

      EntityLivingBase var7 = kot(var1, var2[0]);
      var7.aqu();
      wxl(var1, this, b<"v">(139, 3686325252164662334L ^ var3), new Object[]{var7.xyw()});
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = OpaquePredicate.c();

      try {
         if (var3 != 0) {
            return (boolean)var2;
         }

         if (var2 == 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifne 1f
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmpne 2b
      // 10: goto 17
      // 13: invokestatic weu.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic weu.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 25: invokestatic weu.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1228256711629194498L, 5166769881276242796L, MethodHandles.lookup().lookupClass()).a(68714145369800L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 3514266480927L;
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
      String var6 = "c[±\u009cÀgö\u0098\u0017^-m\u000f\u0006\u0094»Ëì¾\u0098¼'rUl¸ñ\\ÕAòÅ]ÅÈ\u0010\u0002\u0084¸Ôv.\u0087i\u008c±+\u0007(\u008bÏ×ü·\u0000@\u0099\u000e\u0013¸÷í·¿\u0013QNd\u0086S¾½1m\u0091=fa:@Y)J\u0002°\u0006ÐÓ\b";
      int var8 = "c[±\u009cÀgö\u0098\u0017^-m\u000f\u0006\u0094»Ëì¾\u0098¼'rUl¸ñ\\ÕAòÅ]ÅÈ\u0010\u0002\u0084¸Ôv.\u0087i\u008c±+\u0007(\u008bÏ×ü·\u0000@\u0099\u000e\u0013¸÷í·¿\u0013QNd\u0086S¾½1m\u0091=fa:@Y)J\u0002°\u0006ÐÓ\b"
         .length();
      char var5 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     g = new String[4];
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

                  var6 = "ëKînð¨ì\u0018qV8fß»,10í\u00958\u008b¾g*bçÉàOÊÞ\"\u0007»/\n\u008bp,[\u001a9ð´\u001cxH $à;\u009dÒçÉ\u008a¥\u0001çÐ£5EÁ\u008c";
                  var8 = "ëKînð¨ì\u0018qV8fß»,10í\u00958\u008b¾g*bçÉàOÊÞ\"\u0007»/\n\u008bp,[\u001a9ð´\u001cxH $à;\u009dÒçÉ\u008a¥\u0001çÐ£5EÁ\u008c".length();
                  var5 = 16;
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

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6376;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("weu", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("weu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
