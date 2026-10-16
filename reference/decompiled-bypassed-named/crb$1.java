import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class crb$1 implements Runnable {
   public final sw6 a91;
   public final String _qg;
   public final Proxy mt6;
   public final Map q75;
   public final File nvk;
   public final int qw_;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public crb$1(sw6 var1, String var2, Proxy var3, Map var4, File var5, int var6) {
      this.a91 = var1;
      this._qg = var2;
      this.mt6 = var3;
      this.q75 = var4;
      this.nvk = var5;
      this.qw_ = var6;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic crb$1.a J
      // 003: ldc2_w 131812435448109
      // 006: lxor
      // 007: lstore 1
      // 008: aconst_null
      // 009: astore 4
      // 00b: invokestatic OpaquePredicate.c ()I
      // 00e: aconst_null
      // 00f: astore 5
      // 011: istore 3
      // 012: aconst_null
      // 013: astore 6
      // 015: aload 0
      // 016: getfield crb$1.a91 Lsw6;
      // 019: iload 3
      // 01a: ifne 049
      // 01d: ifnull 05c
      // 020: goto 027
      // 023: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: aload 0
      // 028: getfield crb$1.a91 Lsw6;
      // 02b: sipush 21295
      // 02e: ldc2_w 4898990506382026264
      // 031: lload 1
      // 032: lxor
      // 033: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: nop
      // 039: invokeinterface sw6.qph (Ljava/lang/String;)V 2
      // 03e: aload 0
      // 03f: getfield crb$1.a91 Lsw6;
      // 042: goto 049
      // 045: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: sipush 20598
      // 04c: ldc2_w 978651730093565260
      // 04f: lload 1
      // 050: lxor
      // 051: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: nop
      // 057: invokeinterface sw6.an6 (Ljava/lang/String;)V 2
      // 05c: sipush 4096
      // 05f: newarray 8
      // 061: astore 7
      // 063: new java/net/URL
      // 066: dup
      // 067: aload 0
      // 068: getfield crb$1._qg Ljava/lang/String;
      // 06b: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 06e: astore 8
      // 070: aload 8
      // 072: aload 0
      // 073: getfield crb$1.mt6 Ljava/net/Proxy;
      // 076: invokevirtual java/net/URL.openConnection (Ljava/net/Proxy;)Ljava/net/URLConnection;
      // 079: checkcast java/net/HttpURLConnection
      // 07c: astore 4
      // 07e: fconst_0
      // 07f: fstore 9
      // 081: aload 0
      // 082: getfield crb$1.q75 Ljava/util/Map;
      // 085: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 08a: invokeinterface java/util/Set.size ()I 1
      // 08f: i2f
      // 090: fstore 10
      // 092: aload 0
      // 093: getfield crb$1.q75 Ljava/util/Map;
      // 096: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 09b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0a0: astore 11
      // 0a2: aload 11
      // 0a4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a9: ifeq 111
      // 0ac: aload 11
      // 0ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b3: checkcast java/util/Map$Entry
      // 0b6: astore 12
      // 0b8: aload 4
      // 0ba: iload 3
      // 0bb: ifne 113
      // 0be: aload 12
      // 0c0: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0c5: checkcast java/lang/String
      // 0c8: aload 12
      // 0ca: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0cf: checkcast java/lang/String
      // 0d2: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0d5: aload 0
      // 0d6: getfield crb$1.a91 Lsw6;
      // 0d9: iload 3
      // 0da: ifne 0f9
      // 0dd: goto 0e4
      // 0e0: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: ifnull 10d
      // 0e7: goto 0ee
      // 0ea: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: getfield crb$1.a91 Lsw6;
      // 0f2: goto 0f9
      // 0f5: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: fload 9
      // 0fb: fconst_1
      // 0fc: fadd
      // 0fd: dup
      // 0fe: fstore 9
      // 100: fload 10
      // 102: fdiv
      // 103: ldc 100.0
      // 105: nop
      // 106: fmul
      // 107: f2i
      // 108: invokeinterface sw6.e2w (I)V 2
      // 10d: iload 3
      // 10e: ifeq 0a2
      // 111: aload 4
      // 113: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 116: astore 5
      // 118: aload 4
      // 11a: invokevirtual java/net/HttpURLConnection.getContentLength ()I
      // 11d: i2f
      // 11e: fstore 10
      // 120: aload 4
      // 122: invokevirtual java/net/HttpURLConnection.getContentLength ()I
      // 125: istore 11
      // 127: aload 0
      // 128: iload 3
      // 129: ifne 16f
      // 12c: getfield crb$1.a91 Lsw6;
      // 12f: ifnull 16e
      // 132: goto 139
      // 135: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 138: athrow
      // 139: aload 0
      // 13a: getfield crb$1.a91 Lsw6;
      // 13d: sipush 25633
      // 140: ldc2_w 1953439591294718232
      // 143: lload 1
      // 144: lxor
      // 145: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: nop
      // 14b: bipush 1
      // 14c: anewarray 17
      // 14f: dup
      // 150: bipush 0
      // 151: fload 10
      // 153: ldc 1000.0
      // 155: nop
      // 156: fdiv
      // 157: ldc 1000.0
      // 159: nop
      // 15a: fdiv
      // 15b: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 15e: aastore
      // 15f: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 162: invokeinterface sw6.an6 (Ljava/lang/String;)V 2
      // 167: goto 16e
      // 16a: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16d: athrow
      // 16e: aload 0
      // 16f: getfield crb$1.nvk Ljava/io/File;
      // 172: iload 3
      // 173: ifne 255
      // 176: invokevirtual java/io/File.exists ()Z
      // 179: ifeq 247
      // 17c: goto 183
      // 17f: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 182: athrow
      // 183: aload 0
      // 184: getfield crb$1.nvk Ljava/io/File;
      // 187: invokevirtual java/io/File.length ()J
      // 18a: lstore 12
      // 18c: lload 12
      // 18e: iload 11
      // 190: i2l
      // 191: lcmp
      // 192: iload 3
      // 193: ifne 242
      // 196: ifne 1d4
      // 199: goto 1a0
      // 19c: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: getfield crb$1.a91 Lsw6;
      // 1a4: iload 3
      // 1a5: ifne 1c4
      // 1a8: goto 1af
      // 1ab: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ae: athrow
      // 1af: ifnull 1c9
      // 1b2: goto 1b9
      // 1b5: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b8: athrow
      // 1b9: aload 0
      // 1ba: getfield crb$1.a91 Lsw6;
      // 1bd: goto 1c4
      // 1c0: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c3: athrow
      // 1c4: invokeinterface sw6.ij4 ()V 1
      // 1c9: aload 5
      // 1cb: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 1ce: aload 6
      // 1d0: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/OutputStream;)V
      // 1d3: return
      // 1d4: invokestatic crb.yzg ()Lorg/apache/logging/log4j/Logger;
      // 1d7: new java/lang/StringBuilder
      // 1da: dup
      // 1db: invokespecial java/lang/StringBuilder.<init> ()V
      // 1de: sipush 12240
      // 1e1: ldc2_w 6121560809042680550
      // 1e4: lload 1
      // 1e5: lxor
      // 1e6: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: nop
      // 1ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ef: aload 0
      // 1f0: getfield crb$1.nvk Ljava/io/File;
      // 1f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f6: sipush 16054
      // 1f9: ldc2_w 8595822376169048963
      // 1fc: lload 1
      // 1fd: lxor
      // 1fe: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: nop
      // 204: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 207: iload 11
      // 209: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 20c: sipush 4574
      // 20f: ldc2_w 7306033984980624622
      // 212: lload 1
      // 213: lxor
      // 214: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: nop
      // 21a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21d: lload 12
      // 21f: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 222: sipush 16213
      // 225: ldc2_w 64010126823131751
      // 228: lload 1
      // 229: lxor
      // 22a: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: nop
      // 230: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 233: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 236: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 23b: aload 0
      // 23c: getfield crb$1.nvk Ljava/io/File;
      // 23f: invokestatic org/apache/commons/io/FileUtils.deleteQuietly (Ljava/io/File;)Z
      // 242: pop
      // 243: iload 3
      // 244: ifeq 275
      // 247: aload 0
      // 248: getfield crb$1.nvk Ljava/io/File;
      // 24b: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 24e: goto 255
      // 251: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 254: athrow
      // 255: iload 3
      // 256: ifne 271
      // 259: ifnull 275
      // 25c: goto 263
      // 25f: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 262: athrow
      // 263: aload 0
      // 264: getfield crb$1.nvk Ljava/io/File;
      // 267: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 26a: goto 271
      // 26d: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 270: athrow
      // 271: invokevirtual java/io/File.mkdirs ()Z
      // 274: pop
      // 275: new java/io/DataOutputStream
      // 278: dup
      // 279: new java/io/FileOutputStream
      // 27c: dup
      // 27d: aload 0
      // 27e: getfield crb$1.nvk Ljava/io/File;
      // 281: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 284: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 287: astore 6
      // 289: aload 0
      // 28a: getfield crb$1.qw_ I
      // 28d: iload 3
      // 28e: ifne 328
      // 291: ifle 327
      // 294: goto 29b
      // 297: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29a: athrow
      // 29b: fload 10
      // 29d: aload 0
      // 29e: getfield crb$1.qw_ I
      // 2a1: i2f
      // 2a2: fcmpl
      // 2a3: iload 3
      // 2a4: ifne 328
      // 2a7: goto 2ae
      // 2aa: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ad: athrow
      // 2ae: ifle 327
      // 2b1: goto 2b8
      // 2b4: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b7: athrow
      // 2b8: aload 0
      // 2b9: getfield crb$1.a91 Lsw6;
      // 2bc: iload 3
      // 2bd: ifne 2dc
      // 2c0: goto 2c7
      // 2c3: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c6: athrow
      // 2c7: ifnull 2e1
      // 2ca: goto 2d1
      // 2cd: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d0: athrow
      // 2d1: aload 0
      // 2d2: getfield crb$1.a91 Lsw6;
      // 2d5: goto 2dc
      // 2d8: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2db: athrow
      // 2dc: invokeinterface sw6.ij4 ()V 1
      // 2e1: new java/io/IOException
      // 2e4: dup
      // 2e5: new java/lang/StringBuilder
      // 2e8: dup
      // 2e9: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ec: sipush 30919
      // 2ef: ldc2_w 221617343226301940
      // 2f2: lload 1
      // 2f3: lxor
      // 2f4: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: nop
      // 2fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fd: fload 9
      // 2ff: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 302: sipush 511
      // 305: ldc2_w 5707748124586128590
      // 308: lload 1
      // 309: lxor
      // 30a: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30f: nop
      // 310: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 313: aload 0
      // 314: getfield crb$1.qw_ I
      // 317: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 31a: ldc ")"
      // 31c: nop
      // 31d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 320: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 323: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 326: athrow
      // 327: bipush 0
      // 328: istore 12
      // 32a: aload 5
      // 32c: aload 7
      // 32e: invokevirtual java/io/InputStream.read ([B)I
      // 331: dup
      // 332: istore 12
      // 334: iflt 472
      // 337: fload 9
      // 339: iload 12
      // 33b: i2f
      // 33c: fadd
      // 33d: fstore 9
      // 33f: aload 0
      // 340: iload 3
      // 341: ifne 377
      // 344: getfield crb$1.a91 Lsw6;
      // 347: iload 3
      // 348: ifne 476
      // 34b: goto 352
      // 34e: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 351: athrow
      // 352: ifnull 376
      // 355: goto 35c
      // 358: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35b: athrow
      // 35c: aload 0
      // 35d: getfield crb$1.a91 Lsw6;
      // 360: fload 9
      // 362: fload 10
      // 364: fdiv
      // 365: ldc 100.0
      // 367: nop
      // 368: fmul
      // 369: f2i
      // 36a: invokeinterface sw6.e2w (I)V 2
      // 36f: goto 376
      // 372: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 375: athrow
      // 376: aload 0
      // 377: getfield crb$1.qw_ I
      // 37a: iload 3
      // 37b: ifne 417
      // 37e: ifle 414
      // 381: goto 388
      // 384: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 387: athrow
      // 388: fload 9
      // 38a: aload 0
      // 38b: getfield crb$1.qw_ I
      // 38e: i2f
      // 38f: fcmpl
      // 390: iload 3
      // 391: ifne 417
      // 394: goto 39b
      // 397: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39a: athrow
      // 39b: ifle 414
      // 39e: goto 3a5
      // 3a1: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a4: athrow
      // 3a5: aload 0
      // 3a6: getfield crb$1.a91 Lsw6;
      // 3a9: iload 3
      // 3aa: ifne 3c9
      // 3ad: goto 3b4
      // 3b0: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b3: athrow
      // 3b4: ifnull 3ce
      // 3b7: goto 3be
      // 3ba: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bd: athrow
      // 3be: aload 0
      // 3bf: getfield crb$1.a91 Lsw6;
      // 3c2: goto 3c9
      // 3c5: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c8: athrow
      // 3c9: invokeinterface sw6.ij4 ()V 1
      // 3ce: new java/io/IOException
      // 3d1: dup
      // 3d2: new java/lang/StringBuilder
      // 3d5: dup
      // 3d6: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d9: sipush 31938
      // 3dc: ldc2_w 8482465060042754554
      // 3df: lload 1
      // 3e0: lxor
      // 3e1: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e6: nop
      // 3e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ea: fload 9
      // 3ec: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 3ef: sipush 8657
      // 3f2: ldc2_w 3461917940340200682
      // 3f5: lload 1
      // 3f6: lxor
      // 3f7: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fc: nop
      // 3fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 400: aload 0
      // 401: getfield crb$1.qw_ I
      // 404: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 407: ldc ")"
      // 409: nop
      // 40a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 410: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 413: athrow
      // 414: invokestatic java/lang/Thread.interrupted ()Z
      // 417: ifeq 464
      // 41a: invokestatic crb.yzg ()Lorg/apache/logging/log4j/Logger;
      // 41d: sipush 26251
      // 420: ldc2_w 8812093762143376319
      // 423: lload 1
      // 424: lxor
      // 425: invokedynamic r (IJ)Ljava/lang/String; bsm=crb$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42a: nop
      // 42b: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 430: iload 3
      // 431: ifne 463
      // 434: goto 43b
      // 437: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43a: athrow
      // 43b: aload 0
      // 43c: getfield crb$1.a91 Lsw6;
      // 43f: ifnull 459
      // 442: goto 449
      // 445: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 448: athrow
      // 449: aload 0
      // 44a: getfield crb$1.a91 Lsw6;
      // 44d: invokeinterface sw6.ij4 ()V 1
      // 452: goto 459
      // 455: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 458: athrow
      // 459: aload 5
      // 45b: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 45e: aload 6
      // 460: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/OutputStream;)V
      // 463: return
      // 464: aload 6
      // 466: aload 7
      // 468: bipush 0
      // 469: iload 12
      // 46b: invokevirtual java/io/OutputStream.write ([BII)V
      // 46e: iload 3
      // 46f: ifeq 32a
      // 472: aload 0
      // 473: getfield crb$1.a91 Lsw6;
      // 476: iload 3
      // 477: ifne 48f
      // 47a: ifnull 49f
      // 47d: goto 484
      // 480: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 483: athrow
      // 484: aload 0
      // 485: getfield crb$1.a91 Lsw6;
      // 488: goto 48f
      // 48b: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48e: athrow
      // 48f: invokeinterface sw6.ij4 ()V 1
      // 494: aload 5
      // 496: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 499: aload 6
      // 49b: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/OutputStream;)V
      // 49e: return
      // 49f: goto 504
      // 4a2: astore 7
      // 4a4: aload 7
      // 4a6: invokevirtual java/lang/Throwable.printStackTrace ()V
      // 4a9: aload 4
      // 4ab: iload 3
      // 4ac: ifne 4bb
      // 4af: ifnull 4d7
      // 4b2: goto 4b9
      // 4b5: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b8: athrow
      // 4b9: aload 4
      // 4bb: invokevirtual java/net/HttpURLConnection.getErrorStream ()Ljava/io/InputStream;
      // 4be: astore 8
      // 4c0: invokestatic crb.yzg ()Lorg/apache/logging/log4j/Logger;
      // 4c3: aload 8
      // 4c5: invokestatic org/apache/commons/io/IOUtils.toString (Ljava/io/InputStream;)Ljava/lang/String;
      // 4c8: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 4cd: goto 4d7
      // 4d0: astore 9
      // 4d2: aload 9
      // 4d4: invokevirtual java/io/IOException.printStackTrace ()V
      // 4d7: aload 0
      // 4d8: getfield crb$1.a91 Lsw6;
      // 4db: iload 3
      // 4dc: ifne 4f4
      // 4df: ifnull 504
      // 4e2: goto 4e9
      // 4e5: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e8: athrow
      // 4e9: aload 0
      // 4ea: getfield crb$1.a91 Lsw6;
      // 4ed: goto 4f4
      // 4f0: invokestatic crb$1.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f3: athrow
      // 4f4: invokeinterface sw6.ij4 ()V 1
      // 4f9: aload 5
      // 4fb: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 4fe: aload 6
      // 500: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/OutputStream;)V
      // 503: return
      // 504: aload 5
      // 506: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 509: aload 6
      // 50b: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/OutputStream;)V
      // 50e: goto 520
      // 511: astore 14
      // 513: aload 5
      // 515: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 518: aload 6
      // 51a: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/OutputStream;)V
      // 51d: aload 14
      // 51f: athrow
      // 520: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1043834787515899762L, 1793575851216026010L, MethodHandles.lookup().lookupClass()).a(166036901833832L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 19850429477999L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "ý\u001cK\u0014\\Ö\u0010î\u001b\u000e·þ\u0093\u009aD<%\u0092D9 Ñ\u001f¬5Ø\u0092%ÒÁ±\u0098 \u0081,ª\u001a¢u\u008fÃ\u0017åÔkT\u0096Þ\u00ad/ÐS3]\u0082Ö\u0016~®PIF`4G\u0010õ\u009dJîÑ.Ío\u001b\u001bÃz§Y\u008bÜPé¾\u001d\u009b\u0094Ðbº;ßµàÏ:\u001f1\u0000z@øm¤Ä$ã?\u0013I\u0013X\u001d\u0000®]Úµ\u001d*\b|á\u008c\u009d±¬/»zÜÜ\u000f\u0003þ³\u008b*,\t3\u0019\u0087;õ\u0092D¨*B\u0017\u0097.M]\u009f\u000b\u001e`QMä Èéï(®\u008dA%\u007fÜ\u001a\u0018;\u0087}(g\u001e1\u0001ã\u008c~\u009d¶1<\u009b\u001fL\b\u001bP\u0015\u0005®nZ\u009açÄ¨R\u009e\u0015ÑæºeG;~WÈ¢\b\u009do\u001fÌÉ\u0090÷¯=¶~Q\u009c\u0005±\u0005E·s`\u0096\u001bC\u0016\u009e\u00165\u0015\u0089¤Ê\rþÖ\u001e\u0014¼ßmVï&gàüÕr%\u0017Åî\u001e\t\u0005Éþ\u001b \u0098ËÐØö\u0016<\u0085ël\u0091£ôz¼\u0011Pj\u000b\u009b\u0093\u0018\f\u0090YÔ\u0002\u009b;ù\u009f¤8Q\u0099ùòVÎ/¿\u008e\u0003\u001e[5©?\u0097Õ\u0091\u001f\u0014\u008c\u000e\f\u009e¹«ïï¡R\u009bt{2ùö×ä¥\u0083\u0019\u000eKà\t%\u008bv¨ÆB\u0000\u009agB¼X µ/\u008d\u00ad¼Íç\u0015cÅ&¥0¨{|M¬³\u0000;³éÔÚ³\u0087\u0096tôU\u009bq?â\u001aÙÓ_êµN\rÔ°òk7ç]Á\\ù\u0015xp\u0016 Ë Å)øì¶\u0096b\u0000;ÎAÐ|\u0090ö\nµ1¢jc\u009eN\u0018Çîï0Ùã\u000fJ¶D\u0003æós±-³}\r3fSªêM_}Äè\u0003~à\u0080g\u0081s4äÊ¼'\u0094\u0085\f_\u0084¡d¡\u0084S\u001d";
      int var8 = "ý\u001cK\u0014\\Ö\u0010î\u001b\u000e·þ\u0093\u009aD<%\u0092D9 Ñ\u001f¬5Ø\u0092%ÒÁ±\u0098 \u0081,ª\u001a¢u\u008fÃ\u0017åÔkT\u0096Þ\u00ad/ÐS3]\u0082Ö\u0016~®PIF`4G\u0010õ\u009dJîÑ.Ío\u001b\u001bÃz§Y\u008bÜPé¾\u001d\u009b\u0094Ðbº;ßµàÏ:\u001f1\u0000z@øm¤Ä$ã?\u0013I\u0013X\u001d\u0000®]Úµ\u001d*\b|á\u008c\u009d±¬/»zÜÜ\u000f\u0003þ³\u008b*,\t3\u0019\u0087;õ\u0092D¨*B\u0017\u0097.M]\u009f\u000b\u001e`QMä Èéï(®\u008dA%\u007fÜ\u001a\u0018;\u0087}(g\u001e1\u0001ã\u008c~\u009d¶1<\u009b\u001fL\b\u001bP\u0015\u0005®nZ\u009açÄ¨R\u009e\u0015ÑæºeG;~WÈ¢\b\u009do\u001fÌÉ\u0090÷¯=¶~Q\u009c\u0005±\u0005E·s`\u0096\u001bC\u0016\u009e\u00165\u0015\u0089¤Ê\rþÖ\u001e\u0014¼ßmVï&gàüÕr%\u0017Åî\u001e\t\u0005Éþ\u001b \u0098ËÐØö\u0016<\u0085ël\u0091£ôz¼\u0011Pj\u000b\u009b\u0093\u0018\f\u0090YÔ\u0002\u009b;ù\u009f¤8Q\u0099ùòVÎ/¿\u008e\u0003\u001e[5©?\u0097Õ\u0091\u001f\u0014\u008c\u000e\f\u009e¹«ïï¡R\u009bt{2ùö×ä¥\u0083\u0019\u000eKà\t%\u008bv¨ÆB\u0000\u009agB¼X µ/\u008d\u00ad¼Íç\u0015cÅ&¥0¨{|M¬³\u0000;³éÔÚ³\u0087\u0096tôU\u009bq?â\u001aÙÓ_êµN\rÔ°òk7ç]Á\\ù\u0015xp\u0016 Ë Å)øì¶\u0096b\u0000;ÎAÐ|\u0090ö\nµ1¢jc\u009eN\u0018Çîï0Ùã\u000fJ¶D\u0003æós±-³}\r3fSªêM_}Äè\u0003~à\u0080g\u0081s4äÊ¼'\u0094\u0085\f_\u0084¡d¡\u0084S\u001d"
         .length();
      char var5 = ' ';
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
                     c = new String[12];
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

                  var6 = "r\u0012¸~\u0004b\u001c\u009c>r$ø]&\u0091µ\u001f±xÿÃÕnx\u0015Q_ÔÝ\u0006²¡ÎwÀPßuT# \t\u0085\"{B*\u0006 <\ts\u0018Qs¬)T£Þõ\u0092¤²/\"a\u008e;ß;§Ò";
                  var8 = "r\u0012¸~\u0004b\u001c\u009c>r$ø]&\u0091µ\u001f±xÿÃÕnx\u0015Q_ÔÝ\u0006²¡ÎwÀPßuT# \t\u0085\"{B*\u0006 <\ts\u0018Qs¬)T£Þõ\u0092¤²/\"a\u008e;ß;§Ò"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32383;
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
            throw new RuntimeException("crb$1", var10);
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
         throw new RuntimeException("crb$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
