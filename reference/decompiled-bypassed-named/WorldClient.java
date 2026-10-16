import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.DynamicLights;
import net.optifine.override.PlayerControllerOF;
import org.apache.logging.log4j.LogManager;

public class WorldClient extends OpaquePredicate {
   private p_k o1e;
   private v8s tdc;
   private final Set n9o;
   private final Set a9a;
   private final Minecraft yd1;
   private final Set b7f;
   private boolean f8n;
   private static final long b;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public WorldClient(p_k param1, h50 param2, int param3, v66 param4, uan param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic WorldClient.b J
      // 003: ldc2_w 16738071382460
      // 006: lxor
      // 007: lstore 6
      // 009: aload 0
      // 00a: new ex5
      // 00d: dup
      // 00e: invokespecial ex5.<init> ()V
      // 011: new cog
      // 014: dup
      // 015: aload 2
      // 016: sipush 9342
      // 019: ldc2_w 6344967294028761913
      // 01c: lload 6
      // 01e: lxor
      // 01f: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: invokespecial cog.<init> (Lh50;Ljava/lang/String;)V
      // 028: iload 3
      // 029: invokestatic upn.mkz (I)Lupn;
      // 02c: aload 5
      // 02e: bipush 1
      // 02f: invokespecial OpaquePredicate.<init> (Lhe6;Lcog;Lupn;Luan;Z)V
      // 032: aload 0
      // 033: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 036: putfield WorldClient.n9o Ljava/util/Set;
      // 039: invokestatic OpaquePredicate.b ()I
      // 03c: aload 0
      // 03d: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 040: putfield WorldClient.a9a Ljava/util/Set;
      // 043: aload 0
      // 044: invokestatic Minecraft.vz1 ()Lc05;
      // 047: putfield WorldClient.yd1 Lc05;
      // 04a: istore 8
      // 04c: aload 0
      // 04d: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 050: putfield WorldClient.b7f Ljava/util/Set;
      // 053: aload 0
      // 054: bipush 0
      // 055: putfield WorldClient.f8n Z
      // 058: aload 0
      // 059: aload 1
      // 05a: putfield WorldClient.o1e Lp_k;
      // 05d: aload 0
      // 05e: invokevirtual WorldClient.r7d ()Lcog;
      // 061: aload 4
      // 063: invokevirtual cog.jbe (Lv66;)V
      // 066: aload 0
      // 067: getfield WorldClient.vzz Lupn;
      // 06a: aload 0
      // 06b: invokevirtual upn.d9i (Lt9d;)V
      // 06e: aload 0
      // 06f: new mew
      // 072: dup
      // 073: bipush 8
      // 075: bipush 64
      // 077: bipush 8
      // 079: invokespecial mew.<init> (III)V
      // 07c: invokevirtual WorldClient.spu (Lmew;)V
      // 07f: aload 0
      // 080: aload 0
      // 081: invokevirtual WorldClient.qya ()Lg6k;
      // 084: putfield WorldClient.jro Lg6k;
      // 087: aload 0
      // 088: new rl2
      // 08b: dup
      // 08c: invokespecial rl2.<init> ()V
      // 08f: putfield WorldClient.hqr L_ie;
      // 092: aload 0
      // 093: invokevirtual WorldClient.lhz ()V
      // 096: aload 0
      // 097: invokevirtual WorldClient.td1 ()V
      // 09a: getstatic net/optifine/reflect/Reflector.WorldEvent_Load_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 09d: bipush 1
      // 09e: anewarray 144
      // 0a1: dup
      // 0a2: bipush 0
      // 0a3: aload 0
      // 0a4: aastore
      // 0a5: invokestatic net/optifine/reflect/Reflector.postForgeBusEvent (Lnet/optifine/reflect/ReflectorConstructor;[Ljava/lang/Object;)Z
      // 0a8: pop
      // 0a9: iload 8
      // 0ab: ifeq 114
      // 0ae: aload 0
      // 0af: getfield WorldClient.yd1 Lc05;
      // 0b2: getfield Minecraft.l7q Lhh6;
      // 0b5: ifnull 109
      // 0b8: goto 0bf
      // 0bb: invokestatic WorldClient.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield WorldClient.yd1 Lc05;
      // 0c3: getfield Minecraft.l7q Lhh6;
      // 0c6: iload 8
      // 0c8: ifeq 103
      // 0cb: goto 0d2
      // 0ce: invokestatic WorldClient.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0d5: ldc hh6
      // 0d7: nop
      // 0d8: if_acmpne 109
      // 0db: goto 0e2
      // 0de: invokestatic WorldClient.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: getfield WorldClient.yd1 Lc05;
      // 0e6: new net/optifine/override/PlayerControllerOF
      // 0e9: dup
      // 0ea: aload 0
      // 0eb: getfield WorldClient.yd1 Lc05;
      // 0ee: aload 1
      // 0ef: invokespecial net/optifine/override/PlayerControllerOF.<init> (Lc05;Lp_k;)V
      // 0f2: putfield Minecraft.l7q Lhh6;
      // 0f5: aload 0
      // 0f6: getfield WorldClient.yd1 Lc05;
      // 0f9: getfield Minecraft.l7q Lhh6;
      // 0fc: goto 103
      // 0ff: invokestatic WorldClient.a (Loov;)Loov;
      // 102: athrow
      // 103: checkcast net/optifine/override/PlayerControllerOF
      // 106: invokestatic net/optifine/CustomGuis.setPlayerControllerOF (Lnet/optifine/override/PlayerControllerOF;)V
      // 109: new pnw
      // 10c: dup
      // 10d: invokespecial pnw.<init> ()V
      // 110: invokestatic EventBus.esg (Lvlc;)Lvlc;
      // 113: pop
      // 114: return
   }

