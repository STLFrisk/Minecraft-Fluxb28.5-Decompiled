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

public class zuz$sy1 implements JsonDeserializer, JsonSerializer {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public zuz deserialize(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zuz$sy1.a J
      // 003: ldc2_w 31898847636759
      // 006: lxor
      // 007: lstore 4
      // 009: aload 1
      // 00a: sipush 12878
      // 00d: ldc2_w 1595469950058442298
      // 010: lload 4
      // 012: lxor
      // 013: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 018: nop
      // 019: invokestatic f83._yv (Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 01c: astore 7
      // 01e: invokestatic t9d.b ()I
      // 021: new zuz
      // 024: dup
      // 025: invokespecial zuz.<init> ()V
      // 028: astore 8
      // 02a: istore 6
      // 02c: aload 7
      // 02e: sipush 23489
      // 031: ldc2_w 4777331447189292976
      // 034: lload 4
      // 036: lxor
      // 037: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: nop
      // 03d: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 040: iload 6
      // 042: ifeq 08f
      // 045: ifeq 07b
      // 048: goto 04f
      // 04b: invokestatic zuz$sy1.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 8
      // 051: aload 3
      // 052: aload 7
      // 054: sipush 1599
      // 057: ldc2_w 4002541085067975241
      // 05a: lload 4
      // 05c: lxor
      // 05d: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: nop
      // 063: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 066: ldc ekw
      // 068: nop
      // 069: invokeinterface com/google/gson/JsonDeserializationContext.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object; 3
      // 06e: checkcast ekw
      // 071: invokevirtual zuz.jby (Lekw;)V
      // 074: goto 07b
      // 077: invokestatic zuz$sy1.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 7
      // 07d: sipush 27419
      // 080: ldc2_w 1727845449489512302
      // 083: lload 4
      // 085: lxor
      // 086: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: nop
      // 08c: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 08f: iload 6
      // 091: ifeq 0de
      // 094: ifeq 0ca
      // 097: goto 09e
      // 09a: invokestatic zuz$sy1.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 8
      // 0a0: aload 3
      // 0a1: aload 7
      // 0a3: sipush 30012
      // 0a6: ldc2_w 8659780020019947851
      // 0a9: lload 4
      // 0ab: lxor
      // 0ac: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: nop
      // 0b2: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0b5: ldc zuz$fkd
      // 0b7: nop
      // 0b8: invokeinterface com/google/gson/JsonDeserializationContext.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object; 3
      // 0bd: checkcast zuz$fkd
      // 0c0: invokevirtual zuz.n6v (Lzuz$fkd;)V
      // 0c3: goto 0ca
      // 0c6: invokestatic zuz$sy1.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 7
      // 0cc: sipush 32211
      // 0cf: ldc2_w 2810676706592678319
      // 0d2: lload 4
      // 0d4: lxor
      // 0d5: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: nop
      // 0db: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 0de: iload 6
      // 0e0: ifeq 12d
      // 0e3: ifeq 119
      // 0e6: goto 0ed
      // 0e9: invokestatic zuz$sy1.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 8
      // 0ef: aload 3
      // 0f0: aload 7
      // 0f2: sipush 22243
      // 0f5: ldc2_w 4532013013164673680
      // 0f8: lload 4
      // 0fa: lxor
      // 0fb: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: nop
      // 101: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 104: ldc zuz$hr7
      // 106: nop
      // 107: invokeinterface com/google/gson/JsonDeserializationContext.deserialize (Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object; 3
      // 10c: checkcast zuz$hr7
      // 10f: invokevirtual zuz.k9v (Lzuz$hr7;)V
      // 112: goto 119
      // 115: invokestatic zuz$sy1.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 7
      // 11b: sipush 19272
      // 11e: ldc2_w 8776665722326931258
      // 121: lload 4
      // 123: lxor
      // 124: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: nop
      // 12a: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 12d: ifeq 150
      // 130: aload 8
      // 132: aload 7
      // 134: sipush 15418
      // 137: ldc2_w 3987551043955662922
      // 13a: lload 4
      // 13c: lxor
      // 13d: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: nop
      // 143: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 146: invokevirtual zuz.wli (Ljava/lang/String;)V
      // 149: goto 150
      // 14c: invokestatic zuz$sy1.a (Loov;)Loov;
      // 14f: athrow
      // 150: aload 8
      // 152: areturn
   }

