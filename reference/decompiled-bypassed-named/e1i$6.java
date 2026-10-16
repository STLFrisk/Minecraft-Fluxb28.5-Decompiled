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

public class e1i$6 implements Callable {
   public final e1i p98;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public e1i$6(e1i var1) {
      this.p98 = var1;
   }

   public String call() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic e1i$6.a J
      // 03: ldc2_w 28213197920486
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic java/lang/management/ManagementFactory.getRuntimeMXBean ()Ljava/lang/management/RuntimeMXBean;
      // 0b: astore 4
      // 0d: invokestatic OpaquePredicate.b ()I
      // 10: aload 4
      // 12: invokeinterface java/lang/management/RuntimeMXBean.getInputArguments ()Ljava/util/List; 1
      // 17: astore 5
      // 19: bipush 0
      // 1a: istore 6
      // 1c: istore 3
      // 1d: new java/lang/StringBuilder
      // 20: dup
      // 21: invokespecial java/lang/StringBuilder.<init> ()V
      // 24: astore 7
      // 26: aload 5
      // 28: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2d: astore 8
      // 2f: aload 8
      // 31: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 36: ifeq 9c
      // 39: aload 8
      // 3b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 40: checkcast java/lang/String
      // 43: astore 9
      // 45: aload 9
      // 47: iload 3
      // 48: ifeq c1
      // 4b: sipush 4992
      // 4e: ldc2_w 573163428002500854
      // 51: lload 1
      // 52: lxor
      // 53: invokedynamic v (IJ)Ljava/lang/String; bsm=e1i$6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: nop
      // 59: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 5c: iload 3
      // 5d: ifeq 7d
      // 60: goto 67
      // 63: invokestatic e1i$6.a (Loov;)Loov;
      // 66: athrow
      // 67: ifeq 98
      // 6a: goto 71
      // 6d: invokestatic e1i$6.a (Loov;)Loov;
      // 70: athrow
      // 71: iload 6
      // 73: iinc 6 1
      // 76: goto 7d
      // 79: invokestatic e1i$6.a (Loov;)Loov;
      // 7c: athrow
      // 7d: ifle 90
      // 80: aload 7
      // 82: ldc " "
      // 84: nop
      // 85: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 88: pop
      // 89: goto 90
      // 8c: invokestatic e1i$6.a (Loov;)Loov;
      // 8f: athrow
      // 90: aload 7
      // 92: aload 9
      // 94: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 97: pop
      // 98: iload 3
      // 99: ifne 2f
      // 9c: sipush 30357
      // 9f: ldc2_w 5434849899604342242
      // a2: lload 1
      // a3: lxor
      // a4: invokedynamic v (IJ)Ljava/lang/String; bsm=e1i$6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: nop
      // aa: bipush 2
      // ab: anewarray 15
      // ae: dup
      // af: bipush 0
      // b0: iload 6
      // b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b5: aastore
      // b6: dup
      // b7: bipush 1
      // b8: aload 7
      // ba: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // bd: aastore
      // be: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // c1: areturn
   }

   @Override
   public Object call() {
      return this.call();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5028660129588207041L, -1083796287542456703L, MethodHandles.lookup().lookupClass()).a(229750813256774L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 14534308590086L;
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
      String var6 = "\u0098²K\\\"MxYØý·¬\u008cÜ\u00ad\\\u008cêö?¢D$õvõ\u009aágz\u0012i\u0010!\u009f]fá§\u0019âÏ4³\u0087v-(R";
      int var8 = "\u0098²K\\\"MxYØý·¬\u008cÜ\u00ad\\\u008cêö?¢D$õvõ\u009aágz\u0012i\u0010!\u009f]fá§\u0019âÏ4³\u0087v-(R".length();
      char var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11170;
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
            throw new RuntimeException("e1i$6", var10);
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
         throw new RuntimeException("e1i$6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
