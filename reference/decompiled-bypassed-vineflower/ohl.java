import com.google.gson.JsonDeserializationContext;
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

public class ohl extends _6f implements JsonSerializer {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public v8g deserialize(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ohl.a J
      // 003: ldc2_w 8463807469276
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 00c: astore 7
      // 00e: invokestatic t9d.c ()I
      // 011: aload 1
      // 012: sipush 27546
      // 015: ldc2_w 7303313605727635200
      // 018: lload 4
      // 01a: lxor
      // 01b: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: invokestatic f83._yv (Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 024: astore 8
      // 026: istore 6
      // 028: aload 8
      // 02a: sipush 26812
      // 02d: ldc2_w 8528752611093136421
      // 030: lload 4
      // 032: lxor
      // 033: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: nop
      // 039: bipush 1
      // 03a: invokestatic f83.wt9 (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 03d: istore 9
      // 03f: iload 9
      // 041: iload 6
      // 043: ifne 085
      // 046: bipush 1
      // 047: if_icmpeq 071
      // 04a: goto 051
      // 04d: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 050: athrow
      // 051: lconst_1
      // 052: ldc2_w 2147483647
      // 055: iload 9
      // 057: i2l
      // 058: sipush 3750
      // 05b: ldc2_w 3245356511471247906
      // 05e: lload 4
      // 060: lxor
      // 061: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: nop
      // 067: invokestatic org/apache/commons/lang3/Validate.inclusiveBetween (JJJLjava/lang/String;)V
      // 06a: goto 071
      // 06d: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 070: athrow
      // 071: aload 8
      // 073: sipush 11233
      // 076: ldc2_w 3353387151715796861
      // 079: lload 4
      // 07b: lxor
      // 07c: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: nop
      // 082: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 085: iload 6
      // 087: ifne 157
      // 08a: ifeq 142
      // 08d: goto 094
      // 090: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 093: athrow
      // 094: aload 8
      // 096: sipush 11233
      // 099: ldc2_w 3353387151715796861
      // 09c: lload 4
      // 09e: lxor
      // 09f: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: nop
      // 0a5: invokestatic f83.k68 (Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 0a8: astore 10
      // 0aa: bipush 0
      // 0ab: istore 11
      // 0ad: iload 11
      // 0af: aload 10
      // 0b1: invokevirtual com/google/gson/JsonArray.size ()I
      // 0b4: if_icmpge 100
      // 0b7: aload 10
      // 0b9: iload 11
      // 0bb: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 0be: astore 12
      // 0c0: aload 0
      // 0c1: iload 11
      // 0c3: aload 12
      // 0c5: invokespecial ohl.rms (ILcom/google/gson/JsonElement;)Lspe;
      // 0c8: astore 13
      // 0ca: iload 6
      // 0cc: ifne 142
      // 0cf: iload 6
      // 0d1: ifne 0fb
      // 0d4: goto 0db
      // 0d7: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 0da: athrow
      // 0db: aload 13
      // 0dd: ifnull 0f8
      // 0e0: goto 0e7
      // 0e3: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 0e6: athrow
      // 0e7: aload 7
      // 0e9: aload 13
      // 0eb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f0: pop
      // 0f1: goto 0f8
      // 0f4: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 0f7: athrow
      // 0f8: iinc 11 1
      // 0fb: iload 6
      // 0fd: ifeq 0ad
      // 100: goto 142
      // 103: astore 10
      // 105: new com/google/gson/JsonParseException
      // 108: dup
      // 109: new java/lang/StringBuilder
      // 10c: dup
      // 10d: invokespecial java/lang/StringBuilder.<init> ()V
      // 110: sipush 3873
      // 113: ldc2_w 6190902520152794031
      // 116: lload 4
      // 118: lxor
      // 119: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: nop
      // 11f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 122: aload 8
      // 124: sipush 11233
      // 127: ldc2_w 3353387151715796861
      // 12a: lload 4
      // 12c: lxor
      // 12d: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: nop
      // 133: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 136: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 139: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13c: aload 10
      // 13e: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 141: athrow
      // 142: aload 8
      // 144: sipush 16043
      // 147: ldc2_w 4149922685348581939
      // 14a: lload 4
      // 14c: lxor
      // 14d: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: nop
      // 153: bipush -1
      // 154: invokestatic f83.wt9 (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 157: istore 10
      // 159: aload 8
      // 15b: sipush 18261
      // 15e: ldc2_w 4593313344671312863
      // 161: lload 4
      // 163: lxor
      // 164: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: nop
      // 16a: bipush -1
      // 16b: invokestatic f83.wt9 (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 16e: istore 11
      // 170: iload 10
      // 172: bipush -1
      // 173: iload 6
      // 175: ifne 1b1
      // 178: if_icmpeq 1a2
      // 17b: goto 182
      // 17e: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 181: athrow
      // 182: lconst_1
      // 183: ldc2_w 2147483647
      // 186: iload 10
      // 188: i2l
      // 189: sipush 25018
      // 18c: ldc2_w 1537104598680063281
      // 18f: lload 4
      // 191: lxor
      // 192: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: nop
      // 198: invokestatic org/apache/commons/lang3/Validate.inclusiveBetween (JJJLjava/lang/String;)V
      // 19b: goto 1a2
      // 19e: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 1a1: athrow
      // 1a2: iload 11
      // 1a4: iload 6
      // 1a6: ifne 1e9
      // 1a9: bipush -1
      // 1aa: goto 1b1
      // 1ad: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 1b0: athrow
      // 1b1: if_icmpeq 1d4
      // 1b4: lconst_1
      // 1b5: ldc2_w 2147483647
      // 1b8: iload 11
      // 1ba: i2l
      // 1bb: sipush 25474
      // 1be: ldc2_w 7420953533054242573
      // 1c1: lload 4
      // 1c3: lxor
      // 1c4: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: nop
      // 1ca: invokestatic org/apache/commons/lang3/Validate.inclusiveBetween (JJJLjava/lang/String;)V
      // 1cd: goto 1d4
      // 1d0: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 1d3: athrow
      // 1d4: aload 8
      // 1d6: sipush 2501
      // 1d9: ldc2_w 5718595807491073371
      // 1dc: lload 4
      // 1de: lxor
      // 1df: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: nop
      // 1e5: bipush 0
      // 1e6: invokestatic f83.fpy (Lcom/google/gson/JsonObject;Ljava/lang/String;Z)Z
      // 1e9: istore 12
      // 1eb: new v8g
      // 1ee: dup
      // 1ef: aload 7
      // 1f1: iload 10
      // 1f3: iload 11
      // 1f5: iload 9
      // 1f7: iload 12
      // 1f9: invokespecial v8g.<init> (Ljava/util/List;IIIZ)V
      // 1fc: areturn
   }

