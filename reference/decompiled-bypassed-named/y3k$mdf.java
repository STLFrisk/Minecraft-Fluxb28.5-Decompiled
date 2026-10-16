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

public class y3k$mdf implements JsonDeserializer {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public y3k deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      float[] var5 = this.okm(var4);
      int var6 = this.lzm(var4);
      return new y3k(var5, var6);
   }

   public int lzm(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic y3k$mdf.a J
      // 03: ldc2_w 49467626830084
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: sipush 8684
      // 11: ldc2_w 8543089875064374348
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic g (IJ)Ljava/lang/String; bsm=y3k$mdf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: bipush 0
      // 1d: invokestatic f83.wt9 (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 20: istore 5
      // 22: iload 5
      // 24: iload 4
      // 26: ifeq 3f
      // 29: iflt 74
      // 2c: goto 33
      // 2f: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 32: athrow
      // 33: iload 5
      // 35: bipush 90
      // 37: irem
      // 38: goto 3f
      // 3b: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 3e: athrow
      // 3f: iload 4
      // 41: ifeq 5a
      // 44: ifne 74
      // 47: goto 4e
      // 4a: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 4d: athrow
      // 4e: iload 5
      // 50: bipush 90
      // 52: idiv
      // 53: goto 5a
      // 56: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 59: athrow
      // 5a: iload 4
      // 5c: ifeq 73
      // 5f: bipush 3
      // 60: if_icmpgt 74
      // 63: goto 6a
      // 66: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 69: athrow
      // 6a: iload 5
      // 6c: goto 73
      // 6f: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 72: athrow
      // 73: ireturn
      // 74: new com/google/gson/JsonParseException
      // 77: dup
      // 78: new java/lang/StringBuilder
      // 7b: dup
      // 7c: invokespecial java/lang/StringBuilder.<init> ()V
      // 7f: sipush 23095
      // 82: ldc2_w 5083774070443687830
      // 85: lload 2
      // 86: lxor
      // 87: invokedynamic g (IJ)Ljava/lang/String; bsm=y3k$mdf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: nop
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: iload 5
      // 92: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 95: sipush 24480
      // 98: ldc2_w 5782794598355810819
      // 9b: lload 2
      // 9c: lxor
      // 9d: invokedynamic g (IJ)Ljava/lang/String; bsm=y3k$mdf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: nop
      // a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a9: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // ac: athrow
   }

   private float[] okm(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic y3k$mdf.a J
      // 03: ldc2_w 134712234025180
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: sipush 8228
      // 11: ldc2_w 8400931411869883481
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic g (IJ)Ljava/lang/String; bsm=y3k$mdf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: iload 4
      // 1e: ifeq 43
      // 21: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 24: ifne 34
      // 27: goto 2e
      // 2a: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2d: athrow
      // 2e: aconst_null
      // 2f: areturn
      // 30: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 33: athrow
      // 34: aload 1
      // 35: sipush 26685
      // 38: ldc2_w 4944179498136835143
      // 3b: lload 2
      // 3c: lxor
      // 3d: invokedynamic g (IJ)Ljava/lang/String; bsm=y3k$mdf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: nop
      // 43: invokestatic f83.k68 (Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 46: astore 5
      // 48: aload 5
      // 4a: invokevirtual com/google/gson/JsonArray.size ()I
      // 4d: iload 4
      // 4f: ifeq 8d
      // 52: bipush 4
      // 53: if_icmpeq 8c
      // 56: goto 5d
      // 59: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 5c: athrow
      // 5d: new com/google/gson/JsonParseException
      // 60: dup
      // 61: new java/lang/StringBuilder
      // 64: dup
      // 65: invokespecial java/lang/StringBuilder.<init> ()V
      // 68: sipush 1139
      // 6b: ldc2_w 513261426338166796
      // 6e: lload 2
      // 6f: lxor
      // 70: invokedynamic g (IJ)Ljava/lang/String; bsm=y3k$mdf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: nop
      // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 79: aload 5
      // 7b: invokevirtual com/google/gson/JsonArray.size ()I
      // 7e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 81: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 84: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 87: athrow
      // 88: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 8b: athrow
      // 8c: bipush 4
      // 8d: newarray 6
      // 8f: astore 6
      // 91: bipush 0
      // 92: istore 7
      // 94: iload 7
      // 96: aload 6
      // 98: arraylength
      // 99: if_icmpge e3
      // 9c: aload 6
      // 9e: iload 4
      // a0: ifeq e5
      // a3: iload 7
      // a5: aload 5
      // a7: iload 7
      // a9: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // ac: new java/lang/StringBuilder
      // af: dup
      // b0: invokespecial java/lang/StringBuilder.<init> ()V
      // b3: bipush 1
      // b4: ldc2_w 7649437722555710591
      // b7: lload 2
      // b8: lxor
      // b9: invokedynamic g (IJ)Ljava/lang/String; bsm=y3k$mdf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: nop
      // bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c2: iload 7
      // c4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // c7: ldc "]"
      // c9: nop
      // ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d0: invokestatic f83.f_y (Lcom/google/gson/JsonElement;Ljava/lang/String;)F
      // d3: fastore
      // d4: iinc 7 1
      // d7: iload 4
      // d9: ifne 94
      // dc: goto e3
      // df: invokestatic y3k$mdf.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // e2: athrow
      // e3: aload 6
      // e5: areturn
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1763819694472297250L, 5138696733061763872L, MethodHandles.lookup().lookupClass()).a(91872426547700L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 115889391742533L;
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
      String var6 = "\u0087\u0084\u001b3³µç,\ns\"\u0014âèë|2÷´\u001fàî¨»Iî³~Õb\u0000¶\u000e\u008eì\\Ã\\\u0007\u008c=:\u009f»Û*ê\u009a\u0007\u001dpq\u0095\u001fë\u009b\u0098\u008a\u0010-®,\u0081$Ú\u000e`?³U+¨\u0010¾ßÆã¥{òo\u000eßA1Ð\u0013âc(w\u0093©¥FÂ7`J¯R6Ló\u0003\u000eå?¿öÏ\u000f®êöÙ]ú|çØs\u001f\u009b\u0001\u0098R<2ç ú§Ì¢èû\u008f\u0014\u0002Ý$§&£S\u001f^Ëá.Ëþc6²æ\u0019\u0019\u0015\u000b}t0ñ!©\u009cÎká\u001dæ4T\u0006²¤\u0096ðýßã±Y;ì©t¬\büÎPï\u000bª»>X·«¡-*ñt\u0010Ñ\u0019\u001aÑ";
      int var8 = "\u0087\u0084\u001b3³µç,\ns\"\u0014âèë|2÷´\u001fàî¨»Iî³~Õb\u0000¶\u000e\u008eì\\Ã\\\u0007\u008c=:\u009f»Û*ê\u009a\u0007\u001dpq\u0095\u001fë\u009b\u0098\u008a\u0010-®,\u0081$Ú\u000e`?³U+¨\u0010¾ßÆã¥{òo\u000eßA1Ð\u0013âc(w\u0093©¥FÂ7`J¯R6Ló\u0003\u000eå?¿öÏ\u000f®êöÙ]ú|çØs\u001f\u009b\u0001\u0098R<2ç ú§Ì¢èû\u008f\u0014\u0002Ý$§&£S\u001f^Ëá.Ëþc6²æ\u0019\u0019\u0015\u000b}t0ñ!©\u009cÎká\u001dæ4T\u0006²¤\u0096ðýßã±Y;ì©t¬\büÎPï\u000bª»>X·«¡-*ñt\u0010Ñ\u0019\u001aÑ"
         .length();
      char var5 = 'H';
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
                     c = new String[7];
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

                  var6 = "bfN\u0007Ý9ÌªÒ¾\u0091\u0084\u008dÚ¦Î\u0010\u00adyo\u000b[0Ýcü\u001e\t©À#V¼";
                  var8 = "bfN\u0007Ý9ÌªÒ¾\u0091\u0084\u008dÚ¦Î\u0010\u00adyo\u000b[0Ýcü\u001e\t©À#V¼".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30296;
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
            throw new RuntimeException("y3k$mdf", var10);
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
         throw new RuntimeException("y3k$mdf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
