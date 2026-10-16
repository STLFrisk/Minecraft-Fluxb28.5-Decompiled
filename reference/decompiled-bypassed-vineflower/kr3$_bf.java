import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
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

public class kr3$_bf implements JsonDeserializer, JsonSerializer {
   public final kr3 yis;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private kr3$_bf(kr3 var1) {
      this.yis = var1;
   }

   public JsonElement tu8(kr3$ccc param1, Type param2, JsonSerializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic kr3$_bf.a J
      // 03: ldc2_w 127750365131478
      // 06: lxor
      // 07: lstore 4
      // 09: new com/google/gson/JsonObject
      // 0c: dup
      // 0d: invokespecial com/google/gson/JsonObject.<init> ()V
      // 10: astore 7
      // 12: aload 7
      // 14: sipush 31038
      // 17: ldc2_w 8909621298749806792
      // 1a: lload 4
      // 1c: lxor
      // 1d: invokedynamic y (IJ)Ljava/lang/String; bsm=kr3$_bf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: nop
      // 23: aload 1
      // 24: invokevirtual kr3$ccc.mhm ()Lcom/mojang/authlib/GameProfile;
      // 27: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 2a: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 2d: invokestatic t9d.c ()I
      // 30: aload 1
      // 31: invokevirtual kr3$ccc.mhm ()Lcom/mojang/authlib/GameProfile;
      // 34: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 37: astore 8
      // 39: istore 6
      // 3b: aload 7
      // 3d: sipush 27673
      // 40: ldc2_w 4077487914317155818
      // 43: lload 4
      // 45: lxor
      // 46: invokedynamic y (IJ)Ljava/lang/String; bsm=kr3$_bf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: nop
      // 4c: aload 8
      // 4e: iload 6
      // 50: ifne 69
      // 53: ifnonnull 67
      // 56: goto 5d
      // 59: invokestatic kr3$_bf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: ldc ""
      // 5f: nop
      // 60: goto 6c
      // 63: invokestatic kr3$_bf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66: athrow
      // 67: aload 8
      // 69: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 6c: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 6f: aload 7
      // 71: sipush 20007
      // 74: ldc2_w 8014846177958571989
      // 77: lload 4
      // 79: lxor
      // 7a: invokedynamic y (IJ)Ljava/lang/String; bsm=kr3$_bf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: nop
      // 80: getstatic kr3.f5l Ljava/text/SimpleDateFormat;
      // 83: aload 1
      // 84: invokevirtual kr3$ccc.ojz ()Ljava/util/Date;
      // 87: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 8a: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 8d: aload 7
      // 8f: areturn
   }