   @Override
   public void aoj() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic WorldClient.b J
      // 003: ldc2_w 104314182531444
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: invokespecial OpaquePredicate.aoj ()V
      // 00c: invokestatic OpaquePredicate.b ()I
      // 00f: aload 0
      // 010: aload 0
      // 011: invokevirtual WorldClient.p2b ()J
      // 014: lconst_1
      // 015: ladd
      // 016: invokevirtual WorldClient.f1m (J)V
      // 019: istore 3
      // 01a: aload 0
      // 01b: invokevirtual WorldClient.eir ()Lef9;
      // 01e: sipush 17207
      // 021: ldc2_w 4416857232957430966
      // 024: lload 1
      // 025: lxor
      // 026: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: nop
      // 02c: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 02f: iload 3
      // 030: ifeq 064
      // 033: ifeq 04e
      // 036: goto 03d
      // 039: invokestatic WorldClient.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: aload 0
      // 03f: invokevirtual WorldClient.bq8 ()J
      // 042: lconst_1
      // 043: ladd
      // 044: invokevirtual WorldClient.p7c (J)V
      // 047: goto 04e
      // 04a: invokestatic WorldClient.a (Loov;)Loov;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield WorldClient.e8t Luan;
      // 052: sipush 24132
      // 055: ldc2_w 1824695464577581516
      // 058: lload 1
      // 059: lxor
      // 05a: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: nop
      // 060: invokevirtual uan.qek (Ljava/lang/String;)V
      // 063: bipush 0
      // 064: istore 4
      // 066: iload 4
      // 068: bipush 10
      // 06a: if_icmpge 0dc
      // 06d: aload 0
      // 06e: getfield WorldClient.a9a Ljava/util/Set;
      // 071: invokeinterface java/util/Set.isEmpty ()Z 1
      // 076: iload 3
      // 077: ifeq 0f8
      // 07a: iload 3
      // 07b: ifeq 0f8
      // 07e: goto 085
      // 081: invokestatic WorldClient.a (Loov;)Loov;
      // 084: athrow
      // 085: ifne 0dc
      // 088: goto 08f
      // 08b: invokestatic WorldClient.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 0
      // 090: getfield WorldClient.a9a Ljava/util/Set;
      // 093: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 098: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09d: checkcast EntityLivingBase
      // 0a0: astore 5
      // 0a2: aload 0
      // 0a3: getfield WorldClient.a9a Ljava/util/Set;
      // 0a6: aload 5
      // 0a8: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 0ad: pop
      // 0ae: iload 3
      // 0af: ifeq 0d8
      // 0b2: aload 0
      // 0b3: getfield WorldClient.guf Ljava/util/List;
      // 0b6: aload 5
      // 0b8: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0bd: ifne 0d5
      // 0c0: goto 0c7
      // 0c3: invokestatic WorldClient.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: aload 5
      // 0ca: invokevirtual WorldClient.xzq (Li2h;)Z
      // 0cd: pop
      // 0ce: goto 0d5
      // 0d1: invokestatic WorldClient.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: iinc 4 1
      // 0d8: iload 3
      // 0d9: ifne 066
      // 0dc: aload 0
      // 0dd: getfield WorldClient.e8t Luan;
      // 0e0: sipush 26036
      // 0e3: ldc2_w 2625991803704310326
      // 0e6: lload 1
      // 0e7: lxor
      // 0e8: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: nop
      // 0ee: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 0f1: aload 0
      // 0f2: getfield WorldClient.tdc Lv8s;
      // 0f5: invokevirtual v8s.p68 ()Z
      // 0f8: pop
      // 0f9: aload 0
      // 0fa: getfield WorldClient.e8t Luan;
      // 0fd: sipush 21188
      // 100: ldc2_w 5765990636649860418
      // 103: lload 1
      // 104: lxor
      // 105: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: nop
      // 10b: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 10e: aload 0
      // 10f: invokevirtual WorldClient.b1d ()V
      // 112: aload 0
      // 113: getfield WorldClient.e8t Luan;
      // 116: invokevirtual uan.uio ()V
      // 119: return
   }

   public void fx0(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   @Override
   public g6k qya() {
      this.tdc = new v8s(this);
      return this.tdc;
   }

   @Override
   public void b1d() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic WorldClient.b J
      // 03: ldc2_w 23632895884138
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: invokespecial OpaquePredicate.b1d ()V
      // 0c: invokestatic OpaquePredicate.c ()I
      // 0f: aload 0
      // 10: getfield WorldClient.b7f Ljava/util/Set;
      // 13: aload 0
      // 14: getfield WorldClient.auv Ljava/util/Set;
      // 17: invokeinterface java/util/Set.retainAll (Ljava/util/Collection;)Z 2
      // 1c: pop
      // 1d: istore 3
      // 1e: aload 0
      // 1f: getfield WorldClient.b7f Ljava/util/Set;
      // 22: invokeinterface java/util/Set.size ()I 1
      // 27: iload 3
      // 28: ifne 4f
      // 2b: aload 0
      // 2c: getfield WorldClient.auv Ljava/util/Set;
      // 2f: invokeinterface java/util/Set.size ()I 1
      // 34: if_icmpne 4e
      // 37: goto 3e
      // 3a: invokestatic WorldClient.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield WorldClient.b7f Ljava/util/Set;
      // 42: invokeinterface java/util/Set.clear ()V 1
      // 47: goto 4e
      // 4a: invokestatic WorldClient.a (Loov;)Loov;
      // 4d: athrow
      // 4e: bipush 0
      // 4f: istore 4
      // 51: aload 0
      // 52: getfield WorldClient.auv Ljava/util/Set;
      // 55: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 5a: astore 5
      // 5c: aload 5
      // 5e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 63: ifeq fb
      // 66: aload 5
      // 68: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6d: checkcast h2f
      // 70: astore 6
      // 72: aload 0
      // 73: getfield WorldClient.b7f Ljava/util/Set;
      // 76: aload 6
      // 78: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 7d: iload 3
      // 7e: ifne 9a
      // 81: ifne f7
      // 84: goto 8b
      // 87: invokestatic WorldClient.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 6
      // 8d: getfield h2f.jnd I
      // 90: bipush 16
      // 92: imul
      // 93: goto 9a
      // 96: invokestatic WorldClient.a (Loov;)Loov;
      // 99: athrow
      // 9a: istore 7
      // 9c: aload 6
      // 9e: getfield h2f.km5 I
      // a1: bipush 16
      // a3: imul
      // a4: istore 8
      // a6: aload 0
      // a7: getfield WorldClient.e8t Luan;
      // aa: sipush 5145
      // ad: ldc2_w 547152264614267275
      // b0: lload 1
      // b1: lxor
      // b2: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: nop
      // b8: invokevirtual uan.qek (Ljava/lang/String;)V
      // bb: aload 0
      // bc: aload 6
      // be: getfield h2f.jnd I
      // c1: aload 6
      // c3: getfield h2f.km5 I
      // c6: invokevirtual WorldClient.o5h (II)Ltts;
      // c9: astore 9
      // cb: aload 0
      // cc: iload 7
      // ce: iload 8
      // d0: aload 9
      // d2: invokevirtual WorldClient.ev3 (IILtts;)V
      // d5: aload 0
      // d6: getfield WorldClient.e8t Luan;
      // d9: invokevirtual uan.uio ()V
      // dc: aload 0
      // dd: getfield WorldClient.b7f Ljava/util/Set;
      // e0: aload 6
      // e2: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // e7: pop
      // e8: iinc 4 1
      // eb: iload 4
      // ed: bipush 10
      // ef: if_icmplt f7
      // f2: return
      // f3: invokestatic WorldClient.a (Loov;)Loov;
      // f6: athrow
      // f7: iload 3
      // f8: ifeq 5c
      // fb: return
   }

   public void ef0(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: iload 3
      // 06: ifeq 1f
      // 09: aload 0
      // 0a: getfield WorldClient.tdc Lv8s;
      // 0d: iload 1
      // 0e: iload 2
      // 0f: invokevirtual v8s.w1o (II)Ltts;
      // 12: pop
      // 13: iload 4
      // 15: ifne 2f
      // 18: goto 1f
      // 1b: invokestatic WorldClient.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield WorldClient.tdc Lv8s;
      // 23: iload 1
      // 24: iload 2
      // 25: invokevirtual v8s.e11 (II)V
      // 28: goto 2f
      // 2b: invokestatic WorldClient.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iload 3
      // 30: ifne 58
      // 33: aload 0
      // 34: iload 1
      // 35: bipush 16
      // 37: imul
      // 38: bipush 0
      // 39: iload 2
      // 3a: bipush 16
      // 3c: imul
      // 3d: iload 1
      // 3e: bipush 16
      // 40: imul
      // 41: bipush 15
      // 43: iadd
      // 44: sipush 256
      // 47: iload 2
      // 48: bipush 16
      // 4a: imul
      // 4b: bipush 15
      // 4d: iadd
      // 4e: invokevirtual WorldClient.pa7 (IIIIII)V
      // 51: goto 58
      // 54: invokestatic WorldClient.a (Loov;)Loov;
      // 57: athrow
      // 58: return
   }

   @Override
   public boolean xzq(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokespecial OpaquePredicate.xzq (Li2h;)Z
      // 05: istore 3
      // 06: invokestatic OpaquePredicate.c ()I
      // 09: aload 0
      // 0a: getfield WorldClient.n9o Ljava/util/Set;
      // 0d: aload 1
      // 0e: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 13: pop
      // 14: istore 2
      // 15: iload 3
      // 16: iload 2
      // 17: ifne 45
      // 1a: ifne 3a
      // 1d: goto 24
      // 20: invokestatic WorldClient.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield WorldClient.a9a Ljava/util/Set;
      // 28: aload 1
      // 29: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 2e: pop
      // 2f: iload 2
      // 30: ifeq 6f
      // 33: goto 3a
      // 36: invokestatic WorldClient.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 1
      // 3b: instanceof _f3
      // 3e: goto 45
      // 41: invokestatic WorldClient.a (Loov;)Loov;
      // 44: athrow
      // 45: iload 2
      // 46: ifne 70
      // 49: ifeq 6f
      // 4c: goto 53
      // 4f: invokestatic WorldClient.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: getfield WorldClient.yd1 Lc05;
      // 57: invokevirtual Minecraft.yp9 ()Ldbu;
      // 5a: new r05
      // 5d: dup
      // 5e: aload 1
      // 5f: checkcast _f3
      // 62: invokespecial r05.<init> (L_f3;)V
      // 65: invokevirtual dbu.mak (Ljp4;)V
      // 68: goto 6f
      // 6b: invokestatic WorldClient.a (Loov;)Loov;
      // 6e: athrow
      // 6f: iload 3
      // 70: ireturn
   }

   @Override
   public void rqa(EntityLivingBase var1) {
      super.rqa(var1);
      this.n9o.remove(var1);
   }

   @Override
   public void m8m(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial OpaquePredicate.m8m (Li2h;)V
      // 09: aload 0
      // 0a: getfield WorldClient.a9a Ljava/util/Set;
      // 0d: aload 1
      // 0e: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 13: iload 2
      // 14: ifne 32
      // 17: ifeq 33
      // 1a: goto 21
      // 1d: invokestatic WorldClient.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield WorldClient.a9a Ljava/util/Set;
      // 25: aload 1
      // 26: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 2b: goto 32
      // 2e: invokestatic WorldClient.a (Loov;)Loov;
      // 31: athrow
      // 32: pop
      // 33: return
   }

   @Override
   public void cvm(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokespecial OpaquePredicate.cvm (Li2h;)V
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: bipush 0
      // 09: istore 3
      // 0a: istore 2
      // 0b: aload 0
      // 0c: getfield WorldClient.n9o Ljava/util/Set;
      // 0f: aload 1
      // 10: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 15: iload 2
      // 16: ifeq 2e
      // 19: ifeq 5f
      // 1c: goto 23
      // 1f: invokestatic WorldClient.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: invokevirtual EntityLivingBase.gzr ()Z
      // 27: goto 2e
      // 2a: invokestatic WorldClient.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 2
      // 2f: ifeq 5e
      // 32: ifeq 4d
      // 35: goto 3c
      // 38: invokestatic WorldClient.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield WorldClient.a9a Ljava/util/Set;
      // 40: aload 1
      // 41: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 46: pop
      // 47: bipush 1
      // 48: istore 3
      // 49: iload 2
      // 4a: ifne 5f
      // 4d: aload 0
      // 4e: getfield WorldClient.n9o Ljava/util/Set;
      // 51: aload 1
      // 52: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 57: goto 5e
      // 5a: invokestatic WorldClient.a (Loov;)Loov;
      // 5d: athrow
      // 5e: pop
      // 5f: return
   }

   public void fih(int param1, EntityLivingBase param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: invokevirtual WorldClient.oks (I)Li2h;
      // 09: astore 4
      // 0b: aload 4
      // 0d: iload 3
      // 0e: ifne 34
      // 11: ifnull 28
      // 14: goto 1b
      // 17: invokestatic WorldClient.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 4
      // 1e: invokevirtual WorldClient.rqa (Li2h;)V
      // 21: goto 28
      // 24: invokestatic WorldClient.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield WorldClient.n9o Ljava/util/Set;
      // 2c: aload 2
      // 2d: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 32: pop
      // 33: aload 2
      // 34: iload 1
      // 35: invokevirtual EntityLivingBase.i6d (I)V
      // 38: aload 0
      // 39: iload 3
      // 3a: ifne 5e
      // 3d: aload 2
      // 3e: invokevirtual WorldClient.xzq (Li2h;)Z
      // 41: ifne 5d
      // 44: goto 4b
      // 47: invokestatic WorldClient.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield WorldClient.a9a Ljava/util/Set;
      // 4f: aload 2
      // 50: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 55: pop
      // 56: goto 5d
      // 59: invokestatic WorldClient.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield WorldClient.twi Lpni;
      // 61: iload 1
      // 62: aload 2
      // 63: invokevirtual pni.yfe (ILjava/lang/Object;)V
      // 66: return
   }

   @Override
   public EntityLivingBase oks(int var1) {
      try {
         if (var1 == this.yd1.vg8.jwu()) {
            return this.yd1.vg8;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return super.oks(var1);
   }

   public EntityLivingBase i8e(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield WorldClient.twi Lpni;
      // 08: iload 1
      // 09: invokevirtual pni.un9 (I)Ljava/lang/Object;
      // 0c: checkcast EntityLivingBase
      // 0f: astore 3
      // 10: aload 3
      // 11: iload 2
      // 12: ifne 37
      // 15: ifnull 36
      // 18: goto 1f
      // 1b: invokestatic WorldClient.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield WorldClient.n9o Ljava/util/Set;
      // 23: aload 3
      // 24: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 29: pop
      // 2a: aload 0
      // 2b: aload 3
      // 2c: invokevirtual WorldClient.rqa (Li2h;)V
      // 2f: goto 36
      // 32: invokestatic WorldClient.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 3
      // 37: areturn
   }

   public boolean blc(mew var1, zfz var2) {
      int var3 = var1.getX();
      int var4 = var1.getY();
      int var5 = var1.getZ();
      this.fx0(var3, var4, var5, var3, var4, var5);
      return super.vct(var1, var2, 3);
   }

   @Override
   public void ci8() {
      long var1 = b ^ 113775170360873L;
      this.o1e._m3().g8c(new tao(b<"r">(32314, 3843497271938092768L ^ var1)));
   }

   @Override
   public void hk_() {
   }

   @Override
   public int _hl() {
      return this.yd1.oxn.gcj;
   }

   public void plw(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 16
      // 002: istore 5
      // 004: invokestatic OpaquePredicate.c ()I
      // 007: new java/util/Random
      // 00a: dup
      // 00b: invokespecial java/util/Random.<init> ()V
      // 00e: astore 6
      // 010: istore 4
      // 012: aload 0
      // 013: getfield WorldClient.yd1 Lc05;
      // 016: getfield Minecraft.vg8 Ll86;
      // 019: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 01c: astore 7
      // 01e: aload 0
      // 01f: getfield WorldClient.yd1 Lc05;
      // 022: getfield Minecraft.l7q Lhh6;
      // 025: invokevirtual hh6.fdl ()Lh50$f05;
      // 028: getstatic h50$f05._nr Lh50$f05;
      // 02b: if_acmpne 05c
      // 02e: aload 7
      // 030: iload 4
      // 032: ifne 048
      // 035: goto 03c
      // 038: invokestatic WorldClient.a (Loov;)Loov;
      // 03b: athrow
      // 03c: ifnull 05c
      // 03f: goto 046
      // 042: invokestatic WorldClient.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 7
      // 048: invokevirtual erg.gn1 ()Lu7m;
      // 04b: invokestatic e0x.p69 (Lu7m;)Le0x;
      // 04e: getstatic ox_.c28 Le0x;
      // 051: if_acmpne 05c
      // 054: bipush 1
      // 055: goto 05d
      // 058: invokestatic WorldClient.a (Loov;)Loov;
      // 05b: athrow
      // 05c: bipush 0
      // 05d: istore 8
      // 05f: new mew$mix
      // 062: dup
      // 063: invokespecial mew$mix.<init> ()V
      // 066: astore 9
      // 068: bipush 0
      // 069: istore 10
      // 06b: iload 10
      // 06d: sipush 1000
      // 070: if_icmpge 136
      // 073: iload 1
      // 074: aload 0
      // 075: getfield WorldClient.fsy Ljava/util/Random;
      // 078: iload 5
      // 07a: invokevirtual java/util/Random.nextInt (I)I
      // 07d: iadd
      // 07e: aload 0
      // 07f: getfield WorldClient.fsy Ljava/util/Random;
      // 082: iload 5
      // 084: invokevirtual java/util/Random.nextInt (I)I
      // 087: isub
      // 088: istore 11
      // 08a: iload 2
      // 08b: aload 0
      // 08c: getfield WorldClient.fsy Ljava/util/Random;
      // 08f: iload 5
      // 091: invokevirtual java/util/Random.nextInt (I)I
      // 094: iadd
      // 095: aload 0
      // 096: getfield WorldClient.fsy Ljava/util/Random;
      // 099: iload 5
      // 09b: invokevirtual java/util/Random.nextInt (I)I
      // 09e: isub
      // 09f: istore 12
      // 0a1: iload 3
      // 0a2: aload 0
      // 0a3: getfield WorldClient.fsy Ljava/util/Random;
      // 0a6: iload 5
      // 0a8: invokevirtual java/util/Random.nextInt (I)I
      // 0ab: iadd
      // 0ac: aload 0
      // 0ad: getfield WorldClient.fsy Ljava/util/Random;
      // 0b0: iload 5
      // 0b2: invokevirtual java/util/Random.nextInt (I)I
      // 0b5: isub
      // 0b6: istore 13
      // 0b8: aload 9
      // 0ba: iload 11
      // 0bc: iload 12
      // 0be: iload 13
      // 0c0: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 0c3: pop
      // 0c4: aload 0
      // 0c5: aload 9
      // 0c7: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 0ca: astore 14
      // 0cc: aload 14
      // 0ce: invokeinterface zfz.r_y ()Le0x; 1
      // 0d3: aload 0
      // 0d4: aload 9
      // 0d6: aload 14
      // 0d8: aload 6
      // 0da: invokevirtual e0x.kyo (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 0dd: iload 4
      // 0df: ifne 131
      // 0e2: iload 8
      // 0e4: ifeq 12e
      // 0e7: goto 0ee
      // 0ea: invokestatic WorldClient.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 14
      // 0f0: invokeinterface zfz.r_y ()Le0x; 1
      // 0f5: getstatic ox_.c28 Le0x;
      // 0f8: if_acmpne 12e
      // 0fb: goto 102
      // 0fe: invokestatic WorldClient.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 0
      // 103: getstatic w_0.o7n Lw_0;
      // 106: iload 11
      // 108: i2f
      // 109: ldc 0.5
      // 10b: nop
      // 10c: fadd
      // 10d: f2d
      // 10e: iload 12
      // 110: i2f
      // 111: ldc 0.5
      // 113: nop
      // 114: fadd
      // 115: f2d
      // 116: iload 13
      // 118: i2f
      // 119: ldc 0.5
      // 11b: nop
      // 11c: fadd
      // 11d: f2d
      // 11e: dconst_0
      // 11f: dconst_0
      // 120: dconst_0
      // 121: bipush 0
      // 122: newarray 10
      // 124: invokevirtual WorldClient.zvy (Lw_0;DDDDDD[I)V
      // 127: goto 12e
      // 12a: invokestatic WorldClient.a (Loov;)Loov;
      // 12d: athrow
      // 12e: iinc 10 1
      // 131: iload 4
      // 133: ifeq 06b
      // 136: return
   }

   public void gvm() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield WorldClient.guf Ljava/util/List;
      // 004: aload 0
      // 005: getfield WorldClient.idd Ljava/util/List;
      // 008: invokeinterface java/util/List.removeAll (Ljava/util/Collection;)Z 2
      // 00d: pop
      // 00e: invokestatic OpaquePredicate.c ()I
      // 011: bipush 0
      // 012: istore 2
      // 013: istore 1
      // 014: iload 2
      // 015: aload 0
      // 016: getfield WorldClient.idd Ljava/util/List;
      // 019: invokeinterface java/util/List.size ()I 1
      // 01e: if_icmpge 090
      // 021: aload 0
      // 022: getfield WorldClient.idd Ljava/util/List;
      // 025: iload 2
      // 026: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 02b: checkcast EntityLivingBase
      // 02e: astore 3
      // 02f: aload 3
      // 030: getfield EntityLivingBase.jw4 I
      // 033: istore 4
      // 035: aload 3
      // 036: getfield EntityLivingBase.e6l I
      // 039: istore 5
      // 03b: iload 1
      // 03c: ifne 08c
      // 03f: aload 3
      // 040: getfield EntityLivingBase.qok Z
      // 043: iload 1
      // 044: ifne 091
      // 047: goto 04e
      // 04a: invokestatic WorldClient.a (Loov;)Loov;
      // 04d: athrow
      // 04e: ifeq 089
      // 051: goto 058
      // 054: invokestatic WorldClient.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 0
      // 059: iload 4
      // 05b: iload 5
      // 05d: iload 1
      // 05e: ifne 082
      // 061: goto 068
      // 064: invokestatic WorldClient.a (Loov;)Loov;
      // 067: athrow
      // 068: bipush 1
      // 069: invokevirtual WorldClient.ivw (IIZ)Z
      // 06c: ifeq 089
      // 06f: goto 076
      // 072: invokestatic WorldClient.a (Loov;)Loov;
      // 075: athrow
      // 076: aload 0
      // 077: iload 4
      // 079: iload 5
      // 07b: goto 082
      // 07e: invokestatic WorldClient.a (Loov;)Loov;
      // 081: athrow
      // 082: invokevirtual WorldClient.o5h (II)Ltts;
      // 085: aload 3
      // 086: invokevirtual tts.v13 (Li2h;)V
      // 089: iinc 2 1
      // 08c: iload 1
      // 08d: ifeq 014
      // 090: bipush 0
      // 091: istore 2
      // 092: iload 2
      // 093: aload 0
      // 094: getfield WorldClient.idd Ljava/util/List;
      // 097: invokeinterface java/util/List.size ()I 1
      // 09c: if_icmpge 0c2
      // 09f: aload 0
      // 0a0: aload 0
      // 0a1: getfield WorldClient.idd Ljava/util/List;
      // 0a4: iload 2
      // 0a5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0aa: checkcast EntityLivingBase
      // 0ad: invokevirtual WorldClient.cvm (Li2h;)V
      // 0b0: iinc 2 1
      // 0b3: iload 1
      // 0b4: ifne 0cb
      // 0b7: iload 1
      // 0b8: ifeq 092
      // 0bb: goto 0c2
      // 0be: invokestatic WorldClient.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: getfield WorldClient.idd Ljava/util/List;
      // 0c6: invokeinterface java/util/List.clear ()V 1
      // 0cb: bipush 0
      // 0cc: istore 2
      // 0cd: iload 2
      // 0ce: aload 0
      // 0cf: getfield WorldClient.guf Ljava/util/List;
      // 0d2: invokeinterface java/util/List.size ()I 1
      // 0d7: if_icmpge 1c9
      // 0da: aload 0
      // 0db: getfield WorldClient.guf Ljava/util/List;
      // 0de: iload 2
      // 0df: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e4: checkcast EntityLivingBase
      // 0e7: astore 3
      // 0e8: aload 3
      // 0e9: getfield EntityLivingBase.hzp Li2h;
      // 0ec: iload 1
      // 0ed: ifne 148
      // 0f0: ifnull 147
      // 0f3: goto 0fa
      // 0f6: invokestatic WorldClient.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 3
      // 0fb: getfield EntityLivingBase.hzp Li2h;
      // 0fe: iload 1
      // 0ff: ifne 143
      // 102: goto 109
      // 105: invokestatic WorldClient.a (Loov;)Loov;
      // 108: athrow
      // 109: getfield EntityLivingBase.ma9 Z
      // 10c: ifne 13a
      // 10f: goto 116
      // 112: invokestatic WorldClient.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 3
      // 117: getfield EntityLivingBase.hzp Li2h;
      // 11a: getfield EntityLivingBase.wgv Li2h;
      // 11d: iload 1
      // 11e: ifne 143
      // 121: goto 128
      // 124: invokestatic WorldClient.a (Loov;)Loov;
      // 127: athrow
      // 128: aload 3
      // 129: if_acmpne 13a
      // 12c: goto 133
      // 12f: invokestatic WorldClient.a (Loov;)Loov;
      // 132: athrow
      // 133: goto 1c2
      // 136: invokestatic WorldClient.a (Loov;)Loov;
      // 139: athrow
      // 13a: aload 3
      // 13b: getfield EntityLivingBase.hzp Li2h;
      // 13e: aconst_null
      // 13f: putfield EntityLivingBase.wgv Li2h;
      // 142: aload 3
      // 143: aconst_null
      // 144: putfield EntityLivingBase.hzp Li2h;
      // 147: aload 3
      // 148: getfield EntityLivingBase.ma9 Z
      // 14b: iload 1
      // 14c: ifne 164
      // 14f: ifeq 1c2
      // 152: goto 159
      // 155: invokestatic WorldClient.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 3
      // 15a: getfield EntityLivingBase.jw4 I
      // 15d: goto 164
      // 160: invokestatic WorldClient.a (Loov;)Loov;
      // 163: athrow
      // 164: istore 4
      // 166: aload 3
      // 167: getfield EntityLivingBase.e6l I
      // 16a: istore 5
      // 16c: aload 3
      // 16d: iload 1
      // 16e: ifne 1bc
      // 171: getfield EntityLivingBase.qok Z
      // 174: ifeq 1af
      // 177: goto 17e
      // 17a: invokestatic WorldClient.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 0
      // 17f: iload 1
      // 180: ifne 1be
      // 183: goto 18a
      // 186: invokestatic WorldClient.a (Loov;)Loov;
      // 189: athrow
      // 18a: iload 4
      // 18c: iload 5
      // 18e: bipush 1
      // 18f: invokevirtual WorldClient.ivw (IIZ)Z
      // 192: ifeq 1af
      // 195: goto 19c
      // 198: invokestatic WorldClient.a (Loov;)Loov;
      // 19b: athrow
      // 19c: aload 0
      // 19d: iload 4
      // 19f: iload 5
      // 1a1: invokevirtual WorldClient.o5h (II)Ltts;
      // 1a4: aload 3
      // 1a5: invokevirtual tts.v13 (Li2h;)V
      // 1a8: goto 1af
      // 1ab: invokestatic WorldClient.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 0
      // 1b0: getfield WorldClient.guf Ljava/util/List;
      // 1b3: iload 2
      // 1b4: iinc 2 -1
      // 1b7: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 1bc: pop
      // 1bd: aload 0
      // 1be: aload 3
      // 1bf: invokevirtual WorldClient.cvm (Li2h;)V
      // 1c2: iinc 2 1
      // 1c5: iload 1
      // 1c6: ifeq 0cd
      // 1c9: return
   }

   @Override
   public wsc utr(e1i var1) {
      try {
         long var2 = b ^ 104532444038579L;
         wsc var4 = super.utr(var1);
         var4.h1o(b<"r">(11236, 2803543840330909870L ^ var2), new kh3$1(this));
         var4.h1o(b<"r">(6575, 4400863832219007718L ^ var2), new kh3$2(this));
         var4.h1o(b<"r">(26189, 7294873925936989455L ^ var2), new kh3$3(this));
         var4.h1o(b<"r">(10011, 8481833304861475932L ^ var2), new kh3$4(this));
         return var4;
      } catch (Throwable var6) {
         LogManager.getLogger("FluxDiag").info("FLUX-DIAG WorldClient.utr catch:");
         LogManager.getLogger("FluxDiag").info(var6);
         return null;
      }
   }

   public void c9p(mew var1, String var2, float var3, float var4, boolean var5) {
      this.wd_((double)var1.getX() + 0.5, (double)var1.getY() + 0.5, (double)var1.getZ() + 0.5, var2, var3, var4, var5);
   }

   @Override
   public void wd_(double param1, double param3, double param5, String param7, float param8, float param9, boolean param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic WorldClient.b J
      // 003: ldc2_w 54354815982505
      // 006: lxor
      // 007: lstore 11
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 13
      // 00e: bipush 0
      // 00f: nop
      // 010: nop
      // 011: nop
      // 012: nop
      // 013: nop
      // 014: iload 13
      // 016: ifne 04a
      // 019: ifeq 086
      // 01c: goto 023
      // 01f: invokestatic WorldClient.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 7
      // 025: iload 13
      // 027: ifne 083
      // 02a: goto 031
      // 02d: invokestatic WorldClient.a (Loov;)Loov;
      // 030: athrow
      // 031: sipush 2973
      // 034: ldc2_w 6464956703716832971
      // 037: lload 11
      // 039: lxor
      // 03a: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: nop
      // 040: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 043: goto 04a
      // 046: invokestatic WorldClient.a (Loov;)Loov;
      // 049: athrow
      // 04a: ifeq 086
      // 04d: sipush 32330
      // 050: ldc2_w 4489368289252705043
      // 053: lload 11
      // 055: lxor
      // 056: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: nop
      // 05c: bipush 3
      // 05d: anewarray 144
      // 060: dup
      // 061: bipush 0
      // 062: dload 1
      // 063: d2i
      // 064: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 067: aastore
      // 068: dup
      // 069: bipush 1
      // 06a: dload 3
      // 06b: d2i
      // 06c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06f: aastore
      // 070: dup
      // 071: bipush 2
      // 072: dload 5
      // 074: d2i
      // 075: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 078: aastore
      // 079: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 07c: goto 083
      // 07f: invokestatic WorldClient.a (Loov;)Loov;
      // 082: athrow
      // 083: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 086: aload 0
      // 087: getfield WorldClient.yd1 Lc05;
      // 08a: invokevirtual Minecraft.nsd ()Li2h;
      // 08d: dload 1
      // 08e: dload 3
      // 08f: dload 5
      // 091: invokevirtual EntityLivingBase.p53 (DDD)D
      // 094: dstore 14
      // 096: new vs1
      // 099: dup
      // 09a: new gdz
      // 09d: dup
      // 09e: aload 7
      // 0a0: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 0a3: fload 8
      // 0a5: fload 9
      // 0a7: dload 1
      // 0a8: d2f
      // 0a9: dload 3
      // 0aa: d2f
      // 0ab: dload 5
      // 0ad: d2f
      // 0ae: invokespecial vs1.<init> (Lgdz;FFFFF)V
      // 0b1: astore 16
      // 0b3: iload 10
      // 0b5: iload 13
      // 0b7: ifne 0dd
      // 0ba: ifeq 10a
      // 0bd: goto 0c4
      // 0c0: invokestatic WorldClient.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: dload 14
      // 0c6: ldc2_w 100.0
      // 0c9: iload 13
      // 0cb: ifne 0ef
      // 0ce: goto 0d5
      // 0d1: invokestatic WorldClient.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: dcmpl
      // 0d6: goto 0dd
      // 0d9: invokestatic WorldClient.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: ifle 10a
      // 0e0: dload 14
      // 0e2: invokestatic java/lang/Math.sqrt (D)D
      // 0e5: ldc2_w 40.0
      // 0e8: goto 0ef
      // 0eb: invokestatic WorldClient.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: ddiv
      // 0f0: dstore 17
      // 0f2: aload 0
      // 0f3: getfield WorldClient.yd1 Lc05;
      // 0f6: invokevirtual Minecraft.yp9 ()Ldbu;
      // 0f9: aload 16
      // 0fb: dload 17
      // 0fd: ldc2_w 20.0
      // 100: dmul
      // 101: d2i
      // 102: invokevirtual dbu.xnf (Ljp4;I)V
      // 105: iload 13
      // 107: ifeq 11d
      // 10a: aload 0
      // 10b: getfield WorldClient.yd1 Lc05;
      // 10e: invokevirtual Minecraft.yp9 ()Ldbu;
      // 111: aload 16
      // 113: invokevirtual dbu.mak (Ljp4;)V
      // 116: goto 11d
      // 119: invokestatic WorldClient.a (Loov;)Loov;
      // 11c: athrow
      // 11d: return
   }

   @Override
   public void w39(double var1, double var3, double var5, double var7, double var9, double var11, bdo var13) {
      this.yd1.i4p.o4t(new c6y$p__(this, var1, var3, var5, var7, var9, var11, this.yd1.i4p, var13));
   }

   public void ie6(uci var1) {
      this.t7i = var1;
   }

   @Override
   public void p7c(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic WorldClient.b J
      // 03: ldc2_w 95785579476710
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: lload 1
      // 0e: iload 5
      // 10: ifne 28
      // 13: lconst_0
      // 14: lcmp
      // 15: ifge 51
      // 18: goto 1f
      // 1b: invokestatic WorldClient.a (Loov;)Loov;
      // 1e: athrow
      // 1f: lload 1
      // 20: lneg
      // 21: goto 28
      // 24: invokestatic WorldClient.a (Loov;)Loov;
      // 27: athrow
      // 28: lstore 1
      // 29: aload 0
      // 2a: invokevirtual WorldClient.eir ()Lef9;
      // 2d: sipush 7066
      // 30: ldc2_w 2784143749629021058
      // 33: lload 3
      // 34: lxor
      // 35: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: sipush 17085
      // 3e: ldc2_w 752992207790756518
      // 41: lload 3
      // 42: lxor
      // 43: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: nop
      // 49: invokevirtual ef9.iqg (Ljava/lang/String;Ljava/lang/String;)V
      // 4c: iload 5
      // 4e: ifeq 7b
      // 51: aload 0
      // 52: invokevirtual WorldClient.eir ()Lef9;
      // 55: sipush 7066
      // 58: ldc2_w 2784143749629021058
      // 5b: lload 3
      // 5c: lxor
      // 5d: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: nop
      // 63: sipush 12589
      // 66: ldc2_w 2164078490064953660
      // 69: lload 3
      // 6a: lxor
      // 6b: invokedynamic r (IJ)Ljava/lang/String; bsm=WorldClient.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: nop
      // 71: invokevirtual ef9.iqg (Ljava/lang/String;Ljava/lang/String;)V
      // 74: goto 7b
      // 77: invokestatic WorldClient.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 0
      // 7c: lload 1
      // 7d: invokespecial OpaquePredicate.p7c (J)V
      // 80: return
   }

   @Override
   public int getCombinedLight(mew var1, int var2) {
      int var3 = OpaquePredicate.c();
      int var4 = super.getCombinedLight(var1, var2);

      try {
         byte var10000 = hxt.csr();
         if (var3 != 0) {
            return var10000;
         }

         if (var10000 == 0) {
            return var4;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return DynamicLights.getCombinedLight(var1, var4);
   }

   @Override
   public boolean vct(mew var1, zfz var2, int var3) {
      this.f8n = this.ws9();
      boolean var4 = super.vct(var1, var2, var3);
      this.f8n = false;
      return var4;
   }

   private boolean ws9() {
      int var1 = OpaquePredicate.c();

      label27: {
         try {
            boolean var10000 = this.yd1.l7q instanceof PlayerControllerOF;
            if (var1 != 0) {
               return var10000;
            }

            if (var10000) {
               break label27;
            }
         } catch (oov var3) {
            throw a(var3);
         }

         return false;
      }

      PlayerControllerOF var2 = (PlayerControllerOF)this.yd1.l7q;
      return var2.isActing();
   }

   public boolean mu6() {
      return this.f8n;
   }

   public e0x tj9(int var1, int var2, int var3) {
      return this.getBlockState(new mew(var1, var2, var3)).r_y();
   }

   public static Set kv9(WorldClient var0) {
      return var0.n9o;
   }

   public static Set wdq(WorldClient var0) {
      return var0.a9a;
   }

   public static Minecraft gja(WorldClient var0) {
      return var0.yd1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-318924274784767734L, -280963883228462570L, MethodHandles.lookup().lookupClass()).a(247847343210067L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 100232998036650L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[16];
      int var7 = 0;
      String var6 = "\u0001£Ý¼ÓIü@\u0006öÑ¨\u0010\u0012Ë\u00880miÞ9\u0091ÔÎBÇâ\u007fÈ/SzQ\u00adôÓZ\u0017/Tl.ªñÊ\u000bþ\u0010ò\u0083ÅZ\u0000+@ÝÖÝLø½ÐâLù(Tql{$ðÔ\u0016©ý·só©¡üÑè¤Ã\u0004mg\u0000Ê\u001aOYÞXE¸Ú\u0012~eg\"\u008a& %\u0098M7\u009cå\u00871c\u000b·ªø\u001b\u0007»3ÊËü\u009a<\u009c\u001fY\u000be[tLçs \u0081Q¼jg^\u0003\u001f \u0010Ï\u008d)^9\u000fÚ\u0088G\u0089¹\u0096Ó\\cF§p\u009b\u009bðz !öÏ\u009b§fÀú\u0080_5ÔKÄpê?h\u008eç\bÌUóý¥\tÎæÄ\u00027 Úç\u0003níôè\u008a=£×\u008cX{J²õT\u0017'ö¾À§\u0087w\u0098î\u008e ùë 1\u0014\u0097/ÖØ¢]jdµ·þåa³\u0088\u0099Äb\u0088ì¥b·èHI®i\u0010g\u0018\u009dÒ~j\u0006NLÝ\u000f\u0094¸\u0093S\u00ad·½\u0091î'aç\u0082CÙ iôH\u0093C«X /\u001e[¼Q^ÖF¶\u0097ìK·\u000emy £(6~½G\u0012\u0010f\"\u009aCÍµ\u0010SLÖ\u0007\u008fpÒ÷V 4\u0088\u00ad\u001bªÑÁ\u001dçýÁÄ\u008aN¾\u0006³¶\u0083AD\u00182Îz\u0018þc;\u0093þô 4<¿\nç\tuþN)\u0097Q\u0000FqJÐ\u008bðJÓ\u0014[\u009d\u001dõ\u001bfØßqk8R\u0090.?KJ`êK=Ã\u0003\u0094á$mìX\u001a\u0089\u0019\u0092\u00007\u0018ùv\u0016Ü\u0006£\u0087\b\u0091Ú\u0086P\u0083\u0010ªK\u008e7õ×\u0096\t\r{\u009aýÏ{Úz\f";
      int var8 = "\u0001£Ý¼ÓIü@\u0006öÑ¨\u0010\u0012Ë\u00880miÞ9\u0091ÔÎBÇâ\u007fÈ/SzQ\u00adôÓZ\u0017/Tl.ªñÊ\u000bþ\u0010ò\u0083ÅZ\u0000+@ÝÖÝLø½ÐâLù(Tql{$ðÔ\u0016©ý·só©¡üÑè¤Ã\u0004mg\u0000Ê\u001aOYÞXE¸Ú\u0012~eg\"\u008a& %\u0098M7\u009cå\u00871c\u000b·ªø\u001b\u0007»3ÊËü\u009a<\u009c\u001fY\u000be[tLçs \u0081Q¼jg^\u0003\u001f \u0010Ï\u008d)^9\u000fÚ\u0088G\u0089¹\u0096Ó\\cF§p\u009b\u009bðz !öÏ\u009b§fÀú\u0080_5ÔKÄpê?h\u008eç\bÌUóý¥\tÎæÄ\u00027 Úç\u0003níôè\u008a=£×\u008cX{J²õT\u0017'ö¾À§\u0087w\u0098î\u008e ùë 1\u0014\u0097/ÖØ¢]jdµ·þåa³\u0088\u0099Äb\u0088ì¥b·èHI®i\u0010g\u0018\u009dÒ~j\u0006NLÝ\u000f\u0094¸\u0093S\u00ad·½\u0091î'aç\u0082CÙ iôH\u0093C«X /\u001e[¼Q^ÖF¶\u0097ìK·\u000emy £(6~½G\u0012\u0010f\"\u009aCÍµ\u0010SLÖ\u0007\u008fpÒ÷V 4\u0088\u00ad\u001bªÑÁ\u001dçýÁÄ\u008aN¾\u0006³¶\u0083AD\u00182Îz\u0018þc;\u0093þô 4<¿\nç\tuþN)\u0097Q\u0000FqJÐ\u008bðJÓ\u0014[\u009d\u001dõ\u001bfØßqk8R\u0090.?KJ`êK=Ã\u0003\u0094á$mìX\u001a\u0089\u0019\u0092\u00007\u0018ùv\u0016Ü\u0006£\u0087\b\u0091Ú\u0086P\u0083\u0010ªK\u008e7õ×\u0096\t\r{\u009aýÏ{Úz\f"
         .length();
      char var5 = 16;
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
                     g = var9;
                     h = new String[16];
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

                  var6 = "\u0005Á\u00992·ì\u00939y\rÎ\u0018IdìÚØò\u0001¸ûù\u0082ò\u0010dÏ\u0094ÈT\u0091ðn\u00ad\u001aPï«ÌW`";
                  var8 = "\u0005Á\u00992·ì\u00939y\rÎ\u0018IdìÚØò\u0001¸ûù\u0082ò\u0010dÏ\u0094ÈT\u0091ðn\u00ad\u001aPï«ÌW`".length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13347;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("WorldClient", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("WorldClient" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
