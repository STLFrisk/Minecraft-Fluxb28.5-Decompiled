import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
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

public class ekw$szt implements JsonDeserializer, JsonSerializer {
   private static final Gson pw2;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ekw deserialize(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ekw$szt.a J
      // 003: ldc2_w 111952367705387
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 6
      // 00e: aload 1
      // 00f: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 012: iload 6
      // 014: ifne 041
      // 017: ifeq 031
      // 01a: goto 021
      // 01d: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 020: athrow
      // 021: new tao
      // 024: dup
      // 025: aload 1
      // 026: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 029: invokespecial tao.<init> (Ljava/lang/String;)V
      // 02c: areturn
      // 02d: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 030: athrow
      // 031: aload 1
      // 032: iload 6
      // 034: ifne 116
      // 037: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 03a: goto 041
      // 03d: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 040: athrow
      // 041: ifne 115
      // 044: aload 1
      // 045: iload 6
      // 047: ifne 066
      // 04a: goto 051
      // 04d: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 050: athrow
      // 051: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 054: ifeq 0d8
      // 057: goto 05e
      // 05a: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 05d: athrow
      // 05e: aload 1
      // 05f: goto 066
      // 062: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 065: athrow
      // 066: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 069: astore 7
      // 06b: aconst_null
      // 06c: astore 8
      // 06e: aload 7
      // 070: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 073: astore 9
      // 075: aload 9
      // 077: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07c: ifeq 0d5
      // 07f: aload 9
      // 081: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 086: checkcast com/google/gson/JsonElement
      // 089: astore 10
      // 08b: aload 0
      // 08c: aload 10
      // 08e: aload 10
      // 090: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 093: aload 3
      // 094: invokevirtual ekw$szt.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lekw;
      // 097: astore 11
      // 099: aload 8
      // 09b: iload 6
      // 09d: ifne 0d7
      // 0a0: iload 6
      // 0a2: ifne 0cf
      // 0a5: goto 0ac
      // 0a8: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0ab: athrow
      // 0ac: ifnonnull 0bf
      // 0af: goto 0b6
      // 0b2: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0b5: athrow
      // 0b6: aload 11
      // 0b8: astore 8
      // 0ba: iload 6
      // 0bc: ifeq 0d0
      // 0bf: aload 8
      // 0c1: aload 11
      // 0c3: invokeinterface ekw.vha (Lekw;)Lekw; 2
      // 0c8: goto 0cf
      // 0cb: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0ce: athrow
      // 0cf: pop
      // 0d0: iload 6
      // 0d2: ifeq 075
      // 0d5: aload 8
      // 0d7: areturn
      // 0d8: new com/google/gson/JsonParseException
      // 0db: dup
      // 0dc: new java/lang/StringBuilder
      // 0df: dup
      // 0e0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e3: sipush 18882
      // 0e6: ldc2_w 6572226502420239481
      // 0e9: lload 4
      // 0eb: lxor
      // 0ec: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: nop
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: aload 1
      // 0f6: invokevirtual com/google/gson/JsonElement.toString ()Ljava/lang/String;
      // 0f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fc: sipush 11552
      // 0ff: ldc2_w 6935405149587665046
      // 102: lload 4
      // 104: lxor
      // 105: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: nop
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 111: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 114: athrow
      // 115: aload 1
      // 116: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 119: astore 7
      // 11b: aload 7
      // 11d: sipush 11143
      // 120: ldc2_w 2241375188177090107
      // 123: lload 4
      // 125: lxor
      // 126: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: nop
      // 12c: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 12f: iload 6
      // 131: ifne 17e
      // 134: ifeq 163
      // 137: goto 13e
      // 13a: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 13d: athrow
      // 13e: new tao
      // 141: dup
      // 142: aload 7
      // 144: sipush 23943
      // 147: ldc2_w 3686676097227915297
      // 14a: lload 4
      // 14c: lxor
      // 14d: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: nop
      // 153: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 156: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 159: invokespecial tao.<init> (Ljava/lang/String;)V
      // 15c: astore 8
      // 15e: iload 6
      // 160: ifeq 420
      // 163: aload 7
      // 165: sipush 32666
      // 168: ldc2_w 8031879585104437819
      // 16b: lload 4
      // 16d: lxor
      // 16e: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: nop
      // 174: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 177: goto 17e
      // 17a: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 17d: athrow
      // 17e: iload 6
      // 180: ifne 2b3
      // 183: ifeq 298
      // 186: goto 18d
      // 189: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 18c: athrow
      // 18d: aload 7
      // 18f: sipush 23518
      // 192: ldc2_w 5212547323986642541
      // 195: lload 4
      // 197: lxor
      // 198: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: nop
      // 19e: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1a1: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 1a4: astore 9
      // 1a6: aload 7
      // 1a8: sipush 29961
      // 1ab: ldc2_w 3143594412857632941
      // 1ae: lload 4
      // 1b0: lxor
      // 1b1: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: nop
      // 1b7: iload 6
      // 1b9: ifne 1e1
      // 1bc: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 1bf: ifeq 284
      // 1c2: goto 1c9
      // 1c5: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1c8: athrow
      // 1c9: aload 7
      // 1cb: sipush 7312
      // 1ce: ldc2_w 2429073828560060709
      // 1d1: lload 4
      // 1d3: lxor
      // 1d4: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: nop
      // 1da: goto 1e1
      // 1dd: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1e0: athrow
      // 1e1: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 1e4: astore 10
      // 1e6: aload 10
      // 1e8: invokevirtual com/google/gson/JsonArray.size ()I
      // 1eb: anewarray 17
      // 1ee: astore 11
      // 1f0: bipush 0
      // 1f1: istore 12
      // 1f3: iload 12
      // 1f5: aload 11
      // 1f7: arraylength
      // 1f8: if_icmpge 272
      // 1fb: aload 11
      // 1fd: iload 12
      // 1ff: aload 0
      // 200: aload 10
      // 202: iload 12
      // 204: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 207: aload 2
      // 208: aload 3
      // 209: invokevirtual ekw$szt.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lekw;
      // 20c: aastore
      // 20d: iload 6
      // 20f: ifne 26d
      // 212: aload 11
      // 214: iload 12
      // 216: aaload
      // 217: instanceof tao
      // 21a: ifeq 26a
      // 21d: goto 224
      // 220: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 223: athrow
      // 224: aload 11
      // 226: iload 12
      // 228: aaload
      // 229: checkcast tao
      // 22c: astore 13
      // 22e: iload 6
      // 230: ifne 26d
      // 233: aload 13
      // 235: invokevirtual tao.f4q ()Lpoy;
      // 238: invokevirtual poy.wov ()Z
      // 23b: ifeq 26a
      // 23e: goto 245
      // 241: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 244: athrow
      // 245: aload 13
      // 247: invokevirtual tao.iwv ()Ljava/util/List;
      // 24a: invokeinterface java/util/List.isEmpty ()Z 1
      // 24f: ifeq 26a
      // 252: goto 259
      // 255: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 258: athrow
      // 259: aload 11
      // 25b: iload 12
      // 25d: aload 13
      // 25f: invokevirtual tao.rcd ()Ljava/lang/String;
      // 262: aastore
      // 263: goto 26a
      // 266: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 269: athrow
      // 26a: iinc 12 1
      // 26d: iload 6
      // 26f: ifeq 1f3
      // 272: new hsu
      // 275: dup
      // 276: aload 9
      // 278: aload 11
      // 27a: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 27d: astore 8
      // 27f: iload 6
      // 281: ifeq 293
      // 284: new hsu
      // 287: dup
      // 288: aload 9
      // 28a: bipush 0
      // 28b: anewarray 17
      // 28e: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 291: astore 8
      // 293: iload 6
      // 295: ifeq 420
      // 298: aload 7
      // 29a: sipush 22202
      // 29d: ldc2_w 4982210896459729680
      // 2a0: lload 4
      // 2a2: lxor
      // 2a3: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: nop
      // 2a9: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 2ac: goto 2b3
      // 2af: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2b2: athrow
      // 2b3: iload 6
      // 2b5: ifne 3bf
      // 2b8: ifeq 3a4
      // 2bb: goto 2c2
      // 2be: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2c1: athrow
      // 2c2: aload 7
      // 2c4: sipush 10759
      // 2c7: ldc2_w 7458901481522362298
      // 2ca: lload 4
      // 2cc: lxor
      // 2cd: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d2: nop
      // 2d3: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 2d6: astore 9
      // 2d8: aload 9
      // 2da: sipush 15809
      // 2dd: ldc2_w 3421373000975900798
      // 2e0: lload 4
      // 2e2: lxor
      // 2e3: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: nop
      // 2e9: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 2ec: iload 6
      // 2ee: ifne 316
      // 2f1: ifeq 319
      // 2f4: goto 2fb
      // 2f7: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2fa: athrow
      // 2fb: aload 9
      // 2fd: sipush 31777
      // 300: ldc2_w 4582334584277606790
      // 303: lload 4
      // 305: lxor
      // 306: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: nop
      // 30c: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 30f: goto 316
      // 312: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 315: athrow
      // 316: ifne 334
      // 319: new com/google/gson/JsonParseException
      // 31c: dup
      // 31d: sipush 25352
      // 320: ldc2_w 7655323116942474925
      // 323: lload 4
      // 325: lxor
      // 326: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: nop
      // 32c: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 32f: athrow
      // 330: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 333: athrow
      // 334: new inv
      // 337: dup
      // 338: aload 9
      // 33a: sipush 18513
      // 33d: ldc2_w 7672174263915484646
      // 340: lload 4
      // 342: lxor
      // 343: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 348: nop
      // 349: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 34c: aload 9
      // 34e: sipush 12425
      // 351: ldc2_w 5080554096698125624
      // 354: lload 4
      // 356: lxor
      // 357: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: nop
      // 35d: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 360: invokespecial inv.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 363: astore 8
      // 365: aload 9
      // 367: sipush 32197
      // 36a: ldc2_w 1218105205013618798
      // 36d: lload 4
      // 36f: lxor
      // 370: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 375: nop
      // 376: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 379: ifeq 39f
      // 37c: aload 8
      // 37e: checkcast inv
      // 381: aload 9
      // 383: sipush 3617
      // 386: ldc2_w 580943918309528469
      // 389: lload 4
      // 38b: lxor
      // 38c: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 391: nop
      // 392: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 395: invokevirtual inv.h2r (Ljava/lang/String;)V
      // 398: goto 39f
      // 39b: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 39e: athrow
      // 39f: iload 6
      // 3a1: ifeq 420
      // 3a4: aload 7
      // 3a6: sipush 12951
      // 3a9: ldc2_w 4010953815931744052
      // 3ac: lload 4
      // 3ae: lxor
      // 3af: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b4: nop
      // 3b5: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 3b8: goto 3bf
      // 3bb: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 3be: athrow
      // 3bf: ifne 403
      // 3c2: new com/google/gson/JsonParseException
      // 3c5: dup
      // 3c6: new java/lang/StringBuilder
      // 3c9: dup
      // 3ca: invokespecial java/lang/StringBuilder.<init> ()V
      // 3cd: sipush 7329
      // 3d0: ldc2_w 5980552285843177759
      // 3d3: lload 4
      // 3d5: lxor
      // 3d6: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3db: nop
      // 3dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3df: aload 1
      // 3e0: invokevirtual com/google/gson/JsonElement.toString ()Ljava/lang/String;
      // 3e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e6: sipush 17082
      // 3e9: ldc2_w 7188663692563160840
      // 3ec: lload 4
      // 3ee: lxor
      // 3ef: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f4: nop
      // 3f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3fb: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 3fe: athrow
      // 3ff: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 402: athrow
      // 403: new mp4
      // 406: dup
      // 407: aload 7
      // 409: sipush 16467
      // 40c: ldc2_w 3210577036192456179
      // 40f: lload 4
      // 411: lxor
      // 412: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 417: nop
      // 418: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 41b: invokespecial mp4.<init> (Ljava/lang/String;)V
      // 41e: astore 8
      // 420: aload 7
      // 422: sipush 28577
      // 425: ldc2_w 578943203395449369
      // 428: lload 4
      // 42a: lxor
      // 42b: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 430: nop
      // 431: iload 6
      // 433: ifne 45b
      // 436: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 439: ifeq 4c5
      // 43c: goto 443
      // 43f: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 442: athrow
      // 443: aload 7
      // 445: sipush 5240
      // 448: ldc2_w 8807246189977749960
      // 44b: lload 4
      // 44d: lxor
      // 44e: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 453: nop
      // 454: goto 45b
      // 457: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 45a: athrow
      // 45b: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 45e: astore 9
      // 460: aload 9
      // 462: invokevirtual com/google/gson/JsonArray.size ()I
      // 465: iload 6
      // 467: ifne 490
      // 46a: ifgt 48f
      // 46d: goto 474
      // 470: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 473: athrow
      // 474: new com/google/gson/JsonParseException
      // 477: dup
      // 478: sipush 27118
      // 47b: ldc2_w 1635906262151509076
      // 47e: lload 4
      // 480: lxor
      // 481: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 486: nop
      // 487: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 48a: athrow
      // 48b: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 48e: athrow
      // 48f: bipush 0
      // 490: istore 10
      // 492: iload 10
      // 494: aload 9
      // 496: invokevirtual com/google/gson/JsonArray.size ()I
      // 499: if_icmpge 4c5
      // 49c: aload 8
      // 49e: aload 0
      // 49f: aload 9
      // 4a1: iload 10
      // 4a3: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 4a6: aload 2
      // 4a7: aload 3
      // 4a8: invokevirtual ekw$szt.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lekw;
      // 4ab: invokeinterface ekw.vha (Lekw;)Lekw; 2
      // 4b0: pop
      // 4b1: iinc 10 1
      // 4b4: iload 6
      // 4b6: ifne 4da
      // 4b9: iload 6
      // 4bb: ifeq 492
      // 4be: goto 4c5
      // 4c1: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 4c4: athrow
      // 4c5: aload 8
      // 4c7: aload 3
      // 4c8: aload 1
      // 4c9: ldc poy
      // 4cb: nop
      // 4cc: invokeinterface com/google/gson/JsonDeserializationContext.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object; 3
      // 4d1: checkcast poy
      // 4d4: invokeinterface ekw.di5 (Lpoy;)Lekw; 2
      // 4d9: pop
      // 4da: aload 8
      // 4dc: areturn
   }

