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

public final class _ss$2 implements bx6 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public String dg6(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic _ss$2.a J
      // 003: ldc2_w 30483581397471
      // 006: lxor
      // 007: lstore 2
      // 008: iload 1
      // 009: i2d
      // 00a: ldc2_w 20.0
      // 00d: ddiv
      // 00e: dstore 5
      // 010: dload 5
      // 012: ldc2_w 60.0
      // 015: ddiv
      // 016: dstore 7
      // 018: invokestatic t9d.c ()I
      // 01b: dload 7
      // 01d: ldc2_w 60.0
      // 020: ddiv
      // 021: dstore 9
      // 023: istore 4
      // 025: dload 9
      // 027: ldc2_w 24.0
      // 02a: ddiv
      // 02b: dstore 11
      // 02d: dload 11
      // 02f: ldc2_w 365.0
      // 032: ddiv
      // 033: dstore 13
      // 035: dload 13
      // 037: ldc2_w 0.5
      // 03a: dcmpl
      // 03b: iload 4
      // 03d: ifne 07d
      // 040: ifle 077
      // 043: goto 04a
      // 046: invokestatic _ss$2.a (Loov;)Loov;
      // 049: athrow
      // 04a: new java/lang/StringBuilder
      // 04d: dup
      // 04e: invokespecial java/lang/StringBuilder.<init> ()V
      // 051: invokestatic _ss.esp ()Ljava/text/DecimalFormat;
      // 054: dload 13
      // 056: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 059: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05c: sipush 14796
      // 05f: ldc2_w 4972383605445316994
      // 062: lload 2
      // 063: lxor
      // 064: invokedynamic m (IJ)Ljava/lang/String; bsm=_ss$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: nop
      // 06a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 070: goto 151
      // 073: invokestatic _ss$2.a (Loov;)Loov;
      // 076: athrow
      // 077: dload 11
      // 079: ldc2_w 0.5
      // 07c: dcmpl
      // 07d: iload 4
      // 07f: ifne 0bf
      // 082: ifle 0b9
      // 085: goto 08c
      // 088: invokestatic _ss$2.a (Loov;)Loov;
      // 08b: athrow
      // 08c: new java/lang/StringBuilder
      // 08f: dup
      // 090: invokespecial java/lang/StringBuilder.<init> ()V
      // 093: invokestatic _ss.esp ()Ljava/text/DecimalFormat;
      // 096: dload 11
      // 098: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: sipush 21581
      // 0a1: ldc2_w 8724931308000590848
      // 0a4: lload 2
      // 0a5: lxor
      // 0a6: invokedynamic m (IJ)Ljava/lang/String; bsm=_ss$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: nop
      // 0ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b2: goto 151
      // 0b5: invokestatic _ss$2.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: dload 9
      // 0bb: ldc2_w 0.5
      // 0be: dcmpl
      // 0bf: iload 4
      // 0c1: ifne 101
      // 0c4: ifle 0fb
      // 0c7: goto 0ce
      // 0ca: invokestatic _ss$2.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: new java/lang/StringBuilder
      // 0d1: dup
      // 0d2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d5: invokestatic _ss.esp ()Ljava/text/DecimalFormat;
      // 0d8: dload 9
      // 0da: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: sipush 15212
      // 0e3: ldc2_w 5787964234657387299
      // 0e6: lload 2
      // 0e7: lxor
      // 0e8: invokedynamic m (IJ)Ljava/lang/String; bsm=_ss$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: nop
      // 0ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f4: goto 151
      // 0f7: invokestatic _ss$2.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: dload 7
      // 0fd: ldc2_w 0.5
      // 100: dcmpl
      // 101: ifle 131
      // 104: new java/lang/StringBuilder
      // 107: dup
      // 108: invokespecial java/lang/StringBuilder.<init> ()V
      // 10b: invokestatic _ss.esp ()Ljava/text/DecimalFormat;
      // 10e: dload 7
      // 110: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 113: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 116: sipush 17121
      // 119: ldc2_w 1188365505178872493
      // 11c: lload 2
      // 11d: lxor
      // 11e: invokedynamic m (IJ)Ljava/lang/String; bsm=_ss$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: nop
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12a: goto 151
      // 12d: invokestatic _ss$2.a (Loov;)Loov;
      // 130: athrow
      // 131: new java/lang/StringBuilder
      // 134: dup
      // 135: invokespecial java/lang/StringBuilder.<init> ()V
      // 138: dload 5
      // 13a: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 13d: sipush 8828
      // 140: ldc2_w 5469817616891005493
      // 143: lload 2
      // 144: lxor
      // 145: invokedynamic m (IJ)Ljava/lang/String; bsm=_ss$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: nop
      // 14b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 151: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1852683088249835535L, 3843871833302297240L, MethodHandles.lookup().lookupClass()).a(93333536604944L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 1308594464967L;
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
      String var6 = "øÌ( \u0016A+GÂø]V\u009b4®å\u0010\u009a{²0\u0013\u0019½\\\u0091»È¸²WäY\u0010f/ly>Îü\u001c\u0007ý|\u0089Q±a\u008e";
      int var8 = "øÌ( \u0016A+GÂø]V\u009b4®å\u0010\u009a{²0\u0013\u0019½\\\u0091»È¸²WäY\u0010f/ly>Îü\u001c\u0007ý|\u0089Q±a\u008e".length();
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
                     c = new String[5];
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

                  var6 = "ã¬Ô!ë&,§·.ìÎ5z\t\u0006\u0010 \u0089\f\u0095ëï¥ª¼ÍJ{(\u0006pä";
                  var8 = "ã¬Ô!ë&,§·.ìÎ5z\t\u0006\u0010 \u0089\f\u0095ëï¥ª¼ÍJ{(\u0006pä".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11649;
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
            throw new RuntimeException("_ss$2", var10);
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
         throw new RuntimeException("_ss$2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
