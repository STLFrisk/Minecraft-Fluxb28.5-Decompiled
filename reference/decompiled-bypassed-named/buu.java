import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.apache.logging.log4j.LogManager;

public class buu implements he6, bwg {
   private static final long a;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public buu(File param1, String param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic buu.a J
      // 03: ldc2_w 33502154139400
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: invokespecial java/lang/Object.<init> ()V
      // 0d: aload 0
      // 0e: invokestatic vr1.spw ()J
      // 11: putfield buu.nd8 J
      // 14: invokestatic OpaquePredicate.c ()I
      // 17: aload 0
      // 18: new java/io/File
      // 1b: dup
      // 1c: aload 1
      // 1d: aload 2
      // 1e: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 21: putfield buu.rc0 Ljava/io/File;
      // 24: aload 0
      // 25: getfield buu.rc0 Ljava/io/File;
      // 28: invokevirtual java/io/File.mkdirs ()Z
      // 2b: pop
      // 2c: istore 6
      // 2e: aload 0
      // 2f: new java/io/File
      // 32: dup
      // 33: aload 0
      // 34: getfield buu.rc0 Ljava/io/File;
      // 37: sipush 11191
      // 3a: ldc2_w 7694881209764872884
      // 3d: lload 4
      // 3f: lxor
      // 40: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: nop
      // 46: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 49: putfield buu.c8z Ljava/io/File;
      // 4c: aload 0
      // 4d: new java/io/File
      // 50: dup
      // 51: aload 0
      // 52: getfield buu.rc0 Ljava/io/File;
      // 55: sipush 21428
      // 58: ldc2_w 645720461904018100
      // 5b: lload 4
      // 5d: lxor
      // 5e: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: nop
      // 64: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 67: putfield buu.n1d Ljava/io/File;
      // 6a: aload 0
      // 6b: getfield buu.n1d Ljava/io/File;
      // 6e: invokevirtual java/io/File.mkdirs ()Z
      // 71: pop
      // 72: aload 0
      // 73: aload 2
      // 74: putfield buu.wjn Ljava/lang/String;
      // 77: iload 6
      // 79: ifne 9a
      // 7c: iload 3
      // 7d: ifeq 96
      // 80: goto 87
      // 83: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: aload 0
      // 88: getfield buu.c8z Ljava/io/File;
      // 8b: invokevirtual java/io/File.mkdirs ()Z
      // 8e: pop
      // 8f: goto 96
      // 92: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: aload 0
      // 97: invokespecial buu.fbn ()V
      // 9a: return
   }

   private void fbn() {
      long var1 = a ^ 105361445897005L;

      try {
         File var3 = new File(this.rc0, a<"v">(3882, 943852166272467473L ^ var1));
         DataOutputStream var4 = new DataOutputStream(new FileOutputStream(var3));

         try {
            var4.writeLong(this.nd8);
         } finally {
            var4.close();
         }
      } catch (IOException var9) {
         var9.printStackTrace();
         throw new RuntimeException(a<"v">(28397, 6147549418328400841L ^ var1));
      }
   }

   @Override
   public File w62() {
      return this.rc0;
   }

