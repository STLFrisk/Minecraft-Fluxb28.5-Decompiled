import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;

public class ia_ extends xe9 {
   private static final long a;
   private static final String b;

   public ia_(gdz var1, List var2, List var3) {
      this.tq_ = var1;
      this.akj = var2;
      this.xoo = var3;
   }

   @Override
   public void loadTexture(y99 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ia_.a J
      // 003: ldc2_w 114866328062022
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: invokevirtual ia_.wo5 ()V
      // 011: aload 1
      // 012: aload 0
      // 013: getfield ia_.tq_ Lgdz;
      // 016: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 01b: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 020: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 023: astore 6
      // 025: aload 6
      // 027: invokevirtual java/awt/image/BufferedImage.getType ()I
      // 02a: istore 7
      // 02c: iload 7
      // 02e: iload 4
      // 030: ifne 03f
      // 033: ifne 041
      // 036: goto 03d
      // 039: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 03c: athrow
      // 03d: bipush 6
      // 03f: istore 7
      // 041: new java/awt/image/BufferedImage
      // 044: dup
      // 045: aload 6
      // 047: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 04a: aload 6
      // 04c: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 04f: iload 7
      // 051: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 054: astore 5
      // 056: aload 5
      // 058: invokevirtual java/awt/image/BufferedImage.getGraphics ()Ljava/awt/Graphics;
      // 05b: astore 8
      // 05d: aload 8
      // 05f: aload 6
      // 061: bipush 0
      // 062: bipush 0
      // 063: aconst_null
      // 064: checkcast java/awt/image/ImageObserver
      // 067: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 06a: pop
      // 06b: bipush 0
      // 06c: istore 9
      // 06e: iload 9
      // 070: bipush 17
      // 072: if_icmpge 1fc
      // 075: iload 9
      // 077: iload 4
      // 079: ifne 213
      // 07c: aload 0
      // 07d: getfield ia_.akj Ljava/util/List;
      // 080: invokeinterface java/util/List.size ()I 1
      // 085: iload 4
      // 087: ifne 0ad
      // 08a: goto 091
      // 08d: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 090: athrow
      // 091: if_icmpge 1fc
      // 094: goto 09b
      // 097: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09a: athrow
      // 09b: iload 9
      // 09d: aload 0
      // 09e: getfield ia_.xoo Ljava/util/List;
      // 0a1: invokeinterface java/util/List.size ()I 1
      // 0a6: goto 0ad
      // 0a9: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ac: athrow
      // 0ad: if_icmpge 1fc
      // 0b0: aload 0
      // 0b1: getfield ia_.akj Ljava/util/List;
      // 0b4: iload 9
      // 0b6: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0bb: checkcast java/lang/String
      // 0be: astore 10
      // 0c0: aload 0
      // 0c1: getfield ia_.xoo Ljava/util/List;
      // 0c4: iload 9
      // 0c6: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0cb: checkcast qvg
      // 0ce: invokevirtual qvg.f0q ()L_mi;
      // 0d1: astore 11
      // 0d3: iload 4
      // 0d5: ifne 1f7
      // 0d8: aload 10
      // 0da: ifnull 1f4
      // 0dd: goto 0e4
      // 0e0: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e3: athrow
      // 0e4: aload 1
      // 0e5: new gdz
      // 0e8: dup
      // 0e9: aload 10
      // 0eb: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 0ee: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 0f3: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 0f8: astore 12
      // 0fa: aload 12
      // 0fc: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 0ff: astore 13
      // 101: iload 4
      // 103: ifne 1f7
      // 106: aload 13
      // 108: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 10b: aload 5
      // 10d: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 110: if_icmpne 1f4
      // 113: goto 11a
      // 116: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 119: athrow
      // 11a: aload 13
      // 11c: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 11f: aload 5
      // 121: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 124: iload 4
      // 126: ifne 154
      // 129: goto 130
      // 12c: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 12f: athrow
      // 130: if_icmpne 1f4
      // 133: goto 13a
      // 136: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 139: athrow
      // 13a: aload 13
      // 13c: invokevirtual java/awt/image/BufferedImage.getType ()I
      // 13f: iload 4
      // 141: ifne 158
      // 144: goto 14b
      // 147: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 14a: athrow
      // 14b: bipush 6
      // 14d: goto 154
      // 150: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 153: athrow
      // 154: if_icmpne 1f4
      // 157: bipush 0
      // 158: istore 14
      // 15a: iload 14
      // 15c: aload 13
      // 15e: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 161: if_icmpge 1e3
      // 164: bipush 0
      // 165: iload 4
      // 167: ifne 1f3
      // 16a: istore 15
      // 16c: iload 15
      // 16e: aload 13
      // 170: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 173: if_icmpge 1db
      // 176: aload 13
      // 178: iload 15
      // 17a: iload 14
      // 17c: invokevirtual java/awt/image/BufferedImage.getRGB (II)I
      // 17f: istore 16
      // 181: iload 4
      // 183: ifne 1d6
      // 186: iload 16
      // 188: ldc -16777216
      // 18a: nop
      // 18b: iand
      // 18c: iload 4
      // 18e: ifne 15c
      // 191: goto 198
      // 194: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 197: athrow
      // 198: ifeq 1d3
      // 19b: iload 16
      // 19d: ldc 16711680
      // 19f: nop
      // 1a0: iand
      // 1a1: bipush 8
      // 1a3: ishl
      // 1a4: ldc -16777216
      // 1a6: nop
      // 1a7: iand
      // 1a8: istore 17
      // 1aa: aload 6
      // 1ac: iload 15
      // 1ae: iload 14
      // 1b0: invokevirtual java/awt/image/BufferedImage.getRGB (II)I
      // 1b3: istore 18
      // 1b5: iload 18
      // 1b7: aload 11
      // 1b9: getfield _mi.eon I
      // 1bc: invokestatic fe6.rsi (II)I
      // 1bf: ldc 16777215
      // 1c1: nop
      // 1c2: iand
      // 1c3: istore 19
      // 1c5: aload 13
      // 1c7: iload 15
      // 1c9: iload 14
      // 1cb: iload 17
      // 1cd: iload 19
      // 1cf: ior
      // 1d0: invokevirtual java/awt/image/BufferedImage.setRGB (III)V
      // 1d3: iinc 15 1
      // 1d6: iload 4
      // 1d8: ifeq 16c
      // 1db: iinc 14 1
      // 1de: iload 4
      // 1e0: ifeq 15a
      // 1e3: aload 5
      // 1e5: invokevirtual java/awt/image/BufferedImage.getGraphics ()Ljava/awt/Graphics;
      // 1e8: aload 13
      // 1ea: bipush 0
      // 1eb: bipush 0
      // 1ec: aconst_null
      // 1ed: checkcast java/awt/image/ImageObserver
      // 1f0: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 1f3: pop
      // 1f4: iinc 9 1
      // 1f7: iload 4
      // 1f9: ifeq 06e
      // 1fc: goto 210
      // 1ff: astore 6
      // 201: getstatic ia_.wmq Lorg/apache/logging/log4j/Logger;
      // 204: getstatic ia_.b Ljava/lang/String;
      // 207: nop
      // 208: aload 6
      // 20a: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 20f: return
      // 210: invokestatic hxt.ly3 ()Z
      // 213: iload 4
      // 215: ifne 253
      // 218: ifeq 243
      // 21b: goto 222
      // 21e: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 221: athrow
      // 222: aload 0
      // 223: invokevirtual ia_.getGlTextureId ()I
      // 226: aload 5
      // 228: bipush 0
      // 229: bipush 0
      // 22a: aload 1
      // 22b: aload 0
      // 22c: getfield ia_.tq_ Lgdz;
      // 22f: aload 0
      // 230: invokevirtual ia_.getMultiTexID ()Lnet/optifine/shaders/MultiTexID;
      // 233: invokestatic net/optifine/shaders/ShadersTex.loadSimpleTexture (ILjava/awt/image/BufferedImage;ZZLy99;Lgdz;Lnet/optifine/shaders/MultiTexID;)I
      // 236: pop
      // 237: iload 4
      // 239: ifeq 254
      // 23c: goto 243
      // 23f: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 242: athrow
      // 243: aload 0
      // 244: invokevirtual ia_.getGlTextureId ()I
      // 247: aload 5
      // 249: invokestatic p9t.xr5 (ILjava/awt/image/BufferedImage;)I
      // 24c: goto 253
      // 24f: invokestatic ia_.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 252: athrow
      // 253: pop
      // 254: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5506602776187913744L, -2669424022789726470L, MethodHandles.lookup().lookupClass()).a(223256833319204L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 91515492106341L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ò5?\u0004~¾»Söüã¹\u0083!\bØúUÑ>·äë\\Wgdã¡\u0090%?".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      wmq = LogManager.getLogger();
   }

   private static IOException a(IOException var0) {
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
}
