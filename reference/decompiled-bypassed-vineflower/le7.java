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

public class le7 extends ar7 {
   public static crk x2g;
   public static cn7 t87;
   public static cn7 ari;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public le7() {
      long var1 = a ^ 91226030448781L;
      super(b<"f">(17319, 4429301389054480867L ^ var1), _aj.i9j, false, new j1s[0]);
   }

   @jev
   public void rlc(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual fz2.lhw ()Z
      // 008: iload 2
      // 009: ifeq 035
      // 00c: ifeq 031
      // 00f: goto 016
      // 012: invokestatic le7.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield le7.jae I
      // 01a: bipush -1
      // 01b: iload 2
      // 01c: ifeq 041
      // 01f: goto 026
      // 022: invokestatic le7.a (Loov;)Loov;
      // 025: athrow
      // 026: if_icmpne 031
      // 029: goto 030
      // 02c: invokestatic le7.a (Loov;)Loov;
      // 02f: athrow
      // 030: return
      // 031: aload 0
      // 032: getfield le7.jae I
      // 035: iload 2
      // 036: ifeq 1be
      // 039: bipush -1
      // 03a: goto 041
      // 03d: invokestatic le7.a (Loov;)Loov;
      // 040: athrow
      // 041: if_icmpne 1ab
      // 044: getstatic le7.ek1 Lc05;
      // 047: getfield c05.vg8 Ll86;
      // 04a: getfield l86.lls Lpj2;
      // 04d: getfield pj2.g40 Z
      // 050: iload 2
      // 051: ifeq 08e
      // 054: goto 05b
      // 057: invokestatic le7.a (Loov;)Loov;
      // 05a: athrow
      // 05b: ifne 091
      // 05e: goto 065
      // 061: invokestatic le7.a (Loov;)Loov;
      // 064: athrow
      // 065: getstatic le7.ek1 Lc05;
      // 068: getfield c05.vg8 Ll86;
      // 06b: invokevirtual l86.wvq ()Lwkk;
      // 06e: invokevirtual wkk.f1i ()I
      // 071: i2f
      // 072: iload 2
      // 073: ifeq 093
      // 076: goto 07d
      // 079: invokestatic le7.a (Loov;)Loov;
      // 07c: athrow
      // 07d: getstatic le7.x2g Lcrk;
      // 080: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 083: invokevirtual java/lang/Float.floatValue ()F
      // 086: fcmpl
      // 087: goto 08e
      // 08a: invokestatic le7.a (Loov;)Loov;
      // 08d: athrow
      // 08e: iflt 092
      // 091: return
      // 092: fconst_0
      // 093: fstore 3
      // 094: aload 0
      // 095: bipush -1
      // 096: putfield le7.c96 I
      // 099: bipush 0
      // 09a: istore 4
      // 09c: iload 4
      // 09e: bipush 9
      // 0a0: if_icmpge 17f
      // 0a3: getstatic le7.ek1 Lc05;
      // 0a6: getfield c05.vg8 Ll86;
      // 0a9: getfield l86.up_ Ljnq;
      // 0ac: iload 4
      // 0ae: invokevirtual jnq.ibn (I)Lerg;
      // 0b1: astore 5
      // 0b3: iload 2
      // 0b4: ifeq 1a7
      // 0b7: iload 2
      // 0b8: ifeq 17b
      // 0bb: goto 0c2
      // 0be: invokestatic le7.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 5
      // 0c4: ifnull 178
      // 0c7: goto 0ce
      // 0ca: invokestatic le7.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: fconst_0
      // 0cf: fstore 6
      // 0d1: aload 5
      // 0d3: invokevirtual erg.gn1 ()Lu7m;
      // 0d6: instanceof itu
      // 0d9: iload 2
      // 0da: ifeq 16c
      // 0dd: ifeq 15d
      // 0e0: goto 0e7
      // 0e3: invokestatic le7.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: getstatic le7.t87 Lcn7;
      // 0ea: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 0ed: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f0: iload 2
      // 0f1: ifeq 127
      // 0f4: goto 0fb
      // 0f7: invokestatic le7.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: ifne 117
      // 0fe: goto 105
      // 101: invokestatic le7.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 5
      // 107: invokevirtual erg.gn1 ()Lu7m;
      // 10a: getstatic xbr.yyh Lu7m;
      // 10d: if_acmpeq 15d
      // 110: goto 117
      // 113: invokestatic le7.a (Loov;)Loov;
      // 116: athrow
      // 117: getstatic le7.ari Lcn7;
      // 11a: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 11d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 120: goto 127
      // 123: invokestatic le7.a (Loov;)Loov;
      // 126: athrow
      // 127: ifne 147
      // 12a: aload 5
      // 12c: invokevirtual erg.gn1 ()Lu7m;
      // 12f: iload 2
      // 130: ifeq 153
      // 133: goto 13a
      // 136: invokestatic le7.a (Loov;)Loov;
      // 139: athrow
      // 13a: getstatic xbr.ii5 Lu7m;
      // 13d: if_acmpeq 15d
      // 140: goto 147
      // 143: invokestatic le7.a (Loov;)Loov;
      // 146: athrow
      // 147: aload 5
      // 149: invokevirtual erg.gn1 ()Lu7m;
      // 14c: goto 153
      // 14f: invokestatic le7.a (Loov;)Loov;
      // 152: athrow
      // 153: checkcast itu
      // 156: aload 5
      // 158: invokevirtual itu.fko (Lerg;)F
      // 15b: fstore 6
      // 15d: fload 6
      // 15f: iload 2
      // 160: ifeq 171
      // 163: fload 3
      // 164: fcmpl
      // 165: goto 16c
      // 168: invokestatic le7.a (Loov;)Loov;
      // 16b: athrow
      // 16c: ifle 178
      // 16f: fload 6
      // 171: fstore 3
      // 172: aload 0
      // 173: iload 4
      // 175: putfield le7.c96 I
      // 178: iinc 4 1
      // 17b: iload 2
      // 17c: ifne 09c
      // 17f: aload 0
      // 180: iload 2
      // 181: ifeq 198
      // 184: getfield le7.c96 I
      // 187: bipush -1
      // 188: if_icmpne 197
      // 18b: goto 192
      // 18e: invokestatic le7.a (Loov;)Loov;
      // 191: athrow
      // 192: return
      // 193: invokestatic le7.a (Loov;)Loov;
      // 196: athrow
      // 197: aload 0
      // 198: getstatic le7.ek1 Lc05;
      // 19b: getfield c05.vg8 Ll86;
      // 19e: getfield l86.up_ Ljnq;
      // 1a1: getfield jnq.nb5 I
      // 1a4: putfield le7.jae I
      // 1a7: iload 2
      // 1a8: ifne 252
      // 1ab: getstatic le7.ek1 Lc05;
      // 1ae: getfield c05.vg8 Ll86;
      // 1b1: getfield l86.lls Lpj2;
      // 1b4: getfield pj2.g40 Z
      // 1b7: goto 1be
      // 1ba: invokestatic le7.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: iload 2
      // 1bf: ifeq 1ea
      // 1c2: ifne 1ef
      // 1c5: goto 1cc
      // 1c8: invokestatic le7.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: getstatic le7.ek1 Lc05;
      // 1cf: getfield c05.vg8 Ll86;
      // 1d2: iload 2
      // 1d3: ifeq 1fe
      // 1d6: goto 1dd
      // 1d9: invokestatic le7.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: invokevirtual l86.wvq ()Lwkk;
      // 1e0: invokevirtual wkk.f1i ()I
      // 1e3: goto 1ea
      // 1e6: invokestatic le7.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: bipush 20
      // 1ec: if_icmplt 1f8
      // 1ef: aload 0
      // 1f0: invokespecial le7.csp ()V
      // 1f3: return
      // 1f4: invokestatic le7.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: getstatic le7.ek1 Lc05;
      // 1fb: getfield c05.vg8 Ll86;
      // 1fe: getfield l86.up_ Ljnq;
      // 201: aload 0
      // 202: getfield le7.c96 I
      // 205: invokevirtual jnq.ibn (I)Lerg;
      // 208: astore 3
      // 209: iload 2
      // 20a: ifeq 234
      // 20d: aload 3
      // 20e: ifnull 229
      // 211: goto 218
      // 214: invokestatic le7.a (Loov;)Loov;
      // 217: athrow
      // 218: aload 3
      // 219: invokevirtual erg.gn1 ()Lu7m;
      // 21c: instanceof itu
      // 21f: ifne 235
      // 222: goto 229
      // 225: invokestatic le7.a (Loov;)Loov;
      // 228: athrow
      // 229: aload 0
      // 22a: invokespecial le7.csp ()V
      // 22d: goto 234
      // 230: invokestatic le7.a (Loov;)Loov;
      // 233: athrow
      // 234: return
      // 235: getstatic le7.ek1 Lc05;
      // 238: getfield c05.vg8 Ll86;
      // 23b: getfield l86.up_ Ljnq;
      // 23e: aload 0
      // 23f: getfield le7.c96 I
      // 242: putfield jnq.nb5 I
      // 245: getstatic le7.ek1 Lc05;
      // 248: getfield c05.oxn Lmoh;
      // 24b: getfield moh.oxt Lm7l;
      // 24e: bipush 1
      // 24f: invokevirtual m7l.xdn (Z)V
      // 252: return
   }

