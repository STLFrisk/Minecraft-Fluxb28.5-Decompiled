import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
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

public class utq extends _6f {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ero deserialize(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic utq.a J
      // 003: ldc2_w 46013632277248
      // 006: lxor
      // 007: lstore 4
      // 009: aload 1
      // 00a: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 00d: astore 7
      // 00f: invokestatic OpaquePredicate.b ()I
      // 012: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 015: astore 8
      // 017: istore 6
      // 019: aload 7
      // 01b: invokevirtual com/google/gson/JsonObject.entrySet ()Ljava/util/Set;
      // 01e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 023: astore 9
      // 025: aload 9
      // 027: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02c: ifeq 1ab
      // 02f: aload 9
      // 031: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 036: checkcast java/util/Map$Entry
      // 039: astore 10
      // 03b: aload 10
      // 03d: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 042: checkcast java/lang/String
      // 045: astore 11
      // 047: aload 10
      // 049: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 04e: checkcast com/google/gson/JsonElement
      // 051: sipush 4665
      // 054: ldc2_w 4082048178582827028
      // 057: lload 4
      // 059: lxor
      // 05a: invokedynamic z (IJ)Ljava/lang/String; bsm=utq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: nop
      // 060: invokestatic f83._yv (Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 063: astore 12
      // 065: aload 12
      // 067: sipush 21452
      // 06a: ldc2_w 2945598481897026026
      // 06d: lload 4
      // 06f: lxor
      // 070: invokedynamic z (IJ)Ljava/lang/String; bsm=utq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: nop
      // 076: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 079: astore 13
      // 07b: aload 12
      // 07d: sipush 9945
      // 080: ldc2_w 6743706523284866300
      // 083: lload 4
      // 085: lxor
      // 086: invokedynamic z (IJ)Ljava/lang/String; bsm=utq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: nop
      // 08c: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 08f: astore 14
      // 091: aload 12
      // 093: sipush 5523
      // 096: ldc2_w 797185329215584176
      // 099: lload 4
      // 09b: lxor
      // 09c: invokedynamic z (IJ)Ljava/lang/String; bsm=utq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: bipush 0
      // 0a3: invokestatic f83.fpy (Lcom/google/gson/JsonObject;Ljava/lang/String;Z)Z
      // 0a6: istore 15
      // 0a8: aload 13
      // 0aa: invokevirtual java/lang/String.isEmpty ()Z
      // 0ad: iload 6
      // 0af: ifeq 100
      // 0b2: ifeq 0fb
      // 0b5: goto 0bc
      // 0b8: invokestatic utq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0bb: athrow
      // 0bc: new com/google/gson/JsonParseException
      // 0bf: dup
      // 0c0: new java/lang/StringBuilder
      // 0c3: dup
      // 0c4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c7: sipush 31435
      // 0ca: ldc2_w 8499850782283225321
      // 0cd: lload 4
      // 0cf: lxor
      // 0d0: invokedynamic z (IJ)Ljava/lang/String; bsm=utq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: nop
      // 0d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d9: aload 11
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: sipush 8905
      // 0e1: ldc2_w 3332014300819259625
      // 0e4: lload 4
      // 0e6: lxor
      // 0e7: invokedynamic z (IJ)Ljava/lang/String; bsm=utq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: nop
      // 0ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f3: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 0f6: athrow
      // 0f7: invokestatic utq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0fa: athrow
      // 0fb: aload 14
      // 0fd: invokevirtual java/lang/String.isEmpty ()Z
      // 100: iload 6
      // 102: ifeq 164
      // 105: ifeq 14e
      // 108: goto 10f
      // 10b: invokestatic utq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 10e: athrow
      // 10f: new com/google/gson/JsonParseException
      // 112: dup
      // 113: new java/lang/StringBuilder
      // 116: dup
      // 117: invokespecial java/lang/StringBuilder.<init> ()V
      // 11a: sipush 14168
      // 11d: ldc2_w 5340738379929130367
      // 120: lload 4
      // 122: lxor
      // 123: invokedynamic z (IJ)Ljava/lang/String; bsm=utq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: nop
      // 129: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12c: aload 11
      // 12e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 131: sipush 10182
      // 134: ldc2_w 1724486048224216551
      // 137: lload 4
      // 139: lxor
      // 13a: invokedynamic z (IJ)Ljava/lang/String; bsm=utq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: nop
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 143: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 146: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 149: athrow
      // 14a: invokestatic utq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 14d: athrow
      // 14e: aload 8
      // 150: new jlc
      // 153: dup
      // 154: aload 11
      // 156: aload 13
      // 158: aload 14
      // 15a: iload 15
      // 15c: invokespecial jlc.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 15f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 164: ifne 1a6
      // 167: new com/google/gson/JsonParseException
      // 16a: dup
      // 16b: new java/lang/StringBuilder
      // 16e: dup
      // 16f: invokespecial java/lang/StringBuilder.<init> ()V
      // 172: sipush 21031
      // 175: ldc2_w 2339132473466974211
      // 178: lload 4
      // 17a: lxor
      // 17b: invokedynamic z (IJ)Ljava/lang/String; bsm=utq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: nop
      // 181: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 184: aload 11
      // 186: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 189: sipush 27670
      // 18c: ldc2_w 6704002344379338297
      // 18f: lload 4
      // 191: lxor
      // 192: invokedynamic z (IJ)Ljava/lang/String; bsm=utq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: nop
      // 198: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19e: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 1a1: athrow
      // 1a2: invokestatic utq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1a5: athrow
      // 1a6: iload 6
      // 1a8: ifne 025
      // 1ab: new ero
      // 1ae: dup
      // 1af: aload 8
      // 1b1: invokespecial ero.<init> (Ljava/util/Collection;)V
      // 1b4: areturn
   }

