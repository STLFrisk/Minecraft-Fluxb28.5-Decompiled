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

public class ijg$1 extends Thread {
   public final ijg _jc;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ijg$1(ijg var1) {
      this._jc = var1;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ijg$1.a J
      // 003: ldc2_w 12086127651181
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield ijg$1._jc Lijg;
      // 010: sipush 20807
      // 013: ldc2_w 4052441006702977477
      // 016: lload 1
      // 017: lxor
      // 018: invokedynamic t (IJ)Ljava/lang/String; bsm=ijg$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01d: nop
      // 01e: putfield ijg.cqv Ljava/lang/String;
      // 021: aload 0
      // 022: getfield ijg$1._jc Lijg;
      // 025: getfield ijg.ezi Loon;
      // 028: invokevirtual oon.eec ()Ljava/lang/String;
      // 02b: sipush 28787
      // 02e: ldc2_w 3627700220714402034
      // 031: lload 1
      // 032: lxor
      // 033: invokedynamic t (IJ)Ljava/lang/String; bsm=ijg$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: nop
      // 039: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 03c: iload 3
      // 03d: ifeq 101
      // 040: ifeq 0e5
      // 043: goto 04a
      // 046: invokestatic ijg$1.a (Loov;)Loov;
      // 049: athrow
      // 04a: invokestatic yxu.vtm ()Lyxu;
      // 04d: getstatic iw2.ltn Liw2;
      // 050: invokevirtual yxu.wzp (Liw2;)V
      // 053: aload 0
      // 054: getfield ijg$1._jc Lijg;
      // 057: aload 0
      // 058: getfield ijg$1._jc Lijg;
      // 05b: getfield ijg.ezi Loon;
      // 05e: invokevirtual oon.eec ()Ljava/lang/String;
      // 061: ldc ":"
      // 063: nop
      // 064: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 067: bipush 0
      // 068: aaload
      // 069: sipush 1597
      // 06c: ldc2_w 9062539839036995262
      // 06f: lload 1
      // 070: lxor
      // 071: invokedynamic t (IJ)Ljava/lang/String; bsm=ijg$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: nop
      // 077: invokestatic zfs.eoj (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 07a: putfield ijg.cqv Ljava/lang/String;
      // 07d: aload 0
      // 07e: getfield ijg$1._jc Lijg;
      // 081: iload 3
      // 082: ifeq 0db
      // 085: goto 08c
      // 088: invokestatic ijg$1.a (Loov;)Loov;
      // 08b: athrow
      // 08c: getfield ijg.cqv Ljava/lang/String;
      // 08f: ifnull 0d0
      // 092: goto 099
      // 095: invokestatic ijg$1.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 0
      // 09a: getfield ijg$1._jc Lijg;
      // 09d: new java/lang/StringBuilder
      // 0a0: dup
      // 0a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a4: aload 0
      // 0a5: getfield ijg$1._jc Lijg;
      // 0a8: getfield ijg.cqv Ljava/lang/String;
      // 0ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ae: sipush 26685
      // 0b1: ldc2_w 7405164705370429629
      // 0b4: lload 1
      // 0b5: lxor
      // 0b6: invokedynamic t (IJ)Ljava/lang/String; bsm=ijg$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: nop
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c2: putfield ijg.cqv Ljava/lang/String;
      // 0c5: iload 3
      // 0c6: ifne 0e4
      // 0c9: goto 0d0
      // 0cc: invokestatic ijg$1.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: getfield ijg$1._jc Lijg;
      // 0d4: goto 0db
      // 0d7: invokestatic ijg$1.a (Loov;)Loov;
      // 0da: athrow
      // 0db: invokestatic ijg.r9h (Lijg;)Lc05;
      // 0de: invokestatic ijg.fnn ()Lgbe;
      // 0e1: invokevirtual c05.z2i (Lgbe;)V
      // 0e4: return
      // 0e5: aload 0
      // 0e6: getfield ijg$1._jc Lijg;
      // 0e9: getfield ijg.ezi Loon;
      // 0ec: invokevirtual oon.eec ()Ljava/lang/String;
      // 0ef: ldc ":"
      // 0f1: nop
      // 0f2: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 0f5: iload 3
      // 0f6: ifeq 145
      // 0f9: arraylength
      // 0fa: goto 101
      // 0fd: invokestatic ijg$1.a (Loov;)Loov;
      // 100: athrow
      // 101: bipush 1
      // 102: if_icmpgt 125
      // 105: aload 0
      // 106: getfield ijg$1._jc Lijg;
      // 109: getfield ijg.ezi Loon;
      // 10c: invokevirtual oon.eec ()Ljava/lang/String;
      // 10f: invokestatic zfs.cg7 (Ljava/lang/String;)V
      // 112: aload 0
      // 113: getfield ijg$1._jc Lijg;
      // 116: aconst_null
      // 117: putfield ijg.cqv Ljava/lang/String;
      // 11a: iload 3
      // 11b: ifne 16b
      // 11e: goto 125
      // 121: invokestatic ijg$1.a (Loov;)Loov;
      // 124: athrow
      // 125: invokestatic yxu.g3c ()Lyxu;
      // 128: getstatic iw2.ot_ Liw2;
      // 12b: invokevirtual yxu.wzp (Liw2;)V
      // 12e: aload 0
      // 12f: getfield ijg$1._jc Lijg;
      // 132: getfield ijg.ezi Loon;
      // 135: invokevirtual oon.eec ()Ljava/lang/String;
      // 138: ldc ":"
      // 13a: nop
      // 13b: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 13e: goto 145
      // 141: invokestatic ijg$1.a (Loov;)Loov;
      // 144: athrow
      // 145: bipush 0
      // 146: aaload
      // 147: astore 4
      // 149: aload 0
      // 14a: getfield ijg$1._jc Lijg;
      // 14d: getfield ijg.ezi Loon;
      // 150: invokevirtual oon.eec ()Ljava/lang/String;
      // 153: ldc ":"
      // 155: nop
      // 156: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 159: bipush 1
      // 15a: aaload
      // 15b: astore 5
      // 15d: aload 0
      // 15e: getfield ijg$1._jc Lijg;
      // 161: aload 4
      // 163: aload 5
      // 165: invokestatic zfs.eoj (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 168: putfield ijg.cqv Ljava/lang/String;
      // 16b: aload 0
      // 16c: getfield ijg$1._jc Lijg;
      // 16f: iload 3
      // 170: ifeq 18b
      // 173: getfield ijg.cqv Ljava/lang/String;
      // 176: ifnonnull 194
      // 179: goto 180
      // 17c: invokestatic ijg$1.a (Loov;)Loov;
      // 17f: athrow
      // 180: aload 0
      // 181: getfield ijg$1._jc Lijg;
      // 184: goto 18b
      // 187: invokestatic ijg$1.a (Loov;)Loov;
      // 18a: athrow
      // 18b: invokestatic ijg.kax (Lijg;)Lc05;
      // 18e: invokestatic ijg.fnn ()Lgbe;
      // 191: invokevirtual c05.z2i (Lgbe;)V
      // 194: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1914429802170218867L, -6251699518103346516L, MethodHandles.lookup().lookupClass()).a(133176451480534L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 54228034150753L;
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
      String var6 = "þó,{Ö\u0087\fÁy\u008a³H\u001e\u008aùR+\by½£ì\u0000/\u0011È\u0084»\u0014f/K9«Úòï·\u0015\u0087 CsÄ]X^\u0099\u0090\u0094i×\u0011\u0087\u0098\u0016\u0088\u0001Ap\u0087\u0003 ¹ÀÃ\u007fóª\u0099\u0095\u009c\u0097";
      int var8 = "þó,{Ö\u0087\fÁy\u008a³H\u001e\u008aùR+\by½£ì\u0000/\u0011È\u0084»\u0014f/K9«Úòï·\u0015\u0087 CsÄ]X^\u0099\u0090\u0094i×\u0011\u0087\u0098\u0016\u0088\u0001Ap\u0087\u0003 ¹ÀÃ\u007fóª\u0099\u0095\u009c\u0097"
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

                  var6 = "\u0015çoê\u0088¨\b\u0007\u008agðë\u0085\u0084N\u008b¶PEø4\u0002¯Ýy\u0097»\u0001+0?`\u00ad\u00ad£\u0001]\u00019\u0005T©b||\u007f¬õ\u0018åTìH°\nRo!\u0010£°_¬ì&,ÑpH»úíÊ";
                  var8 = "\u0015çoê\u0088¨\b\u0007\u008agðë\u0085\u0084N\u008b¶PEø4\u0002¯Ýy\u0097»\u0001+0?`\u00ad\u00ad£\u0001]\u00019\u0005T©b||\u007f¬õ\u0018åTìH°\nRo!\u0010£°_¬ì&,ÑpH»úíÊ"
                     .length();
                  var5 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2347;
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
            throw new RuntimeException("ijg$1", var10);
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
         throw new RuntimeException("ijg$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
