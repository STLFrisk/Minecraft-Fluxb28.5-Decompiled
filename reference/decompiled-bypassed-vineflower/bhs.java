import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bhs extends xfj {
   private static final Logger u9t;
   private static final AtomicInteger txl;
   private final File h2_;
   private final String go9;
   private final ji7 i25;
   private BufferedImage a9h;
   private Thread y_9;
   private boolean v_6;
   public Boolean shl = null;
   public boolean sfs = false;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public bhs(File var1, String var2, gdz var3, ji7 var4) {
      super(var3);
      this.h2_ = var1;
      this.go9 = var2;
      this.i25 = var4;
   }

   private void c4q() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1e
      // 09: getfield bhs.v_6 Z
      // 0c: ifne a0
      // 0f: goto 16
      // 12: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: iload 1
      // 1f: ifne 3c
      // 22: getfield bhs.a9h Ljava/awt/image/BufferedImage;
      // 25: ifnull a0
      // 28: goto 2f
      // 2b: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: bipush 1
      // 31: putfield bhs.v_6 Z
      // 34: aload 0
      // 35: goto 3c
      // 38: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: iload 1
      // 3d: ifne 55
      // 40: getfield bhs.h9l Lgdz;
      // 43: ifnull 58
      // 46: goto 4d
      // 49: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 0
      // 4e: goto 55
      // 51: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: invokevirtual bhs.wo5 ()V
      // 58: invokestatic hxt.ly3 ()Z
      // 5b: iload 1
      // 5c: ifne 9f
      // 5f: ifeq 8d
      // 62: goto 69
      // 65: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: aload 0
      // 6a: invokespecial xfj.getGlTextureId ()I
      // 6d: aload 0
      // 6e: getfield bhs.a9h Ljava/awt/image/BufferedImage;
      // 71: bipush 0
      // 72: bipush 0
      // 73: invokestatic hxt.q5m ()Ly99;
      // 76: aload 0
      // 77: getfield bhs.h9l Lgdz;
      // 7a: aload 0
      // 7b: invokevirtual bhs.getMultiTexID ()Lnet/optifine/shaders/MultiTexID;
      // 7e: invokestatic net/optifine/shaders/ShadersTex.loadSimpleTexture (ILjava/awt/image/BufferedImage;ZZLy99;Lgdz;Lnet/optifine/shaders/MultiTexID;)I
      // 81: pop
      // 82: iload 1
      // 83: ifeq a0
      // 86: goto 8d
      // 89: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c: athrow
      // 8d: aload 0
      // 8e: invokespecial xfj.getGlTextureId ()I
      // 91: aload 0
      // 92: getfield bhs.a9h Ljava/awt/image/BufferedImage;
      // 95: invokestatic p9t.xr5 (ILjava/awt/image/BufferedImage;)I
      // 98: goto 9f
      // 9b: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e: athrow
      // 9f: pop
      // a0: return
   }

   @Override
   public int getGlTextureId() {
      this.c4q();
      return super.getGlTextureId();
   }

   public void asj(BufferedImage param1) {
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
      // 05: aload 1
      // 06: putfield bhs.a9h Ljava/awt/image/BufferedImage;
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifeq 2c
      // 0e: getfield bhs.i25 Lji7;
      // 11: ifnull 2b
      // 14: goto 1b
      // 17: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield bhs.i25 Lji7;
      // 1f: invokeinterface ji7.skinAvailable ()V 1
      // 24: goto 2b
      // 27: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 0
      // 2d: getfield bhs.a9h Ljava/awt/image/BufferedImage;
      // 30: ifnull 3b
      // 33: bipush 1
      // 34: goto 3c
      // 37: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3f: putfield bhs.shl Ljava/lang/Boolean;
      // 42: return
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
      // 000: getstatic bhs.a J
      // 003: ldc2_w 8689458704783
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifne 047
      // 013: getfield bhs.a9h Ljava/awt/image/BufferedImage;
      // 016: ifnonnull 046
      // 019: goto 020
      // 01c: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01f: athrow
      // 020: aload 0
      // 021: iload 4
      // 023: ifne 047
      // 026: goto 02d
      // 029: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: getfield bhs.h9l Lgdz;
      // 030: ifnull 046
      // 033: goto 03a
      // 036: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: aload 0
      // 03b: aload 1
      // 03c: invokespecial xfj.loadTexture (Ly99;)V
      // 03f: goto 046
      // 042: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: aload 0
      // 047: iload 4
      // 049: ifne 061
      // 04c: getfield bhs.y_9 Ljava/lang/Thread;
      // 04f: ifnonnull 129
      // 052: goto 059
      // 055: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: aload 0
      // 05a: goto 061
      // 05d: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: iload 4
      // 063: ifne 126
      // 066: getfield bhs.h2_ Ljava/io/File;
      // 069: ifnull 11e
      // 06c: goto 073
      // 06f: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: aload 0
      // 074: iload 4
      // 076: ifne 126
      // 079: goto 080
      // 07c: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: getfield bhs.h2_ Ljava/io/File;
      // 083: invokevirtual java/io/File.isFile ()Z
      // 086: ifeq 11e
      // 089: goto 090
      // 08c: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: getstatic bhs.u9t Lorg/apache/logging/log4j/Logger;
      // 093: sipush 12553
      // 096: ldc2_w 6947985997053597522
      // 099: lload 2
      // 09a: lxor
      // 09b: invokedynamic l (IJ)Ljava/lang/String; bsm=bhs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: nop
      // 0a1: bipush 1
      // 0a2: anewarray 132
      // 0a5: dup
      // 0a6: bipush 0
      // 0a7: aload 0
      // 0a8: getfield bhs.h2_ Ljava/io/File;
      // 0ab: aastore
      // 0ac: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 0b1: aload 0
      // 0b2: aload 0
      // 0b3: getfield bhs.h2_ Ljava/io/File;
      // 0b6: invokestatic javax/imageio/ImageIO.read (Ljava/io/File;)Ljava/awt/image/BufferedImage;
      // 0b9: putfield bhs.a9h Ljava/awt/image/BufferedImage;
      // 0bc: aload 0
      // 0bd: iload 4
      // 0bf: ifne 0e1
      // 0c2: getfield bhs.i25 Lji7;
      // 0c5: ifnull 0e0
      // 0c8: aload 0
      // 0c9: aload 0
      // 0ca: getfield bhs.i25 Lji7;
      // 0cd: aload 0
      // 0ce: getfield bhs.a9h Ljava/awt/image/BufferedImage;
      // 0d1: invokeinterface ji7.parseUserSkin (Ljava/awt/image/BufferedImage;)Ljava/awt/image/BufferedImage; 2
      // 0d6: invokevirtual bhs.asj (Ljava/awt/image/BufferedImage;)V
      // 0d9: goto 0e0
      // 0dc: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: invokespecial bhs.c_e ()V
      // 0e4: goto 129
      // 0e7: astore 5
      // 0e9: getstatic bhs.u9t Lorg/apache/logging/log4j/Logger;
      // 0ec: new java/lang/StringBuilder
      // 0ef: dup
      // 0f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f3: sipush 5577
      // 0f6: ldc2_w 7719202272055505815
      // 0f9: lload 2
      // 0fa: lxor
      // 0fb: invokedynamic l (IJ)Ljava/lang/String; bsm=bhs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: nop
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104: aload 0
      // 105: getfield bhs.h2_ Ljava/io/File;
      // 108: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10e: aload 5
      // 110: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 115: aload 0
      // 116: invokevirtual bhs.ojr ()V
      // 119: iload 4
      // 11b: ifeq 129
      // 11e: aload 0
      // 11f: goto 126
      // 122: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: invokevirtual bhs.ojr ()V
      // 129: return
   }

   public void ojr() {
      long var1 = a ^ 131873025692549L;
      this.y_9 = new bhs$1(this, b<"l">(30040, 5859995636135014671L ^ var1) + txl.incrementAndGet());
      this.y_9.setDaemon(true);
      this.y_9.start();
   }

   private boolean orc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bhs.a J
      // 03: ldc2_w 139052624996226
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield bhs.sfs Z
      // 10: iload 3
      // 11: ifeq 1f
      // 14: ifne 20
      // 17: goto 1e
      // 1a: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic c05.vz1 ()Lc05;
      // 23: invokevirtual c05.snb ()Ljava/net/Proxy;
      // 26: astore 4
      // 28: aload 4
      // 2a: invokevirtual java/net/Proxy.type ()Ljava/net/Proxy$Type;
      // 2d: getstatic java/net/Proxy$Type.DIRECT Ljava/net/Proxy$Type;
      // 30: iload 3
      // 31: ifeq 4d
      // 34: if_acmpeq 58
      // 37: goto 3e
      // 3a: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 4
      // 40: invokevirtual java/net/Proxy.type ()Ljava/net/Proxy$Type;
      // 43: getstatic java/net/Proxy$Type.SOCKS Ljava/net/Proxy$Type;
      // 46: goto 4d
      // 49: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: if_acmpeq 58
      // 50: bipush 0
      // 51: goto 6d
      // 54: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: aload 0
      // 59: getfield bhs.go9 Ljava/lang/String;
      // 5c: sipush 2537
      // 5f: ldc2_w 106351090738969019
      // 62: lload 1
      // 63: lxor
      // 64: invokedynamic l (IJ)Ljava/lang/String; bsm=bhs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 6d: ireturn
   }

   private void r5l() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bhs.a J
      // 003: ldc2_w 137292387142124
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield bhs.go9 Ljava/lang/String;
      // 010: invokestatic c05.vz1 ()Lc05;
      // 013: invokevirtual c05.snb ()Ljava/net/Proxy;
      // 016: invokestatic net/optifine/http/HttpPipeline.makeRequest (Ljava/lang/String;Ljava/net/Proxy;)Lnet/optifine/http/HttpRequest;
      // 019: astore 4
      // 01b: aload 4
      // 01d: invokestatic net/optifine/http/HttpPipeline.executeRequest (Lnet/optifine/http/HttpRequest;)Lnet/optifine/http/HttpResponse;
      // 020: astore 5
      // 022: aload 5
      // 024: iload 3
      // 025: ifne 040
      // 028: invokevirtual net/optifine/http/HttpResponse.getStatus ()I
      // 02b: bipush 100
      // 02d: idiv
      // 02e: bipush 2
      // 02f: if_icmpeq 03e
      // 032: goto 039
      // 035: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: aload 0
      // 03a: invokespecial bhs.c_e ()V
      // 03d: return
      // 03e: aload 5
      // 040: invokevirtual net/optifine/http/HttpResponse.getBody ()[B
      // 043: astore 6
      // 045: new java/io/ByteArrayInputStream
      // 048: dup
      // 049: aload 6
      // 04b: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 04e: astore 7
      // 050: aload 0
      // 051: getfield bhs.h2_ Ljava/io/File;
      // 054: iload 3
      // 055: ifne 076
      // 058: ifnull 07f
      // 05b: goto 062
      // 05e: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: aload 7
      // 064: aload 0
      // 065: getfield bhs.h2_ Ljava/io/File;
      // 068: invokestatic org/apache/commons/io/FileUtils.copyInputStreamToFile (Ljava/io/InputStream;Ljava/io/File;)V
      // 06b: aload 0
      // 06c: getfield bhs.h2_ Ljava/io/File;
      // 06f: goto 076
      // 072: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: invokestatic javax/imageio/ImageIO.read (Ljava/io/File;)Ljava/awt/image/BufferedImage;
      // 079: astore 8
      // 07b: iload 3
      // 07c: ifeq 086
      // 07f: aload 7
      // 081: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 084: astore 8
      // 086: aload 0
      // 087: iload 3
      // 088: ifne 0ac
      // 08b: getfield bhs.i25 Lji7;
      // 08e: ifnull 0a5
      // 091: goto 098
      // 094: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: aload 0
      // 099: getfield bhs.i25 Lji7;
      // 09c: aload 8
      // 09e: invokeinterface ji7.parseUserSkin (Ljava/awt/image/BufferedImage;)Ljava/awt/image/BufferedImage; 2
      // 0a3: astore 8
      // 0a5: aload 0
      // 0a6: aload 8
      // 0a8: invokevirtual bhs.asj (Ljava/awt/image/BufferedImage;)V
      // 0ab: aload 0
      // 0ac: invokespecial bhs.c_e ()V
      // 0af: goto 109
      // 0b2: astore 4
      // 0b4: getstatic bhs.u9t Lorg/apache/logging/log4j/Logger;
      // 0b7: new java/lang/StringBuilder
      // 0ba: dup
      // 0bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0be: sipush 13161
      // 0c1: ldc2_w 3684998704404835664
      // 0c4: lload 1
      // 0c5: lxor
      // 0c6: invokedynamic l (IJ)Ljava/lang/String; bsm=bhs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: nop
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: aload 4
      // 0d1: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0d4: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 0d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0da: sipush 23126
      // 0dd: ldc2_w 4225921982569923689
      // 0e0: lload 1
      // 0e1: lxor
      // 0e2: invokedynamic l (IJ)Ljava/lang/String; bsm=bhs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: nop
      // 0e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0eb: aload 4
      // 0ed: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 0f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f6: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 0fb: aload 0
      // 0fc: invokespecial bhs.c_e ()V
      // 0ff: return
      // 100: astore 9
      // 102: aload 0
      // 103: invokespecial bhs.c_e ()V
      // 106: aload 9
      // 108: athrow
      // 109: return
   }

   private void c_e() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: aload 0
      // 06: getfield bhs.a9h Ljava/awt/image/BufferedImage;
      // 09: ifnull 14
      // 0c: bipush 1
      // 0d: goto 15
      // 10: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13: athrow
      // 14: bipush 0
      // 15: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 18: putfield bhs.shl Ljava/lang/Boolean;
      // 1b: aload 0
      // 1c: getfield bhs.i25 Lji7;
      // 1f: iload 1
      // 20: ifeq 3b
      // 23: instanceof net/optifine/player/CapeImageBuffer
      // 26: ifeq 43
      // 29: goto 30
      // 2c: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield bhs.i25 Lji7;
      // 34: goto 3b
      // 37: invokestatic bhs.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: checkcast net/optifine/player/CapeImageBuffer
      // 3e: astore 2
      // 3f: aload 2
      // 40: invokevirtual net/optifine/player/CapeImageBuffer.cleanup ()V
      // 43: return
   }

   public ji7 hi6() {
      return this.i25;
   }

   public static String cfu(bhs var0) {
      return var0.go9;
   }

   public static File bvz(bhs var0) {
      return var0.h2_;
   }

   public static Logger beq() {
      return u9t;
   }

   public static boolean w3b(bhs var0) {
      return var0.orc();
   }

   public static void qi7(bhs var0) {
      var0.r5l();
   }

   public static ji7 ef_(bhs var0) {
      return var0.i25;
   }

   public static void snf(bhs var0) {
      var0.c_e();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3912961265673666428L, -8390100536238309226L, MethodHandles.lookup().lookupClass()).a(15926184614955L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 14986452723501L;
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
      String var6 = ",^7¼ÙOh\f\u001c\u0012ú\u0091Î0®år\t\u009ahË%êª\u0017Û\\\u0096\u0011õÇ-\fßãò\n\u0015Z&\u0010u?ÝÉÃ\u0096\u0005\u0085\u00ad\u009aÉíïY*\u0090\u0010k#à+Pµ\u008d a\r©Ê\u008cç\u001b¦(Q\u009e\u008a\u0003ó6S\u0015jËI\u0014¨(\u0087°&-ôÊ\n\u008a<D \u0086\u000eM\u009d\u0084\u00addL\u001cIs\u0080Â$3";
      int var8 = ",^7¼ÙOh\f\u001c\u0012ú\u0091Î0®år\t\u009ahË%êª\u0017Û\\\u0096\u0011õÇ-\fßãò\n\u0015Z&\u0010u?ÝÉÃ\u0096\u0005\u0085\u00ad\u009aÉíïY*\u0090\u0010k#à+Pµ\u008d a\r©Ê\u008cç\u001b¦(Q\u009e\u008a\u0003ó6S\u0015jËI\u0014¨(\u0087°&-ôÊ\n\u008a<D \u0086\u000eM\u009d\u0084\u00addL\u001cIs\u0080Â$3"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     f = var9;
                     g = new String[6];
                     u9t = LogManager.getLogger();
                     txl = new AtomicInteger(0);
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

                  var6 = "\u0084\u0011\u0091\u008eÒ\u008f\b\u008cr·§Ûâe8\u0003\u0093\u0015\u0082\u0095j¨\u0084\u0014a\u009a\u0096!F}kF¶Êü\u000e%¦\tkz=jñtºð\u009bC@Ì\"ôKâ|ü<û\u0017¾\u0092\u007f½Pøl\u0017\u0086²\u0083#\u001dÓÒ1óR\n§\u000eg\u009b\u000e<à\\½,2\u008fª¥q\u001eAd\u0092RJ^\u0016M\u0099-¼ÞêxÕ>\u0011»\"»¼s7Þ³´$¶\u008d\"\u0093ÿ\u001dù\"®ÏåÄ\u0012m\u000fTõ¹¯ì\nðN";
                  var8 = "\u0084\u0011\u0091\u008eÒ\u008f\b\u008cr·§Ûâe8\u0003\u0093\u0015\u0082\u0095j¨\u0084\u0014a\u009a\u0096!F}kF¶Êü\u000e%¦\tkz=jñtºð\u009bC@Ì\"ôKâ|ü<û\u0017¾\u0092\u007f½Pøl\u0017\u0086²\u0083#\u001dÓÒ1óR\n§\u000eg\u009b\u000e<à\\½,2\u008fª¥q\u001eAd\u0092RJ^\u0016M\u0099-¼ÞêxÕ>\u0011»\"»¼s7Þ³´$¶\u008d\"\u0093ÿ\u001dù\"®ÏåÄ\u0012m\u000fTõ¹¯ì\nðN"
                     .length();
                  var5 = '@';
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

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9294;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("bhs", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("bhs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
