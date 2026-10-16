import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hc0 {
   private static final Random my5;
   private static final hc0$yln m0t;
   private static final hc0$ork v4c;
   private static final hc0$bdm au_;
   private static final hc0$_cb zyp;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static int qa_(int param0, erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hc0.a J
      // 03: ldc2_w 28552139813803
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifne 24
      // 13: ifnonnull 23
      // 16: goto 1d
      // 19: invokestatic hc0.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: invokestatic hc0.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: invokevirtual erg.pqd ()Lqhg;
      // 27: astore 5
      // 29: aload 5
      // 2b: ifnonnull 34
      // 2e: bipush 0
      // 2f: ireturn
      // 30: invokestatic hc0.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: istore 6
      // 37: iload 6
      // 39: aload 5
      // 3b: invokevirtual qhg.vek ()I
      // 3e: if_icmpge a2
      // 41: aload 5
      // 43: iload 6
      // 45: invokevirtual qhg.kd6 (I)Lbdo;
      // 48: sipush 30951
      // 4b: ldc2_w 1831506343875348306
      // 4e: lload 2
      // 4f: lxor
      // 50: invokedynamic k (IJ)Ljava/lang/String; bsm=hc0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: nop
      // 56: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 59: istore 7
      // 5b: aload 5
      // 5d: iload 6
      // 5f: invokevirtual qhg.kd6 (I)Lbdo;
      // 62: sipush 8778
      // 65: ldc2_w 4307416571149835768
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic k (IJ)Ljava/lang/String; bsm=hc0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: nop
      // 70: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 73: istore 8
      // 75: iload 4
      // 77: ifne 9d
      // 7a: iload 7
      // 7c: iload 4
      // 7e: ifne a3
      // 81: goto 88
      // 84: invokestatic hc0.a (Loov;)Loov;
      // 87: athrow
      // 88: iload 0
      // 89: if_icmpne 9a
      // 8c: goto 93
      // 8f: invokestatic hc0.a (Loov;)Loov;
      // 92: athrow
      // 93: iload 8
      // 95: ireturn
      // 96: invokestatic hc0.a (Loov;)Loov;
      // 99: athrow
      // 9a: iinc 6 1
      // 9d: iload 4
      // 9f: ifeq 37
      // a2: bipush 0
      // a3: ireturn
   }

   public static Map aau(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hc0.a J
      // 03: ldc2_w 137346571012843
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: invokestatic com/google/common/collect/Maps.newLinkedHashMap ()Ljava/util/LinkedHashMap;
      // 0f: astore 4
      // 11: aload 0
      // 12: iload 3
      // 13: ifne 35
      // 16: invokevirtual erg.gn1 ()Lu7m;
      // 19: getstatic xbr.frz Lnmo;
      // 1c: if_acmpne 34
      // 1f: goto 26
      // 22: invokestatic hc0.a (Loov;)Loov;
      // 25: athrow
      // 26: getstatic xbr.frz Lnmo;
      // 29: aload 0
      // 2a: invokevirtual nmo.hyc (Lerg;)Lqhg;
      // 2d: goto 38
      // 30: invokestatic hc0.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: invokevirtual erg.pqd ()Lqhg;
      // 38: astore 5
      // 3a: aload 5
      // 3c: ifnull a4
      // 3f: bipush 0
      // 40: istore 6
      // 42: iload 6
      // 44: aload 5
      // 46: invokevirtual qhg.vek ()I
      // 49: if_icmpge a4
      // 4c: aload 5
      // 4e: iload 6
      // 50: invokevirtual qhg.kd6 (I)Lbdo;
      // 53: sipush 20082
      // 56: ldc2_w 4273385030776490116
      // 59: lload 1
      // 5a: lxor
      // 5b: invokedynamic k (IJ)Ljava/lang/String; bsm=hc0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: nop
      // 61: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 64: istore 7
      // 66: aload 5
      // 68: iload 6
      // 6a: invokevirtual qhg.kd6 (I)Lbdo;
      // 6d: sipush 22691
      // 70: ldc2_w 3823444212695604820
      // 73: lload 1
      // 74: lxor
      // 75: invokedynamic k (IJ)Ljava/lang/String; bsm=hc0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: nop
      // 7b: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 7e: istore 8
      // 80: aload 4
      // 82: iload 3
      // 83: ifne a6
      // 86: iload 7
      // 88: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8b: iload 8
      // 8d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 90: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 95: pop
      // 96: iinc 6 1
      // 99: iload 3
      // 9a: ifeq 42
      // 9d: goto a4
      // a0: invokestatic hc0.a (Loov;)Loov;
      // a3: athrow
      // a4: aload 4
      // a6: areturn
   }

   public static void r_4(Map param0, erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hc0.a J
      // 003: ldc2_w 13877158340248
      // 006: lxor
      // 007: lstore 2
      // 008: new qhg
      // 00b: dup
      // 00c: invokespecial qhg.<init> ()V
      // 00f: astore 5
      // 011: invokestatic OpaquePredicate.c ()I
      // 014: aload 0
      // 015: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 01a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 01f: astore 6
      // 021: istore 4
      // 023: aload 6
      // 025: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02a: ifeq 0d6
      // 02d: aload 6
      // 02f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 034: checkcast java/lang/Integer
      // 037: invokevirtual java/lang/Integer.intValue ()I
      // 03a: istore 7
      // 03c: iload 7
      // 03e: invokestatic vef.k6j (I)Lvef;
      // 041: astore 8
      // 043: iload 4
      // 045: ifne 127
      // 048: aload 8
      // 04a: ifnull 0d1
      // 04d: goto 054
      // 050: invokestatic hc0.a (Loov;)Loov;
      // 053: athrow
      // 054: new bdo
      // 057: dup
      // 058: invokespecial bdo.<init> ()V
      // 05b: astore 9
      // 05d: aload 9
      // 05f: sipush 30951
      // 062: ldc2_w 1831491944109429345
      // 065: lload 2
      // 066: lxor
      // 067: invokedynamic k (IJ)Ljava/lang/String; bsm=hc0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: nop
      // 06d: iload 7
      // 06f: i2s
      // 070: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 073: aload 9
      // 075: sipush 8778
      // 078: ldc2_w 4307431241301690571
      // 07b: lload 2
      // 07c: lxor
      // 07d: invokedynamic k (IJ)Ljava/lang/String; bsm=hc0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: nop
      // 083: aload 0
      // 084: iload 7
      // 086: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 089: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 08e: checkcast java/lang/Integer
      // 091: invokevirtual java/lang/Integer.intValue ()I
      // 094: i2s
      // 095: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 098: aload 5
      // 09a: aload 9
      // 09c: invokevirtual qhg.w2j (Lgdw;)V
      // 09f: aload 1
      // 0a0: invokevirtual erg.gn1 ()Lu7m;
      // 0a3: getstatic xbr.frz Lnmo;
      // 0a6: if_acmpne 0d1
      // 0a9: getstatic xbr.frz Lnmo;
      // 0ac: aload 1
      // 0ad: new npq
      // 0b0: dup
      // 0b1: aload 8
      // 0b3: aload 0
      // 0b4: iload 7
      // 0b6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b9: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0be: checkcast java/lang/Integer
      // 0c1: invokevirtual java/lang/Integer.intValue ()I
      // 0c4: invokespecial npq.<init> (Lvef;I)V
      // 0c7: invokevirtual nmo.e67 (Lerg;Lnpq;)V
      // 0ca: goto 0d1
      // 0cd: invokestatic hc0.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iload 4
      // 0d3: ifeq 023
      // 0d6: aload 5
      // 0d8: invokevirtual qhg.vek ()I
      // 0db: iload 4
      // 0dd: ifne 137
      // 0e0: ifle 127
      // 0e3: goto 0ea
      // 0e6: invokestatic hc0.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 1
      // 0eb: iload 4
      // 0ed: ifne 10f
      // 0f0: goto 0f7
      // 0f3: invokestatic hc0.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: invokevirtual erg.gn1 ()Lu7m;
      // 0fa: getstatic xbr.frz Lnmo;
      // 0fd: if_acmpeq 14f
      // 100: goto 107
      // 103: invokestatic hc0.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 1
      // 108: goto 10f
      // 10b: invokestatic hc0.a (Loov;)Loov;
      // 10e: athrow
      // 10f: sipush 24732
      // 112: ldc2_w 8286847446773320220
      // 115: lload 2
      // 116: lxor
      // 117: invokedynamic k (IJ)Ljava/lang/String; bsm=hc0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: nop
      // 11d: aload 5
      // 11f: invokevirtual erg.fvt (Ljava/lang/String;Lgdw;)V
      // 122: iload 4
      // 124: ifeq 14f
      // 127: aload 1
      // 128: iload 4
      // 12a: ifne 13b
      // 12d: invokevirtual erg.w8b ()Z
      // 130: goto 137
      // 133: invokestatic hc0.a (Loov;)Loov;
      // 136: athrow
      // 137: ifeq 14f
      // 13a: aload 1
      // 13b: invokevirtual erg.zso ()Lbdo;
      // 13e: sipush 26123
      // 141: ldc2_w 7464500891936935052
      // 144: lload 2
      // 145: lxor
      // 146: invokedynamic k (IJ)Ljava/lang/String; bsm=hc0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: nop
      // 14c: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 14f: return
   }

   public static int gld(int param0, erg[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic hc0.a (Loov;)Loov;
      // 0d: athrow
      // 0e: bipush 0
      // 0f: istore 3
      // 10: aload 1
      // 11: astore 4
      // 13: aload 4
      // 15: arraylength
      // 16: istore 5
      // 18: bipush 0
      // 19: istore 6
      // 1b: iload 6
      // 1d: iload 5
      // 1f: if_icmpge 57
      // 22: aload 4
      // 24: iload 6
      // 26: aaload
      // 27: astore 7
      // 29: iload 0
      // 2a: aload 7
      // 2c: invokestatic hc0.qa_ (ILerg;)I
      // 2f: istore 8
      // 31: iload 2
      // 32: ifeq 53
      // 35: iload 8
      // 37: iload 2
      // 38: ifeq 58
      // 3b: goto 42
      // 3e: invokestatic hc0.a (Loov;)Loov;
      // 41: athrow
      // 42: iload 3
      // 43: if_icmple 50
      // 46: goto 4d
      // 49: invokestatic hc0.a (Loov;)Loov;
      // 4c: athrow
      // 4d: iload 8
      // 4f: istore 3
      // 50: iinc 6 1
      // 53: iload 2
      // 54: ifne 1b
      // 57: iload 3
      // 58: ireturn
   }

   private static void zz1(hc0$ic8 param0, erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hc0.a J
      // 03: ldc2_w 13188175912049
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifeq 1e
      // 13: ifnull 99
      // 16: goto 1d
      // 19: invokestatic hc0.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 1
      // 1e: invokevirtual erg.pqd ()Lqhg;
      // 21: astore 5
      // 23: aload 5
      // 25: ifnull 99
      // 28: bipush 0
      // 29: istore 6
      // 2b: iload 6
      // 2d: aload 5
      // 2f: invokevirtual qhg.vek ()I
      // 32: if_icmpge 99
      // 35: aload 5
      // 37: iload 6
      // 39: invokevirtual qhg.kd6 (I)Lbdo;
      // 3c: sipush 30951
      // 3f: ldc2_w 1831490988355119240
      // 42: lload 2
      // 43: lxor
      // 44: invokedynamic k (IJ)Ljava/lang/String; bsm=hc0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: nop
      // 4a: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 4d: istore 7
      // 4f: aload 5
      // 51: iload 6
      // 53: invokevirtual qhg.kd6 (I)Lbdo;
      // 56: sipush 8778
      // 59: ldc2_w 4307436333177549346
      // 5c: lload 2
      // 5d: lxor
      // 5e: invokedynamic k (IJ)Ljava/lang/String; bsm=hc0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: nop
      // 64: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 67: istore 8
      // 69: iload 4
      // 6b: ifeq 94
      // 6e: iload 7
      // 70: invokestatic vef.k6j (I)Lvef;
      // 73: ifnull 91
      // 76: goto 7d
      // 79: invokestatic hc0.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 0
      // 7e: iload 7
      // 80: invokestatic vef.k6j (I)Lvef;
      // 83: iload 8
      // 85: invokeinterface hc0$ic8.iuc (Lvef;I)V 3
      // 8a: goto 91
      // 8d: invokestatic hc0.a (Loov;)Loov;
      // 90: athrow
      // 91: iinc 6 1
      // 94: iload 4
      // 96: ifne 2b
      // 99: return
   }

   private static void ui5(hc0$ic8 var0, erg[] var1) {
      erg[] var3 = var1;
      int var10000 = OpaquePredicate.b();
      int var4 = var1.length;
      int var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         erg var6 = var3[var5];
         zz1(var0, var6);
         var5++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public static int x2d(erg[] param0, ofh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hc0.m0t Lhc0$yln;
      // 03: bipush 0
      // 04: putfield hc0$yln.n9i I
      // 07: getstatic hc0.m0t Lhc0$yln;
      // 0a: aload 1
      // 0b: putfield hc0$yln.pcm Lofh;
      // 0e: invokestatic OpaquePredicate.c ()I
      // 11: getstatic hc0.m0t Lhc0$yln;
      // 14: aload 0
      // 15: invokestatic hc0.ui5 (Lhc0$ic8;[Lerg;)V
      // 18: istore 2
      // 19: getstatic hc0.m0t Lhc0$yln;
      // 1c: getfield hc0$yln.n9i I
      // 1f: iload 2
      // 20: ifne 4f
      // 23: bipush 25
      // 25: if_icmple 42
      // 28: goto 2f
      // 2b: invokestatic hc0.a (Loov;)Loov;
      // 2e: athrow
      // 2f: getstatic hc0.m0t Lhc0$yln;
      // 32: bipush 25
      // 34: putfield hc0$yln.n9i I
      // 37: iload 2
      // 38: ifeq 6b
      // 3b: goto 42
      // 3e: invokestatic hc0.a (Loov;)Loov;
      // 41: athrow
      // 42: getstatic hc0.m0t Lhc0$yln;
      // 45: getfield hc0$yln.n9i I
      // 48: goto 4f
      // 4b: invokestatic hc0.a (Loov;)Loov;
      // 4e: athrow
      // 4f: iload 2
      // 50: ifne 86
      // 53: ifge 6b
      // 56: goto 5d
      // 59: invokestatic hc0.a (Loov;)Loov;
      // 5c: athrow
      // 5d: getstatic hc0.m0t Lhc0$yln;
      // 60: bipush 0
      // 61: putfield hc0$yln.n9i I
      // 64: goto 6b
      // 67: invokestatic hc0.a (Loov;)Loov;
      // 6a: athrow
      // 6b: getstatic hc0.m0t Lhc0$yln;
      // 6e: getfield hc0$yln.n9i I
      // 71: bipush 1
      // 72: iadd
      // 73: bipush 1
      // 74: ishr
      // 75: getstatic hc0.my5 Ljava/util/Random;
      // 78: getstatic hc0.m0t Lhc0$yln;
      // 7b: getfield hc0$yln.n9i I
      // 7e: bipush 1
      // 7f: ishr
      // 80: bipush 1
      // 81: iadd
      // 82: invokevirtual java/util/Random.nextInt (I)I
      // 85: iadd
      // 86: ireturn
   }

   public static float xpe(erg var0, n1e var1) {
      v4c.chi = 0.0F;
      v4c.r4f = var1;
      zz1(v4c, var0);
      return v4c.chi;
   }

   public static void eay(Entity param0, EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hc0.au_ Lhc0$bdm;
      // 03: aload 1
      // 04: putfield hc0$bdm.t0h Li2h;
      // 07: invokestatic OpaquePredicate.c ()I
      // 0a: getstatic hc0.au_ Lhc0$bdm;
      // 0d: aload 0
      // 0e: putfield hc0$bdm.p6w Lg_3;
      // 11: istore 2
      // 12: aload 0
      // 13: iload 2
      // 14: ifne 33
      // 17: ifnull 32
      // 1a: goto 21
      // 1d: invokestatic hc0.a (Loov;)Loov;
      // 20: athrow
      // 21: getstatic hc0.au_ Lhc0$bdm;
      // 24: aload 0
      // 25: invokevirtual Entity.n7a ()[Lerg;
      // 28: invokestatic hc0.ui5 (Lhc0$ic8;[Lerg;)V
      // 2b: goto 32
      // 2e: invokestatic hc0.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: instanceof ha9
      // 36: ifeq 4a
      // 39: getstatic hc0.au_ Lhc0$bdm;
      // 3c: aload 0
      // 3d: invokevirtual Entity.tsc ()Lerg;
      // 40: invokestatic hc0.zz1 (Lhc0$ic8;Lerg;)V
      // 43: goto 4a
      // 46: invokestatic hc0.a (Loov;)Loov;
      // 49: athrow
      // 4a: return
   }

   public static void rzk(Entity param0, EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hc0.zyp Lhc0$_cb;
      // 03: aload 0
      // 04: putfield hc0$_cb.w3g Lg_3;
      // 07: invokestatic OpaquePredicate.b ()I
      // 0a: getstatic hc0.zyp Lhc0$_cb;
      // 0d: aload 1
      // 0e: putfield hc0$_cb.lal Li2h;
      // 11: istore 2
      // 12: aload 0
      // 13: iload 2
      // 14: ifeq 33
      // 17: ifnull 32
      // 1a: goto 21
      // 1d: invokestatic hc0.a (Loov;)Loov;
      // 20: athrow
      // 21: getstatic hc0.zyp Lhc0$_cb;
      // 24: aload 0
      // 25: invokevirtual Entity.n7a ()[Lerg;
      // 28: invokestatic hc0.ui5 (Lhc0$ic8;[Lerg;)V
      // 2b: goto 32
      // 2e: invokestatic hc0.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: instanceof ha9
      // 36: ifeq 4a
      // 39: getstatic hc0.zyp Lhc0$_cb;
      // 3c: aload 0
      // 3d: invokevirtual Entity.tsc ()Lerg;
      // 40: invokestatic hc0.zz1 (Lhc0$ic8;Lerg;)V
      // 43: goto 4a
      // 46: invokestatic hc0.a (Loov;)Loov;
      // 49: athrow
      // 4a: return
   }

   public static int kzt(Entity var0) {
      return qa_(vef.uqc.bbf, var0.tsc());
   }

   public static int ieh(Entity var0) {
      return qa_(vef.zbl.bbf, var0.tsc());
   }

   public static int v1a(EntityLivingBase var0) {
      return gld(vef.e8b.bbf, var0.n7a());
   }

   public static int uur(EntityLivingBase var0) {
      return gld(vef.fem.bbf, var0.n7a());
   }

   public static int uh3(Entity var0) {
      return qa_(vef.y_g.bbf, var0.tsc());
   }

   public static boolean ejq(Entity var0) {
      int var1 = OpaquePredicate.b();

      try {
         int var10000 = qa_(vef.w9s.bbf, var0.tsc());
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public static int ajj(Entity var0) {
      return qa_(vef.xl7.bbf, var0.tsc());
   }

   public static int nsr(Entity var0) {
      return qa_(vef.hmg.bbf, var0.tsc());
   }

   public static int fjn(Entity var0) {
      return qa_(vef.d00.bbf, var0.tsc());
   }

   public static int h55(Entity var0) {
      return qa_(vef.qvk.bbf, var0.tsc());
   }

   public static boolean hrk(Entity var0) {
      int var1 = OpaquePredicate.b();

      try {
         int var10000 = gld(vef.bhq.bbf, var0.n7a());
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public static erg d4f(vef param0, Entity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual Entity.n7a ()[Lerg;
      // 04: astore 3
      // 05: aload 3
      // 06: arraylength
      // 07: istore 4
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: bipush 0
      // 0d: istore 5
      // 0f: istore 2
      // 10: iload 5
      // 12: iload 4
      // 14: if_icmpge 4e
      // 17: aload 3
      // 18: iload 5
      // 1a: aaload
      // 1b: astore 6
      // 1d: iload 2
      // 1e: ifne 4a
      // 21: aload 6
      // 23: ifnull 47
      // 26: goto 2d
      // 29: invokestatic hc0.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield vef.bbf I
      // 31: aload 6
      // 33: invokestatic hc0.qa_ (ILerg;)I
      // 36: ifle 47
      // 39: goto 40
      // 3c: invokestatic hc0.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 6
      // 42: areturn
      // 43: invokestatic hc0.a (Loov;)Loov;
      // 46: athrow
      // 47: iinc 5 1
      // 4a: iload 2
      // 4b: ifeq 10
      // 4e: aconst_null
      // 4f: areturn
   }

   public static int qr8(Random param0, int param1, int param2, erg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: invokevirtual erg.gn1 ()Lu7m;
      // 04: astore 5
      // 06: invokestatic OpaquePredicate.b ()I
      // 09: aload 5
      // 0b: invokevirtual u7m.k7x ()I
      // 0e: istore 6
      // 10: istore 4
      // 12: iload 6
      // 14: iload 4
      // 16: ifeq 2a
      // 19: ifgt 29
      // 1c: goto 23
      // 1f: invokestatic hc0.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: invokestatic hc0.a (Loov;)Loov;
      // 28: athrow
      // 29: iload 2
      // 2a: bipush 15
      // 2c: iload 4
      // 2e: ifeq 51
      // 31: if_icmple 3e
      // 34: goto 3b
      // 37: invokestatic hc0.a (Loov;)Loov;
      // 3a: athrow
      // 3b: bipush 15
      // 3d: istore 2
      // 3e: aload 0
      // 3f: bipush 8
      // 41: invokevirtual java/util/Random.nextInt (I)I
      // 44: bipush 1
      // 45: iadd
      // 46: iload 2
      // 47: bipush 1
      // 48: ishr
      // 49: iadd
      // 4a: aload 0
      // 4b: iload 2
      // 4c: bipush 1
      // 4d: iadd
      // 4e: invokevirtual java/util/Random.nextInt (I)I
      // 51: iadd
      // 52: istore 7
      // 54: iload 1
      // 55: iload 4
      // 57: ifeq 74
      // 5a: ifne 73
      // 5d: goto 64
      // 60: invokestatic hc0.a (Loov;)Loov;
      // 63: athrow
      // 64: iload 7
      // 66: bipush 3
      // 67: idiv
      // 68: bipush 1
      // 69: invokestatic java/lang/Math.max (II)I
      // 6c: goto 9b
      // 6f: invokestatic hc0.a (Loov;)Loov;
      // 72: athrow
      // 73: iload 1
      // 74: bipush 1
      // 75: iload 4
      // 77: ifeq 98
      // 7a: if_icmpne 93
      // 7d: goto 84
      // 80: invokestatic hc0.a (Loov;)Loov;
      // 83: athrow
      // 84: iload 7
      // 86: bipush 2
      // 87: imul
      // 88: bipush 3
      // 89: idiv
      // 8a: bipush 1
      // 8b: iadd
      // 8c: goto 9b
      // 8f: invokestatic hc0.a (Loov;)Loov;
      // 92: athrow
      // 93: iload 7
      // 95: iload 2
      // 96: bipush 2
      // 97: imul
      // 98: invokestatic java/lang/Math.max (II)I
      // 9b: ireturn
   }

   public static erg xm8(Random param0, erg param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: iload 2
      // 07: invokestatic hc0.ha8 (Ljava/util/Random;Lerg;I)Ljava/util/List;
      // 0a: astore 4
      // 0c: aload 1
      // 0d: invokevirtual erg.gn1 ()Lu7m;
      // 10: getstatic xbr.rm0 Lu7m;
      // 13: if_acmpne 1e
      // 16: bipush 1
      // 17: goto 1f
      // 1a: invokestatic hc0.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: istore 5
      // 21: iload 5
      // 23: ifeq 34
      // 26: aload 1
      // 27: getstatic xbr.frz Lnmo;
      // 2a: invokevirtual erg.j8j (Lu7m;)V
      // 2d: goto 34
      // 30: invokestatic hc0.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 4
      // 36: iload 3
      // 37: ifeq 46
      // 3a: ifnull a0
      // 3d: goto 44
      // 40: invokestatic hc0.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 4
      // 46: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4b: astore 6
      // 4d: aload 6
      // 4f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 54: ifeq a0
      // 57: aload 6
      // 59: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5e: checkcast npq
      // 61: astore 7
      // 63: iload 3
      // 64: ifeq 83
      // 67: iload 5
      // 69: ifeq 87
      // 6c: goto 73
      // 6f: invokestatic hc0.a (Loov;)Loov;
      // 72: athrow
      // 73: getstatic xbr.frz Lnmo;
      // 76: aload 1
      // 77: aload 7
      // 79: invokevirtual nmo.e67 (Lerg;Lnpq;)V
      // 7c: goto 83
      // 7f: invokestatic hc0.a (Loov;)Loov;
      // 82: athrow
      // 83: iload 3
      // 84: ifne 9c
      // 87: aload 1
      // 88: aload 7
      // 8a: getfield npq.zbz Lvef;
      // 8d: aload 7
      // 8f: getfield npq.bzk I
      // 92: invokevirtual erg.g7b (Lvef;I)V
      // 95: goto 9c
      // 98: invokestatic hc0.a (Loov;)Loov;
      // 9b: athrow
      // 9c: iload 3
      // 9d: ifne 4d
      // a0: aload 1
      // a1: areturn
   }

   public static List ha8(Random param0, erg param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual erg.gn1 ()Lu7m;
      // 004: astore 4
      // 006: invokestatic OpaquePredicate.c ()I
      // 009: aload 4
      // 00b: invokevirtual u7m.k7x ()I
      // 00e: istore 5
      // 010: istore 3
      // 011: iload 5
      // 013: iload 3
      // 014: ifne 04a
      // 017: ifgt 027
      // 01a: goto 021
      // 01d: invokestatic hc0.a (Loov;)Loov;
      // 020: athrow
      // 021: aconst_null
      // 022: areturn
      // 023: invokestatic hc0.a (Loov;)Loov;
      // 026: athrow
      // 027: iload 5
      // 029: bipush 2
      // 02a: idiv
      // 02b: istore 5
      // 02d: bipush 1
      // 02e: aload 0
      // 02f: iload 5
      // 031: bipush 1
      // 032: ishr
      // 033: bipush 1
      // 034: iadd
      // 035: invokevirtual java/util/Random.nextInt (I)I
      // 038: iadd
      // 039: aload 0
      // 03a: iload 5
      // 03c: bipush 1
      // 03d: ishr
      // 03e: bipush 1
      // 03f: iadd
      // 040: invokevirtual java/util/Random.nextInt (I)I
      // 043: iadd
      // 044: istore 5
      // 046: iload 5
      // 048: iload 2
      // 049: iadd
      // 04a: istore 6
      // 04c: aload 0
      // 04d: invokevirtual java/util/Random.nextFloat ()F
      // 050: aload 0
      // 051: invokevirtual java/util/Random.nextFloat ()F
      // 054: fadd
      // 055: fconst_1
      // 056: fsub
      // 057: ldc 0.15
      // 059: nop
      // 05a: fmul
      // 05b: fstore 7
      // 05d: iload 6
      // 05f: i2f
      // 060: fconst_1
      // 061: fload 7
      // 063: fadd
      // 064: fmul
      // 065: ldc 0.5
      // 067: nop
      // 068: fadd
      // 069: f2i
      // 06a: istore 8
      // 06c: iload 8
      // 06e: iload 3
      // 06f: ifne 085
      // 072: bipush 1
      // 073: if_icmpge 087
      // 076: goto 07d
      // 079: invokestatic hc0.a (Loov;)Loov;
      // 07c: athrow
      // 07d: bipush 1
      // 07e: goto 085
      // 081: invokestatic hc0.a (Loov;)Loov;
      // 084: athrow
      // 085: istore 8
      // 087: aconst_null
      // 088: astore 9
      // 08a: iload 8
      // 08c: aload 1
      // 08d: invokestatic hc0.d5n (ILerg;)Ljava/util/Map;
      // 090: astore 10
      // 092: aload 10
      // 094: iload 3
      // 095: ifne 0a4
      // 098: ifnull 1b4
      // 09b: goto 0a2
      // 09e: invokestatic hc0.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 10
      // 0a4: invokeinterface java/util/Map.isEmpty ()Z 1
      // 0a9: ifne 1b4
      // 0ac: aload 0
      // 0ad: aload 10
      // 0af: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 0b4: invokestatic zfj.h82 (Ljava/util/Random;Ljava/util/Collection;)Lzfj$yuc;
      // 0b7: checkcast npq
      // 0ba: astore 11
      // 0bc: aload 11
      // 0be: ifnull 1b4
      // 0c1: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 0c4: astore 9
      // 0c6: aload 9
      // 0c8: aload 11
      // 0ca: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0cf: pop
      // 0d0: iload 8
      // 0d2: istore 12
      // 0d4: aload 0
      // 0d5: bipush 50
      // 0d7: invokevirtual java/util/Random.nextInt (I)I
      // 0da: iload 12
      // 0dc: if_icmpgt 1b4
      // 0df: aload 10
      // 0e1: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 0e6: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0eb: astore 13
      // 0ed: aload 13
      // 0ef: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f4: ifeq 17b
      // 0f7: aload 13
      // 0f9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0fe: checkcast java/lang/Integer
      // 101: astore 14
      // 103: bipush 1
      // 104: istore 15
      // 106: aload 9
      // 108: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 10d: iload 3
      // 10e: ifne 0eb
      // 111: astore 16
      // 113: aload 16
      // 115: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11a: ifeq 164
      // 11d: aload 16
      // 11f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 124: checkcast npq
      // 127: astore 17
      // 129: aload 17
      // 12b: getfield npq.zbz Lvef;
      // 12e: aload 14
      // 130: invokevirtual java/lang/Integer.intValue ()I
      // 133: invokestatic vef.k6j (I)Lvef;
      // 136: invokevirtual vef.yhx (Lvef;)Z
      // 139: iload 3
      // 13a: ifne 166
      // 13d: iload 3
      // 13e: ifne 153
      // 141: goto 148
      // 144: invokestatic hc0.a (Loov;)Loov;
      // 147: athrow
      // 148: ifne 159
      // 14b: goto 152
      // 14e: invokestatic hc0.a (Loov;)Loov;
      // 151: athrow
      // 152: bipush 0
      // 153: istore 15
      // 155: iload 3
      // 156: ifeq 164
      // 159: iload 3
      // 15a: ifeq 113
      // 15d: goto 164
      // 160: invokestatic hc0.a (Loov;)Loov;
      // 163: athrow
      // 164: iload 15
      // 166: ifne 177
      // 169: aload 13
      // 16b: invokeinterface java/util/Iterator.remove ()V 1
      // 170: goto 177
      // 173: invokestatic hc0.a (Loov;)Loov;
      // 176: athrow
      // 177: iload 3
      // 178: ifeq 0ed
      // 17b: aload 10
      // 17d: invokeinterface java/util/Map.isEmpty ()Z 1
      // 182: iload 3
      // 183: ifne 1ae
      // 186: ifne 1aa
      // 189: goto 190
      // 18c: invokestatic hc0.a (Loov;)Loov;
      // 18f: athrow
      // 190: aload 0
      // 191: aload 10
      // 193: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 198: invokestatic zfj.h82 (Ljava/util/Random;Ljava/util/Collection;)Lzfj$yuc;
      // 19b: checkcast npq
      // 19e: astore 14
      // 1a0: aload 9
      // 1a2: aload 14
      // 1a4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a9: pop
      // 1aa: iload 12
      // 1ac: bipush 1
      // 1ad: ishr
      // 1ae: istore 12
      // 1b0: iload 3
      // 1b1: ifeq 0d4
      // 1b4: aload 9
      // 1b6: areturn
   }

   public static Map d5n(int param0, erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual erg.gn1 ()Lu7m;
      // 004: astore 3
      // 005: invokestatic OpaquePredicate.b ()I
      // 008: aconst_null
      // 009: astore 4
      // 00b: istore 2
      // 00c: aload 1
      // 00d: invokevirtual erg.gn1 ()Lu7m;
      // 010: getstatic xbr.rm0 Lu7m;
      // 013: if_acmpne 01e
      // 016: bipush 1
      // 017: goto 01f
      // 01a: invokestatic hc0.a (Loov;)Loov;
      // 01d: athrow
      // 01e: bipush 0
      // 01f: istore 5
      // 021: getstatic vef.ql6 [Lvef;
      // 024: astore 6
      // 026: aload 6
      // 028: arraylength
      // 029: istore 7
      // 02b: bipush 0
      // 02c: istore 8
      // 02e: iload 8
      // 030: iload 7
      // 032: if_icmpge 10a
      // 035: aload 6
      // 037: iload 8
      // 039: aaload
      // 03a: astore 9
      // 03c: iload 2
      // 03d: ifeq 106
      // 040: aload 9
      // 042: ifnull 103
      // 045: goto 04c
      // 048: invokestatic hc0.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 9
      // 04e: getfield vef.n1z Lbn1;
      // 051: aload 3
      // 052: invokevirtual bn1.ou1 (Lu7m;)Z
      // 055: iload 2
      // 056: ifeq 08d
      // 059: goto 060
      // 05c: invokestatic hc0.a (Loov;)Loov;
      // 05f: athrow
      // 060: ifne 081
      // 063: goto 06a
      // 066: invokestatic hc0.a (Loov;)Loov;
      // 069: athrow
      // 06a: iload 5
      // 06c: iload 2
      // 06d: ifeq 08d
      // 070: goto 077
      // 073: invokestatic hc0.a (Loov;)Loov;
      // 076: athrow
      // 077: ifeq 103
      // 07a: goto 081
      // 07d: invokestatic hc0.a (Loov;)Loov;
      // 080: athrow
      // 081: aload 9
      // 083: invokevirtual vef.s20 ()I
      // 086: goto 08d
      // 089: invokestatic hc0.a (Loov;)Loov;
      // 08c: athrow
      // 08d: istore 10
      // 08f: iload 10
      // 091: aload 9
      // 093: invokevirtual vef.ehp ()I
      // 096: if_icmpgt 103
      // 099: iload 0
      // 09a: aload 9
      // 09c: iload 10
      // 09e: invokevirtual vef.qwk (I)I
      // 0a1: iload 2
      // 0a2: ifeq 032
      // 0a5: iload 2
      // 0a6: ifeq 0c2
      // 0a9: if_icmplt 0fc
      // 0ac: goto 0b3
      // 0af: invokestatic hc0.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: iload 0
      // 0b4: aload 9
      // 0b6: iload 10
      // 0b8: invokevirtual vef.fnu (I)I
      // 0bb: goto 0c2
      // 0be: invokestatic hc0.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: if_icmpgt 0fc
      // 0c5: aload 4
      // 0c7: iload 2
      // 0c8: ifeq 0fb
      // 0cb: goto 0d2
      // 0ce: invokestatic hc0.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: ifnonnull 0e1
      // 0d5: goto 0dc
      // 0d8: invokestatic hc0.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 0df: astore 4
      // 0e1: aload 4
      // 0e3: aload 9
      // 0e5: getfield vef.bbf I
      // 0e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0eb: new npq
      // 0ee: dup
      // 0ef: aload 9
      // 0f1: iload 10
      // 0f3: invokespecial npq.<init> (Lvef;I)V
      // 0f6: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0fb: pop
      // 0fc: iinc 10 1
      // 0ff: iload 2
      // 100: ifne 08f
      // 103: iinc 8 1
      // 106: iload 2
      // 107: ifne 02e
      // 10a: aload 4
      // 10c: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1638052648848600337L, -8210796445202295764L, MethodHandles.lookup().lookupClass()).a(246673583635621L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 42699302420641L;
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
      String var6 = "ÊWd¥÷ô\u008c*\u0018\u0088Ò\u001c\u0092Rl\u008d\u0010¤»FÀC·\u0091ê2þ\u0081·óÑ\u001bù\u0010=_\u000em-9Q_\u001fù$æs\u000fV·\u0010[\u0017\"\u0007Í6êmÑ\u0087X\u0085«\u00adÆ`";
      int var8 = "ÊWd¥÷ô\u008c*\u0018\u0088Ò\u001c\u0092Rl\u008d\u0010¤»FÀC·\u0091ê2þ\u0081·óÑ\u001bù\u0010=_\u000em-9Q_\u001fù$æs\u000fV·\u0010[\u0017\"\u0007Í6êmÑ\u0087X\u0085«\u00adÆ`"
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
                     c = new String[6];
                     my5 = new Random();
                     m0t = new hc0$yln(null);
                     v4c = new hc0$ork(null);
                     au_ = new hc0$bdm(null);
                     zyp = new hc0$_cb(null);
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

                  var6 = "g~\u0004ùN!ÙÑ\u0088\u008eÓ@6\u009a¥\u0010\u0010ÊL\r\u001dÙ%;©\u001b\u001cE \u00866¬\u0091";
                  var8 = "g~\u0004ùN!ÙÑ\u0088\u008eÓ@6\u009a¥\u0010\u0010ÊL\r\u001dÙ%;©\u001b\u001cE \u00866¬\u0091".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14768;
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
            throw new RuntimeException("hc0", var10);
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
         throw new RuntimeException("hc0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
