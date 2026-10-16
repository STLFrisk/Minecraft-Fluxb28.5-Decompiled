import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class qm3 {
   private static final Logger a25;
   private static final DateFormat qjt;
   private static IntBuffer n37;
   private static int[] g17;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static ekw o6i(File var0, int var1, int var2, oru var3) {
      return dbs(var0, (String)null, var1, var2, var3);
   }

   public static ekw dbs(File param0, String param1, int param2, int param3, oru param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qm3.a J
      // 003: ldc2_w 83419983675389
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic t9d.c ()I
      // 00c: istore 7
      // 00e: getstatic zwr.pzt Lcn7;
      // 011: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 014: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 017: ifeq 028
      // 01a: aload 0
      // 01b: aload 1
      // 01c: iload 2
      // 01d: iload 3
      // 01e: aload 4
      // 020: invokestatic djl.k10 (Ljava/io/File;Ljava/lang/String;IILoru;)Lekw;
      // 023: areturn
      // 024: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: new java/io/File
      // 02b: dup
      // 02c: aload 0
      // 02d: sipush 20571
      // 030: ldc2_w 409771347093862961
      // 033: lload 5
      // 035: lxor
      // 036: invokedynamic t (IJ)Ljava/lang/String; bsm=qm3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: nop
      // 03c: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 03f: astore 8
      // 041: aload 8
      // 043: invokevirtual java/io/File.mkdir ()Z
      // 046: pop
      // 047: invokestatic gis.gu5 ()Z
      // 04a: iload 7
      // 04c: ifne 068
      // 04f: ifeq 065
      // 052: goto 059
      // 055: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: aload 4
      // 05b: getfield oru.ntc I
      // 05e: istore 2
      // 05f: aload 4
      // 061: getfield oru.f86 I
      // 064: istore 3
      // 065: iload 2
      // 066: iload 3
      // 067: imul
      // 068: istore 9
      // 06a: getstatic qm3.n37 Ljava/nio/IntBuffer;
      // 06d: iload 7
      // 06f: ifne 0a6
      // 072: ifnull 09a
      // 075: goto 07c
      // 078: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: getstatic qm3.n37 Ljava/nio/IntBuffer;
      // 07f: invokevirtual java/nio/IntBuffer.capacity ()I
      // 082: iload 9
      // 084: iload 7
      // 086: ifne 0bb
      // 089: goto 090
      // 08c: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: if_icmpge 0b0
      // 093: goto 09a
      // 096: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: iload 9
      // 09c: invokestatic org/lwjgl/BufferUtils.createIntBuffer (I)Ljava/nio/IntBuffer;
      // 09f: goto 0a6
      // 0a2: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: putstatic qm3.n37 Ljava/nio/IntBuffer;
      // 0a9: iload 9
      // 0ab: newarray 10
      // 0ad: putstatic qm3.g17 [I
      // 0b0: sipush 3333
      // 0b3: bipush 1
      // 0b4: invokestatic org/lwjgl/opengl/GL11.glPixelStorei (II)V
      // 0b7: sipush 3317
      // 0ba: bipush 1
      // 0bb: invokestatic org/lwjgl/opengl/GL11.glPixelStorei (II)V
      // 0be: getstatic qm3.n37 Ljava/nio/IntBuffer;
      // 0c1: invokevirtual java/nio/IntBuffer.clear ()Ljava/nio/Buffer;
      // 0c4: pop
      // 0c5: invokestatic gis.gu5 ()Z
      // 0c8: iload 7
      // 0ca: ifne 103
      // 0cd: ifeq 0fb
      // 0d0: goto 0d7
      // 0d3: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 4
      // 0d9: getfield oru.mqx I
      // 0dc: invokestatic hzu.t30 (I)V
      // 0df: sipush 3553
      // 0e2: bipush 0
      // 0e3: ldc 32993
      // 0e5: nop
      // 0e6: ldc 33639
      // 0e8: nop
      // 0e9: getstatic qm3.n37 Ljava/nio/IntBuffer;
      // 0ec: invokestatic org/lwjgl/opengl/GL11.glGetTexImage (IIIILjava/nio/IntBuffer;)V
      // 0ef: iload 7
      // 0f1: ifeq 112
      // 0f4: goto 0fb
      // 0f7: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: bipush 0
      // 0fc: goto 103
      // 0ff: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102: athrow
      // 103: bipush 0
      // 104: iload 2
      // 105: iload 3
      // 106: ldc 32993
      // 108: nop
      // 109: ldc 33639
      // 10b: nop
      // 10c: getstatic qm3.n37 Ljava/nio/IntBuffer;
      // 10f: invokestatic org/lwjgl/opengl/GL11.glReadPixels (IIIIIILjava/nio/IntBuffer;)V
      // 112: getstatic qm3.n37 Ljava/nio/IntBuffer;
      // 115: getstatic qm3.g17 [I
      // 118: invokevirtual java/nio/IntBuffer.get ([I)Ljava/nio/IntBuffer;
      // 11b: pop
      // 11c: getstatic qm3.g17 [I
      // 11f: iload 2
      // 120: iload 3
      // 121: invokestatic p9t.ae5 ([III)V
      // 124: aconst_null
      // 125: astore 10
      // 127: invokestatic gis.gu5 ()Z
      // 12a: ifeq 1a3
      // 12d: new java/awt/image/BufferedImage
      // 130: dup
      // 131: aload 4
      // 133: getfield oru.r_a I
      // 136: aload 4
      // 138: getfield oru.s1h I
      // 13b: bipush 1
      // 13c: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 13f: astore 10
      // 141: aload 4
      // 143: getfield oru.f86 I
      // 146: aload 4
      // 148: getfield oru.s1h I
      // 14b: isub
      // 14c: istore 11
      // 14e: iload 11
      // 150: istore 12
      // 152: iload 12
      // 154: aload 4
      // 156: getfield oru.f86 I
      // 159: if_icmpge 1a0
      // 15c: bipush 0
      // 15d: istore 13
      // 15f: iload 13
      // 161: aload 4
      // 163: getfield oru.r_a I
      // 166: if_icmpge 198
      // 169: aload 10
      // 16b: iload 13
      // 16d: iload 12
      // 16f: iload 11
      // 171: isub
      // 172: getstatic qm3.g17 [I
      // 175: iload 12
      // 177: aload 4
      // 179: getfield oru.ntc I
      // 17c: imul
      // 17d: iload 13
      // 17f: iadd
      // 180: iaload
      // 181: invokevirtual java/awt/image/BufferedImage.setRGB (III)V
      // 184: iinc 13 1
      // 187: iload 7
      // 189: ifne 19b
      // 18c: iload 7
      // 18e: ifeq 15f
      // 191: goto 198
      // 194: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 197: athrow
      // 198: iinc 12 1
      // 19b: iload 7
      // 19d: ifeq 152
      // 1a0: goto 1bd
      // 1a3: new java/awt/image/BufferedImage
      // 1a6: dup
      // 1a7: iload 2
      // 1a8: iload 3
      // 1a9: bipush 1
      // 1aa: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 1ad: astore 10
      // 1af: aload 10
      // 1b1: bipush 0
      // 1b2: bipush 0
      // 1b3: iload 2
      // 1b4: iload 3
      // 1b5: getstatic qm3.g17 [I
      // 1b8: bipush 0
      // 1b9: iload 2
      // 1ba: invokevirtual java/awt/image/BufferedImage.setRGB (IIII[III)V
      // 1bd: aload 1
      // 1be: ifnonnull 1cd
      // 1c1: aload 8
      // 1c3: invokestatic qm3.iki (Ljava/io/File;)Ljava/io/File;
      // 1c6: astore 11
      // 1c8: iload 7
      // 1ca: ifeq 1d9
      // 1cd: new java/io/File
      // 1d0: dup
      // 1d1: aload 8
      // 1d3: aload 1
      // 1d4: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 1d7: astore 11
      // 1d9: aload 10
      // 1db: sipush 3162
      // 1de: ldc2_w 2554673695100167731
      // 1e1: lload 5
      // 1e3: lxor
      // 1e4: invokedynamic t (IJ)Ljava/lang/String; bsm=qm3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: nop
      // 1ea: aload 11
      // 1ec: invokestatic javax/imageio/ImageIO.write (Ljava/awt/image/RenderedImage;Ljava/lang/String;Ljava/io/File;)Z
      // 1ef: pop
      // 1f0: new tao
      // 1f3: dup
      // 1f4: aload 11
      // 1f6: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 1f9: invokespecial tao.<init> (Ljava/lang/String;)V
      // 1fc: astore 12
      // 1fe: aload 12
      // 200: invokeinterface ekw.f4q ()Lpoy; 1
      // 205: new tgr
      // 208: dup
      // 209: getstatic tgr$a3_.r71 Ltgr$a3_;
      // 20c: aload 11
      // 20e: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 211: invokespecial tgr.<init> (Ltgr$a3_;Ljava/lang/String;)V
      // 214: invokevirtual poy.bpc (Ltgr;)Lpoy;
      // 217: pop
      // 218: aload 12
      // 21a: invokeinterface ekw.f4q ()Lpoy; 1
      // 21f: bipush 1
      // 220: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 223: invokevirtual poy.zqw (Ljava/lang/Boolean;)Lpoy;
      // 226: pop
      // 227: new hsu
      // 22a: dup
      // 22b: sipush 19806
      // 22e: ldc2_w 4445865073841022768
      // 231: lload 5
      // 233: lxor
      // 234: invokedynamic t (IJ)Ljava/lang/String; bsm=qm3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: nop
      // 23a: bipush 1
      // 23b: anewarray 18
      // 23e: dup
      // 23f: bipush 0
      // 240: aload 12
      // 242: aastore
      // 243: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 246: areturn
      // 247: astore 8
      // 249: getstatic qm3.a25 Lorg/apache/logging/log4j/Logger;
      // 24c: sipush 11825
      // 24f: ldc2_w 2425077568437404766
      // 252: lload 5
      // 254: lxor
      // 255: invokedynamic t (IJ)Ljava/lang/String; bsm=qm3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: nop
      // 25b: aload 8
      // 25d: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 262: new hsu
      // 265: dup
      // 266: sipush 16661
      // 269: ldc2_w 5727717666460183417
      // 26c: lload 5
      // 26e: lxor
      // 26f: invokedynamic t (IJ)Ljava/lang/String; bsm=qm3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: nop
      // 275: bipush 1
      // 276: anewarray 18
      // 279: dup
      // 27a: bipush 0
      // 27b: aload 8
      // 27d: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 280: aastore
      // 281: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 284: areturn
   }

   private static File iki(File param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qm3.a J
      // 03: ldc2_w 25235612753384
      // 06: lxor
      // 07: lstore 1
      // 08: getstatic qm3.qjt Ljava/text/DateFormat;
      // 0b: new java/util/Date
      // 0e: dup
      // 0f: invokespecial java/util/Date.<init> ()V
      // 12: invokevirtual java/text/DateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 15: invokevirtual java/lang/String.toString ()Ljava/lang/String;
      // 18: astore 4
      // 1a: invokestatic t9d.b ()I
      // 1d: bipush 1
      // 1e: istore 5
      // 20: istore 3
      // 21: new java/io/File
      // 24: dup
      // 25: aload 0
      // 26: new java/lang/StringBuilder
      // 29: dup
      // 2a: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d: aload 4
      // 2f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32: iload 5
      // 34: bipush 1
      // 35: if_icmpne 42
      // 38: ldc ""
      // 3a: nop
      // 3b: goto 57
      // 3e: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: new java/lang/StringBuilder
      // 45: dup
      // 46: invokespecial java/lang/StringBuilder.<init> ()V
      // 49: ldc "_"
      // 4b: nop
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: iload 5
      // 51: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 54: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 57: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a: sipush 4253
      // 5d: ldc2_w 8891690181413165283
      // 60: lload 1
      // 61: lxor
      // 62: invokedynamic t (IJ)Ljava/lang/String; bsm=qm3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: nop
      // 68: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6e: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 71: astore 6
      // 73: iload 3
      // 74: ifeq 90
      // 77: aload 6
      // 79: invokevirtual java/io/File.exists ()Z
      // 7c: ifne 8d
      // 7f: goto 86
      // 82: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: aload 6
      // 88: areturn
      // 89: invokestatic qm3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c: athrow
      // 8d: iinc 5 1
      // 90: goto 21
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4471016081729064342L, 3523196459642128449L, MethodHandles.lookup().lookupClass()).a(147152399255099L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 108165196619499L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "\u0000YÎh?\u0089úL.\b_Õ\u001b\u0004¶8E\u0097º%nWExK\u0014ñ\u0000¼Q,\u0081\u00103ö\u0087yóÍ½³<\u0003@9\"~\u0088S(Ëàî;¨¬r\u0086\u0095/%Á\u0001½zMÅRc³9Òí¯\u0093<ÂH\u0019ÌÞ\u007fàT\u0099\u0093282I\u0010û]^Ø%\u0001&â§\u008eéËÛØ»v(%\u0081é\bÁG¸\u0097\b°¨c¼få>\u0091\u0095gñ²\u0094¿èk{Ü\u008e\u000e~\u0098Në\u009b\u009bÈ\u0099\u008fJ*";
      int var6 = "\u0000YÎh?\u0089úL.\b_Õ\u001b\u0004¶8E\u0097º%nWExK\u0014ñ\u0000¼Q,\u0081\u00103ö\u0087yóÍ½³<\u0003@9\"~\u0088S(Ëàî;¨¬r\u0086\u0095/%Á\u0001½zMÅRc³9Òí¯\u0093<ÂH\u0019ÌÞ\u007fàT\u0099\u0093282I\u0010û]^Ø%\u0001&â§\u008eéËÛØ»v(%\u0081é\bÁG¸\u0097\b°¨c¼få>\u0091\u0095gñ²\u0094¿èk{Ü\u008e\u000e~\u0098Në\u009b\u009bÈ\u0099\u008fJ*"
         .length();
      char var3 = ' ';
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
                     c = new String[7];
                     a25 = LogManager.getLogger();
                     qjt = new SimpleDateFormat(a<"t">(15836, 966700271878256290L ^ var9));
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

                  var4 = "\u0010!=¯²Çx@W\u0015\u009fd¡Ú\u0080Á7j»w\u008e\u0086ûÚ\u0080¥$[¦Ì8å\u0012\u001e\u0095\nK\u009fß\u0082\u0085®¯\u00adöî`¢(°m5üà!\u0011g¼é\u0011\u0019úB\u0010p*\u0007-Æ[ÁÍ &J\u008cª\fr\u0089 ÖX]3\u0099 ¥î";
                  var6 = "\u0010!=¯²Çx@W\u0015\u009fd¡Ú\u0080Á7j»w\u008e\u0086ûÚ\u0080¥$[¦Ì8å\u0012\u001e\u0095\nK\u009fß\u0082\u0085®¯\u00adöî`¢(°m5üà!\u0011g¼é\u0011\u0019úB\u0010p*\u0007-Æ[ÁÍ &J\u008cª\fr\u0089 ÖX]3\u0099 ¥î"
                     .length();
                  var3 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24384;
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
            throw new RuntimeException("qm3", var10);
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
         throw new RuntimeException("qm3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
