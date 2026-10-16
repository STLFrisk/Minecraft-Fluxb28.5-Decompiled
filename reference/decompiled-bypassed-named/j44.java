import com.mojang.authlib.GameProfile;
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

public final class j44 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static GameProfile j31(bdo param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic j44.a J
      // 003: ldc2_w 101246381928046
      // 006: lxor
      // 007: lstore 1
      // 008: aconst_null
      // 009: astore 4
      // 00b: invokestatic OpaquePredicate.b ()I
      // 00e: aconst_null
      // 00f: astore 5
      // 011: istore 3
      // 012: aload 0
      // 013: sipush 6520
      // 016: ldc2_w 7335752471466846707
      // 019: lload 1
      // 01a: lxor
      // 01b: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: iload 3
      // 022: ifeq 04a
      // 025: bipush 8
      // 027: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 02a: ifeq 04f
      // 02d: goto 034
      // 030: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 0
      // 035: sipush 23962
      // 038: ldc2_w 7486423101005557013
      // 03b: lload 1
      // 03c: lxor
      // 03d: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: nop
      // 043: goto 04a
      // 046: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 04d: astore 4
      // 04f: aload 0
      // 050: sipush 20600
      // 053: ldc2_w 5357215023502287094
      // 056: lload 1
      // 057: lxor
      // 058: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: nop
      // 05e: iload 3
      // 05f: ifeq 087
      // 062: bipush 8
      // 064: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 067: ifeq 08c
      // 06a: goto 071
      // 06d: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: aload 0
      // 072: sipush 22648
      // 075: ldc2_w 5024966406809872624
      // 078: lload 1
      // 079: lxor
      // 07a: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: nop
      // 080: goto 087
      // 083: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 08a: astore 5
      // 08c: aload 4
      // 08e: iload 3
      // 08f: ifeq 0c1
      // 092: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 095: ifeq 0bf
      // 098: goto 09f
      // 09b: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: aload 5
      // 0a1: iload 3
      // 0a2: ifeq 0c1
      // 0a5: goto 0ac
      // 0a8: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 0af: ifeq 0bf
      // 0b2: goto 0b9
      // 0b5: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: aconst_null
      // 0ba: areturn
      // 0bb: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: aload 5
      // 0c1: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 0c4: astore 6
      // 0c6: goto 0ce
      // 0c9: astore 7
      // 0cb: aconst_null
      // 0cc: astore 6
      // 0ce: new com/mojang/authlib/GameProfile
      // 0d1: dup
      // 0d2: aload 6
      // 0d4: aload 4
      // 0d6: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 0d9: astore 7
      // 0db: aload 0
      // 0dc: sipush 12969
      // 0df: ldc2_w 5662761553890411055
      // 0e2: lload 1
      // 0e3: lxor
      // 0e4: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: nop
      // 0ea: iload 3
      // 0eb: ifeq 113
      // 0ee: bipush 10
      // 0f0: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f3: ifeq 1f3
      // 0f6: goto 0fd
      // 0f9: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: sipush 7728
      // 101: ldc2_w 1100086469574536889
      // 104: lload 1
      // 105: lxor
      // 106: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: nop
      // 10c: goto 113
      // 10f: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 116: astore 8
      // 118: aload 8
      // 11a: invokevirtual bdo.bo9 ()Ljava/util/Set;
      // 11d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 122: astore 9
      // 124: aload 9
      // 126: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 12b: ifeq 1f3
      // 12e: aload 9
      // 130: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 135: checkcast java/lang/String
      // 138: astore 10
      // 13a: aload 8
      // 13c: aload 10
      // 13e: bipush 10
      // 140: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 143: astore 11
      // 145: bipush 0
      // 146: istore 12
      // 148: iload 12
      // 14a: aload 11
      // 14c: invokevirtual qhg.vek ()I
      // 14f: if_icmpge 1ef
      // 152: aload 11
      // 154: iload 12
      // 156: invokevirtual qhg.kd6 (I)Lbdo;
      // 159: astore 13
      // 15b: aload 13
      // 15d: sipush 3604
      // 160: ldc2_w 2407981529622724243
      // 163: lload 1
      // 164: lxor
      // 165: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: nop
      // 16b: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 16e: astore 14
      // 170: aload 13
      // 172: sipush 8522
      // 175: ldc2_w 5740967108635693511
      // 178: lload 1
      // 179: lxor
      // 17a: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: nop
      // 180: bipush 8
      // 182: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 185: iload 3
      // 186: ifeq 12b
      // 189: iload 3
      // 18a: ifeq 1e7
      // 18d: ifeq 1cb
      // 190: goto 197
      // 193: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 196: athrow
      // 197: aload 7
      // 199: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 19c: aload 10
      // 19e: new com/mojang/authlib/properties/Property
      // 1a1: dup
      // 1a2: aload 10
      // 1a4: aload 14
      // 1a6: aload 13
      // 1a8: sipush 19302
      // 1ab: ldc2_w 2115165778615303146
      // 1ae: lload 1
      // 1af: lxor
      // 1b0: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: nop
      // 1b6: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 1b9: invokespecial com/mojang/authlib/properties/Property.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 1bc: invokevirtual com/mojang/authlib/properties/PropertyMap.put (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1bf: pop
      // 1c0: iload 3
      // 1c1: ifne 1e8
      // 1c4: goto 1cb
      // 1c7: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: aload 7
      // 1cd: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 1d0: aload 10
      // 1d2: new com/mojang/authlib/properties/Property
      // 1d5: dup
      // 1d6: aload 10
      // 1d8: aload 14
      // 1da: invokespecial com/mojang/authlib/properties/Property.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 1dd: invokevirtual com/mojang/authlib/properties/PropertyMap.put (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1e0: goto 1e7
      // 1e3: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e6: athrow
      // 1e7: pop
      // 1e8: iinc 12 1
      // 1eb: iload 3
      // 1ec: ifne 148
      // 1ef: iload 3
      // 1f0: ifne 124
      // 1f3: aload 7
      // 1f5: areturn
   }

   public static bdo f9e(bdo param0, GameProfile param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic j44.a J
      // 003: ldc2_w 136141387142931
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: iload 4
      // 010: ifne 041
      // 013: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 016: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 019: ifne 040
      // 01c: goto 023
      // 01f: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: aload 0
      // 024: sipush 23962
      // 027: ldc2_w 7486453597930181736
      // 02a: lload 2
      // 02b: lxor
      // 02c: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: aload 1
      // 033: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 036: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 039: goto 040
      // 03c: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: aload 1
      // 041: iload 4
      // 043: ifne 074
      // 046: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 049: ifnull 073
      // 04c: goto 053
      // 04f: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: aload 0
      // 054: sipush 22648
      // 057: ldc2_w 5025000782140297613
      // 05a: lload 2
      // 05b: lxor
      // 05c: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: nop
      // 062: aload 1
      // 063: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 066: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 069: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 06c: goto 073
      // 06f: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: aload 1
      // 074: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 077: invokevirtual com/mojang/authlib/properties/PropertyMap.isEmpty ()Z
      // 07a: ifne 165
      // 07d: new bdo
      // 080: dup
      // 081: invokespecial bdo.<init> ()V
      // 084: astore 5
      // 086: aload 1
      // 087: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 08a: invokevirtual com/mojang/authlib/properties/PropertyMap.keySet ()Ljava/util/Set;
      // 08d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 092: astore 6
      // 094: aload 6
      // 096: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09b: ifeq 151
      // 09e: aload 6
      // 0a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a5: checkcast java/lang/String
      // 0a8: astore 7
      // 0aa: new qhg
      // 0ad: dup
      // 0ae: invokespecial qhg.<init> ()V
      // 0b1: astore 8
      // 0b3: iload 4
      // 0b5: ifne 165
      // 0b8: aload 1
      // 0b9: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 0bc: aload 7
      // 0be: invokevirtual com/mojang/authlib/properties/PropertyMap.get (Ljava/lang/Object;)Ljava/util/Collection;
      // 0c1: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0c6: astore 9
      // 0c8: aload 9
      // 0ca: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0cf: ifeq 143
      // 0d2: aload 9
      // 0d4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d9: checkcast com/mojang/authlib/properties/Property
      // 0dc: astore 10
      // 0de: new bdo
      // 0e1: dup
      // 0e2: invokespecial bdo.<init> ()V
      // 0e5: astore 11
      // 0e7: aload 11
      // 0e9: sipush 22631
      // 0ec: ldc2_w 1823537296927510928
      // 0ef: lload 2
      // 0f0: lxor
      // 0f1: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: nop
      // 0f7: aload 10
      // 0f9: invokevirtual com/mojang/authlib/properties/Property.getValue ()Ljava/lang/String;
      // 0fc: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 0ff: iload 4
      // 101: ifne 13e
      // 104: aload 10
      // 106: invokevirtual com/mojang/authlib/properties/Property.hasSignature ()Z
      // 109: iload 4
      // 10b: ifne 09b
      // 10e: goto 115
      // 111: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 114: athrow
      // 115: ifeq 137
      // 118: aload 11
      // 11a: sipush 19302
      // 11d: ldc2_w 2115200702594237079
      // 120: lload 2
      // 121: lxor
      // 122: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: nop
      // 128: aload 10
      // 12a: invokevirtual com/mojang/authlib/properties/Property.getSignature ()Ljava/lang/String;
      // 12d: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 130: goto 137
      // 133: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: aload 8
      // 139: aload 11
      // 13b: invokevirtual qhg.w2j (Lgdw;)V
      // 13e: iload 4
      // 140: ifeq 0c8
      // 143: aload 5
      // 145: aload 7
      // 147: aload 8
      // 149: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 14c: iload 4
      // 14e: ifeq 094
      // 151: aload 0
      // 152: sipush 7728
      // 155: ldc2_w 1100124143406290884
      // 158: lload 2
      // 159: lxor
      // 15a: invokedynamic q (IJ)Ljava/lang/String; bsm=j44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: nop
      // 160: aload 5
      // 162: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 165: aload 0
      // 166: areturn
   }

   public static boolean z3c(gdw param0, gdw param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 01b
      // 009: aload 1
      // 00a: if_acmpne 01a
      // 00d: goto 014
      // 010: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 013: athrow
      // 014: bipush 1
      // 015: ireturn
      // 016: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 019: athrow
      // 01a: aload 0
      // 01b: iload 3
      // 01c: ifne 030
      // 01f: ifnonnull 02f
      // 022: goto 029
      // 025: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: bipush 1
      // 02a: ireturn
      // 02b: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: aload 1
      // 030: iload 3
      // 031: ifne 045
      // 034: ifnonnull 044
      // 037: goto 03e
      // 03a: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: bipush 0
      // 03f: ireturn
      // 040: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: aload 0
      // 045: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 048: aload 1
      // 049: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 04c: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 04f: iload 3
      // 050: ifne 067
      // 053: ifne 063
      // 056: goto 05d
      // 059: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: bipush 0
      // 05e: ireturn
      // 05f: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 0
      // 064: instanceof bdo
      // 067: iload 3
      // 068: ifne 0de
      // 06b: ifeq 0da
      // 06e: goto 075
      // 071: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: aload 0
      // 076: checkcast bdo
      // 079: astore 4
      // 07b: aload 1
      // 07c: checkcast bdo
      // 07f: astore 5
      // 081: aload 4
      // 083: invokevirtual bdo.bo9 ()Ljava/util/Set;
      // 086: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 08b: astore 6
      // 08d: aload 6
      // 08f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 094: ifeq 0d8
      // 097: aload 6
      // 099: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09e: checkcast java/lang/String
      // 0a1: astore 7
      // 0a3: aload 4
      // 0a5: aload 7
      // 0a7: invokevirtual bdo.e2o (Ljava/lang/String;)Lgdw;
      // 0aa: astore 8
      // 0ac: aload 8
      // 0ae: aload 5
      // 0b0: aload 7
      // 0b2: invokevirtual bdo.e2o (Ljava/lang/String;)Lgdw;
      // 0b5: iload 2
      // 0b6: invokestatic j44.z3c (Lgdw;Lgdw;Z)Z
      // 0b9: iload 3
      // 0ba: ifne 0d9
      // 0bd: iload 3
      // 0be: ifne 0d3
      // 0c1: goto 0c8
      // 0c4: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: ifne 0d4
      // 0cb: goto 0d2
      // 0ce: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: bipush 0
      // 0d3: ireturn
      // 0d4: iload 3
      // 0d5: ifeq 08d
      // 0d8: bipush 1
      // 0d9: ireturn
      // 0da: aload 0
      // 0db: instanceof qhg
      // 0de: iload 3
      // 0df: ifne 1c6
      // 0e2: ifeq 1c1
      // 0e5: goto 0ec
      // 0e8: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: iload 2
      // 0ed: iload 3
      // 0ee: ifne 1c6
      // 0f1: goto 0f8
      // 0f4: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: ifeq 1c1
      // 0fb: goto 102
      // 0fe: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: aload 0
      // 103: checkcast qhg
      // 106: astore 4
      // 108: aload 1
      // 109: checkcast qhg
      // 10c: astore 5
      // 10e: aload 4
      // 110: invokevirtual qhg.vek ()I
      // 113: iload 3
      // 114: ifne 142
      // 117: ifne 141
      // 11a: goto 121
      // 11d: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: aload 5
      // 123: invokevirtual qhg.vek ()I
      // 126: iload 3
      // 127: ifne 13c
      // 12a: goto 131
      // 12d: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 130: athrow
      // 131: ifne 13f
      // 134: goto 13b
      // 137: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: bipush 1
      // 13c: goto 140
      // 13f: bipush 0
      // 140: ireturn
      // 141: bipush 0
      // 142: istore 6
      // 144: iload 6
      // 146: aload 4
      // 148: invokevirtual qhg.vek ()I
      // 14b: if_icmpge 1bf
      // 14e: aload 4
      // 150: iload 6
      // 152: invokevirtual qhg.b7q (I)Lgdw;
      // 155: astore 7
      // 157: bipush 0
      // 158: istore 8
      // 15a: bipush 0
      // 15b: iload 3
      // 15c: ifne 1c0
      // 15f: istore 9
      // 161: iload 9
      // 163: aload 5
      // 165: invokevirtual qhg.vek ()I
      // 168: if_icmpge 1a6
      // 16b: aload 7
      // 16d: aload 5
      // 16f: iload 9
      // 171: invokevirtual qhg.b7q (I)Lgdw;
      // 174: iload 2
      // 175: invokestatic j44.z3c (Lgdw;Lgdw;Z)Z
      // 178: iload 3
      // 179: ifne 1a8
      // 17c: iload 3
      // 17d: ifne 192
      // 180: goto 187
      // 183: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 186: athrow
      // 187: ifeq 198
      // 18a: goto 191
      // 18d: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: bipush 1
      // 192: istore 8
      // 194: iload 3
      // 195: ifeq 1a6
      // 198: iinc 9 1
      // 19b: iload 3
      // 19c: ifeq 161
      // 19f: goto 1a6
      // 1a2: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a5: athrow
      // 1a6: iload 8
      // 1a8: iload 3
      // 1a9: ifne 1b7
      // 1ac: ifne 1b8
      // 1af: goto 1b6
      // 1b2: invokestatic j44.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b5: athrow
      // 1b6: bipush 0
      // 1b7: ireturn
      // 1b8: iinc 6 1
      // 1bb: iload 3
      // 1bc: ifeq 144
      // 1bf: bipush 1
      // 1c0: ireturn
      // 1c1: aload 0
      // 1c2: aload 1
      // 1c3: invokevirtual gdw.equals (Ljava/lang/Object;)Z
      // 1c6: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7173927641840044822L, 5659122323750914797L, MethodHandles.lookup().lookupClass()).a(182487869284763L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 28747659886785L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "Ä¸ð\u0006Å\u008d\u0015ê¼ã\u0000ê-\u0098ô¬\u00105Ò¹4Æ¬\u001e3P\u0010<H·\u0087\fö K\u0091«\u0002|JË±\btwÙ6v.\u009eÇ%£ï!kçX\u007fùfÈdÂ\u0003á \u0095\u0000Çñ\u0000\u0013Ùi\u000e\u0092q`ìhjl\u0092RÖÒl\u008e¶+\u0081 û\u0095\u008a:\u009aÓ\u0010\u0011\u0089Hz$TÖ\u001c\u008dSþ&Á¥í\u0002\u0010-à\u009b!x+6°\u0018¯\u001c\u0080é5ß#\u0010u%ujU^\u008cÎò\u001bÕõ\u0013BÆ\u0019 \u009að\u008a3ê)<ã\u009f§\u000býâ\u009fH_1dêeª\u008dÒ\u009fµ¯é§{³c$";
      int var8 = "Ä¸ð\u0006Å\u008d\u0015ê¼ã\u0000ê-\u0098ô¬\u00105Ò¹4Æ¬\u001e3P\u0010<H·\u0087\fö K\u0091«\u0002|JË±\btwÙ6v.\u009eÇ%£ï!kçX\u007fùfÈdÂ\u0003á \u0095\u0000Çñ\u0000\u0013Ùi\u000e\u0092q`ìhjl\u0092RÖÒl\u008e¶+\u0081 û\u0095\u008a:\u009aÓ\u0010\u0011\u0089Hz$TÖ\u001c\u008dSþ&Á¥í\u0002\u0010-à\u009b!x+6°\u0018¯\u001c\u0080é5ß#\u0010u%ujU^\u008cÎò\u001bÕõ\u0013BÆ\u0019 \u009að\u008a3ê)<ã\u009f§\u000býâ\u009fH_1dêeª\u008dÒ\u009fµ¯é§{³c$"
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
                     c = new String[10];
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

                  var6 = "\u0087±:\u0016\u009d=¥ÙqÀ§\u0005I\u000foÝ\u0086\u009aÝxv0Ù¶èñJ<\u0096\u0098\u008d~\u0010g9SBZgÚÌâÞ\u000eÇÏÓïv";
                  var8 = "\u0087±:\u0016\u009d=¥ÙqÀ§\u0005I\u000foÝ\u0086\u009aÝxv0Ù¶èñJ<\u0096\u0098\u008d~\u0010g9SBZgÚÌâÞ\u000eÇÏÓïv".length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15319;
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
            throw new RuntimeException("j44", var10);
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
         throw new RuntimeException("j44" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
