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

public class hy1 {
   public static final String fuc;
   public static String _hs;
   public final String xua;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public hy1(String var1) {
      this.xua = var1;
   }

   public x1l rbv(ps7 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hy1.a J
      // 003: ldc2_w 102623975251359
      // 006: lxor
      // 007: lstore 2
      // 008: aconst_null
      // 009: astore 5
      // 00b: new java/lang/StringBuilder
      // 00e: dup
      // 00f: invokespecial java/lang/StringBuilder.<init> ()V
      // 012: sipush 17190
      // 015: ldc2_w 816521659570165391
      // 018: lload 2
      // 019: lxor
      // 01a: invokedynamic v (IJ)Ljava/lang/String; bsm=hy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: nop
      // 020: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 023: aload 0
      // 024: getfield hy1.xua Ljava/lang/String;
      // 027: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02a: sipush 8764
      // 02d: ldc2_w 1009976678463403924
      // 030: lload 2
      // 031: lxor
      // 032: invokedynamic v (IJ)Ljava/lang/String; bsm=hy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: nop
      // 038: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03b: aload 0
      // 03c: aload 1
      // 03d: invokespecial hy1.yg2 (Lps7;)I
      // 040: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 043: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 046: astore 6
      // 048: new java/lang/StringBuilder
      // 04b: dup
      // 04c: invokespecial java/lang/StringBuilder.<init> ()V
      // 04f: sipush 16460
      // 052: ldc2_w 492094260587140577
      // 055: lload 2
      // 056: lxor
      // 057: invokedynamic v (IJ)Ljava/lang/String; bsm=hy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: nop
      // 05d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 060: aload 6
      // 062: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 065: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 068: astore 7
      // 06a: new java/net/URL
      // 06d: dup
      // 06e: aload 7
      // 070: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 073: invokestatic HttpClient.q4z (Ljava/net/URL;)Ljava/lang/String;
      // 076: astore 8
      // 078: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 07b: aload 8
      // 07d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 080: invokestatic OpaquePredicate.b ()I
      // 083: aload 0
      // 084: aload 8
      // 086: invokespecial hy1.oci (Ljava/lang/String;)Ljava/util/HashMap;
      // 089: astore 9
      // 08b: aload 9
      // 08d: sipush 22956
      // 090: ldc2_w 4427210597289888775
      // 093: lload 2
      // 094: lxor
      // 095: invokedynamic v (IJ)Ljava/lang/String; bsm=hy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: nop
      // 09b: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 09e: checkcast java/lang/String
      // 0a1: astore 10
      // 0a3: aload 0
      // 0a4: aload 9
      // 0a6: sipush 7815
      // 0a9: ldc2_w 3180533012818742061
      // 0ac: lload 2
      // 0ad: lxor
      // 0ae: invokedynamic v (IJ)Ljava/lang/String; bsm=hy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: nop
      // 0b4: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b7: checkcast java/lang/String
      // 0ba: invokespecial hy1.peb (Ljava/lang/String;)Ljava/lang/String;
      // 0bd: astore 11
      // 0bf: istore 4
      // 0c1: aconst_null
      // 0c2: astore 12
      // 0c4: aload 10
      // 0c6: iload 4
      // 0c8: ifeq 0f8
      // 0cb: ldc "1"
      // 0cd: nop
      // 0ce: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d1: ifeq 141
      // 0d4: goto 0db
      // 0d7: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0da: athrow
      // 0db: aload 9
      // 0dd: sipush 17535
      // 0e0: ldc2_w 5405318630564270544
      // 0e3: lload 2
      // 0e4: lxor
      // 0e5: invokedynamic v (IJ)Ljava/lang/String; bsm=hy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: nop
      // 0eb: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ee: checkcast java/lang/String
      // 0f1: goto 0f8
      // 0f4: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0f7: athrow
      // 0f8: astore 12
      // 0fa: aload 12
      // 0fc: ldc ":"
      // 0fe: nop
      // 0ff: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 102: astore 13
      // 104: aload 13
      // 106: bipush 0
      // 107: aaload
      // 108: aload 13
      // 10a: bipush 1
      // 10b: aaload
      // 10c: invokestatic zfs.eoj (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 10f: ifnonnull 12e
      // 112: new x1l
      // 115: dup
      // 116: aload 13
      // 118: bipush 0
      // 119: aaload
      // 11a: aload 13
      // 11c: bipush 1
      // 11d: aaload
      // 11e: invokestatic Minecraft.vz1 ()Lc05;
      // 121: invokevirtual Minecraft.ee0 ()Lrh0;
      // 124: invokevirtual rh0.z2u ()Ljava/lang/String;
      // 127: aload 11
      // 129: invokespecial x1l.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 12c: astore 5
      // 12e: aload 0
      // 12f: getfield hy1.xua Ljava/lang/String;
      // 132: putstatic hy1._hs Ljava/lang/String;
      // 135: getstatic ClientState.qkk Lzwr;
      // 138: invokevirtual ClientState.getConfigManager ()Lszk;
      // 13b: invokevirtual ConfigManager.mw6 ()V
      // 13e: goto 14f
      // 141: new x1l
      // 144: dup
      // 145: aconst_null
      // 146: aconst_null
      // 147: aconst_null
      // 148: aload 11
      // 14a: invokespecial x1l.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 14d: astore 5
      // 14f: aload 5
      // 151: areturn
   }