   private void m32(poy param1, JsonObject param2, JsonSerializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: aload 1
      // 07: invokeinterface com/google/gson/JsonSerializationContext.serialize (Ljava/lang/Object;)Lcom/google/gson/JsonElement; 2
      // 0c: astore 5
      // 0e: aload 5
      // 10: iload 4
      // 12: ifeq 2b
      // 15: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 18: ifeq 6f
      // 1b: goto 22
      // 1e: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 21: athrow
      // 22: aload 5
      // 24: goto 2b
      // 27: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2a: athrow
      // 2b: checkcast com/google/gson/JsonObject
      // 2e: astore 6
      // 30: aload 6
      // 32: invokevirtual com/google/gson/JsonObject.entrySet ()Ljava/util/Set;
      // 35: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 3a: astore 7
      // 3c: aload 7
      // 3e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 43: ifeq 6f
      // 46: aload 7
      // 48: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4d: checkcast java/util/Map$Entry
      // 50: astore 8
      // 52: aload 2
      // 53: aload 8
      // 55: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 5a: checkcast java/lang/String
      // 5d: aload 8
      // 5f: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 64: checkcast com/google/gson/JsonElement
      // 67: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 6a: iload 4
      // 6c: ifne 3c
      // 6f: return
   }

   public JsonElement fnq(ekw param1, Type param2, JsonSerializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ekw$szt.a J
      // 003: ldc2_w 26629851552800
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 6
      // 00e: aload 1
      // 00f: instanceof tao
      // 012: iload 6
      // 014: ifne 031
      // 017: ifeq 068
      // 01a: goto 021
      // 01d: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 020: athrow
      // 021: aload 1
      // 022: invokeinterface ekw.f4q ()Lpoy; 1
      // 027: invokevirtual poy.wov ()Z
      // 02a: goto 031
      // 02d: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 030: athrow
      // 031: iload 6
      // 033: ifne 052
      // 036: ifeq 068
      // 039: goto 040
      // 03c: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 03f: athrow
      // 040: aload 1
      // 041: invokeinterface ekw.iwv ()Ljava/util/List; 1
      // 046: invokeinterface java/util/List.isEmpty ()Z 1
      // 04b: goto 052
      // 04e: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 051: athrow
      // 052: ifeq 068
      // 055: new com/google/gson/JsonPrimitive
      // 058: dup
      // 059: aload 1
      // 05a: checkcast tao
      // 05d: invokevirtual tao.rcd ()Ljava/lang/String;
      // 060: invokespecial com/google/gson/JsonPrimitive.<init> (Ljava/lang/String;)V
      // 063: areturn
      // 064: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 067: athrow
      // 068: new com/google/gson/JsonObject
      // 06b: dup
      // 06c: invokespecial com/google/gson/JsonObject.<init> ()V
      // 06f: astore 7
      // 071: aload 1
      // 072: invokeinterface ekw.f4q ()Lpoy; 1
      // 077: invokevirtual poy.wov ()Z
      // 07a: iload 6
      // 07c: ifne 0a8
      // 07f: ifne 09d
      // 082: goto 089
      // 085: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 088: athrow
      // 089: aload 0
      // 08a: aload 1
      // 08b: invokeinterface ekw.f4q ()Lpoy; 1
      // 090: aload 7
      // 092: aload 3
      // 093: invokespecial ekw$szt.m32 (Lpoy;Lcom/google/gson/JsonObject;Lcom/google/gson/JsonSerializationContext;)V
      // 096: goto 09d
      // 099: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 09c: athrow
      // 09d: aload 1
      // 09e: invokeinterface ekw.iwv ()Ljava/util/List; 1
      // 0a3: invokeinterface java/util/List.isEmpty ()Z 1
      // 0a8: iload 6
      // 0aa: ifne 11f
      // 0ad: ifne 11b
      // 0b0: goto 0b7
      // 0b3: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 0b6: athrow
      // 0b7: new com/google/gson/JsonArray
      // 0ba: dup
      // 0bb: invokespecial com/google/gson/JsonArray.<init> ()V
      // 0be: astore 8
      // 0c0: aload 1
      // 0c1: invokeinterface ekw.iwv ()Ljava/util/List; 1
      // 0c6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0cb: astore 9
      // 0cd: aload 9
      // 0cf: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d4: ifeq 105
      // 0d7: aload 9
      // 0d9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0de: checkcast ekw
      // 0e1: astore 10
      // 0e3: aload 8
      // 0e5: aload 0
      // 0e6: aload 10
      // 0e8: aload 10
      // 0ea: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0ed: aload 3
      // 0ee: invokevirtual ekw$szt.fnq (Lekw;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;
      // 0f1: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 0f4: iload 6
      // 0f6: ifne 11b
      // 0f9: iload 6
      // 0fb: ifeq 0cd
      // 0fe: goto 105
      // 101: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 104: athrow
      // 105: aload 7
      // 107: sipush 5240
      // 10a: ldc2_w 8807319409401333955
      // 10d: lload 4
      // 10f: lxor
      // 110: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: nop
      // 116: aload 8
      // 118: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 11b: aload 1
      // 11c: instanceof tao
      // 11f: iload 6
      // 121: ifne 160
      // 124: ifeq 155
      // 127: goto 12e
      // 12a: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 12d: athrow
      // 12e: aload 7
      // 130: sipush 23943
      // 133: ldc2_w 3686699361955070250
      // 136: lload 4
      // 138: lxor
      // 139: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: nop
      // 13f: aload 1
      // 140: checkcast tao
      // 143: invokevirtual tao.rcd ()Ljava/lang/String;
      // 146: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 149: iload 6
      // 14b: ifeq 359
      // 14e: goto 155
      // 151: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 154: athrow
      // 155: aload 1
      // 156: instanceof hsu
      // 159: goto 160
      // 15c: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 15f: athrow
      // 160: iload 6
      // 162: ifne 25e
      // 165: ifeq 253
      // 168: goto 16f
      // 16b: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 16e: athrow
      // 16f: aload 1
      // 170: checkcast hsu
      // 173: astore 8
      // 175: aload 7
      // 177: sipush 23518
      // 17a: ldc2_w 5212579865977374566
      // 17d: lload 4
      // 17f: lxor
      // 180: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: nop
      // 186: aload 8
      // 188: invokevirtual hsu.z24 ()Ljava/lang/String;
      // 18b: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 18e: aload 8
      // 190: invokevirtual hsu.a69 ()[Ljava/lang/Object;
      // 193: iload 6
      // 195: ifne 1ae
      // 198: ifnull 24e
      // 19b: goto 1a2
      // 19e: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1a1: athrow
      // 1a2: aload 8
      // 1a4: invokevirtual hsu.a69 ()[Ljava/lang/Object;
      // 1a7: goto 1ae
      // 1aa: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1ad: athrow
      // 1ae: arraylength
      // 1af: ifle 24e
      // 1b2: new com/google/gson/JsonArray
      // 1b5: dup
      // 1b6: invokespecial com/google/gson/JsonArray.<init> ()V
      // 1b9: astore 9
      // 1bb: aload 8
      // 1bd: invokevirtual hsu.a69 ()[Ljava/lang/Object;
      // 1c0: astore 10
      // 1c2: aload 10
      // 1c4: arraylength
      // 1c5: istore 11
      // 1c7: bipush 0
      // 1c8: istore 12
      // 1ca: iload 12
      // 1cc: iload 11
      // 1ce: if_icmpge 238
      // 1d1: aload 10
      // 1d3: iload 12
      // 1d5: aaload
      // 1d6: astore 13
      // 1d8: iload 6
      // 1da: ifne 24e
      // 1dd: iload 6
      // 1df: ifne 213
      // 1e2: goto 1e9
      // 1e5: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1e8: athrow
      // 1e9: aload 13
      // 1eb: instanceof ekw
      // 1ee: ifeq 218
      // 1f1: goto 1f8
      // 1f4: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1f7: athrow
      // 1f8: aload 9
      // 1fa: aload 0
      // 1fb: aload 13
      // 1fd: checkcast ekw
      // 200: aload 13
      // 202: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 205: aload 3
      // 206: invokevirtual ekw$szt.fnq (Lekw;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;
      // 209: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 20c: goto 213
      // 20f: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 212: athrow
      // 213: iload 6
      // 215: ifeq 230
      // 218: aload 9
      // 21a: new com/google/gson/JsonPrimitive
      // 21d: dup
      // 21e: aload 13
      // 220: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 223: invokespecial com/google/gson/JsonPrimitive.<init> (Ljava/lang/String;)V
      // 226: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 229: goto 230
      // 22c: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 22f: athrow
      // 230: iinc 12 1
      // 233: iload 6
      // 235: ifeq 1ca
      // 238: aload 7
      // 23a: sipush 7312
      // 23d: ldc2_w 2429041290806624302
      // 240: lload 4
      // 242: lxor
      // 243: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: nop
      // 249: aload 9
      // 24b: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 24e: iload 6
      // 250: ifeq 359
      // 253: aload 1
      // 254: instanceof inv
      // 257: goto 25e
      // 25a: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 25d: athrow
      // 25e: iload 6
      // 260: ifne 2f9
      // 263: ifeq 2e2
      // 266: goto 26d
      // 269: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 26c: athrow
      // 26d: aload 1
      // 26e: checkcast inv
      // 271: astore 8
      // 273: new com/google/gson/JsonObject
      // 276: dup
      // 277: invokespecial com/google/gson/JsonObject.<init> ()V
      // 27a: astore 9
      // 27c: aload 9
      // 27e: sipush 18513
      // 281: ldc2_w 7672291197634729197
      // 284: lload 4
      // 286: lxor
      // 287: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: nop
      // 28d: aload 8
      // 28f: invokevirtual inv.cf1 ()Ljava/lang/String;
      // 292: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 295: aload 9
      // 297: sipush 12425
      // 29a: ldc2_w 5080549532359765043
      // 29d: lload 4
      // 29f: lxor
      // 2a0: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: nop
      // 2a6: aload 8
      // 2a8: invokevirtual inv.tj1 ()Ljava/lang/String;
      // 2ab: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 2ae: aload 9
      // 2b0: sipush 3617
      // 2b3: ldc2_w 580841771996484254
      // 2b6: lload 4
      // 2b8: lxor
      // 2b9: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: nop
      // 2bf: aload 8
      // 2c1: invokevirtual inv.cpz ()Ljava/lang/String;
      // 2c4: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 2c7: aload 7
      // 2c9: sipush 10759
      // 2cc: ldc2_w 7458852176476649137
      // 2cf: lload 4
      // 2d1: lxor
      // 2d2: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: nop
      // 2d8: aload 9
      // 2da: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 2dd: iload 6
      // 2df: ifeq 359
      // 2e2: aload 1
      // 2e3: iload 6
      // 2e5: ifne 33b
      // 2e8: goto 2ef
      // 2eb: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2ee: athrow
      // 2ef: instanceof mp4
      // 2f2: goto 2f9
      // 2f5: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2f8: athrow
      // 2f9: ifne 33a
      // 2fc: new java/lang/IllegalArgumentException
      // 2ff: dup
      // 300: new java/lang/StringBuilder
      // 303: dup
      // 304: invokespecial java/lang/StringBuilder.<init> ()V
      // 307: sipush 21271
      // 30a: ldc2_w 8667297599890182053
      // 30d: lload 4
      // 30f: lxor
      // 310: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: nop
      // 316: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 319: aload 1
      // 31a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 31d: sipush 3723
      // 320: ldc2_w 6673198135947891234
      // 323: lload 4
      // 325: lxor
      // 326: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: nop
      // 32c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 332: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 335: athrow
      // 336: invokestatic ekw$szt.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 339: athrow
      // 33a: aload 1
      // 33b: checkcast mp4
      // 33e: astore 8
      // 340: aload 7
      // 342: sipush 16467
      // 345: ldc2_w 3210573008641678584
      // 348: lload 4
      // 34a: lxor
      // 34b: invokedynamic a (IJ)Ljava/lang/String; bsm=ekw$szt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: nop
      // 351: aload 8
      // 353: invokevirtual mp4.nyv ()Ljava/lang/String;
      // 356: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 359: aload 7
      // 35b: areturn
   }

