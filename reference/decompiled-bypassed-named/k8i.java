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

public class k8i extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 4402601752106L;
      return b<"h">(9575, 5709859422720573340L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 12091609328300L;
      return b<"h">(24356, 8459871398071048536L ^ var2);
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
      // 00: getstatic k8i.a J
      // 03: ldc2_w 11581162351
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: arraylength
      // 0f: iload 5
      // 11: ifne 35
      // 14: ifne 2c
      // 17: goto 1e
      // 1a: invokestatic k8i.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokestatic k8i.cfc (Le7r;)Lz96;
      // 22: invokevirtual z96.d3d ()Lmew;
      // 25: astore 6
      // 27: iload 5
      // 29: ifeq 7c
      // 2c: aload 2
      // 2d: arraylength
      // 2e: goto 35
      // 31: invokestatic k8i.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 3
      // 36: if_icmpne 55
      // 39: aload 1
      // 3a: iload 5
      // 3c: ifne 74
      // 3f: goto 46
      // 42: invokestatic k8i.a (Loov;)Loov;
      // 45: athrow
      // 46: invokeinterface e7r.qha ()Lt9d; 1
      // 4b: ifnonnull 73
      // 4e: goto 55
      // 51: invokestatic k8i.a (Loov;)Loov;
      // 54: athrow
      // 55: new w57
      // 58: dup
      // 59: sipush 14197
      // 5c: ldc2_w 5549688146492971209
      // 5f: lload 3
      // 60: lxor
      // 61: invokedynamic h (IJ)Ljava/lang/String; bsm=k8i.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: nop
      // 67: bipush 0
      // 68: anewarray 46
      // 6b: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 6e: athrow
      // 6f: invokestatic k8i.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 1
      // 74: aload 2
      // 75: bipush 0
      // 76: bipush 1
      // 77: invokestatic k8i.tiq (Le7r;[Ljava/lang/String;IZ)Lmew;
      // 7a: astore 6
      // 7c: aload 1
      // 7d: invokeinterface e7r.qha ()Lt9d; 1
      // 82: aload 6
      // 84: invokevirtual OpaquePredicate.spu (Lmew;)V
      // 87: invokestatic vr1._0v ()Lvr1;
      // 8a: invokevirtual vr1.wh3 ()Lwlx;
      // 8d: new net/minecraft/network/play/server/S05PacketSpawnPosition
      // 90: dup
      // 91: aload 6
      // 93: invokespecial net/minecraft/network/play/server/S05PacketSpawnPosition.<init> (Lmew;)V
      // 96: invokevirtual wlx.v3l (Lmz2;)V
      // 99: aload 1
      // 9a: aload 0
      // 9b: sipush 4627
      // 9e: ldc2_w 3871642505223241134
      // a1: lload 3
      // a2: lxor
      // a3: invokedynamic h (IJ)Ljava/lang/String; bsm=k8i.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: nop
      // a9: bipush 3
      // aa: anewarray 46
      // ad: dup
      // ae: bipush 0
      // af: aload 6
      // b1: invokevirtual mew.getX ()I
      // b4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b7: aastore
      // b8: dup
      // b9: bipush 1
      // ba: aload 6
      // bc: invokevirtual mew.getY ()I
      // bf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c2: aastore
      // c3: dup
      // c4: bipush 2
      // c5: aload 6
      // c7: invokevirtual mew.getZ ()I
      // ca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // cd: aastore
      // ce: invokestatic k8i.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // d1: return
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: arraylength
      // 07: iload 4
      // 09: ifeq 2b
      // 0c: ifle 3f
      // 0f: goto 16
      // 12: invokestatic k8i.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 2
      // 17: iload 4
      // 19: ifeq 37
      // 1c: goto 23
      // 1f: invokestatic k8i.a (Loov;)Loov;
      // 22: athrow
      // 23: arraylength
      // 24: goto 2b
      // 27: invokestatic k8i.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 3
      // 2c: if_icmpgt 3f
      // 2f: aload 2
      // 30: goto 37
      // 33: invokestatic k8i.a (Loov;)Loov;
      // 36: athrow
      // 37: bipush 0
      // 38: aload 3
      // 39: invokestatic k8i.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 3c: goto 40
      // 3f: aconst_null
      // 40: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7864186982551329243L, 8731652175430191154L, MethodHandles.lookup().lookupClass()).a(273697748847122L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 33858459193860L;
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
      String var6 = "ç\u0013h;ää\u009c¯\u0093W~k 5OÔ\u009e\u0081\u0083\u0084E\u008c>\u0007\u0086çòíz¸\u0097\u009c6$\f\u0007CD\u0010:ðD_\u001b¦R¢Äáèsàå\u007f^h \u0084\u00ad\u008aN\u009d²·ê\u0089\u00194ÐY¼\u0092T\u000fþ\u0097\u0084\b\u009eåÈ}èV\u001b[tRÓ";
      int var8 = "ç\u0013h;ää\u009c¯\u0093W~k 5OÔ\u009e\u0081\u0083\u0084E\u008c>\u0007\u0086çòíz¸\u0097\u009c6$\f\u0007CD\u0010:ðD_\u001b¦R¢Äáèsàå\u007f^h \u0084\u00ad\u008aN\u009d²·ê\u0089\u00194ÐY¼\u0092T\u000fþ\u0097\u0084\b\u009eåÈ}èV\u001b[tRÓ"
         .length();
      char var5 = '8';
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

                  var6 = "B\u008enYØý\u0083øy\u000e44\u00064ÝùîU^\u0093^ô\u001fÖ-5HÏ\u0005KbWä\u0017¼Â\u0090\u0094q\u009föAbÏF\n¬Þ8\u008e \u0092r1ó\u0085\u0014¨jçwä8NUê\u007fêLìRl\u0013\u0012ÏÉ\u0087{nhº\tÌ\u0017Þ!|9\u009cU\u0084û\u0007õ¸\u0013ÆºÒKTg\u001foÀ";
                  var8 = "B\u008enYØý\u0083øy\u000e44\u00064ÝùîU^\u0093^ô\u001fÖ-5HÏ\u0005KbWä\u0017¼Â\u0090\u0094q\u009föAbÏF\n¬Þ8\u008e \u0092r1ó\u0085\u0014¨jçwä8NUê\u007fêLìRl\u0013\u0012ÏÉ\u0087{nhº\tÌ\u0017Þ!|9\u009cU\u0084û\u0007õ¸\u0013ÆºÒKTg\u001foÀ"
                     .length();
                  var5 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17377;
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
            throw new RuntimeException("k8i", var10);
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
         throw new RuntimeException("k8i" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
