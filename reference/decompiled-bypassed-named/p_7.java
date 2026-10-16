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

public class p_7 extends noz {
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public p_7(Entity param1, Entity param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic p_7.a J
      // 03: ldc2_w 24351927034384
      // 06: lxor
      // 07: lstore 3
      // 08: aload 0
      // 09: sipush 20442
      // 0c: ldc2_w 4613386163010518934
      // 0f: lload 3
      // 10: lxor
      // 11: invokedynamic i (IJ)Ljava/lang/String; bsm=p_7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16: nop
      // 17: invokespecial noz.<init> (Ljava/lang/String;)V
      // 1a: invokestatic OpaquePredicate.b ()I
      // 1d: aload 0
      // 1e: sipush 19046
      // 21: ldc2_w 1507388546352953899
      // 24: lload 3
      // 25: lxor
      // 26: invokedynamic i (IJ)Ljava/lang/String; bsm=p_7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: nop
      // 2c: aload 1
      // 2d: invokevirtual Entity.noc ()Ljava/lang/String;
      // 30: invokevirtual p_7.h8r (Ljava/lang/String;Ljava/lang/String;)V
      // 33: istore 5
      // 35: aload 2
      // 36: iload 5
      // 38: ifeq 63
      // 3b: ifnull 62
      // 3e: goto 45
      // 41: invokestatic p_7.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 0
      // 46: sipush 10646
      // 49: ldc2_w 6190033467107596765
      // 4c: lload 3
      // 4d: lxor
      // 4e: invokedynamic i (IJ)Ljava/lang/String; bsm=p_7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: aload 2
      // 55: invokevirtual Entity.noc ()Ljava/lang/String;
      // 58: invokevirtual p_7.h8r (Ljava/lang/String;Ljava/lang/String;)V
      // 5b: goto 62
      // 5e: invokestatic p_7.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 2
      // 63: ifnull b0
      // 66: aload 0
      // 67: new java/lang/StringBuilder
      // 6a: dup
      // 6b: invokespecial java/lang/StringBuilder.<init> ()V
      // 6e: sipush 31072
      // 71: ldc2_w 6221194055264799016
      // 74: lload 3
      // 75: lxor
      // 76: invokedynamic i (IJ)Ljava/lang/String; bsm=p_7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: nop
      // 7c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7f: aload 1
      // 80: invokevirtual Entity.noc ()Ljava/lang/String;
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: sipush 9154
      // 89: ldc2_w 5145030646768980872
      // 8c: lload 3
      // 8d: lxor
      // 8e: invokedynamic i (IJ)Ljava/lang/String; bsm=p_7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: nop
      // 94: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 97: aload 2
      // 98: invokevirtual Entity.noc ()Ljava/lang/String;
      // 9b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a1: invokevirtual p_7.p7i (Ljava/lang/String;)V
      // a4: iload 5
      // a6: ifne ee
      // a9: goto b0
      // ac: invokestatic p_7.a (Loov;)Loov;
      // af: athrow
      // b0: aload 0
      // b1: new java/lang/StringBuilder
      // b4: dup
      // b5: invokespecial java/lang/StringBuilder.<init> ()V
      // b8: sipush 7139
      // bb: ldc2_w 9098983638523112365
      // be: lload 3
      // bf: lxor
      // c0: invokedynamic i (IJ)Ljava/lang/String; bsm=p_7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5: nop
      // c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c9: aload 1
      // ca: invokevirtual Entity.noc ()Ljava/lang/String;
      // cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d0: sipush 13218
      // d3: ldc2_w 388261065109783533
      // d6: lload 3
      // d7: lxor
      // d8: invokedynamic i (IJ)Ljava/lang/String; bsm=p_7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: nop
      // de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e4: invokevirtual p_7.p7i (Ljava/lang/String;)V
      // e7: goto ee
      // ea: invokestatic p_7.a (Loov;)Loov;
      // ed: athrow
      // ee: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3927562402460831106L, 2704755456179230179L, MethodHandles.lookup().lookupClass()).a(98040284872119L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 92823782192498L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "tß\u0012Cºå\u0089-QC\f\u0099ùäÑÙ\u009caYIÜ\u0017BwÅ8Ùá\u0004ÓÛø aQì8\bç\u000bh+±¼\u0000EÞ\u0006\u0013q\u008b·i_¬Ý!÷¤´PZG\u0007® _:}0³.,\\¬÷©\u008b\u0080Cö±\u0081\u0091\u0085:Bb;Ù46f*-§Q \u0010XæÇ#\u0005d\u001d}ãüÕº \u009d\u007f\u0000\u0010 ¤)|]\u0001.f)\u0015$èú>i\u009b";
      int var8 = "tß\u0012Cºå\u0089-QC\f\u0099ùäÑÙ\u009caYIÜ\u0017BwÅ8Ùá\u0004ÓÛø aQì8\bç\u000bh+±¼\u0000EÞ\u0006\u0013q\u008b·i_¬Ý!÷¤´PZG\u0007® _:}0³.,\\¬÷©\u008b\u0080Cö±\u0081\u0091\u0085:Bb;Ù46f*-§Q \u0010XæÇ#\u0005d\u001d}ãüÕº \u009d\u007f\u0000\u0010 ¤)|]\u0001.f)\u0015$èú>i\u009b"
         .length();
      char var5 = ' ';
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
                     f = var9;
                     g = new String[7];
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

                  var6 = "rñ¸ú-D*_b\u0083ªk*\u0016Åmdmöx\u008aÚ'B¸N\u0016\u0002w\u0091q\u008eí5\u0012ÌªÊZq\u0018°ÚÍ/ðS\u0088\u0005oJÀ4¢µ´2Ð\u00ad\u0083\u0017[{°ú";
                  var8 = "rñ¸ú-D*_b\u0083ªk*\u0016Åmdmöx\u008aÚ'B¸N\u0016\u0002w\u0091q\u008eí5\u0012ÌªÊZq\u0018°ÚÍ/ðS\u0088\u0005oJÀ4¢µ´2Ð\u00ad\u0083\u0017[{°ú"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14118;
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
            throw new RuntimeException("p_7", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("p_7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
