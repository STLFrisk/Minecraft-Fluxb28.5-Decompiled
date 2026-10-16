import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class grn {
   private static final TrustManager[] tsk;
   private static final HostnameVerifier ype;
   private final SSLSocketFactory cnt;
   private final SSLSocketFactory wx2;
   private final HostnameVerifier rs8;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public grn() {
      long var1 = a ^ 51196565897149L;
      super();
      SSLContext var3 = null;

      try {
         var3 = SSLContext.getInstance(a<"q">(21364, 5236845903484369981L ^ var1));
         var3.init(null, tsk, new SecureRandom());
      } catch (KeyManagementException | NoSuchAlgorithmException var5) {
         var5.printStackTrace();
      }

      this.cnt = var3.getSocketFactory();
      this.wx2 = HttpsURLConnection.getDefaultSSLSocketFactory();
      this.rs8 = HttpsURLConnection.getDefaultHostnameVerifier();
   }

   public void _kh() {
      this.zya(this.wx2, this.rs8);
   }

   public void puk() {
      this.zya(this.cnt, ype);
   }

   private void zya(SSLSocketFactory var1, HostnameVerifier var2) {
      HttpsURLConnection.setDefaultSSLSocketFactory(var1);
      HttpsURLConnection.setDefaultHostnameVerifier(var2);
   }

   private static boolean znb(String param0, SSLSession param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic grn.a J
      // 03: ldc2_w 52163398749217
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: sipush 1949
      // 11: ldc2_w 1530321997510056777
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic q (IJ)Ljava/lang/String; bsm=grn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f: iload 4
      // 21: ifne 57
      // 24: ifne 56
      // 27: goto 2e
      // 2a: invokestatic grn.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: sipush 29598
      // 32: ldc2_w 4611162276952207176
      // 35: lload 2
      // 36: lxor
      // 37: invokedynamic q (IJ)Ljava/lang/String; bsm=grn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: nop
      // 3d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 40: iload 4
      // 42: ifne 57
      // 45: goto 4c
      // 48: invokestatic grn.a (Loov;)Loov;
      // 4b: athrow
      // 4c: ifeq 5a
      // 4f: goto 56
      // 52: invokestatic grn.a (Loov;)Loov;
      // 55: athrow
      // 56: bipush 1
      // 57: goto 5b
      // 5a: bipush 0
      // 5b: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8370552384126166901L, 4177388050137784651L, MethodHandles.lookup().lookupClass()).a(272106590305086L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 63031502535712L;
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
      String var6 = ")\u0013\u0086Á?\u0002j\u0091.ücâÿ·\u008dÐÞ}Å\b\u001fi\u0002Øâ\u0006É\u0092\u009c¬\u0096\u0003/ßõ¿£\u0098øg\u0085ÿ1\u0002ü£FÎk<ÞÙC£rR\u0010\u0084\u0015'¢\n\u009c\u009dúÄ¨õ3vÎ\u0097C8\u0099\\\u0007rMº\u008b1\u0015þ²ú*M\u0007µ?\u001a¹÷&\u0018 ]Ô'Â\u0016²×tîñ(>¦eY\u0015Ã\u0090ÍÐ\u0086\u0001¸ðù\u0084Õ\u0083ò\u0085ª°\u0006";
      int var8 = ")\u0013\u0086Á?\u0002j\u0091.ücâÿ·\u008dÐÞ}Å\b\u001fi\u0002Øâ\u0006É\u0092\u009c¬\u0096\u0003/ßõ¿£\u0098øg\u0085ÿ1\u0002ü£FÎk<ÞÙC£rR\u0010\u0084\u0015'¢\n\u009c\u009dúÄ¨õ3vÎ\u0097C8\u0099\\\u0007rMº\u008b1\u0015þ²ú*M\u0007µ?\u001a¹÷&\u0018 ]Ô'Â\u0016²×tîñ(>¦eY\u0015Ã\u0090ÍÐ\u0086\u0001¸ðù\u0084Õ\u0083ò\u0085ª°\u0006"
         .length();
      char var5 = '8';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            tsk = new TrustManager[]{new grn$1()};
            ype = grn::znb;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28207;
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
            throw new RuntimeException("grn", var10);
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
         throw new RuntimeException("grn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
