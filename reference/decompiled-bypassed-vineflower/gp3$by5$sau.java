import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
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

public class gp3$by5$sau implements JsonDeserializer {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public gp3$by5 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      String var5 = this.d21(var4);
      xup var6 = this.pis(var4);
      boolean var7 = this.ehh(var4);
      int var8 = this.l9p(var4);
      return new gp3$by5(this.nke(var5), var6, var7, var8);
   }

   private gdz nke(String var1) {
      long var2 = a ^ 25519591847722L;
      gdz var4 = new gdz(var1);
      return new gdz(var4._a7(), a<"o">(16843, 5558636254184313679L ^ var2) + var4.xyp());
   }

   private boolean ehh(JsonObject var1) {
      long var2 = a ^ 3160045565899L;
      return f83.fpy(var1, a<"o">(18075, 3929382408819856637L ^ var2), false);
   }

   public xup pis(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic gp3$by5$sau.a J
      // 03: ldc2_w 124437535195887
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: ldc "x"
      // 0b: nop
      // 0c: bipush 0
      // 0d: invokestatic f83.wt9 (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 10: istore 5
      // 12: invokestatic t9d.c ()I
      // 15: aload 1
      // 16: ldc "y"
      // 18: nop
      // 19: bipush 0
      // 1a: invokestatic f83.wt9 (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 1d: istore 6
      // 1f: istore 4
      // 21: iload 5
      // 23: iload 6
      // 25: invokestatic xup.oqj (II)Lxup;
      // 28: astore 7
      // 2a: aload 7
      // 2c: iload 4
      // 2e: ifne 7f
      // 31: ifnonnull 7d
      // 34: goto 3b
      // 37: invokestatic gp3$by5$sau.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 3a: athrow
      // 3b: new com/google/gson/JsonParseException
      // 3e: dup
      // 3f: new java/lang/StringBuilder
      // 42: dup
      // 43: invokespecial java/lang/StringBuilder.<init> ()V
      // 46: sipush 12934
      // 49: ldc2_w 4503793478810801606
      // 4c: lload 2
      // 4d: lxor
      // 4e: invokedynamic o (IJ)Ljava/lang/String; bsm=gp3$by5$sau.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57: iload 5
      // 59: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5c: sipush 21503
      // 5f: ldc2_w 883362974358860987
      // 62: lload 2
      // 63: lxor
      // 64: invokedynamic o (IJ)Ljava/lang/String; bsm=gp3$by5$sau.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6d: iload 6
      // 6f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 72: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 75: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 78: athrow
      // 79: invokestatic gp3$by5$sau.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 7c: athrow
      // 7d: aload 7
      // 7f: areturn
   }

   public String d21(JsonObject var1) {
      long var2 = a ^ 25407423561293L;
      return f83.sjp(var1, a<"o">(18375, 4578225740535389216L ^ var2));
   }

   public int l9p(JsonObject var1) {
      long var2 = a ^ 110565425205019L;
      return f83.wt9(var1, a<"o">(30627, 5973073195692760340L ^ var2), 1);
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6722313127102255334L, -8202052752960664079L, MethodHandles.lookup().lookupClass()).a(13023037066734L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 71821516442650L;
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
      String var6 = "9g±ªÉ^ñêÅ'eOK\u000fîZ\u0016\u009fw\u0007Arj\u0010ý/úæÛ)®G{ïDkÞRp]2 \u001b´]8\u0091äÅ\u0006¦¸_Édï\u0010\u009bõ¤h\u009blLé=¬\u0083FÒ\u0006¸µ\u0010>Ë\u0083o\b¿ùÃ`\u00995\u0096¸â\u001d\u0010\u0010'ù\u001f,Xw¤ ý \u0089SÐö7Ä";
      int var8 = "9g±ªÉ^ñêÅ'eOK\u000fîZ\u0016\u009fw\u0007Arj\u0010ý/úæÛ)®G{ïDkÞRp]2 \u001b´]8\u0091äÅ\u0006¦¸_Édï\u0010\u009bõ¤h\u009blLé=¬\u0083FÒ\u0006¸µ\u0010>Ë\u0083o\b¿ùÃ`\u00995\u0096¸â\u001d\u0010\u0010'ù\u001f,Xw¤ ý \u0089SÐö7Ä"
         .length();
      char var5 = '8';
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

                  var6 = "\u0003]ëwý>J\u000fmif\f]c·ã\u0010p\u0005i6\u001e¨©\u000fp¦s^îYL_";
                  var8 = "\u0003]ëwý>J\u000fmif\f]c·ã\u0010p\u0005i6\u001e¨©\u000fp¦s^îYL_".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static JsonParseException a(JsonParseException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18101;
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
            throw new RuntimeException("gp3$by5$sau", var10);
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
         throw new RuntimeException("gp3$by5$sau" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
