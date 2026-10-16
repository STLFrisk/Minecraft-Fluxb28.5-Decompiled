import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
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

public class fb2 extends _6f {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public yvh deserialize(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic fb2.a J
      // 003: ldc2_w 26637256404824
      // 006: lxor
      // 007: lstore 4
      // 009: aload 1
      // 00a: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 00d: astore 7
      // 00f: invokestatic t9d.b ()I
      // 012: aload 7
      // 014: sipush 21631
      // 017: ldc2_w 6066930562725472262
      // 01a: lload 4
      // 01c: lxor
      // 01d: invokedynamic q (IJ)Ljava/lang/String; bsm=fb2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: nop
      // 023: bipush 0
      // 024: invokestatic f83.fpy (Lcom/google/gson/JsonObject;Ljava/lang/String;Z)Z
      // 027: istore 8
      // 029: aload 7
      // 02b: sipush 28890
      // 02e: ldc2_w 8857575665208577186
      // 031: lload 4
      // 033: lxor
      // 034: invokedynamic q (IJ)Ljava/lang/String; bsm=fb2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: nop
      // 03a: bipush 0
      // 03b: invokestatic f83.fpy (Lcom/google/gson/JsonObject;Ljava/lang/String;Z)Z
      // 03e: istore 9
      // 040: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 043: astore 10
      // 045: istore 6
      // 047: aload 7
      // 049: sipush 8181
      // 04c: ldc2_w 3300257540358611855
      // 04f: lload 4
      // 051: lxor
      // 052: invokedynamic q (IJ)Ljava/lang/String; bsm=fb2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: nop
      // 058: iload 6
      // 05a: ifeq 07b
      // 05d: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 060: ifeq 1a7
      // 063: goto 06a
      // 066: invokestatic fb2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 069: athrow
      // 06a: aload 7
      // 06c: sipush 22658
      // 06f: ldc2_w 5253792630183126268
      // 072: lload 4
      // 074: lxor
      // 075: invokedynamic q (IJ)Ljava/lang/String; bsm=fb2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: nop
      // 07b: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 07e: astore 11
      // 080: bipush 0
      // 081: istore 12
      // 083: iload 12
      // 085: aload 11
      // 087: invokevirtual com/google/gson/JsonArray.size ()I
      // 08a: if_icmpge 165
      // 08d: aload 11
      // 08f: iload 12
      // 091: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 094: astore 13
      // 096: iload 6
      // 098: ifeq 1a7
      // 09b: aload 13
      // 09d: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 0a0: iload 6
      // 0a2: ifeq 116
      // 0a5: goto 0ac
      // 0a8: invokestatic fb2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ab: athrow
      // 0ac: ifeq 111
      // 0af: goto 0b6
      // 0b2: invokestatic fb2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b5: athrow
      // 0b6: aload 10
      // 0b8: aload 13
      // 0ba: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 0bd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c5: pop
      // 0c6: goto 15d
      // 0c9: invokestatic fb2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cc: athrow
      // 0cd: astore 14
      // 0cf: new com/google/gson/JsonParseException
      // 0d2: dup
      // 0d3: new java/lang/StringBuilder
      // 0d6: dup
      // 0d7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0da: sipush 8549
      // 0dd: ldc2_w 6715330563537804564
      // 0e0: lload 4
      // 0e2: lxor
      // 0e3: invokedynamic q (IJ)Ljava/lang/String; bsm=fb2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: nop
      // 0e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ec: iload 12
      // 0ee: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0f1: sipush 10424
      // 0f4: ldc2_w 8980152842984756421
      // 0f7: lload 4
      // 0f9: lxor
      // 0fa: invokedynamic q (IJ)Ljava/lang/String; bsm=fb2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: nop
      // 100: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 103: aload 13
      // 105: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 108: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10b: aload 14
      // 10d: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 110: athrow
      // 111: aload 13
      // 113: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 116: ifeq 15d
      // 119: new com/google/gson/JsonParseException
      // 11c: dup
      // 11d: new java/lang/StringBuilder
      // 120: dup
      // 121: invokespecial java/lang/StringBuilder.<init> ()V
      // 124: sipush 10621
      // 127: ldc2_w 3182283540212225293
      // 12a: lload 4
      // 12c: lxor
      // 12d: invokedynamic q (IJ)Ljava/lang/String; bsm=fb2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: nop
      // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 136: iload 12
      // 138: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 13b: sipush 18445
      // 13e: ldc2_w 209150015354401910
      // 141: lload 4
      // 143: lxor
      // 144: invokedynamic q (IJ)Ljava/lang/String; bsm=fb2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: nop
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14d: aload 13
      // 14f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 152: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 155: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 158: athrow
      // 159: invokestatic fb2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15c: athrow
      // 15d: iinc 12 1
      // 160: iload 6
      // 162: ifne 083
      // 165: goto 1a7
      // 168: astore 11
      // 16a: new com/google/gson/JsonParseException
      // 16d: dup
      // 16e: new java/lang/StringBuilder
      // 171: dup
      // 172: invokespecial java/lang/StringBuilder.<init> ()V
      // 175: sipush 29486
      // 178: ldc2_w 5361666139692781394
      // 17b: lload 4
      // 17d: lxor
      // 17e: invokedynamic q (IJ)Ljava/lang/String; bsm=fb2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: nop
      // 184: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 187: aload 7
      // 189: sipush 22658
      // 18c: ldc2_w 5253792630183126268
      // 18f: lload 4
      // 191: lxor
      // 192: invokedynamic q (IJ)Ljava/lang/String; bsm=fb2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: nop
      // 198: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 19b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 19e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a1: aload 11
      // 1a3: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1a6: athrow
      // 1a7: new yvh
      // 1aa: dup
      // 1ab: iload 8
      // 1ad: iload 9
      // 1af: aload 10
      // 1b1: invokespecial yvh.<init> (ZZLjava/util/List;)V
      // 1b4: areturn
   }

