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

public class ln1 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 7078253535755L;
      return b<"x">(2123, 3126864883701965098L ^ var1);
   }

   @Override
   public int bag() {
      return 3;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 9407242894989L;
      return b<"x">(4098, 2241743181215344103L ^ var2);
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
      // 00: getstatic ln1.a J
      // 03: ldc2_w 2695981193038
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: arraylength
      // 0f: iload 5
      // 11: ifeq 44
      // 14: bipush 1
      // 15: if_icmpeq 3d
      // 18: goto 1f
      // 1b: invokestatic ln1.a (Loov;)Loov;
      // 1e: athrow
      // 1f: new w57
      // 22: dup
      // 23: sipush 31648
      // 26: ldc2_w 3435288912311150469
      // 29: lload 3
      // 2a: lxor
      // 2b: invokedynamic x (IJ)Ljava/lang/String; bsm=ln1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: nop
      // 31: bipush 0
      // 32: anewarray 30
      // 35: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 38: athrow
      // 39: invokestatic ln1.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 2
      // 3e: bipush 0
      // 3f: aaload
      // 40: bipush 0
      // 41: invokestatic ln1.o_t (Ljava/lang/String;I)I
      // 44: istore 6
      // 46: invokestatic vr1._0v ()Lvr1;
      // 49: iload 6
      // 4b: invokevirtual vr1.drf (I)V
      // 4e: aload 1
      // 4f: aload 0
      // 50: bipush 102
      // 52: ldc2_w 3127004716238937153
      // 55: lload 3
      // 56: lxor
      // 57: invokedynamic x (IJ)Ljava/lang/String; bsm=ln1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: nop
      // 5d: bipush 1
      // 5e: anewarray 30
      // 61: dup
      // 62: bipush 0
      // 63: iload 6
      // 65: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 68: aastore
      // 69: invokestatic ln1.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 6c: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8229785510077027724L, 8831920332032857907L, MethodHandles.lookup().lookupClass()).a(140450728449891L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 22668519362767L;
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
      String var6 = "ò\u0094vîÞ\u008bT\u001e)\u001aµ\u009fïS{\u009b\u009b\u0096\u0016*\u0015\u000bwzjI6Í\rí\u0082Qx,É\u0018)\u0019É\u001aß\u0081\u0004\u0012<J¶68\u0017\u0004æ¸\u0080Xª\u0090\u001a3²\u0013ÜÆÙUI\u008bEø\u000e\u0013\u00ad\u0090Aë.Ç\u00109\u0015)\u0012\u0091\u0084\u008fZNÑ«\u0080\u0096X£(äÎðiz*\u0098¯\"9\u0093";
      int var8 = "ò\u0094vîÞ\u008bT\u001e)\u001aµ\u009fïS{\u009b\u009b\u0096\u0016*\u0015\u000bwzjI6Í\rí\u0082Qx,É\u0018)\u0019É\u001aß\u0081\u0004\u0012<J¶68\u0017\u0004æ¸\u0080Xª\u0090\u001a3²\u0013ÜÆÙUI\u008bEø\u000e\u0013\u00ad\u0090Aë.Ç\u00109\u0015)\u0012\u0091\u0084\u008fZNÑ«\u0080\u0096X£(äÎðiz*\u0098¯\"9\u0093"
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

                  var6 = "\u001fKsóp\u008aî©Ùw»'yå§Òþ¡\u0089Ã^\fE\u0000%õÍÕ\u009b\"óÚUÅÞHºç/\u0085àðD\u0011)\u0011\u008cï l&\u008b\u0014\u0082Ï@þ\"\u0018zýí\u0080húÕR\u0085\u0080\u0018\u0088\u0007Ko1\u009eý\u000bh é";
                  var8 = "\u001fKsóp\u008aî©Ùw»'yå§Òþ¡\u0089Ã^\fE\u0000%õÍÕ\u009b\"óÚUÅÞHºç/\u0085àðD\u0011)\u0011\u008cï l&\u008b\u0014\u0082Ï@þ\"\u0018zýí\u0080húÕR\u0085\u0080\u0018\u0088\u0007Ko1\u009eý\u000bh é"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12409;
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
            throw new RuntimeException("ln1", var10);
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
         throw new RuntimeException("ln1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
