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

public final class pyu {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static Object mud(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pyu.a J
      // 03: ldc2_w 99217743435867
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: getstatic pyu._cg Lov0;
      // 0f: ifnonnull 2c
      // 12: new aut
      // 15: dup
      // 16: sipush 5229
      // 19: ldc2_w 5988025138518371333
      // 1c: lload 1
      // 1d: lxor
      // 1e: invokedynamic m (IJ)Ljava/lang/String; bsm=pyu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: nop
      // 24: invokespecial aut.<init> (Ljava/lang/String;)V
      // 27: athrow
      // 28: invokestatic pyu.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getstatic pyu.uj_ Ljava/util/Map;
      // 2f: dup
      // 30: astore 4
      // 32: monitorenter
      // 33: getstatic pyu.uj_ Ljava/util/Map;
      // 36: aload 0
      // 37: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3c: astore 5
      // 3e: aload 5
      // 40: iload 3
      // 41: ifne 7e
      // 44: ifnonnull 7c
      // 47: goto 4e
      // 4a: invokestatic pyu.a (Loov;)Loov;
      // 4d: athrow
      // 4e: getstatic pyu._cg Lov0;
      // 51: aload 0
      // 52: invokeinterface ov0.xfz (Ljava/lang/String;)Ljava/lang/Object; 2
      // 57: astore 5
      // 59: aload 5
      // 5b: iload 3
      // 5c: ifne 7e
      // 5f: ifnull 7c
      // 62: goto 69
      // 65: invokestatic pyu.a (Loov;)Loov;
      // 68: athrow
      // 69: getstatic pyu.uj_ Ljava/util/Map;
      // 6c: aload 0
      // 6d: aload 5
      // 6f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 74: pop
      // 75: goto 7c
      // 78: invokestatic pyu.a (Loov;)Loov;
      // 7b: athrow
      // 7c: aload 5
      // 7e: iload 3
      // 7f: ifne ab
      // 82: ifnonnull a6
      // 85: goto 8c
      // 88: invokestatic pyu.a (Loov;)Loov;
      // 8b: athrow
      // 8c: new aut
      // 8f: dup
      // 90: sipush 19320
      // 93: ldc2_w 6583781962533466897
      // 96: lload 1
      // 97: lxor
      // 98: invokedynamic m (IJ)Ljava/lang/String; bsm=pyu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: nop
      // 9e: invokespecial aut.<init> (Ljava/lang/String;)V
      // a1: athrow
      // a2: invokestatic pyu.a (Loov;)Loov;
      // a5: athrow
      // a6: aload 5
      // a8: aload 4
      // aa: monitorexit
      // ab: areturn
      // ac: astore 6
      // ae: aload 4
      // b0: monitorexit
      // b1: aload 6
      // b3: athrow
   }

   public static String[] lr1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: getstatic pyu._cg Lov0;
      // 07: iload 0
      // 08: ifeq 21
      // 0b: ifnonnull 1e
      // 0e: goto 15
      // 11: invokestatic pyu.a (Loov;)Loov;
      // 14: athrow
      // 15: bipush 0
      // 16: anewarray 1
      // 19: areturn
      // 1a: invokestatic pyu.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic pyu._cg Lov0;
      // 21: invokeinterface ov0.amq ()[Ljava/lang/String; 1
      // 26: areturn
   }

   public static void lj1(ov0 var0) {
      int var1 = OpaquePredicate.b();

      ov0 var10000;
      label20: {
         try {
            var10000 = _cg;
            if (var1 == 0) {
               break label20;
            }

            if (_cg != null) {
               return;
            }
         } catch (oov var2) {
            throw a(var2);
         }

         var10000 = var0;
      }

      _cg = var10000;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5047551373586149359L, 1797461560717514110L, MethodHandles.lookup().lookupClass()).a(152174353741867L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 129192761782812L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u0092\b\u0081\tA\u001bÒ \u008bþ!\u001e\u001aÎQâï+¼\u009f#JI&Üî=ÖYn_\u0004°\u001e\u009b\u0016ãÿGJ§yÿz4\u0080¢¿\u009e\u0006²\u00ad\u009d9AªÌ\u009a+\u001eM\u0096Ê1q ZåÜ\u008d\rW(Y:w\"\u001fÈô\u000fJ»*\u0084E~|9Ä·®8¹k[\u0001Fê©\u009b~Ùe´tw\u00890 ïÞO";
      int var8 = "\u0092\b\u0081\tA\u001bÒ \u008bþ!\u001e\u001aÎQâï+¼\u009f#JI&Üî=ÖYn_\u0004°\u001e\u009b\u0016ãÿGJ§yÿz4\u0080¢¿\u009e\u0006²\u00ad\u009d9AªÌ\u009a+\u001eM\u0096Ê1q ZåÜ\u008d\rW(Y:w\"\u001fÈô\u000fJ»*\u0084E~|9Ä·®8¹k[\u0001Fê©\u009b~Ùe´tw\u00890 ïÞO"
         .length();
      char var5 = 'H';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            _cg = null;
            uj_ = new HashMap();
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8773;
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
            throw new RuntimeException("pyu", var10);
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
         throw new RuntimeException("pyu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
