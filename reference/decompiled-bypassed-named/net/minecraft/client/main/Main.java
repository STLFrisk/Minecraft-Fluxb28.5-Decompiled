package net.minecraft.client.main;

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

public class Main {
   private static int[] a;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public static void main(String[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic net/minecraft/client/main/Main.b J
      // 003: ldc2_w 32524376295263
      // 006: lxor
      // 007: lstore 1
      // 008: sipush 6559
      // 00b: ldc2_w 1610197532353959852
      // 00e: lload 1
      // 00f: lxor
      // 010: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 015: nop
      // 016: sipush 15094
      // 019: ldc2_w 1519416581488260309
      // 01c: lload 1
      // 01d: lxor
      // 01e: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: nop
      // 024: invokestatic java/lang/System.setProperty (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 027: pop
      // 028: new joptsimple/OptionParser
      // 02b: dup
      // 02c: invokespecial joptsimple/OptionParser.<init> ()V
      // 02f: astore 4
      // 031: aload 4
      // 033: invokevirtual joptsimple/OptionParser.allowsUnrecognizedOptions ()V
      // 036: aload 4
      // 038: sipush 5052
      // 03b: ldc2_w 4723004010122976644
      // 03e: lload 1
      // 03f: lxor
      // 040: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: nop
      // 046: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 049: pop
      // 04a: aload 4
      // 04c: sipush 23787
      // 04f: ldc2_w 8155931924397085388
      // 052: lload 1
      // 053: lxor
      // 054: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: nop
      // 05a: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 05d: pop
      // 05e: aload 4
      // 060: sipush 20154
      // 063: ldc2_w 5664843688304656524
      // 066: lload 1
      // 067: lxor
      // 068: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: nop
      // 06e: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 071: pop
      // 072: invokestatic net/minecraft/client/main/Main.b ()[I
      // 075: aload 4
      // 077: sipush 28593
      // 07a: ldc2_w 8383322298590224787
      // 07d: lload 1
      // 07e: lxor
      // 07f: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: nop
      // 085: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 088: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 08b: astore 5
      // 08d: aload 4
      // 08f: sipush 3252
      // 092: ldc2_w 7249593538779939474
      // 095: lload 1
      // 096: lxor
      // 097: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: nop
      // 09d: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 0a0: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 0a3: astore 6
      // 0a5: aload 4
      // 0a7: sipush 17979
      // 0aa: ldc2_w 6712417016831657984
      // 0ad: lload 1
      // 0ae: lxor
      // 0af: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: nop
      // 0b5: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 0b8: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 0bb: ldc java/lang/Integer
      // 0bd: nop
      // 0be: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.ofType (Ljava/lang/Class;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 0c1: sipush 25565
      // 0c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c7: bipush 0
      // 0c8: anewarray 2
      // 0cb: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 0ce: astore 7
      // 0d0: aload 4
      // 0d2: sipush 19109
      // 0d5: ldc2_w 2851188642720367769
      // 0d8: lload 1
      // 0d9: lxor
      // 0da: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 0e3: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 0e6: ldc java/io/File
      // 0e8: nop
      // 0e9: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.ofType (Ljava/lang/Class;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 0ec: new java/io/File
      // 0ef: dup
      // 0f0: ldc "."
      // 0f2: nop
      // 0f3: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0f6: bipush 0
      // 0f7: anewarray 3
      // 0fa: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 0fd: astore 8
      // 0ff: aload 4
      // 101: sipush 1154
      // 104: ldc2_w 8616249830331714224
      // 107: lload 1
      // 108: lxor
      // 109: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: nop
      // 10f: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 112: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 115: ldc java/io/File
      // 117: nop
      // 118: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.ofType (Ljava/lang/Class;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 11b: astore 9
      // 11d: aload 4
      // 11f: sipush 30857
      // 122: ldc2_w 8986623857665275554
      // 125: lload 1
      // 126: lxor
      // 127: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: nop
      // 12d: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 130: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 133: ldc java/io/File
      // 135: nop
      // 136: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.ofType (Ljava/lang/Class;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 139: astore 10
      // 13b: aload 4
      // 13d: sipush 3944
      // 140: ldc2_w 3225011541989884246
      // 143: lload 1
      // 144: lxor
      // 145: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: nop
      // 14b: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 14e: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 151: astore 11
      // 153: astore 3
      // 154: aload 4
      // 156: sipush 5346
      // 159: ldc2_w 6431911048738806466
      // 15c: lload 1
      // 15d: lxor
      // 15e: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: nop
      // 164: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 167: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 16a: sipush 2469
      // 16d: ldc2_w 8022478218077308848
      // 170: lload 1
      // 171: lxor
      // 172: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: nop
      // 178: bipush 0
      // 179: anewarray 5
      // 17c: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 17f: ldc java/lang/Integer
      // 181: nop
      // 182: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.ofType (Ljava/lang/Class;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 185: astore 12
      // 187: aload 4
      // 189: sipush 23853
      // 18c: ldc2_w 3176547593104741122
      // 18f: lload 1
      // 190: lxor
      // 191: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: nop
      // 197: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 19a: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 19d: astore 13
      // 19f: aload 4
      // 1a1: sipush 8608
      // 1a4: ldc2_w 7671429727422427022
      // 1a7: lload 1
      // 1a8: lxor
      // 1a9: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: nop
      // 1af: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 1b2: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 1b5: astore 14
      // 1b7: aload 4
      // 1b9: sipush 15308
      // 1bc: ldc2_w 6909135094831068669
      // 1bf: lload 1
      // 1c0: lxor
      // 1c1: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: nop
      // 1c7: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 1ca: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 1cd: new java/lang/StringBuilder
      // 1d0: dup
      // 1d1: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d4: sipush 8488
      // 1d7: ldc2_w 3130553591945473843
      // 1da: lload 1
      // 1db: lxor
      // 1dc: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: nop
      // 1e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e5: invokestatic Minecraft.qgs ()J
      // 1e8: ldc2_w 1000
      // 1eb: lrem
      // 1ec: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 1ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f2: bipush 0
      // 1f3: anewarray 5
      // 1f6: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 1f9: astore 15
      // 1fb: aload 4
      // 1fd: sipush 23240
      // 200: ldc2_w 4449677505476613340
      // 203: lload 1
      // 204: lxor
      // 205: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: nop
      // 20b: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 20e: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 211: astore 16
      // 213: aload 4
      // 215: sipush 6763
      // 218: ldc2_w 4668495650417153095
      // 21b: lload 1
      // 21c: lxor
      // 21d: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: nop
      // 223: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 226: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 229: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.required ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 22c: astore 17
      // 22e: aload 4
      // 230: sipush 24956
      // 233: ldc2_w 7867422965460692824
      // 236: lload 1
      // 237: lxor
      // 238: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: nop
      // 23e: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 241: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 244: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.required ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 247: astore 18
      // 249: aload 4
      // 24b: sipush 2343
      // 24e: ldc2_w 2946447020869748509
      // 251: lload 1
      // 252: lxor
      // 253: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: nop
      // 259: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 25c: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 25f: ldc java/lang/Integer
      // 261: nop
      // 262: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.ofType (Ljava/lang/Class;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 265: sipush 1280
      // 268: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 26b: bipush 0
      // 26c: anewarray 2
      // 26f: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 272: astore 19
      // 274: aload 4
      // 276: sipush 30568
      // 279: ldc2_w 7017418762128882032
      // 27c: lload 1
      // 27d: lxor
      // 27e: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: nop
      // 284: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 287: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 28a: ldc java/lang/Integer
      // 28c: nop
      // 28d: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.ofType (Ljava/lang/Class;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 290: sipush 720
      // 293: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 296: bipush 0
      // 297: anewarray 2
      // 29a: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 29d: astore 20
      // 29f: aload 4
      // 2a1: sipush 28167
      // 2a4: ldc2_w 2863020600629092377
      // 2a7: lload 1
      // 2a8: lxor
      // 2a9: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: nop
      // 2af: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 2b2: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 2b5: sipush 32722
      // 2b8: ldc2_w 1617476359753331170
      // 2bb: lload 1
      // 2bc: lxor
      // 2bd: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: nop
      // 2c3: bipush 0
      // 2c4: anewarray 5
      // 2c7: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 2ca: astore 21
      // 2cc: aload 4
      // 2ce: sipush 31025
      // 2d1: ldc2_w 5463253757632345868
      // 2d4: lload 1
      // 2d5: lxor
      // 2d6: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: nop
      // 2dc: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 2df: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 2e2: sipush 31664
      // 2e5: ldc2_w 152590999816500634
      // 2e8: lload 1
      // 2e9: lxor
      // 2ea: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ef: nop
      // 2f0: bipush 0
      // 2f1: anewarray 5
      // 2f4: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 2f7: astore 22
      // 2f9: aload 4
      // 2fb: sipush 15596
      // 2fe: ldc2_w 6439008521213194992
      // 301: lload 1
      // 302: lxor
      // 303: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: nop
      // 309: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 30c: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 30f: astore 23
      // 311: aload 4
      // 313: sipush 15446
      // 316: ldc2_w 8895679575666340427
      // 319: lload 1
      // 31a: lxor
      // 31b: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: nop
      // 321: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 324: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 327: sipush 11209
      // 32a: ldc2_w 4225800136514217468
      // 32d: lload 1
      // 32e: lxor
      // 32f: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: nop
      // 335: bipush 0
      // 336: anewarray 5
      // 339: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 33c: astore 24
      // 33e: aload 4
      // 340: sipush 13644
      // 343: ldc2_w 7835679055220587381
      // 346: lload 1
      // 347: lxor
      // 348: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34d: nop
      // 34e: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 351: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 354: ldc ""
      // 356: nop
      // 357: bipush 0
      // 358: anewarray 5
      // 35b: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 35e: astore 25
      // 360: aload 4
      // 362: sipush 27531
      // 365: ldc2_w 1782543428044383658
      // 368: lload 1
      // 369: lxor
      // 36a: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36f: nop
      // 370: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 373: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 376: ldc ""
      // 378: nop
      // 379: bipush 0
      // 37a: anewarray 5
      // 37d: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 380: astore 26
      // 382: aload 4
      // 384: sipush 26620
      // 387: ldc2_w 8135777529026111973
      // 38a: lload 1
      // 38b: lxor
      // 38c: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 391: nop
      // 392: invokevirtual joptsimple/OptionParser.accepts (Ljava/lang/String;)Ljoptsimple/OptionSpecBuilder;
      // 395: invokevirtual joptsimple/OptionSpecBuilder.withRequiredArg ()Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 398: invokestatic java/util/Locale.getDefault ()Ljava/util/Locale;
      // 39b: invokevirtual java/util/Locale.getCountry ()Ljava/lang/String;
      // 39e: bipush 0
      // 39f: anewarray 5
      // 3a2: invokevirtual joptsimple/ArgumentAcceptingOptionSpec.defaultsTo (Ljava/lang/Object;[Ljava/lang/Object;)Ljoptsimple/ArgumentAcceptingOptionSpec;
      // 3a5: astore 27
      // 3a7: aload 4
      // 3a9: invokevirtual joptsimple/OptionParser.nonOptions ()Ljoptsimple/NonOptionArgumentSpec;
      // 3ac: astore 28
      // 3ae: aload 4
      // 3b0: aload 0
      // 3b1: invokevirtual joptsimple/OptionParser.parse ([Ljava/lang/String;)Ljoptsimple/OptionSet;
      // 3b4: astore 29
      // 3b6: aload 29
      // 3b8: aload 25
      // 3ba: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 3bd: checkcast java/lang/String
      // 3c0: ldc ""
      // 3c2: nop
      // 3c3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3c6: aload 3
      // 3c7: ifnull 43f
      // 3ca: ifne 421
      // 3cd: goto 3d4
      // 3d0: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d3: athrow
      // 3d4: aload 29
      // 3d6: aload 26
      // 3d8: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 3db: checkcast java/lang/String
      // 3de: ldc ""
      // 3e0: nop
      // 3e1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3e4: aload 3
      // 3e5: ifnull 43f
      // 3e8: goto 3ef
      // 3eb: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ee: athrow
      // 3ef: ifne 421
      // 3f2: goto 3f9
      // 3f5: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f8: athrow
      // 3f9: bipush 2
      // 3fa: anewarray 5
      // 3fd: dup
      // 3fe: bipush 0
      // 3ff: aload 29
      // 401: aload 25
      // 403: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 406: checkcast java/lang/String
      // 409: aastore
      // 40a: dup
      // 40b: bipush 1
      // 40c: aload 29
      // 40e: aload 26
      // 410: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 413: checkcast java/lang/String
      // 416: aastore
      // 417: putstatic LoginScreen.lyu [Ljava/lang/String;
      // 41a: goto 421
      // 41d: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 420: athrow
      // 421: aload 29
      // 423: aload 27
      // 425: invokevirtual joptsimple/OptionSet.valuesOf (Ljoptsimple/OptionSpec;)Ljava/util/List;
      // 428: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 42b: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 42e: sipush 17180
      // 431: ldc2_w 4443171350620163381
      // 434: lload 1
      // 435: lxor
      // 436: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43b: nop
      // 43c: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 43f: putstatic Session.wpz Z
      // 442: aload 29
      // 444: aload 28
      // 446: invokevirtual joptsimple/OptionSet.valuesOf (Ljoptsimple/OptionSpec;)Ljava/util/List;
      // 449: astore 30
      // 44b: aload 30
      // 44d: aload 3
      // 44e: ifnull 494
      // 451: invokeinterface java/util/List.isEmpty ()Z 1
      // 456: ifne 48d
      // 459: goto 460
      // 45c: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45f: athrow
      // 460: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 463: new java/lang/StringBuilder
      // 466: dup
      // 467: invokespecial java/lang/StringBuilder.<init> ()V
      // 46a: sipush 15877
      // 46d: ldc2_w 1076238728596533297
      // 470: lload 1
      // 471: lxor
      // 472: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 477: nop
      // 478: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47b: aload 30
      // 47d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 480: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 483: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 486: goto 48d
      // 489: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48c: athrow
      // 48d: aload 29
      // 48f: aload 11
      // 491: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 494: checkcast java/lang/String
      // 497: astore 31
      // 499: getstatic java/net/Proxy.NO_PROXY Ljava/net/Proxy;
      // 49c: astore 32
      // 49e: aload 31
      // 4a0: aload 3
      // 4a1: ifnull 4df
      // 4a4: ifnull 4d5
      // 4a7: goto 4ae
      // 4aa: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ad: athrow
      // 4ae: new java/net/Proxy
      // 4b1: dup
      // 4b2: getstatic java/net/Proxy$Type.SOCKS Ljava/net/Proxy$Type;
      // 4b5: new java/net/InetSocketAddress
      // 4b8: dup
      // 4b9: aload 31
      // 4bb: aload 29
      // 4bd: aload 12
      // 4bf: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 4c2: checkcast java/lang/Integer
      // 4c5: invokevirtual java/lang/Integer.intValue ()I
      // 4c8: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 4cb: invokespecial java/net/Proxy.<init> (Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
      // 4ce: astore 32
      // 4d0: goto 4d5
      // 4d3: astore 33
      // 4d5: aload 29
      // 4d7: aload 13
      // 4d9: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 4dc: checkcast java/lang/String
      // 4df: astore 33
      // 4e1: aload 29
      // 4e3: aload 14
      // 4e5: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 4e8: checkcast java/lang/String
      // 4eb: astore 34
      // 4ed: aload 32
      // 4ef: getstatic java/net/Proxy.NO_PROXY Ljava/net/Proxy;
      // 4f2: invokevirtual java/net/Proxy.equals (Ljava/lang/Object;)Z
      // 4f5: aload 3
      // 4f6: ifnull 559
      // 4f9: ifne 54c
      // 4fc: goto 503
      // 4ff: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 502: athrow
      // 503: aload 33
      // 505: invokestatic net/minecraft/client/main/Main.rfb (Ljava/lang/String;)Z
      // 508: aload 3
      // 509: ifnull 559
      // 50c: goto 513
      // 50f: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 512: athrow
      // 513: ifeq 54c
      // 516: goto 51d
      // 519: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51c: athrow
      // 51d: aload 34
      // 51f: invokestatic net/minecraft/client/main/Main.rfb (Ljava/lang/String;)Z
      // 522: aload 3
      // 523: ifnull 559
      // 526: goto 52d
      // 529: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52c: athrow
      // 52d: ifeq 54c
      // 530: goto 537
      // 533: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 536: athrow
      // 537: new net/minecraft/client/main/Main$1
      // 53a: dup
      // 53b: aload 33
      // 53d: aload 34
      // 53f: invokespecial net/minecraft/client/main/Main$1.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 542: invokestatic java/net/Authenticator.setDefault (Ljava/net/Authenticator;)V
      // 545: goto 54c
      // 548: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54b: athrow
      // 54c: aload 29
      // 54e: aload 19
      // 550: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 553: checkcast java/lang/Integer
      // 556: invokevirtual java/lang/Integer.intValue ()I
      // 559: istore 35
      // 55b: aload 29
      // 55d: aload 20
      // 55f: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 562: checkcast java/lang/Integer
      // 565: invokevirtual java/lang/Integer.intValue ()I
      // 568: istore 36
      // 56a: aload 29
      // 56c: sipush 20649
      // 56f: ldc2_w 2928659140730052236
      // 572: lload 1
      // 573: lxor
      // 574: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 579: nop
      // 57a: invokevirtual joptsimple/OptionSet.has (Ljava/lang/String;)Z
      // 57d: istore 37
      // 57f: aload 29
      // 581: sipush 13593
      // 584: ldc2_w 3911948214931274548
      // 587: lload 1
      // 588: lxor
      // 589: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58e: nop
      // 58f: invokevirtual joptsimple/OptionSet.has (Ljava/lang/String;)Z
      // 592: istore 38
      // 594: aload 29
      // 596: sipush 24486
      // 599: ldc2_w 9041932376545415566
      // 59c: lload 1
      // 59d: lxor
      // 59e: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a3: nop
      // 5a4: invokevirtual joptsimple/OptionSet.has (Ljava/lang/String;)Z
      // 5a7: istore 39
      // 5a9: aload 29
      // 5ab: aload 18
      // 5ad: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 5b0: checkcast java/lang/String
      // 5b3: astore 40
      // 5b5: new com/google/gson/GsonBuilder
      // 5b8: dup
      // 5b9: invokespecial com/google/gson/GsonBuilder.<init> ()V
      // 5bc: ldc com/mojang/authlib/properties/PropertyMap
      // 5be: nop
      // 5bf: new com/mojang/authlib/properties/PropertyMap$Serializer
      // 5c2: dup
      // 5c3: invokespecial com/mojang/authlib/properties/PropertyMap$Serializer.<init> ()V
      // 5c6: invokevirtual com/google/gson/GsonBuilder.registerTypeAdapter (Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;
      // 5c9: invokevirtual com/google/gson/GsonBuilder.create ()Lcom/google/gson/Gson;
      // 5cc: astore 41
      // 5ce: aload 41
      // 5d0: aload 29
      // 5d2: aload 21
      // 5d4: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 5d7: checkcast java/lang/String
      // 5da: ldc com/mojang/authlib/properties/PropertyMap
      // 5dc: nop
      // 5dd: invokevirtual com/google/gson/Gson.fromJson (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 5e0: checkcast com/mojang/authlib/properties/PropertyMap
      // 5e3: astore 42
      // 5e5: aload 41
      // 5e7: aload 29
      // 5e9: aload 22
      // 5eb: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 5ee: checkcast java/lang/String
      // 5f1: ldc com/mojang/authlib/properties/PropertyMap
      // 5f3: nop
      // 5f4: invokevirtual com/google/gson/Gson.fromJson (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 5f7: checkcast com/mojang/authlib/properties/PropertyMap
      // 5fa: astore 43
      // 5fc: aload 29
      // 5fe: aload 8
      // 600: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 603: checkcast java/io/File
      // 606: astore 44
      // 608: aload 29
      // 60a: aload 9
      // 60c: aload 3
      // 60d: ifnull 628
      // 610: invokevirtual joptsimple/OptionSet.has (Ljoptsimple/OptionSpec;)Z
      // 613: ifeq 631
      // 616: goto 61d
      // 619: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61c: athrow
      // 61d: aload 29
      // 61f: aload 9
      // 621: goto 628
      // 624: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 627: athrow
      // 628: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 62b: checkcast java/io/File
      // 62e: goto 648
      // 631: new java/io/File
      // 634: dup
      // 635: aload 44
      // 637: sipush 10178
      // 63a: ldc2_w 9115564641538157053
      // 63d: lload 1
      // 63e: lxor
      // 63f: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 644: nop
      // 645: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 648: astore 45
      // 64a: aload 29
      // 64c: aload 10
      // 64e: aload 3
      // 64f: ifnull 66a
      // 652: invokevirtual joptsimple/OptionSet.has (Ljoptsimple/OptionSpec;)Z
      // 655: ifeq 673
      // 658: goto 65f
      // 65b: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65e: athrow
      // 65f: aload 29
      // 661: aload 10
      // 663: goto 66a
      // 666: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 669: athrow
      // 66a: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 66d: checkcast java/io/File
      // 670: goto 68a
      // 673: new java/io/File
      // 676: dup
      // 677: aload 44
      // 679: sipush 3222
      // 67c: ldc2_w 4321118035391251084
      // 67f: lload 1
      // 680: lxor
      // 681: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 686: nop
      // 687: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 68a: astore 46
      // 68c: aload 29
      // 68e: aload 3
      // 68f: ifnull 6bd
      // 692: aload 16
      // 694: invokevirtual joptsimple/OptionSet.has (Ljoptsimple/OptionSpec;)Z
      // 697: ifeq 6b4
      // 69a: goto 6a1
      // 69d: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a0: athrow
      // 6a1: aload 16
      // 6a3: aload 29
      // 6a5: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 6aa: checkcast java/lang/String
      // 6ad: goto 6c0
      // 6b0: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b3: athrow
      // 6b4: aload 15
      // 6b6: aload 29
      // 6b8: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 6bd: checkcast java/lang/String
      // 6c0: astore 47
      // 6c2: aload 29
      // 6c4: aload 3
      // 6c5: ifnull 6e7
      // 6c8: aload 23
      // 6ca: invokevirtual joptsimple/OptionSet.has (Ljoptsimple/OptionSpec;)Z
      // 6cd: ifeq 6ed
      // 6d0: goto 6d7
      // 6d3: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d6: athrow
      // 6d7: aload 23
      // 6d9: aload 29
      // 6db: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 6e0: goto 6e7
      // 6e3: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e6: athrow
      // 6e7: checkcast java/lang/String
      // 6ea: goto 6ee
      // 6ed: aconst_null
      // 6ee: astore 48
      // 6f0: aload 29
      // 6f2: aload 5
      // 6f4: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 6f7: checkcast java/lang/String
      // 6fa: astore 49
      // 6fc: aload 29
      // 6fe: aload 7
      // 700: invokevirtual joptsimple/OptionSet.valueOf (Ljoptsimple/OptionSpec;)Ljava/lang/Object;
      // 703: checkcast java/lang/Integer
      // 706: astore 50
      // 708: new rh0
      // 70b: dup
      // 70c: aload 15
      // 70e: aload 29
      // 710: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 715: checkcast java/lang/String
      // 718: aload 47
      // 71a: aload 17
      // 71c: aload 29
      // 71e: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 723: checkcast java/lang/String
      // 726: aload 24
      // 728: aload 29
      // 72a: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 72f: checkcast java/lang/String
      // 732: invokespecial rh0.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 735: astore 51
      // 737: aload 6
      // 739: aload 3
      // 73a: ifnull 757
      // 73d: ifnull 800
      // 740: goto 747
      // 743: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 746: athrow
      // 747: aload 6
      // 749: aload 29
      // 74b: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 750: goto 757
      // 753: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 756: athrow
      // 757: aload 3
      // 758: ifnull 775
      // 75b: ifnull 800
      // 75e: goto 765
      // 761: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 764: athrow
      // 765: aload 6
      // 767: aload 29
      // 769: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 76e: goto 775
      // 771: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 774: athrow
      // 775: checkcast java/lang/String
      // 778: aload 3
      // 779: ifnull 79f
      // 77c: ldc ":"
      // 77e: nop
      // 77f: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 782: ifeq 800
      // 785: goto 78c
      // 788: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78b: athrow
      // 78c: aload 6
      // 78e: aload 29
      // 790: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 795: checkcast java/lang/String
      // 798: goto 79f
      // 79b: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79e: athrow
      // 79f: astore 52
      // 7a1: aload 52
      // 7a3: ldc ":"
      // 7a5: nop
      // 7a6: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 7a9: bipush 0
      // 7aa: aaload
      // 7ab: aload 52
      // 7ad: ldc ":"
      // 7af: nop
      // 7b0: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 7b3: bipush 1
      // 7b4: aaload
      // 7b5: invokestatic zfs.kph (Ljava/lang/String;Ljava/lang/String;)Lrh0;
      // 7b8: astore 51
      // 7ba: aload 51
      // 7bc: aload 3
      // 7bd: ifnull 7fe
      // 7c0: ifnonnull 800
      // 7c3: goto 7ca
      // 7c6: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c9: athrow
      // 7ca: new rh0
      // 7cd: dup
      // 7ce: aload 15
      // 7d0: aload 29
      // 7d2: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 7d7: checkcast java/lang/String
      // 7da: aload 47
      // 7dc: aload 17
      // 7de: aload 29
      // 7e0: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 7e5: checkcast java/lang/String
      // 7e8: aload 24
      // 7ea: aload 29
      // 7ec: invokeinterface joptsimple/OptionSpec.value (Ljoptsimple/OptionSet;)Ljava/lang/Object; 2
      // 7f1: checkcast java/lang/String
      // 7f4: invokespecial rh0.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 7f7: goto 7fe
      // 7fa: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7fd: athrow
      // 7fe: astore 51
      // 800: new xps
      // 803: dup
      // 804: new xps$_pg
      // 807: dup
      // 808: aload 51
      // 80a: aload 42
      // 80c: aload 43
      // 80e: aload 32
      // 810: invokespecial xps$_pg.<init> (Lrh0;Lcom/mojang/authlib/properties/PropertyMap;Lcom/mojang/authlib/properties/PropertyMap;Ljava/net/Proxy;)V
      // 813: new xps$doj
      // 816: dup
      // 817: iload 35
      // 819: iload 36
      // 81b: iload 37
      // 81d: iload 38
      // 81f: invokespecial xps$doj.<init> (IIZZ)V
      // 822: new xps$bk2
      // 825: dup
      // 826: aload 44
      // 828: aload 46
      // 82a: aload 45
      // 82c: aload 48
      // 82e: invokespecial xps$bk2.<init> (Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
      // 831: new xps$wil
      // 834: dup
      // 835: iload 39
      // 837: aload 40
      // 839: invokespecial xps$wil.<init> (ZLjava/lang/String;)V
      // 83c: new xps$m6v
      // 83f: dup
      // 840: aload 49
      // 842: aload 50
      // 844: invokevirtual java/lang/Integer.intValue ()I
      // 847: invokespecial xps$m6v.<init> (Ljava/lang/String;I)V
      // 84a: invokespecial xps.<init> (Lxps$_pg;Lxps$doj;Lxps$bk2;Lxps$wil;Lxps$m6v;)V
      // 84d: astore 52
      // 84f: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 852: new net/minecraft/client/main/Main$2
      // 855: dup
      // 856: sipush 13115
      // 859: ldc2_w 6225158910402084108
      // 85c: lload 1
      // 85d: lxor
      // 85e: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 863: nop
      // 864: invokespecial net/minecraft/client/main/Main$2.<init> (Ljava/lang/String;)V
      // 867: invokevirtual java/lang/Runtime.addShutdownHook (Ljava/lang/Thread;)V
      // 86a: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 86d: sipush 21185
      // 870: ldc2_w 174689098699365598
      // 873: lload 1
      // 874: lxor
      // 875: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/client/main/Main.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87a: nop
      // 87b: invokevirtual java/lang/Thread.setName (Ljava/lang/String;)V
      // 87e: new Minecraft
      // 881: dup
      // 882: aload 52
      // 884: invokespecial Minecraft.<init> (Lxps;)V
      // 887: invokevirtual Minecraft.z11 ()V
      // 88a: aload 3
      // 88b: ifnonnull 89c
      // 88e: bipush 3
      // 88f: anewarray 336
      // 892: invokestatic EntityLivingBase.b ([Li2h;)V
      // 895: goto 89c
      // 898: invokestatic net/minecraft/client/main/Main.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89b: athrow
      // 89c: return
   }

   private static boolean rfb(String var0) {
      int[] var1 = b();

      String var10000;
      label33: {
         try {
            var10000 = var0;
            if (var1 == null) {
               break label33;
            }

            if (var0 == null) {
               return false;
            }
         } catch (oov var3) {
            throw a(var3);
         }

         var10000 = var0;
      }

      try {
         boolean var4 = var10000.isEmpty();
         if (var1 == null) {
            return var4;
         }

         if (!var4) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6971624922116601237L, 1155648336501204163L, MethodHandles.lookup().lookupClass()).a(19442434940537L);
      // $VF: monitorexit
      b = var10000;
      int[] var13 = new int[3];
      b(var13);
      long var0 = b ^ 68026720821625L;
      Cipher var2;
      Cipher var14 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[42];
      int var7 = 0;
      String var6 = "\u0089Ö'+|\b¥Fl\u0010\u0092©9õ\u00ad\u008d(º\u0086\u0092Ü\u0010¶\u0091¡¥\u0017\"\u0016J[ÆÃú±\u009b*¤G\u008b¤\u0083.Á¤\u0017Ôù{XM,¡÷þ\fÁ \u0092\u009fÁ¯J\u008b\u008c±\u0099èÍ<ÄÏUa\u0085{¥/ \u0095tT\u0086\u0099;ì-\")²\u0010!\u009fPz_Áè\u000e\u0014\u0019öôJ\b¾\u0007\u0010þ\b®\u001bQ\u000b\u0089\u0004\u0017\u009b\u0002\u0015¿T\u0019J \u0097T\u0015\u0092ÉjÔÁb:\u001ds\u001c@D/\u0095\u008b®e\u000bkõf\u0084\u0098by¢èCß\u0010RÂ!TIáÏ\u0017ðÜx®°\u001f¢\u0091\u0010¡ç^Úþï°jåÛöÎS\u00ad+û8\u0014¦\u0092óqPÅ\u008e\u0092\u0081&3\u008aG\u009c+\u0017Å\u0013¦e¸`\u008b\tæ\u007f 6ºv\u0094\u001b^*µI\u0015Þä3\u000f` \u008a\u001dpÄ\u0011Ö\u008e\u0090y.Íü\u0010ñÂqØèº{0»zá¾Dº.| \u008fÈ8\u0016U`5?É<ï\u0002\u0007Ä\u000f\\·b\u0096\u0097R\u0090x\u0083\u0092]áoL&,¤(¹\u009avïÛ\n¾\u0087À]ÿ\u00838³ÏS ±3_Ú\u0010yßbìv\u008fª\u0001\u0001`üs\u009b2\u0097Jí\u0089\u0010\u009e>Ë\bHí&\u0094\u0086-Ç¸\u0092Îôî\u0018\\\t+O\u0098ø¢M\u0015ÝÔa¸\u0083©Ow%ie'J\u0001\u0001\u0018À\u0002\u009bÀ\u0088©®¤lýÊO\u0084\fbND¢\u0003aB\u0096\u0014§0\"\u00815øeªÍA\u0087Û:\u008eï8izêØÐl8í\u007f~,ÔºB¯£\b\u0085iW7P\u0099IµÌ;v?ªîkl\u001d hÁÁ{ø}\fÛ¤\u0012 ËP\u0002HèÚ3©i\u0010g|êûð\u0096\u0019\u0089êN¤ Au\u008fÕ¹¿Avápj\u008e§ã¿â¨_\bàò\u001a\u0083³¤êQÔá\u0083\u009fÒ\u00181´Vå\u001b©JÊÓßW\u0011ËZ]DÇÚ\"`ýþÓé\u0018 ®y1÷²úHÀÛ\u0087·º´vPmp\u001c\u0007Ê\u008bN\u0000\u0010Qã´\u000b<\u0005\u0000® ¢\\\u001b¨-\u0088^\u0010²:¸vNGX'r3 \u0011.\u0086¤+\u0010éÐ\u0091O¡\u0014õ\rçØ\u0084ååì ?\u0018\u0093î\u009b\u001a\u001b}öEØ\u0013³Ä;\u0082µ¥\u0000tÃ±p%Ø\u0099\u0010Ï\u000föÏ¤$«\u008c\u001dÖÏÛz\u009dÖ)\u0018\u000fÈ_µ.\u001cþ6qÉd©ZHÝÈ}ycí\u009böy.\u0010\u00ad\u0090Ñþ\u0016¾ä\u009cl\u001b?¿\u0004\u0099JK Ûôs¬©}ò8\u001b\u00075H<ð\u008d\rÛXqº¼\u0005\u008c\u009eX\u0004Û=Y»GX \\\"3në9s\u0006=\u0080\r\u009eKÑ\u001e|B\u008dY\u0091?*Vz9¡,\bk\u0086\u0013Ð\u0018iFZ\u0096hl\fâ\u0092lh\u0017·$\u008bó],\u0099¿\u0011þ\u0093\u0095\u0010ï\u0002mY,Mf*T|l¾\u0089¾\u001f\u0087\u0010ÐW\u0080ù\u00131\u0018§\n:R»Ò´´9 PûÜÒ¹®\u00129,\u0083\\ö2é\u0006'¯¶Q\u0097¢\u000b\u0002\u0001\u009d\u0085ìóËroc 9[,[\u009e$×®\u0085r\u001c§´º\u008aþ\u001d[\u0085æË\u0001W\u0016uCi\u0098\u0005ó\u0006I !qO\u0010Ù\u001aÊÉë\t¶\u0019Ó!ù$\u0014ãhÍ\u0018kû/¥(A\u009d\u000b\u0002D| Åë\\\u0002Itü*ô\u008581\u001e6\fk®¬ùÕ?ê\u0001÷o\u0096k6Ìib\u008e\u0010I¸\u0080ÍY4MS°À}4ØÊS\u001d\u0010I\u008b?ñ\u001f\u000f^\u009cjÊ\u009f\u0099Õq0  &\u007f\u009d$d\u001a\u0093\u0000}.Z\u007f\u0097\u0017ô;ê3\n\u0011\u0013\u0089¢³c7^\u001fg\u001a&\u0097\u0010u\u0084-\u0001ÿ+FÎÖ\u008fç$\u001b\u009cì@";
      int var8 = "\u0089Ö'+|\b¥Fl\u0010\u0092©9õ\u00ad\u008d(º\u0086\u0092Ü\u0010¶\u0091¡¥\u0017\"\u0016J[ÆÃú±\u009b*¤G\u008b¤\u0083.Á¤\u0017Ôù{XM,¡÷þ\fÁ \u0092\u009fÁ¯J\u008b\u008c±\u0099èÍ<ÄÏUa\u0085{¥/ \u0095tT\u0086\u0099;ì-\")²\u0010!\u009fPz_Áè\u000e\u0014\u0019öôJ\b¾\u0007\u0010þ\b®\u001bQ\u000b\u0089\u0004\u0017\u009b\u0002\u0015¿T\u0019J \u0097T\u0015\u0092ÉjÔÁb:\u001ds\u001c@D/\u0095\u008b®e\u000bkõf\u0084\u0098by¢èCß\u0010RÂ!TIáÏ\u0017ðÜx®°\u001f¢\u0091\u0010¡ç^Úþï°jåÛöÎS\u00ad+û8\u0014¦\u0092óqPÅ\u008e\u0092\u0081&3\u008aG\u009c+\u0017Å\u0013¦e¸`\u008b\tæ\u007f 6ºv\u0094\u001b^*µI\u0015Þä3\u000f` \u008a\u001dpÄ\u0011Ö\u008e\u0090y.Íü\u0010ñÂqØèº{0»zá¾Dº.| \u008fÈ8\u0016U`5?É<ï\u0002\u0007Ä\u000f\\·b\u0096\u0097R\u0090x\u0083\u0092]áoL&,¤(¹\u009avïÛ\n¾\u0087À]ÿ\u00838³ÏS ±3_Ú\u0010yßbìv\u008fª\u0001\u0001`üs\u009b2\u0097Jí\u0089\u0010\u009e>Ë\bHí&\u0094\u0086-Ç¸\u0092Îôî\u0018\\\t+O\u0098ø¢M\u0015ÝÔa¸\u0083©Ow%ie'J\u0001\u0001\u0018À\u0002\u009bÀ\u0088©®¤lýÊO\u0084\fbND¢\u0003aB\u0096\u0014§0\"\u00815øeªÍA\u0087Û:\u008eï8izêØÐl8í\u007f~,ÔºB¯£\b\u0085iW7P\u0099IµÌ;v?ªîkl\u001d hÁÁ{ø}\fÛ¤\u0012 ËP\u0002HèÚ3©i\u0010g|êûð\u0096\u0019\u0089êN¤ Au\u008fÕ¹¿Avápj\u008e§ã¿â¨_\bàò\u001a\u0083³¤êQÔá\u0083\u009fÒ\u00181´Vå\u001b©JÊÓßW\u0011ËZ]DÇÚ\"`ýþÓé\u0018 ®y1÷²úHÀÛ\u0087·º´vPmp\u001c\u0007Ê\u008bN\u0000\u0010Qã´\u000b<\u0005\u0000® ¢\\\u001b¨-\u0088^\u0010²:¸vNGX'r3 \u0011.\u0086¤+\u0010éÐ\u0091O¡\u0014õ\rçØ\u0084ååì ?\u0018\u0093î\u009b\u001a\u001b}öEØ\u0013³Ä;\u0082µ¥\u0000tÃ±p%Ø\u0099\u0010Ï\u000föÏ¤$«\u008c\u001dÖÏÛz\u009dÖ)\u0018\u000fÈ_µ.\u001cþ6qÉd©ZHÝÈ}ycí\u009böy.\u0010\u00ad\u0090Ñþ\u0016¾ä\u009cl\u001b?¿\u0004\u0099JK Ûôs¬©}ò8\u001b\u00075H<ð\u008d\rÛXqº¼\u0005\u008c\u009eX\u0004Û=Y»GX \\\"3në9s\u0006=\u0080\r\u009eKÑ\u001e|B\u008dY\u0091?*Vz9¡,\bk\u0086\u0013Ð\u0018iFZ\u0096hl\fâ\u0092lh\u0017·$\u008bó],\u0099¿\u0011þ\u0093\u0095\u0010ï\u0002mY,Mf*T|l¾\u0089¾\u001f\u0087\u0010ÐW\u0080ù\u00131\u0018§\n:R»Ò´´9 PûÜÒ¹®\u00129,\u0083\\ö2é\u0006'¯¶Q\u0097¢\u000b\u0002\u0001\u009d\u0085ìóËroc 9[,[\u009e$×®\u0085r\u001c§´º\u008aþ\u001d[\u0085æË\u0001W\u0016uCi\u0098\u0005ó\u0006I !qO\u0010Ù\u001aÊÉë\t¶\u0019Ó!ù$\u0014ãhÍ\u0018kû/¥(A\u009d\u000b\u0002D| Åë\\\u0002Itü*ô\u008581\u001e6\fk®¬ùÕ?ê\u0001÷o\u0096k6Ìib\u008e\u0010I¸\u0080ÍY4MS°À}4ØÊS\u001d\u0010I\u008b?ñ\u001f\u000f^\u009cjÊ\u009f\u0099Õq0  &\u007f\u009d$d\u001a\u0093\u0000}.Z\u007f\u0097\u0017ô;ê3\n\u0011\u0013\u0089¢³c7^\u001fg\u001a&\u0097\u0010u\u0084-\u0001ÿ+FÎÖ\u008fç$\u001b\u009cì@"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var15 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var21;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     d = new String[42];
                     NativeLoader.UI();
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var21;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\tÎZè\u001d\u0081ýØ\u0098+\u001c\u008d«>¸r\u0010ê\u00050øÏa©r|¸£1EóÓ\u008a";
                  var8 = "\tÎZè\u001d\u0081ýØ\u0098+\u001c\u008d«>¸r\u0010ê\u00050øÏa©r|¸£1EóÓ\u008a".length();
                  var5 = 16;
                  var12 = -1;
            }

            var15 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   public static void b(int[] var0) {
      a = var0;
   }

   public static int[] b() {
      return a;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7083;
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
            throw new RuntimeException("net/minecraft/client/main/Main", var10);
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
         throw new RuntimeException("net/minecraft/client/main/Main" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