   private spe rms(int param1, JsonElement param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ohl.a J
      // 003: ldc2_w 60567363405411
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 011: iload 5
      // 013: ifeq 065
      // 016: ifeq 055
      // 019: goto 020
      // 01c: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 01f: athrow
      // 020: new spe
      // 023: dup
      // 024: aload 2
      // 025: new java/lang/StringBuilder
      // 028: dup
      // 029: invokespecial java/lang/StringBuilder.<init> ()V
      // 02c: sipush 22736
      // 02f: ldc2_w 3492465774970627310
      // 032: lload 3
      // 033: lxor
      // 034: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: nop
      // 03a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03d: iload 1
      // 03e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 041: ldc "]"
      // 043: nop
      // 044: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 047: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 04a: invokestatic f83.cr2 (Lcom/google/gson/JsonElement;Ljava/lang/String;)I
      // 04d: invokespecial spe.<init> (I)V
      // 050: areturn
      // 051: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 054: athrow
      // 055: aload 2
      // 056: iload 5
      // 058: ifeq 069
      // 05b: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 05e: goto 065
      // 061: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 064: athrow
      // 065: ifeq 123
      // 068: aload 2
      // 069: new java/lang/StringBuilder
      // 06c: dup
      // 06d: invokespecial java/lang/StringBuilder.<init> ()V
      // 070: sipush 10041
      // 073: ldc2_w 875674263626259200
      // 076: lload 3
      // 077: lxor
      // 078: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: nop
      // 07e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 081: iload 1
      // 082: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 085: ldc "]"
      // 087: nop
      // 088: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 08e: invokestatic f83._yv (Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 091: astore 6
      // 093: aload 6
      // 095: sipush 22557
      // 098: ldc2_w 8534000911734006841
      // 09b: lload 3
      // 09c: lxor
      // 09d: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: nop
      // 0a3: bipush -1
      // 0a4: invokestatic f83.wt9 (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 0a7: istore 7
      // 0a9: aload 6
      // 0ab: sipush 27624
      // 0ae: ldc2_w 7109740946077669330
      // 0b1: lload 3
      // 0b2: lxor
      // 0b3: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: nop
      // 0b9: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 0bc: iload 5
      // 0be: ifeq 0fd
      // 0c1: ifeq 0ea
      // 0c4: goto 0cb
      // 0c7: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 0ca: athrow
      // 0cb: lconst_1
      // 0cc: ldc2_w 2147483647
      // 0cf: iload 7
      // 0d1: i2l
      // 0d2: sipush 15623
      // 0d5: ldc2_w 5545571653927141680
      // 0d8: lload 3
      // 0d9: lxor
      // 0da: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: invokestatic org/apache/commons/lang3/Validate.inclusiveBetween (JJJLjava/lang/String;)V
      // 0e3: goto 0ea
      // 0e6: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 0e9: athrow
      // 0ea: aload 6
      // 0ec: sipush 11013
      // 0ef: ldc2_w 5013602168822142774
      // 0f2: lload 3
      // 0f3: lxor
      // 0f4: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: nop
      // 0fa: invokestatic f83.z2p (Lcom/google/gson/JsonObject;Ljava/lang/String;)I
      // 0fd: istore 8
      // 0ff: lconst_0
      // 100: ldc2_w 2147483647
      // 103: iload 8
      // 105: i2l
      // 106: sipush 31068
      // 109: ldc2_w 9069641334907716970
      // 10c: lload 3
      // 10d: lxor
      // 10e: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: nop
      // 114: invokestatic org/apache/commons/lang3/Validate.inclusiveBetween (JJJLjava/lang/String;)V
      // 117: new spe
      // 11a: dup
      // 11b: iload 8
      // 11d: iload 7
      // 11f: invokespecial spe.<init> (II)V
      // 122: areturn
      // 123: aconst_null
      // 124: areturn
   }

