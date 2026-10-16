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

public class voj extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 43257713256145L;
      return b<"r">(32335, 2040717332159423639L ^ var1);
   }

   @Override
   public int bag() {
      return 3;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 45810040879703L;
      return b<"r">(22406, 7100194219224633819L ^ var2);
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
      // 00: getstatic voj.a J
      // 03: ldc2_w 38843774931860
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: arraylength
      // 0f: iload 5
      // 11: ifeq 2c
      // 14: bipush 1
      // 15: if_icmpne a5
      // 18: goto 1f
      // 1b: invokestatic voj.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 2
      // 20: bipush 0
      // 21: aaload
      // 22: invokevirtual java/lang/String.length ()I
      // 25: goto 2c
      // 28: invokestatic voj.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifle a5
      // 2f: invokestatic vr1._0v ()Lvr1;
      // 32: astore 6
      // 34: aload 6
      // 36: invokevirtual vr1.wh3 ()Lwlx;
      // 39: invokevirtual wlx.mz1 ()Lody;
      // 3c: aload 2
      // 3d: bipush 0
      // 3e: aaload
      // 3f: invokevirtual ody._53 (Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;
      // 42: astore 7
      // 44: iload 5
      // 46: ifeq a0
      // 49: aload 7
      // 4b: ifnonnull 79
      // 4e: goto 55
      // 51: invokestatic voj.a (Loov;)Loov;
      // 54: athrow
      // 55: new uvb
      // 58: dup
      // 59: sipush 21637
      // 5c: ldc2_w 2353803130008746777
      // 5f: lload 3
      // 60: lxor
      // 61: invokedynamic r (IJ)Ljava/lang/String; bsm=voj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: nop
      // 67: bipush 1
      // 68: anewarray 56
      // 6b: dup
      // 6c: bipush 0
      // 6d: aload 2
      // 6e: bipush 0
      // 6f: aaload
      // 70: aastore
      // 71: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 74: athrow
      // 75: invokestatic voj.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 6
      // 7b: invokevirtual vr1.wh3 ()Lwlx;
      // 7e: aload 7
      // 80: invokevirtual wlx.azz (Lcom/mojang/authlib/GameProfile;)V
      // 83: aload 1
      // 84: aload 0
      // 85: sipush 14654
      // 88: ldc2_w 3682367459638990503
      // 8b: lload 3
      // 8c: lxor
      // 8d: invokedynamic r (IJ)Ljava/lang/String; bsm=voj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: nop
      // 93: bipush 1
      // 94: anewarray 56
      // 97: dup
      // 98: bipush 0
      // 99: aload 2
      // 9a: bipush 0
      // 9b: aaload
      // 9c: aastore
      // 9d: invokestatic voj.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // a0: iload 5
      // a2: ifne c3
      // a5: new w57
      // a8: dup
      // a9: sipush 29590
      // ac: ldc2_w 6358876801305648137
      // af: lload 3
      // b0: lxor
      // b1: invokedynamic r (IJ)Ljava/lang/String; bsm=voj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6: nop
      // b7: bipush 0
      // b8: anewarray 56
      // bb: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // be: athrow
      // bf: invokestatic voj.a (Loov;)Loov;
      // c2: athrow
      // c3: return
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifne 1f
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmpne 2e
      // 10: goto 17
      // 13: invokestatic voj.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic voj.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: invokevirtual vr1.wh3 ()Lwlx;
      // 25: invokevirtual wlx.f5p ()[Ljava/lang/String;
      // 28: invokestatic voj.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 2b: goto 2f
      // 2e: aconst_null
      // 2f: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5890890983540523232L, 5711721462154921608L, MethodHandles.lookup().lookupClass()).a(120726545743422L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 134871819227641L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "\u0087º]ù8ÍTY\u00adÂnxCoo\u0014(}ú`l\u0091äÙ#>IC\u009dv\u001c\u0014*\f«9\n¶î\u0006\u0005\u0010\\¤î)$\u0001\u0007ÅË\u000e4ðGÔ²(´¤ôaã\u001bdºãÛµCX\u00003]Y\u001d\u0005@!ÓU\u0082Æú6\u0007Ìàîö\u000e\u001e\u0010ÛÖWv;";
      int var8 = "\u0087º]ù8ÍTY\u00adÂnxCoo\u0014(}ú`l\u0091äÙ#>IC\u009dv\u001c\u0014*\f«9\n¶î\u0006\u0005\u0010\\¤î)$\u0001\u0007ÅË\u000e4ðGÔ²(´¤ôaã\u001bdºãÛµCX\u00003]Y\u001d\u0005@!ÓU\u0082Æú6\u0007Ìàîö\u000e\u001e\u0010ÛÖWv;"
         .length();
      char var5 = 16;
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
                     g = new String[5];
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

                  var6 = "½\b+çÑÀ80ZwX²frÎò\u000b<\u0082z¨\u0092FoÊÎgÿP\u001dÖÎÊ\u0016,|\u0011\u0011ä2Õ<\\º88>\u0093(\u008b\u009b\u000fÜß\u0099\u009a2\u0016º´i\u0097ú\u001fÏtû¬ÝÐ=Ç\u0004¨\u0017+\u0014vÒ\u001fRÂ\u0005ÇÅ\u008aÇ\u00100";
                  var8 = "½\b+çÑÀ80ZwX²frÎò\u000b<\u0082z¨\u0092FoÊÎgÿP\u001dÖÎÊ\u0016,|\u0011\u0011ä2Õ<\\º88>\u0093(\u008b\u009b\u000fÜß\u0099\u009a2\u0016º´i\u0097ú\u001fÏtû¬ÝÐ=Ç\u0004¨\u0017+\u0014vÒ\u001fRÂ\u0005ÇÅ\u008aÇ\u00100"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17347;
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
            throw new RuntimeException("voj", var10);
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
         throw new RuntimeException("voj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
