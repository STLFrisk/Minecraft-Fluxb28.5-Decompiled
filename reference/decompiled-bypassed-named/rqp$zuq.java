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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rqp$zuq implements JsonDeserializer {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public rqp deserialize(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic rqp$zuq.a J
      // 003: ldc2_w 52483824395687
      // 006: lxor
      // 007: lstore 4
      // 009: aload 1
      // 00a: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 00d: astore 7
      // 00f: aload 0
      // 010: aload 3
      // 011: aload 7
      // 013: invokevirtual rqp$zuq.spw (Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Ljava/util/List;
      // 016: astore 8
      // 018: aload 0
      // 019: aload 7
      // 01b: invokespecial rqp$zuq.gbw (Lcom/google/gson/JsonObject;)Ljava/lang/String;
      // 01e: astore 9
      // 020: aload 9
      // 022: invokestatic org/apache/commons/lang3/StringUtils.isEmpty (Ljava/lang/CharSequence;)Z
      // 025: istore 10
      // 027: invokestatic OpaquePredicate.b ()I
      // 02a: aload 8
      // 02c: invokeinterface java/util/List.isEmpty ()Z 1
      // 031: istore 11
      // 033: istore 6
      // 035: iload 11
      // 037: iload 6
      // 039: ifeq 07b
      // 03c: ifeq 079
      // 03f: goto 046
      // 042: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 045: athrow
      // 046: iload 10
      // 048: iload 6
      // 04a: ifeq 07b
      // 04d: goto 054
      // 050: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 053: athrow
      // 054: ifeq 079
      // 057: goto 05e
      // 05a: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 05d: athrow
      // 05e: new com/google/gson/JsonParseException
      // 061: dup
      // 062: sipush 22128
      // 065: ldc2_w 8569917787260012498
      // 068: lload 4
      // 06a: lxor
      // 06b: invokedynamic a (IJ)Ljava/lang/String; bsm=rqp$zuq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: nop
      // 071: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 074: athrow
      // 075: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 078: athrow
      // 079: iload 10
      // 07b: iload 6
      // 07d: ifeq 08c
      // 080: ifne 0aa
      // 083: goto 08a
      // 086: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 089: athrow
      // 08a: iload 11
      // 08c: ifne 0aa
      // 08f: new com/google/gson/JsonParseException
      // 092: dup
      // 093: sipush 21936
      // 096: ldc2_w 7918776162014086165
      // 099: lload 4
      // 09b: lxor
      // 09c: invokedynamic a (IJ)Ljava/lang/String; bsm=rqp$zuq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 0a5: athrow
      // 0a6: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: aload 7
      // 0ad: invokespecial rqp$zuq.co5 (Lcom/google/gson/JsonObject;)Ljava/util/Map;
      // 0b0: astore 12
      // 0b2: aload 0
      // 0b3: aload 7
      // 0b5: invokevirtual rqp$zuq.lkz (Lcom/google/gson/JsonObject;)Z
      // 0b8: istore 13
      // 0ba: getstatic flk.i7m Lflk;
      // 0bd: astore 14
      // 0bf: aload 7
      // 0c1: sipush 11358
      // 0c4: ldc2_w 3950112991518146042
      // 0c7: lload 4
      // 0c9: lxor
      // 0ca: invokedynamic a (IJ)Ljava/lang/String; bsm=rqp$zuq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: nop
      // 0d0: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 0d3: iload 6
      // 0d5: ifeq 10a
      // 0d8: ifeq 108
      // 0db: goto 0e2
      // 0de: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0e1: athrow
      // 0e2: aload 7
      // 0e4: sipush 17669
      // 0e7: ldc2_w 7737405431426438308
      // 0ea: lload 4
      // 0ec: lxor
      // 0ed: invokedynamic a (IJ)Ljava/lang/String; bsm=rqp$zuq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: nop
      // 0f3: invokestatic f83.lhy (Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 0f6: astore 15
      // 0f8: aload 3
      // 0f9: aload 15
      // 0fb: ldc flk
      // 0fd: nop
      // 0fe: invokeinterface com/google/gson/JsonDeserializationContext.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object; 3
      // 103: checkcast flk
      // 106: astore 14
      // 108: iload 11
      // 10a: ifeq 12b
      // 10d: new rqp
      // 110: dup
      // 111: new gdz
      // 114: dup
      // 115: aload 9
      // 117: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 11a: aload 12
      // 11c: iload 13
      // 11e: bipush 1
      // 11f: aload 14
      // 121: invokespecial rqp.<init> (Lgdz;Ljava/util/Map;ZZLflk;)V
      // 124: goto 13b
      // 127: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 12a: athrow
      // 12b: new rqp
      // 12e: dup
      // 12f: aload 8
      // 131: aload 12
      // 133: iload 13
      // 135: bipush 1
      // 136: aload 14
      // 138: invokespecial rqp.<init> (Ljava/util/List;Ljava/util/Map;ZZLflk;)V
      // 13b: areturn
   }

   private Map co5(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic rqp$zuq.a J
      // 03: ldc2_w 51861649146296
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 10: astore 5
      // 12: aload 1
      // 13: sipush 12271
      // 16: ldc2_w 3743755045792275024
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic a (IJ)Ljava/lang/String; bsm=rqp$zuq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: iload 4
      // 23: ifeq 49
      // 26: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 29: ifeq 9d
      // 2c: goto 33
      // 2f: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 32: athrow
      // 33: aload 1
      // 34: sipush 20452
      // 37: ldc2_w 3464757061555599965
      // 3a: lload 2
      // 3b: lxor
      // 3c: invokedynamic a (IJ)Ljava/lang/String; bsm=rqp$zuq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: nop
      // 42: goto 49
      // 45: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 48: athrow
      // 49: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 4c: astore 6
      // 4e: aload 6
      // 50: invokevirtual com/google/gson/JsonObject.entrySet ()Ljava/util/Set;
      // 53: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 58: astore 7
      // 5a: aload 7
      // 5c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 61: ifeq 9d
      // 64: aload 7
      // 66: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6b: checkcast java/util/Map$Entry
      // 6e: astore 8
      // 70: aload 5
      // 72: iload 4
      // 74: ifeq 9f
      // 77: aload 8
      // 79: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 7e: aload 8
      // 80: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 85: checkcast com/google/gson/JsonElement
      // 88: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 8b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 90: pop
      // 91: iload 4
      // 93: ifne 5a
      // 96: goto 9d
      // 99: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 9c: athrow
      // 9d: aload 5
      // 9f: areturn
   }

   private String gbw(JsonObject var1) {
      long var2 = a ^ 131831975986682L;
      return f83.sen(var1, a<"a">(27988, 5771729150124367009L ^ var2), "");
   }

   public boolean lkz(JsonObject var1) {
      long var2 = a ^ 127912632645776L;
      return f83.fpy(var1, a<"a">(12229, 8912259618419499867L ^ var2), true);
   }

   public List spw(JsonDeserializationContext param1, JsonObject param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic rqp$zuq.a J
      // 03: ldc2_w 38373484833823
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 10: astore 6
      // 12: aload 2
      // 13: sipush 2765
      // 16: ldc2_w 4237234960136016594
      // 19: lload 3
      // 1a: lxor
      // 1b: invokedynamic a (IJ)Ljava/lang/String; bsm=rqp$zuq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: iload 5
      // 23: ifne 49
      // 26: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 29: ifeq 8e
      // 2c: goto 33
      // 2f: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 32: athrow
      // 33: aload 2
      // 34: sipush 632
      // 37: ldc2_w 1622171739419122275
      // 3a: lload 3
      // 3b: lxor
      // 3c: invokedynamic a (IJ)Ljava/lang/String; bsm=rqp$zuq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: nop
      // 42: goto 49
      // 45: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 48: athrow
      // 49: invokestatic f83.k68 (Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 4c: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 4f: astore 7
      // 51: aload 7
      // 53: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 58: ifeq 8e
      // 5b: aload 7
      // 5d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 62: checkcast com/google/gson/JsonElement
      // 65: astore 8
      // 67: aload 6
      // 69: iload 5
      // 6b: ifne 90
      // 6e: aload 1
      // 6f: aload 8
      // 71: ldc lcz
      // 73: nop
      // 74: invokeinterface com/google/gson/JsonDeserializationContext.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object; 3
      // 79: checkcast lcz
      // 7c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 81: pop
      // 82: iload 5
      // 84: ifeq 51
      // 87: goto 8e
      // 8a: invokestatic rqp$zuq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 8d: athrow
      // 8e: aload 6
      // 90: areturn
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8540771610400057381L, -9005527139334585994L, MethodHandles.lookup().lookupClass()).a(171632602794612L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 18900123467337L;
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
      String var6 = "ÁB\u008e\u0017¹\"ý2w.qá%Ä\u0010ãó\u008c\u0093X\u0088·CÇgÓoÏTD\n\u0014\u00106\u008f\u0000\u0085\u009aN3\u0098¢\u00ad\u008bE\u0012\u0007Úûp\fe¬\bgj\u000f·°Äó\u009f9\u0080B5ÇÛßå÷\u0002\u0090ªä(4Sê\u0097ÁØé\u0014;HÏ^>ßm÷¦T¾Ww\u007fÖ\u0095@\u001aî0e)ÿ \u0007±\"$è\u000e\u000f\u007f\f5E\rxé» ²@b:dê\u008eçs\u0010ÍË\u0099\u0002þ\u001e'#óÄ¦\u0088ëgÕ\u001fô·dì¡VÃ\u008eÀ#\u001f\u0014 B¹ïf\u00930É\u0015ø \u0004Ùú])[Q7f9x\u00adEÒr>èù?´c|\u0010vqÅï9[`\u001ci¬åF×ª\u0012Åh\u00852ûã\u001b;]T¢±Íþ}\u001c\u008fbÝËUPq\"´»\u0000\u0015PsàF\"ÔÍRD\u0018ªÍ¾Ö&ß3Ì\u0006ïv/¼6Wóº¤±2\u0099÷Q\u008eªA@\u001fsøHÌÅö\u0014\u0086£©Ü¢\u0018~\u0097\u007fÃO\u0003\u008f§¤Nª2ûTwÃ\u0001÷·ÝP\t\u0014pÒø` îûúnJqµ\u0099¥ËëÙeé\u0098\u001få©í\u0085ÆVë\u0004Ïõ`¦¶ó\u008aÒ\u0018F\u0018\u0005 QÜYÅ\u0013\u0010(\u009eLì!©\u001etÝñ\u0092¥Qå";
      int var8 = "ÁB\u008e\u0017¹\"ý2w.qá%Ä\u0010ãó\u008c\u0093X\u0088·CÇgÓoÏTD\n\u0014\u00106\u008f\u0000\u0085\u009aN3\u0098¢\u00ad\u008bE\u0012\u0007Úûp\fe¬\bgj\u000f·°Äó\u009f9\u0080B5ÇÛßå÷\u0002\u0090ªä(4Sê\u0097ÁØé\u0014;HÏ^>ßm÷¦T¾Ww\u007fÖ\u0095@\u001aî0e)ÿ \u0007±\"$è\u000e\u000f\u007f\f5E\rxé» ²@b:dê\u008eçs\u0010ÍË\u0099\u0002þ\u001e'#óÄ¦\u0088ëgÕ\u001fô·dì¡VÃ\u008eÀ#\u001f\u0014 B¹ïf\u00930É\u0015ø \u0004Ùú])[Q7f9x\u00adEÒr>èù?´c|\u0010vqÅï9[`\u001ci¬åF×ª\u0012Åh\u00852ûã\u001b;]T¢±Íþ}\u001c\u008fbÝËUPq\"´»\u0000\u0015PsàF\"ÔÍRD\u0018ªÍ¾Ö&ß3Ì\u0006ïv/¼6Wóº¤±2\u0099÷Q\u008eªA@\u001fsøHÌÅö\u0014\u0086£©Ü¢\u0018~\u0097\u007fÃO\u0003\u008f§¤Nª2ûTwÃ\u0001÷·ÝP\t\u0014pÒø` îûúnJqµ\u0099¥ËëÙeé\u0098\u001få©í\u0085ÆVë\u0004Ïõ`¦¶ó\u008aÒ\u0018F\u0018\u0005 QÜYÅ\u0013\u0010(\u009eLì!©\u001etÝñ\u0092¥Qå"
         .length();
      char var5 = ' ';
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

                  var6 = "úø[¸\u0010I¼µþwÖ\u0093\u0010\u001brW(+RÛ-\u0013ü·Âµ\u000b¸c6<!öº\u0006ü\u0018<¬\u009d\u00115OFö\u0017wÎä\b>\u001bË@õ§(";
                  var8 = "úø[¸\u0010I¼µþwÖ\u0093\u0010\u001brW(+RÛ-\u0013ü·Âµ\u000b¸c6<!öº\u0006ü\u0018<¬\u009d\u00115OFö\u0017wÎä\b>\u001bË@õ§(".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25056;
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
            throw new RuntimeException("rqp$zuq", var10);
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
         throw new RuntimeException("rqp$zuq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
