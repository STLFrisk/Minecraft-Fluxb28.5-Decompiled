import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class crb {
   public static final ListeningExecutorService wki;
   private static final AtomicInteger yb7;
   private static final Logger smn;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static String m89(Map param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic crb.a J
      // 03: ldc2_w 3498669866106
      // 06: lxor
      // 07: lstore 1
      // 08: new java/lang/StringBuilder
      // 0b: dup
      // 0c: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f: astore 4
      // 11: invokestatic OpaquePredicate.b ()I
      // 14: aload 0
      // 15: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 1a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1f: astore 5
      // 21: istore 3
      // 22: aload 5
      // 24: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29: ifeq d5
      // 2c: aload 5
      // 2e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 33: checkcast java/util/Map$Entry
      // 36: astore 6
      // 38: aload 4
      // 3a: iload 3
      // 3b: ifeq d7
      // 3e: iload 3
      // 3f: ifeq 85
      // 42: goto 49
      // 45: invokestatic crb.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: invokevirtual java/lang/StringBuilder.length ()I
      // 4c: ifle 65
      // 4f: goto 56
      // 52: invokestatic crb.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 4
      // 58: bipush 38
      // 5a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 5d: pop
      // 5e: goto 65
      // 61: invokestatic crb.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: aload 4
      // 67: aload 6
      // 69: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 6e: checkcast java/lang/String
      // 71: sipush 25900
      // 74: ldc2_w 9111633812194637552
      // 77: lload 1
      // 78: lxor
      // 79: invokedynamic c (IJ)Ljava/lang/String; bsm=crb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: nop
      // 7f: invokestatic java/net/URLEncoder.encode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 82: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 85: pop
      // 86: goto 90
      // 89: astore 7
      // 8b: aload 7
      // 8d: invokevirtual java/io/UnsupportedEncodingException.printStackTrace ()V
      // 90: aload 6
      // 92: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 97: ifnull d1
      // 9a: aload 4
      // 9c: bipush 61
      // 9e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // a1: pop
      // a2: aload 4
      // a4: aload 6
      // a6: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // ab: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // ae: sipush 4400
      // b1: ldc2_w 9079147620431086306
      // b4: lload 1
      // b5: lxor
      // b6: invokedynamic c (IJ)Ljava/lang/String; bsm=crb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: nop
      // bc: invokestatic java/net/URLEncoder.encode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c2: pop
      // c3: goto d1
      // c6: invokestatic crb.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9: athrow
      // ca: astore 7
      // cc: aload 7
      // ce: invokevirtual java/io/UnsupportedEncodingException.printStackTrace ()V
      // d1: iload 3
      // d2: ifne 22
      // d5: aload 4
      // d7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // da: areturn
   }

   public static String zv4(URL var0, Map var1, boolean var2) {
      return oc_(var0, m89(var1), var2);
   }

   private static String oc_(URL param0, String param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic crb.a J
      // 003: ldc2_w 47738330054699
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: invokestatic vr1._0v ()Lvr1;
      // 010: iload 5
      // 012: ifeq 02a
      // 015: ifnonnull 027
      // 018: goto 01f
      // 01b: invokestatic crb.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: aconst_null
      // 020: goto 02d
      // 023: invokestatic crb.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: invokestatic vr1._0v ()Lvr1;
      // 02a: invokevirtual vr1.m0e ()Ljava/net/Proxy;
      // 02d: astore 6
      // 02f: aload 6
      // 031: iload 5
      // 033: ifeq 043
      // 036: ifnonnull 045
      // 039: goto 040
      // 03c: invokestatic crb.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: getstatic java/net/Proxy.NO_PROXY Ljava/net/Proxy;
      // 043: astore 6
      // 045: aload 0
      // 046: aload 6
      // 048: invokevirtual java/net/URL.openConnection (Ljava/net/Proxy;)Ljava/net/URLConnection;
      // 04b: checkcast java/net/HttpURLConnection
      // 04e: astore 7
      // 050: aload 7
      // 052: sipush 19263
      // 055: ldc2_w 3701223927403668664
      // 058: lload 3
      // 059: lxor
      // 05a: invokedynamic c (IJ)Ljava/lang/String; bsm=crb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: nop
      // 060: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 063: aload 7
      // 065: sipush 4831
      // 068: ldc2_w 8983733191208025434
      // 06b: lload 3
      // 06c: lxor
      // 06d: invokedynamic c (IJ)Ljava/lang/String; bsm=crb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: nop
      // 073: sipush 3931
      // 076: ldc2_w 158012633695461597
      // 079: lload 3
      // 07a: lxor
      // 07b: invokedynamic c (IJ)Ljava/lang/String; bsm=crb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: nop
      // 081: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 084: aload 7
      // 086: sipush 16220
      // 089: ldc2_w 2906412955484328144
      // 08c: lload 3
      // 08d: lxor
      // 08e: invokedynamic c (IJ)Ljava/lang/String; bsm=crb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: nop
      // 094: new java/lang/StringBuilder
      // 097: dup
      // 098: invokespecial java/lang/StringBuilder.<init> ()V
      // 09b: ldc ""
      // 09d: nop
      // 09e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a1: aload 1
      // 0a2: invokevirtual java/lang/String.getBytes ()[B
      // 0a5: arraylength
      // 0a6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ac: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0af: aload 7
      // 0b1: sipush 23229
      // 0b4: ldc2_w 6283592856514032959
      // 0b7: lload 3
      // 0b8: lxor
      // 0b9: invokedynamic c (IJ)Ljava/lang/String; bsm=crb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: nop
      // 0bf: sipush 16167
      // 0c2: ldc2_w 7875178109027586211
      // 0c5: lload 3
      // 0c6: lxor
      // 0c7: invokedynamic c (IJ)Ljava/lang/String; bsm=crb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: nop
      // 0cd: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0d0: aload 7
      // 0d2: bipush 0
      // 0d3: invokevirtual java/net/HttpURLConnection.setUseCaches (Z)V
      // 0d6: aload 7
      // 0d8: bipush 1
      // 0d9: invokevirtual java/net/HttpURLConnection.setDoInput (Z)V
      // 0dc: aload 7
      // 0de: bipush 1
      // 0df: invokevirtual java/net/HttpURLConnection.setDoOutput (Z)V
      // 0e2: new java/io/DataOutputStream
      // 0e5: dup
      // 0e6: aload 7
      // 0e8: invokevirtual java/net/HttpURLConnection.getOutputStream ()Ljava/io/OutputStream;
      // 0eb: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 0ee: astore 8
      // 0f0: aload 8
      // 0f2: aload 1
      // 0f3: invokevirtual java/io/DataOutputStream.writeBytes (Ljava/lang/String;)V
      // 0f6: aload 8
      // 0f8: invokevirtual java/io/DataOutputStream.flush ()V
      // 0fb: aload 8
      // 0fd: invokevirtual java/io/DataOutputStream.close ()V
      // 100: new java/io/BufferedReader
      // 103: dup
      // 104: new java/io/InputStreamReader
      // 107: dup
      // 108: aload 7
      // 10a: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 10d: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 110: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 113: astore 9
      // 115: new java/lang/StringBuffer
      // 118: dup
      // 119: invokespecial java/lang/StringBuffer.<init> ()V
      // 11c: astore 10
      // 11e: aload 9
      // 120: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 123: dup
      // 124: astore 11
      // 126: ifnull 14a
      // 129: aload 10
      // 12b: aload 11
      // 12d: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 130: pop
      // 131: aload 10
      // 133: bipush 13
      // 135: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 138: pop
      // 139: iload 5
      // 13b: ifeq 14f
      // 13e: iload 5
      // 140: ifne 11e
      // 143: goto 14a
      // 146: invokestatic crb.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 149: athrow
      // 14a: aload 9
      // 14c: invokevirtual java/io/BufferedReader.close ()V
      // 14f: aload 10
      // 151: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 154: areturn
      // 155: astore 6
      // 157: iload 2
      // 158: ifne 18b
      // 15b: getstatic crb.smn Lorg/apache/logging/log4j/Logger;
      // 15e: new java/lang/StringBuilder
      // 161: dup
      // 162: invokespecial java/lang/StringBuilder.<init> ()V
      // 165: sipush 11998
      // 168: ldc2_w 3308313337964036432
      // 16b: lload 3
      // 16c: lxor
      // 16d: invokedynamic c (IJ)Ljava/lang/String; bsm=crb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: nop
      // 173: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 176: aload 0
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17d: aload 6
      // 17f: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 184: goto 18b
      // 187: invokestatic crb.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: ldc ""
      // 18d: nop
      // 18e: areturn
   }

   public static ListenableFuture xni(File var0, String var1, Map var2, int var3, sw6 var4, Proxy var5) {
      return wki.submit(new crb$1(var4, var1, var5, var2, var0, var3));
   }

   public static int rtp() {
      ServerSocket var1 = null;
      int var10000 = OpaquePredicate.b();
      int var2 = -1;
      int var0 = var10000;

      try {
         var1 = new ServerSocket(0);
         var2 = var1.getLocalPort();
      } finally {
         try {
            label67: {
               label66: {
                  try {
                     var15 = var1;
                     if (var0 == 0) {
                        break label66;
                     }

                     if (var1 == null) {
                        break label67;
                     }
                  } catch (IOException var11) {
                     throw a(var11);
                  }

                  var15 = var1;
               }

               var15.close();
            }
         } catch (IOException var12) {
         }
      }

      return var2;
   }

   public static String qq0(URL var0) {
      long var1 = a ^ 23703837497615L;
      HttpURLConnection var4 = (HttpURLConnection)var0.openConnection();
      var4.setRequestMethod(a<"c">(19408, 5187792313695714677L ^ var1));
      int var10000 = OpaquePredicate.b();
      BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
      StringBuilder var6 = new StringBuilder();
      int var3 = var10000;

      while (true) {
         String var7;
         if ((var7 = var5.readLine()) != null) {
            try {
               var6.append(var7);
               var6.append('\r');
               if (var3 == 0) {
                  break;
               }

               if (var3 != 0) {
                  continue;
               }
            } catch (oov var8) {
               throw a(var8);
            }
         }

         var5.close();
         break;
      }

      return var6.toString();
   }

   public static Logger yzg() {
      return smn;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7534500093400532619L, -591838651340445602L, MethodHandles.lookup().lookupClass()).a(110560248342868L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 70068602682722L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[11];
      int var5 = 0;
      String var4 = "øµsgç\u0004÷:\u007f\u0004lNp$\u0013Ý\u0018¢ÿä£¥E÷\u000b\u007f\u0098a;\u00890\u008b\u0095\u0015z\u0099£ÛÛ\u001bi@I\u0006î®\u0084ôÂ\u008b\u0003®O\u009b·\u009bßh\u00030\u001f\fVóCvôBe\u0088C£U\u0082\u0081L\u0015Re=\u009fí\u001f/ÎÍ$¤gÞºÃcq/¶\u0093\u0005Lbã\u0088Ôýh÷\u0010KÅà1n¹¡\"WÒ\u0006×\u0081ñ+« \f´\u0013¶aù±4ï¨sM\u009b\u000fáâ êÃY\u0004\u009a9%-)a}[»ào\u0010\u0019Ï/èS\u008cÀTîøRtÙ\u0019\u0016P(çQ«\u009eX\u000eë\u0018b§jÃHR\u0005Ã÷ÛT\u0010o\u0085\u0095ò9\u0085n¦µ\u0019\u0003Ädý\u0016Éðþd\u0080\u0010±ø\b\u008c¶@[\u009cB| \u0086\u008f]úÈ\u0018Þÿ«;\u0081\u0011¥]\u001e\u0091^ü&\u0080\u0017\nª·¥>&\u0080eª";
      int var6 = "øµsgç\u0004÷:\u007f\u0004lNp$\u0013Ý\u0018¢ÿä£¥E÷\u000b\u007f\u0098a;\u00890\u008b\u0095\u0015z\u0099£ÛÛ\u001bi@I\u0006î®\u0084ôÂ\u008b\u0003®O\u009b·\u009bßh\u00030\u001f\fVóCvôBe\u0088C£U\u0082\u0081L\u0015Re=\u009fí\u001f/ÎÍ$¤gÞºÃcq/¶\u0093\u0005Lbã\u0088Ôýh÷\u0010KÅà1n¹¡\"WÒ\u0006×\u0081ñ+« \f´\u0013¶aù±4ï¨sM\u009b\u000fáâ êÃY\u0004\u009a9%-)a}[»ào\u0010\u0019Ï/èS\u008cÀTîøRtÙ\u0019\u0016P(çQ«\u009eX\u000eë\u0018b§jÃHR\u0005Ã÷ÛT\u0010o\u0085\u0095ò9\u0085n¦µ\u0019\u0003Ädý\u0016Éðþd\u0080\u0010±ø\b\u008c¶@[\u009cB| \u0086\u008f]úÈ\u0018Þÿ«;\u0081\u0011¥]\u001e\u0091^ü&\u0080\u0017\nª·¥>&\u0080eª"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[11];
                     wki = MoreExecutors.listeningDecorator(
                        Executors.newCachedThreadPool(
                           new ThreadFactoryBuilder().setDaemon(true).setNameFormat(a<"c">(8810, 4201737998379462819L ^ var9)).build()
                        )
                     );
                     yb7 = new AtomicInteger(0);
                     smn = LogManager.getLogger();
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

                  var4 = "*Væã\u0016¹ß\fÌ$D\u0003V~\u009a\u0096(·\u0019å}\rï%\u0088\u00055Ky%.î®¦\u0002\u0017ú¢\u008eÊoy\u0088Û¢\u0006íB9Ó?¹\u009fÈ5\u000bY";
                  var6 = "*Væã\u0016¹ß\fÌ$D\u0003V~\u009a\u0096(·\u0019å}\rï%\u0088\u00055Ky%.î®¦\u0002\u0017ú¢\u008eÊoy\u0088Û¢\u0006íB9Ó?¹\u009fÈ5\u000bY"
                     .length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11682;
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
            throw new RuntimeException("crb", var10);
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
         throw new RuntimeException("crb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
