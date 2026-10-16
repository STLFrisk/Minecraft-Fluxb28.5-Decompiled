import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
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
import org.lwjgl.util.vector.Vector3f;

public class hej$azq implements JsonDeserializer {
   private static final Vector3f or1;
   private static final Vector3f t1e;
   private static final Vector3f npr;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public hej deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      long var4 = a ^ 63349595982539L;
      JsonObject var6 = var1.getAsJsonObject();
      Vector3f var7 = this.otn(var6, a<"n">(2194, 435695303615902010L ^ var4), or1);
      Vector3f var8 = this.otn(var6, a<"n">(20768, 7767445624078018697L ^ var4), t1e);
      var8.scale(0.0625F);
      var8.x = fe6._f3(var8.x, -1.5F, 1.5F);
      var8.y = fe6._f3(var8.y, -1.5F, 1.5F);
      var8.z = fe6._f3(var8.z, -1.5F, 1.5F);
      Vector3f var9 = this.otn(var6, a<"n">(28425, 4516905072282769061L ^ var4), npr);
      var9.x = fe6._f3(var9.x, -4.0F, 4.0F);
      var9.y = fe6._f3(var9.y, -4.0F, 4.0F);
      var9.z = fe6._f3(var9.z, -4.0F, 4.0F);
      return new hej(var7, var8, var9);
   }

   private Vector3f otn(JsonObject param1, String param2, Vector3f param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hej$azq.a J
      // 03: ldc2_w 11142237661876
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.b ()I
      // 0c: istore 6
      // 0e: aload 1
      // 0f: aload 2
      // 10: iload 6
      // 12: ifeq 2a
      // 15: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 18: ifne 28
      // 1b: goto 22
      // 1e: invokestatic hej$azq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 21: athrow
      // 22: aload 3
      // 23: areturn
      // 24: invokestatic hej$azq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 27: athrow
      // 28: aload 1
      // 29: aload 2
      // 2a: invokestatic f83.k68 (Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 2d: astore 7
      // 2f: aload 7
      // 31: invokevirtual com/google/gson/JsonArray.size ()I
      // 34: iload 6
      // 36: ifeq 8b
      // 39: bipush 3
      // 3a: if_icmpeq 8a
      // 3d: goto 44
      // 40: invokestatic hej$azq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 43: athrow
      // 44: new com/google/gson/JsonParseException
      // 47: dup
      // 48: new java/lang/StringBuilder
      // 4b: dup
      // 4c: invokespecial java/lang/StringBuilder.<init> ()V
      // 4f: sipush 23433
      // 52: ldc2_w 8876666798021558877
      // 55: lload 4
      // 57: lxor
      // 58: invokedynamic n (IJ)Ljava/lang/String; bsm=hej$azq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: nop
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: aload 2
      // 62: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 65: sipush 18074
      // 68: ldc2_w 5026989825968070479
      // 6b: lload 4
      // 6d: lxor
      // 6e: invokedynamic n (IJ)Ljava/lang/String; bsm=hej$azq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: nop
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: aload 7
      // 79: invokevirtual com/google/gson/JsonArray.size ()I
      // 7c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 7f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 82: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;)V
      // 85: athrow
      // 86: invokestatic hej$azq.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 89: athrow
      // 8a: bipush 3
      // 8b: newarray 6
      // 8d: astore 8
      // 8f: bipush 0
      // 90: istore 9
      // 92: iload 9
      // 94: aload 8
      // 96: arraylength
      // 97: if_icmpge d0
      // 9a: aload 8
      // 9c: iload 9
      // 9e: aload 7
      // a0: iload 9
      // a2: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // a5: new java/lang/StringBuilder
      // a8: dup
      // a9: invokespecial java/lang/StringBuilder.<init> ()V
      // ac: aload 2
      // ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b0: ldc "["
      // b2: nop
      // b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b6: iload 9
      // b8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // bb: ldc "]"
      // bd: nop
      // be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c4: invokestatic f83.f_y (Lcom/google/gson/JsonElement;Ljava/lang/String;)F
      // c7: fastore
      // c8: iinc 9 1
      // cb: iload 6
      // cd: ifne 92
      // d0: new org/lwjgl/util/vector/Vector3f
      // d3: dup
      // d4: aload 8
      // d6: bipush 0
      // d7: faload
      // d8: aload 8
      // da: bipush 1
      // db: faload
      // dc: aload 8
      // de: bipush 2
      // df: faload
      // e0: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // e3: areturn
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1365718720536932860L, 7658803076811070149L, MethodHandles.lookup().lookupClass()).a(162064344951145L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 102308253152421L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "w\u009dðQ\u001f°Sèz\u008búd\u0015\r$\u0087ù\u0007\u009eC£Âpã\"PÓè\u009c!\u009a\u001d \u0012w\u0081Ó\u0099C¨\u000bß¡Ã«é«¿wòë(\u0092\u0096JBÄä\u0095Xö¾\u0003lî(\u0017\u0002îO\b\u0087Â\u0091²\u008dñ:0.\u0007=þ\u0013\u001c÷Ýÿ)\u0005±<h§3\u0093ª\u0012\u0006)\u0099ÛªU.\u008f";
      int var8 = "w\u009dðQ\u001f°Sèz\u008búd\u0015\r$\u0087ù\u0007\u009eC£Âpã\"PÓè\u009c!\u009a\u001d \u0012w\u0081Ó\u0099C¨\u000bß¡Ã«é«¿wòë(\u0092\u0096JBÄä\u0095Xö¾\u0003lî(\u0017\u0002îO\b\u0087Â\u0091²\u008dñ:0.\u0007=þ\u0013\u001c÷Ýÿ)\u0005±<h§3\u0093ª\u0012\u0006)\u0099ÛªU.\u008f"
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
                     c = new String[5];
                     or1 = new Vector3f(0.0F, 0.0F, 0.0F);
                     t1e = new Vector3f(0.0F, 0.0F, 0.0F);
                     npr = new Vector3f(1.0F, 1.0F, 1.0F);
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

                  var6 = "s\u000e|\u0091Zæ<ÐWAô¸A\u007f¬\u0004I\u009cÔ³\rW\u0090Ómin-þ\u001c\u0082\u0012\u00104\u0090[\u008aÜF\u009dÜ²8\u009aK\u0004{\u009d(";
                  var8 = "s\u000e|\u0091Zæ<ÐWAô¸A\u007f¬\u0004I\u009cÔ³\rW\u0090Ómin-þ\u001c\u0082\u0012\u00104\u0090[\u008aÜF\u009dÜ²8\u009aK\u0004{\u009d("
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26903;
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
            throw new RuntimeException("hej$azq", var10);
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
         throw new RuntimeException("hej$azq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