   public JsonElement kop(v8g param1, Type param2, JsonSerializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ohl.a J
      // 003: ldc2_w 3471033942392
      // 006: lxor
      // 007: lstore 4
      // 009: new com/google/gson/JsonObject
      // 00c: dup
      // 00d: invokespecial com/google/gson/JsonObject.<init> ()V
      // 010: astore 7
      // 012: invokestatic t9d.b ()I
      // 015: aload 7
      // 017: sipush 2683
      // 01a: ldc2_w 3355328498117685597
      // 01d: lload 4
      // 01f: lxor
      // 020: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: nop
      // 026: aload 1
      // 027: invokevirtual v8g.jxg ()I
      // 02a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 02d: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 030: istore 6
      // 032: aload 1
      // 033: invokevirtual v8g.n2m ()I
      // 036: bipush -1
      // 037: iload 6
      // 039: ifeq 079
      // 03c: if_icmpeq 068
      // 03f: goto 046
      // 042: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 045: athrow
      // 046: aload 7
      // 048: sipush 30004
      // 04b: ldc2_w 1323274981125869085
      // 04e: lload 4
      // 050: lxor
      // 051: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: nop
      // 057: aload 1
      // 058: invokevirtual v8g.n2m ()I
      // 05b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05e: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 061: goto 068
      // 064: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 067: athrow
      // 068: aload 1
      // 069: invokevirtual v8g.i56 ()I
      // 06c: iload 6
      // 06e: ifeq 0a2
      // 071: bipush -1
      // 072: goto 079
      // 075: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 078: athrow
      // 079: if_icmpeq 09e
      // 07c: aload 7
      // 07e: sipush 27861
      // 081: ldc2_w 297456134007707638
      // 084: lload 4
      // 086: lxor
      // 087: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: nop
      // 08d: aload 1
      // 08e: invokevirtual v8g.i56 ()I
      // 091: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 094: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 097: goto 09e
      // 09a: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 09d: athrow
      // 09e: aload 1
      // 09f: invokevirtual v8g.kgk ()I
      // 0a2: ifle 14c
      // 0a5: new com/google/gson/JsonArray
      // 0a8: dup
      // 0a9: invokespecial com/google/gson/JsonArray.<init> ()V
      // 0ac: astore 8
      // 0ae: bipush 0
      // 0af: istore 9
      // 0b1: iload 9
      // 0b3: aload 1
      // 0b4: invokevirtual v8g.kgk ()I
      // 0b7: if_icmpge 136
      // 0ba: aload 1
      // 0bb: iload 9
      // 0bd: invokevirtual v8g.mlt (I)Z
      // 0c0: ifeq 112
      // 0c3: new com/google/gson/JsonObject
      // 0c6: dup
      // 0c7: invokespecial com/google/gson/JsonObject.<init> ()V
      // 0ca: astore 10
      // 0cc: aload 10
      // 0ce: sipush 9221
      // 0d1: ldc2_w 2931532929909235489
      // 0d4: lload 4
      // 0d6: lxor
      // 0d7: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: nop
      // 0dd: aload 1
      // 0de: iload 9
      // 0e0: invokevirtual v8g._af (I)I
      // 0e3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e6: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 0e9: aload 10
      // 0eb: sipush 27624
      // 0ee: ldc2_w 7109753919992156361
      // 0f1: lload 4
      // 0f3: lxor
      // 0f4: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: nop
      // 0fa: aload 1
      // 0fb: iload 9
      // 0fd: invokevirtual v8g.ocq (I)I
      // 100: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 103: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 106: aload 8
      // 108: aload 10
      // 10a: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 10d: iload 6
      // 10f: ifne 12e
      // 112: aload 8
      // 114: new com/google/gson/JsonPrimitive
      // 117: dup
      // 118: aload 1
      // 119: iload 9
      // 11b: invokevirtual v8g._af (I)I
      // 11e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 121: invokespecial com/google/gson/JsonPrimitive.<init> (Ljava/lang/Number;)V
      // 124: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 127: goto 12e
      // 12a: invokestatic ohl.a (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
      // 12d: athrow
      // 12e: iinc 9 1
      // 131: iload 6
      // 133: ifne 0b1
      // 136: aload 7
      // 138: sipush 25745
      // 13b: ldc2_w 346748446840512424
      // 13e: lload 4
      // 140: lxor
      // 141: invokedynamic a (IJ)Ljava/lang/String; bsm=ohl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: nop
      // 147: aload 8
      // 149: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 14c: aload 7
      // 14e: areturn
   }

