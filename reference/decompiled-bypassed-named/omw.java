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

public class omw extends pp0 {
   private static final long a;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 71443081340037L;
      return c<"s">(10157, 8626262936608937835L ^ var1);
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 85780712880131L;
      return c<"s">(8615, 8640916067857976805L ^ var2);
   }

   @Override
   public void l3z(e7r var1, String[] var2) {
      long var3 = a ^ 75838900261312L;

      try {
         if (var2.length <= 0) {
            throw new w57(c<"s">(15670, 170293153321810100L ^ var3), new Object[0]);
         }
      } catch (oov var6) {
         throw a(var6);
      }

      h50$f05 var5 = this.vmo(var1, var2[0]);
      this.cwv(var5);
      wxl(var1, this, c<"s">(30318, 1746220618214650857L ^ var3), new Object[]{new hsu(c<"s">(31105, 3853845283163323393L ^ var3) + var5.bw5(), new Object[0])});
   }

   public void cwv(h50$f05 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic vr1._0v ()Lvr1;
      // 03: astore 3
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 3
      // 08: aload 1
      // 09: invokevirtual vr1.nd0 (Lh50$f05;)V
      // 0c: istore 2
      // 0d: aload 3
      // 0e: iload 2
      // 0f: ifne 29
      // 12: invokevirtual vr1.tn9 ()Z
      // 15: ifeq 5c
      // 18: goto 1f
      // 1b: invokestatic omw.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: goto 29
      // 25: invokestatic omw.a (Loov;)Loov;
      // 28: athrow
      // 29: invokevirtual vr1.wh3 ()Lwlx;
      // 2c: invokevirtual wlx.tjx ()Ljava/util/List;
      // 2f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 34: astore 4
      // 36: aload 4
      // 38: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3d: ifeq 5c
      // 40: aload 4
      // 42: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 47: checkcast z96
      // 4a: astore 5
      // 4c: aload 5
      // 4e: aload 1
      // 4f: invokevirtual z96.bci (Lh50$f05;)V
      // 52: aload 5
      // 54: fconst_0
      // 55: putfield z96.o_8 F
      // 58: iload 2
      // 59: ifeq 36
      // 5c: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4997523288163550217L, -6098565018501951706L, MethodHandles.lookup().lookupClass()).a(42318920346229L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 9044300990486L;
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
      String var6 = "Ê\u009eß\u0097¥\\ò\f\u0094\u0096%_\u0091j\u0092+\u0097Ou÷ÑÏ\u0002ß¿Ùv\u001dÚ}\u0094¾0¼{ùã\u008c\u0095ìÑ\u0090>\u0090[RFYÈ!=^\u0003.»Lô¯ÏýQ\u000fÉÑÕAò\u009cèò\u008f`ãþº\u00adæÇ\u009eL\u00930»ó\u0095GMÛØÎ\u0080Iñx\u0092À\u0007\u0010\u0004qUtC9/XD6\u0090è~ò!\u0082^ñæ1Ò'\f§\u009cÍ©\u0005Êmrd";
      int var8 = "Ê\u009eß\u0097¥\\ò\f\u0094\u0096%_\u0091j\u0092+\u0097Ou÷ÑÏ\u0002ß¿Ùv\u001dÚ}\u0094¾0¼{ùã\u008c\u0095ìÑ\u0090>\u0090[RFYÈ!=^\u0003.»Lô¯ÏýQ\u000fÉÑÕAò\u009cèò\u008f`ãþº\u00adæÇ\u009eL\u00930»ó\u0095GMÛØÎ\u0080Iñx\u0092À\u0007\u0010\u0004qUtC9/XD6\u0090è~ò!\u0082^ñæ1Ò'\f§\u009cÍ©\u0005Êmrd"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     j = var9;
                     k = new String[5];
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

                  var6 = "\u0093\u008f\u0015\n\u0016\u0098â\r>iýÇ\u0088W÷\"ÒÜR'¸8Ô¢@\u0006Gøèî\tGÒBÅx\u0099s\u0091ãu\u001cÃ\u007f0#\u000f\u0084f\ríÝ1\u0091¶æéJó\u0092\u001fÒÖ·²¾ùÅ\u0099\u009b\u008d=®\u0011¿<\u009aGZå @\u008fÑ\u0088Ó?\u0017º";
                  var8 = "\u0093\u008f\u0015\n\u0016\u0098â\r>iýÇ\u0088W÷\"ÒÜR'¸8Ô¢@\u0006Gøèî\tGÒBÅx\u0099s\u0091ãu\u001cÃ\u007f0#\u000f\u0084f\ríÝ1\u0091¶æéJó\u0092\u001fÒÖ·²¾ùÅ\u0099\u009b\u008d=®\u0011¿<\u009aGZå @\u008fÑ\u0088Ó?\u0017º"
                     .length();
                  var5 = 24;
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

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27101;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("omw", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("omw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
