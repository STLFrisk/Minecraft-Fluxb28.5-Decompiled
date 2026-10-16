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

public class poy$vcg implements JsonDeserializer, JsonSerializer {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public poy deserialize(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic poy$vcg.a J
      // 003: ldc2_w 93993280726914
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.b ()I
      // 00c: istore 6
      // 00e: aload 1
      // 00f: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 012: ifeq 428
      // 015: new poy
      // 018: dup
      // 019: invokespecial poy.<init> ()V
      // 01c: astore 7
      // 01e: aload 1
      // 01f: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 022: astore 8
      // 024: aload 8
      // 026: iload 6
      // 028: ifeq 03d
      // 02b: ifnonnull 03b
      // 02e: goto 035
      // 031: invokestatic poy$vcg.a (Loov;)Loov;
      // 034: athrow
      // 035: aconst_null
      // 036: areturn
      // 037: invokestatic poy$vcg.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 8
      // 03d: sipush 16551
      // 040: ldc2_w 3609273898774789998
      // 043: lload 4
      // 045: lxor
      // 046: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: nop
      // 04c: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 04f: iload 6
      // 051: ifeq 099
      // 054: ifeq 085
      // 057: goto 05e
      // 05a: invokestatic poy$vcg.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 7
      // 060: aload 8
      // 062: sipush 16551
      // 065: ldc2_w 3609273898774789998
      // 068: lload 4
      // 06a: lxor
      // 06b: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: nop
      // 071: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 074: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 077: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 07a: invokestatic poy.may (Lpoy;Ljava/lang/Boolean;)Ljava/lang/Boolean;
      // 07d: pop
      // 07e: goto 085
      // 081: invokestatic poy$vcg.a (Loov;)Loov;
      // 084: athrow
      // 085: aload 8
      // 087: sipush 15012
      // 08a: ldc2_w 1316517039394096504
      // 08d: lload 4
      // 08f: lxor
      // 090: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: nop
      // 096: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 099: iload 6
      // 09b: ifeq 0e3
      // 09e: ifeq 0cf
      // 0a1: goto 0a8
      // 0a4: invokestatic poy$vcg.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 7
      // 0aa: aload 8
      // 0ac: sipush 15012
      // 0af: ldc2_w 1316517039394096504
      // 0b2: lload 4
      // 0b4: lxor
      // 0b5: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: nop
      // 0bb: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0be: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 0c1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c4: invokestatic poy.hnn (Lpoy;Ljava/lang/Boolean;)Ljava/lang/Boolean;
      // 0c7: pop
      // 0c8: goto 0cf
      // 0cb: invokestatic poy$vcg.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 8
      // 0d1: sipush 17029
      // 0d4: ldc2_w 2255426358992239937
      // 0d7: lload 4
      // 0d9: lxor
      // 0da: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 0e3: iload 6
      // 0e5: ifeq 12d
      // 0e8: ifeq 119
      // 0eb: goto 0f2
      // 0ee: invokestatic poy$vcg.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 7
      // 0f4: aload 8
      // 0f6: sipush 17029
      // 0f9: ldc2_w 2255426358992239937
      // 0fc: lload 4
      // 0fe: lxor
      // 0ff: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: nop
      // 105: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 108: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 10b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 10e: invokestatic poy.xr3 (Lpoy;Ljava/lang/Boolean;)Ljava/lang/Boolean;
      // 111: pop
      // 112: goto 119
      // 115: invokestatic poy$vcg.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 8
      // 11b: sipush 11710
      // 11e: ldc2_w 5109002612194022012
      // 121: lload 4
      // 123: lxor
      // 124: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: nop
      // 12a: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 12d: iload 6
      // 12f: ifeq 177
      // 132: ifeq 163
      // 135: goto 13c
      // 138: invokestatic poy$vcg.a (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 7
      // 13e: aload 8
      // 140: sipush 11710
      // 143: ldc2_w 5109002612194022012
      // 146: lload 4
      // 148: lxor
      // 149: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: nop
      // 14f: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 152: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 155: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 158: invokestatic poy.ipa (Lpoy;Ljava/lang/Boolean;)Ljava/lang/Boolean;
      // 15b: pop
      // 15c: goto 163
      // 15f: invokestatic poy$vcg.a (Loov;)Loov;
      // 162: athrow
      // 163: aload 8
      // 165: sipush 25387
      // 168: ldc2_w 6571121117174488305
      // 16b: lload 4
      // 16d: lxor
      // 16e: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: nop
      // 174: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 177: iload 6
      // 179: ifeq 1c1
      // 17c: ifeq 1ad
      // 17f: goto 186
      // 182: invokestatic poy$vcg.a (Loov;)Loov;
      // 185: athrow
      // 186: aload 7
      // 188: aload 8
      // 18a: sipush 25387
      // 18d: ldc2_w 6571121117174488305
      // 190: lload 4
      // 192: lxor
      // 193: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: nop
      // 199: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 19c: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 19f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a2: invokestatic poy.hzv (Lpoy;Ljava/lang/Boolean;)Ljava/lang/Boolean;
      // 1a5: pop
      // 1a6: goto 1ad
      // 1a9: invokestatic poy$vcg.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: aload 8
      // 1af: sipush 21391
      // 1b2: ldc2_w 3112393752145882179
      // 1b5: lload 4
      // 1b7: lxor
      // 1b8: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: nop
      // 1be: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 1c1: iload 6
      // 1c3: ifeq 211
      // 1c6: ifeq 1fd
      // 1c9: goto 1d0
      // 1cc: invokestatic poy$vcg.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: aload 7
      // 1d2: aload 3
      // 1d3: aload 8
      // 1d5: sipush 21391
      // 1d8: ldc2_w 3112393752145882179
      // 1db: lload 4
      // 1dd: lxor
      // 1de: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: nop
      // 1e4: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1e7: ldc syo
      // 1e9: nop
      // 1ea: invokeinterface com/google/gson/JsonDeserializationContext.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object; 3
      // 1ef: checkcast syo
      // 1f2: invokestatic poy.cli (Lpoy;Lsyo;)Lsyo;
      // 1f5: pop
      // 1f6: goto 1fd
      // 1f9: invokestatic poy$vcg.a (Loov;)Loov;
      // 1fc: athrow
      // 1fd: aload 8
      // 1ff: sipush 15559
      // 202: ldc2_w 2770889951208833804
      // 205: lload 4
      // 207: lxor
      // 208: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: nop
      // 20e: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 211: iload 6
      // 213: ifeq 258
      // 216: ifeq 244
      // 219: goto 220
      // 21c: invokestatic poy$vcg.a (Loov;)Loov;
      // 21f: athrow
      // 220: aload 7
      // 222: aload 8
      // 224: sipush 15559
      // 227: ldc2_w 2770889951208833804
      // 22a: lload 4
      // 22c: lxor
      // 22d: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: nop
      // 233: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 236: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 239: invokestatic poy.i8g (Lpoy;Ljava/lang/String;)Ljava/lang/String;
      // 23c: pop
      // 23d: goto 244
      // 240: invokestatic poy$vcg.a (Loov;)Loov;
      // 243: athrow
      // 244: aload 8
      // 246: sipush 30007
      // 249: ldc2_w 85534841477516010
      // 24c: lload 4
      // 24e: lxor
      // 24f: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: nop
      // 255: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 258: iload 6
      // 25a: ifeq 361
      // 25d: ifeq 341
      // 260: goto 267
      // 263: invokestatic poy$vcg.a (Loov;)Loov;
      // 266: athrow
      // 267: aload 8
      // 269: sipush 30007
      // 26c: ldc2_w 85534841477516010
      // 26f: lload 4
      // 271: lxor
      // 272: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: nop
      // 278: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 27b: astore 9
      // 27d: aload 9
      // 27f: iload 6
      // 281: ifeq 343
      // 284: ifnull 341
      // 287: goto 28e
      // 28a: invokestatic poy$vcg.a (Loov;)Loov;
      // 28d: athrow
      // 28e: aload 9
      // 290: sipush 27922
      // 293: ldc2_w 446077918577283800
      // 296: lload 4
      // 298: lxor
      // 299: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29e: nop
      // 29f: invokevirtual com/google/gson/JsonObject.getAsJsonPrimitive (Ljava/lang/String;)Lcom/google/gson/JsonPrimitive;
      // 2a2: astore 10
      // 2a4: aload 10
      // 2a6: iload 6
      // 2a8: ifeq 2bf
      // 2ab: ifnonnull 2bd
      // 2ae: goto 2b5
      // 2b1: invokestatic poy$vcg.a (Loov;)Loov;
      // 2b4: athrow
      // 2b5: aconst_null
      // 2b6: goto 2c5
      // 2b9: invokestatic poy$vcg.a (Loov;)Loov;
      // 2bc: athrow
      // 2bd: aload 10
      // 2bf: invokevirtual com/google/gson/JsonPrimitive.getAsString ()Ljava/lang/String;
      // 2c2: invokestatic tgr$a3_.v7x (Ljava/lang/String;)Ltgr$a3_;
      // 2c5: astore 11
      // 2c7: aload 9
      // 2c9: sipush 25559
      // 2cc: ldc2_w 4825489403753061390
      // 2cf: lload 4
      // 2d1: lxor
      // 2d2: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: nop
      // 2d8: invokevirtual com/google/gson/JsonObject.getAsJsonPrimitive (Ljava/lang/String;)Lcom/google/gson/JsonPrimitive;
      // 2db: astore 12
      // 2dd: aload 12
      // 2df: iload 6
      // 2e1: ifeq 2f8
      // 2e4: ifnonnull 2f6
      // 2e7: goto 2ee
      // 2ea: invokestatic poy$vcg.a (Loov;)Loov;
      // 2ed: athrow
      // 2ee: aconst_null
      // 2ef: goto 2fb
      // 2f2: invokestatic poy$vcg.a (Loov;)Loov;
      // 2f5: athrow
      // 2f6: aload 12
      // 2f8: invokevirtual com/google/gson/JsonPrimitive.getAsString ()Ljava/lang/String;
      // 2fb: astore 13
      // 2fd: aload 11
      // 2ff: ifnull 341
      // 302: aload 13
      // 304: ifnull 341
      // 307: goto 30e
      // 30a: invokestatic poy$vcg.a (Loov;)Loov;
      // 30d: athrow
      // 30e: aload 11
      // 310: invokevirtual tgr$a3_.w4r ()Z
      // 313: iload 6
      // 315: ifeq 361
      // 318: goto 31f
      // 31b: invokestatic poy$vcg.a (Loov;)Loov;
      // 31e: athrow
      // 31f: ifeq 341
      // 322: goto 329
      // 325: invokestatic poy$vcg.a (Loov;)Loov;
      // 328: athrow
      // 329: aload 7
      // 32b: new tgr
      // 32e: dup
      // 32f: aload 11
      // 331: aload 13
      // 333: invokespecial tgr.<init> (Ltgr$a3_;Ljava/lang/String;)V
      // 336: invokestatic poy.pi2 (Lpoy;Ltgr;)Ltgr;
      // 339: pop
      // 33a: goto 341
      // 33d: invokestatic poy$vcg.a (Loov;)Loov;
      // 340: athrow
      // 341: aload 8
      // 343: sipush 19626
      // 346: ldc2_w 1782693680550310756
      // 349: lload 4
      // 34b: lxor
      // 34c: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: nop
      // 352: iload 6
      // 354: ifeq 37c
      // 357: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 35a: goto 361
      // 35d: invokestatic poy$vcg.a (Loov;)Loov;
      // 360: athrow
      // 361: ifeq 425
      // 364: aload 8
      // 366: sipush 19626
      // 369: ldc2_w 1782693680550310756
      // 36c: lload 4
      // 36e: lxor
      // 36f: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 374: nop
      // 375: goto 37c
      // 378: invokestatic poy$vcg.a (Loov;)Loov;
      // 37b: athrow
      // 37c: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 37f: astore 9
      // 381: aload 9
      // 383: iload 6
      // 385: ifeq 394
      // 388: ifnull 425
      // 38b: goto 392
      // 38e: invokestatic poy$vcg.a (Loov;)Loov;
      // 391: athrow
      // 392: aload 9
      // 394: sipush 27922
      // 397: ldc2_w 446077918577283800
      // 39a: lload 4
      // 39c: lxor
      // 39d: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a2: nop
      // 3a3: invokevirtual com/google/gson/JsonObject.getAsJsonPrimitive (Ljava/lang/String;)Lcom/google/gson/JsonPrimitive;
      // 3a6: astore 10
      // 3a8: aload 10
      // 3aa: iload 6
      // 3ac: ifeq 3c3
      // 3af: ifnonnull 3c1
      // 3b2: goto 3b9
      // 3b5: invokestatic poy$vcg.a (Loov;)Loov;
      // 3b8: athrow
      // 3b9: aconst_null
      // 3ba: goto 3c9
      // 3bd: invokestatic poy$vcg.a (Loov;)Loov;
      // 3c0: athrow
      // 3c1: aload 10
      // 3c3: invokevirtual com/google/gson/JsonPrimitive.getAsString ()Ljava/lang/String;
      // 3c6: invokestatic xq3$e6b.muc (Ljava/lang/String;)Lxq3$e6b;
      // 3c9: astore 11
      // 3cb: aload 3
      // 3cc: aload 9
      // 3ce: sipush 25559
      // 3d1: ldc2_w 4825489403753061390
      // 3d4: lload 4
      // 3d6: lxor
      // 3d7: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dc: nop
      // 3dd: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 3e0: ldc ekw
      // 3e2: nop
      // 3e3: invokeinterface com/google/gson/JsonDeserializationContext.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object; 3
      // 3e8: checkcast ekw
      // 3eb: astore 12
      // 3ed: aload 11
      // 3ef: ifnull 425
      // 3f2: aload 12
      // 3f4: ifnull 425
      // 3f7: goto 3fe
      // 3fa: invokestatic poy$vcg.a (Loov;)Loov;
      // 3fd: athrow
      // 3fe: aload 11
      // 400: invokevirtual xq3$e6b.k7m ()Z
      // 403: ifeq 425
      // 406: goto 40d
      // 409: invokestatic poy$vcg.a (Loov;)Loov;
      // 40c: athrow
      // 40d: aload 7
      // 40f: new xq3
      // 412: dup
      // 413: aload 11
      // 415: aload 12
      // 417: invokespecial xq3.<init> (Lxq3$e6b;Lekw;)V
      // 41a: invokestatic poy.olt (Lpoy;Lxq3;)Lxq3;
      // 41d: pop
      // 41e: goto 425
      // 421: invokestatic poy$vcg.a (Loov;)Loov;
      // 424: athrow
      // 425: aload 7
      // 427: areturn
      // 428: aconst_null
      // 429: areturn
   }

