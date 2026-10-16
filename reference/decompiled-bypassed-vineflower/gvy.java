import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
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
import net.minecraft.network.login.server.S00PacketDisconnect;
import net.minecraft.network.login.server.S01PacketEncryptionRequest;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.login.server.S03PacketEnableCompression;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gvy implements ryn {
   private static final Logger d3i;
   private final c05 ras;
   private final gbe w0t;
   private final hv0 rpl;
   private GameProfile ve7;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public gvy(hv0 var1, c05 var2, gbe var3) {
      this.rpl = var1;
      this.ras = var2;
      this.w0t = var3;
   }

   @Override
   public void gtz(S01PacketEncryptionRequest param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic gvy.a J
      // 003: ldc2_w 45689221539799
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic vk8.o5w ()Ljavax/crypto/SecretKey;
      // 00b: astore 5
      // 00d: aload 1
      // 00e: invokevirtual net/minecraft/network/login/server/S01PacketEncryptionRequest.lx5 ()Ljava/lang/String;
      // 011: astore 6
      // 013: invokestatic t9d.b ()I
      // 016: aload 1
      // 017: invokevirtual net/minecraft/network/login/server/S01PacketEncryptionRequest.yba ()Ljava/security/PublicKey;
      // 01a: astore 7
      // 01c: new java/math/BigInteger
      // 01f: dup
      // 020: aload 6
      // 022: aload 7
      // 024: aload 5
      // 026: invokestatic vk8.lul (Ljava/lang/String;Ljava/security/PublicKey;Ljavax/crypto/SecretKey;)[B
      // 029: invokespecial java/math/BigInteger.<init> ([B)V
      // 02c: bipush 16
      // 02e: invokevirtual java/math/BigInteger.toString (I)Ljava/lang/String;
      // 031: astore 8
      // 033: istore 4
      // 035: aload 0
      // 036: iload 4
      // 038: ifeq 0af
      // 03b: getfield gvy.ras Lc05;
      // 03e: invokevirtual c05.fcm ()Lr1l;
      // 041: ifnull 0ae
      // 044: goto 04b
      // 047: invokestatic gvy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: aload 0
      // 04c: iload 4
      // 04e: ifeq 0af
      // 051: goto 058
      // 054: invokestatic gvy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: getfield gvy.ras Lc05;
      // 05b: invokevirtual c05.fcm ()Lr1l;
      // 05e: invokevirtual r1l.g8f ()Z
      // 061: ifeq 0ae
      // 064: goto 06b
      // 067: invokestatic gvy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: aload 0
      // 06c: invokespecial gvy.ktt ()Lcom/mojang/authlib/minecraft/MinecraftSessionService;
      // 06f: aload 0
      // 070: getfield gvy.ras Lc05;
      // 073: invokevirtual c05.ee0 ()Lrh0;
      // 076: invokevirtual rh0.ghh ()Lcom/mojang/authlib/GameProfile;
      // 079: aload 0
      // 07a: getfield gvy.ras Lc05;
      // 07d: invokevirtual c05.ee0 ()Lrh0;
      // 080: invokevirtual rh0.au6 ()Ljava/lang/String;
      // 083: aload 8
      // 085: invokeinterface com/mojang/authlib/minecraft/MinecraftSessionService.joinServer (Lcom/mojang/authlib/GameProfile;Ljava/lang/String;Ljava/lang/String;)V 4
      // 08a: goto 179
      // 08d: invokestatic gvy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: astore 9
      // 093: getstatic gvy.d3i Lorg/apache/logging/log4j/Logger;
      // 096: sipush 15249
      // 099: ldc2_w 8517523083685673201
      // 09c: lload 2
      // 09d: lxor
      // 09e: invokedynamic q (IJ)Ljava/lang/String; bsm=gvy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: nop
      // 0a4: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 0a9: iload 4
      // 0ab: ifne 179
      // 0ae: aload 0
      // 0af: invokespecial gvy.ktt ()Lcom/mojang/authlib/minecraft/MinecraftSessionService;
      // 0b2: aload 0
      // 0b3: getfield gvy.ras Lc05;
      // 0b6: invokevirtual c05.ee0 ()Lrh0;
      // 0b9: invokevirtual rh0.ghh ()Lcom/mojang/authlib/GameProfile;
      // 0bc: aload 0
      // 0bd: getfield gvy.ras Lc05;
      // 0c0: invokevirtual c05.ee0 ()Lrh0;
      // 0c3: invokevirtual rh0.au6 ()Ljava/lang/String;
      // 0c6: aload 8
      // 0c8: invokeinterface com/mojang/authlib/minecraft/MinecraftSessionService.joinServer (Lcom/mojang/authlib/GameProfile;Ljava/lang/String;Ljava/lang/String;)V 4
      // 0cd: goto 179
      // 0d0: astore 9
      // 0d2: aload 0
      // 0d3: getfield gvy.rpl Lhv0;
      // 0d6: new hsu
      // 0d9: dup
      // 0da: sipush 24330
      // 0dd: ldc2_w 1872770383129304168
      // 0e0: lload 2
      // 0e1: lxor
      // 0e2: invokedynamic q (IJ)Ljava/lang/String; bsm=gvy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: nop
      // 0e8: bipush 1
      // 0e9: anewarray 14
      // 0ec: dup
      // 0ed: bipush 0
      // 0ee: new hsu
      // 0f1: dup
      // 0f2: sipush 15955
      // 0f5: ldc2_w 6933523431079984437
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic q (IJ)Ljava/lang/String; bsm=gvy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: nop
      // 100: bipush 0
      // 101: anewarray 14
      // 104: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 107: aastore
      // 108: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 10b: invokevirtual hv0.g8c (Lekw;)V
      // 10e: return
      // 10f: astore 9
      // 111: aload 0
      // 112: getfield gvy.rpl Lhv0;
      // 115: new hsu
      // 118: dup
      // 119: sipush 9339
      // 11c: ldc2_w 7471953155578963738
      // 11f: lload 2
      // 120: lxor
      // 121: invokedynamic q (IJ)Ljava/lang/String; bsm=gvy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: nop
      // 127: bipush 1
      // 128: anewarray 14
      // 12b: dup
      // 12c: bipush 0
      // 12d: new hsu
      // 130: dup
      // 131: sipush 31859
      // 134: ldc2_w 9045414176368000784
      // 137: lload 2
      // 138: lxor
      // 139: invokedynamic q (IJ)Ljava/lang/String; bsm=gvy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: nop
      // 13f: bipush 0
      // 140: anewarray 14
      // 143: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 146: aastore
      // 147: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 14a: invokevirtual hv0.g8c (Lekw;)V
      // 14d: return
      // 14e: astore 9
      // 150: aload 0
      // 151: getfield gvy.rpl Lhv0;
      // 154: new hsu
      // 157: dup
      // 158: sipush 9339
      // 15b: ldc2_w 7471953155578963738
      // 15e: lload 2
      // 15f: lxor
      // 160: invokedynamic q (IJ)Ljava/lang/String; bsm=gvy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: nop
      // 166: bipush 1
      // 167: anewarray 14
      // 16a: dup
      // 16b: bipush 0
      // 16c: aload 9
      // 16e: invokevirtual com/mojang/authlib/exceptions/AuthenticationException.getMessage ()Ljava/lang/String;
      // 171: aastore
      // 172: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 175: invokevirtual hv0.g8c (Lekw;)V
      // 178: return
      // 179: aload 0
      // 17a: getfield gvy.rpl Lhv0;
      // 17d: new net/minecraft/network/login/client/C01PacketEncryptionResponse
      // 180: dup
      // 181: aload 5
      // 183: aload 7
      // 185: aload 1
      // 186: invokevirtual net/minecraft/network/login/server/S01PacketEncryptionRequest.kck ()[B
      // 189: invokespecial net/minecraft/network/login/client/C01PacketEncryptionResponse.<init> (Ljavax/crypto/SecretKey;Ljava/security/PublicKey;[B)V
      // 18c: new gvy$1
      // 18f: dup
      // 190: aload 0
      // 191: aload 5
      // 193: invokespecial gvy$1.<init> (Lgvy;Ljavax/crypto/SecretKey;)V
      // 196: bipush 0
      // 197: anewarray 152
      // 19a: invokevirtual hv0.pl0 (Lmz2;Lio/netty/util/concurrent/GenericFutureListener;[Lio/netty/util/concurrent/GenericFutureListener;)V
      // 19d: return
   }

   private MinecraftSessionService ktt() {
      return this.ras.b8q();
   }

   @Override
   public void ib2(S02PacketLoginSuccess var1) {
      this.ve7 = var1.jji();
      this.rpl.hlc(a0t.fwh);
      this.rpl.kbj(new p_k(this.ras, this.w0t, this.rpl, this.ve7));
   }

   @Override
   public void az3(ekw var1) {
      long var2 = a ^ 139024768948610L;
      this.ras.z2i(new yk0(this.w0t, a<"q">(31162, 7980931604733412488L ^ var2), var1));
   }

   @Override
   public void d2u(S00PacketDisconnect var1) {
      this.rpl.g8c(var1.mvs());
   }

   @Override
   public void c37(S03PacketEnableCompression param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield gvy.rpl Lhv0;
      // 08: iload 2
      // 09: ifeq 24
      // 0c: invokevirtual hv0.mwg ()Z
      // 0f: ifne 2b
      // 12: goto 19
      // 15: invokestatic gvy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield gvy.rpl Lhv0;
      // 1d: goto 24
      // 20: invokestatic gvy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 1
      // 25: invokevirtual net/minecraft/network/login/server/S03PacketEnableCompression.m5o ()I
      // 28: invokevirtual hv0.ya5 (I)V
      // 2b: return
   }

   public static hv0 fcv(gvy var0) {
      return var0.rpl;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2436269653399703618L, -122643819615249759L, MethodHandles.lookup().lookupClass()).a(18782847262259L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 10947677283164L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = ":æI>ö\u0088<ÿ\u007f¯Á¹&@>ç\u001e\u0081\u0087sX\u0085,ð\r¬i©\u009bh\u0011Çd\u0015=D«\u0010ÈÏ\u008d\u0091\u0004ÒtI¬\u0087\u008c*\u0003\rp \u0019ÙPÖ\u009a`\u0015\\:¨\u009fË%\u008a\u0015Â\u0083©±\"\u0018\u0006$»j,ïÍ\\.0\u009c¹\u008e\u0081u\u001d7Ê\u0095t»ON\u0005Íé8\u0001S¨& Gî\u0085¶?\u009eÊ\u0088=®Ì3øÁÀh)\u000e3v²Í\u001f\u0089g\u001d\u009a¶\u0010\u000e`\u0084%ë=\\¡+ËÐc\\ªóÁ\u0012rè}9:8V\u009e~ß\u0012eVf\tÖ\u0011*µ\u000ea\u008d\n\u0096Ù\u00851ESKöO-½\\\tkSW\u00898öS%\u008c¤Cò]\u0089\u0095/@y\u0018\u009fY#Z\u0083ñä\u007fÀ¬g1\u0018\u0094Ü \u009f/\u00039È\u0002Ç{Ò\u00140&\u0003\u0087jÅ\b_ÆÄqy*Å¸à(\u0014í\u0098Ü¡¹ñ´h\u009e\u0001\u0017uÌN£Ürî ÀÆÔZô\u0017(fxTù7";
      int var8 = ":æI>ö\u0088<ÿ\u007f¯Á¹&@>ç\u001e\u0081\u0087sX\u0085,ð\r¬i©\u009bh\u0011Çd\u0015=D«\u0010ÈÏ\u008d\u0091\u0004ÒtI¬\u0087\u008c*\u0003\rp \u0019ÙPÖ\u009a`\u0015\\:¨\u009fË%\u008a\u0015Â\u0083©±\"\u0018\u0006$»j,ïÍ\\.0\u009c¹\u008e\u0081u\u001d7Ê\u0095t»ON\u0005Íé8\u0001S¨& Gî\u0085¶?\u009eÊ\u0088=®Ì3øÁÀh)\u000e3v²Í\u001f\u0089g\u001d\u009a¶\u0010\u000e`\u0084%ë=\\¡+ËÐc\\ªóÁ\u0012rè}9:8V\u009e~ß\u0012eVf\tÖ\u0011*µ\u000ea\u008d\n\u0096Ù\u00851ESKöO-½\\\tkSW\u00898öS%\u008c¤Cò]\u0089\u0095/@y\u0018\u009fY#Z\u0083ñä\u007fÀ¬g1\u0018\u0094Ü \u009f/\u00039È\u0002Ç{Ò\u00140&\u0003\u0087jÅ\b_ÆÄqy*Å¸à(\u0014í\u0098Ü¡¹ñ´h\u009e\u0001\u0017uÌN£Ürî ÀÆÔZô\u0017(fxTù7"
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
                     c = new String[6];
                     d3i = LogManager.getLogger();
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

                  var6 = "¢\u009fh©\u001e\u008fÃCñü4áq\nfgáÖq¥\u0089¶ü(Ie§Ì\u0086än\u0019\u0084¨æðý\u0080S·îêr\u00835ÄÅ/«qû\u0005r\u0090\u00933\fÙ\u0088Ã9@Õ\u0088³b²\u0007fwqF\u0017´\táÿbÅ\u009f ® \u0002\u0017\u0090~\u0007ëe\u001fV\u008a`OÑ\u0096Æ\u000e;Â\tô\u0004©\u009aJòJD¾\u007fS";
                  var8 = "¢\u009fh©\u001e\u008fÃCñü4áq\nfgáÖq¥\u0089¶ü(Ie§Ì\u0086än\u0019\u0084¨æðý\u0080S·îêr\u00835ÄÅ/«qû\u0005r\u0090\u00933\fÙ\u0088Ã9@Õ\u0088³b²\u0007fwqF\u0017´\táÿbÅ\u009f ® \u0002\u0017\u0090~\u0007ëe\u001fV\u008a`OÑ\u0096Æ\u000e;Â\tô\u0004©\u009aJòJD¾\u007fS"
                     .length();
                  var5 = 'P';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13632;
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
            throw new RuntimeException("gvy", var10);
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
         throw new RuntimeException("gvy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