   @Override
   public String xtu() {
      long var1 = a ^ 134723209267531L;
      return a<"q">(8468, 699819843063593848L ^ var1);
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6952463349624809250L, -4522266574176820817L, MethodHandles.lookup().lookupClass()).a(145223154438614L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 87428555501486L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "À\u001d\u0003gþnËÝ&\u0000ò:50é¿\u0010GöÙ¨-\u008eMü\\+öëÞV¢ñ\u0010M\u0086å\u008fds¸7Û\u0081¤S\t\u008a\u0002ç(<\u000fvºÓeÛ\u007fhÊ£èuäÌ[s\u008aW\u0017\u001a)z\u0085!Þ\t(\u0088l7\u0007\u0018\u0000»\u0099ør\u0094\u0096PÔ\b[xÕâ\u0014\u0017\u0087ôÁ§ÌÏwV\"&\u009bÃ´t\u008c[\u009aÂ\u009cÆÖ\u0091\u0090-~\u0017\u001a\u0099;n\u0002=C£\u0003<|ý\u0085 \u00058QqÒS;TL|ànR>\u001f\u0085h\u0090Ú\u009e$ÚG©ÿ$\u0011ÖºI\u009e\u0083(^9x6ØbHGYP°¥µÀQä¡N\u0086\u001f>äLi\u001e\u00190\u0093\u0098Ï\u009b\u0003c1à\u0011&Æ5\u0084\u00107»Õ\u001b\u0088\u00adi6÷50LôHÓ¥\u0010fùö\u001dlã±\u0011_ ØD\u0092\u0083ãq";
      int var8 = "À\u001d\u0003gþnËÝ&\u0000ò:50é¿\u0010GöÙ¨-\u008eMü\\+öëÞV¢ñ\u0010M\u0086å\u008fds¸7Û\u0081¤S\t\u008a\u0002ç(<\u000fvºÓeÛ\u007fhÊ£èuäÌ[s\u008aW\u0017\u001a)z\u0085!Þ\t(\u0088l7\u0007\u0018\u0000»\u0099ør\u0094\u0096PÔ\b[xÕâ\u0014\u0017\u0087ôÁ§ÌÏwV\"&\u009bÃ´t\u008c[\u009aÂ\u009cÆÖ\u0091\u0090-~\u0017\u001a\u0099;n\u0002=C£\u0003<|ý\u0085 \u00058QqÒS;TL|ànR>\u001f\u0085h\u0090Ú\u009e$ÚG©ÿ$\u0011ÖºI\u009e\u0083(^9x6ØbHGYP°¥µÀQä¡N\u0086\u001f>äLi\u001e\u00190\u0093\u0098Ï\u009b\u0003c1à\u0011&Æ5\u0084\u00107»Õ\u001b\u0088\u00adi6÷50LôHÓ¥\u0010fùö\u001dlã±\u0011_ ØD\u0092\u0083ãq"
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
                     c = new String[10];
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

                  var6 = "1\u009emÈyÒNJ\u0018\\\u0094;½\u009a©\u001a\fQ_Ûjg\u000fÕ\\\u0092±MåhtJ§\u0010¯òÍ\u008dð\u0091ÐeT\u0094xGÛ48\u001bæ1ó\b\u001aw6KºÂvyyHÔáà\u0095\u0092Ëcn\u0090Éø\u0001ÇWÿÎ@(¥'\u0089©å\u009c÷\u008d¯ÚÈ%í\u001b,\u0003\r«\u001bXegÓ";
                  var8 = "1\u009emÈyÒNJ\u0018\\\u0094;½\u009a©\u001a\fQ_Ûjg\u000fÕ\\\u0092±MåhtJ§\u0010¯òÍ\u008dð\u0091ÐeT\u0094xGÛ48\u001bæ1ó\b\u001aw6KºÂvyyHÔáà\u0095\u0092Ëcn\u0090Éø\u0001ÇWÿÎ@(¥'\u0089©å\u009c÷\u008d¯ÚÈ%í\u001b,\u0003\r«\u001bXegÓ"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6723;
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
            throw new RuntimeException("fb2", var10);
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
         throw new RuntimeException("fb2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
