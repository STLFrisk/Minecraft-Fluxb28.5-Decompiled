import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vqu$1 extends Thread {
   public final String qzt;
   public final int ajg;
   public final vqu fc5;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public vqu$1(vqu var1, String var2, String var3, int var4) {
      super(var2);
      this.fc5 = var1;
      this.qzt = var3;
      this.ajg = var4;
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
      // 000: getstatic vqu$1.a J
      // 003: ldc2_w 117367138409422
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aconst_null
      // 00d: astore 4
      // 00f: aload 0
      // 010: iload 3
      // 011: ifne 01f
      // 014: getfield vqu$1.fc5 Lvqu;
      // 017: invokestatic vqu.x9p (Lvqu;)Z
      // 01a: ifeq 01e
      // 01d: return
      // 01e: aload 0
      // 01f: getfield vqu$1.qzt Ljava/lang/String;
      // 022: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 025: astore 4
      // 027: aload 0
      // 028: getfield vqu$1.fc5 Lvqu;
      // 02b: aload 4
      // 02d: aload 0
      // 02e: getfield vqu$1.ajg I
      // 031: aload 0
      // 032: getfield vqu$1.fc5 Lvqu;
      // 035: invokestatic vqu.wr7 (Lvqu;)Lc05;
      // 038: getfield c05.oxn Lmoh;
      // 03b: invokevirtual moh.qhk ()Z
      // 03e: invokestatic hv0.wkr (Ljava/net/InetAddress;IZ)Lhv0;
      // 041: invokestatic vqu.xyu (Lvqu;Lhv0;)Lhv0;
      // 044: pop
      // 045: aload 0
      // 046: getfield vqu$1.fc5 Lvqu;
      // 049: invokestatic vqu._9j (Lvqu;)Lhv0;
      // 04c: new gvy
      // 04f: dup
      // 050: aload 0
      // 051: getfield vqu$1.fc5 Lvqu;
      // 054: invokestatic vqu._9j (Lvqu;)Lhv0;
      // 057: aload 0
      // 058: getfield vqu$1.fc5 Lvqu;
      // 05b: invokestatic vqu.ecu (Lvqu;)Lc05;
      // 05e: aload 0
      // 05f: getfield vqu$1.fc5 Lvqu;
      // 062: invokestatic vqu.f6t (Lvqu;)Lgbe;
      // 065: invokespecial gvy.<init> (Lhv0;Lc05;Lgbe;)V
      // 068: invokevirtual hv0.kbj (Lyw3;)V
      // 06b: aload 0
      // 06c: getfield vqu$1.fc5 Lvqu;
      // 06f: invokestatic vqu._9j (Lvqu;)Lhv0;
      // 072: new net/minecraft/network/handshake/client/C00Handshake
      // 075: dup
      // 076: bipush 47
      // 078: aload 0
      // 079: getfield vqu$1.qzt Ljava/lang/String;
      // 07c: aload 0
      // 07d: getfield vqu$1.ajg I
      // 080: getstatic a0t.le5 La0t;
      // 083: invokespecial net/minecraft/network/handshake/client/C00Handshake.<init> (ILjava/lang/String;ILa0t;)V
      // 086: invokevirtual hv0.k7f (Lmz2;)V
      // 089: aload 0
      // 08a: getfield vqu$1.fc5 Lvqu;
      // 08d: invokestatic vqu._9j (Lvqu;)Lhv0;
      // 090: new net/minecraft/network/login/client/C00PacketLoginStart
      // 093: dup
      // 094: aload 0
      // 095: getfield vqu$1.fc5 Lvqu;
      // 098: invokestatic vqu.cb9 (Lvqu;)Lc05;
      // 09b: invokevirtual c05.ee0 ()Lrh0;
      // 09e: invokevirtual rh0.ghh ()Lcom/mojang/authlib/GameProfile;
      // 0a1: invokespecial net/minecraft/network/login/client/C00PacketLoginStart.<init> (Lcom/mojang/authlib/GameProfile;)V
      // 0a4: invokevirtual hv0.k7f (Lmz2;)V
      // 0a7: goto 1e2
      // 0aa: astore 5
      // 0ac: aload 0
      // 0ad: getfield vqu$1.fc5 Lvqu;
      // 0b0: iload 3
      // 0b1: ifne 0e2
      // 0b4: invokestatic vqu.x9p (Lvqu;)Z
      // 0b7: ifeq 0c6
      // 0ba: goto 0c1
      // 0bd: invokestatic vqu$1.a (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
      // 0c0: athrow
      // 0c1: return
      // 0c2: invokestatic vqu$1.a (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
      // 0c5: athrow
      // 0c6: invokestatic vqu.ctl ()Lorg/apache/logging/log4j/Logger;
      // 0c9: sipush 26652
      // 0cc: ldc2_w 5056023869614618405
      // 0cf: lload 1
      // 0d0: lxor
      // 0d1: invokedynamic h (IJ)Ljava/lang/String; bsm=vqu$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: nop
      // 0d7: aload 5
      // 0d9: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 0de: aload 0
      // 0df: getfield vqu$1.fc5 Lvqu;
      // 0e2: invokestatic vqu.zio (Lvqu;)Lc05;
      // 0e5: new yk0
      // 0e8: dup
      // 0e9: aload 0
      // 0ea: getfield vqu$1.fc5 Lvqu;
      // 0ed: invokestatic vqu.f6t (Lvqu;)Lgbe;
      // 0f0: sipush 24428
      // 0f3: ldc2_w 3087210251699109975
      // 0f6: lload 1
      // 0f7: lxor
      // 0f8: invokedynamic h (IJ)Ljava/lang/String; bsm=vqu$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: nop
      // 0fe: new hsu
      // 101: dup
      // 102: sipush 15617
      // 105: ldc2_w 1071711985063273021
      // 108: lload 1
      // 109: lxor
      // 10a: invokedynamic h (IJ)Ljava/lang/String; bsm=vqu$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: nop
      // 110: bipush 1
      // 111: anewarray 150
      // 114: dup
      // 115: bipush 0
      // 116: sipush 24367
      // 119: ldc2_w 3094642581432025105
      // 11c: lload 1
      // 11d: lxor
      // 11e: invokedynamic h (IJ)Ljava/lang/String; bsm=vqu$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: nop
      // 124: aastore
      // 125: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 128: invokespecial yk0.<init> (Lgbe;Ljava/lang/String;Lekw;)V
      // 12b: invokevirtual c05.z2i (Lgbe;)V
      // 12e: goto 1e2
      // 131: astore 5
      // 133: iload 3
      // 134: ifne 165
      // 137: aload 0
      // 138: getfield vqu$1.fc5 Lvqu;
      // 13b: invokestatic vqu.x9p (Lvqu;)Z
      // 13e: ifeq 14d
      // 141: goto 148
      // 144: invokestatic vqu$1.a (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
      // 147: athrow
      // 148: return
      // 149: invokestatic vqu$1.a (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
      // 14c: athrow
      // 14d: invokestatic vqu.ctl ()Lorg/apache/logging/log4j/Logger;
      // 150: sipush 32509
      // 153: ldc2_w 5200576128063726021
      // 156: lload 1
      // 157: lxor
      // 158: invokedynamic h (IJ)Ljava/lang/String; bsm=vqu$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: nop
      // 15e: aload 5
      // 160: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 165: aload 5
      // 167: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 16a: astore 6
      // 16c: aload 4
      // 16e: ifnull 19e
      // 171: new java/lang/StringBuilder
      // 174: dup
      // 175: invokespecial java/lang/StringBuilder.<init> ()V
      // 178: aload 4
      // 17a: invokevirtual java/net/InetAddress.toString ()Ljava/lang/String;
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: ldc ":"
      // 182: nop
      // 183: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 186: aload 0
      // 187: getfield vqu$1.ajg I
      // 18a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 18d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 190: astore 7
      // 192: aload 6
      // 194: aload 7
      // 196: ldc ""
      // 198: nop
      // 199: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 19c: astore 6
      // 19e: aload 0
      // 19f: getfield vqu$1.fc5 Lvqu;
      // 1a2: invokestatic vqu.gd6 (Lvqu;)Lc05;
      // 1a5: new yk0
      // 1a8: dup
      // 1a9: aload 0
      // 1aa: getfield vqu$1.fc5 Lvqu;
      // 1ad: invokestatic vqu.f6t (Lvqu;)Lgbe;
      // 1b0: sipush 29289
      // 1b3: ldc2_w 8134493155772394838
      // 1b6: lload 1
      // 1b7: lxor
      // 1b8: invokedynamic h (IJ)Ljava/lang/String; bsm=vqu$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: nop
      // 1be: new hsu
      // 1c1: dup
      // 1c2: sipush 31649
      // 1c5: ldc2_w 3581004337430881436
      // 1c8: lload 1
      // 1c9: lxor
      // 1ca: invokedynamic h (IJ)Ljava/lang/String; bsm=vqu$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: nop
      // 1d0: bipush 1
      // 1d1: anewarray 150
      // 1d4: dup
      // 1d5: bipush 0
      // 1d6: aload 6
      // 1d8: aastore
      // 1d9: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1dc: invokespecial yk0.<init> (Lgbe;Ljava/lang/String;Lekw;)V
      // 1df: invokevirtual c05.z2i (Lgbe;)V
      // 1e2: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1324967319867260535L, 891877845201874172L, MethodHandles.lookup().lookupClass()).a(68280743475928L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 19541528352111L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "\u0097ô\u0003+¯Ù¼¥ÄØÐ\u0014\u0004~¸\fFz{\u0082\u0011ð\u008b\u0003A ¸±\u008bôÎ\u0086àYÉ\u0091¸r\u001dÈÊ¦\r\u008b¢t\u0083L8á\u0002Mo»Úß0ç\u0095ÒµÚwï\u001c9V_Ý3`ÄÄ'F'Ç\u0085e)`£»<ß,kpÜû¶\u0092þ\u001b\u007f¤á]\u0007²lè´\u009c]\u0018ûòÂ\u0010-\u009f\u0016%4s¢qÞmÕäù\u0016úC+«÷\u0087\u00181d\u001b¿HQ\\x÷ø\u0098[Æ;0Sïk\u0002±´\u009ehA0\u008e\u0093£öá@Ý,#3«\u007f%n{_\u0000[\u0083Q\u0080ê\u009a\u0002Ü7\u0010ß\u001f9]¶k\u0015sÑk\fBJ)9Ñ;\t\u008fáÉ";
      int var8 = "\u0097ô\u0003+¯Ù¼¥ÄØÐ\u0014\u0004~¸\fFz{\u0082\u0011ð\u008b\u0003A ¸±\u008bôÎ\u0086àYÉ\u0091¸r\u001dÈÊ¦\r\u008b¢t\u0083L8á\u0002Mo»Úß0ç\u0095ÒµÚwï\u001c9V_Ý3`ÄÄ'F'Ç\u0085e)`£»<ß,kpÜû¶\u0092þ\u001b\u007f¤á]\u0007²lè´\u009c]\u0018ûòÂ\u0010-\u009f\u0016%4s¢qÞmÕäù\u0016úC+«÷\u0087\u00181d\u001b¿HQ\\x÷ø\u0098[Æ;0Sïk\u0002±´\u009ehA0\u008e\u0093£öá@Ý,#3«\u007f%n{_\u0000[\u0083Q\u0080ê\u009a\u0002Ü7\u0010ß\u001f9]¶k\u0015sÑk\fBJ)9Ñ;\t\u008fáÉ"
         .length();
      char var5 = '8';
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
                     c = new String[7];
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

                  var6 = "ã\u008cóYñ¡\u001fcþ2\u0095ü\u0082@\u008eXL7«?-©&ëËWp-\u008d:Ö'àÃè!tp÷\u000eze;yh¿²//?Ð\u0084\"\u0015xd\u0018Vi\u0080Þcø~Ïýq%úRqq\u0090_\u0099>¿\u0088\u0091:=";
                  var8 = "ã\u008cóYñ¡\u001fcþ2\u0095ü\u0082@\u008eXL7«?-©&ëËWp-\u008d:Ö'àÃè!tp÷\u000eze;yh¿²//?Ð\u0084\"\u0015xd\u0018Vi\u0080Þcø~Ïýq%úRqq\u0090_\u0099>¿\u0088\u0091:="
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static UnknownHostException a(UnknownHostException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28924;
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
            throw new RuntimeException("vqu$1", var10);
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
         throw new RuntimeException("vqu$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
