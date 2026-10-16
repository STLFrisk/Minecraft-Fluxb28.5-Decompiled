import com.google.common.collect.Lists;
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

public class z97 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static synchronized int[] web(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: sipush 256
      // 08: iload 1
      // 09: ifne 79
      // 0c: if_icmpgt 6a
      // 0f: goto 16
      // 12: invokestatic z97.a (Loov;)Loov;
      // 15: athrow
      // 16: getstatic z97.eku Ljava/util/List;
      // 19: iload 1
      // 1a: ifne 57
      // 1d: goto 24
      // 20: invokestatic z97.a (Loov;)Loov;
      // 23: athrow
      // 24: invokeinterface java/util/List.isEmpty ()Z 1
      // 29: ifeq 45
      // 2c: goto 33
      // 2f: invokestatic z97.a (Loov;)Loov;
      // 32: athrow
      // 33: sipush 256
      // 36: newarray 10
      // 38: astore 2
      // 39: getstatic z97.wry Ljava/util/List;
      // 3c: aload 2
      // 3d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 42: pop
      // 43: aload 2
      // 44: areturn
      // 45: getstatic z97.eku Ljava/util/List;
      // 48: getstatic z97.eku Ljava/util/List;
      // 4b: invokeinterface java/util/List.size ()I 1
      // 50: bipush 1
      // 51: isub
      // 52: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 57: checkcast [I
      // 5a: checkcast [I
      // 5d: astore 2
      // 5e: getstatic z97.wry Ljava/util/List;
      // 61: aload 2
      // 62: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 67: pop
      // 68: aload 2
      // 69: areturn
      // 6a: iload 0
      // 6b: iload 1
      // 6c: ifne b5
      // 6f: getstatic z97.oi8 I
      // 72: goto 79
      // 75: invokestatic z97.a (Loov;)Loov;
      // 78: athrow
      // 79: if_icmple a2
      // 7c: iload 0
      // 7d: putstatic z97.oi8 I
      // 80: getstatic z97.j01 Ljava/util/List;
      // 83: invokeinterface java/util/List.clear ()V 1
      // 88: getstatic z97.hjf Ljava/util/List;
      // 8b: invokeinterface java/util/List.clear ()V 1
      // 90: getstatic z97.oi8 I
      // 93: newarray 10
      // 95: astore 2
      // 96: getstatic z97.hjf Ljava/util/List;
      // 99: aload 2
      // 9a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9f: pop
      // a0: aload 2
      // a1: areturn
      // a2: getstatic z97.j01 Ljava/util/List;
      // a5: iload 1
      // a6: ifne dc
      // a9: invokeinterface java/util/List.isEmpty ()Z 1
      // ae: goto b5
      // b1: invokestatic z97.a (Loov;)Loov;
      // b4: athrow
      // b5: ifeq ca
      // b8: getstatic z97.oi8 I
      // bb: newarray 10
      // bd: astore 2
      // be: getstatic z97.hjf Ljava/util/List;
      // c1: aload 2
      // c2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // c7: pop
      // c8: aload 2
      // c9: areturn
      // ca: getstatic z97.j01 Ljava/util/List;
      // cd: getstatic z97.j01 Ljava/util/List;
      // d0: invokeinterface java/util/List.size ()I 1
      // d5: bipush 1
      // d6: isub
      // d7: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // dc: checkcast [I
      // df: checkcast [I
      // e2: astore 2
      // e3: getstatic z97.hjf Ljava/util/List;
      // e6: aload 2
      // e7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // ec: pop
      // ed: aload 2
      // ee: areturn
   }

   public static synchronized void fuw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic z97.j01 Ljava/util/List;
      // 07: invokeinterface java/util/List.isEmpty ()Z 1
      // 0c: iload 0
      // 0d: ifeq 3c
      // 10: ifne 34
      // 13: goto 1a
      // 16: invokestatic z97.a (Loov;)Loov;
      // 19: athrow
      // 1a: getstatic z97.j01 Ljava/util/List;
      // 1d: getstatic z97.j01 Ljava/util/List;
      // 20: invokeinterface java/util/List.size ()I 1
      // 25: bipush 1
      // 26: isub
      // 27: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 2c: pop
      // 2d: goto 34
      // 30: invokestatic z97.a (Loov;)Loov;
      // 33: athrow
      // 34: getstatic z97.eku Ljava/util/List;
      // 37: invokeinterface java/util/List.isEmpty ()Z 1
      // 3c: iload 0
      // 3d: ifeq 7b
      // 40: ifne 64
      // 43: goto 4a
      // 46: invokestatic z97.a (Loov;)Loov;
      // 49: athrow
      // 4a: getstatic z97.eku Ljava/util/List;
      // 4d: getstatic z97.eku Ljava/util/List;
      // 50: invokeinterface java/util/List.size ()I 1
      // 55: bipush 1
      // 56: isub
      // 57: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 5c: pop
      // 5d: goto 64
      // 60: invokestatic z97.a (Loov;)Loov;
      // 63: athrow
      // 64: getstatic z97.j01 Ljava/util/List;
      // 67: getstatic z97.hjf Ljava/util/List;
      // 6a: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 6f: pop
      // 70: getstatic z97.eku Ljava/util/List;
      // 73: getstatic z97.wry Ljava/util/List;
      // 76: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 7b: pop
      // 7c: getstatic z97.hjf Ljava/util/List;
      // 7f: invokeinterface java/util/List.clear ()V 1
      // 84: getstatic z97.wry Ljava/util/List;
      // 87: invokeinterface java/util/List.clear ()V 1
      // 8c: return
   }

   public static synchronized String qow() {
      long var0 = a ^ 123673771671499L;
      return a<"i">(2280, 8670872850775522341L ^ var0)
         + j01.size()
         + a<"i">(4621, 8038332615476717251L ^ var0)
         + eku.size()
         + a<"i">(2828, 5315352908217434051L ^ var0)
         + hjf.size()
         + a<"i">(15365, 4844026065281157321L ^ var0)
         + wry.size();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-241768088506318379L, 377650258079406945L, MethodHandles.lookup().lookupClass()).a(198861614933824L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 89166282515986L;
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
      String var6 = "ÚzöÂ)ã\u0013!®Ý\u0011$\u009c´\u0099!*ÀjñøqrÃ\u0018\u008a\u008b\u0013;ýÅÂ_«ÝºÁð\u0097b\u0088J\u007fð¶\u0080î%Ã";
      int var8 = "ÚzöÂ)ã\u0013!®Ý\u0011$\u009c´\u0099!*ÀjñøqrÃ\u0018\u008a\u008b\u0013;ýÅÂ_«ÝºÁð\u0097b\u0088J\u007fð¶\u0080î%Ã".length();
      char var5 = 24;
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
                     oi8 = 256;
                     eku = Lists.newArrayList();
                     wry = Lists.newArrayList();
                     j01 = Lists.newArrayList();
                     hjf = Lists.newArrayList();
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

                  var6 = "ô\t\u001blS\u0086ñÙ\u0084v\u00031B\u009c?\u008dª&\u0083nñ©ÅÝ\u009eÄtÍÇ°~Ä\u0010«z`±\u0090\n\u001e\u0093Z \u0013c\u0091\u0094õ\u0082";
                  var8 = "ô\t\u001blS\u0086ñÙ\u0084v\u00031B\u009c?\u008dª&\u0083nñ©ÅÝ\u009eÄtÍÇ°~Ä\u0010«z`±\u0090\n\u001e\u0093Z \u0013c\u0091\u0094õ\u0082"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20730;
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
            throw new RuntimeException("z97", var10);
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
         throw new RuntimeException("z97" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