   public static String odg(ekw var0) {
      return pw2.toJson(var0);
   }

   public static ekw wnw(String var0) {
      return (ekw)pw2.fromJson(var0, ekw.class);
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.fnq((ekw)var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5148072907689632066L, -7841552472470697527L, MethodHandles.lookup().lookupClass()).a(54971163949361L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 131519607765197L;
      Cipher var2;
      Cipher var14 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[26];
      int var7 = 0;
      String var6 = "À\u009c\u007f^ª-FâT3xdI@¹Úhõd\fÜ\bd¡\u008eª¹\u0002\u008fõ¦x\u0004\u0092Ä\u00ad»Ñéd\u0018TÛp\u0093\u001fÆ¨\u00ad`=ë\u0095@µ¥)±ÌÿÑo+\u0005o\u0010\u008a\u001bæ\n\u009b¤Á1\u0013CE¹\u0016¢Ð\u0080\u0018ÇÍ*ëdÑðµó\b´5ø!Ð{$k«wí\r\u0094\u00920\u008aI\u008fâ`'$\u0093O8Nfõ\u0095I*>\u0092çr&Z\u001e®\u008eÈxmÆ\r>\u0003gR\u009eóJ\u0086Î\u0014=T*_ÇÞc¥\u0010Ñ\u0096î\u007f·ïú<âÄ%c\u0096\u009a!b\u0010?è.'\u001fàªô@\u0016\r©\u0010\u0081\u009få\u0010×Ó)öú©¨âË|RZkV2ÅH\u000e\u009cÉ¡ºE\u0089*iØ\u001e;\u0019\u0080qH\u0018H6åXÌ\u001b\u009c'\u001e\u0007Z\u0085\fá\u0080~\u009dÉ\u0006½\"\u0002¦\u0080·\u0003\u009apý\u00898\u0011ã+\u001cSc\"c\u0016Ç\u0097ÒmC©h<Ë¬^|)\b«(\u009buI(i0Û\u0081f-øè\u0083Çës³Ö\\\táÖ`äp15V\u008bOò\"\u009es¿£KÝH½\u0010@Sã5ügâ@\u0092\u008d\\Û\u008a\u0005\u0017\u001c8\u0091Y.\u001ak\u0017«\u007fÓ8U3$·xºÏí\u0013ï\u0093ÕxÐ\u0092&k0\u0088q°2E ®ZÙ\u0011ì4îõeÇ\u0006JÁíª³èÓö¢Ë\u0010(X§\u008càY,\u008bî^\u001fÕpÌ<\u008fÆa\u000e\u0098Ù®}ßõÇXÃ\u0084è<\u0093 \u0014EÚÄ}G·Ý\u0010\u0092~åâ÷A<t\u0088¼~å\u0018¥aÆ\u0010Þèy\u007fþ\u0005\u008dó\u00ad\u001dse\t\u001a\nç\u0010\u0084\u0003S\u009fì\u009221\u007f½\u0014¿Oï\u009c\u001f\u0018\u008dß0x²çBc\u0082\u0093\u0092\u0007\bLÁ\në ¬Ðñ\ràî\u00184Éâ\u008aË}AÝ\u000bbdmÒZ\bâôPuwg\u008díf\u0018HGX+U0\u001d\u001cµßûKÚá±W\u000eÝ\\ÿg\u0011\u00adÞ ïj|\u0090\u0082üØ\u001diÕ(\u008a\u0088ég-ù$`¥\u0097µ&]´ÆÈj\u007fÜ\u0095<\u0010\u0019*yÓ(áF¡\"õ'µ6)-à N¨Õ\f\"\u00ad±\u001aq>\u0005_\r9m\u001dg·\u0092·[ÕÜìQ{ú\u00920È\u007f\u0093\u0010v\u008cÐ\u0087Â\u0091\u009fjà\u0093¶\u0019Bî\u000bäX4\u0094ÆH\u0013\u0019ËÝÒ\n±±ß\u009c\u0085  àæC\u0001ûU\u009a^Õ?ë%v<\u0005Yd·O\u000e\u0092'W\u008aåHªI\n_ª\u0007_\u00adh\f\u0001Üä\u0003\u0017\u001d\u009c\u0098tTý\u0099Ã®À\u0091\u0086Æ`?\u0011D\u0094º\bùüaZZ&º[Í\u0083";
      int var8 = "À\u009c\u007f^ª-FâT3xdI@¹Úhõd\fÜ\bd¡\u008eª¹\u0002\u008fõ¦x\u0004\u0092Ä\u00ad»Ñéd\u0018TÛp\u0093\u001fÆ¨\u00ad`=ë\u0095@µ¥)±ÌÿÑo+\u0005o\u0010\u008a\u001bæ\n\u009b¤Á1\u0013CE¹\u0016¢Ð\u0080\u0018ÇÍ*ëdÑðµó\b´5ø!Ð{$k«wí\r\u0094\u00920\u008aI\u008fâ`'$\u0093O8Nfõ\u0095I*>\u0092çr&Z\u001e®\u008eÈxmÆ\r>\u0003gR\u009eóJ\u0086Î\u0014=T*_ÇÞc¥\u0010Ñ\u0096î\u007f·ïú<âÄ%c\u0096\u009a!b\u0010?è.'\u001fàªô@\u0016\r©\u0010\u0081\u009få\u0010×Ó)öú©¨âË|RZkV2ÅH\u000e\u009cÉ¡ºE\u0089*iØ\u001e;\u0019\u0080qH\u0018H6åXÌ\u001b\u009c'\u001e\u0007Z\u0085\fá\u0080~\u009dÉ\u0006½\"\u0002¦\u0080·\u0003\u009apý\u00898\u0011ã+\u001cSc\"c\u0016Ç\u0097ÒmC©h<Ë¬^|)\b«(\u009buI(i0Û\u0081f-øè\u0083Çës³Ö\\\táÖ`äp15V\u008bOò\"\u009es¿£KÝH½\u0010@Sã5ügâ@\u0092\u008d\\Û\u008a\u0005\u0017\u001c8\u0091Y.\u001ak\u0017«\u007fÓ8U3$·xºÏí\u0013ï\u0093ÕxÐ\u0092&k0\u0088q°2E ®ZÙ\u0011ì4îõeÇ\u0006JÁíª³èÓö¢Ë\u0010(X§\u008càY,\u008bî^\u001fÕpÌ<\u008fÆa\u000e\u0098Ù®}ßõÇXÃ\u0084è<\u0093 \u0014EÚÄ}G·Ý\u0010\u0092~åâ÷A<t\u0088¼~å\u0018¥aÆ\u0010Þèy\u007fþ\u0005\u008dó\u00ad\u001dse\t\u001a\nç\u0010\u0084\u0003S\u009fì\u009221\u007f½\u0014¿Oï\u009c\u001f\u0018\u008dß0x²çBc\u0082\u0093\u0092\u0007\bLÁ\në ¬Ðñ\ràî\u00184Éâ\u008aË}AÝ\u000bbdmÒZ\bâôPuwg\u008díf\u0018HGX+U0\u001d\u001cµßûKÚá±W\u000eÝ\\ÿg\u0011\u00adÞ ïj|\u0090\u0082üØ\u001diÕ(\u008a\u0088ég-ù$`¥\u0097µ&]´ÆÈj\u007fÜ\u0095<\u0010\u0019*yÓ(áF¡\"õ'µ6)-à N¨Õ\f\"\u00ad±\u001aq>\u0005_\r9m\u001dg·\u0092·[ÕÜìQ{ú\u00920È\u007f\u0093\u0010v\u008cÐ\u0087Â\u0091\u009fjà\u0093¶\u0019Bî\u000bäX4\u0094ÆH\u0013\u0019ËÝÒ\n±±ß\u009c\u0085  àæC\u0001ûU\u009a^Õ?ë%v<\u0005Yd·O\u000e\u0092'W\u008aåHªI\n_ª\u0007_\u00adh\f\u0001Üä\u0003\u0017\u001d\u009c\u0098tTý\u0099Ã®À\u0091\u0086Æ`?\u0011D\u0094º\bùüaZZ&º[Í\u0083"
         .length();
      char var5 = '(';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var6.substring(++var13, var13 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var21;
                  if ((var13 += var5) >= var8) {
                     b = var9;
                     c = new String[26];
                     GsonBuilder var11 = new GsonBuilder();
                     var11.registerTypeHierarchyAdapter(ekw.class, new ekw$szt());
                     var11.registerTypeHierarchyAdapter(poy.class, new poy$vcg());
                     var11.registerTypeAdapterFactory(new lhs());
                     pw2 = var11.create();
                     return;
                  }

                  var5 = var6.charAt(var13);
                  break;
               default:
                  var9[var7++] = var21;
                  if ((var13 += var5) < var8) {
                     var5 = var6.charAt(var13);
                     continue label27;
                  }

                  var6 = "àåt\u0005ïá¨õPµd½l\u000b\u0011Ç\u0010\u0087äiÁ\u0094\u008d\u001cïj¾Ù}ÆÁ\u00ad\u008b";
                  var8 = "àåt\u0005ïá¨õPµd½l\u000b\u0011Ç\u0010\u0087äiÁ\u0094\u008d\u001cïj¾Ù}ÆÁ\u00ad\u008b".length();
                  var5 = 16;
                  var13 = -1;
            }

            var15 = var6.substring(++var13, var13 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26792;
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
            throw new RuntimeException("ekw$szt", var10);
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
         throw new RuntimeException("ekw$szt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