   public JsonElement c6n(zuz param1, Type param2, JsonSerializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic zuz$sy1.a J
      // 03: ldc2_w 121599855698667
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.c ()I
      // 0c: istore 6
      // 0e: new com/google/gson/JsonObject
      // 11: dup
      // 12: invokespecial com/google/gson/JsonObject.<init> ()V
      // 15: astore 7
      // 17: aload 1
      // 18: iload 6
      // 1a: ifne 50
      // 1d: invokevirtual zuz.q40 ()Lekw;
      // 20: ifnull 4f
      // 23: goto 2a
      // 26: invokestatic zuz$sy1.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 7
      // 2c: sipush 1599
      // 2f: ldc2_w 4002453713199125941
      // 32: lload 4
      // 34: lxor
      // 35: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: aload 3
      // 3c: aload 1
      // 3d: invokevirtual zuz.q40 ()Lekw;
      // 40: invokeinterface com/google/gson/JsonSerializationContext.serialize (Ljava/lang/Object;)Lcom/google/gson/JsonElement; 2
      // 45: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 48: goto 4f
      // 4b: invokestatic zuz$sy1.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 1
      // 50: iload 6
      // 52: ifne 88
      // 55: invokevirtual zuz.qor ()Lzuz$fkd;
      // 58: ifnull 87
      // 5b: goto 62
      // 5e: invokestatic zuz$sy1.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 7
      // 64: sipush 30012
      // 67: ldc2_w 8659801481548867255
      // 6a: lload 4
      // 6c: lxor
      // 6d: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: nop
      // 73: aload 3
      // 74: aload 1
      // 75: invokevirtual zuz.qor ()Lzuz$fkd;
      // 78: invokeinterface com/google/gson/JsonSerializationContext.serialize (Ljava/lang/Object;)Lcom/google/gson/JsonElement; 2
      // 7d: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 80: goto 87
      // 83: invokestatic zuz$sy1.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 1
      // 88: iload 6
      // 8a: ifne c0
      // 8d: invokevirtual zuz.mbk ()Lzuz$hr7;
      // 90: ifnull bf
      // 93: goto 9a
      // 96: invokestatic zuz$sy1.a (Loov;)Loov;
      // 99: athrow
      // 9a: aload 7
      // 9c: sipush 22243
      // 9f: ldc2_w 4531890378515645804
      // a2: lload 4
      // a4: lxor
      // a5: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: nop
      // ab: aload 3
      // ac: aload 1
      // ad: invokevirtual zuz.mbk ()Lzuz$hr7;
      // b0: invokeinterface com/google/gson/JsonSerializationContext.serialize (Ljava/lang/Object;)Lcom/google/gson/JsonElement; 2
      // b5: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // b8: goto bf
      // bb: invokestatic zuz$sy1.a (Loov;)Loov;
      // be: athrow
      // bf: aload 1
      // c0: invokevirtual zuz.jbn ()Ljava/lang/String;
      // c3: ifnull e5
      // c6: aload 7
      // c8: sipush 15418
      // cb: ldc2_w 3987606615853920182
      // ce: lload 4
      // d0: lxor
      // d1: invokedynamic v (IJ)Ljava/lang/String; bsm=zuz$sy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: nop
      // d7: aload 1
      // d8: invokevirtual zuz.jbn ()Ljava/lang/String;
      // db: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // de: goto e5
      // e1: invokestatic zuz$sy1.a (Loov;)Loov;
      // e4: athrow
      // e5: aload 7
      // e7: areturn
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.c6n((zuz)var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5818313295671748700L, 1958288504891629643L, MethodHandles.lookup().lookupClass()).a(110392132017229L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 81873379909826L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "--Ó\u0083yL\u000f\u0091Äµq\u0013Sãg¢\u0010<\u0011!\u0081kD:3\u008b\u000b\u0089\u0017Í]³\u0002 (VÏi\u0005W\u008eF\u008c+9iÀÜù¹ùÉbcóIJ]\u001eÚ\u0091Ö[0Ã\u009d\u00103=.\u0097\u0007\u0080ÜílÂ[;Vøþ§\u0010¢Iõ\t&TèÜ\nøò\u0098çs{\\ JD£1L\u0081w\u001e~GP«ñÒü\u0000ÜÆ\u008eßó}\u0002½P¥ià\u001aáË \u0010ã\u00adÀÃä\b\u0096Â\u009dÉK·A)!\u0017";
      int var8 = "--Ó\u0083yL\u000f\u0091Äµq\u0013Sãg¢\u0010<\u0011!\u0081kD:3\u008b\u000b\u0089\u0017Í]³\u0002 (VÏi\u0005W\u008eF\u008c+9iÀÜù¹ùÉbcóIJ]\u001eÚ\u0091Ö[0Ã\u009d\u00103=.\u0097\u0007\u0080ÜílÂ[;Vøþ§\u0010¢Iõ\t&TèÜ\nøò\u0098çs{\\ JD£1L\u0081w\u001e~GP«ñÒü\u0000ÜÆ\u008eßó}\u0002½P¥ià\u001aáË \u0010ã\u00adÀÃä\b\u0096Â\u009dÉK·A)!\u0017"
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
                     c = new String[9];
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

                  var6 = "íçf\u0017*<«¦\u0085aõ%\u0088\u009aò\u009c\u0010ù\rW¤ò\u0015t¿\tì4|÷r#ã";
                  var8 = "íçf\u0017*<«¦\u0085aõ%\u0088\u009aò\u009c\u0010ù\rW¤ò\u0015t¿\tì4|÷r#ã".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16635;
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
            throw new RuntimeException("zuz$sy1", var10);
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
         throw new RuntimeException("zuz$sy1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
