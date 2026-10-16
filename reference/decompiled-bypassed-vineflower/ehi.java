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

public class ehi extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 21429522308442L;
      return b<"h">(1508, 33168571053319763L ^ var1);
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 32449292124636L;
      return b<"h">(2301, 1305690817814230991L ^ var2);
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
      // 00: getstatic ehi.a J
      // 03: ldc2_w 25833403672607
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic vr1._0v ()Lvr1;
      // 0b: astore 6
      // 0d: bipush 0
      // 0e: istore 7
      // 10: invokestatic t9d.b ()I
      // 13: bipush 0
      // 14: istore 8
      // 16: istore 5
      // 18: iload 8
      // 1a: aload 6
      // 1c: getfield vr1.p_y [Ldug;
      // 1f: arraylength
      // 20: if_icmpge 7c
      // 23: aload 6
      // 25: iload 5
      // 27: ifeq 89
      // 2a: getfield vr1.p_y [Ldug;
      // 2d: iload 8
      // 2f: aaload
      // 30: iload 5
      // 32: ifeq 55
      // 35: goto 3c
      // 38: invokestatic ehi.a (Loov;)Loov;
      // 3b: athrow
      // 3c: ifnull 74
      // 3f: goto 46
      // 42: invokestatic ehi.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 6
      // 48: getfield vr1.p_y [Ldug;
      // 4b: iload 8
      // 4d: aaload
      // 4e: goto 55
      // 51: invokestatic ehi.a (Loov;)Loov;
      // 54: athrow
      // 55: astore 9
      // 57: iload 5
      // 59: ifeq 77
      // 5c: aload 9
      // 5e: getfield dug.b4a Z
      // 61: ifeq 74
      // 64: goto 6b
      // 67: invokestatic ehi.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 9
      // 6d: bipush 0
      // 6e: putfield dug.b4a Z
      // 71: bipush 1
      // 72: istore 7
      // 74: iinc 8 1
      // 77: iload 5
      // 79: ifne 18
      // 7c: iload 7
      // 7e: ifeq a4
      // 81: aload 1
      // 82: goto 89
      // 85: invokestatic ehi.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 0
      // 8a: sipush 6764
      // 8d: ldc2_w 449866327316090012
      // 90: lload 3
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=ehi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: nop
      // 98: bipush 0
      // 99: anewarray 42
      // 9c: invokestatic ehi.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 9f: iload 5
      // a1: ifne c2
      // a4: new uvb
      // a7: dup
      // a8: sipush 15205
      // ab: ldc2_w 5774071292763172246
      // ae: lload 3
      // af: lxor
      // b0: invokedynamic h (IJ)Ljava/lang/String; bsm=ehi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: nop
      // b6: bipush 0
      // b7: anewarray 42
      // ba: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // bd: athrow
      // be: invokestatic ehi.a (Loov;)Loov;
      // c1: athrow
      // c2: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4051049875275267924L, 577765197272296162L, MethodHandles.lookup().lookupClass()).a(160972872481109L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 130096185846731L;
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
      String var6 = "2Øg\u0000ÿ\u0019ZvÒµÌ\u001cOê\u008e'8CÌïR?\u0094\u009e£UÕ\u009aFwæ\u0095\reë`Ì\u0081{«¹\u009e«¼\u0098´Ä\"\u0007Î`ûR,Ï\u008dwï\u000fA4`ü\u0087Æp`\u0096e±ÝêÄ";
      int var8 = "2Øg\u0000ÿ\u0019ZvÒµÌ\u001cOê\u008e'8CÌïR?\u0094\u009e£UÕ\u009aFwæ\u0095\reë`Ì\u0081{«¹\u009e«¼\u0098´Ä\"\u0007Î`ûR,Ï\u008dwï\u000fA4`ü\u0087Æp`\u0096e±ÝêÄ"
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

                  var6 = "\u008ag·\u0084Ø\u0096ÃO\nk\u009a,_\u0081\u008eym\u001dÿ¿¤\u00913¬A\f~ÃDº\\{Âë[!\u0080z\u0004ð(°\u00189I\u009eRH@R\u009c#¨ÀÆ\u001fu\u0003Í\u009eDx\nãÏ¯\u0091¸\u0003ÞmÔìçü\rÞ@eñ\u0080";
                  var8 = "\u008ag·\u0084Ø\u0096ÃO\nk\u009a,_\u0081\u008eym\u001dÿ¿¤\u00913¬A\f~ÃDº\\{Âë[!\u0080z\u0004ð(°\u00189I\u009eRH@R\u009c#¨ÀÆ\u001fu\u0003Í\u009eDx\nãÏ¯\u0091¸\u0003ÞmÔìçü\rÞ@eñ\u0080"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31404;
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
            throw new RuntimeException("ehi", var10);
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
         throw new RuntimeException("ehi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