   @Override
   public String xtu() {
      long var1 = a ^ 58576195657882L;
      return a<"a">(27538, 5911249379947819351L ^ var1);
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.kop((v8g)var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(484652330839412575L, 4208894750219915425L, MethodHandles.lookup().lookupClass()).a(105473309390173L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 126161649448812L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[23];
      int var7 = 0;
      String var6 = "c £/\u0015(\u0017cÑ%vy\u009c¸ô\u0018§Øeugn\u009eõ\u0005`=`Ñ¹Âº(\u0098\u009cêÔã¤Î§E\u0012¯,[\u008eäl\u001c\u001c?YáIü*¿\\v_Gn\u0019þHì\u008fO»^b\u0006\u0010qu»1+\u0087.\u0086hX6\u008fø\u0088Ô\u0085\u0018\u001aþµX¶\u001f\u001a+¿U2(q\u0080ºäS@iè\u009eqi\u0005\u0010²ô<Ý\b|\u0091j\u0086x)gIþ·¯\u0010Ðõ©\u001d6/³\u0017\u008d±\u001bT:µ\\JH5\u0080/ø\u0095\u0000àq$\u008bÞi\u008eqUÓ¸¤ê*þü<EWKI\u008c=O\u0017ÐèQ\u00068p\u00ad\u009dðL!SÍ\u0081Ð\u001a@\u0080áÀvåiöÜ\fùØÌ\u0001JUù\nü\u0088\u008f«\u000bYA õ<\u007f\u0084¨¨ê|?È:ç\f\u0006\bæ*\u009eÔC\u000f\u0085\u0086H§³\u009aE`\u00adÎu\u0010lq»~÷\u008b^Ä\u009cu\n#ÿ\u0083\u000b\u0019\u0010ÂYWÜ\u009fih0ã7`\u00adÚmóp þ§'ª0¹\u0099¡Æá\u0098ò8!Ic,\u0016\u0084ý3û\u0098\u008d\u0080\u001c·\u008eUXð\" \u0089ò\u0015\u0092èSæ}-\u0006¢©\u0004¡·\u0089W\u0085\u0094\u0001ìÌ~\u0084¥¶Jjhoiÿ8Õê6¿t\u0016®\u000f$Ç6hªÖôüa\u008d\u0082\u009d´\u0010ê¦Ð\\Ë\u0003Iê¿VÂÜ//@ß6ÿ$BñhsNy¿\u0097ÊÈ'<¾¨F\u0010Â\u000bc\u0013J\u0094/tÕd\u008d\u0091iG6°\u0010¬+ù\u0002;\u0002\u001cø\u00924×Oºjo§\u0010mP¬ørÝX2@\u0011\u0012÷¼@²G\u0010A\u0019bãn~Á\u008d¼ÅæYôòc\u0092\u0018Øÿ²\u0095¤\u0001Z\b\u009bçh\fZ\u00ad\u0019\u001dZ5?P{à²°( á®¼6R\u0096\u0001\n%\u00adðöëôÔdv&\u0010\u000eS°\u008c\u0094\u0018\tYe-rª\u0014{Öd\u001c\u0000Mm\u0010\u008f\u0093\fúÂ£þ\u001f$ÿÿ³\u0080¶km\u0010m#\u008aYx\f\u0096Kì8¹z°\u0005Fé";
      int var8 = "c £/\u0015(\u0017cÑ%vy\u009c¸ô\u0018§Øeugn\u009eõ\u0005`=`Ñ¹Âº(\u0098\u009cêÔã¤Î§E\u0012¯,[\u008eäl\u001c\u001c?YáIü*¿\\v_Gn\u0019þHì\u008fO»^b\u0006\u0010qu»1+\u0087.\u0086hX6\u008fø\u0088Ô\u0085\u0018\u001aþµX¶\u001f\u001a+¿U2(q\u0080ºäS@iè\u009eqi\u0005\u0010²ô<Ý\b|\u0091j\u0086x)gIþ·¯\u0010Ðõ©\u001d6/³\u0017\u008d±\u001bT:µ\\JH5\u0080/ø\u0095\u0000àq$\u008bÞi\u008eqUÓ¸¤ê*þü<EWKI\u008c=O\u0017ÐèQ\u00068p\u00ad\u009dðL!SÍ\u0081Ð\u001a@\u0080áÀvåiöÜ\fùØÌ\u0001JUù\nü\u0088\u008f«\u000bYA õ<\u007f\u0084¨¨ê|?È:ç\f\u0006\bæ*\u009eÔC\u000f\u0085\u0086H§³\u009aE`\u00adÎu\u0010lq»~÷\u008b^Ä\u009cu\n#ÿ\u0083\u000b\u0019\u0010ÂYWÜ\u009fih0ã7`\u00adÚmóp þ§'ª0¹\u0099¡Æá\u0098ò8!Ic,\u0016\u0084ý3û\u0098\u008d\u0080\u001c·\u008eUXð\" \u0089ò\u0015\u0092èSæ}-\u0006¢©\u0004¡·\u0089W\u0085\u0094\u0001ìÌ~\u0084¥¶Jjhoiÿ8Õê6¿t\u0016®\u000f$Ç6hªÖôüa\u008d\u0082\u009d´\u0010ê¦Ð\\Ë\u0003Iê¿VÂÜ//@ß6ÿ$BñhsNy¿\u0097ÊÈ'<¾¨F\u0010Â\u000bc\u0013J\u0094/tÕd\u008d\u0091iG6°\u0010¬+ù\u0002;\u0002\u001cø\u00924×Oºjo§\u0010mP¬ørÝX2@\u0011\u0012÷¼@²G\u0010A\u0019bãn~Á\u008d¼ÅæYôòc\u0092\u0018Øÿ²\u0095¤\u0001Z\b\u009bçh\fZ\u00ad\u0019\u001dZ5?P{à²°( á®¼6R\u0096\u0001\n%\u00adðöëôÔdv&\u0010\u000eS°\u008c\u0094\u0018\tYe-rª\u0014{Öd\u001c\u0000Mm\u0010\u008f\u0093\fúÂ£þ\u001f$ÿÿ³\u0080¶km\u0010m#\u008aYx\f\u0096Kì8¹z°\u0005Fé"
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
                     c = new String[23];
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

                  var6 = "N\u009c:¸k¹vëûzÛ\n!1ûò Nµphã\u0010ý\u001dø\u0098Ú\u008eÒLº£Ô_\u0012V\u000f\u0018¬ÈD\u009dIãIçwÚ";
                  var8 = "N\u009c:¸k¹vëûzÛ\n!1ûò Nµphã\u0010ý\u001dø\u0098Ú\u008eÒLº£Ô_\u0012V\u000f\u0018¬ÈD\u009dIãIçwÚ".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static ClassCastException a(ClassCastException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23270;
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
            throw new RuntimeException("ohl", var10);
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
         throw new RuntimeException("ohl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