   public JsonElement zol(poy param1, Type param2, JsonSerializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic poy$vcg.a J
      // 003: ldc2_w 12990845840311
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.b ()I
      // 00c: istore 6
      // 00e: aload 1
      // 00f: invokevirtual poy.wov ()Z
      // 012: ifeq 01b
      // 015: aconst_null
      // 016: areturn
      // 017: invokestatic poy$vcg.a (Loov;)Loov;
      // 01a: athrow
      // 01b: new com/google/gson/JsonObject
      // 01e: dup
      // 01f: invokespecial com/google/gson/JsonObject.<init> ()V
      // 022: astore 7
      // 024: aload 1
      // 025: invokestatic poy.zz1 (Lpoy;)Ljava/lang/Boolean;
      // 028: iload 6
      // 02a: ifeq 05a
      // 02d: ifnull 056
      // 030: goto 037
      // 033: invokestatic poy$vcg.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 7
      // 039: sipush 19833
      // 03c: ldc2_w 9217591212856573583
      // 03f: lload 4
      // 041: lxor
      // 042: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: nop
      // 048: aload 1
      // 049: invokestatic poy.zz1 (Lpoy;)Ljava/lang/Boolean;
      // 04c: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 04f: goto 056
      // 052: invokestatic poy$vcg.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 1
      // 057: invokestatic poy.l8f (Lpoy;)Ljava/lang/Boolean;
      // 05a: iload 6
      // 05c: ifeq 08c
      // 05f: ifnull 088
      // 062: goto 069
      // 065: invokestatic poy$vcg.a (Loov;)Loov;
      // 068: athrow
      // 069: aload 7
      // 06b: sipush 11177
      // 06e: ldc2_w 199680837183084612
      // 071: lload 4
      // 073: lxor
      // 074: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: nop
      // 07a: aload 1
      // 07b: invokestatic poy.l8f (Lpoy;)Ljava/lang/Boolean;
      // 07e: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 081: goto 088
      // 084: invokestatic poy$vcg.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 1
      // 089: invokestatic poy.it9 (Lpoy;)Ljava/lang/Boolean;
      // 08c: iload 6
      // 08e: ifeq 0be
      // 091: ifnull 0ba
      // 094: goto 09b
      // 097: invokestatic poy$vcg.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 7
      // 09d: sipush 17069
      // 0a0: ldc2_w 8314372725644554581
      // 0a3: lload 4
      // 0a5: lxor
      // 0a6: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: nop
      // 0ac: aload 1
      // 0ad: invokestatic poy.it9 (Lpoy;)Ljava/lang/Boolean;
      // 0b0: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 0b3: goto 0ba
      // 0b6: invokestatic poy$vcg.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 1
      // 0bb: invokestatic poy.gqy (Lpoy;)Ljava/lang/Boolean;
      // 0be: iload 6
      // 0c0: ifeq 0fc
      // 0c3: ifnull 0ec
      // 0c6: goto 0cd
      // 0c9: invokestatic poy$vcg.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 7
      // 0cf: sipush 10310
      // 0d2: ldc2_w 6674940980651760566
      // 0d5: lload 4
      // 0d7: lxor
      // 0d8: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: nop
      // 0de: aload 1
      // 0df: invokestatic poy.gqy (Lpoy;)Ljava/lang/Boolean;
      // 0e2: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 0e5: goto 0ec
      // 0e8: invokestatic poy$vcg.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 1
      // 0ed: iload 6
      // 0ef: ifeq 11f
      // 0f2: invokestatic poy.zkh (Lpoy;)Ljava/lang/Boolean;
      // 0f5: goto 0fc
      // 0f8: invokestatic poy$vcg.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: ifnull 11e
      // 0ff: aload 7
      // 101: sipush 10859
      // 104: ldc2_w 8870986865371126149
      // 107: lload 4
      // 109: lxor
      // 10a: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: nop
      // 110: aload 1
      // 111: invokestatic poy.zkh (Lpoy;)Ljava/lang/Boolean;
      // 114: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 117: goto 11e
      // 11a: invokestatic poy$vcg.a (Loov;)Loov;
      // 11d: athrow
      // 11e: aload 1
      // 11f: iload 6
      // 121: ifeq 157
      // 124: invokestatic poy.t1d (Lpoy;)Lsyo;
      // 127: ifnull 156
      // 12a: goto 131
      // 12d: invokestatic poy$vcg.a (Loov;)Loov;
      // 130: athrow
      // 131: aload 7
      // 133: sipush 24506
      // 136: ldc2_w 3615237409178184783
      // 139: lload 4
      // 13b: lxor
      // 13c: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: nop
      // 142: aload 3
      // 143: aload 1
      // 144: invokestatic poy.t1d (Lpoy;)Lsyo;
      // 147: invokeinterface com/google/gson/JsonSerializationContext.serialize (Ljava/lang/Object;)Lcom/google/gson/JsonElement; 2
      // 14c: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 14f: goto 156
      // 152: invokestatic poy$vcg.a (Loov;)Loov;
      // 155: athrow
      // 156: aload 1
      // 157: iload 6
      // 159: ifeq 18f
      // 15c: invokestatic poy.wm7 (Lpoy;)Ljava/lang/String;
      // 15f: ifnull 18e
      // 162: goto 169
      // 165: invokestatic poy$vcg.a (Loov;)Loov;
      // 168: athrow
      // 169: aload 7
      // 16b: sipush 17244
      // 16e: ldc2_w 712654997057204399
      // 171: lload 4
      // 173: lxor
      // 174: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: nop
      // 17a: aload 3
      // 17b: aload 1
      // 17c: invokestatic poy.wm7 (Lpoy;)Ljava/lang/String;
      // 17f: invokeinterface com/google/gson/JsonSerializationContext.serialize (Ljava/lang/Object;)Lcom/google/gson/JsonElement; 2
      // 184: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 187: goto 18e
      // 18a: invokestatic poy$vcg.a (Loov;)Loov;
      // 18d: athrow
      // 18e: aload 1
      // 18f: iload 6
      // 191: ifeq 1fa
      // 194: invokestatic poy.gyb (Lpoy;)Ltgr;
      // 197: ifnull 1f9
      // 19a: goto 1a1
      // 19d: invokestatic poy$vcg.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: new com/google/gson/JsonObject
      // 1a4: dup
      // 1a5: invokespecial com/google/gson/JsonObject.<init> ()V
      // 1a8: astore 8
      // 1aa: aload 8
      // 1ac: sipush 26920
      // 1af: ldc2_w 9077716256376052444
      // 1b2: lload 4
      // 1b4: lxor
      // 1b5: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: nop
      // 1bb: aload 1
      // 1bc: invokestatic poy.gyb (Lpoy;)Ltgr;
      // 1bf: invokevirtual tgr.vex ()Ltgr$a3_;
      // 1c2: invokevirtual tgr$a3_.fcc ()Ljava/lang/String;
      // 1c5: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 1c8: aload 8
      // 1ca: sipush 13354
      // 1cd: ldc2_w 7964847178713728976
      // 1d0: lload 4
      // 1d2: lxor
      // 1d3: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: nop
      // 1d9: aload 1
      // 1da: invokestatic poy.gyb (Lpoy;)Ltgr;
      // 1dd: invokevirtual tgr.uxt ()Ljava/lang/String;
      // 1e0: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 1e3: aload 7
      // 1e5: sipush 15077
      // 1e8: ldc2_w 1512742446881048855
      // 1eb: lload 4
      // 1ed: lxor
      // 1ee: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: nop
      // 1f4: aload 8
      // 1f6: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 1f9: aload 1
      // 1fa: invokestatic poy.hpg (Lpoy;)Lxq3;
      // 1fd: ifnull 25e
      // 200: new com/google/gson/JsonObject
      // 203: dup
      // 204: invokespecial com/google/gson/JsonObject.<init> ()V
      // 207: astore 8
      // 209: aload 8
      // 20b: sipush 27922
      // 20e: ldc2_w 446022581702254317
      // 211: lload 4
      // 213: lxor
      // 214: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: nop
      // 21a: aload 1
      // 21b: invokestatic poy.hpg (Lpoy;)Lxq3;
      // 21e: invokevirtual xq3.q2q ()Lxq3$e6b;
      // 221: invokevirtual xq3$e6b.qy2 ()Ljava/lang/String;
      // 224: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 227: aload 8
      // 229: sipush 25559
      // 22c: ldc2_w 4825549448111673403
      // 22f: lload 4
      // 231: lxor
      // 232: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: nop
      // 238: aload 3
      // 239: aload 1
      // 23a: invokestatic poy.hpg (Lpoy;)Lxq3;
      // 23d: invokevirtual xq3.ejk ()Lekw;
      // 240: invokeinterface com/google/gson/JsonSerializationContext.serialize (Ljava/lang/Object;)Lcom/google/gson/JsonElement; 2
      // 245: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 248: aload 7
      // 24a: sipush 24995
      // 24d: ldc2_w 8212108518153540190
      // 250: lload 4
      // 252: lxor
      // 253: invokedynamic m (IJ)Ljava/lang/String; bsm=poy$vcg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: nop
      // 259: aload 8
      // 25b: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 25e: aload 7
      // 260: areturn
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.zol((poy)var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4514121311773858421L, -7551123014314749688L, MethodHandles.lookup().lookupClass()).a(201367559691540L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 44405211048094L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[22];
      int var7 = 0;
      String var6 = "\u0000\u001cæJZ\u009d`é\bD÷=^EÍª Öp`Ö\u0013»ëv¿t\u0083d\u0091Ùò³Eárõtb²\u0014û\u008e±@\u008fÅË( Ù½\u0006'\n^\\\"\u000eE|XÕ\u001bá\u0092;g#<\u0002\u0013l*þ\u0012·î\u001f=\u008di\u0010ktÿ/\r\u001eWLGaú¡@\u009a\nÊ <2\u001b3 é¿µ8-\u0097\u0011>Y\u0090/§vÐ\u0019è\u009d¿\u0098\u0093±>gfI\u001a»\u0010H\u0012{CR\u0093nm\u0098æTþÚ\u0010Ô \u0010\u009d»e\u009c\"©pJµ\u000fÿ4Iô¬s äù\t®-]\u0091w\u009b¿.$s£øÎ_0À\u0095m\b@àRÇEÉ7\u008fD\u008f\u0010nÒ¬N\u008a\u009erÀ©TA|¾z\u009bË\u0010\u0015\u0019GÍÌ^óx4l¸\u0012ËV\u0084N\u0010\u009e¼e\u0006\u0080í\u008b7\u001b\u0005À¬ÎD\u0098®\u0018s:\u000flòá\u001cýÒZÄ\u009c7^\u009bn\u0017AB~æø»è\u0018<\u0018V\u0018¼Ò²æ0ìú\u0086-É÷b?6\u0086Äxnã\u0014 |\u0012+´\u0002 z3jßa¦,\u008c:zÜU¦\u0002ÿ´¶\u009ecTÛoU\r^I {ft2vh«`é>\u009aú0\\z:Õ\u001aðêT9õ*\u001a\u0091LÃ\u0011)\u0018¹\u0018¢\u009dÖ\u0083K\u008cn¡qý\nÛø6\u0007&è¡\u008bób\u0002¸\u0004\u0010 \u0004Þ\u0007\u0015¿Öl\u009aÓãã!7ð\u0018\u0010\rÞ\u0014\u0083/TMÄQ\u009f{Þ\u0097Èq³ XÊt´\u008a¢Éó\u0007Ø_g\u0005)\u0016êl\u009c[Ð¬5rÏu ¹f9£Õg\u0018tPZX\u008e\u0010\u0082r¥\u0087RàöMG!\u0013v+\u0093ú\u007fÏ\u0016";
      int var8 = "\u0000\u001cæJZ\u009d`é\bD÷=^EÍª Öp`Ö\u0013»ëv¿t\u0083d\u0091Ùò³Eárõtb²\u0014û\u008e±@\u008fÅË( Ù½\u0006'\n^\\\"\u000eE|XÕ\u001bá\u0092;g#<\u0002\u0013l*þ\u0012·î\u001f=\u008di\u0010ktÿ/\r\u001eWLGaú¡@\u009a\nÊ <2\u001b3 é¿µ8-\u0097\u0011>Y\u0090/§vÐ\u0019è\u009d¿\u0098\u0093±>gfI\u001a»\u0010H\u0012{CR\u0093nm\u0098æTþÚ\u0010Ô \u0010\u009d»e\u009c\"©pJµ\u000fÿ4Iô¬s äù\t®-]\u0091w\u009b¿.$s£øÎ_0À\u0095m\b@àRÇEÉ7\u008fD\u008f\u0010nÒ¬N\u008a\u009erÀ©TA|¾z\u009bË\u0010\u0015\u0019GÍÌ^óx4l¸\u0012ËV\u0084N\u0010\u009e¼e\u0006\u0080í\u008b7\u001b\u0005À¬ÎD\u0098®\u0018s:\u000flòá\u001cýÒZÄ\u009c7^\u009bn\u0017AB~æø»è\u0018<\u0018V\u0018¼Ò²æ0ìú\u0086-É÷b?6\u0086Äxnã\u0014 |\u0012+´\u0002 z3jßa¦,\u008c:zÜU¦\u0002ÿ´¶\u009ecTÛoU\r^I {ft2vh«`é>\u009aú0\\z:Õ\u001aðêT9õ*\u001a\u0091LÃ\u0011)\u0018¹\u0018¢\u009dÖ\u0083K\u008cn¡qý\nÛø6\u0007&è¡\u008bób\u0002¸\u0004\u0010 \u0004Þ\u0007\u0015¿Öl\u009aÓãã!7ð\u0018\u0010\rÞ\u0014\u0083/TMÄQ\u009f{Þ\u0097Èq³ XÊt´\u008a¢Éó\u0007Ø_g\u0005)\u0016êl\u009c[Ð¬5rÏu ¹f9£Õg\u0018tPZX\u008e\u0010\u0082r¥\u0087RàöMG!\u0013v+\u0093ú\u007fÏ\u0016"
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
                     c = new String[22];
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

                  var6 = "Î3'\u001f\u0087\u0089\u0097\u0081B:\u0004D¦ 0HIlF'\u008ceiý/\u0010åç#b\u0090\u0014\u0010w\u0011\u009d\u00ad3àp\u009a¿S,\u001dP\u001di~";
                  var8 = "Î3'\u001f\u0087\u0089\u0097\u0081B:\u0004D¦ 0HIlF'\u008ceiý/\u0010åç#b\u0090\u0014\u0010w\u0011\u009d\u00ad3àp\u009a¿S,\u001dP\u001di~"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27933;
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
            throw new RuntimeException("poy$vcg", var10);
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
         throw new RuntimeException("poy$vcg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
