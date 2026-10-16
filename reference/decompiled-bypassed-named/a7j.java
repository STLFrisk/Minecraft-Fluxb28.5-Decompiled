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

@dr9$x0j(
   t2u = "rename",
   io4 = {"<name> | <player> <name> "},
   hjc = "Set display name used by NameProtect"
)
public class a7j extends HwidProvider {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   @Override
   public void xjl(String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic a7j.a J
      // 003: ldc2_w 40711236766409
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: arraylength
      // 00f: bipush 1
      // 010: iload 4
      // 012: ifeq 0fb
      // 015: if_icmpne 0e5
      // 018: goto 01f
      // 01b: invokestatic a7j.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 1
      // 020: bipush 0
      // 021: aaload
      // 022: ldc "&"
      // 024: nop
      // 025: ldc "§"
      // 027: nop
      // 028: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 02b: sipush 240
      // 02e: ldc2_w 6342710137394918755
      // 031: lload 2
      // 032: lxor
      // 033: invokedynamic s (IJ)Ljava/lang/String; bsm=a7j.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: nop
      // 039: sipush 6864
      // 03c: ldc2_w 5692423948500135750
      // 03f: lload 2
      // 040: lxor
      // 041: invokedynamic s (IJ)Ljava/lang/String; bsm=a7j.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: nop
      // 047: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 04a: ldc "_"
      // 04c: nop
      // 04d: ldc " "
      // 04f: nop
      // 050: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 053: sipush 23529
      // 056: ldc2_w 3259911156992126587
      // 059: lload 2
      // 05a: lxor
      // 05b: invokedynamic s (IJ)Ljava/lang/String; bsm=a7j.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: nop
      // 061: ldc "_"
      // 063: nop
      // 064: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 067: putstatic ejb.vt5 Ljava/lang/String;
      // 06a: iload 4
      // 06c: ifeq 0e0
      // 06f: goto 076
      // 072: invokestatic a7j.a (Loov;)Loov;
      // 075: athrow
      // 076: getstatic ModuleRegistry.f9t Lejb;
      // 079: invokevirtual ejb.klu ()Z
      // 07c: ifeq 0bc
      // 07f: goto 086
      // 082: invokestatic a7j.a (Loov;)Loov;
      // 085: athrow
      // 086: new java/lang/StringBuilder
      // 089: dup
      // 08a: invokespecial java/lang/StringBuilder.<init> ()V
      // 08d: sipush 25048
      // 090: ldc2_w 3727532234546877516
      // 093: lload 2
      // 094: lxor
      // 095: invokedynamic s (IJ)Ljava/lang/String; bsm=a7j.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: nop
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: getstatic syo.u4m Lsyo;
      // 0a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0a4: getstatic ejb.vt5 Ljava/lang/String;
      // 0a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ad: invokestatic ncl.dob (Ljava/lang/String;)V
      // 0b0: iload 4
      // 0b2: ifne 1f7
      // 0b5: goto 0bc
      // 0b8: invokestatic a7j.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: new java/lang/StringBuilder
      // 0bf: dup
      // 0c0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c3: getstatic syo.aez Lsyo;
      // 0c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0c9: sipush 20604
      // 0cc: ldc2_w 5267367287766689259
      // 0cf: lload 2
      // 0d0: lxor
      // 0d1: invokedynamic s (IJ)Ljava/lang/String; bsm=a7j.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: nop
      // 0d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0dd: invokestatic ncl.dob (Ljava/lang/String;)V
      // 0e0: iload 4
      // 0e2: ifne 1f7
      // 0e5: aload 1
      // 0e6: arraylength
      // 0e7: iload 4
      // 0e9: ifeq 10b
      // 0ec: goto 0f3
      // 0ef: invokestatic a7j.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: bipush 2
      // 0f4: goto 0fb
      // 0f7: invokestatic a7j.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: if_icmpne 1ec
      // 0fe: getstatic ModuleRegistry.f9t Lejb;
      // 101: invokevirtual ejb.klu ()Z
      // 104: goto 10b
      // 107: invokestatic a7j.a (Loov;)Loov;
      // 10a: athrow
      // 10b: iload 4
      // 10d: ifeq 138
      // 110: ifeq 1bc
      // 113: goto 11a
      // 116: invokestatic a7j.a (Loov;)Loov;
      // 119: athrow
      // 11a: getstatic ejb.j0b Ljava/util/Map;
      // 11d: aload 1
      // 11e: bipush 0
      // 11f: aaload
      // 120: iload 4
      // 122: ifeq 148
      // 125: goto 12c
      // 128: invokestatic a7j.a (Loov;)Loov;
      // 12b: athrow
      // 12c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 131: goto 138
      // 134: invokestatic a7j.a (Loov;)Loov;
      // 137: athrow
      // 138: ifne 18d
      // 13b: getstatic ejb.j0b Ljava/util/Map;
      // 13e: aload 1
      // 13f: bipush 0
      // 140: aaload
      // 141: goto 148
      // 144: invokestatic a7j.a (Loov;)Loov;
      // 147: athrow
      // 148: aload 1
      // 149: bipush 1
      // 14a: aaload
      // 14b: sipush 19700
      // 14e: ldc2_w 7768320446084036961
      // 151: lload 2
      // 152: lxor
      // 153: invokedynamic s (IJ)Ljava/lang/String; bsm=a7j.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: nop
      // 159: sipush 23529
      // 15c: ldc2_w 3259911156992126587
      // 15f: lload 2
      // 160: lxor
      // 161: invokedynamic s (IJ)Ljava/lang/String; bsm=a7j.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: nop
      // 167: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 16a: ldc "_"
      // 16c: nop
      // 16d: ldc " "
      // 16f: nop
      // 170: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 173: sipush 23529
      // 176: ldc2_w 3259911156992126587
      // 179: lload 2
      // 17a: lxor
      // 17b: invokedynamic s (IJ)Ljava/lang/String; bsm=a7j.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: nop
      // 181: ldc "_"
      // 183: nop
      // 184: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 187: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 18c: pop
      // 18d: new java/lang/StringBuilder
      // 190: dup
      // 191: invokespecial java/lang/StringBuilder.<init> ()V
      // 194: sipush 1231
      // 197: ldc2_w 819504580600000862
      // 19a: lload 2
      // 19b: lxor
      // 19c: invokedynamic s (IJ)Ljava/lang/String; bsm=a7j.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: nop
      // 1a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a5: getstatic syo.u4m Lsyo;
      // 1a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1ab: aload 1
      // 1ac: bipush 1
      // 1ad: aaload
      // 1ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b4: invokestatic ncl.dob (Ljava/lang/String;)V
      // 1b7: iload 4
      // 1b9: ifne 1f7
      // 1bc: new java/lang/StringBuilder
      // 1bf: dup
      // 1c0: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c3: getstatic syo.aez Lsyo;
      // 1c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1c9: sipush 24539
      // 1cc: ldc2_w 6585779674432678475
      // 1cf: lload 2
      // 1d0: lxor
      // 1d1: invokedynamic s (IJ)Ljava/lang/String; bsm=a7j.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: nop
      // 1d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1dd: invokestatic ncl.dob (Ljava/lang/String;)V
      // 1e0: iload 4
      // 1e2: ifne 1f7
      // 1e5: goto 1ec
      // 1e8: invokestatic a7j.a (Loov;)Loov;
      // 1eb: athrow
      // 1ec: aload 0
      // 1ed: invokevirtual a7j.dhs ()V
      // 1f0: goto 1f7
      // 1f3: invokestatic a7j.a (Loov;)Loov;
      // 1f6: athrow
      // 1f7: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1458950058112830634L, 6404147535365943744L, MethodHandles.lookup().lookupClass()).a(137455217854703L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 94653356767224L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "\u009ek<\u0011ÿ\u000fÖÊ~Üe£\f§Å\u0091\u0095íôAÏ\u0084\u009aU]U1\u0083µx\u0080\u009a\u0000\u0099ÚV·o^á¡¶Û2\u0086Ü\u000b\u007f\u0014q¿\u0099j¡´QX»\u009f`ü©\u008dd%]&ÿ\u001b(!mg\u009bü®{|®Ò\"_T9À\u009c\u0015×/{æNè\u001cJ\u009a{Cv¢\u009dË\u0095guå\u009bBFÌ\u00932é_ç\u0097\u0018\u000fEõY)\u0086Ú\u0088Ãf\t¶t\u0090ß\u0015\u0090\u0095þ·\u000f¶KÿóÎA\u0010\u0010D¿«]çXB\u0005Õ\u0006')_®Ìö z®Þ\u001fqvË;ÊlË\u0005\u0019x;ÀLy:\u0002Þê¢J=\b9ÎgÑ§r\u0010ù8RÏ¤þR¤\u001c®öÎ\u0082gk(8Ùð«²¸UÕøÌÍ(Ú\nR\u009fxd|ÿÃµ/_\u0090\u0080ÌÈ©¹TMT½\u009cP\u0098R\u0002ßÿcHôò\fÛ gûö BG\u0017\u0007\u0017";
      int var8 = "\u009ek<\u0011ÿ\u000fÖÊ~Üe£\f§Å\u0091\u0095íôAÏ\u0084\u009aU]U1\u0083µx\u0080\u009a\u0000\u0099ÚV·o^á¡¶Û2\u0086Ü\u000b\u007f\u0014q¿\u0099j¡´QX»\u009f`ü©\u008dd%]&ÿ\u001b(!mg\u009bü®{|®Ò\"_T9À\u009c\u0015×/{æNè\u001cJ\u009a{Cv¢\u009dË\u0095guå\u009bBFÌ\u00932é_ç\u0097\u0018\u000fEõY)\u0086Ú\u0088Ãf\t¶t\u0090ß\u0015\u0090\u0095þ·\u000f¶KÿóÎA\u0010\u0010D¿«]çXB\u0005Õ\u0006')_®Ìö z®Þ\u001fqvË;ÊlË\u0005\u0019x;ÀLy:\u0002Þê¢J=\b9ÎgÑ§r\u0010ù8RÏ¤þR¤\u001c®öÎ\u0082gk(8Ùð«²¸UÕøÌÍ(Ú\nR\u009fxd|ÿÃµ/_\u0090\u0080ÌÈ©¹TMT½\u009cP\u0098R\u0002ßÿcHôò\fÛ gûö BG\u0017\u0007\u0017"
         .length();
      char var5 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[8];
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

                  var6 = "ÿé®dÂõ\u0090ÎXleR\u000er¼ÎO\u0087ñÕaP t²N1+x¹\u0000ð¾\u0016Átéæ÷\u008b\u009a3(VôÓ¨OÆ¸Ç\u001cÂ\u009bîr\u0083I¹f]Îy\u0016®*ÏeæÊ+æè\u0013\u008e\u008cà¼ÖÚæ[à\u0087Ð\u0003\u0099ï ¦)$QÖ¥Ì\u0001Ùñ]\u0082\u0007W\u0019Æ=ÈN\u0015\u008e\u0094\u0005Wï@QRÝõy\u0003";
                  var8 = "ÿé®dÂõ\u0090ÎXleR\u000er¼ÎO\u0087ñÕaP t²N1+x¹\u0000ð¾\u0016Átéæ÷\u008b\u009a3(VôÓ¨OÆ¸Ç\u001cÂ\u009bîr\u0083I¹f]Îy\u0016®*ÏeæÊ+æè\u0013\u008e\u008cà¼ÖÚæ[à\u0087Ð\u0003\u0099ï ¦)$QÖ¥Ì\u0001Ùñ]\u0082\u0007W\u0019Æ=ÈN\u0015\u008e\u0094\u0005Wï@QRÝõy\u0003"
                     .length();
                  var5 = 'X';
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17043;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("a7j", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("a7j" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