   private HashMap oci(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/HashMap
      // 003: dup
      // 004: invokespecial java/util/HashMap.<init> ()V
      // 007: astore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: aload 1
      // 00c: bipush 1
      // 00d: aload 1
      // 00e: invokevirtual java/lang/String.length ()I
      // 011: bipush 1
      // 012: isub
      // 013: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 016: astore 1
      // 017: aload 1
      // 018: ldc ","
      // 01a: nop
      // 01b: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 01e: astore 4
      // 020: aload 4
      // 022: arraylength
      // 023: istore 5
      // 025: istore 2
      // 026: bipush 0
      // 027: istore 6
      // 029: iload 6
      // 02b: iload 5
      // 02d: if_icmpge 152
      // 030: aload 4
      // 032: iload 6
      // 034: aaload
      // 035: astore 7
      // 037: ldc ""
      // 039: nop
      // 03a: astore 8
      // 03c: ldc ""
      // 03e: nop
      // 03f: astore 9
      // 041: bipush 0
      // 042: istore 10
      // 044: aload 7
      // 046: invokevirtual java/lang/String.toCharArray ()[C
      // 049: astore 11
      // 04b: aload 11
      // 04d: arraylength
      // 04e: istore 12
      // 050: bipush 0
      // 051: istore 13
      // 053: iload 13
      // 055: iload 12
      // 057: if_icmpge 142
      // 05a: aload 11
      // 05c: iload 13
      // 05e: caload
      // 05f: istore 14
      // 061: iload 14
      // 063: iload 2
      // 064: ifne 0a2
      // 067: bipush 34
      // 069: iload 2
      // 06a: ifne 02d
      // 06d: goto 074
      // 070: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 073: athrow
      // 074: if_icmpne 099
      // 077: iload 10
      // 079: iload 2
      // 07a: ifne 08f
      // 07d: goto 084
      // 080: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 083: athrow
      // 084: ifne 092
      // 087: goto 08e
      // 08a: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 08d: athrow
      // 08e: bipush 1
      // 08f: goto 093
      // 092: bipush 0
      // 093: istore 10
      // 095: iload 2
      // 096: ifeq 13b
      // 099: iload 10
      // 09b: goto 0a2
      // 09e: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0a1: athrow
      // 0a2: iload 2
      // 0a3: ifne 0d3
      // 0a6: ifeq 0ca
      // 0a9: goto 0b0
      // 0ac: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0af: athrow
      // 0b0: new java/lang/StringBuilder
      // 0b3: dup
      // 0b4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b7: aload 9
      // 0b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bc: iload 14
      // 0be: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c4: astore 9
      // 0c6: iload 2
      // 0c7: ifeq 13b
      // 0ca: iload 14
      // 0cc: goto 0d3
      // 0cf: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0d2: athrow
      // 0d3: bipush 58
      // 0d5: iload 2
      // 0d6: ifne 0f0
      // 0d9: if_icmpne 0ec
      // 0dc: goto 0e3
      // 0df: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0e2: athrow
      // 0e3: aload 9
      // 0e5: astore 8
      // 0e7: ldc ""
      // 0e9: nop
      // 0ea: astore 9
      // 0ec: iload 14
      // 0ee: bipush 48
      // 0f0: iload 2
      // 0f1: ifne 122
      // 0f4: if_icmple 117
      // 0f7: goto 0fe
      // 0fa: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0fd: athrow
      // 0fe: iload 14
      // 100: bipush 57
      // 102: iload 2
      // 103: ifne 122
      // 106: goto 10d
      // 109: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 10c: athrow
      // 10d: if_icmplt 125
      // 110: goto 117
      // 113: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 116: athrow
      // 117: iload 14
      // 119: bipush 45
      // 11b: goto 122
      // 11e: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 121: athrow
      // 122: if_icmpne 13b
      // 125: new java/lang/StringBuilder
      // 128: dup
      // 129: invokespecial java/lang/StringBuilder.<init> ()V
      // 12c: aload 9
      // 12e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 131: iload 14
      // 133: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 136: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 139: astore 9
      // 13b: iinc 13 1
      // 13e: iload 2
      // 13f: ifeq 053
      // 142: aload 3
      // 143: aload 8
      // 145: aload 9
      // 147: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 14a: pop
      // 14b: iinc 6 1
      // 14e: iload 2
      // 14f: ifeq 029
      // 152: aload 3
      // 153: areturn
   }

