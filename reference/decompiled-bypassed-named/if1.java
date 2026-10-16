import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
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

public class if1 {
   private final a83 uwx = new c8g();
   private final GsonBuilder vmg = new GsonBuilder();
   private Gson ysx;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public if1() {
      this.vmg.registerTypeHierarchyAdapter(ekw.class, new ekw$szt());
      this.vmg.registerTypeHierarchyAdapter(poy.class, new poy$vcg());
      this.vmg.registerTypeAdapterFactory(new lhs());
   }

   public void _0e(a8z var1, Class var2) {
      this.uwx.emn(var1.xtu(), new if1$so3(this, var1, var2, null));
      this.vmg.registerTypeAdapter(var2, var1);
      this.ysx = null;
   }

   public z08 oom(String param1, JsonObject param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic if1.a J
      // 003: ldc2_w 93101083939130
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 1
      // 00e: ifnonnull 02b
      // 011: new java/lang/IllegalArgumentException
      // 014: dup
      // 015: sipush 32751
      // 018: ldc2_w 708755269618027956
      // 01b: lload 3
      // 01c: lxor
      // 01d: invokedynamic v (IJ)Ljava/lang/String; bsm=if1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: nop
      // 023: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 026: athrow
      // 027: invokestatic if1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02a: athrow
      // 02b: aload 2
      // 02c: aload 1
      // 02d: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 030: iload 5
      // 032: ifeq 05c
      // 035: ifne 048
      // 038: goto 03f
      // 03b: invokestatic if1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03e: athrow
      // 03f: aconst_null
      // 040: checkcast z08
      // 043: areturn
      // 044: invokestatic if1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 047: athrow
      // 048: aload 2
      // 049: aload 1
      // 04a: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 04d: iload 5
      // 04f: ifeq 0ad
      // 052: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 055: goto 05c
      // 058: invokestatic if1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05b: athrow
      // 05c: ifne 0a3
      // 05f: new java/lang/IllegalArgumentException
      // 062: dup
      // 063: new java/lang/StringBuilder
      // 066: dup
      // 067: invokespecial java/lang/StringBuilder.<init> ()V
      // 06a: sipush 19456
      // 06d: ldc2_w 1109673760157400664
      // 070: lload 3
      // 071: lxor
      // 072: invokedynamic v (IJ)Ljava/lang/String; bsm=if1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: nop
      // 078: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07b: aload 1
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: sipush 31796
      // 082: ldc2_w 7327541996028743278
      // 085: lload 3
      // 086: lxor
      // 087: invokedynamic v (IJ)Ljava/lang/String; bsm=if1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: nop
      // 08d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 090: aload 2
      // 091: aload 1
      // 092: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 095: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 098: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 09e: athrow
      // 09f: invokestatic if1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield if1.uwx La83;
      // 0a7: aload 1
      // 0a8: invokeinterface a83._gz (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0ad: checkcast if1$so3
      // 0b0: astore 6
      // 0b2: aload 6
      // 0b4: iload 5
      // 0b6: ifeq 105
      // 0b9: ifnonnull 0f4
      // 0bc: goto 0c3
      // 0bf: invokestatic if1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: new java/lang/IllegalArgumentException
      // 0c6: dup
      // 0c7: new java/lang/StringBuilder
      // 0ca: dup
      // 0cb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ce: sipush 29281
      // 0d1: ldc2_w 763092171052466232
      // 0d4: lload 3
      // 0d5: lxor
      // 0d6: invokedynamic v (IJ)Ljava/lang/String; bsm=if1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: nop
      // 0dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0df: aload 1
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e3: ldc "'"
      // 0e5: nop
      // 0e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ec: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ef: athrow
      // 0f0: invokestatic if1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: invokespecial if1.rwb ()Lcom/google/gson/Gson;
      // 0f8: aload 2
      // 0f9: aload 1
      // 0fa: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 0fd: aload 6
      // 0ff: getfield if1$so3.re6 Ljava/lang/Class;
      // 102: invokevirtual com/google/gson/Gson.fromJson (Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;
      // 105: checkcast z08
      // 108: areturn
   }

   private Gson rwb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield if1.ysx Lcom/google/gson/Gson;
      // 08: iload 1
      // 09: ifeq 2c
      // 0c: ifnonnull 28
      // 0f: goto 16
      // 12: invokestatic if1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: getfield if1.vmg Lcom/google/gson/GsonBuilder;
      // 1b: invokevirtual com/google/gson/GsonBuilder.create ()Lcom/google/gson/Gson;
      // 1e: putfield if1.ysx Lcom/google/gson/Gson;
      // 21: goto 28
      // 24: invokestatic if1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: aload 0
      // 29: getfield if1.ysx Lcom/google/gson/Gson;
      // 2c: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1453865624751816028L, -7957596765389121902L, MethodHandles.lookup().lookupClass()).a(258123561849770L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 35129181461995L;
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
      String var6 = "ê\u009e\u008b\f÷[°×Ù\u000båÊå(ÞáÕ¿°îý¦tbeâùéÔ\u0086¦!ß\u000bÈ¼ÂL\u009e]Pý×Ar\u000bA)rÖë*\u0095ôkÄy\u0001ù?1Ñ\u0007\nÌv°#\u0014\u0005êBIö\u0006Û\u0099#ë1§\u001fC®Â]½ý3\u0092\u0088¤âV\u0001ß\u0089?÷½Ý\bÊà\u0007ÿM\u0088:VùÕî\u0092l*È\u00adx\u001f\u0003";
      int var8 = "ê\u009e\u008b\f÷[°×Ù\u000båÊå(ÞáÕ¿°îý¦tbeâùéÔ\u0086¦!ß\u000bÈ¼ÂL\u009e]Pý×Ar\u000bA)rÖë*\u0095ôkÄy\u0001ù?1Ñ\u0007\nÌv°#\u0014\u0005êBIö\u0006Û\u0099#ë1§\u001fC®Â]½ý3\u0092\u0088¤âV\u0001ß\u0089?÷½Ý\bÊà\u0007ÿM\u0088:VùÕî\u0092l*È\u00adx\u001f\u0003"
         .length();
      char var5 = '(';
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

                  var6 = "yÙ\u0011ÌÚÀK=ÊS×OQ¾\u0094úË¤Ñ>\u0084Ï\u0082ebl#»\u0017}¥ëÕ\u0004\rÂF\u008e>8Þ\u0092\u0098;\u0005\u0096\u0011f\tFd\\ Ï÷?@\u001b\u0019ûñÓ\u008c±¹\u0092S\u0010¸ü¿_Å¥\u0091wó7sì\u0000\u001aý¶\u0010Ûèõ\u0010Ðzr\u0014õ*b¦:øH0¡SI\u0005\u0083\\ï\u0003VðH·GK\"\tb\u0018Gª";
                  var8 = "yÙ\u0011ÌÚÀK=ÊS×OQ¾\u0094úË¤Ñ>\u0084Ï\u0082ebl#»\u0017}¥ëÕ\u0004\rÂF\u008e>8Þ\u0092\u0098;\u0005\u0096\u0011f\tFd\\ Ï÷?@\u001b\u0019ûñÓ\u008c±¹\u0092S\u0010¸ü¿_Å¥\u0091wó7sì\u0000\u001aý¶\u0010Ûèõ\u0010Ðzr\u0014õ*b¦:øH0¡SI\u0005\u0083\\ï\u0003VðH·GK\"\tb\u0018Gª"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16308;
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
            throw new RuntimeException("if1", var10);
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
         throw new RuntimeException("if1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