   public kr3$ccc deserialize(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic kr3$_bf.a J
      // 003: ldc2_w 20258206127447
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.c ()I
      // 00c: istore 6
      // 00e: aload 1
      // 00f: iload 6
      // 011: ifne 029
      // 014: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 017: ifeq 114
      // 01a: goto 021
      // 01d: invokestatic kr3$_bf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: aload 1
      // 022: goto 029
      // 025: invokestatic kr3$_bf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028: athrow
      // 029: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 02c: astore 7
      // 02e: aload 7
      // 030: sipush 17404
      // 033: ldc2_w 6898149515807950220
      // 036: lload 4
      // 038: lxor
      // 039: invokedynamic y (IJ)Ljava/lang/String; bsm=kr3$_bf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: nop
      // 03f: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 042: astore 8
      // 044: aload 7
      // 046: sipush 5705
      // 049: ldc2_w 6341543474048913471
      // 04c: lload 4
      // 04e: lxor
      // 04f: invokedynamic y (IJ)Ljava/lang/String; bsm=kr3$_bf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: nop
      // 055: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 058: astore 9
      // 05a: aload 7
      // 05c: sipush 32147
      // 05f: ldc2_w 3514145020821978082
      // 062: lload 4
      // 064: lxor
      // 065: invokedynamic y (IJ)Ljava/lang/String; bsm=kr3$_bf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: nop
      // 06b: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 06e: astore 10
      // 070: aload 8
      // 072: iload 6
      // 074: ifne 083
      // 077: ifnull 112
      // 07a: goto 081
      // 07d: invokestatic kr3$_bf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: aload 9
      // 083: iload 6
      // 085: ifne 094
      // 088: ifnull 112
      // 08b: goto 092
      // 08e: invokestatic kr3$_bf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: aload 9
      // 094: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 097: astore 11
      // 099: aload 8
      // 09b: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 09e: astore 12
      // 0a0: aconst_null
      // 0a1: astore 13
      // 0a3: aload 10
      // 0a5: ifnull 0bd
      // 0a8: getstatic kr3.f5l Ljava/text/SimpleDateFormat;
      // 0ab: aload 10
      // 0ad: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 0b0: invokevirtual java/text/SimpleDateFormat.parse (Ljava/lang/String;)Ljava/util/Date;
      // 0b3: astore 13
      // 0b5: goto 0bd
      // 0b8: astore 14
      // 0ba: aconst_null
      // 0bb: astore 13
      // 0bd: aload 12
      // 0bf: iload 6
      // 0c1: ifne 0d0
      // 0c4: ifnull 110
      // 0c7: goto 0ce
      // 0ca: invokestatic kr3$_bf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 11
      // 0d0: iload 6
      // 0d2: ifne 0e1
      // 0d5: ifnull 110
      // 0d8: goto 0df
      // 0db: invokestatic kr3$_bf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: aload 11
      // 0e1: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 0e4: astore 14
      // 0e6: goto 0ed
      // 0e9: astore 15
      // 0eb: aconst_null
      // 0ec: areturn
      // 0ed: new kr3$ccc
      // 0f0: dup
      // 0f1: aload 0
      // 0f2: getfield kr3$_bf.yis Lkr3;
      // 0f5: dup
      // 0f6: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0f9: pop
      // 0fa: new com/mojang/authlib/GameProfile
      // 0fd: dup
      // 0fe: aload 14
      // 100: aload 12
      // 102: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 105: aload 13
      // 107: aconst_null
      // 108: invokespecial kr3$ccc.<init> (Lkr3;Lcom/mojang/authlib/GameProfile;Ljava/util/Date;Lkr3$1;)V
      // 10b: astore 15
      // 10d: aload 15
      // 10f: areturn
      // 110: aconst_null
      // 111: areturn
      // 112: aconst_null
      // 113: areturn
      // 114: aconst_null
      // 115: areturn
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.tu8((kr3$ccc)var1, var2, var3);
   }

   public kr3$_bf(kr3 var1, kr3$1 var2) {
      this(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3832380292089021351L, 1084497672398129525L, MethodHandles.lookup().lookupClass()).a(189110355398364L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 130917893049446L;
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
      String var6 = "¡-¡\nÞ\u0096·\u0090òÜ\u00adÇ B×\u009bÏº¿\u0019\n\u009f\u000e\u008a\u0010r!\u0016óTÑ¤®J>G\u008290i\u009b\u0018Ð÷0×\u0017\u0003±}{±v[·\nð\u009aÖëo\u0094Þh\u0005G\u0010q\u0083°IÂ\u0095¾\u0018\u0097D5\u0018\n\u0094Ts";
      int var8 = "¡-¡\nÞ\u0096·\u0090òÜ\u00adÇ B×\u009bÏº¿\u0019\n\u009f\u000e\u008a\u0010r!\u0016óTÑ¤®J>G\u008290i\u009b\u0018Ð÷0×\u0017\u0003±}{±v[·\nð\u009aÖëo\u0094Þh\u0005G\u0010q\u0083°IÂ\u0095¾\u0018\u0097D5\u0018\n\u0094Ts"
         .length();
      char var5 = 24;
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

                  var6 = "-\u001eQËá\u0089o%z:5Ã×\u008f'ì\u0010j-}ªùÑeá4¬¿¨\u000bt×\"";
                  var8 = "-\u001eQËá\u0089o%z:5Ã×\u008f'ì\u0010j-}ªùÑeá4¬¿¨\u000bt×\"".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5002;
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
            throw new RuntimeException("kr3$_bf", var10);
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
         throw new RuntimeException("kr3$_bf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
