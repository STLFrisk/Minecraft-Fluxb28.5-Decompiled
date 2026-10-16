import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class c05$12 implements Callable {
   public final c05 j0s;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public c05$12(c05 var1) {
      this.j0s = var1;
   }

   public String call() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic c05$12.a J
      // 03: ldc2_w 101072180575624
      // 06: lxor
      // 07: lstore 1
      // 08: new java/lang/StringBuilder
      // 0b: dup
      // 0c: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f: astore 4
      // 11: invokestatic t9d.c ()I
      // 14: aload 0
      // 15: getfield c05$12.j0s Lc05;
      // 18: getfield c05.oxn Lmoh;
      // 1b: getfield moh.yvc Ljava/util/List;
      // 1e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 23: astore 5
      // 25: istore 3
      // 26: aload 5
      // 28: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d: ifeq bb
      // 30: aload 5
      // 32: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 37: checkcast java/lang/String
      // 3a: astore 6
      // 3c: aload 4
      // 3e: iload 3
      // 3f: ifne bd
      // 42: invokevirtual java/lang/StringBuilder.length ()I
      // 45: iload 3
      // 46: ifne 99
      // 49: goto 50
      // 4c: invokestatic c05$12.a (Loov;)Loov;
      // 4f: athrow
      // 50: ifle 75
      // 53: goto 5a
      // 56: invokestatic c05$12.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 4
      // 5c: sipush 15468
      // 5f: ldc2_w 2422228678271824059
      // 62: lload 1
      // 63: lxor
      // 64: invokedynamic j (IJ)Ljava/lang/String; bsm=c05$12.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6d: pop
      // 6e: goto 75
      // 71: invokestatic c05$12.a (Loov;)Loov;
      // 74: athrow
      // 75: aload 4
      // 77: aload 6
      // 79: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7c: iload 3
      // 7d: ifne b6
      // 80: pop
      // 81: aload 0
      // 82: getfield c05$12.j0s Lc05;
      // 85: getfield c05.oxn Lmoh;
      // 88: getfield moh.kc4 Ljava/util/List;
      // 8b: aload 6
      // 8d: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 92: goto 99
      // 95: invokestatic c05$12.a (Loov;)Loov;
      // 98: athrow
      // 99: ifeq b7
      // 9c: aload 4
      // 9e: sipush 31176
      // a1: ldc2_w 7858834487440028958
      // a4: lload 1
      // a5: lxor
      // a6: invokedynamic j (IJ)Ljava/lang/String; bsm=c05$12.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: nop
      // ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // af: goto b6
      // b2: invokestatic c05$12.a (Loov;)Loov;
      // b5: athrow
      // b6: pop
      // b7: iload 3
      // b8: ifeq 26
      // bb: aload 4
      // bd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c0: areturn
   }

   @Override
   public Object call() {
      return this.call();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(684554326071965351L, 596766837254955611L, MethodHandles.lookup().lookupClass()).a(108793107802630L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 27831173750999L;
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
      String var6 = "\u008b~\rµ¶©î¾êÔ9\u008b®îÃc ÂþU\nt\u000f¥pJÐ\u00969Í-BÀII8ãþWá\u0089÷«¿ÿy\u0004Øs";
      int var8 = "\u008b~\rµ¶©î¾êÔ9\u008b®îÃc ÂþU\nt\u000f¥pJÐ\u00969Í-BÀII8ãþWá\u0089÷«¿ÿy\u0004Øs".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1255;
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
            throw new RuntimeException("c05$12", var10);
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
         throw new RuntimeException("c05$12" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