   private void csp() {
      ek1.oxn.oxt.xdn(false);
      ek1.vg8.up_.nb5 = this.jae;
      this.jae = -1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6074812897443809469L, 3573998809445646997L, MethodHandles.lookup().lookupClass()).a(22363729952136L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 124933034426940L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "\u0007x§\u007f\u0002\u000eépü«[#n&\u0099\u0001 ßÖ¥\u000f1À\u0089:ßß6\u0080£u\u0007@¯\u009fO@\u0087y\ruéàú\u0086\u0085\u0082ú\u0005\u0010Fû\u0011\u009bO, õQ?²/7º\u0096i";
      int var6 = "\u0007x§\u007f\u0002\u000eépü«[#n&\u0099\u0001 ßÖ¥\u000f1À\u0089:ßß6\u0080£u\u0007@¯\u009fO@\u0087y\ruéàú\u0086\u0085\u0082ú\u0005\u0010Fû\u0011\u009bO, õQ?²/7º\u0096i"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[5];
                     x2g = new crk(b<"f">(13062, 4707524951802217457L ^ var9), b<"f">(6566, 5058831308428388693L ^ var9), 10.0F, 1.0F, 20.0F, 1.0F);
                     t87 = new cn7(b<"f">(13062, 4707524951802217457L ^ var9), b<"f">(21595, 2159200378788570285L ^ var9), false);
                     ari = new cn7(b<"f">(13062, 4707524951802217457L ^ var9), b<"f">(5997, 1203703289446344601L ^ var9), false);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "Ù\u0005C5#G\u0010\u001emrÞÄÇ»á~)>úÞõSY©\u009b\u0083\u0092¤\u001fèv' \u009b|\u0081à\u008cáÞù#ªa-T¡ïëóÿ8p\reÇµ\u0095\u0005ÒäýüêÚ";
                  var6 = "Ù\u0005C5#G\u0010\u001emrÞÄÇ»á~)>úÞõSY©\u009b\u0083\u0092¤\u001fèv' \u009b|\u0081à\u008cáÞù#ªa-T¡ïëóÿ8p\reÇµ\u0095\u0005ÒäýüêÚ"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16872;
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
            throw new RuntimeException("le7", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("le7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
