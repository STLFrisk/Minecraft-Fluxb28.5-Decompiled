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

public class gd5 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public boolean m6l(e7r param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: invokestatic vr1._0v ()Lvr1;
      // 07: invokevirtual vr1.a59 ()Z
      // 0a: iload 2
      // 0b: ifne 33
      // 0e: ifne 32
      // 11: goto 18
      // 14: invokestatic gd5.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: invokespecial bc_.m6l (Le7r;)Z
      // 1d: iload 2
      // 1e: ifne 33
      // 21: goto 28
      // 24: invokestatic gd5.a (Loov;)Loov;
      // 27: athrow
      // 28: ifeq 36
      // 2b: goto 32
      // 2e: invokestatic gd5.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   @Override
   public String xue() {
      long var1 = a ^ 40055505959836L;
      return b<"i">(9189, 6220173049694430819L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 46799668864794L;
      return b<"i">(27754, 3452917418278860139L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic gd5.a J
      // 03: ldc2_w 35655140626137
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 1
      // 0e: iload 5
      // 10: ifne 28
      // 13: instanceof ha9
      // 16: ifeq 31
      // 19: goto 20
      // 1c: invokestatic gd5.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: goto 28
      // 24: invokestatic gd5.a (Loov;)Loov;
      // 27: athrow
      // 28: checkcast ha9
      // 2b: getfield ha9.oay Lt9d;
      // 2e: goto 38
      // 31: invokestatic vr1._0v ()Lvr1;
      // 34: bipush 0
      // 35: invokevirtual vr1.hrw (I)Ldug;
      // 38: astore 6
      // 3a: aload 1
      // 3b: new hsu
      // 3e: dup
      // 3f: sipush 12566
      // 42: ldc2_w 1308929093650727382
      // 45: lload 3
      // 46: lxor
      // 47: invokedynamic i (IJ)Ljava/lang/String; bsm=gd5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: nop
      // 4d: bipush 1
      // 4e: anewarray 55
      // 51: dup
      // 52: bipush 0
      // 53: aload 6
      // 55: invokevirtual t9d.x2p ()J
      // 58: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b: aastore
      // 5c: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 5f: invokeinterface e7r.a0d (Lekw;)V 2
      // 64: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9501514828437304L, 3898002578632709388L, MethodHandles.lookup().lookupClass()).a(171894714122929L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 96342629466179L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "ë\u0080£S@-Ç\u007fÜÖµµ&È¨úÉci\u000byWóÄ£\f\u0097¯üø0Õ\u0002ZÌ\u00adVa\u0084Þ\u0010ök\b£fÒ×\u008f7/\u000eÌ)àb¡(¤-¯ÊtQ\u009aâ2\u008b\u000f~\u0003=?¸\u0086&ew\u0019\"@¶\u0092»ºýqÂ#\u0089h\u0000)Õq\u008cØS";
      int var8 = "ë\u0080£S@-Ç\u007fÜÖµµ&È¨úÉci\u000byWóÄ£\f\u0097¯üø0Õ\u0002ZÌ\u00adVa\u0084Þ\u0010ök\b£fÒ×\u008f7/\u000eÌ)àb¡(¤-¯ÊtQ\u009aâ2\u008b\u000f~\u0003=?¸\u0086&ew\u0019\"@¶\u0092»ºýqÂ#\u0089h\u0000)Õq\u008cØS"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            c = var9;
            g = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23708;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("gd5", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("gd5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
