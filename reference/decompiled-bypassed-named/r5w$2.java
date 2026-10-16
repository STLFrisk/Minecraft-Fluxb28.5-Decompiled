import com.google.common.util.concurrent.FutureCallback;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class r5w$2 implements FutureCallback {
   public final uga mm0;
   public final cbc jfz;
   public final r5w qk8;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public r5w$2(r5w var1, uga var2, cbc var3) {
      this.qk8 = var1;
      this.mm0 = var2;
      this.jfz = var3;
   }

   public void ayc(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic r5w$2.a J
      // 03: ldc2_w 106140978030016
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: getfield r5w$2.qk8 Lr5w;
      // 0c: aload 0
      // 0d: getfield r5w$2.mm0 Luga;
      // 10: invokestatic r5w.f2b (Lr5w;Luga;)V
      // 13: invokestatic OpaquePredicate.b ()I
      // 16: aload 0
      // 17: getfield r5w$2.mm0 Luga;
      // 1a: invokevirtual uga._d6 ()Ljava/util/concurrent/locks/ReentrantLock;
      // 1d: invokevirtual java/util/concurrent/locks/ReentrantLock.lock ()V
      // 20: istore 4
      // 22: aload 0
      // 23: getfield r5w$2.mm0 Luga;
      // 26: iload 4
      // 28: ifeq 58
      // 2b: invokevirtual uga.va9 ()Luga$aen;
      // 2e: getstatic uga$aen.g25 Luga$aen;
      // 31: if_acmpne 54
      // 34: goto 3b
      // 37: invokestatic r5w$2.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield r5w$2.mm0 Luga;
      // 3f: getstatic uga$aen.mle Luga$aen;
      // 42: invokevirtual uga.kv_ (Luga$aen;)V
      // 45: aload 0
      // 46: getfield r5w$2.mm0 Luga;
      // 49: invokevirtual uga._d6 ()Ljava/util/concurrent/locks/ReentrantLock;
      // 4c: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 4f: iload 4
      // 51: ifne cc
      // 54: aload 0
      // 55: getfield r5w$2.mm0 Luga;
      // 58: iload 4
      // 5a: ifeq b3
      // 5d: invokevirtual uga.setOwner ()Z
      // 60: ifne af
      // 63: goto 6a
      // 66: invokestatic r5w$2.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 69: athrow
      // 6a: invokestatic r5w.g5v ()Lorg/apache/logging/log4j/Logger;
      // 6d: new java/lang/StringBuilder
      // 70: dup
      // 71: invokespecial java/lang/StringBuilder.<init> ()V
      // 74: sipush 11299
      // 77: ldc2_w 1601973823029422933
      // 7a: lload 2
      // 7b: lxor
      // 7c: invokedynamic q (IJ)Ljava/lang/String; bsm=r5w$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: nop
      // 82: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 85: aload 0
      // 86: getfield r5w$2.mm0 Luga;
      // 89: invokevirtual uga.va9 ()Luga$aen;
      // 8c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8f: sipush 9463
      // 92: ldc2_w 4989587668449174402
      // 95: lload 2
      // 96: lxor
      // 97: invokedynamic q (IJ)Ljava/lang/String; bsm=r5w$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: nop
      // 9d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a3: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // a8: goto af
      // ab: invokestatic r5w$2.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // ae: athrow
      // af: aload 0
      // b0: getfield r5w$2.mm0 Luga;
      // b3: invokevirtual uga._d6 ()Ljava/util/concurrent/locks/ReentrantLock;
      // b6: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // b9: goto cb
      // bc: astore 5
      // be: aload 0
      // bf: getfield r5w$2.mm0 Luga;
      // c2: invokevirtual uga._d6 ()Ljava/util/concurrent/locks/ReentrantLock;
      // c5: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // c8: aload 5
      // ca: athrow
      // cb: return
      // cc: aload 0
      // cd: getfield r5w$2.mm0 Luga;
      // d0: invokevirtual uga.r2x ()Lkqk;
      // d3: aload 0
      // d4: getfield r5w$2.jfz Lcbc;
      // d7: invokevirtual kqk.rdp (Lcbc;)V
      // da: return
   }

   public void onFailure(Throwable param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic r5w$2.a J
      // 03: ldc2_w 120410625276472
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield r5w$2.qk8 Lr5w;
      // 11: aload 0
      // 12: getfield r5w$2.mm0 Luga;
      // 15: invokestatic r5w.f2b (Lr5w;Luga;)V
      // 18: aload 1
      // 19: instanceof java/util/concurrent/CancellationException
      // 1c: iload 4
      // 1e: ifeq 36
      // 21: ifne 58
      // 24: goto 2b
      // 27: invokestatic r5w$2.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 2a: athrow
      // 2b: aload 1
      // 2c: instanceof java/lang/InterruptedException
      // 2f: goto 36
      // 32: invokestatic r5w$2.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 35: athrow
      // 36: ifne 58
      // 39: invokestatic Minecraft.vz1 ()Lc05;
      // 3c: aload 1
      // 3d: sipush 27862
      // 40: ldc2_w 5003054608195597401
      // 43: lload 2
      // 44: lxor
      // 45: invokedynamic q (IJ)Ljava/lang/String; bsm=r5w$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: nop
      // 4b: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 4e: invokevirtual Minecraft.vut (Le1i;)V
      // 51: goto 58
      // 54: invokestatic r5w$2.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 57: athrow
      // 58: return
   }

   public void onSuccess(Object var1) {
      this.ayc((List)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5462848687600861146L, 1470774934211534893L, MethodHandles.lookup().lookupClass()).a(132607399354011L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 69496211103316L;
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
      String var6 = "Óî\u001bröíÛ\u0088\u001dL\u008e J£X/î#û\u0002è\u008crÀý$N\u0086us±\u001e(;³¾\u0089\u000eDa\tç±ûÀ÷  ÀI \u00ad\u0094\u008aé\u0010«ö\u001c\u009d¯fry{EÙñ\r\u008aáb\u0081XµèY~v.\t¼¨À\u0013\u0096cRèß2\u009f*5Z\u0006ä\"Ø|µ/\u0002j\\r>EÓp®Ë¦\u0096í´ÑPw!\u0097\u0082÷¥e\u001c·ºõÓgF\u008bP¬«'sÏpâ¡jÊÜZçÀÑÉz\u000e,À;8Eö!Ô\u0082\u0082";
      int var8 = "Óî\u001bröíÛ\u0088\u001dL\u008e J£X/î#û\u0002è\u008crÀý$N\u0086us±\u001e(;³¾\u0089\u000eDa\tç±ûÀ÷  ÀI \u00ad\u0094\u008aé\u0010«ö\u001c\u009d¯fry{EÙñ\r\u008aáb\u0081XµèY~v.\t¼¨À\u0013\u0096cRèß2\u009f*5Z\u0006ä\"Ø|µ/\u0002j\\r>EÓp®Ë¦\u0096í´ÑPw!\u0097\u0082÷¥e\u001c·ºõÓgF\u008bP¬«'sÏpâ¡jÊÜZçÀÑÉz\u000e,À;8Eö!Ô\u0082\u0082"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static CancellationException a(CancellationException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15034;
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
            throw new RuntimeException("r5w$2", var10);
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
         throw new RuntimeException("r5w$2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
