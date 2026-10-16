import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
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

public class cn9$zw7 extends InputStream {
   private final InputStream zy9;
   private final String e_7;
   private boolean i3r;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public cn9$zw7(InputStream var1, gdz var2, String var3) {
      long var4 = a ^ 45661964650049L;
      super();
      this.i3r = false;
      this.zy9 = var1;
      ByteArrayOutputStream var6 = new ByteArrayOutputStream();
      new Exception().printStackTrace(new PrintStream(var6));
      this.e_7 = a<"f">(7595, 8619180039241232368L ^ var4)
         + var2
         + a<"f">(8054, 7041411587136187694L ^ var4)
         + var3
         + a<"f">(2979, 6109275540651014650L ^ var4)
         + var6.toString();
   }

   @Override
   public void close() {
      this.zy9.close();
      this.i3r = true;
   }

   @Override
   public void finalize() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 2a
      // 09: getfield cn9$zw7.i3r Z
      // 0c: ifne 29
      // 0f: goto 16
      // 12: invokestatic cn9$zw7.a (Loov;)Loov;
      // 15: athrow
      // 16: invokestatic cn9.nyj ()Lorg/apache/logging/log4j/Logger;
      // 19: aload 0
      // 1a: getfield cn9$zw7.e_7 Ljava/lang/String;
      // 1d: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 22: goto 29
      // 25: invokestatic cn9$zw7.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: invokespecial java/lang/Object.finalize ()V
      // 2d: return
   }

   @Override
   public int read() {
      return this.zy9.read();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6311594306747601585L, -2290662834766743432L, MethodHandles.lookup().lookupClass()).a(250066642727903L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 114439470841748L;
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
      String var6 = "6\u001dªÙêv\u0015©óàR¿æ_ØL(KüIËô t2ÞWX\u0091ÓªË\u0003öQÊD{qÿ\u0011\u009csãT\u0001¥Ñ%\u008bJ(¬j \u008eä(\u009c\u00031á\u0015;\u001cÞ\u0093&á\u0006fu\u0091Õ\u0086\u009b\u001a\u001b\u001b\u000fÎ\u009aÛ\u008bcÒzKtÝ{5§è}\u0083Ar";
      int var8 = "6\u001dªÙêv\u0015©óàR¿æ_ØL(KüIËô t2ÞWX\u0091ÓªË\u0003öQÊD{qÿ\u0011\u009csãT\u0001¥Ñ%\u008bJ(¬j \u008eä(\u009c\u00031á\u0015;\u001cÞ\u0093&á\u0006fu\u0091Õ\u0086\u009b\u001a\u001b\u001b\u000fÎ\u009aÛ\u008bcÒzKtÝ{5§è}\u0083Ar"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20735;
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
            throw new RuntimeException("cn9$zw7", var10);
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
         throw new RuntimeException("cn9$zw7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
