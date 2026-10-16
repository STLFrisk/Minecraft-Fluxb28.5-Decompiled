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

public class v6ma {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static native void Ex(int var0);

   public static void UI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v6ma.a J
      // 003: ldc2_w 19143232149156
      // 006: lxor
      // 007: lstore 0
      // 008: sipush 31138
      // 00b: ldc2_w 1930234720292980419
      // 00e: lload 0
      // 00f: lxor
      // 010: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 015: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 018: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 01b: sipush 2195
      // 01e: ldc2_w 7568013691935569917
      // 021: lload 0
      // 022: lxor
      // 023: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 02b: istore 2
      // 02c: sipush 28622
      // 02f: ldc2_w 4336842935325085863
      // 032: lload 0
      // 033: lxor
      // 034: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 03c: sipush 6533
      // 03f: ldc2_w 3950470254000383727
      // 042: lload 0
      // 043: lxor
      // 044: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 04c: istore 3
      // 04d: iload 3
      // 04e: ifeq 059
      // 051: bipush 0
      // 052: goto 05a
      // 055: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: bipush 1
      // 05a: ifeq 0ba
      // 05d: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 060: sipush 13114
      // 063: ldc2_w 7383714080538561630
      // 066: lload 0
      // 067: lxor
      // 068: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 070: invokestatic java/awt/GraphicsEnvironment.isHeadless ()Z
      // 073: ifeq 085
      // 076: goto 07d
      // 079: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: bipush 0
      // 07e: goto 086
      // 081: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: bipush 1
      // 086: ifeq 0af
      // 089: aconst_null
      // 08a: sipush 17788
      // 08d: ldc2_w 3494948629434923547
      // 090: lload 0
      // 091: lxor
      // 092: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: sipush 18992
      // 09a: ldc2_w 7764243642496644444
      // 09d: lload 0
      // 09e: lxor
      // 09f: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: bipush 0
      // 0a5: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
      // 0a8: goto 0b5
      // 0ab: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: ldc2_w 5000
      // 0b2: invokestatic java/lang/Thread.sleep (J)V
      // 0b5: bipush 1
      // 0b6: invokestatic java/lang/System.exit (I)V
      // 0b9: return
      // 0ba: iload 2
      // 0bb: ifeq 0c6
      // 0be: bipush 0
      // 0bf: goto 0c7
      // 0c2: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: bipush 1
      // 0c7: ifeq 127
      // 0ca: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0cd: sipush 22123
      // 0d0: ldc2_w 4744180070632253696
      // 0d3: lload 0
      // 0d4: lxor
      // 0d5: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0dd: invokestatic java/awt/GraphicsEnvironment.isHeadless ()Z
      // 0e0: ifeq 0f2
      // 0e3: goto 0ea
      // 0e6: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: bipush 0
      // 0eb: goto 0f3
      // 0ee: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: bipush 1
      // 0f3: ifeq 11c
      // 0f6: aconst_null
      // 0f7: sipush 32304
      // 0fa: ldc2_w 382473270015279442
      // 0fd: lload 0
      // 0fe: lxor
      // 0ff: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: sipush 26012
      // 107: ldc2_w 833515824014744305
      // 10a: lload 0
      // 10b: lxor
      // 10c: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: bipush 0
      // 112: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
      // 115: goto 122
      // 118: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: ldc2_w 5000
      // 11f: invokestatic java/lang/Thread.sleep (J)V
      // 122: bipush 1
      // 123: invokestatic java/lang/System.exit (I)V
      // 126: return
      // 127: aconst_null
      // 128: bipush 0
      // 129: anewarray 70
      // 12c: invokestatic java/nio/file/Files.createTempDirectory (Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 12f: astore 4
      // 131: aload 4
      // 133: iload 2
      // 134: ifeq 13f
      // 137: bipush 0
      // 138: goto 140
      // 13b: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: bipush 1
      // 140: ifeq 18a
      // 143: new java/lang/StringBuilder
      // 146: dup
      // 147: invokespecial java/lang/StringBuilder.<init> ()V
      // 14a: new java/lang/StringBuilder
      // 14d: dup
      // 14e: invokespecial java/lang/StringBuilder.<init> ()V
      // 151: sipush 15008
      // 154: ldc2_w 3606054033800267215
      // 157: lload 0
      // 158: lxor
      // 159: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 164: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 167: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: sipush 32282
      // 173: ldc2_w 8673681989586207103
      // 176: lload 0
      // 177: lxor
      // 178: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 183: goto 1ad
      // 186: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 189: athrow
      // 18a: new java/lang/StringBuilder
      // 18d: dup
      // 18e: invokespecial java/lang/StringBuilder.<init> ()V
      // 191: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 194: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19a: sipush 15855
      // 19d: ldc2_w 2256337343128502927
      // 1a0: lload 0
      // 1a1: lxor
      // 1a2: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ad: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 1b2: invokeinterface java/nio/file/Path.toFile ()Ljava/io/File; 1
      // 1b7: astore 5
      // 1b9: aconst_null
      // 1ba: astore 6
      // 1bc: aconst_null
      // 1bd: astore 7
      // 1bf: iload 3
      // 1c0: ifeq 1da
      // 1c3: ldc v6ma
      // 1c5: sipush 25368
      // 1c8: ldc2_w 6910978707853859963
      // 1cb: lload 0
      // 1cc: lxor
      // 1cd: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 1d5: astore 6
      // 1d7: goto 1ee
      // 1da: ldc v6ma
      // 1dc: sipush 10016
      // 1df: ldc2_w 3910985791470508104
      // 1e2: lload 0
      // 1e3: lxor
      // 1e4: invokedynamic r (IJ)Ljava/lang/String; bsm=v6ma.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 1ec: astore 6
      // 1ee: new java/io/FileOutputStream
      // 1f1: dup
      // 1f2: aload 5
      // 1f4: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 1f7: astore 7
      // 1f9: sipush 4096
      // 1fc: newarray 8
      // 1fe: astore 8
      // 200: bipush 0
      // 201: istore 9
      // 203: goto 210
      // 206: aload 7
      // 208: aload 8
      // 20a: bipush 0
      // 20b: iload 9
      // 20d: invokevirtual java/io/FileOutputStream.write ([BII)V
      // 210: aload 6
      // 212: aload 8
      // 214: invokevirtual java/io/InputStream.read ([B)I
      // 217: istore 9
      // 219: iload 9
      // 21b: bipush 0
      // 21c: if_icmpgt 206
      // 21f: aload 5
      // 221: invokevirtual java/io/File.deleteOnExit ()V
      // 224: aload 4
      // 226: invokeinterface java/nio/file/Path.toFile ()Ljava/io/File; 1
      // 22b: invokevirtual java/io/File.deleteOnExit ()V
      // 22e: goto 25e
      // 231: invokestatic v6ma.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 234: athrow
      // 235: astore 8
      // 237: aload 6
      // 239: ifnull 249
      // 23c: aload 6
      // 23e: invokevirtual java/io/InputStream.close ()V
      // 241: goto 249
      // 244: astore 9
      // 246: goto 249
      // 249: aload 7
      // 24b: ifnull 25b
      // 24e: aload 7
      // 250: invokevirtual java/io/FileOutputStream.close ()V
      // 253: goto 25b
      // 256: astore 9
      // 258: goto 25b
      // 25b: aload 8
      // 25d: athrow
      // 25e: aload 6
      // 260: ifnull 270
      // 263: aload 6
      // 265: invokevirtual java/io/InputStream.close ()V
      // 268: goto 270
      // 26b: astore 10
      // 26d: goto 270
      // 270: aload 7
      // 272: ifnull 282
      // 275: aload 7
      // 277: invokevirtual java/io/FileOutputStream.close ()V
      // 27a: goto 282
      // 27d: astore 10
      // 27f: goto 282
      // 282: aload 5
      // 284: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 287: invokestatic java/lang/System.load (Ljava/lang/String;)V
      // 28a: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8812786817975250847L, 1369156408446255077L, MethodHandles.lookup().lookupClass()).a(181504560320486L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 79098154638937L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[15];
      int var7 = 0;
      String var6 = "ËMôa»booGÝì:üB\u000eL(<Õ6ä'\u0007¹\u0090»¥i\u008d6B\u000fiT\u008aáû\u0000\u009e¦¡°@ëÿö\u0006FÂ6Ù\u00937\u000b\u0081\u001f9hùr\u007fz¢Òíw²\b¸\"üpÖÒÉÊß^\u0093¤Ý±Gép\u0094Qí-\u0018=âûTS¶x\u0089¹í\\ô\u0002¢M·Õn¼}ÂL=ñØÑ\u0099FÉ\u0097\u008bñµ\u0090¥\u001fÞN´»T\u001bÿ®k,÷Ü\u0007Ro@îUÎ\u0004\u0085^\u009c\u009c2\u001a\"\u000e>öA\u009dºÍç\u001c\u00105Ò\u0015Î$\u009cv\u0089Ý\rJA\u0096\u0080Â\u0005\u0010\u0015¸~\u00adÇjJñL\u0090e\u009bp\u0006A\u0088\u0010hÛy\u0004Ü\u0015ìöÉÛg«6\u001e\u009b\f\u0010Y\u008d Ðøp\u00adü¤?\u0005\u0015s\u0080Ø>\u00106Ù¯6\u008ePÅ\u008b¦\u0099\u0085¹f·-D\u0010LæA2E©\u0097#|y\u008d¸^y\t?\u0010\u0081Ç\u0096ä\u0013F5ÛU\u0092*:kÕ\u0082í \u0013¨ÎËðbð\u009c¹9T¾.\u0004Ö\u0003¡FW (BW\u008b\u009a\u0084\u0014\u008ct\u0013Kßh\tÈØÕ«:±quäØíàK\u0012\u000f<h¹DOxØ\u0092<Ï\u0094l1ÿmèÞ\r¸ï\rÀ¼\u0004ã?õ1\u0010\u0011ßÚîÓ\u001b<ÊÎ\u0011A»ÊâuÛo\u0011\u0007\u0098ø¸\u0014¿LÐ\u008f\u0091à\u009a/\u001a-i'KÊ\u0007j\u009e(Â\u001eÔþ\bâÇõ6É\u0004_®¬¿\u0006\u0091Þ\u0010»\u0011·®\u0092\r~=r7¡M\u009c\u0099m±";
      int var8 = "ËMôa»booGÝì:üB\u000eL(<Õ6ä'\u0007¹\u0090»¥i\u008d6B\u000fiT\u008aáû\u0000\u009e¦¡°@ëÿö\u0006FÂ6Ù\u00937\u000b\u0081\u001f9hùr\u007fz¢Òíw²\b¸\"üpÖÒÉÊß^\u0093¤Ý±Gép\u0094Qí-\u0018=âûTS¶x\u0089¹í\\ô\u0002¢M·Õn¼}ÂL=ñØÑ\u0099FÉ\u0097\u008bñµ\u0090¥\u001fÞN´»T\u001bÿ®k,÷Ü\u0007Ro@îUÎ\u0004\u0085^\u009c\u009c2\u001a\"\u000e>öA\u009dºÍç\u001c\u00105Ò\u0015Î$\u009cv\u0089Ý\rJA\u0096\u0080Â\u0005\u0010\u0015¸~\u00adÇjJñL\u0090e\u009bp\u0006A\u0088\u0010hÛy\u0004Ü\u0015ìöÉÛg«6\u001e\u009b\f\u0010Y\u008d Ðøp\u00adü¤?\u0005\u0015s\u0080Ø>\u00106Ù¯6\u008ePÅ\u008b¦\u0099\u0085¹f·-D\u0010LæA2E©\u0097#|y\u008d¸^y\t?\u0010\u0081Ç\u0096ä\u0013F5ÛU\u0092*:kÕ\u0082í \u0013¨ÎËðbð\u009c¹9T¾.\u0004Ö\u0003¡FW (BW\u008b\u009a\u0084\u0014\u008ct\u0013Kßh\tÈØÕ«:±quäØíàK\u0012\u000f<h¹DOxØ\u0092<Ï\u0094l1ÿmèÞ\r¸ï\rÀ¼\u0004ã?õ1\u0010\u0011ßÚîÓ\u001b<ÊÎ\u0011A»ÊâuÛo\u0011\u0007\u0098ø¸\u0014¿LÐ\u008f\u0091à\u009a/\u001a-i'KÊ\u0007j\u009e(Â\u001eÔþ\bâÇõ6É\u0004_®¬¿\u0006\u0091Þ\u0010»\u0011·®\u0092\r~=r7¡M\u009c\u0099m±"
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
                     c = new String[15];
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