   private int yg2(ps7 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic ps7.kt1 Lps7;
      // 08: iload 2
      // 09: ifne 20
      // 0c: if_acmpne 1c
      // 0f: goto 16
      // 12: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1b: athrow
      // 1c: aload 1
      // 1d: getstatic ps7.jov Lps7;
      // 20: iload 2
      // 21: ifne 39
      // 24: if_acmpne 35
      // 27: goto 2e
      // 2a: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 2d: athrow
      // 2e: bipush 10
      // 30: ireturn
      // 31: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 34: athrow
      // 35: aload 1
      // 36: getstatic ps7.mrf Lps7;
      // 39: if_acmpne 43
      // 3c: bipush 20
      // 3e: ireturn
      // 3f: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 42: athrow
      // 43: bipush -1
      // 44: ireturn
   }

   public static boolean ep_(char param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: invokestatic java/lang/Character$UnicodeBlock.of (C)Ljava/lang/Character$UnicodeBlock;
      // 08: astore 2
      // 09: aload 2
      // 0a: getstatic java/lang/Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS Ljava/lang/Character$UnicodeBlock;
      // 0d: iload 1
      // 0e: ifeq 26
      // 11: if_acmpeq 8d
      // 14: goto 1b
      // 17: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1a: athrow
      // 1b: aload 2
      // 1c: getstatic java/lang/Character$UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS Ljava/lang/Character$UnicodeBlock;
      // 1f: goto 26
      // 22: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 25: athrow
      // 26: iload 1
      // 27: ifeq 3f
      // 2a: if_acmpeq 8d
      // 2d: goto 34
      // 30: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 33: athrow
      // 34: aload 2
      // 35: getstatic java/lang/Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A Ljava/lang/Character$UnicodeBlock;
      // 38: goto 3f
      // 3b: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 3e: athrow
      // 3f: iload 1
      // 40: ifeq 58
      // 43: if_acmpeq 8d
      // 46: goto 4d
      // 49: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 4c: athrow
      // 4d: aload 2
      // 4e: getstatic java/lang/Character$UnicodeBlock.GENERAL_PUNCTUATION Ljava/lang/Character$UnicodeBlock;
      // 51: goto 58
      // 54: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 57: athrow
      // 58: iload 1
      // 59: ifeq 71
      // 5c: if_acmpeq 8d
      // 5f: goto 66
      // 62: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 65: athrow
      // 66: aload 2
      // 67: getstatic java/lang/Character$UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION Ljava/lang/Character$UnicodeBlock;
      // 6a: goto 71
      // 6d: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 70: athrow
      // 71: iload 1
      // 72: ifeq 8a
      // 75: if_acmpeq 8d
      // 78: goto 7f
      // 7b: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 7e: athrow
      // 7f: aload 2
      // 80: getstatic java/lang/Character$UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS Ljava/lang/Character$UnicodeBlock;
      // 83: goto 8a
      // 86: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 89: athrow
      // 8a: if_acmpne 93
      // 8d: bipush 1
      // 8e: ireturn
      // 8f: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 92: athrow
      // 93: bipush 0
      // 94: ireturn
   }

