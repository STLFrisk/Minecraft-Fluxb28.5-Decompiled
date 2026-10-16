import com.google.gson.JsonParseException;
import java.io.File;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class je3 {
   private static final Logger zcx;
   private final Map ax5;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public je3(File param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic je3.a J
      // 003: ldc2_w 14281048878235
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: invokespecial java/lang/Object.<init> ()V
      // 00c: invokestatic t9d.b ()I
      // 00f: aload 0
      // 010: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 013: putfield je3.ax5 Ljava/util/Map;
      // 016: istore 5
      // 018: aload 2
      // 019: ifnull 210
      // 01c: new java/io/File
      // 01f: dup
      // 020: aload 1
      // 021: sipush 32353
      // 024: ldc2_w 7874309768880731865
      // 027: lload 3
      // 028: lxor
      // 029: invokedynamic g (IJ)Ljava/lang/String; bsm=je3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: nop
      // 02f: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 032: astore 6
      // 034: new java/io/File
      // 037: dup
      // 038: aload 1
      // 039: new java/lang/StringBuilder
      // 03c: dup
      // 03d: invokespecial java/lang/StringBuilder.<init> ()V
      // 040: sipush 1050
      // 043: ldc2_w 4805379260988181669
      // 046: lload 3
      // 047: lxor
      // 048: invokedynamic g (IJ)Ljava/lang/String; bsm=je3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: nop
      // 04e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 051: aload 2
      // 052: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 055: sipush 3761
      // 058: ldc2_w 1190341116026340877
      // 05b: lload 3
      // 05c: lxor
      // 05d: invokedynamic g (IJ)Ljava/lang/String; bsm=je3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: nop
      // 063: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 066: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 069: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 06c: astore 7
      // 06e: aconst_null
      // 06f: astore 8
      // 071: aload 7
      // 073: getstatic com/google/common/base/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 076: invokestatic com/google/common/io/Files.newReader (Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/io/BufferedReader;
      // 079: astore 8
      // 07b: new com/google/gson/JsonParser
      // 07e: dup
      // 07f: invokespecial com/google/gson/JsonParser.<init> ()V
      // 082: aload 8
      // 084: invokevirtual com/google/gson/JsonParser.parse (Ljava/io/Reader;)Lcom/google/gson/JsonElement;
      // 087: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 08a: astore 9
      // 08c: aload 9
      // 08e: sipush 31292
      // 091: ldc2_w 5645590420765848194
      // 094: lload 3
      // 095: lxor
      // 096: invokedynamic g (IJ)Ljava/lang/String; bsm=je3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: nop
      // 09c: aconst_null
      // 09d: checkcast com/google/gson/JsonObject
      // 0a0: invokestatic f83.ugk (Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;
      // 0a3: astore 10
      // 0a5: iload 5
      // 0a7: ifeq 19f
      // 0aa: aload 10
      // 0ac: ifnull 19a
      // 0af: goto 0b6
      // 0b2: invokestatic je3.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0b5: athrow
      // 0b6: aload 10
      // 0b8: invokevirtual com/google/gson/JsonObject.entrySet ()Ljava/util/Set;
      // 0bb: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0c0: astore 11
      // 0c2: aload 11
      // 0c4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c9: ifeq 19a
      // 0cc: aload 11
      // 0ce: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d3: checkcast java/util/Map$Entry
      // 0d6: astore 12
      // 0d8: aload 12
      // 0da: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0df: checkcast com/google/gson/JsonObject
      // 0e2: astore 13
      // 0e4: aload 12
      // 0e6: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0eb: checkcast java/lang/String
      // 0ee: astore 14
      // 0f0: aload 14
      // 0f2: ldc "/"
      // 0f4: nop
      // 0f5: bipush 2
      // 0f6: invokevirtual java/lang/String.split (Ljava/lang/String;I)[Ljava/lang/String;
      // 0f9: astore 15
      // 0fb: iload 5
      // 0fd: ifeq 19f
      // 100: aload 15
      // 102: iload 5
      // 104: ifeq 123
      // 107: goto 10e
      // 10a: invokestatic je3.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 10d: athrow
      // 10e: arraylength
      // 10f: bipush 1
      // 110: if_icmpne 128
      // 113: goto 11a
      // 116: invokestatic je3.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 119: athrow
      // 11a: aload 15
      // 11c: goto 123
      // 11f: invokestatic je3.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 122: athrow
      // 123: bipush 0
      // 124: aaload
      // 125: goto 146
      // 128: new java/lang/StringBuilder
      // 12b: dup
      // 12c: invokespecial java/lang/StringBuilder.<init> ()V
      // 12f: aload 15
      // 131: bipush 0
      // 132: aaload
      // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 136: ldc ":"
      // 138: nop
      // 139: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13c: aload 15
      // 13e: bipush 1
      // 13f: aaload
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 143: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 146: astore 16
      // 148: aload 13
      // 14a: sipush 23058
      // 14d: ldc2_w 5613934527277929129
      // 150: lload 3
      // 151: lxor
      // 152: invokedynamic g (IJ)Ljava/lang/String; bsm=je3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: nop
      // 158: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 15b: astore 17
      // 15d: new java/io/File
      // 160: dup
      // 161: aload 6
      // 163: new java/lang/StringBuilder
      // 166: dup
      // 167: invokespecial java/lang/StringBuilder.<init> ()V
      // 16a: aload 17
      // 16c: bipush 0
      // 16d: bipush 2
      // 16e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: ldc "/"
      // 176: nop
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17a: aload 17
      // 17c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 182: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 185: astore 18
      // 187: aload 0
      // 188: getfield je3.ax5 Ljava/util/Map;
      // 18b: aload 16
      // 18d: aload 18
      // 18f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 194: pop
      // 195: iload 5
      // 197: ifne 0c2
      // 19a: aload 8
      // 19c: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/Reader;)V
      // 19f: goto 210
      // 1a2: astore 9
      // 1a4: getstatic je3.zcx Lorg/apache/logging/log4j/Logger;
      // 1a7: new java/lang/StringBuilder
      // 1aa: dup
      // 1ab: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ae: sipush 21353
      // 1b1: ldc2_w 1153063060100291536
      // 1b4: lload 3
      // 1b5: lxor
      // 1b6: invokedynamic g (IJ)Ljava/lang/String; bsm=je3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: nop
      // 1bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bf: aload 7
      // 1c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1c4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c7: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 1cc: aload 8
      // 1ce: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/Reader;)V
      // 1d1: goto 210
      // 1d4: astore 9
      // 1d6: getstatic je3.zcx Lorg/apache/logging/log4j/Logger;
      // 1d9: new java/lang/StringBuilder
      // 1dc: dup
      // 1dd: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e0: sipush 11286
      // 1e3: ldc2_w 7091265666443306156
      // 1e6: lload 3
      // 1e7: lxor
      // 1e8: invokedynamic g (IJ)Ljava/lang/String; bsm=je3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: nop
      // 1ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f1: aload 7
      // 1f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f9: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 1fe: aload 8
      // 200: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/Reader;)V
      // 203: goto 210
      // 206: astore 19
      // 208: aload 8
      // 20a: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/Reader;)V
      // 20d: aload 19
      // 20f: athrow
      // 210: return
   }

   public Map jdm() {
      return this.ax5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8771824708184029200L, 8323837443135872119L, MethodHandles.lookup().lookupClass()).a(249933848328266L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 6207876786116L;
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
      String var6 = "\"ÜóótJ¤E^\u0097rN\u0092¾\u0092\u0093k\u008aé\u0007\u00812lÐÔÑ\u0007Ñ\u0083ÊeB\u000f\u0085i\b09ù;M´b¹Ñ9\u008aÜ£U\u001cý¾\r\u0089x\u008ddïhÔq%¯_¼|´ë\u001cýÙ\u0010%ÎÐý\u008f\u0013_IZÓÓä\u0003\u0094H\u008a\u0010üP\u0094Ë\u008fÁ\b'ó½X\u0010{x\nz8Sòü;\u008a\u0097«øá¥ú©aD\u000fÅú\u009cE¾i[»\u0005± \u001e>´\u008fÝõ\u0098\\3¨\u0098dRl7&ë\u001få\u001e§ª\u0083&÷&0Æ?\u0007\u0010Ð(²\u0092î\u0090Ü\u0081\u0088=ü:öF\\ï";
      int var8 = "\"ÜóótJ¤E^\u0097rN\u0092¾\u0092\u0093k\u008aé\u0007\u00812lÐÔÑ\u0007Ñ\u0083ÊeB\u000f\u0085i\b09ù;M´b¹Ñ9\u008aÜ£U\u001cý¾\r\u0089x\u008ddïhÔq%¯_¼|´ë\u001cýÙ\u0010%ÎÐý\u008f\u0013_IZÓÓä\u0003\u0094H\u008a\u0010üP\u0094Ë\u008fÁ\b'ó½X\u0010{x\nz8Sòü;\u008a\u0097«øá¥ú©aD\u000fÅú\u009cE¾i[»\u0005± \u001e>´\u008fÝõ\u0098\\3¨\u0098dRl7&ë\u001få\u001e§ª\u0083&÷&0Æ?\u0007\u0010Ð(²\u0092î\u0090Ü\u0081\u0088=ü:öF\\ï"
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
                     zcx = LogManager.getLogger();
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

                  var6 = "ìå\u0004\u0098\u0094jfÃ\n\u0088\u009e\u0082\tóÈf\u001cº\u0091>l±qì7=ÔÌ\"¤\rA\u0010\u0084\u0088\"\u0099æfF»\u009fº\u0080*StÊ\u0090";
                  var8 = "ìå\u0004\u0098\u0094jfÃ\n\u0088\u009e\u0082\tóÈf\u001cº\u0091>l±qì7=ÔÌ\"¤\rA\u0010\u0084\u0088\"\u0099æfF»\u009fº\u0080*StÊ\u0090"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27597;
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
            throw new RuntimeException("je3", var10);
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
         throw new RuntimeException("je3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
