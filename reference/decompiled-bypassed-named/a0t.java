import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;

public enum a0t {
   public static final a0t z8v;
   public static final a0t fwh;
   public static final a0t nil;
   public static final a0t le5;
   private static int uly;
   private static int u2c;
   private static final a0t[] su6;
   private static final Map mtt;
   private final int d9u;
   private final Map soq = Maps.newEnumMap(qat.class);
   private static final a0t[] ygy;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private a0t(int var3) {
      this.d9u = var3;
   }

   public a0t y07(qat var1, Class var2) {
      long var3 = a ^ 115393562423243L;
      Object var5 = (BiMap)this.soq.get(var1);
      if (var5 == null) {
         var5 = HashBiMap.create();
         this.soq.put(var1, var5);
      }

      if (var5.containsValue(var2)) {
         String var6 = var1 + a<"v">(25326, 8041073840935768488L ^ var3) + var2 + a<"v">(4823, 1517644629393203615L ^ var3) + var5.inverse().get(var2);
         LogManager.getLogger().fatal(var6);
         throw new IllegalArgumentException(var6);
      } else {
         var5.put(var5.size(), var2);
         return this;
      }
   }

   public Integer dhy(qat var1, mz2 var2) {
      return (Integer)((BiMap)this.soq.get(var1)).inverse().get(var2.getClass());
   }

   public mz2 pz2(qat param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield a0t.soq Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast com/google/common/collect/BiMap
      // 11: iload 2
      // 12: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15: invokeinterface com/google/common/collect/BiMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1a: checkcast java/lang/Class
      // 1d: astore 4
      // 1f: aload 4
      // 21: iload 3
      // 22: ifeq 3c
      // 25: ifnonnull 37
      // 28: goto 2f
      // 2b: invokestatic a0t.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aconst_null
      // 30: goto 3f
      // 33: invokestatic a0t.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 4
      // 39: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 3c: checkcast mz2
      // 3f: areturn
   }

   public int jhj() {
      return this.d9u;
   }

   public static a0t abp(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: getstatic a0t.uly I
      // 08: iload 1
      // 09: ifne 21
      // 0c: if_icmplt 34
      // 0f: goto 16
      // 12: invokestatic a0t.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: iload 0
      // 17: getstatic a0t.u2c I
      // 1a: goto 21
      // 1d: invokestatic a0t.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: if_icmpgt 34
      // 24: getstatic a0t.su6 [La0t;
      // 27: iload 0
      // 28: getstatic a0t.uly I
      // 2b: isub
      // 2c: aaload
      // 2d: goto 35
      // 30: invokestatic a0t.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aconst_null
      // 35: areturn
   }

   public static a0t c5_(mz2 var0) {
      return (a0t)mtt.get(var0.getClass());
   }

