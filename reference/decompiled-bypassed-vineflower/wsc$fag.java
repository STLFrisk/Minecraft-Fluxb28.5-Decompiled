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

public class wsc$fag {
   private final String fy5;
   private final String klr;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public wsc$fag(String param1, Object param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic wsc$fag.a J
      // 03: ldc2_w 98045959969815
      // 06: lxor
      // 07: lstore 3
      // 08: aload 0
      // 09: invokespecial java/lang/Object.<init> ()V
      // 0c: invokestatic t9d.c ()I
      // 0f: aload 0
      // 10: aload 1
      // 11: putfield wsc$fag.fy5 Ljava/lang/String;
      // 14: istore 5
      // 16: aload 2
      // 17: iload 5
      // 19: ifne 4c
      // 1c: ifnonnull 44
      // 1f: goto 26
      // 22: invokestatic wsc$fag.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: sipush 26445
      // 2a: ldc2_w 6600711504252708897
      // 2d: lload 3
      // 2e: lxor
      // 2f: invokedynamic i (IJ)Ljava/lang/String; bsm=wsc$fag.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: nop
      // 35: putfield wsc$fag.klr Ljava/lang/String;
      // 38: iload 5
      // 3a: ifeq c2
      // 3d: goto 44
      // 40: invokestatic wsc$fag.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 2
      // 45: goto 4c
      // 48: invokestatic wsc$fag.a (Loov;)Loov;
      // 4b: athrow
      // 4c: iload 5
      // 4e: ifne 66
      // 51: instanceof java/lang/Throwable
      // 54: ifeq b3
      // 57: goto 5e
      // 5a: invokestatic wsc$fag.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 2
      // 5f: goto 66
      // 62: invokestatic wsc$fag.a (Loov;)Loov;
      // 65: athrow
      // 66: checkcast java/lang/Throwable
      // 69: astore 6
      // 6b: aload 0
      // 6c: new java/lang/StringBuilder
      // 6f: dup
      // 70: invokespecial java/lang/StringBuilder.<init> ()V
      // 73: sipush 5655
      // 76: ldc2_w 7539274472845990266
      // 79: lload 3
      // 7a: lxor
      // 7b: invokedynamic i (IJ)Ljava/lang/String; bsm=wsc$fag.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: nop
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: aload 6
      // 86: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 89: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 8c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8f: sipush 25098
      // 92: ldc2_w 4686336325554318693
      // 95: lload 3
      // 96: lxor
      // 97: invokedynamic i (IJ)Ljava/lang/String; bsm=wsc$fag.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: nop
      // 9d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a0: aload 6
      // a2: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ab: putfield wsc$fag.klr Ljava/lang/String;
      // ae: iload 5
      // b0: ifeq c2
      // b3: aload 0
      // b4: aload 2
      // b5: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // b8: putfield wsc$fag.klr Ljava/lang/String;
      // bb: goto c2
      // be: invokestatic wsc$fag.a (Loov;)Loov;
      // c1: athrow
      // c2: return
   }

   public String ms_() {
      return this.fy5;
   }

   public String eub() {
      return this.klr;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1605520277963965327L, -2569167475658588631L, MethodHandles.lookup().lookupClass()).a(176152513856670L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 131431272046110L;
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
      String var6 = "\u001fÀr\u001b?¾\u001c@×Tis\u001fz6ºë6ÿ3[ü\u001dl\u0018Ê\u0005¹Nâ \u0092µÜ÷¬°â 81º'\u008aÞUf\u0089×\u0010 %ÍD*ª\\hK`7Û\u0082;/w";
      int var8 = "\u001fÀr\u001b?¾\u001c@×Tis\u001fz6ºë6ÿ3[ü\u001dl\u0018Ê\u0005¹Nâ \u0092µÜ÷¬°â 81º'\u008aÞUf\u0089×\u0010 %ÍD*ª\\hK`7Û\u0082;/w".length();
      char var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22820;
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
            throw new RuntimeException("wsc$fag", var10);
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
         throw new RuntimeException("wsc$fag" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
