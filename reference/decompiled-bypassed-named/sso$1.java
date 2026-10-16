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
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

public class sso$1 implements IStreamCallbacks {
   public final sso h5b;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public sso$1(sso var1) {
      this.h5b = var1;
   }

   public void requestAuthTokenCallback(ErrorCode var1, AuthToken var2) {
   }

   public void loginCallback(ErrorCode var1, ChannelInfo var2) {
   }

   public void getIngestServersCallback(ErrorCode var1, IngestList var2) {
   }

   public void getUserInfoCallback(ErrorCode var1, UserInfo var2) {
   }

   public void getStreamInfoCallback(ErrorCode var1, StreamInfo var2) {
   }

   public void getArchivingStateCallback(ErrorCode var1, ArchivingState var2) {
   }

   public void runCommercialCallback(ErrorCode var1) {
   }

   public void setStreamInfoCallback(ErrorCode var1) {
   }

   public void getGameNameListCallback(ErrorCode var1, GameInfoList var2) {
   }

   public void bufferUnlockCallback(long var1) {
   }

   public void startCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield sso$1.h5b Lsso;
      // 08: bipush 0
      // 09: putfield sso.tsu Z
      // 0c: iload 2
      // 0d: ifne 54
      // 10: aload 1
      // 11: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 14: ifeq 45
      // 17: goto 1e
      // 1a: invokestatic sso$1.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield sso$1.h5b Lsso;
      // 22: bipush 1
      // 23: putfield sso.jli Z
      // 26: aload 0
      // 27: getfield sso$1.h5b Lsso;
      // 2a: invokestatic java/lang/System.currentTimeMillis ()J
      // 2d: putfield sso.a7h J
      // 30: aload 0
      // 31: getfield sso$1.h5b Lsso;
      // 34: getstatic sso$s79.khy Lsso$s79;
      // 37: invokevirtual sso.bj4 (Lsso$s79;)V
      // 3a: iload 2
      // 3b: ifeq 5e
      // 3e: goto 45
      // 41: invokestatic sso$1.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 0
      // 46: getfield sso$1.h5b Lsso;
      // 49: bipush 0
      // 4a: putfield sso.or4 Z
      // 4d: goto 54
      // 50: invokestatic sso$1.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: getfield sso$1.h5b Lsso;
      // 58: getstatic sso$s79.hgo Lsso$s79;
      // 5b: invokevirtual sso.bj4 (Lsso$s79;)V
      // 5e: return
   }

   public void stopCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic sso$1.a J
      // 03: ldc2_w 17625343507152
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 11: iload 4
      // 13: ifeq a2
      // 16: ifeq 6d
      // 19: goto 20
      // 1c: invokestatic sso$1.a (Loov;)Loov;
      // 1f: athrow
      // 20: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 23: new java/lang/StringBuilder
      // 26: dup
      // 27: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a: sipush 10782
      // 2d: ldc2_w 620479664398894250
      // 30: lload 2
      // 31: lxor
      // 32: invokedynamic v (IJ)Ljava/lang/String; bsm=sso$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: nop
      // 38: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b: aload 0
      // 3c: getfield sso$1.h5b Lsso;
      // 3f: getfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 42: getfield tv/twitch/broadcast/IngestServer.serverName Ljava/lang/String;
      // 45: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48: sipush 22642
      // 4b: ldc2_w 4636347268831803079
      // 4e: lload 2
      // 4f: lxor
      // 50: invokedynamic v (IJ)Ljava/lang/String; bsm=sso$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: nop
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: aload 1
      // 5a: invokevirtual tv/twitch/ErrorCode.toString ()Ljava/lang/String;
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 63: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 66: goto 6d
      // 69: invokestatic sso$1.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield sso$1.h5b Lsso;
      // 71: bipush 0
      // 72: putfield sso.d55 Z
      // 75: aload 0
      // 76: getfield sso$1.h5b Lsso;
      // 79: bipush 0
      // 7a: putfield sso.jli Z
      // 7d: aload 0
      // 7e: getfield sso$1.h5b Lsso;
      // 81: getstatic sso$s79.hgo Lsso$s79;
      // 84: invokevirtual sso.bj4 (Lsso$s79;)V
      // 87: aload 0
      // 88: getfield sso$1.h5b Lsso;
      // 8b: aconst_null
      // 8c: putfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 8f: aload 0
      // 90: getfield sso$1.h5b Lsso;
      // 93: iload 4
      // 95: ifeq b0
      // 98: getfield sso.f_k Z
      // 9b: goto a2
      // 9e: invokestatic sso$1.a (Loov;)Loov;
      // a1: athrow
      // a2: ifeq b6
      // a5: aload 0
      // a6: getfield sso$1.h5b Lsso;
      // a9: goto b0
      // ac: invokestatic sso$1.a (Loov;)Loov;
      // af: athrow
      // b0: getstatic sso$s79.bmv Lsso$s79;
      // b3: invokevirtual sso.bj4 (Lsso$s79;)V
      // b6: return
   }

   public void sendActionMetaDataCallback(ErrorCode var1) {
   }

   public void sendStartSpanMetaDataCallback(ErrorCode var1) {
   }

   public void sendEndSpanMetaDataCallback(ErrorCode var1) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7873735279428070819L, -7866660584359272818L, MethodHandles.lookup().lookupClass()).a(167516898084980L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 35284174431250L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = " ½\u0000\u001bVQ½ÜwÖg\tnhµÌ Ïÿ{6Þ~Ý`Äz4Ô4ÕÖ\u0092²\u0004\u0087\u0005Ó\\\u008bì6Ès1\u0094\u0002¤Q?\\-\u001eó(vëfÛÜ\u0007ÔS\u0002{Û#b\u00adq \u0090U\u001akJ6Jw¦\u0010tÕE·× \"¢JBïüN¼õf";
      int var8 = " ½\u0000\u001bVQ½ÜwÖg\tnhµÌ Ïÿ{6Þ~Ý`Äz4Ô4ÕÖ\u0092²\u0004\u0087\u0005Ó\\\u008bì6Ès1\u0094\u0002¤Q?\\-\u001eó(vëfÛÜ\u0007ÔS\u0002{Û#b\u00adq \u0090U\u001akJ6Jw¦\u0010tÕE·× \"¢JBïüN¼õf"
         .length();
      char var5 = 'P';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22289;
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
            throw new RuntimeException("sso$1", var10);
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
         throw new RuntimeException("sso$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