   private String peb(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hy1.a J
      // 003: ldc2_w 111359477385860
      // 006: lxor
      // 007: lstore 2
      // 008: new java/lang/StringBuffer
      // 00b: dup
      // 00c: invokespecial java/lang/StringBuffer.<init> ()V
      // 00f: astore 5
      // 011: invokestatic OpaquePredicate.c ()I
      // 014: aload 1
      // 015: sipush 18333
      // 018: ldc2_w 6837829705868313898
      // 01b: lload 2
      // 01c: lxor
      // 01d: invokedynamic v (IJ)Ljava/lang/String; bsm=hy1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: nop
      // 023: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 026: astore 6
      // 028: bipush 0
      // 029: istore 7
      // 02b: istore 4
      // 02d: iload 7
      // 02f: aload 6
      // 031: arraylength
      // 032: if_icmpge 107
      // 035: aload 6
      // 037: iload 7
      // 039: aaload
      // 03a: iload 4
      // 03c: ifne 10c
      // 03f: iload 4
      // 041: ifne 06a
      // 044: goto 04b
      // 047: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 04a: athrow
      // 04b: invokevirtual java/lang/String.length ()I
      // 04e: bipush 4
      // 04f: if_icmplt 0dd
      // 052: goto 059
      // 055: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 058: athrow
      // 059: aload 6
      // 05b: iload 7
      // 05d: aaload
      // 05e: bipush 0
      // 05f: bipush 4
      // 060: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 063: goto 06a
      // 066: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 069: athrow
      // 06a: astore 8
      // 06c: aload 8
      // 06e: bipush 16
      // 070: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 073: istore 9
      // 075: iload 9
      // 077: i2c
      // 078: invokestatic hy1.ep_ (C)Z
      // 07b: istore 10
      // 07d: iload 4
      // 07f: ifne 09e
      // 082: iload 10
      // 084: ifeq 0b6
      // 087: goto 08e
      // 08a: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 08d: athrow
      // 08e: aload 5
      // 090: iload 9
      // 092: i2c
      // 093: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 096: pop
      // 097: goto 09e
      // 09a: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 09d: athrow
      // 09e: aload 6
      // 0a0: iload 7
      // 0a2: aaload
      // 0a3: bipush 4
      // 0a4: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0a7: astore 11
      // 0a9: aload 5
      // 0ab: aload 11
      // 0ad: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0b0: pop
      // 0b1: iload 4
      // 0b3: ifeq 0c8
      // 0b6: aload 5
      // 0b8: aload 6
      // 0ba: iload 7
      // 0bc: aaload
      // 0bd: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0c0: pop
      // 0c1: goto 0c8
      // 0c4: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0c7: athrow
      // 0c8: goto 0d8
      // 0cb: astore 9
      // 0cd: aload 5
      // 0cf: aload 6
      // 0d1: iload 7
      // 0d3: aaload
      // 0d4: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0d7: pop
      // 0d8: iload 4
      // 0da: ifeq 0ef
      // 0dd: aload 5
      // 0df: aload 6
      // 0e1: iload 7
      // 0e3: aaload
      // 0e4: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0e7: pop
      // 0e8: goto 0ef
      // 0eb: invokestatic hy1.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0ee: athrow
      // 0ef: goto 0ff
      // 0f2: astore 8
      // 0f4: aload 5
      // 0f6: aload 6
      // 0f8: iload 7
      // 0fa: aaload
      // 0fb: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0fe: pop
      // 0ff: iinc 7 1
      // 102: iload 4
      // 104: ifeq 02d
      // 107: aload 5
      // 109: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 10c: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5855733995842598446L, 5238125488239953242L, MethodHandles.lookup().lookupClass()).a(28979481365673L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 108736948993479L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "\u0014>1\"b\u0095\u009bÞÎ2Ú_Ý\u0007\\9\u0010\u008bil\u000eê`oéÝoÉ\u0001\u007f\u0001ZÜ\u0010\u0004\u008f6\u0016\u0010Ô²7á9v\u0093\"\u000bó\u009b\u0010\u0003\u008a\u0092Lêyü\u0005.±ê\u0089\u001d1¹Ç\u0010\u0082ï§0Ä \ts\u0006øb¢åÊ&\u00048\u0000\u0092/uu¶©¸Å;\u007fY³UðhwLfÅP\u0010äDö\u0004ÞHm\u008b¥¿Q\u0011Äõ\u0007VÀee\u0087¾¹É)r¸\u007fBô¶\u008dÏ\u0084æ";
      int var8 = "\u0014>1\"b\u0095\u009bÞÎ2Ú_Ý\u0007\\9\u0010\u008bil\u000eê`oéÝoÉ\u0001\u007f\u0001ZÜ\u0010\u0004\u008f6\u0016\u0010Ô²7á9v\u0093\"\u000bó\u009b\u0010\u0003\u008a\u0092Lêyü\u0005.±ê\u0089\u001d1¹Ç\u0010\u0082ï§0Ä \ts\u0006øb¢åÊ&\u00048\u0000\u0092/uu¶©¸Å;\u007fY³UðhwLfÅP\u0010äDö\u0004ÞHm\u008b¥¿Q\u0011Äõ\u0007VÀee\u0087¾¹É)r¸\u007fBô¶\u008dÏ\u0084æ"
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
                     c = new String[8];
                     fuc = a<"v">(22770, 5440396357245463812L ^ var0);
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

                  var6 = "ª8\u0080»\u001b\u0017\u009cx×OÞx5\u009aÀ¿êæ]Ú,\u0007\u0080ïN5-dÓØ0é©ÖWOª\n\u0087\u00adÄ9\u0003\u008fDà-Â\u0010,\u0000¬53°W÷ªÔhV¿EEÓ";
                  var8 = "ª8\u0080»\u001b\u0017\u009cx×OÞx5\u009aÀ¿êæ]Ú,\u0007\u0080ïN5-dÓØ0é©ÖWOª\n\u0087\u00adÄ9\u0003\u008fDà-Â\u0010,\u0000¬53°W÷ªÔhV¿EEÓ"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5094;
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
            throw new RuntimeException("hy1", var10);
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
         throw new RuntimeException("hy1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
