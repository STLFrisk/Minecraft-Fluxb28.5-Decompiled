import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
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

public class x_b$2 extends Thread {
   public final x_b fxd;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public x_b$2(x_b var1, String var2) {
      super(var2);
      this.fxd = var1;
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
      // 000: getstatic x_b$2.a J
      // 003: ldc2_w 96526807022150
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield x_b$2.fxd Lx_b;
      // 010: invokestatic x_b.jdc (Lx_b;)Lcom/mojang/authlib/GameProfile;
      // 013: astore 4
      // 015: new java/math/BigInteger
      // 018: dup
      // 019: aload 0
      // 01a: getfield x_b$2.fxd Lx_b;
      // 01d: invokestatic x_b.voh (Lx_b;)Ljava/lang/String;
      // 020: aload 0
      // 021: getfield x_b$2.fxd Lx_b;
      // 024: invokestatic x_b.k7_ (Lx_b;)Lvr1;
      // 027: invokevirtual vr1.nnq ()Ljava/security/KeyPair;
      // 02a: invokevirtual java/security/KeyPair.getPublic ()Ljava/security/PublicKey;
      // 02d: aload 0
      // 02e: getfield x_b$2.fxd Lx_b;
      // 031: invokestatic x_b.ebb (Lx_b;)Ljavax/crypto/SecretKey;
      // 034: invokestatic vk8.lul (Ljava/lang/String;Ljava/security/PublicKey;Ljavax/crypto/SecretKey;)[B
      // 037: invokespecial java/math/BigInteger.<init> ([B)V
      // 03a: bipush 16
      // 03c: invokevirtual java/math/BigInteger.toString (I)Ljava/lang/String;
      // 03f: astore 5
      // 041: aload 0
      // 042: getfield x_b$2.fxd Lx_b;
      // 045: aload 0
      // 046: getfield x_b$2.fxd Lx_b;
      // 049: invokestatic x_b.k7_ (Lx_b;)Lvr1;
      // 04c: invokevirtual vr1.qrh ()Lcom/mojang/authlib/minecraft/MinecraftSessionService;
      // 04f: new com/mojang/authlib/GameProfile
      // 052: dup
      // 053: aconst_null
      // 054: checkcast java/util/UUID
      // 057: aload 4
      // 059: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 05c: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 05f: aload 5
      // 061: invokeinterface com/mojang/authlib/minecraft/MinecraftSessionService.hasJoinedServer (Lcom/mojang/authlib/GameProfile;Ljava/lang/String;)Lcom/mojang/authlib/GameProfile; 3
      // 066: invokestatic x_b._j2 (Lx_b;Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;
      // 069: pop
      // 06a: aload 0
      // 06b: getfield x_b$2.fxd Lx_b;
      // 06e: iload 3
      // 06f: ifeq 0ee
      // 072: invokestatic x_b.jdc (Lx_b;)Lcom/mojang/authlib/GameProfile;
      // 075: ifnull 0e3
      // 078: goto 07f
      // 07b: invokestatic x_b$2.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 07e: athrow
      // 07f: invokestatic x_b.nwj ()Lorg/apache/logging/log4j/Logger;
      // 082: new java/lang/StringBuilder
      // 085: dup
      // 086: invokespecial java/lang/StringBuilder.<init> ()V
      // 089: sipush 4568
      // 08c: ldc2_w 4321659666645813556
      // 08f: lload 1
      // 090: lxor
      // 091: invokedynamic k (IJ)Ljava/lang/String; bsm=x_b$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: nop
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: aload 0
      // 09b: getfield x_b$2.fxd Lx_b;
      // 09e: invokestatic x_b.jdc (Lx_b;)Lcom/mojang/authlib/GameProfile;
      // 0a1: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 0a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a7: sipush 9834
      // 0aa: ldc2_w 855242100508573312
      // 0ad: lload 1
      // 0ae: lxor
      // 0af: invokedynamic k (IJ)Ljava/lang/String; bsm=x_b$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: nop
      // 0b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b8: aload 0
      // 0b9: getfield x_b$2.fxd Lx_b;
      // 0bc: invokestatic x_b.jdc (Lx_b;)Lcom/mojang/authlib/GameProfile;
      // 0bf: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 0c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0c5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c8: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;)V 2
      // 0cd: aload 0
      // 0ce: getfield x_b$2.fxd Lx_b;
      // 0d1: getstatic x_b$rbt.m75 Lx_b$rbt;
      // 0d4: invokestatic x_b._fj (Lx_b;Lx_b$rbt;)Lx_b$rbt;
      // 0d7: pop
      // 0d8: iload 3
      // 0d9: ifne 19c
      // 0dc: goto 0e3
      // 0df: invokestatic x_b$2.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: getfield x_b$2.fxd Lx_b;
      // 0e7: goto 0ee
      // 0ea: invokestatic x_b$2.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 0ed: athrow
      // 0ee: iload 3
      // 0ef: ifeq 14a
      // 0f2: invokestatic x_b.k7_ (Lx_b;)Lvr1;
      // 0f5: invokevirtual vr1.a59 ()Z
      // 0f8: ifeq 13f
      // 0fb: goto 102
      // 0fe: invokestatic x_b$2.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 101: athrow
      // 102: invokestatic x_b.nwj ()Lorg/apache/logging/log4j/Logger;
      // 105: sipush 30695
      // 108: ldc2_w 5864894026814680847
      // 10b: lload 1
      // 10c: lxor
      // 10d: invokedynamic k (IJ)Ljava/lang/String; bsm=x_b$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: nop
      // 113: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 118: aload 0
      // 119: getfield x_b$2.fxd Lx_b;
      // 11c: aload 0
      // 11d: getfield x_b$2.fxd Lx_b;
      // 120: aload 4
      // 122: invokevirtual x_b._t6 (Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;
      // 125: invokestatic x_b._j2 (Lx_b;Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;
      // 128: pop
      // 129: aload 0
      // 12a: getfield x_b$2.fxd Lx_b;
      // 12d: getstatic x_b$rbt.m75 Lx_b$rbt;
      // 130: invokestatic x_b._fj (Lx_b;Lx_b$rbt;)Lx_b$rbt;
      // 133: pop
      // 134: iload 3
      // 135: ifne 19c
      // 138: goto 13f
      // 13b: invokestatic x_b$2.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 13e: athrow
      // 13f: aload 0
      // 140: getfield x_b$2.fxd Lx_b;
      // 143: goto 14a
      // 146: invokestatic x_b$2.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 149: athrow
      // 14a: sipush 12516
      // 14d: ldc2_w 4701866814358431754
      // 150: lload 1
      // 151: lxor
      // 152: invokedynamic k (IJ)Ljava/lang/String; bsm=x_b$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: nop
      // 158: invokevirtual x_b.omu (Ljava/lang/String;)V
      // 15b: invokestatic x_b.nwj ()Lorg/apache/logging/log4j/Logger;
      // 15e: new java/lang/StringBuilder
      // 161: dup
      // 162: invokespecial java/lang/StringBuilder.<init> ()V
      // 165: sipush 7305
      // 168: ldc2_w 5084521990234440804
      // 16b: lload 1
      // 16c: lxor
      // 16d: invokedynamic k (IJ)Ljava/lang/String; bsm=x_b$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: nop
      // 173: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 176: aload 0
      // 177: getfield x_b$2.fxd Lx_b;
      // 17a: invokestatic x_b.jdc (Lx_b;)Lcom/mojang/authlib/GameProfile;
      // 17d: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 180: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 183: sipush 19730
      // 186: ldc2_w 6982516323554842101
      // 189: lload 1
      // 18a: lxor
      // 18b: invokedynamic k (IJ)Ljava/lang/String; bsm=x_b$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: nop
      // 191: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 194: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 197: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 19c: goto 228
      // 19f: astore 5
      // 1a1: aload 0
      // 1a2: getfield x_b$2.fxd Lx_b;
      // 1a5: iload 3
      // 1a6: ifeq 201
      // 1a9: invokestatic x_b.k7_ (Lx_b;)Lvr1;
      // 1ac: invokevirtual vr1.a59 ()Z
      // 1af: ifeq 1f6
      // 1b2: goto 1b9
      // 1b5: invokestatic x_b$2.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 1b8: athrow
      // 1b9: invokestatic x_b.nwj ()Lorg/apache/logging/log4j/Logger;
      // 1bc: sipush 2813
      // 1bf: ldc2_w 4815873167200064018
      // 1c2: lload 1
      // 1c3: lxor
      // 1c4: invokedynamic k (IJ)Ljava/lang/String; bsm=x_b$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: nop
      // 1ca: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 1cf: aload 0
      // 1d0: getfield x_b$2.fxd Lx_b;
      // 1d3: aload 0
      // 1d4: getfield x_b$2.fxd Lx_b;
      // 1d7: aload 4
      // 1d9: invokevirtual x_b._t6 (Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;
      // 1dc: invokestatic x_b._j2 (Lx_b;Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;
      // 1df: pop
      // 1e0: aload 0
      // 1e1: getfield x_b$2.fxd Lx_b;
      // 1e4: getstatic x_b$rbt.m75 Lx_b$rbt;
      // 1e7: invokestatic x_b._fj (Lx_b;Lx_b$rbt;)Lx_b$rbt;
      // 1ea: pop
      // 1eb: iload 3
      // 1ec: ifne 228
      // 1ef: goto 1f6
      // 1f2: invokestatic x_b$2.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: getfield x_b$2.fxd Lx_b;
      // 1fa: goto 201
      // 1fd: invokestatic x_b$2.a (Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;)Lcom/mojang/authlib/exceptions/AuthenticationUnavailableException;
      // 200: athrow
      // 201: sipush 6412
      // 204: ldc2_w 6542527725822706149
      // 207: lload 1
      // 208: lxor
      // 209: invokedynamic k (IJ)Ljava/lang/String; bsm=x_b$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: nop
      // 20f: invokevirtual x_b.omu (Ljava/lang/String;)V
      // 212: invokestatic x_b.nwj ()Lorg/apache/logging/log4j/Logger;
      // 215: sipush 17257
      // 218: ldc2_w 3292548062317239170
      // 21b: lload 1
      // 21c: lxor
      // 21d: invokedynamic k (IJ)Ljava/lang/String; bsm=x_b$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: nop
      // 223: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 228: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7805024502510373349L, 5050170596631837598L, MethodHandles.lookup().lookupClass()).a(5807553227355L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 28492610143655L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "º5äJ¤\u008eù.\u0014¸W\u0013$#\u009e!½q\"¦ãÇ<1£¶þº½\u0089\u008c¹\u0016Ú&ôÿ2Cÿ\u009c]¦\u001eÐ\u0086ò~:=æò0õàDÀ\f\u0098¼ôMÃ\u008eliòú7ÓW1\u008bµ\u009apiâ?¼\u0006\u0012Ó¼´íÈKÔ\u008eÀ\u0007h¡\u0099\u008d§\u0085«·\u0096\u001b6\u00158\u0084ÈCÏ\u008d7ÿ\u0096\u0091¤÷C\u0097\u0002G\u0006\u0016ø#Ë\u008d\u0090\u0018¢þç×¹L\bÓ\u008f\u0019yâ\u009fÿ\u0086¢2wVÚ¸?÷Æ\u0082\u0089\t¯´\u008f\u0092)h\u0018`ç±\u0019þ\u0095ì8úvØõu}å\u0087é\u0098¬K\u009e£\t> &ÅÒÉ§©¢/%\u0083©\b0\u0085jÑ3\u0007á\u0087\n\u0010çõO\u0083ØÔûq°³h\u0089¶H¡¤xeÂxï\u00124@øTBøæ:9TcT\u009em:7\u009d\u0098Âlð\u0082,·JôÜ\u001a´\r\bMÆ2ö*Ù9e3Éi/ïA?\u008a\u0013\u0099ÀèÛ\u0001\u0084HbÅ¸\u001eoÂî»æy\u001e@¦¾é\u0001eìË7§Î\u0013ÍúPtßm\u0084H,DôL:vM\u0010\u0083\u0091÷;À\u0080Pì±\u0019\n\u009bÔ\f,Òh\u0089g©ëSH6\u00adþp\u0087ë\u0086ëZë\u0003k\u00ad)÷ÅT;,ã×7]\u007f\u0010Ê\u007fæPL\u0087ú§ÆýZé/+O\u0019Û\u008b\u0018Ra½nQV\u001c\u008aæGf¹r°\u0084\u0097\\\\BÛ\f³ü\u0015U--4\u0094å\u00861)CDq²Ë\u0002½ ¿oóÛÿ\u0092°¾\fò\u0098\u0013Ý";
      int var8 = "º5äJ¤\u008eù.\u0014¸W\u0013$#\u009e!½q\"¦ãÇ<1£¶þº½\u0089\u008c¹\u0016Ú&ôÿ2Cÿ\u009c]¦\u001eÐ\u0086ò~:=æò0õàDÀ\f\u0098¼ôMÃ\u008eliòú7ÓW1\u008bµ\u009apiâ?¼\u0006\u0012Ó¼´íÈKÔ\u008eÀ\u0007h¡\u0099\u008d§\u0085«·\u0096\u001b6\u00158\u0084ÈCÏ\u008d7ÿ\u0096\u0091¤÷C\u0097\u0002G\u0006\u0016ø#Ë\u008d\u0090\u0018¢þç×¹L\bÓ\u008f\u0019yâ\u009fÿ\u0086¢2wVÚ¸?÷Æ\u0082\u0089\t¯´\u008f\u0092)h\u0018`ç±\u0019þ\u0095ì8úvØõu}å\u0087é\u0098¬K\u009e£\t> &ÅÒÉ§©¢/%\u0083©\b0\u0085jÑ3\u0007á\u0087\n\u0010çõO\u0083ØÔûq°³h\u0089¶H¡¤xeÂxï\u00124@øTBøæ:9TcT\u009em:7\u009d\u0098Âlð\u0082,·JôÜ\u001a´\r\bMÆ2ö*Ù9e3Éi/ïA?\u008a\u0013\u0099ÀèÛ\u0001\u0084HbÅ¸\u001eoÂî»æy\u001e@¦¾é\u0001eìË7§Î\u0013ÍúPtßm\u0084H,DôL:vM\u0010\u0083\u0091÷;À\u0080Pì±\u0019\n\u009bÔ\f,Òh\u0089g©ëSH6\u00adþp\u0087ë\u0086ëZë\u0003k\u00ad)÷ÅT;,ã×7]\u007f\u0010Ê\u007fæPL\u0087ú§ÆýZé/+O\u0019Û\u008b\u0018Ra½nQV\u001c\u008aæGf¹r°\u0084\u0097\\\\BÛ\f³ü\u0015U--4\u0094å\u00861)CDq²Ë\u0002½ ¿oóÛÿ\u0092°¾\fò\u0098\u0013Ý"
         .length();
      char var5 = 'h';
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
                     c = new String[9];
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

                  var6 = "¬\u0011ë¯gßÌgUvÆu\u000b\u0014.\u008f¢#\u009b/³\u0093\u000bõ\u0080Á\u0010Y¡j\u0091ø\u0084\u001cÝ5¶$Gó¾\u0098'fªãöÀ\"R÷¸µ&Ê\u008d<7É\u008eÛoü>O³á\r_\b§z´\u0018]£\u0096\fìòcs»\u009e\u001c X&H^Ú\u00adVW¢°â\u0087\u0096\u0099c\u0083\u0085Ð\"~ª]\f\u0092EûêÍðTå\u000f5\tüEÊ=ñþ\u009b\u008ck´u{Ïü#µ].\u001d\u009cÂ`ÌèN\u001d÷\u008cÓ\u000f°ú¥\u0092ê¾\u0093[@âT";
                  var8 = "¬\u0011ë¯gßÌgUvÆu\u000b\u0014.\u008f¢#\u009b/³\u0093\u000bõ\u0080Á\u0010Y¡j\u0091ø\u0084\u001cÝ5¶$Gó¾\u0098'fªãöÀ\"R÷¸µ&Ê\u008d<7É\u008eÛoü>O³á\r_\b§z´\u0018]£\u0096\fìòcs»\u009e\u001c X&H^Ú\u00adVW¢°â\u0087\u0096\u0099c\u0083\u0085Ð\"~ª]\f\u0092EûêÍðTå\u000f5\tüEÊ=ñþ\u009b\u008ck´u{Ïü#µ].\u001d\u009cÂ`ÌèN\u001d÷\u008cÓ\u000f°ú¥\u0092ê¾\u0093[@âT"
                     .length();
                  var5 = 'X';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8602;
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
            throw new RuntimeException("x_b$2", var10);
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
         throw new RuntimeException("x_b$2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
