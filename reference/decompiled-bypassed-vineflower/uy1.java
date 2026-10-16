import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.EventLoop;
import io.netty.channel.local.LocalEventLoopGroup;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import us.myles.ViaVersion.ViaManager;
import us.myles.ViaVersion.api.Via;
import us.myles.ViaVersion.api.data.MappingDataLoader;

public class uy1 {
   public static int al8;
   public static final Logger ury;
   public static final ExecutorService om1;
   public static final EventLoop br4;
   public static CompletableFuture o3o;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static String csg() {
      long var0 = a ^ 40317360504903L;
      return a<"h">(12444, 8943106967772963410L ^ var0);
   }

   public void f7t() {
      this.ypk();
      Via.init(ViaManager.builder().injector(new ff2()).loader(new rx1()).platform(new uqt()).build());
      MappingDataLoader.enableMappingsCache();
      new t8z();
      new h8s();
      Via.getManager().init();
      o3o.complete(null);
   }

   public void ypk() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic uy1.a J
      // 003: ldc2_w 91027725228629
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic java/lang/ClassLoader.getSystemClassLoader ()Ljava/lang/ClassLoader;
      // 00b: astore 4
      // 00d: aload 4
      // 00f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 012: sipush 8486
      // 015: ldc2_w 7456065621250058748
      // 018: lload 1
      // 019: lxor
      // 01a: invokedynamic h (IJ)Ljava/lang/String; bsm=uy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: nop
      // 020: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 023: astore 5
      // 025: aload 5
      // 027: bipush 1
      // 028: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 02b: invokestatic t9d.c ()I
      // 02e: aload 5
      // 030: aload 4
      // 032: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 035: checkcast sun/misc/URLClassPath
      // 038: astore 6
      // 03a: istore 3
      // 03b: new java/io/File
      // 03e: dup
      // 03f: invokestatic c05.vz1 ()Lc05;
      // 042: getfield c05.glh Ljava/io/File;
      // 045: sipush 20934
      // 048: ldc2_w 3979611037063448
      // 04b: lload 1
      // 04c: lxor
      // 04d: invokedynamic h (IJ)Ljava/lang/String; bsm=uy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: nop
      // 053: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 056: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 059: astore 7
      // 05b: aload 7
      // 05d: iload 3
      // 05e: ifne 06d
      // 061: ifnull 101
      // 064: goto 06b
      // 067: invokestatic uy1.a (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 7
      // 06d: astore 8
      // 06f: aload 8
      // 071: arraylength
      // 072: istore 9
      // 074: bipush 0
      // 075: istore 10
      // 077: iload 10
      // 079: iload 9
      // 07b: if_icmpge 101
      // 07e: aload 8
      // 080: iload 10
      // 082: aaload
      // 083: astore 11
      // 085: iload 3
      // 086: ifne 0fd
      // 089: aload 11
      // 08b: invokevirtual java/io/File.isFile ()Z
      // 08e: ifeq 0fa
      // 091: goto 098
      // 094: invokestatic uy1.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 11
      // 09a: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 09d: sipush 19450
      // 0a0: ldc2_w 8415251906733687591
      // 0a3: lload 1
      // 0a4: lxor
      // 0a5: invokedynamic h (IJ)Ljava/lang/String; bsm=uy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: nop
      // 0ab: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0ae: iload 3
      // 0af: ifne 0e3
      // 0b2: goto 0b9
      // 0b5: invokestatic uy1.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: ifeq 0fa
      // 0bc: goto 0c3
      // 0bf: invokestatic uy1.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 11
      // 0c5: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 0c8: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0cb: sipush 5815
      // 0ce: ldc2_w 3695017956972240495
      // 0d1: lload 1
      // 0d2: lxor
      // 0d3: invokedynamic h (IJ)Ljava/lang/String; bsm=uy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: nop
      // 0d9: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0dc: goto 0e3
      // 0df: invokestatic uy1.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: ifeq 0fa
      // 0e6: aload 6
      // 0e8: aload 11
      // 0ea: invokevirtual java/io/File.toURI ()Ljava/net/URI;
      // 0ed: invokevirtual java/net/URI.toURL ()Ljava/net/URL;
      // 0f0: invokevirtual sun/misc/URLClassPath.addURL (Ljava/net/URL;)V
      // 0f3: goto 0fa
      // 0f6: invokestatic uy1.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: iinc 10 1
      // 0fd: iload 3
      // 0fe: ifeq 077
      // 101: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(371865512980954033L, 5715116074905520016L, MethodHandles.lookup().lookupClass()).a(84105865709418L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 12827319417097L;
      Cipher var0;
      Cipher var14 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "\u009fº*Ó3\u0081\u001dÄØtß\u001b&\u008eÔ\u001c Ät(:WÒId\"ö8\u0014êÂ4þX\rë¸¯Ñ\u0001?0\u0000î&\u001c×ÿ\u0084\u0010¬\u008e\u00151\u009eö\u001f±¸cPôÀ÷³\u0091\u0010@F7¸Ó¯\u007fDê Àl\u0087mÁÅ\u0010âN\u0096å\\\u0012÷\u0090Ã\nZ$\u0099áÙA";
      int var6 = "\u009fº*Ó3\u0081\u001dÄØtß\u001b&\u008eÔ\u001c Ät(:WÒId\"ö8\u0014êÂ4þX\rë¸¯Ñ\u0001?0\u0000î&\u001c×ÿ\u0084\u0010¬\u008e\u00151\u009eö\u001f±¸cPôÀ÷³\u0091\u0010@F7¸Ó¯\u007fDê Àl\u0087mÁÅ\u0010âN\u0096å\\\u0012÷\u0090Ã\nZ$\u0099áÙA"
         .length();
      char var3 = 16;
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var4.substring(++var13, var13 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var21;
                  if ((var13 += var3) >= var6) {
                     b = var7;
                     c = new String[7];
                     al8 = 47;
                     ury = new _h2(LogManager.getLogger(a<"h">(18860, 7790009509649769003L ^ var9)));
                     o3o = new CompletableFuture();
                     ThreadFactory var11 = new ThreadFactoryBuilder().setDaemon(true).setNameFormat(a<"h">(32065, 3208524679499470530L ^ var9)).build();
                     om1 = Executors.newFixedThreadPool(8, var11);
                     br4 = new LocalEventLoopGroup(1, var11).next();
                     br4.submit(o3o::join);
                     return;
                  }

                  var3 = var4.charAt(var13);
                  break;
               default:
                  var7[var5++] = var21;
                  if ((var13 += var3) < var6) {
                     var3 = var4.charAt(var13);
                     continue label27;
                  }

                  var4 = "\u001fÓ[Ûn\u0014Ä$úÆGö\u0098¯Í\u008aÏc\u0095\u000e¶Áî\u0095²ã\u0012\f\u0090»\u0093\u008d\u0010;'\u0081§5¯\u008dÇ>\u000b¸PÞ²\\\u000e";
                  var6 = "\u001fÓ[Ûn\u0014Ä$úÆGö\u0098¯Í\u008aÏc\u0095\u000e¶Áî\u0095²ã\u0012\f\u0090»\u0093\u008d\u0010;'\u0081§5¯\u008dÇ>\u000b¸PÞ²\\\u000e"
                     .length();
                  var3 = ' ';
                  var13 = -1;
            }

            var15 = var4.substring(++var13, var13 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12941;
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
            throw new RuntimeException("uy1", var10);
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
         throw new RuntimeException("uy1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
