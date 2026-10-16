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

public class zuz$fkd$rz1 implements JsonDeserializer, JsonSerializer {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public zuz$fkd deserialize(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zuz$fkd$rz1.a J
      // 003: ldc2_w 119452446183874
      // 006: lxor
      // 007: lstore 4
      // 009: aload 1
      // 00a: sipush 18813
      // 00d: ldc2_w 1210251081562452141
      // 010: lload 4
      // 012: lxor
      // 013: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 018: nop
      // 019: invokestatic f83._yv (Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 01c: astore 7
      // 01e: invokestatic t9d.b ()I
      // 021: new zuz$fkd
      // 024: dup
      // 025: aload 7
      // 027: sipush 12550
      // 02a: ldc2_w 1123832930596260060
      // 02d: lload 4
      // 02f: lxor
      // 030: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: invokestatic f83.z2p (Lcom/google/gson/JsonObject;Ljava/lang/String;)I
      // 039: aload 7
      // 03b: sipush 21724
      // 03e: ldc2_w 67890297273838853
      // 041: lload 4
      // 043: lxor
      // 044: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: nop
      // 04a: invokestatic f83.z2p (Lcom/google/gson/JsonObject;Ljava/lang/String;)I
      // 04d: invokespecial zuz$fkd.<init> (II)V
      // 050: astore 8
      // 052: istore 6
      // 054: aload 7
      // 056: sipush 25107
      // 059: ldc2_w 4270066768418954182
      // 05c: lload 4
      // 05e: lxor
      // 05f: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: nop
      // 065: iload 6
      // 067: ifeq 08f
      // 06a: invokestatic f83.yrq (Lcom/google/gson/JsonObject;Ljava/lang/String;)Z
      // 06d: ifeq 14d
      // 070: goto 077
      // 073: invokestatic zuz$fkd$rz1.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 7
      // 079: sipush 30240
      // 07c: ldc2_w 8592512306338516978
      // 07f: lload 4
      // 081: lxor
      // 082: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: nop
      // 088: goto 08f
      // 08b: invokestatic zuz$fkd$rz1.a (Loov;)Loov;
      // 08e: athrow
      // 08f: invokestatic f83.k68 (Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 092: astore 9
      // 094: aload 9
      // 096: invokevirtual com/google/gson/JsonArray.size ()I
      // 099: iload 6
      // 09b: ifeq 0b4
      // 09e: ifle 14d
      // 0a1: goto 0a8
      // 0a4: invokestatic zuz$fkd$rz1.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 9
      // 0aa: invokevirtual com/google/gson/JsonArray.size ()I
      // 0ad: goto 0b4
      // 0b0: invokestatic zuz$fkd$rz1.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: anewarray 58
      // 0b7: astore 10
      // 0b9: bipush 0
      // 0ba: istore 11
      // 0bc: iload 11
      // 0be: aload 10
      // 0c0: arraylength
      // 0c1: if_icmpge 146
      // 0c4: aload 9
      // 0c6: iload 11
      // 0c8: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 0cb: new java/lang/StringBuilder
      // 0ce: dup
      // 0cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d2: sipush 15057
      // 0d5: ldc2_w 7890728824409654018
      // 0d8: lload 4
      // 0da: lxor
      // 0db: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: nop
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e4: iload 11
      // 0e6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e9: ldc "]"
      // 0eb: nop
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f2: invokestatic f83._yv (Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 0f5: astore 12
      // 0f7: aload 12
      // 0f9: sipush 3382
      // 0fc: ldc2_w 3852394330090386658
      // 0ff: lload 4
      // 101: lxor
      // 102: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: nop
      // 108: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 10b: astore 13
      // 10d: aload 10
      // 10f: iload 11
      // 111: new com/mojang/authlib/GameProfile
      // 114: dup
      // 115: aload 13
      // 117: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 11a: aload 12
      // 11c: sipush 24029
      // 11f: ldc2_w 1665421161740723212
      // 122: lload 4
      // 124: lxor
      // 125: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: nop
      // 12b: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 12e: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 131: aastore
      // 132: iinc 11 1
      // 135: iload 6
      // 137: ifeq 14d
      // 13a: iload 6
      // 13c: ifne 0bc
      // 13f: goto 146
      // 142: invokestatic zuz$fkd$rz1.a (Loov;)Loov;
      // 145: athrow
      // 146: aload 8
      // 148: aload 10
      // 14a: invokevirtual zuz$fkd.vy7 ([Lcom/mojang/authlib/GameProfile;)V
      // 14d: aload 8
      // 14f: areturn
   }

   public JsonElement nfs(zuz$fkd param1, Type param2, JsonSerializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zuz$fkd$rz1.a J
      // 003: ldc2_w 15317696657229
      // 006: lxor
      // 007: lstore 4
      // 009: new com/google/gson/JsonObject
      // 00c: dup
      // 00d: invokespecial com/google/gson/JsonObject.<init> ()V
      // 010: astore 7
      // 012: invokestatic t9d.b ()I
      // 015: aload 7
      // 017: sipush 10958
      // 01a: ldc2_w 9132337043376043417
      // 01d: lload 4
      // 01f: lxor
      // 020: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: nop
      // 026: aload 1
      // 027: invokevirtual zuz$fkd.own ()I
      // 02a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 02d: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 030: istore 6
      // 032: aload 7
      // 034: iload 6
      // 036: ifeq 11f
      // 039: sipush 20327
      // 03c: ldc2_w 8256031953599729726
      // 03f: lload 4
      // 041: lxor
      // 042: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: nop
      // 048: aload 1
      // 049: invokevirtual zuz$fkd.ryi ()I
      // 04c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 04f: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 052: aload 1
      // 053: invokevirtual zuz$fkd.kpx ()[Lcom/mojang/authlib/GameProfile;
      // 056: ifnull 11d
      // 059: goto 060
      // 05c: invokestatic zuz$fkd$rz1.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 1
      // 061: invokevirtual zuz$fkd.kpx ()[Lcom/mojang/authlib/GameProfile;
      // 064: arraylength
      // 065: ifle 11d
      // 068: goto 06f
      // 06b: invokestatic zuz$fkd$rz1.a (Loov;)Loov;
      // 06e: athrow
      // 06f: new com/google/gson/JsonArray
      // 072: dup
      // 073: invokespecial com/google/gson/JsonArray.<init> ()V
      // 076: astore 8
      // 078: bipush 0
      // 079: istore 9
      // 07b: iload 9
      // 07d: aload 1
      // 07e: invokevirtual zuz$fkd.kpx ()[Lcom/mojang/authlib/GameProfile;
      // 081: arraylength
      // 082: if_icmpge 107
      // 085: new com/google/gson/JsonObject
      // 088: dup
      // 089: invokespecial com/google/gson/JsonObject.<init> ()V
      // 08c: astore 10
      // 08e: aload 1
      // 08f: invokevirtual zuz$fkd.kpx ()[Lcom/mojang/authlib/GameProfile;
      // 092: iload 9
      // 094: aaload
      // 095: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 098: astore 11
      // 09a: aload 10
      // 09c: sipush 4203
      // 09f: ldc2_w 2251954711217819443
      // 0a2: lload 4
      // 0a4: lxor
      // 0a5: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: nop
      // 0ab: iload 6
      // 0ad: ifeq 118
      // 0b0: aload 11
      // 0b2: iload 6
      // 0b4: ifeq 0d4
      // 0b7: goto 0be
      // 0ba: invokestatic zuz$fkd$rz1.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: ifnonnull 0d2
      // 0c1: goto 0c8
      // 0c4: invokestatic zuz$fkd$rz1.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: ldc ""
      // 0ca: nop
      // 0cb: goto 0d7
      // 0ce: invokestatic zuz$fkd$rz1.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 11
      // 0d4: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 0d7: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0da: aload 10
      // 0dc: sipush 13179
      // 0df: ldc2_w 1083857870714629167
      // 0e2: lload 4
      // 0e4: lxor
      // 0e5: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: nop
      // 0eb: aload 1
      // 0ec: invokevirtual zuz$fkd.kpx ()[Lcom/mojang/authlib/GameProfile;
      // 0ef: iload 9
      // 0f1: aaload
      // 0f2: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 0f5: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0f8: aload 8
      // 0fa: aload 10
      // 0fc: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 0ff: iinc 9 1
      // 102: iload 6
      // 104: ifne 07b
      // 107: aload 7
      // 109: sipush 30240
      // 10c: ldc2_w 8592548271769758077
      // 10f: lload 4
      // 111: lxor
      // 112: invokedynamic m (IJ)Ljava/lang/String; bsm=zuz$fkd$rz1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: nop
      // 118: aload 8
      // 11a: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 11d: aload 7
      // 11f: areturn
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.nfs((zuz$fkd)var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3412567238839160035L, -4531480460917895064L, MethodHandles.lookup().lookupClass()).a(222492002093946L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100423575891842L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "\u008c¨¯*§{÷ã$÷jÕnM\u0011$\u0010_¼óÉ°,> òã\u0083ÍÊueN\u0010\u008eÛ\u00adäÝP\u001dëëII®¤@Òå\u0010\u0087[b$d\u001b^ø\u00805L\u008dò\b}w\u0010D\\Ä_m\u0015°ØIi:iWý»k\u00101å\u0084PÃ\u008c4(Oß'\u0018\u0018!VÜ\u0010%ø\u0093³:e¦á\u009e\u00ad\u0005\u009f\u00838»\u0012\u00102@|\u0083\u0012N)\u0096\"Dä\u0087æ\u00advv\u0010Å}PKç-/Z\\Â\"ÇÒ¯û\u0083\u0010\u008cr\u0093\ba\u0098Áí<\u0004Gb\u0006B\u0087¦";
      int var8 = "\u008c¨¯*§{÷ã$÷jÕnM\u0011$\u0010_¼óÉ°,> òã\u0083ÍÊueN\u0010\u008eÛ\u00adäÝP\u001dëëII®¤@Òå\u0010\u0087[b$d\u001b^ø\u00805L\u008dò\b}w\u0010D\\Ä_m\u0015°ØIi:iWý»k\u00101å\u0084PÃ\u008c4(Oß'\u0018\u0018!VÜ\u0010%ø\u0093³:e¦á\u009e\u00ad\u0005\u009f\u00838»\u0012\u00102@|\u0083\u0012N)\u0096\"Dä\u0087æ\u00advv\u0010Å}PKç-/Z\\Â\"ÇÒ¯û\u0083\u0010\u008cr\u0093\ba\u0098Áí<\u0004Gb\u0006B\u0087¦"
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
                     c = new String[12];
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

                  var6 = "írRaW¡j\u0016ñ\u009a¾N?=6\f\u0010oW'¾·Ç\u0085\u0014~éÏ·\u0018\u0095Ýe";
                  var8 = "írRaW¡j\u0016ñ\u009a¾N?=6\f\u0010oW'¾·Ç\u0085\u0014~éÏ·\u0018\u0095Ýe".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13769;
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
            throw new RuntimeException("zuz$fkd$rz1", var10);
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
         throw new RuntimeException("zuz$fkd$rz1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