                  var6 = "õn\u009e\u0012\u0010¤é±Q\u001f\u0003+\u0085?\u009d!\u0012\u0089xIõo¤äIÈ×\u0016±±Þ]áÒa\u0016e\\\u009cJ)bÏ´\u0096H´Û\u0091I\u0096GZØ\u009d~8e\u001fà\u0019F\u0019\u001d\u0013s¿þ\u0002\u009eí\u0014\u0001lym\u0081Õ¦M\u001b\"\u0081Çé3/ãËÃc\u0097\u0093\n1\u0005\u001e\u0099Ùm{íÒYã>ø2X¿é\u0017^";
                  var8 = "õn\u009e\u0012\u0010¤é±Q\u001f\u0003+\u0085?\u009d!\u0012\u0089xIõo¤äIÈ×\u0016±±Þ]áÒa\u0016e\\\u009cJ)bÏ´\u0096H´Û\u0091I\u0096GZØ\u009d~8e\u001fà\u0019F\u0019\u001d\u0013s¿þ\u0002\u009eí\u0014\u0001lym\u0081Õ¦M\u001b\"\u0081Çé3/ãËÃc\u0097\u0093\n1\u0005\u001e\u0099Ùm{íÒYã>ø2X¿é\u0017^"
                     .length();
                  var5 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19692;
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
            throw new RuntimeException("v6ma", var10);
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
         throw new RuntimeException("v6ma" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