   @Override
   public void o17() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic buu.a J
      // 03: ldc2_w 75432546601496
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: new java/io/File
      // 0f: dup
      // 10: aload 0
      // 11: getfield buu.rc0 Ljava/io/File;
      // 14: sipush 23811
      // 17: ldc2_w 5611294525030947103
      // 1a: lload 1
      // 1b: lxor
      // 1c: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: nop
      // 22: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 25: astore 4
      // 27: new java/io/DataInputStream
      // 2a: dup
      // 2b: new java/io/FileInputStream
      // 2e: dup
      // 2f: aload 4
      // 31: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 34: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 37: astore 5
      // 39: aload 5
      // 3b: iload 3
      // 3c: ifne 6d
      // 3f: invokevirtual java/io/DataInputStream.readLong ()J
      // 42: aload 0
      // 43: getfield buu.nd8 J
      // 46: lcmp
      // 47: ifeq 6b
      // 4a: goto 51
      // 4d: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: new d3f
      // 54: dup
      // 55: sipush 9981
      // 58: ldc2_w 5765558204587975414
      // 5b: lload 1
      // 5c: lxor
      // 5d: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: nop
      // 63: invokespecial d3f.<init> (Ljava/lang/String;)V
      // 66: athrow
      // 67: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 5
      // 6d: invokevirtual java/io/DataInputStream.close ()V
      // 70: goto 7d
      // 73: astore 6
      // 75: aload 5
      // 77: invokevirtual java/io/DataInputStream.close ()V
      // 7a: aload 6
      // 7c: athrow
      // 7d: goto 98
      // 80: astore 4
      // 82: new d3f
      // 85: dup
      // 86: sipush 5711
      // 89: ldc2_w 8950844244061950554
      // 8c: lload 1
      // 8d: lxor
      // 8e: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: nop
      // 94: invokespecial d3f.<init> (Ljava/lang/String;)V
      // 97: athrow
      // 98: return
   }

   @Override
   public oza kmb(upn var1) {
      long var2 = a ^ 94344771669222L;
      throw new RuntimeException(a<"v">(4730, 2049232893422899340L ^ var2));
   }

   @Override
   public cog jhs() {
      long var1 = a ^ 101541489621164L;
      int var3 = OpaquePredicate.b();
      File var4 = new File(this.rc0, a<"v">(25962, 7773502650774901697L ^ var1));

      boolean var10000;
      label37: {
         label36: {
            try {
               var10000 = var4.exists();
               if (var3 == 0) {
                  break label37;
               }

               if (!var10000) {
                  break label36;
               }
            } catch (Exception var9) {
               throw a(var9);
            }

            try {
               bdo var5 = g62.xe6(new FileInputStream(var4));
               bdo var6 = var5.b__(a<"v">(3940, 2807724001856993734L ^ var1));
               return new cog(var6);
            } catch (Exception var8) {
               var8.printStackTrace();
            }
         }

         var4 = new File(this.rc0, a<"v">(12863, 2495412811907728528L ^ var1));
         var10000 = var4.exists();
      }

      if (var10000) {
         try {
            bdo var10 = g62.xe6(new FileInputStream(var4));
            bdo var11 = var10.b__(a<"v">(3940, 2807724001856993734L ^ var1));
            return new cog(var11);
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

      return null;
   }

   @Override
   public void oh5(cog param1, bdo param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic buu.a J
      // 003: ldc2_w 130500481208802
      // 006: lxor
      // 007: lstore 3
      // 008: aload 1
      // 009: aload 2
      // 00a: invokevirtual cog.mze (Lbdo;)Lbdo;
      // 00d: astore 6
      // 00f: invokestatic OpaquePredicate.b ()I
      // 012: new bdo
      // 015: dup
      // 016: invokespecial bdo.<init> ()V
      // 019: astore 7
      // 01b: istore 5
      // 01d: aload 7
      // 01f: sipush 31039
      // 022: ldc2_w 7961144828321834717
      // 025: lload 3
      // 026: lxor
      // 027: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: nop
      // 02d: aload 6
      // 02f: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 032: new java/io/File
      // 035: dup
      // 036: aload 0
      // 037: getfield buu.rc0 Ljava/io/File;
      // 03a: sipush 20214
      // 03d: ldc2_w 2136425540301754641
      // 040: lload 3
      // 041: lxor
      // 042: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: nop
      // 048: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 04b: astore 8
      // 04d: new java/io/File
      // 050: dup
      // 051: aload 0
      // 052: getfield buu.rc0 Ljava/io/File;
      // 055: sipush 6748
      // 058: ldc2_w 8796661781813544364
      // 05b: lload 3
      // 05c: lxor
      // 05d: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: nop
      // 063: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 066: astore 9
      // 068: new java/io/File
      // 06b: dup
      // 06c: aload 0
      // 06d: getfield buu.rc0 Ljava/io/File;
      // 070: sipush 2701
      // 073: ldc2_w 7756246782531229027
      // 076: lload 3
      // 077: lxor
      // 078: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: nop
      // 07e: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 081: astore 10
      // 083: aload 7
      // 085: new java/io/FileOutputStream
      // 088: dup
      // 089: aload 8
      // 08b: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 08e: invokestatic g62.bhd (Lbdo;Ljava/io/OutputStream;)V
      // 091: aload 9
      // 093: invokevirtual java/io/File.exists ()Z
      // 096: iload 5
      // 098: ifeq 0bf
      // 09b: ifeq 0b2
      // 09e: goto 0a5
      // 0a1: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 9
      // 0a7: invokevirtual java/io/File.delete ()Z
      // 0aa: pop
      // 0ab: goto 0b2
      // 0ae: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 10
      // 0b4: aload 9
      // 0b6: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 0b9: pop
      // 0ba: aload 10
      // 0bc: invokevirtual java/io/File.exists ()Z
      // 0bf: iload 5
      // 0c1: ifeq 0e8
      // 0c4: ifeq 0db
      // 0c7: goto 0ce
      // 0ca: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 10
      // 0d0: invokevirtual java/io/File.delete ()Z
      // 0d3: pop
      // 0d4: goto 0db
      // 0d7: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: aload 8
      // 0dd: aload 10
      // 0df: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 0e2: pop
      // 0e3: aload 8
      // 0e5: invokevirtual java/io/File.exists ()Z
      // 0e8: iload 5
      // 0ea: ifeq 103
      // 0ed: ifeq 104
      // 0f0: goto 0f7
      // 0f3: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: aload 8
      // 0f9: invokevirtual java/io/File.delete ()Z
      // 0fc: goto 103
      // 0ff: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102: athrow
      // 103: pop
      // 104: goto 10e
      // 107: astore 8
      // 109: aload 8
      // 10b: invokevirtual java/lang/Exception.printStackTrace ()V
      // 10e: return
   }

   @Override
   public void yd8(cog param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic buu.a J
      // 003: ldc2_w 42519715681750
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: invokevirtual cog._s7 ()Lbdo;
      // 00c: astore 5
      // 00e: new bdo
      // 011: dup
      // 012: invokespecial bdo.<init> ()V
      // 015: astore 6
      // 017: invokestatic OpaquePredicate.b ()I
      // 01a: aload 6
      // 01c: sipush 3940
      // 01f: ldc2_w 2807837036887774396
      // 022: lload 2
      // 023: lxor
      // 024: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: nop
      // 02a: aload 5
      // 02c: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 02f: istore 4
      // 031: new java/io/File
      // 034: dup
      // 035: aload 0
      // 036: getfield buu.rc0 Ljava/io/File;
      // 039: sipush 23490
      // 03c: ldc2_w 240937290058383378
      // 03f: lload 2
      // 040: lxor
      // 041: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: nop
      // 047: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 04a: astore 7
      // 04c: new java/io/File
      // 04f: dup
      // 050: aload 0
      // 051: getfield buu.rc0 Ljava/io/File;
      // 054: sipush 12863
      // 057: ldc2_w 2495282579970697706
      // 05a: lload 2
      // 05b: lxor
      // 05c: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: nop
      // 062: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 065: astore 8
      // 067: new java/io/File
      // 06a: dup
      // 06b: aload 0
      // 06c: getfield buu.rc0 Ljava/io/File;
      // 06f: sipush 25962
      // 072: ldc2_w 7773632469971599035
      // 075: lload 2
      // 076: lxor
      // 077: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: nop
      // 07d: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 080: astore 9
      // 082: aload 6
      // 084: new java/io/FileOutputStream
      // 087: dup
      // 088: aload 7
      // 08a: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 08d: invokestatic g62.bhd (Lbdo;Ljava/io/OutputStream;)V
      // 090: aload 8
      // 092: invokevirtual java/io/File.exists ()Z
      // 095: iload 4
      // 097: ifeq 0be
      // 09a: ifeq 0b1
      // 09d: goto 0a4
      // 0a0: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: aload 8
      // 0a6: invokevirtual java/io/File.delete ()Z
      // 0a9: pop
      // 0aa: goto 0b1
      // 0ad: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 9
      // 0b3: aload 8
      // 0b5: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 0b8: pop
      // 0b9: aload 9
      // 0bb: invokevirtual java/io/File.exists ()Z
      // 0be: iload 4
      // 0c0: ifeq 0e7
      // 0c3: ifeq 0da
      // 0c6: goto 0cd
      // 0c9: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: aload 9
      // 0cf: invokevirtual java/io/File.delete ()Z
      // 0d2: pop
      // 0d3: goto 0da
      // 0d6: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: aload 7
      // 0dc: aload 9
      // 0de: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 0e1: pop
      // 0e2: aload 7
      // 0e4: invokevirtual java/io/File.exists ()Z
      // 0e7: iload 4
      // 0e9: ifeq 102
      // 0ec: ifeq 103
      // 0ef: goto 0f6
      // 0f2: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: aload 7
      // 0f8: invokevirtual java/io/File.delete ()Z
      // 0fb: goto 102
      // 0fe: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: pop
      // 103: goto 10d
      // 106: astore 7
      // 108: aload 7
      // 10a: invokevirtual java/lang/Exception.printStackTrace ()V
      // 10d: return
   }

   @Override
   public void byf(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic buu.a J
      // 03: ldc2_w 64262682225187
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: new bdo
      // 10: dup
      // 11: invokespecial bdo.<init> ()V
      // 14: astore 5
      // 16: aload 1
      // 17: aload 5
      // 19: invokevirtual ha9.c97 (Lbdo;)V
      // 1c: new java/io/File
      // 1f: dup
      // 20: aload 0
      // 21: getfield buu.c8z Ljava/io/File;
      // 24: new java/lang/StringBuilder
      // 27: dup
      // 28: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b: aload 1
      // 2c: invokevirtual ha9.b_q ()Ljava/util/UUID;
      // 2f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 32: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35: sipush 2477
      // 38: ldc2_w 7454989985030090116
      // 3b: lload 2
      // 3c: lxor
      // 3d: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: nop
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 4c: astore 6
      // 4e: new java/io/File
      // 51: dup
      // 52: aload 0
      // 53: getfield buu.c8z Ljava/io/File;
      // 56: new java/lang/StringBuilder
      // 59: dup
      // 5a: invokespecial java/lang/StringBuilder.<init> ()V
      // 5d: aload 1
      // 5e: invokevirtual ha9.b_q ()Ljava/util/UUID;
      // 61: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 64: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 67: sipush 13074
      // 6a: ldc2_w 2391528298017429280
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: nop
      // 75: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 78: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7b: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 7e: astore 7
      // 80: aload 5
      // 82: new java/io/FileOutputStream
      // 85: dup
      // 86: aload 6
      // 88: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 8b: invokestatic g62.bhd (Lbdo;Ljava/io/OutputStream;)V
      // 8e: aload 7
      // 90: invokevirtual java/io/File.exists ()Z
      // 93: iload 4
      // 95: ifne b6
      // 98: ifeq af
      // 9b: goto a2
      // 9e: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1: athrow
      // a2: aload 7
      // a4: invokevirtual java/io/File.delete ()Z
      // a7: pop
      // a8: goto af
      // ab: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: aload 6
      // b1: aload 7
      // b3: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // b6: pop
      // b7: goto e6
      // ba: astore 5
      // bc: getstatic buu.rld Lorg/apache/logging/log4j/Logger;
      // bf: new java/lang/StringBuilder
      // c2: dup
      // c3: invokespecial java/lang/StringBuilder.<init> ()V
      // c6: sipush 14542
      // c9: ldc2_w 8376552387296173282
      // cc: lload 2
      // cd: lxor
      // ce: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3: nop
      // d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d7: aload 1
      // d8: invokevirtual ha9.noc ()Ljava/lang/String;
      // db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e1: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // e6: return
   }

   @Override
   public bdo j0m(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic buu.a J
      // 03: ldc2_w 124218850928065
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aconst_null
      // 0e: astore 5
      // 10: new java/io/File
      // 13: dup
      // 14: aload 0
      // 15: getfield buu.c8z Ljava/io/File;
      // 18: new java/lang/StringBuilder
      // 1b: dup
      // 1c: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f: aload 1
      // 20: invokevirtual ha9.b_q ()Ljava/util/UUID;
      // 23: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 26: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29: sipush 13074
      // 2c: ldc2_w 2391447528575654082
      // 2f: lload 2
      // 30: lxor
      // 31: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: nop
      // 37: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3d: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 40: astore 6
      // 42: aload 6
      // 44: invokevirtual java/io/File.exists ()Z
      // 47: iload 4
      // 49: ifeq 62
      // 4c: ifeq 73
      // 4f: goto 56
      // 52: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 6
      // 58: invokevirtual java/io/File.isFile ()Z
      // 5b: goto 62
      // 5e: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: ifeq 73
      // 65: new java/io/FileInputStream
      // 68: dup
      // 69: aload 6
      // 6b: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 6e: invokestatic g62.xe6 (Ljava/io/InputStream;)Lbdo;
      // 71: astore 5
      // 73: goto a2
      // 76: astore 6
      // 78: getstatic buu.rld Lorg/apache/logging/log4j/Logger;
      // 7b: new java/lang/StringBuilder
      // 7e: dup
      // 7f: invokespecial java/lang/StringBuilder.<init> ()V
      // 82: sipush 20840
      // 85: ldc2_w 5930987144249490091
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: nop
      // 90: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 93: aload 1
      // 94: invokevirtual ha9.noc ()Ljava/lang/String;
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9d: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // a2: aload 5
      // a4: iload 4
      // a6: ifeq c2
      // a9: ifnull c0
      // ac: goto b3
      // af: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b2: athrow
      // b3: aload 1
      // b4: aload 5
      // b6: invokevirtual ha9.a1f (Lbdo;)V
      // b9: goto c0
      // bc: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bf: athrow
      // c0: aload 5
      // c2: areturn
   }

   @Override
   public bwg l64() {
      return this;
   }

   @Override
   public String[] zww() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic buu.a J
      // 03: ldc2_w 102037160687231
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield buu.c8z Ljava/io/File;
      // 10: invokevirtual java/io/File.list ()[Ljava/lang/String;
      // 13: astore 4
      // 15: aload 4
      // 17: iload 3
      // 18: ifne 30
      // 1b: ifnonnull 32
      // 1e: goto 25
      // 21: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: bipush 0
      // 26: anewarray 1
      // 29: goto 30
      // 2c: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: astore 4
      // 32: bipush 0
      // 33: istore 5
      // 35: iload 5
      // 37: aload 4
      // 39: arraylength
      // 3a: if_icmpge 92
      // 3d: aload 4
      // 3f: iload 3
      // 40: ifne 94
      // 43: iload 5
      // 45: iload 3
      // 46: ifne 77
      // 49: goto 50
      // 4c: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aaload
      // 51: sipush 13074
      // 54: ldc2_w 2391425626049366908
      // 57: lload 1
      // 58: lxor
      // 59: invokedynamic v (IJ)Ljava/lang/String; bsm=buu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: nop
      // 5f: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 62: ifeq 8b
      // 65: goto 6c
      // 68: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 4
      // 6e: iload 5
      // 70: goto 77
      // 73: invokestatic buu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: aload 4
      // 79: iload 5
      // 7b: aaload
      // 7c: bipush 0
      // 7d: aload 4
      // 7f: iload 5
      // 81: aaload
      // 82: invokevirtual java/lang/String.length ()I
      // 85: bipush 4
      // 86: isub
      // 87: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 8a: aastore
      // 8b: iinc 5 1
      // 8e: iload 3
      // 8f: ifeq 35
      // 92: aload 4
      // 94: areturn
   }

   @Override
   public void vpx() {
   }

   @Override
   public File tmg(String var1) {
      long var2 = a ^ 97486693960065L;
      return new File(this.n1d, var1 + a<"v">(3657, 5045867053956008393L ^ var2));
   }

   @Override
   public String s1q() {
      return this.wjn;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8683326537994920760L, 5065729119277306416L, MethodHandles.lookup().lookupClass()).a(223878958321805L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 75524259604464L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[21];
      int var7 = 0;
      String var6 = "ÉQ\u0092\u001fÝ\u0088¥xÏÝáO\u0003Ê¼6¸ÈM(Á0\u0088\u001c\r\u0098\u0095\u009f\u001cÔ2!ë\u008bvRþ\u008d\u0098\u0094Wú¬a:èÏ·\u009d!Èqïäª\u0015 Å\u0001Y.ëc\u0011\u000fÛÏ\u007fôèK/K%¾TBF\u0092J+±,\u0010 )\u0001Ü\u0081\u0010\u0082Òw\u0018\u0006x\u009aÞqß\u0086ö5_,h\u0010îÁªÃ¶Ð ¸ ô\u00976_J°Ð\u0018\u0082¹¨ò\u0015p¥¬\u0080É!ãD\u0006\u0097\u0092\u0084v/n\u0002Ó<\u001a |,zK\u007fñ³;\u0081tósã\u000f\u001bïÈA\u008e\u0006¹Ñ\u008b\u001a6\u001esÿíZ0´ ¶ÉO\u009aÎXÌ=9y\u0096c%\u008a§vÑAÒOÎ\u0081o\u008a\u009bx§¥#\u001a\u0018| òO;\u008dä\u0017þÒ\u0095Z\u0091ü\u000eÍ_\u0082F¨¬:Üõd-¹7õ_ EDH\u0018Ê\u0002Ú1|ÕØl\t\u009b\u000fèx\u0099JÀ\u0083×Ð|\u001cGKF\u001802Y.\u009ak\u0006\u009b\u0019\u008b@Öp\u0096¡\u0091Ñ¬\u0091 Ièè\b\u00102U^íü\r2N\u009d)¶\rô\u0000õü@\u00884$º>¼\u0014ôí¯§¢óD\u00ad\u0084ÂmzÇzfON×\u009a\u009aÝ¯Ò¾\u0019\u008aó4\u0014Ðe\u001b¿Å\u0085\u008d\u009d\u0081î±T\u001d\u0087ð\u009airz¯\u009d\u0092o&ã\u0005Ä\u0082\u0010\u0089\u001d<\u00894_¹â3í\u00193ÙìÙö0Ä\u0003BÀ\u0092Z\u0083LlcÚª\u0003õ¹ÌóÍLB©\u001b\u0088\u0005#>è*Tåïw+Gp\u0092\u000f<X\u007f\u00874D\r[WÈ5 Vµb½\u0005\u0006S²\u0011ç¯f&í\u008a3ÍG\nãÍû\u0016»\u0018\u009e\\x-ø\u009f8HUÖwB&\u0003\u0094Û©Ë1ÂÄ·ä¾%\u0002lÑ\"\bÊxf\u0006\u009bJ\u008a0ª\u008fKùu;Å À)f\u0093Ä§;\u0084\u0019\u009ag\bWÞD\"i#@yC\u0094VUÅ]´NÊ y¤¢\b\u0018\u0019Ò\u009e6\u0016A§ÒíÞÙÓæ\u009fy\u0010\u0006CB9ÆvR1h\u0013ñ¹¸Q<\u0085[Îq7{ïü\u0014\u0005o\u0013ÛÍ©ýk'ê`ý\u000bh!fïKÖ*iÌÀ\u0012¯X+ùy°Új¥z\u009f\u0086Ì\u0099÷HÉ\u0092\u0099´ø\u0002|#h\u0018ë¨$Û\u001cÌ\u0090ÝK\u0007r\"Yã\u0000Ú\u0095\rÒ\u001dú¿\u001a¢<ÉÕ¶×\u0007/\u0088z¡¹o¹\u008b<HX¹\u0093\u001bS|\u0097ªv\u0090\u000büî\u0004±\u0018äP\u0000\u009fjG\u0092\u0017¬I\u000e\u0092\u0095×o}àó\u0089À\u0097\u0099Ûo¨C\u0003\fæÂ\tÆÂõá\u00ad_\u00ad|Ë\u00ad4\u008bGñ4\u0082§ãbni\u000b´×ª";
      int var8 = "ÉQ\u0092\u001fÝ\u0088¥xÏÝáO\u0003Ê¼6¸ÈM(Á0\u0088\u001c\r\u0098\u0095\u009f\u001cÔ2!ë\u008bvRþ\u008d\u0098\u0094Wú¬a:èÏ·\u009d!Èqïäª\u0015 Å\u0001Y.ëc\u0011\u000fÛÏ\u007fôèK/K%¾TBF\u0092J+±,\u0010 )\u0001Ü\u0081\u0010\u0082Òw\u0018\u0006x\u009aÞqß\u0086ö5_,h\u0010îÁªÃ¶Ð ¸ ô\u00976_J°Ð\u0018\u0082¹¨ò\u0015p¥¬\u0080É!ãD\u0006\u0097\u0092\u0084v/n\u0002Ó<\u001a |,zK\u007fñ³;\u0081tósã\u000f\u001bïÈA\u008e\u0006¹Ñ\u008b\u001a6\u001esÿíZ0´ ¶ÉO\u009aÎXÌ=9y\u0096c%\u008a§vÑAÒOÎ\u0081o\u008a\u009bx§¥#\u001a\u0018| òO;\u008dä\u0017þÒ\u0095Z\u0091ü\u000eÍ_\u0082F¨¬:Üõd-¹7õ_ EDH\u0018Ê\u0002Ú1|ÕØl\t\u009b\u000fèx\u0099JÀ\u0083×Ð|\u001cGKF\u001802Y.\u009ak\u0006\u009b\u0019\u008b@Öp\u0096¡\u0091Ñ¬\u0091 Ièè\b\u00102U^íü\r2N\u009d)¶\rô\u0000õü@\u00884$º>¼\u0014ôí¯§¢óD\u00ad\u0084ÂmzÇzfON×\u009a\u009aÝ¯Ò¾\u0019\u008aó4\u0014Ðe\u001b¿Å\u0085\u008d\u009d\u0081î±T\u001d\u0087ð\u009airz¯\u009d\u0092o&ã\u0005Ä\u0082\u0010\u0089\u001d<\u00894_¹â3í\u00193ÙìÙö0Ä\u0003BÀ\u0092Z\u0083LlcÚª\u0003õ¹ÌóÍLB©\u001b\u0088\u0005#>è*Tåïw+Gp\u0092\u000f<X\u007f\u00874D\r[WÈ5 Vµb½\u0005\u0006S²\u0011ç¯f&í\u008a3ÍG\nãÍû\u0016»\u0018\u009e\\x-ø\u009f8HUÖwB&\u0003\u0094Û©Ë1ÂÄ·ä¾%\u0002lÑ\"\bÊxf\u0006\u009bJ\u008a0ª\u008fKùu;Å À)f\u0093Ä§;\u0084\u0019\u009ag\bWÞD\"i#@yC\u0094VUÅ]´NÊ y¤¢\b\u0018\u0019Ò\u009e6\u0016A§ÒíÞÙÓæ\u009fy\u0010\u0006CB9ÆvR1h\u0013ñ¹¸Q<\u0085[Îq7{ïü\u0014\u0005o\u0013ÛÍ©ýk'ê`ý\u000bh!fïKÖ*iÌÀ\u0012¯X+ùy°Új¥z\u009f\u0086Ì\u0099÷HÉ\u0092\u0099´ø\u0002|#h\u0018ë¨$Û\u001cÌ\u0090ÝK\u0007r\"Yã\u0000Ú\u0095\rÒ\u001dú¿\u001a¢<ÉÕ¶×\u0007/\u0088z¡¹o¹\u008b<HX¹\u0093\u001bS|\u0097ªv\u0090\u000büî\u0004±\u0018äP\u0000\u009fjG\u0092\u0017¬I\u000e\u0092\u0095×o}àó\u0089À\u0097\u0099Ûo¨C\u0003\fæÂ\tÆÂõá\u00ad_\u00ad|Ë\u00ad4\u008bGñ4\u0082§ãbni\u000b´×ª"
         .length();
      char var5 = '8';
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
                     d = new String[21];
                     rld = LogManager.getLogger();
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

                  var6 = "\u00874\u0016ÁbÒ,\u0085\u0014èe\u000b\u0002)ñE ¸:\u0084ï©7\u000ekC\u0094N\u0000\u0083ï0ËÅ\u0097\u000fð_\u0092qøc\u0090fM®ÆÙc";
                  var8 = "\u00874\u0016ÁbÒ,\u0085\u0014èe\u000b\u0002)ñE ¸:\u0084ï©7\u000ekC\u0094N\u0000\u0083ï0ËÅ\u0097\u000fð_\u0092qøc\u0090fM®ÆÙc"
                     .length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1356;
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
            throw new RuntimeException("buu", var10);
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
         throw new RuntimeException("buu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
