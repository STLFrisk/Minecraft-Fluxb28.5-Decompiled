import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class s6r implements l6n {
   private static final Logger r6b;
   public final File jv2;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public s6r(File var1) {
      int var2 = t9d.b();
      super();
      if (var2 != 0) {
         try {
            if (!var1.exists()) {
               var1.mkdirs();
            }
         } catch (oov var3) {
            throw a(var3);
         }

         this.jv2 = var1;
      }
   }

   @Override
   public String ocl() {
      long var1 = b ^ 23398908414941L;
      return a<"c">(1533, 6871577437185965190L ^ var1);
   }

   @Override
   public List e2p() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic s6r.b J
      // 03: ldc2_w 40195641541984
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 0b: astore 4
      // 0d: invokestatic t9d.c ()I
      // 10: bipush 0
      // 11: istore 5
      // 13: istore 3
      // 14: iload 5
      // 16: bipush 5
      // 17: if_icmpge 92
      // 1a: new java/lang/StringBuilder
      // 1d: dup
      // 1e: invokespecial java/lang/StringBuilder.<init> ()V
      // 21: sipush 8941
      // 24: ldc2_w 8703199242256160037
      // 27: lload 1
      // 28: lxor
      // 29: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: nop
      // 2f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32: iload 5
      // 34: bipush 1
      // 35: iadd
      // 36: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 39: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3c: astore 6
      // 3e: aload 0
      // 3f: aload 6
      // 41: invokevirtual s6r.h1n (Ljava/lang/String;)Lcog;
      // 44: astore 7
      // 46: iload 3
      // 47: ifne 8e
      // 4a: aload 7
      // 4c: ifnull 8b
      // 4f: goto 56
      // 52: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 4
      // 58: new id4
      // 5b: dup
      // 5c: aload 6
      // 5e: ldc ""
      // 60: nop
      // 61: aload 7
      // 63: invokevirtual cog.i8n ()J
      // 66: aload 7
      // 68: invokevirtual cog.b19 ()J
      // 6b: aload 7
      // 6d: invokevirtual cog.pcx ()Lh50$f05;
      // 70: bipush 0
      // 71: aload 7
      // 73: invokevirtual cog.lce ()Z
      // 76: aload 7
      // 78: invokevirtual cog.aqu ()Z
      // 7b: invokespecial id4.<init> (Ljava/lang/String;Ljava/lang/String;JJLh50$f05;ZZZ)V
      // 7e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 83: pop
      // 84: goto 8b
      // 87: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: iinc 5 1
      // 8e: iload 3
      // 8f: ifeq 14
      // 92: aload 4
      // 94: areturn
   }

   @Override
   public void wjh() {
   }

   @Override
   public cog h1n(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic s6r.b J
      // 003: ldc2_w 38377488843924
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: new java/io/File
      // 010: dup
      // 011: aload 0
      // 012: getfield s6r.jv2 Ljava/io/File;
      // 015: aload 1
      // 016: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 019: astore 5
      // 01b: aload 5
      // 01d: iload 4
      // 01f: ifeq 04c
      // 022: invokevirtual java/io/File.exists ()Z
      // 025: ifne 035
      // 028: goto 02f
      // 02b: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: aconst_null
      // 030: areturn
      // 031: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: new java/io/File
      // 038: dup
      // 039: aload 5
      // 03b: sipush 23919
      // 03e: ldc2_w 8363749900641954645
      // 041: lload 2
      // 042: lxor
      // 043: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: nop
      // 049: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 04c: astore 6
      // 04e: aload 6
      // 050: invokevirtual java/io/File.exists ()Z
      // 053: iload 4
      // 055: ifeq 0d9
      // 058: ifeq 0bb
      // 05b: goto 062
      // 05e: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: new java/io/FileInputStream
      // 065: dup
      // 066: aload 6
      // 068: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 06b: invokestatic g62.xe6 (Ljava/io/InputStream;)Lbdo;
      // 06e: astore 7
      // 070: aload 7
      // 072: sipush 21909
      // 075: ldc2_w 2216947260498043812
      // 078: lload 2
      // 079: lxor
      // 07a: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: nop
      // 080: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 083: astore 8
      // 085: new cog
      // 088: dup
      // 089: aload 8
      // 08b: invokespecial cog.<init> (Lbdo;)V
      // 08e: areturn
      // 08f: astore 7
      // 091: getstatic s6r.r6b Lorg/apache/logging/log4j/Logger;
      // 094: new java/lang/StringBuilder
      // 097: dup
      // 098: invokespecial java/lang/StringBuilder.<init> ()V
      // 09b: sipush 12404
      // 09e: ldc2_w 6731401370441549385
      // 0a1: lload 2
      // 0a2: lxor
      // 0a3: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: nop
      // 0a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ac: aload 6
      // 0ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b4: aload 7
      // 0b6: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 0bb: new java/io/File
      // 0be: dup
      // 0bf: aload 5
      // 0c1: sipush 14719
      // 0c4: ldc2_w 3999690448339242828
      // 0c7: lload 2
      // 0c8: lxor
      // 0c9: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: nop
      // 0cf: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0d2: astore 6
      // 0d4: aload 6
      // 0d6: invokevirtual java/io/File.exists ()Z
      // 0d9: ifeq 135
      // 0dc: new java/io/FileInputStream
      // 0df: dup
      // 0e0: aload 6
      // 0e2: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0e5: invokestatic g62.xe6 (Ljava/io/InputStream;)Lbdo;
      // 0e8: astore 7
      // 0ea: aload 7
      // 0ec: sipush 12172
      // 0ef: ldc2_w 4686889913343089074
      // 0f2: lload 2
      // 0f3: lxor
      // 0f4: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: nop
      // 0fa: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 0fd: astore 8
      // 0ff: new cog
      // 102: dup
      // 103: aload 8
      // 105: invokespecial cog.<init> (Lbdo;)V
      // 108: areturn
      // 109: astore 7
      // 10b: getstatic s6r.r6b Lorg/apache/logging/log4j/Logger;
      // 10e: new java/lang/StringBuilder
      // 111: dup
      // 112: invokespecial java/lang/StringBuilder.<init> ()V
      // 115: sipush 1703
      // 118: ldc2_w 1034298969724563612
      // 11b: lload 2
      // 11c: lxor
      // 11d: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: nop
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: aload 6
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 12b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12e: aload 7
      // 130: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 135: aconst_null
      // 136: areturn
   }

   @Override
   public void tdg(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic s6r.b J
      // 03: ldc2_w 139701211387840
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: new java/io/File
      // 10: dup
      // 11: aload 0
      // 12: getfield s6r.jv2 Ljava/io/File;
      // 15: aload 1
      // 16: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 19: astore 6
      // 1b: aload 6
      // 1d: iload 5
      // 1f: ifeq 4d
      // 22: invokevirtual java/io/File.exists ()Z
      // 25: ifeq a6
      // 28: goto 2f
      // 2b: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: new java/io/File
      // 32: dup
      // 33: aload 6
      // 35: sipush 7930
      // 38: ldc2_w 1988014890801200024
      // 3b: lload 3
      // 3c: lxor
      // 3d: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: nop
      // 43: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 46: goto 4d
      // 49: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: astore 7
      // 4f: aload 7
      // 51: invokevirtual java/io/File.exists ()Z
      // 54: ifeq a6
      // 57: new java/io/FileInputStream
      // 5a: dup
      // 5b: aload 7
      // 5d: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 60: invokestatic g62.xe6 (Ljava/io/InputStream;)Lbdo;
      // 63: astore 8
      // 65: aload 8
      // 67: sipush 12172
      // 6a: ldc2_w 4686963405828803302
      // 6d: lload 3
      // 6e: lxor
      // 6f: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: nop
      // 75: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 78: astore 9
      // 7a: aload 9
      // 7c: sipush 20023
      // 7f: ldc2_w 6390029324252130140
      // 82: lload 3
      // 83: lxor
      // 84: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: nop
      // 8a: aload 2
      // 8b: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 8e: aload 8
      // 90: new java/io/FileOutputStream
      // 93: dup
      // 94: aload 7
      // 96: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 99: invokestatic g62.bhd (Lbdo;Ljava/io/OutputStream;)V
      // 9c: goto a6
      // 9f: astore 8
      // a1: aload 8
      // a3: invokevirtual java/lang/Exception.printStackTrace ()V
      // a6: return
   }

   @Override
   public boolean f4m(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic s6r.b J
      // 03: ldc2_w 86568332195058
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: new java/io/File
      // 10: dup
      // 11: aload 0
      // 12: getfield s6r.jv2 Ljava/io/File;
      // 15: aload 1
      // 16: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 19: astore 5
      // 1b: aload 5
      // 1d: invokevirtual java/io/File.exists ()Z
      // 20: iload 4
      // 22: ifeq 42
      // 25: ifeq 35
      // 28: goto 2f
      // 2b: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: bipush 0
      // 30: ireturn
      // 31: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 5
      // 37: invokevirtual java/io/File.mkdir ()Z
      // 3a: pop
      // 3b: aload 5
      // 3d: invokevirtual java/io/File.delete ()Z
      // 40: pop
      // 41: bipush 1
      // 42: ireturn
      // 43: astore 6
      // 45: getstatic s6r.r6b Lorg/apache/logging/log4j/Logger;
      // 48: sipush 17285
      // 4b: ldc2_w 4321986338010891732
      // 4e: lload 2
      // 4f: lxor
      // 50: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: nop
      // 56: aload 6
      // 58: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 5d: bipush 0
      // 5e: ireturn
   }

   @Override
   public boolean lrc(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic s6r.b J
      // 003: ldc2_w 102121019422867
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: new java/io/File
      // 010: dup
      // 011: aload 0
      // 012: getfield s6r.jv2 Ljava/io/File;
      // 015: aload 1
      // 016: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 019: astore 5
      // 01b: aload 5
      // 01d: invokevirtual java/io/File.exists ()Z
      // 020: iload 4
      // 022: ifne 05d
      // 025: ifne 035
      // 028: goto 02f
      // 02b: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: bipush 1
      // 030: ireturn
      // 031: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: getstatic s6r.r6b Lorg/apache/logging/log4j/Logger;
      // 038: new java/lang/StringBuilder
      // 03b: dup
      // 03c: invokespecial java/lang/StringBuilder.<init> ()V
      // 03f: sipush 11136
      // 042: ldc2_w 1794181550643552695
      // 045: lload 2
      // 046: lxor
      // 047: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: nop
      // 04d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 050: aload 1
      // 051: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 054: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 057: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;)V 2
      // 05c: bipush 1
      // 05d: istore 6
      // 05f: iload 6
      // 061: bipush 5
      // 062: if_icmpgt 103
      // 065: getstatic s6r.r6b Lorg/apache/logging/log4j/Logger;
      // 068: new java/lang/StringBuilder
      // 06b: dup
      // 06c: invokespecial java/lang/StringBuilder.<init> ()V
      // 06f: sipush 17739
      // 072: ldc2_w 4575475771830914936
      // 075: lload 2
      // 076: lxor
      // 077: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: nop
      // 07d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 080: iload 6
      // 082: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 085: sipush 14850
      // 088: ldc2_w 7211288547327815728
      // 08b: lload 2
      // 08c: lxor
      // 08d: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: nop
      // 093: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 096: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 099: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;)V 2
      // 09e: aload 5
      // 0a0: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 0a3: invokestatic s6r.wex ([Ljava/io/File;)Z
      // 0a6: iload 4
      // 0a8: ifne 108
      // 0ab: iload 4
      // 0ad: ifne 0e8
      // 0b0: goto 0b7
      // 0b3: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: ifeq 0c4
      // 0ba: goto 0c1
      // 0bd: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: goto 103
      // 0c4: getstatic s6r.r6b Lorg/apache/logging/log4j/Logger;
      // 0c7: sipush 23468
      // 0ca: ldc2_w 1547290111948738949
      // 0cd: lload 2
      // 0ce: lxor
      // 0cf: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: nop
      // 0d5: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 0da: iload 4
      // 0dc: ifne 0fe
      // 0df: iload 6
      // 0e1: goto 0e8
      // 0e4: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: bipush 5
      // 0e9: if_icmpge 0fb
      // 0ec: ldc2_w 500
      // 0ef: invokestatic java/lang/Thread.sleep (J)V
      // 0f2: goto 0fb
      // 0f5: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: astore 7
      // 0fb: iinc 6 1
      // 0fe: iload 4
      // 100: ifeq 05f
      // 103: aload 5
      // 105: invokevirtual java/io/File.delete ()Z
      // 108: ireturn
   }

   public static boolean wex(File[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic s6r.b J
      // 03: ldc2_w 67494982434699
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: bipush 0
      // 0d: istore 4
      // 0f: iload 4
      // 11: aload 0
      // 12: arraylength
      // 13: if_icmpge f8
      // 16: aload 0
      // 17: iload 4
      // 19: aaload
      // 1a: astore 5
      // 1c: getstatic s6r.r6b Lorg/apache/logging/log4j/Logger;
      // 1f: new java/lang/StringBuilder
      // 22: dup
      // 23: invokespecial java/lang/StringBuilder.<init> ()V
      // 26: sipush 6460
      // 29: ldc2_w 1541191103521854476
      // 2c: lload 1
      // 2d: lxor
      // 2e: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: nop
      // 34: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37: aload 5
      // 39: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3f: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;)V 2
      // 44: aload 5
      // 46: invokevirtual java/io/File.isDirectory ()Z
      // 49: iload 3
      // 4a: ifeq f9
      // 4d: iload 3
      // 4e: ifeq b2
      // 51: goto 58
      // 54: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: ifeq ad
      // 5b: goto 62
      // 5e: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: aload 5
      // 64: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 67: invokestatic s6r.wex ([Ljava/io/File;)Z
      // 6a: iload 3
      // 6b: ifeq b2
      // 6e: goto 75
      // 71: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: ifne ad
      // 78: goto 7f
      // 7b: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: getstatic s6r.r6b Lorg/apache/logging/log4j/Logger;
      // 82: new java/lang/StringBuilder
      // 85: dup
      // 86: invokespecial java/lang/StringBuilder.<init> ()V
      // 89: sipush 18744
      // 8c: ldc2_w 9069766893830947870
      // 8f: lload 1
      // 90: lxor
      // 91: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: nop
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: aload 5
      // 9c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 9f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a2: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // a7: bipush 0
      // a8: ireturn
      // a9: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: aload 5
      // af: invokevirtual java/io/File.delete ()Z
      // b2: iload 3
      // b3: ifeq f0
      // b6: ifne f1
      // b9: goto c0
      // bc: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bf: athrow
      // c0: getstatic s6r.r6b Lorg/apache/logging/log4j/Logger;
      // c3: new java/lang/StringBuilder
      // c6: dup
      // c7: invokespecial java/lang/StringBuilder.<init> ()V
      // ca: sipush 6920
      // cd: ldc2_w 4545697354111129135
      // d0: lload 1
      // d1: lxor
      // d2: invokedynamic c (IJ)Ljava/lang/String; bsm=s6r.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d7: nop
      // d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // db: aload 5
      // dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // e0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e3: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // e8: bipush 0
      // e9: goto f0
      // ec: invokestatic s6r.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ef: athrow
      // f0: ireturn
      // f1: iinc 4 1
      // f4: iload 3
      // f5: ifne 0f
      // f8: bipush 1
      // f9: ireturn
   }

   @Override
   public he6 zjk(String var1, boolean var2) {
      return new buu(this.jv2, var1, var2);
   }

   @Override
   public boolean mtw(String var1) {
      return false;
   }

   @Override
   public boolean h92(String var1) {
      return false;
   }

   @Override
   public boolean y2z(String var1, sw6 var2) {
      return false;
   }

   @Override
   public boolean nif(String var1) {
      File var2 = new File(this.jv2, var1);
      return var2.isDirectory();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-406176372118235677L, -385053149628304122L, MethodHandles.lookup().lookupClass()).a(15704217656312L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 13464181788622L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[18];
      int var7 = 0;
      String var6 = "\u0003å\\\u0016²u\u0015¢SGÌ\u0092aã\u0090Æ -´Ê¦\nÛK+®vÝÅ¸\u009a\u008d\u0090¥\u0082÷Àq1%µß\u007fTb(\u008c~²\u0010\u0086\u008a\u0007ã\u0012¥Ñ\u0007~Îóæ\u0081è(((äçs«Ü\u000f®#h\n\u009däcôý\u001f¢ Áà¦N\u008e\u0089q\u009fr\u000ef:\u0017¾úv\u0012\u0093â\\Ää\u0018eF»¼Gw\u008cõÀµ\u0097¸\nÖñ×e\u009bM\u0001F\u0091\fÿ(õ\\\u0001NG9ñæ½B\f\u0001A!1\u001dýBhZGð\u0094ºunoOÓÕ\u0083\u0091 ïk®\u0001\u009c\u0081\u0010(\u0082 zéjú+?V¿\u0014\u008bß\u009a\u0017µ\u0002.ýû<\fÔ!+IßÕ\nÂç$¿ãñ\u001c3ÃÏ\u00908ÂNü±ý\u0093©¡\u0089C\u0018VÃ\u001fT\"N®tÞî¢õ°Õ\u0007÷N\u009c0\u0006\u0003=Ëà%õ\u0019ZÂF\u0082Æ\u00add¶Ë\u001af*Î¡\u008f26±\u0018¦\u008d?z\u0087Z¸\u0080\u0013\u0087\u0088ÿ*\u001a47L\r\u0007¢G\t\u0088ó(\u0011ø1yuk\u001fu\u0089=\u0002\u00ad\u009c»Á|©WÿU\rðµí¥Q/ªA\u0091¶ÁB:sþ$ëÛ!\u0018\u00075¿Þµ2\u00112}x6\u0001\u0015©\u0005.x$0¥\u009bp]e\u0010ÂÑ\u001c~1v\u0088\u00115\u0088¬hÏoLÓ r]6^êï\u0097ÅÀ,\u000b\u009f\u009bg\u009fþ¿\u008f¶£\u009f\u0000\u0012\\4,I¸¹\u0006÷¦ 4%\u00adÒ\u00131WPårÌ-sÜvq^é\u00ad'o¡\u009cóÛÉûèü\u0010rU àè+,g~o\u0011tª\u0010kÿÁ2ßÉwúx*vôëq3Þà\u0089Oµ\u0080\u0010\u0017ú¨\u0018\u0007®{×\u008d\u0018Vx~Ë&Ð";
      int var8 = "\u0003å\\\u0016²u\u0015¢SGÌ\u0092aã\u0090Æ -´Ê¦\nÛK+®vÝÅ¸\u009a\u008d\u0090¥\u0082÷Àq1%µß\u007fTb(\u008c~²\u0010\u0086\u008a\u0007ã\u0012¥Ñ\u0007~Îóæ\u0081è(((äçs«Ü\u000f®#h\n\u009däcôý\u001f¢ Áà¦N\u008e\u0089q\u009fr\u000ef:\u0017¾úv\u0012\u0093â\\Ää\u0018eF»¼Gw\u008cõÀµ\u0097¸\nÖñ×e\u009bM\u0001F\u0091\fÿ(õ\\\u0001NG9ñæ½B\f\u0001A!1\u001dýBhZGð\u0094ºunoOÓÕ\u0083\u0091 ïk®\u0001\u009c\u0081\u0010(\u0082 zéjú+?V¿\u0014\u008bß\u009a\u0017µ\u0002.ýû<\fÔ!+IßÕ\nÂç$¿ãñ\u001c3ÃÏ\u00908ÂNü±ý\u0093©¡\u0089C\u0018VÃ\u001fT\"N®tÞî¢õ°Õ\u0007÷N\u009c0\u0006\u0003=Ëà%õ\u0019ZÂF\u0082Æ\u00add¶Ë\u001af*Î¡\u008f26±\u0018¦\u008d?z\u0087Z¸\u0080\u0013\u0087\u0088ÿ*\u001a47L\r\u0007¢G\t\u0088ó(\u0011ø1yuk\u001fu\u0089=\u0002\u00ad\u009c»Á|©WÿU\rðµí¥Q/ªA\u0091¶ÁB:sþ$ëÛ!\u0018\u00075¿Þµ2\u00112}x6\u0001\u0015©\u0005.x$0¥\u009bp]e\u0010ÂÑ\u001c~1v\u0088\u00115\u0088¬hÏoLÓ r]6^êï\u0097ÅÀ,\u000b\u009f\u009bg\u009fþ¿\u008f¶£\u009f\u0000\u0012\\4,I¸¹\u0006÷¦ 4%\u00adÒ\u00131WPårÌ-sÜvq^é\u00ad'o¡\u009cóÛÉûèü\u0010rU àè+,g~o\u0011tª\u0010kÿÁ2ßÉwúx*vôëq3Þà\u0089Oµ\u0080\u0010\u0017ú¨\u0018\u0007®{×\u008d\u0018Vx~Ë&Ð"
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
                     c = var9;
                     d = new String[18];
                     r6b = LogManager.getLogger();
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

                  var6 = "$33\u008e\u0083q\fÀ£NK\u00886é\u0087SÁ\u0098þ¦õz³]ïtEÛ\u0003]\u009d±\u0003\u0099MüúÄ\u0093=@ûÜÓ¹\u007f&E\u0098Ëq¶¶~\u001bU\u0005$Y\u0013?0o§\u0018tt ªê-\u0094.\u0094\u0095:K>9äS\u0014\u0007ä0E(\u0010n";
                  var8 = "$33\u008e\u0083q\fÀ£NK\u00886é\u0087SÁ\u0098þ¦õz³]ïtEÛ\u0003]\u009d±\u0003\u0099MüúÄ\u0093=@ûÜÓ¹\u007f&E\u0098Ëq¶¶~\u001bU\u0005$Y\u0013?0o§\u0018tt ªê-\u0094.\u0094\u0095:K>9äS\u0014\u0007ä0E(\u0010n"
                     .length();
                  var5 = '@';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8261;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("s6r", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("s6r" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
