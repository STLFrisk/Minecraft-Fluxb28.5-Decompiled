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

public class a6v extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 88596971942074L;
      return b<"c">(29522, 8686709570336976423L ^ var1);
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 103810779130940L;
      return b<"c">(3888, 7745944914880319169L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic a6v.a J
      // 03: ldc2_w 93010381735423
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: invokestatic vr1._0v ()Lvr1;
      // 10: getstatic h50$f05.pwg Lh50$f05;
      // 13: bipush 0
      // 14: invokevirtual vr1.mb5 (Lh50$f05;Z)Ljava/lang/String;
      // 17: astore 6
      // 19: iload 5
      // 1b: ifne 4d
      // 1e: aload 6
      // 20: ifnull 52
      // 23: goto 2a
      // 26: invokestatic a6v.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 1
      // 2b: aload 0
      // 2c: sipush 8131
      // 2f: ldc2_w 4270824683895584754
      // 32: lload 3
      // 33: lxor
      // 34: invokedynamic c (IJ)Ljava/lang/String; bsm=a6v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: bipush 1
      // 3b: anewarray 43
      // 3e: dup
      // 3f: bipush 0
      // 40: aload 6
      // 42: aastore
      // 43: invokestatic a6v.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 46: goto 4d
      // 49: invokestatic a6v.a (Loov;)Loov;
      // 4c: athrow
      // 4d: iload 5
      // 4f: ifeq 70
      // 52: aload 1
      // 53: aload 0
      // 54: sipush 30698
      // 57: ldc2_w 2567034505649561561
      // 5a: lload 3
      // 5b: lxor
      // 5c: invokedynamic c (IJ)Ljava/lang/String; bsm=a6v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: bipush 0
      // 63: anewarray 43
      // 66: invokestatic a6v.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 69: goto 70
      // 6c: invokestatic a6v.a (Loov;)Loov;
      // 6f: athrow
      // 70: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3757643842057221606L, 8178969900601767866L, MethodHandles.lookup().lookupClass()).a(19849261696234L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 97780730989084L;
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
      String var6 = "\u0095\u0091ð«Ñ·C\u001dª,\u00ad$~ÖÅ¼Ó\u0002ëkK\u009e &\u009dL°Þ\u0017à\t:?ÊÔ'ô?\u0099\u001d(\u001e\u0084\u0099\u000486m\u0011Jê  )\u0012\u00887|BÓ»Ìj®Æ\u0004\u001aJL:îW\u008fWa\u008f\nÄ~«i";
      int var8 = "\u0095\u0091ð«Ñ·C\u001dª,\u00ad$~ÖÅ¼Ó\u0002ëkK\u009e &\u009dL°Þ\u0017à\t:?ÊÔ'ô?\u0099\u001d(\u001e\u0084\u0099\u000486m\u0011Jê  )\u0012\u00887|BÓ»Ìj®Æ\u0004\u001aJL:îW\u008fWa\u008f\nÄ~«i"
         .length();
      char var5 = '(';
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

                  var6 = "¦¹\u0080K@wS&\u001fl\u0093)\u001cä)Z0å×¿Ç¬îhì%bÈT\"Á\u008fÐ¥k\u009e\u0091~dÕ\u0003í\u00132g!\u0096\u001ay\u009cW\u0006KKH³Ö\u0087\u0004\u0089¤\u0000»\u008dy";
                  var8 = "¦¹\u0080K@wS&\u001fl\u0093)\u001cä)Z0å×¿Ç¬îhì%bÈT\"Á\u008fÐ¥k\u009e\u0091~dÕ\u0003í\u00132g!\u0096\u001ay\u009cW\u0006KKH³Ö\u0087\u0004\u0089¤\u0000»\u008dy"
                     .length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17516;
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
            throw new RuntimeException("a6v", var10);
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
         throw new RuntimeException("a6v" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
