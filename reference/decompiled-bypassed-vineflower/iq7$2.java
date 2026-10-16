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

public class iq7$2 implements Callable {
   public final iq7 uc5;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public iq7$2(iq7 var1) {
      this.uc5 = var1;
   }

   public String call() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic iq7$2.a J
      // 03: ldc2_w 63685542402144
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: invokestatic g4v.a68 ()Ljava/lang/String;
      // 0f: astore 4
      // 11: aload 4
      // 13: sipush 2076
      // 16: ldc2_w 7455668794516408855
      // 19: lload 1
      // 1a: lxor
      // 1b: invokedynamic u (IJ)Ljava/lang/String; bsm=iq7$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 24: iload 3
      // 25: ifeq 84
      // 28: ifne 5d
      // 2b: goto 32
      // 2e: invokestatic iq7$2.a (Loov;)Loov;
      // 31: athrow
      // 32: new java/lang/StringBuilder
      // 35: dup
      // 36: invokespecial java/lang/StringBuilder.<init> ()V
      // 39: sipush 23851
      // 3c: ldc2_w 5960480464511819555
      // 3f: lload 1
      // 40: lxor
      // 41: invokedynamic u (IJ)Ljava/lang/String; bsm=iq7$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a: aload 4
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: ldc "'"
      // 51: nop
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 58: areturn
      // 59: invokestatic iq7$2.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield iq7$2.uc5 Liq7;
      // 61: invokevirtual iq7.ltz ()Ljava/lang/String;
      // 64: astore 4
      // 66: aload 4
      // 68: iload 3
      // 69: ifeq b4
      // 6c: sipush 9154
      // 6f: ldc2_w 6318219175139516872
      // 72: lload 1
      // 73: lxor
      // 74: invokedynamic u (IJ)Ljava/lang/String; bsm=iq7$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: nop
      // 7a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7d: goto 84
      // 80: invokestatic iq7$2.a (Loov;)Loov;
      // 83: athrow
      // 84: ifne b7
      // 87: new java/lang/StringBuilder
      // 8a: dup
      // 8b: invokespecial java/lang/StringBuilder.<init> ()V
      // 8e: sipush 12919
      // 91: ldc2_w 5894127066490908792
      // 94: lload 1
      // 95: lxor
      // 96: invokedynamic u (IJ)Ljava/lang/String; bsm=iq7$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: nop
      // 9c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9f: aload 4
      // a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a4: ldc "'"
      // a6: nop
      // a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ad: goto b4
      // b0: invokestatic iq7$2.a (Loov;)Loov;
      // b3: athrow
      // b4: goto e3
      // b7: ldc c05
      // b9: nop
      // ba: invokevirtual java/lang/Class.getSigners ()[Ljava/lang/Object;
      // bd: ifnonnull d5
      // c0: sipush 27144
      // c3: ldc2_w 6136137026749884417
      // c6: lload 1
      // c7: lxor
      // c8: invokedynamic u (IJ)Ljava/lang/String; bsm=iq7$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cd: nop
      // ce: goto e3
      // d1: invokestatic iq7$2.a (Loov;)Loov;
      // d4: athrow
      // d5: sipush 7313
      // d8: ldc2_w 2252110960521092767
      // db: lload 1
      // dc: lxor
      // dd: invokedynamic u (IJ)Ljava/lang/String; bsm=iq7$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e2: nop
      // e3: areturn
   }

   @Override
   public Object call() {
      return this.call();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6903562477769320347L, 1703733352777149879L, MethodHandles.lookup().lookupClass()).a(8240278448487L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 12523488264328L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "øSKÙÀ;Ü\u0014kÓgX\u009cÕìÓ\u0010¡.Ñ|\u000e\u009e1@\u0001êÂâ Á¡\u0019@@«&´ê\"t²²þ«ÒÒ\u0014\u00995\u009d¹\u0089\u0085\u00180\u0004\u0081%×qÛTdC\u001a½é/C\u008c%ty\fÄ\u0015à\u00130\t²\u0091(Ç\u0088è!\u0018\u0090ßX\u008f@\u0017¥M\u00898*y\u0007\u0005\u0016'\u0019màR\f\u009a8âÖ#·\u001dªrâ£¥\u009f\u001bN{¸l&\u0005¦&á¸èAM¡P\rÖ\u0081(\u0096\u009aX\u0015X~\u00912s6ý\u007f";
      int var8 = "øSKÙÀ;Ü\u0014kÓgX\u009cÕìÓ\u0010¡.Ñ|\u000e\u009e1@\u0001êÂâ Á¡\u0019@@«&´ê\"t²²þ«ÒÒ\u0014\u00995\u009d¹\u0089\u0085\u00180\u0004\u0081%×qÛTdC\u001a½é/C\u008c%ty\fÄ\u0015à\u00130\t²\u0091(Ç\u0088è!\u0018\u0090ßX\u008f@\u0017¥M\u00898*y\u0007\u0005\u0016'\u0019màR\f\u009a8âÖ#·\u001dªrâ£¥\u009f\u001bN{¸l&\u0005¦&á¸èAM¡P\rÖ\u0081(\u0096\u009aX\u0015X~\u00912s6ý\u007f"
         .length();
      char var5 = 16;
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
                     c = new String[6];
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

                  var6 = "É]·£f\u0085^«ë¤TÙ\u0091\u0083Z½ÎdW\u0011ùª\\¹\u008c \u0090Ëo\u009e\u009b\\@êêÊJÐ\u0003nõU\u0080\u0012h,\u0003W\u000fùÚYö:\u007f\u008dQ Yc%×\u0017\u000eÖeê5þ\u008a¥\r¾à\u0005u\u008a\u0016ÔY×`:î¨]ðÁ\u001au\u000bóª\u0014\u0085é\u0016\u0017\u0096$d\u009b£$\u0016û^\u009dM\u0015ãaOÓ\u0015\u0001Q¤ØðÂv\u0095Ðúk\u007f\u009eO*&b\u0015ÓB4HÖÆtªíÜË1-=$°ß\u0003îø\u0083X\u001e\u0093¼è?f1Ä\u0019\u008fn~\u008a\u00adi\u0086\u000fâ\u0019¥\u001aä\u009b=×çÔxã?\u001eN\u0083\tiÛ&DpÚ÷º°@úý5\u009614\u0089ëÈt";
                  var8 = "É]·£f\u0085^«ë¤TÙ\u0091\u0083Z½ÎdW\u0011ùª\\¹\u008c \u0090Ëo\u009e\u009b\\@êêÊJÐ\u0003nõU\u0080\u0012h,\u0003W\u000fùÚYö:\u007f\u008dQ Yc%×\u0017\u000eÖeê5þ\u008a¥\r¾à\u0005u\u008a\u0016ÔY×`:î¨]ðÁ\u001au\u000bóª\u0014\u0085é\u0016\u0017\u0096$d\u009b£$\u0016û^\u009dM\u0015ãaOÓ\u0015\u0001Q¤ØðÂv\u0095Ðúk\u007f\u009eO*&b\u0015ÓB4HÖÆtªíÜË1-=$°ß\u0003îø\u0083X\u001e\u0093¼è?f1Ä\u0019\u008fn~\u008a\u00adi\u0086\u000fâ\u0019¥\u001aä\u009b=×çÔxã?\u001eN\u0083\tiÛ&DpÚ÷º°@úý5\u009614\u0089ëÈt"
                     .length();
                  var5 = 136;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31783;
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
            throw new RuntimeException("iq7$2", var10);
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
         throw new RuntimeException("iq7$2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
