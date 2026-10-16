import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class zc4 extends syv {
   public static final SimpleDateFormat sq9;
   public final Date vac;
   public final String nk9;
   public final Date xay;
   public final String zyo;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public zc4(Object param1, Date param2, String param3, Date param4, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic zc4.b J
      // 03: ldc2_w 134385737414964
      // 06: lxor
      // 07: lstore 6
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: istore 8
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokespecial syv.<init> (Ljava/lang/Object;)V
      // 13: aload 0
      // 14: aload 2
      // 15: iload 8
      // 17: ifeq 2b
      // 1a: ifnonnull 2e
      // 1d: new java/util/Date
      // 20: dup
      // 21: invokespecial java/util/Date.<init> ()V
      // 24: goto 2b
      // 27: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: goto 2f
      // 2e: aload 2
      // 2f: putfield zc4.vac Ljava/util/Date;
      // 32: aload 0
      // 33: aload 3
      // 34: iload 8
      // 36: ifeq 59
      // 39: ifnonnull 5c
      // 3c: goto 43
      // 3f: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: sipush 2053
      // 46: ldc2_w 6381817970033395254
      // 49: lload 6
      // 4b: lxor
      // 4c: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: nop
      // 52: goto 59
      // 55: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: goto 5d
      // 5c: aload 3
      // 5d: putfield zc4.nk9 Ljava/lang/String;
      // 60: aload 0
      // 61: aload 4
      // 63: putfield zc4.xay Ljava/util/Date;
      // 66: aload 0
      // 67: aload 5
      // 69: iload 8
      // 6b: ifeq 8e
      // 6e: ifnonnull 91
      // 71: goto 78
      // 74: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: sipush 3306
      // 7b: ldc2_w 869187030522135263
      // 7e: lload 6
      // 80: lxor
      // 81: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: nop
      // 87: goto 8e
      // 8a: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: goto 93
      // 91: aload 5
      // 93: putfield zc4.zyo Ljava/lang/String;
      // 96: return
   }

   public zc4(Object param1, JsonObject param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zc4.b J
      // 003: ldc2_w 108249566886752
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: aload 1
      // 00f: aload 2
      // 010: invokespecial syv.<init> (Ljava/lang/Object;Lcom/google/gson/JsonObject;)V
      // 013: aload 2
      // 014: sipush 20555
      // 017: ldc2_w 7313400011573484591
      // 01a: lload 3
      // 01b: lxor
      // 01c: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 021: nop
      // 022: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 025: ifeq 046
      // 028: getstatic zc4.sq9 Ljava/text/SimpleDateFormat;
      // 02b: aload 2
      // 02c: sipush 20555
      // 02f: ldc2_w 7313400011573484591
      // 032: lload 3
      // 033: lxor
      // 034: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: nop
      // 03a: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 03d: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 040: invokevirtual java/text/SimpleDateFormat.parse (Ljava/lang/String;)Ljava/util/Date;
      // 043: goto 04d
      // 046: new java/util/Date
      // 049: dup
      // 04a: invokespecial java/util/Date.<init> ()V
      // 04d: astore 6
      // 04f: goto 05d
      // 052: astore 7
      // 054: new java/util/Date
      // 057: dup
      // 058: invokespecial java/util/Date.<init> ()V
      // 05b: astore 6
      // 05d: aload 0
      // 05e: aload 6
      // 060: putfield zc4.vac Ljava/util/Date;
      // 063: aload 0
      // 064: aload 2
      // 065: sipush 22892
      // 068: ldc2_w 3837586098354345217
      // 06b: lload 3
      // 06c: lxor
      // 06d: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: nop
      // 073: iload 5
      // 075: ifeq 09b
      // 078: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 07b: ifeq 0a4
      // 07e: goto 085
      // 081: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: aload 2
      // 086: sipush 22892
      // 089: ldc2_w 3837586098354345217
      // 08c: lload 3
      // 08d: lxor
      // 08e: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: nop
      // 094: goto 09b
      // 097: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 09e: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 0a1: goto 0b2
      // 0a4: sipush 15223
      // 0a7: ldc2_w 9184823901407459090
      // 0aa: lload 3
      // 0ab: lxor
      // 0ac: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: nop
      // 0b2: putfield zc4.nk9 Ljava/lang/String;
      // 0b5: aload 2
      // 0b6: sipush 3192
      // 0b9: ldc2_w 4091095602863636503
      // 0bc: lload 3
      // 0bd: lxor
      // 0be: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: nop
      // 0c4: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 0c7: ifeq 0e8
      // 0ca: getstatic zc4.sq9 Ljava/text/SimpleDateFormat;
      // 0cd: aload 2
      // 0ce: sipush 3192
      // 0d1: ldc2_w 4091095602863636503
      // 0d4: lload 3
      // 0d5: lxor
      // 0d6: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: nop
      // 0dc: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0df: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 0e2: invokevirtual java/text/SimpleDateFormat.parse (Ljava/lang/String;)Ljava/util/Date;
      // 0e5: goto 0e9
      // 0e8: aconst_null
      // 0e9: astore 7
      // 0eb: goto 0f3
      // 0ee: astore 8
      // 0f0: aconst_null
      // 0f1: astore 7
      // 0f3: aload 0
      // 0f4: aload 7
      // 0f6: putfield zc4.xay Ljava/util/Date;
      // 0f9: aload 0
      // 0fa: aload 2
      // 0fb: sipush 19031
      // 0fe: ldc2_w 6300273020639331901
      // 101: lload 3
      // 102: lxor
      // 103: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: nop
      // 109: iload 5
      // 10b: ifeq 131
      // 10e: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 111: ifeq 13a
      // 114: goto 11b
      // 117: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: aload 2
      // 11c: sipush 19031
      // 11f: ldc2_w 6300273020639331901
      // 122: lload 3
      // 123: lxor
      // 124: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: nop
      // 12a: goto 131
      // 12d: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 134: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 137: goto 148
      // 13a: sipush 20485
      // 13d: ldc2_w 1856568719015959655
      // 140: lload 3
      // 141: lxor
      // 142: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: nop
      // 148: putfield zc4.zyo Ljava/lang/String;
      // 14b: return
   }

   public Date d6d() {
      return this.xay;
   }

   public String x2c() {
      return this.zyo;
   }

   @Override
   public boolean z6q() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield zc4.xay Ljava/util/Date;
      // 08: iload 1
      // 09: ifne 22
      // 0c: ifnonnull 1e
      // 0f: goto 16
      // 12: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 0
      // 17: goto 2c
      // 1a: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield zc4.xay Ljava/util/Date;
      // 22: new java/util/Date
      // 25: dup
      // 26: invokespecial java/util/Date.<init> ()V
      // 29: invokevirtual java/util/Date.before (Ljava/util/Date;)Z
      // 2c: ireturn
   }

   @Override
   public void jqb(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic zc4.b J
      // 03: ldc2_w 7509592060770
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: sipush 23498
      // 11: ldc2_w 5466669600970366884
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: getstatic zc4.sq9 Ljava/text/SimpleDateFormat;
      // 1f: aload 0
      // 20: getfield zc4.vac Ljava/util/Date;
      // 23: iload 4
      // 25: ifeq 7d
      // 28: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 2b: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 2e: aload 1
      // 2f: sipush 30978
      // 32: ldc2_w 3215463480863325542
      // 35: lload 2
      // 36: lxor
      // 37: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: nop
      // 3d: aload 0
      // 3e: getfield zc4.nk9 Ljava/lang/String;
      // 41: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 44: aload 1
      // 45: sipush 2974
      // 48: ldc2_w 6384484198677942268
      // 4b: lload 2
      // 4c: lxor
      // 4d: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: nop
      // 53: aload 0
      // 54: getfield zc4.xay Ljava/util/Date;
      // 57: ifnonnull 76
      // 5a: goto 61
      // 5d: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: sipush 21814
      // 64: ldc2_w 65222645389054295
      // 67: lload 2
      // 68: lxor
      // 69: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: nop
      // 6f: goto 80
      // 72: invokestatic zc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: getstatic zc4.sq9 Ljava/text/SimpleDateFormat;
      // 79: aload 0
      // 7a: getfield zc4.xay Ljava/util/Date;
      // 7d: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 80: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 83: aload 1
      // 84: sipush 1346
      // 87: ldc2_w 7299710208276693291
      // 8a: lload 2
      // 8b: lxor
      // 8c: invokedynamic n (IJ)Ljava/lang/String; bsm=zc4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: nop
      // 92: aload 0
      // 93: getfield zc4.zyo Ljava/lang/String;
      // 96: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 99: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2187996973858050531L, 3100111016120558256L, MethodHandles.lookup().lookupClass()).a(199398147253004L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 7669713943059L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[14];
      int var5 = 0;
      String var4 = "V\"\u0089\u0092Ä\tO'îO\u000e;,àjv ¦\u0082{C·p5Ü~Ò\u000e\u0016¦t\u0088ªG\u0013L\u0087\u0011} k&ÑG\u009b\u009b#»\u0011\u0010])±ªÎó\u0087Ì\fuõÞiîd7 É«\u0001\u008ehªõ#R\u001f^\u0093:ïá¦\nÝû¿éO\u001c¡xv.\u0004s\u0096_e((nÌXhdó<[\u001a\u0090®ÊË&?Í\u000eØËçÑ¾\u0001\u0016\u008e_Ø\u0087HöýÕðð¦\u0017\rî\u0017\u0010JZ\u0080d¾d\u0088]\u0014J±§\u0089\u0088L£\u0010·\u00842ùþ$ÄøÇ×Zo ëöÞ(tð\u0094ãOeÄsRïÅò,]\u000f\u0019»<u*wxfªm'\u0017\u001d7\u0096\nI1Ñ\u0089e\u0005o©´(æo\u0094Kê\f'.±©&I\u0096ÌÍÍ/¼\u0085hH+\u0012ê§îÆé\u0097ô:z4¹º\u0015\u001a\u001aî\u0084\u0010R÷w\u0003\u0014èg\b~$\u0012oº/2Á\u0010\b3Ú·Tfþ\u008añ4V8í\u008b4\u008a\u0010D¤\u0094è5Mk7 a+Jóï\u007fp";
      int var6 = "V\"\u0089\u0092Ä\tO'îO\u000e;,àjv ¦\u0082{C·p5Ü~Ò\u000e\u0016¦t\u0088ªG\u0013L\u0087\u0011} k&ÑG\u009b\u009b#»\u0011\u0010])±ªÎó\u0087Ì\fuõÞiîd7 É«\u0001\u008ehªõ#R\u001f^\u0093:ïá¦\nÝû¿éO\u001c¡xv.\u0004s\u0096_e((nÌXhdó<[\u001a\u0090®ÊË&?Í\u000eØËçÑ¾\u0001\u0016\u008e_Ø\u0087HöýÕðð¦\u0017\rî\u0017\u0010JZ\u0080d¾d\u0088]\u0014J±§\u0089\u0088L£\u0010·\u00842ùþ$ÄøÇ×Zo ëöÞ(tð\u0094ãOeÄsRïÅò,]\u000f\u0019»<u*wxfªm'\u0017\u001d7\u0096\nI1Ñ\u0089e\u0005o©´(æo\u0094Kê\f'.±©&I\u0096ÌÍÍ/¼\u0085hH+\u0012ê§îÆé\u0097ô:z4¹º\u0015\u001a\u001aî\u0084\u0010R÷w\u0003\u0014èg\b~$\u0012oº/2Á\u0010\b3Ú·Tfþ\u008añ4V8í\u008b4\u008a\u0010D¤\u0094è5Mk7 a+Jóï\u007fp"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     c = var7;
                     d = new String[14];
                     sq9 = new SimpleDateFormat(a<"n">(30632, 4491280317589781173L ^ var9));
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "ß\u0098ö\u009exêuN7U³?.¤Ñ?\u0010\u0000A\u0005}'\u0087küßª«¸¡ÏDý";
                  var6 = "ß\u0098ö\u009exêuN7U³?.¤Ñ?\u0010\u0000A\u0005}'\u0087küßª«¸¡ÏDý".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16681;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("zc4", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("zc4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
