import com.mojang.authlib.Agent;
import com.mojang.authlib.UserType;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zfs {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static String eoj(String var0, String var1) {
      return nin(var0, var1, false);
   }

   public static String nin(String param0, String param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zfs.a J
      // 003: ldc2_w 20881700623545
      // 006: lxor
      // 007: lstore 3
      // 008: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 00b: new java/lang/StringBuilder
      // 00e: dup
      // 00f: invokespecial java/lang/StringBuilder.<init> ()V
      // 012: sipush 31114
      // 015: ldc2_w 5282854299678747488
      // 018: lload 3
      // 019: lxor
      // 01a: invokedynamic s (IJ)Ljava/lang/String; bsm=zfs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: nop
      // 020: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 023: aload 0
      // 024: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 027: sipush 29386
      // 02a: ldc2_w 3750466120144166949
      // 02d: lload 3
      // 02e: lxor
      // 02f: invokedynamic s (IJ)Ljava/lang/String; bsm=zfs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: nop
      // 035: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 038: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03b: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 03e: new com/mojang/authlib/yggdrasil/YggdrasilAuthenticationService
      // 041: dup
      // 042: getstatic java/net/Proxy.NO_PROXY Ljava/net/Proxy;
      // 045: ldc ""
      // 047: nop
      // 048: invokespecial com/mojang/authlib/yggdrasil/YggdrasilAuthenticationService.<init> (Ljava/net/Proxy;Ljava/lang/String;)V
      // 04b: astore 6
      // 04d: invokestatic OpaquePredicate.b ()I
      // 050: aload 6
      // 052: getstatic com/mojang/authlib/Agent.MINECRAFT Lcom/mojang/authlib/Agent;
      // 055: invokevirtual com/mojang/authlib/yggdrasil/YggdrasilAuthenticationService.createUserAuthentication (Lcom/mojang/authlib/Agent;)Lcom/mojang/authlib/UserAuthentication;
      // 058: checkcast com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication
      // 05b: astore 7
      // 05d: aload 7
      // 05f: aload 0
      // 060: invokevirtual com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.setUsername (Ljava/lang/String;)V
      // 063: istore 5
      // 065: aload 7
      // 067: aload 1
      // 068: invokevirtual com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.setPassword (Ljava/lang/String;)V
      // 06b: aload 7
      // 06d: invokevirtual com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.logIn ()V
      // 070: invokestatic Minecraft.vz1 ()Lc05;
      // 073: new rh0
      // 076: dup
      // 077: aload 7
      // 079: invokevirtual com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.getSelectedProfile ()Lcom/mojang/authlib/GameProfile;
      // 07c: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 07f: aload 7
      // 081: invokevirtual com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.getSelectedProfile ()Lcom/mojang/authlib/GameProfile;
      // 084: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 087: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 08a: aload 7
      // 08c: invokevirtual com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.getAuthenticatedToken ()Ljava/lang/String;
      // 08f: getstatic com/mojang/authlib/UserType.MOJANG Lcom/mojang/authlib/UserType;
      // 092: invokevirtual com/mojang/authlib/UserType.getName ()Ljava/lang/String;
      // 095: invokespecial rh0.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 098: putfield Minecraft.s41 Lrh0;
      // 09b: getstatic ClientState.qkk Lzwr;
      // 09e: pop
      // 09f: bipush 2
      // 0a0: anewarray 2
      // 0a3: dup
      // 0a4: bipush 0
      // 0a5: aload 0
      // 0a6: aastore
      // 0a7: dup
      // 0a8: bipush 1
      // 0a9: aload 1
      // 0aa: aastore
      // 0ab: putstatic ClientState.ede [Ljava/lang/String;
      // 0ae: aconst_null
      // 0af: areturn
      // 0b0: astore 8
      // 0b2: sipush 5457
      // 0b5: ldc2_w 1141494627035596728
      // 0b8: lload 3
      // 0b9: lxor
      // 0ba: invokedynamic s (IJ)Ljava/lang/String; bsm=zfs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: nop
      // 0c0: areturn
      // 0c1: astore 8
      // 0c3: aload 8
      // 0c5: invokevirtual com/mojang/authlib/exceptions/AuthenticationException.getMessage ()Ljava/lang/String;
      // 0c8: sipush 28244
      // 0cb: ldc2_w 6128884809269460153
      // 0ce: lload 3
      // 0cf: lxor
      // 0d0: invokedynamic s (IJ)Ljava/lang/String; bsm=zfs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: nop
      // 0d6: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0d9: iload 5
      // 0db: ifeq 11f
      // 0de: ifne 117
      // 0e1: goto 0e8
      // 0e4: invokestatic zfs.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 0e7: athrow
      // 0e8: aload 8
      // 0ea: invokevirtual com/mojang/authlib/exceptions/AuthenticationException.getMessage ()Ljava/lang/String;
      // 0ed: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0f0: iload 5
      // 0f2: ifeq 1b3
      // 0f5: goto 0fc
      // 0f8: invokestatic zfs.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 0fb: athrow
      // 0fc: sipush 31101
      // 0ff: ldc2_w 3136954416904514451
      // 102: lload 3
      // 103: lxor
      // 104: invokedynamic s (IJ)Ljava/lang/String; bsm=zfs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: nop
      // 10a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 10d: ifeq 1a5
      // 110: goto 117
      // 113: invokestatic zfs.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 116: athrow
      // 117: iload 2
      // 118: goto 11f
      // 11b: invokestatic zfs.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 11e: athrow
      // 11f: ifeq 196
      // 122: aconst_null
      // 123: astore 9
      // 125: getstatic qd_.oyx Ljava/util/ArrayList;
      // 128: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 12b: astore 10
      // 12d: aload 10
      // 12f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 134: ifeq 178
      // 137: aload 10
      // 139: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 13e: checkcast x1l
      // 141: astore 11
      // 143: aload 11
      // 145: iload 5
      // 147: ifeq 170
      // 14a: invokevirtual x1l.rii ()Ljava/lang/String;
      // 14d: iload 5
      // 14f: ifeq 1a4
      // 152: goto 159
      // 155: invokestatic zfs.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 158: athrow
      // 159: aload 0
      // 15a: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 15d: ifeq 175
      // 160: goto 167
      // 163: invokestatic zfs.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 166: athrow
      // 167: aload 11
      // 169: goto 170
      // 16c: invokestatic zfs.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 16f: athrow
      // 170: astore 9
      // 172: goto 178
      // 175: goto 12d
      // 178: aload 9
      // 17a: ifnull 196
      // 17d: getstatic qd_.oyx Ljava/util/ArrayList;
      // 180: aload 9
      // 182: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
      // 185: pop
      // 186: getstatic ClientState.qkk Lzwr;
      // 189: invokevirtual ClientState.getConfigManager ()Lszk;
      // 18c: invokevirtual ConfigManager.p5g ()V
      // 18f: goto 196
      // 192: invokestatic zfs.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 195: athrow
      // 196: sipush 29925
      // 199: ldc2_w 8034242160277333509
      // 19c: lload 3
      // 19d: lxor
      // 19e: invokedynamic s (IJ)Ljava/lang/String; bsm=zfs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: nop
      // 1a4: areturn
      // 1a5: sipush 15828
      // 1a8: ldc2_w 4777224129249242935
      // 1ab: lload 3
      // 1ac: lxor
      // 1ad: invokedynamic s (IJ)Ljava/lang/String; bsm=zfs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: nop
      // 1b3: areturn
      // 1b4: astore 8
      // 1b6: sipush 10976
      // 1b9: ldc2_w 5550476444900849676
      // 1bc: lload 3
      // 1bd: lxor
      // 1be: invokedynamic s (IJ)Ljava/lang/String; bsm=zfs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: nop
      // 1c4: areturn
   }

   public static rh0 kph(String var0, String var1) {
      long var2 = a ^ 115371304346415L;
      System.out.println(a<"s">(4946, 4399799828324595238L ^ var2) + var0 + a<"s">(14713, 5538524483317996551L ^ var2));
      YggdrasilAuthenticationService var4 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
      YggdrasilUserAuthentication var5 = (YggdrasilUserAuthentication)var4.createUserAuthentication(Agent.MINECRAFT);
      var5.setUsername(var0);
      var5.setPassword(var1);

      try {
         var5.logIn();
         return new rh0(
            var5.getSelectedProfile().getName(), var5.getSelectedProfile().getId().toString(), var5.getAuthenticatedToken(), UserType.MOJANG.getName()
         );
      } catch (AuthenticationUnavailableException var7) {
      } catch (AuthenticationException var8) {
      } catch (NullPointerException var9) {
      }

      return null;
   }

   public static void tc0(String var0, String var1, String var2, String var3) {
      long var4 = a ^ 64452298338864L;
      System.out.println(a<"s">(11927, 2241398409435585279L ^ var4) + var0);

      try {
         Minecraft.vz1().s41 = new rh0(var1, var2, var0, UserType.MOJANG.getName());
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   public static void cg7(String var0) {
      Minecraft.vz1().s41 = new rh0(var0, "", "", UserType.MOJANG.getName());
   }

   public static String _cz(String var0) {
      long var1 = a ^ 23307192466624L;
      return var0.replaceAll(a<"s">(27319, 7701577945532977189L ^ var1), "");
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(9174237005060012478L, -2496030896779691947L, MethodHandles.lookup().lookupClass()).a(47807953278574L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 72604045916720L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "o'Vè¦¤^4Òê4Ò\u0002:\t.(¨\u0095Ã\nm\fî=\u0086tö\"ZÓ³º\u0000bõÁ\u0004±öwº£\u0018\u0082\"\u0089UÇ\u001aõ4¡:è1Û@\u001e\u0002\u0088\u001d\u0014L³u·\u000f\u0090·Ê¼Ø¥x_P\u0002\u009b\u0082\u0092\u0012t\u0016Ì\u0013j\u0005Fd\u001f5\u0017$\t\u001f¿U\u0012L¨\u0007\u001c0¯0,ÿøP\u001eé\u0093æ\u0085\u0004~zw\u000443\u0018U¤\u0091í,\u008e\u0017\u0091\u0089¼\u008d¾Ë>wt#\u0011aìÊ\u0089\"ð X\u0011\u0012±èaá7íDy\u0015\u0093{]Ç\u000eK[:Ú\u001e\r\nY\u0089ÛtË\u007f>î(kõkâ\u0084\u0017t\u0090©c{ºázÕFk\u0086À¼¾ß\u0017Î¼t\u0091<*2FÊb\u0097è\u0091Ð*\u009380v_#då£.\u0019¯$zÒNW\u0091·{\u0080ÌË\u0003·Wé\u0090Ð\u009a\u009a\u001b¹D1KàÃ{º\u008e0ª@Ö\u001b8¦\u0003Ô[\u0018 ]âºUµ¤584^Ï\u0081ã\u001c\bà\u0093\u0005ôÇ&\u0003\u008e@Ôvs£«\u0097\u009c\u0095\u008c\u000bØ×é\u0011\u0007\u009aýlÿ\u001fØ¼ýPC¿\u0084\u009a³Q\u0083W£e\u009c©î»V\\¸{&¥d\u0019\u0099\u000b±ïW×vï»zÛ\u0093\u0087C\u0018\u0092\u0098ð(Ó\u000e®W\u009e\u0094AS¡?\u008e\u009cÌÎ\u0098à8üdëb};El\u00adA\u001e<þ\u00153_\u0017Oí±)¼\u0018";
      int var8 = "o'Vè¦¤^4Òê4Ò\u0002:\t.(¨\u0095Ã\nm\fî=\u0086tö\"ZÓ³º\u0000bõÁ\u0004±öwº£\u0018\u0082\"\u0089UÇ\u001aõ4¡:è1Û@\u001e\u0002\u0088\u001d\u0014L³u·\u000f\u0090·Ê¼Ø¥x_P\u0002\u009b\u0082\u0092\u0012t\u0016Ì\u0013j\u0005Fd\u001f5\u0017$\t\u001f¿U\u0012L¨\u0007\u001c0¯0,ÿøP\u001eé\u0093æ\u0085\u0004~zw\u000443\u0018U¤\u0091í,\u008e\u0017\u0091\u0089¼\u008d¾Ë>wt#\u0011aìÊ\u0089\"ð X\u0011\u0012±èaá7íDy\u0015\u0093{]Ç\u000eK[:Ú\u001e\r\nY\u0089ÛtË\u007f>î(kõkâ\u0084\u0017t\u0090©c{ºázÕFk\u0086À¼¾ß\u0017Î¼t\u0091<*2FÊb\u0097è\u0091Ð*\u009380v_#då£.\u0019¯$zÒNW\u0091·{\u0080ÌË\u0003·Wé\u0090Ð\u009a\u009a\u001b¹D1KàÃ{º\u008e0ª@Ö\u001b8¦\u0003Ô[\u0018 ]âºUµ¤584^Ï\u0081ã\u001c\bà\u0093\u0005ôÇ&\u0003\u008e@Ôvs£«\u0097\u009c\u0095\u008c\u000bØ×é\u0011\u0007\u009aýlÿ\u001fØ¼ýPC¿\u0084\u009a³Q\u0083W£e\u009c©î»V\\¸{&¥d\u0019\u0099\u000b±ïW×vï»zÛ\u0093\u0087C\u0018\u0092\u0098ð(Ó\u000e®W\u009e\u0094AS¡?\u008e\u009cÌÎ\u0098à8üdëb};El\u00adA\u001e<þ\u00153_\u0017Oí±)¼\u0018"
         .length();
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
                     c = new String[12];
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

                  var6 = "\u0081Ë¥¾·3ÒJ¥\u0004F6óU\u008cóÉHà_M\u009b\u0091\u0017¥yóÁ¸£d7$\u0096NêO\bñÁ\u0018K\u008dFí\u009e$ô\b;MAº\u007fç\u0013Þü¶³c\u0093·å\u0096";
                  var8 = "\u0081Ë¥¾·3ÒJ¥\u0004F6óU\u008cóÉHà_M\u009b\u0091\u0017¥yóÁ¸£d7$\u0096NêO\bñÁ\u0018K\u008dFí\u009e$ô\b;MAº\u007fç\u0013Þü¶³c\u0093·å\u0096"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static AuthenticationUnavailableException a(AuthenticationUnavailableException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27528;
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
            throw new RuntimeException("zfs", var10);
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
         throw new RuntimeException("zfs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
