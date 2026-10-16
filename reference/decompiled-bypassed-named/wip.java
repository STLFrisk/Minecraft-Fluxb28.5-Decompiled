import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wip {
   public static final gdz w2n;
   public static final gdz i2b;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static gdz s_2() {
      return w2n;
   }

   public static gdz lnt(UUID var0) {
      try {
         if (mxk(var0)) {
            return i2b;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return w2n;
   }

   public static String nq_(UUID var0) {
      long var1 = a ^ 45564971431172L;

      try {
         if (mxk(var0)) {
            return a<"l">(16553, 4746349499027194791L ^ var1);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return a<"l">(20080, 3378787341407325564L ^ var1);
   }

   private static boolean mxk(UUID param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual java/util/UUID.hashCode ()I
      // 08: bipush 1
      // 09: iand
      // 0a: iload 1
      // 0b: ifeq 21
      // 0e: bipush 1
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic wip.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic wip.a (Loov;)Loov;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3155668262120100572L, 5932549700740223952L, MethodHandles.lookup().lookupClass()).a(252477571708409L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 8418098973481L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "³Ó3Ã'£SÀ¶\u001aãi®XÝõ'<Æ\u0084\tÉÛBÚ ¹ÌÎ\\\u0093b\u0099\u0010 \u008a{\u0080ò\u0019P×\u0085\u0089\u000b\u0082æÇË\u0089.\u0085L_!Â\u0010\u0095·¬¤\u0005|`øó¤²Y©Ì\u0004Ö";
      int var6 = "³Ó3Ã'£SÀ¶\u001aãi®XÝõ'<Æ\u0084\tÉÛBÚ ¹ÌÎ\\\u0093b\u0099\u0010 \u008a{\u0080ò\u0019P×\u0085\u0089\u000b\u0082æÇË\u0089.\u0085L_!Â\u0010\u0095·¬¤\u0005|`øó¤²Y©Ì\u0004Ö"
         .length();
      char var3 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[4];
                     w2n = new gdz(a<"l">(19944, 943970644067037384L ^ var9));
                     i2b = new gdz(a<"l">(29776, 1115971832930929010L ^ var9));
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "ô×`Ð`\u0084\t]îú\u0000\u0088ÿ\u0094\u0018\u0017\u0001üQ\u008aÁÅü\u0015¡Àí\u0095\u0088\u0007\u0092çKr¸³qÏÐh\u0099ÞÙ\u0096¹Ô\u008bE\u00103Ð\u0001X#ñXö\u008bf\u0081ËKìRõ";
                  var6 = "ô×`Ð`\u0084\t]îú\u0000\u0088ÿ\u0094\u0018\u0017\u0001üQ\u008aÁÅü\u0015¡Àí\u0095\u0088\u0007\u0092çKr¸³qÏÐh\u0099ÞÙ\u0096¹Ô\u008bE\u00103Ð\u0001X#ñXö\u008bf\u0081ËKìRõ"
                     .length();
                  var3 = '0';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11558;
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
            throw new RuntimeException("wip", var10);
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
         throw new RuntimeException("wip" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