   @Override
   public String xtu() {
      long var1 = a ^ 75614221664276L;
      return a<"z">(6125, 6223867805207158487L ^ var1);
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6249332107714253856L, 6471958143022026419L, MethodHandles.lookup().lookupClass()).a(79369692940828L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 32338208333320L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "èý ÔKÏc\u0012´Õ\u0090ot\u0001Æ[bw\u0091.\u0086u9\u0098\u000e\u001cÃ,ÞLT°Qg·\u008c¬\u0091\n\u0097\u0010\u009c&kýÈ\u0017¡Ä\u0081\u0012y\u0090 ßª\"\u0010\u0012\u0093ì+©Èi×Ááôçn\u008fLz(f\u00ad]=\u001d\u0094¢0ºÐGä\u0000¢\u008eÕÇD\u0083 ü\u0007°ppÂ])V\u009eÂ\u009d\u0006qXOß N\u0094\u0018SÖ\rÜA~\u009dý1\u00adº\u0016Çñ\u0018\bç\u0090?èW&Ý?(\u001c$Úú5¾ãf/äZÑ\u009f\u0092äuwxô\u0086\u009a?J\u001cð&¶\u008f§\u001a\t<Ì`|NGê\u000bµ(}ÚRz¾ ç\u009a\u0080Ye\u0003Øf\u001eøÒ£¦¬õW]É?\u009esçëý\u0004ê>8¶°¡\u009f\b½(i\u009c÷Ù,\u0092\u009bÙ°\u0082\u0088\u0084.`\u0019\b½R@\u00829US-\u0092\u0001Eàõô\u009fî4\u0084Py\bv\u0004{ ¹Zå¯Ïé\u000fÅë¬T\u0086Í·\"\u001e¬[mM\u0090\u009e\u009b*\u0086?e¡±\u00adïc";
      int var8 = "èý ÔKÏc\u0012´Õ\u0090ot\u0001Æ[bw\u0091.\u0086u9\u0098\u000e\u001cÃ,ÞLT°Qg·\u008c¬\u0091\n\u0097\u0010\u009c&kýÈ\u0017¡Ä\u0081\u0012y\u0090 ßª\"\u0010\u0012\u0093ì+©Èi×Ááôçn\u008fLz(f\u00ad]=\u001d\u0094¢0ºÐGä\u0000¢\u008eÕÇD\u0083 ü\u0007°ppÂ])V\u009eÂ\u009d\u0006qXOß N\u0094\u0018SÖ\rÜA~\u009dý1\u00adº\u0016Çñ\u0018\bç\u0090?èW&Ý?(\u001c$Úú5¾ãf/äZÑ\u009f\u0092äuwxô\u0086\u009a?J\u001cð&¶\u008f§\u001a\t<Ì`|NGê\u000bµ(}ÚRz¾ ç\u009a\u0080Ye\u0003Øf\u001eøÒ£¦¬õW]É?\u009esçëý\u0004ê>8¶°¡\u009f\b½(i\u009c÷Ù,\u0092\u009bÙ°\u0082\u0088\u0084.`\u0019\b½R@\u00829US-\u0092\u0001Eàõô\u009fî4\u0084Py\bv\u0004{ ¹Zå¯Ïé\u000fÅë¬T\u0086Í·\"\u001e¬[mM\u0090\u009e\u009b*\u0086?e¡±\u00adïc"
         .length();
      char var5 = '(';
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
                     c = new String[11];
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

                  var6 = "nÊ01·ÿñB\u000fUÏÑ=Ydäa\u001e\u00957¥õ\u0090\u0096 âcâ»n>\u0018 ³û\u00813Ø\u0011}\u0016\u000eµïØ|\u0082\u0014î\u0012\u000eÒ×øÝ'YøûMðdí\u00046";
                  var8 = "nÊ01·ÿñB\u000fUÏÑ=Ydäa\u001e\u00957¥õ\u0090\u0096 âcâ»n>\u0018 ³û\u00813Ø\u0011}\u0016\u000eµïØ|\u0082\u0014î\u0012\u000eÒ×øÝ'YøûMðdí\u00046"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18715;
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
            throw new RuntimeException("utq", var10);
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
         throw new RuntimeException("utq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
