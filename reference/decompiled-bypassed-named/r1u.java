import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
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

public class r1u extends syv {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public r1u(GameProfile var1) {
      super(var1);
   }

   public r1u(JsonObject var1) {
      super(huj(var1), var1);
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
      // 00: getstatic r1u.a J
      // 03: ldc2_w 26674261466380
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: invokevirtual r1u.gma ()Ljava/lang/Object;
      // 11: ifnull 7e
      // 14: aload 1
      // 15: sipush 24429
      // 18: ldc2_w 8513657394079905946
      // 1b: lload 2
      // 1c: lxor
      // 1d: invokedynamic t (IJ)Ljava/lang/String; bsm=r1u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: nop
      // 23: aload 0
      // 24: invokevirtual r1u.gma ()Ljava/lang/Object;
      // 27: checkcast com/mojang/authlib/GameProfile
      // 2a: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 2d: iload 4
      // 2f: ifeq 57
      // 32: goto 39
      // 35: invokestatic r1u.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: ifnonnull 4d
      // 3c: goto 43
      // 3f: invokestatic r1u.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: ldc ""
      // 45: nop
      // 46: goto 5a
      // 49: invokestatic r1u.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 0
      // 4e: invokevirtual r1u.gma ()Ljava/lang/Object;
      // 51: checkcast com/mojang/authlib/GameProfile
      // 54: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 57: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 5a: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 5d: aload 1
      // 5e: sipush 30704
      // 61: ldc2_w 2388641378481639430
      // 64: lload 2
      // 65: lxor
      // 66: invokedynamic t (IJ)Ljava/lang/String; bsm=r1u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: nop
      // 6c: aload 0
      // 6d: invokevirtual r1u.gma ()Ljava/lang/Object;
      // 70: checkcast com/mojang/authlib/GameProfile
      // 73: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 76: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 79: aload 0
      // 7a: aload 1
      // 7b: invokespecial syv.jqb (Lcom/google/gson/JsonObject;)V
      // 7e: return
   }

   private static GameProfile huj(JsonObject param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic r1u.a J
      // 03: ldc2_w 107297282661188
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: sipush 22270
      // 10: ldc2_w 8185244375414912834
      // 13: lload 1
      // 14: lxor
      // 15: invokedynamic t (IJ)Ljava/lang/String; bsm=r1u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 1e: iload 3
      // 1f: ifne 50
      // 22: ifeq 9e
      // 25: goto 2c
      // 28: invokestatic r1u.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: sipush 25260
      // 30: ldc2_w 6042045525142602513
      // 33: lload 1
      // 34: lxor
      // 35: invokedynamic t (IJ)Ljava/lang/String; bsm=r1u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: iload 3
      // 3c: ifne 69
      // 3f: goto 46
      // 42: invokestatic r1u.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 49: goto 50
      // 4c: invokestatic r1u.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: ifeq 9e
      // 53: aload 0
      // 54: sipush 22270
      // 57: ldc2_w 8185244375414912834
      // 5a: lload 1
      // 5b: lxor
      // 5c: invokedynamic t (IJ)Ljava/lang/String; bsm=r1u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: goto 69
      // 65: invokestatic r1u.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 6c: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 6f: astore 4
      // 71: aload 4
      // 73: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 76: astore 5
      // 78: goto 7f
      // 7b: astore 6
      // 7d: aconst_null
      // 7e: areturn
      // 7f: new com/mojang/authlib/GameProfile
      // 82: dup
      // 83: aload 5
      // 85: aload 0
      // 86: sipush 25260
      // 89: ldc2_w 6042045525142602513
      // 8c: lload 1
      // 8d: lxor
      // 8e: invokedynamic t (IJ)Ljava/lang/String; bsm=r1u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: nop
      // 94: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 97: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 9a: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 9d: areturn
      // 9e: aconst_null
      // 9f: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6304822170894252431L, 6931065810262519781L, MethodHandles.lookup().lookupClass()).a(208654602253631L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 139626331121617L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "öD\u0083¸Ëm5©\u0084¤¹©\u0080\u008doÄ\u0010èö y\u008bhãÎÊ\f\u0090\u0004&\u009eÂ\u0081";
      int var8 = "öD\u0083¸Ëm5©\u0084¤¹©\u0080\u008doÄ\u0010èö y\u008bhãÎÊ\f\u0090\u0004&\u009eÂ\u0081".length();
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
                     c = new String[4];
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

                  var6 = "\u0014\u0093\u0090R¤ÄÓq\u0085 \u0010)^\u009eÆ&\u0010RßºÊ^kr\u0000\u0003\u008då\u008c½¤\u009b\u0096";
                  var8 = "\u0014\u0093\u0090R¤ÄÓq\u0085 \u0010)^\u009eÆ&\u0010RßºÊ^kr\u0000\u0003\u008då\u008c½¤\u009b\u0096".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8889;
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
            throw new RuntimeException("r1u", var10);
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
         throw new RuntimeException("r1u" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
