import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class flk$tbc implements JsonDeserializer {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public flk deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      long var4 = a ^ 113667076776363L;
      JsonObject var6 = var1.getAsJsonObject();
      hej var7 = this.e4g(var3, var6, a<"u">(30669, 3346492300922475644L ^ var4));
      hej var8 = this.e4g(var3, var6, a<"u">(27702, 4263383884777312131L ^ var4));
      hej var9 = this.e4g(var3, var6, a<"u">(11868, 1281400770169245164L ^ var4));
      hej var10 = this.e4g(var3, var6, a<"u">(20280, 4115900948283550859L ^ var4));
      hej var11 = this.e4g(var3, var6, a<"u">(27136, 8061449667987851698L ^ var4));
      hej var12 = this.e4g(var3, var6, a<"u">(13582, 8629340637027276474L ^ var4));
      return new flk(var7, var8, var9, var10, var11, var12);
   }

   private hej e4g(JsonDeserializationContext param1, JsonObject param2, String param3) {
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
      // 08: ifne 2e
      // 0b: aload 3
      // 0c: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 0f: ifeq 34
      // 12: goto 19
      // 15: invokestatic flk$tbc.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: aload 2
      // 1b: aload 3
      // 1c: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1f: ldc hej
      // 21: nop
      // 22: invokeinterface com/google/gson/JsonDeserializationContext.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object; 3
      // 27: goto 2e
      // 2a: invokestatic flk$tbc.a (Loov;)Loov;
      // 2d: athrow
      // 2e: checkcast hej
      // 31: goto 37
      // 34: getstatic hej.i26 Lhej;
      // 37: areturn
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3829826069813279227L, 8640657788807637739L, MethodHandles.lookup().lookupClass()).a(38261245569075L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 33886048635999L;
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
      String var6 = "\\ìÎý\u009a¡û\"pð\u008b\u008a1 ïD a\"MR\u0099\u0094î|\u009c+\u00855Èµc\u009e0âOlðý¾\u0013$\u0081s\n\u0099\u008fLª\u0010Þ\u0017×\u008f\u0019\u0010\u0087ÞVY[\u0011X\u0096\u009ei\u0010\u0095\u008f®A\u009f\u008bÀ\u0012\u0015Ì\u0085øyô×´";
      int var8 = "\\ìÎý\u009a¡û\"pð\u008b\u008a1 ïD a\"MR\u0099\u0094î|\u009c+\u00855Èµc\u009e0âOlðý¾\u0013$\u0081s\n\u0099\u008fLª\u0010Þ\u0017×\u008f\u0019\u0010\u0087ÞVY[\u0011X\u0096\u009ei\u0010\u0095\u008f®A\u009f\u008bÀ\u0012\u0015Ì\u0085øyô×´"
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

                  var6 = "\u0081t«ÝwØ÷úSØ¸Z2\u001dÉë ·~'½!XtÔëøÑ\u0089©íw\n±Û>\u0087ð.\u008déäzk\u0095xsÎÌ";
                  var8 = "\u0081t«ÝwØ÷úSØ¸Z2\u001dÉë ·~'½!XtÔëøÑ\u0089©íw\n±Û>\u0087ð.\u008déäzk\u0095xsÎÌ".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19461;
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
            throw new RuntimeException("flk$tbc", var10);
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
         throw new RuntimeException("flk$tbc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