   public a0t(int var3, a0t$1 var4) {
      this(var3);
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic c.g ()Ljava/lang/Object;
      // 003: monitorenter
      // 004: ldc2_w 7621718849811618949
      // 007: ldc2_w -495148344822023378
      // 00a: invokestatic java/lang/invoke/MethodHandles.lookup ()Ljava/lang/invoke/MethodHandles$Lookup;
      // 00d: invokevirtual java/lang/invoke/MethodHandles$Lookup.lookupClass ()Ljava/lang/Class;
      // 010: invokestatic c.a (JJLjava/lang/Object;)La;
      // 013: ldc2_w 164244658437567
      // 016: invokeinterface a.a (J)J 3
      // 01b: invokestatic c.g ()Ljava/lang/Object;
      // 01e: monitorexit
      // 01f: putstatic a0t.a J
      // 022: getstatic a0t.a J
      // 025: ldc2_w 47407464256962
      // 028: lxor
      // 029: lstore 9
      // 02b: new java/util/HashMap
      // 02e: dup
      // 02f: bipush 13
      // 031: invokespecial java/util/HashMap.<init> (I)V
      // 034: putstatic a0t.d Ljava/util/Map;
      // 037: ldc "DES/CBC/PKCS5Padding"
      // 039: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 03c: dup
      // 03d: astore 0
      // 03e: bipush 2
      // 03f: ldc "DES"
      // 041: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 044: bipush 8
      // 046: newarray 8
      // 048: dup
      // 049: bipush 0
      // 04a: lload 9
      // 04c: bipush 56
      // 04e: lushr
      // 04f: l2i
      // 050: i2b
      // 051: bastore
      // 052: bipush 1
      // 053: istore 1
      // 054: iload 1
      // 055: bipush 8
      // 057: if_icmpge 06f
      // 05a: dup
      // 05b: iload 1
      // 05c: lload 9
      // 05e: iload 1
      // 05f: bipush 8
      // 061: imul
      // 062: lshl
      // 063: bipush 56
      // 065: lushr
      // 066: l2i
      // 067: i2b
      // 068: bastore
      // 069: iinc 1 1
      // 06c: goto 054
      // 06f: new javax/crypto/spec/DESKeySpec
      // 072: dup_x1
      // 073: swap
      // 074: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 077: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 07a: new javax/crypto/spec/IvParameterSpec
      // 07d: dup
      // 07e: bipush 8
      // 080: newarray 8
      // 082: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 085: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 088: bipush 12
      // 08a: anewarray 3
      // 08d: astore 7
      // 08f: bipush 0
      // 090: istore 5
      // 092: ldc "k\u0007êÞ\u008eÖ\u0097=rÛsÄM\u0086k\u0089\u0010N\u0015hù§>\u0015\t:¨Ö»\u001eôKË@ÉÔ\"ÜQå×A{#zéH\u0001M`aÉ\fâ\"w¼ÛA\u0087Ä¾k-6¶\u0018 ùº<1?\u008fFÁ\u009cc·ÔAp#5}°\u008e\n\u009d¡\u008aJf\u0096q`\u0010^(Å¼;ßÁþ\u0012)\u009evíç±\u009d\u008bÀõÆT^+7úÚµ«7ôH6·K\u0092?8a¼h\r\u0002\u0010ún!\u0088^æ¡\u0000\u009aE\u0010ª<®k\u00198A{@*XèB~\u0014\u0011û¹¨)Çå\tÐï£\u0086(å\u001e¤`\u0015\u0017ð\u0094±ø'¢J¤_\u009f\u0095å:\\í#`ÁÙ\u0012q\u0010Båmº\u0098Ó\u0010MM9ì(³ z\u0091\u0095\u00138°\u008d§ã8~\u0092w\u0002B9p-\u008e\u0096AÌ\u008b`\u0086}0ÜÏjPÄ1}ÝÊ\u009bæïß¨\u001cm=ý\u0081\\x«^Âê\u0091xR\u008eàY\nò³©´÷¬K(ÙÒ8ªÎ\u0095xç\b\u0017ó)3\\µE\u0016©kØò\u009a¯ñÓ¶p<²ÀÍø\u0013¦\u0084o\u0084J\u009d\u009f\u00180_tn\u0084\u0017_\u008aBFó\u0013Q$+\u009b\u0003fFv*À\u0010Ç"
      // 094: dup
      // 095: astore 4
      // 097: invokevirtual java/lang/String.length ()I
      // 09a: istore 6
      // 09c: bipush 16
      // 09e: istore 3
      // 09f: bipush -1
      // 0a0: istore 2
      // 0a1: iinc 2 1
      // 0a4: aload 4
      // 0a6: iload 2
      // 0a7: dup
      // 0a8: iload 3
      // 0a9: iadd
      // 0aa: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ad: bipush -1
      // 0ae: goto 11c
      // 0b1: aload 7
      // 0b3: swap
      // 0b4: iload 5
      // 0b6: iinc 5 1
      // 0b9: swap
      // 0ba: aastore
      // 0bb: iload 2
      // 0bc: iload 3
      // 0bd: iadd
      // 0be: dup
      // 0bf: istore 2
      // 0c0: iload 6
      // 0c2: if_icmpge 0cf
      // 0c5: aload 4
      // 0c7: iload 2
      // 0c8: invokevirtual java/lang/String.charAt (I)C
      // 0cb: istore 3
      // 0cc: goto 0a1
      // 0cf: ldc "°eI\u0087ñ~¢°¿Ioç\u0084ÆF\u0084 s\rÓ<\u0099Õ7Ýs»\u00ad\u0085?Öó'.KÉ_\u0019KEëæ \u0015\u0006\u0087(H½"
      // 0d1: dup
      // 0d2: astore 4
      // 0d4: invokevirtual java/lang/String.length ()I
      // 0d7: istore 6
      // 0d9: bipush 16
      // 0db: istore 3
      // 0dc: bipush -1
      // 0dd: istore 2
      // 0de: iinc 2 1
      // 0e1: aload 4
      // 0e3: iload 2
      // 0e4: dup
      // 0e5: iload 3
      // 0e6: iadd
      // 0e7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ea: bipush 0
      // 0eb: goto 11c
      // 0ee: aload 7
      // 0f0: swap
      // 0f1: iload 5
      // 0f3: iinc 5 1
      // 0f6: swap
      // 0f7: aastore
      // 0f8: iload 2
      // 0f9: iload 3
      // 0fa: iadd
      // 0fb: dup
      // 0fc: istore 2
      // 0fd: iload 6
      // 0ff: if_icmpge 10c
      // 102: aload 4
      // 104: iload 2
      // 105: invokevirtual java/lang/String.charAt (I)C
      // 108: istore 3
      // 109: goto 0de
      // 10c: aload 7
      // 10e: putstatic a0t.b [Ljava/lang/String;
      // 111: bipush 12
      // 113: anewarray 3
      // 116: putstatic a0t.c [Ljava/lang/String;
      // 119: goto 144
      // 11c: swap
      // 11d: ldc "ISO-8859-1"
      // 11f: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 122: aload 0
      // 123: swap
      // 124: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 127: astore 8
      // 129: aload 8
      // 12b: invokestatic a0t.a ([B)Ljava/lang/String;
      // 12e: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 131: swap
      // 132: tableswitch -129 0 0 -68
      // 144: new a0t$1
      // 147: dup
      // 148: sipush 29970
      // 14b: ldc2_w 1256714965293907039
      // 14e: lload 9
      // 150: lxor
      // 151: invokedynamic v (IJ)Ljava/lang/String; bsm=a0t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: nop
      // 157: bipush 0
      // 158: bipush -1
      // 159: invokespecial a0t$1.<init> (Ljava/lang/String;II)V
      // 15c: putstatic a0t.z8v La0t;
      // 15f: new a0t$2
      // 162: dup
      // 163: sipush 14476
      // 166: ldc2_w 1693068135014232522
      // 169: lload 9
      // 16b: lxor
      // 16c: invokedynamic v (IJ)Ljava/lang/String; bsm=a0t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: nop
      // 172: bipush 1
      // 173: bipush 0
      // 174: invokespecial a0t$2.<init> (Ljava/lang/String;II)V
      // 177: putstatic a0t.fwh La0t;
      // 17a: new a0t$3
      // 17d: dup
      // 17e: sipush 30394
      // 181: ldc2_w 8683796245452537853
      // 184: lload 9
      // 186: lxor
      // 187: invokedynamic v (IJ)Ljava/lang/String; bsm=a0t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: nop
      // 18d: bipush 2
      // 18e: bipush 1
      // 18f: invokespecial a0t$3.<init> (Ljava/lang/String;II)V
      // 192: putstatic a0t.nil La0t;
      // 195: new a0t$4
      // 198: dup
      // 199: sipush 31299
      // 19c: ldc2_w 8692974865990038275
      // 19f: lload 9
      // 1a1: lxor
      // 1a2: invokedynamic v (IJ)Ljava/lang/String; bsm=a0t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: nop
      // 1a8: bipush 3
      // 1a9: bipush 2
      // 1aa: invokespecial a0t$4.<init> (Ljava/lang/String;II)V
      // 1ad: putstatic a0t.le5 La0t;
      // 1b0: bipush 4
      // 1b1: anewarray 1
      // 1b4: dup
      // 1b5: bipush 0
      // 1b6: getstatic a0t.z8v La0t;
      // 1b9: aastore
      // 1ba: dup
      // 1bb: bipush 1
      // 1bc: getstatic a0t.fwh La0t;
      // 1bf: aastore
      // 1c0: dup
      // 1c1: bipush 2
      // 1c2: getstatic a0t.nil La0t;
      // 1c5: aastore
      // 1c6: dup
      // 1c7: bipush 3
      // 1c8: getstatic a0t.le5 La0t;
      // 1cb: aastore
      // 1cc: putstatic a0t.ygy [La0t;
      // 1cf: bipush -1
      // 1d0: putstatic a0t.uly I
      // 1d3: bipush 2
      // 1d4: putstatic a0t.u2c I
      // 1d7: getstatic a0t.u2c I
      // 1da: getstatic a0t.uly I
      // 1dd: isub
      // 1de: bipush 1
      // 1df: iadd
      // 1e0: anewarray 1
      // 1e3: putstatic a0t.su6 [La0t;
      // 1e6: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 1e9: putstatic a0t.mtt Ljava/util/Map;
      // 1ec: invokestatic a0t.values ()[La0t;
      // 1ef: astore 11
      // 1f1: aload 11
      // 1f3: arraylength
      // 1f4: istore 12
      // 1f6: bipush 0
      // 1f7: istore 13
      // 1f9: iload 13
      // 1fb: iload 12
      // 1fd: if_icmpge 3a3
      // 200: aload 11
      // 202: iload 13
      // 204: aaload
      // 205: astore 14
      // 207: aload 14
      // 209: invokevirtual a0t.jhj ()I
      // 20c: istore 15
      // 20e: iload 15
      // 210: getstatic a0t.uly I
      // 213: if_icmplt 225
      // 216: iload 15
      // 218: getstatic a0t.u2c I
      // 21b: if_icmple 255
      // 21e: goto 225
      // 221: invokestatic a0t.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 224: athrow
      // 225: new java/lang/Error
      // 228: dup
      // 229: new java/lang/StringBuilder
      // 22c: dup
      // 22d: invokespecial java/lang/StringBuilder.<init> ()V
      // 230: sipush 24799
      // 233: ldc2_w 9008998337699948945
      // 236: lload 9
      // 238: lxor
      // 239: invokedynamic v (IJ)Ljava/lang/String; bsm=a0t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: nop
      // 23f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 242: iload 15
      // 244: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 247: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 24d: invokespecial java/lang/Error.<init> (Ljava/lang/String;)V
      // 250: athrow
      // 251: invokestatic a0t.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 254: athrow
      // 255: getstatic a0t.su6 [La0t;
      // 258: iload 15
      // 25a: getstatic a0t.uly I
      // 25d: isub
      // 25e: aload 14
      // 260: aastore
      // 261: aload 14
      // 263: getfield a0t.soq Ljava/util/Map;
      // 266: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 26b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 270: astore 16
      // 272: aload 16
      // 274: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 279: ifeq 39d
      // 27c: aload 16
      // 27e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 283: checkcast qat
      // 286: astore 17
      // 288: aload 14
      // 28a: getfield a0t.soq Ljava/util/Map;
      // 28d: aload 17
      // 28f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 294: checkcast com/google/common/collect/BiMap
      // 297: invokeinterface com/google/common/collect/BiMap.values ()Ljava/util/Set; 1
      // 29c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2a1: astore 18
      // 2a3: aload 18
      // 2a5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2aa: ifeq 39a
      // 2ad: aload 18
      // 2af: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b4: checkcast java/lang/Class
      // 2b7: astore 19
      // 2b9: getstatic a0t.mtt Ljava/util/Map;
      // 2bc: aload 19
      // 2be: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 2c3: ifeq 33f
      // 2c6: getstatic a0t.mtt Ljava/util/Map;
      // 2c9: aload 19
      // 2cb: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2d0: aload 14
      // 2d2: if_acmpeq 33f
      // 2d5: goto 2dc
      // 2d8: invokestatic a0t.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2db: athrow
      // 2dc: new java/lang/Error
      // 2df: dup
      // 2e0: new java/lang/StringBuilder
      // 2e3: dup
      // 2e4: invokespecial java/lang/StringBuilder.<init> ()V
      // 2e7: sipush 20808
      // 2ea: ldc2_w 6172353515985508356
      // 2ed: lload 9
      // 2ef: lxor
      // 2f0: invokedynamic v (IJ)Ljava/lang/String; bsm=a0t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: nop
      // 2f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f9: aload 19
      // 2fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2fe: sipush 28819
      // 301: ldc2_w 5767676179535575511
      // 304: lload 9
      // 306: lxor
      // 307: invokedynamic v (IJ)Ljava/lang/String; bsm=a0t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30c: nop
      // 30d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 310: getstatic a0t.mtt Ljava/util/Map;
      // 313: aload 19
      // 315: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 31a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 31d: sipush 16351
      // 320: ldc2_w 7117137364409120410
      // 323: lload 9
      // 325: lxor
      // 326: invokedynamic v (IJ)Ljava/lang/String; bsm=a0t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: nop
      // 32c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32f: aload 14
      // 331: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 334: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 337: invokespecial java/lang/Error.<init> (Ljava/lang/String;)V
      // 33a: athrow
      // 33b: invokestatic a0t.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33e: athrow
      // 33f: aload 19
      // 341: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 344: pop
      // 345: goto 38a
      // 348: astore 20
      // 34a: new java/lang/Error
      // 34d: dup
      // 34e: new java/lang/StringBuilder
      // 351: dup
      // 352: invokespecial java/lang/StringBuilder.<init> ()V
      // 355: sipush 13237
      // 358: ldc2_w 5280798298199915255
      // 35b: lload 9
      // 35d: lxor
      // 35e: invokedynamic v (IJ)Ljava/lang/String; bsm=a0t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 363: nop
      // 364: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 367: aload 19
      // 369: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 36c: sipush 4307
      // 36f: ldc2_w 427503412435966352
      // 372: lload 9
      // 374: lxor
      // 375: invokedynamic v (IJ)Ljava/lang/String; bsm=a0t.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: nop
      // 37b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37e: aload 19
      // 380: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 383: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 386: invokespecial java/lang/Error.<init> (Ljava/lang/String;)V
      // 389: athrow
      // 38a: getstatic a0t.mtt Ljava/util/Map;
      // 38d: aload 19
      // 38f: aload 14
      // 391: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 396: pop
      // 397: goto 2a3
      // 39a: goto 272
      // 39d: iinc 13 1
      // 3a0: goto 1f9
      // 3a3: return
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17984;
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
            throw new RuntimeException("a0t", var10);
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
         throw new RuntimeException("a0t" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
