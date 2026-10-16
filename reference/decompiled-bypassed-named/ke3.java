import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ke3 {
   public boolean u0r;
   public q6h xsk = new q6h();
   public q6h yfp = new q6h();
   public ArrayList dhh = new ArrayList();
   public ArrayList lsm = new ArrayList();
   public int qb3;
   public int yuz = 600;
   public int alu = 600;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ke3(boolean var1) {
      this.u0r = var1;
   }

   @EventHandler
   public void gtp(Event var1) {
      this.dhh.clear();
      this.lsm.clear();
      this.qb3 = 0;
      this.yuz = (int)KillAura.mmr(900.0, 1400.0);
      this.alu = (int)KillAura.mmr(1000.0, 2000.0);
   }

   @EventHandler
   public void wqr(ihr param1) {
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
      // 05: invokevirtual ihr.bbi ()Lmz2;
      // 08: instanceof net/minecraft/network/play/client/C03PacketPlayer
      // 0b: iload 2
      // 0c: ifeq 2c
      // 0f: ifeq 25
      // 12: goto 19
      // 15: invokestatic ke3.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: invokevirtual ke3.nlm (Lihr;)V
      // 1e: goto 25
      // 21: invokestatic ke3.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 1
      // 26: invokevirtual ihr.bbi ()Lmz2;
      // 29: instanceof net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 2c: iload 2
      // 2d: ifeq 4d
      // 30: ifeq 46
      // 33: goto 3a
      // 36: invokestatic ke3.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: invokevirtual ke3.yym (Lihr;)V
      // 3f: goto 46
      // 42: invokestatic ke3.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 1
      // 47: invokevirtual ihr.bbi ()Lmz2;
      // 4a: instanceof net/minecraft/network/play/client/C00PacketKeepAlive
      // 4d: iload 2
      // 4e: ifeq 6d
      // 51: ifeq 73
      // 54: goto 5b
      // 57: invokestatic ke3.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield ke3.lsm Ljava/util/ArrayList;
      // 5f: aload 1
      // 60: invokevirtual ihr.bbi ()Lmz2;
      // 63: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 66: goto 6d
      // 69: invokestatic ke3.a (Loov;)Loov;
      // 6c: athrow
      // 6d: pop
      // 6e: aload 1
      // 6f: bipush 1
      // 70: invokevirtual ihr.wxi (Z)V
      // 73: return
   }

   public void nlm(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ke3.a J
      // 003: ldc2_w 103023801837514
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield ke3.dhh Ljava/util/ArrayList;
      // 011: invokevirtual java/util/ArrayList.size ()I
      // 014: iload 4
      // 016: ifne 0dc
      // 019: ifle 0d6
      // 01c: goto 023
      // 01f: invokestatic ke3.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 0
      // 024: getfield ke3.xsk Lq6h;
      // 027: aload 0
      // 028: getfield ke3.yuz I
      // 02b: i2d
      // 02c: invokevirtual q6h.hqu (D)Z
      // 02f: iload 4
      // 031: ifne 0dc
      // 034: goto 03b
      // 037: invokestatic ke3.a (Loov;)Loov;
      // 03a: athrow
      // 03b: ifeq 0d6
      // 03e: goto 045
      // 041: invokestatic ke3.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: getfield ke3.dhh Ljava/util/ArrayList;
      // 049: invokestatic java/util/Collections.reverse (Ljava/util/List;)V
      // 04c: aload 0
      // 04d: getfield ke3.dhh Ljava/util/ArrayList;
      // 050: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 053: astore 5
      // 055: aload 5
      // 057: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05c: ifeq 0a9
      // 05f: aload 5
      // 061: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 066: checkcast net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 069: astore 6
      // 06b: new java/lang/StringBuilder
      // 06e: dup
      // 06f: invokespecial java/lang/StringBuilder.<init> ()V
      // 072: sipush 24350
      // 075: ldc2_w 7435145472606905083
      // 078: lload 2
      // 079: lxor
      // 07a: invokedynamic b (IJ)Ljava/lang/String; bsm=ke3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: nop
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 083: aload 6
      // 085: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.bt2 S
      // 088: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 08b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 08e: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 091: invokestatic Minecraft.vz1 ()Lc05;
      // 094: invokevirtual Minecraft.c02 ()Lp_k;
      // 097: invokevirtual p_k._m3 ()Lhv0;
      // 09a: aload 6
      // 09c: invokevirtual hv0.r92 (Lmz2;)V
      // 09f: iload 4
      // 0a1: ifne 0d2
      // 0a4: iload 4
      // 0a6: ifeq 055
      // 0a9: aload 0
      // 0aa: getfield ke3.dhh Ljava/util/ArrayList;
      // 0ad: invokevirtual java/util/ArrayList.clear ()V
      // 0b0: sipush 19228
      // 0b3: ldc2_w 4230532996097193726
      // 0b6: lload 2
      // 0b7: lxor
      // 0b8: invokedynamic b (IJ)Ljava/lang/String; bsm=ke3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: nop
      // 0be: sipush 1152
      // 0c1: ldc2_w 3550456912350378336
      // 0c4: lload 2
      // 0c5: lxor
      // 0c6: invokedynamic b (IJ)Ljava/lang/String; bsm=ke3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: nop
      // 0cc: getstatic jgv$vro.er9 Ljgv$vro;
      // 0cf: invokestatic zet.gn0 (Ljava/lang/String;Ljava/lang/String;Ljgv$vro;)V
      // 0d2: bipush 1
      // 0d3: putstatic jr9.xev Z
      // 0d6: getstatic ModuleRegistry.obu Li4o;
      // 0d9: invokevirtual Fly.klu ()Z
      // 0dc: iload 4
      // 0de: ifne 10e
      // 0e1: ifeq 107
      // 0e4: goto 0eb
      // 0e7: invokestatic ke3.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: ldc2_w 6000.0
      // 0ef: ldc2_w 10000.0
      // 0f2: invokestatic KillAura.mmr (DD)D
      // 0f5: d2i
      // 0f6: putfield ke3.alu I
      // 0f9: aload 0
      // 0fa: getfield ke3.yfp Lq6h;
      // 0fd: invokevirtual q6h.u1k ()V
      // 100: goto 107
      // 103: invokestatic ke3.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 0
      // 108: getfield ke3.lsm Ljava/util/ArrayList;
      // 10b: invokevirtual java/util/ArrayList.size ()I
      // 10e: iload 4
      // 110: ifne 130
      // 113: ifle 23d
      // 116: goto 11d
      // 119: invokestatic ke3.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aload 0
      // 11e: getfield ke3.yfp Lq6h;
      // 121: aload 0
      // 122: getfield ke3.alu I
      // 125: i2d
      // 126: invokevirtual q6h.hqu (D)Z
      // 129: goto 130
      // 12c: invokestatic ke3.a (Loov;)Loov;
      // 12f: athrow
      // 130: iload 4
      // 132: ifne 19c
      // 135: ifeq 23d
      // 138: goto 13f
      // 13b: invokestatic ke3.a (Loov;)Loov;
      // 13e: athrow
      // 13f: new java/lang/StringBuilder
      // 142: dup
      // 143: invokespecial java/lang/StringBuilder.<init> ()V
      // 146: sipush 10730
      // 149: ldc2_w 5197562171236471817
      // 14c: lload 2
      // 14d: lxor
      // 14e: invokedynamic b (IJ)Ljava/lang/String; bsm=ke3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: nop
      // 154: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 157: aload 0
      // 158: getfield ke3.alu I
      // 15b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 15e: sipush 22096
      // 161: ldc2_w 703772033665182644
      // 164: lload 2
      // 165: lxor
      // 166: invokedynamic b (IJ)Ljava/lang/String; bsm=ke3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: nop
      // 16c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16f: aload 0
      // 170: getfield ke3.lsm Ljava/util/ArrayList;
      // 173: invokevirtual java/util/ArrayList.size ()I
      // 176: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 179: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17c: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 17f: aload 0
      // 180: ldc2_w 4000.0
      // 183: ldc2_w 6000.0
      // 186: invokestatic KillAura.mmr (DD)D
      // 189: d2i
      // 18a: putfield ke3.alu I
      // 18d: aload 0
      // 18e: getfield ke3.lsm Ljava/util/ArrayList;
      // 191: invokestatic java/util/Collections.reverse (Ljava/util/List;)V
      // 194: bipush 0
      // 195: goto 19c
      // 198: invokestatic ke3.a (Loov;)Loov;
      // 19b: athrow
      // 19c: istore 5
      // 19e: aload 0
      // 19f: getfield ke3.lsm Ljava/util/ArrayList;
      // 1a2: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 1a5: astore 6
      // 1a7: aload 6
      // 1a9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1ae: ifeq 20c
      // 1b1: aload 6
      // 1b3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1b8: checkcast mz2
      // 1bb: astore 7
      // 1bd: iload 4
      // 1bf: ifne 236
      // 1c2: iload 4
      // 1c4: ifne 1f8
      // 1c7: goto 1ce
      // 1ca: invokestatic ke3.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: dconst_0
      // 1cf: ldc2_w 100.0
      // 1d2: invokestatic KillAura.mmr (DD)D
      // 1d5: ldc2_w 80.0
      // 1d8: dcmpg
      // 1d9: ifge 1fd
      // 1dc: goto 1e3
      // 1df: invokestatic ke3.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: invokestatic Minecraft.vz1 ()Lc05;
      // 1e6: invokevirtual Minecraft.c02 ()Lp_k;
      // 1e9: invokevirtual p_k._m3 ()Lhv0;
      // 1ec: aload 7
      // 1ee: invokevirtual hv0.r92 (Lmz2;)V
      // 1f1: goto 1f8
      // 1f4: invokestatic ke3.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: iload 4
      // 1fa: ifeq 207
      // 1fd: iinc 5 1
      // 200: goto 207
      // 203: invokestatic ke3.a (Loov;)Loov;
      // 206: athrow
      // 207: iload 4
      // 209: ifeq 1a7
      // 20c: new java/lang/StringBuilder
      // 20f: dup
      // 210: invokespecial java/lang/StringBuilder.<init> ()V
      // 213: sipush 12464
      // 216: ldc2_w 1058037017240620374
      // 219: lload 2
      // 21a: lxor
      // 21b: invokedynamic b (IJ)Ljava/lang/String; bsm=ke3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: nop
      // 221: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 224: iload 5
      // 226: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 229: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22c: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 22f: aload 0
      // 230: getfield ke3.lsm Ljava/util/ArrayList;
      // 233: invokevirtual java/util/ArrayList.clear ()V
      // 236: aload 0
      // 237: getfield ke3.yfp Lq6h;
      // 23a: invokevirtual q6h.u1k ()V
      // 23d: return
   }

   public void yym(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ke3.a J
      // 003: ldc2_w 12575317457608
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokevirtual ihr.bbi ()Lmz2;
      // 011: checkcast net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 014: astore 5
      // 016: aload 5
      // 018: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.zfu I
      // 01b: iload 4
      // 01d: ifne 132
      // 020: ifne 12e
      // 023: goto 02a
      // 026: invokestatic ke3.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 5
      // 02c: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.ilh Z
      // 02f: iload 4
      // 031: ifne 132
      // 034: goto 03b
      // 037: invokestatic ke3.a (Loov;)Loov;
      // 03a: athrow
      // 03b: ifeq 12e
      // 03e: goto 045
      // 041: invokestatic ke3.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: getfield ke3.qb3 I
      // 049: iload 4
      // 04b: ifne 06e
      // 04e: goto 055
      // 051: invokestatic ke3.a (Loov;)Loov;
      // 054: athrow
      // 055: ifne 084
      // 058: goto 05f
      // 05b: invokestatic ke3.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 5
      // 061: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.bt2 S
      // 064: invokestatic java/lang/Math.abs (I)I
      // 067: goto 06e
      // 06a: invokestatic ke3.a (Loov;)Loov;
      // 06d: athrow
      // 06e: sipush 1000
      // 071: if_icmpge 084
      // 074: aload 0
      // 075: aload 5
      // 077: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.bt2 S
      // 07a: putfield ke3.qb3 I
      // 07d: goto 084
      // 080: invokestatic ke3.a (Loov;)Loov;
      // 083: athrow
      // 084: aload 1
      // 085: aload 0
      // 086: getfield ke3.qb3 I
      // 089: iload 4
      // 08b: ifne 0a4
      // 08e: ifeq 0dd
      // 091: goto 098
      // 094: invokestatic ke3.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 5
      // 09a: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.bt2 S
      // 09d: goto 0a4
      // 0a0: invokestatic ke3.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: iload 4
      // 0a6: ifne 0bf
      // 0a9: ifge 0dd
      // 0ac: goto 0b3
      // 0af: invokestatic ke3.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 5
      // 0b5: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.bt2 S
      // 0b8: goto 0bf
      // 0bb: invokestatic ke3.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: iload 4
      // 0c1: ifne 0da
      // 0c4: aload 0
      // 0c5: getfield ke3.qb3 I
      // 0c8: if_icmpne 0dd
      // 0cb: goto 0d2
      // 0ce: invokestatic ke3.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: bipush 1
      // 0d3: goto 0da
      // 0d6: invokestatic ke3.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: goto 0de
      // 0dd: bipush 0
      // 0de: dup_x1
      // 0df: putfield ihr.q2l Z
      // 0e2: iload 4
      // 0e4: ifne 113
      // 0e7: ifeq 107
      // 0ea: goto 0f1
      // 0ed: invokestatic ke3.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: dup
      // 0f3: getfield ke3.qb3 I
      // 0f6: bipush 1
      // 0f7: isub
      // 0f8: putfield ke3.qb3 I
      // 0fb: iload 4
      // 0fd: ifeq 12e
      // 100: goto 107
      // 103: invokestatic ke3.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 5
      // 109: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.bt2 S
      // 10c: goto 113
      // 10f: invokestatic ke3.a (Loov;)Loov;
      // 112: athrow
      // 113: iload 4
      // 115: ifne 132
      // 118: ifge 12e
      // 11b: goto 122
      // 11e: invokestatic ke3.a (Loov;)Loov;
      // 121: athrow
      // 122: aload 0
      // 123: bipush 0
      // 124: putfield ke3.qb3 I
      // 127: goto 12e
      // 12a: invokestatic ke3.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 1
      // 12f: getfield ihr.q2l Z
      // 132: iload 4
      // 134: ifne 1e6
      // 137: ifne 1d6
      // 13a: goto 141
      // 13d: invokestatic ke3.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 5
      // 143: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.bt2 S
      // 146: iload 4
      // 148: ifne 16c
      // 14b: goto 152
      // 14e: invokestatic ke3.a (Loov;)Loov;
      // 151: athrow
      // 152: ifge 1a4
      // 155: goto 15c
      // 158: invokestatic ke3.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 0
      // 15d: getfield ke3.dhh Ljava/util/ArrayList;
      // 160: aload 5
      // 162: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 165: goto 16c
      // 168: invokestatic ke3.a (Loov;)Loov;
      // 16b: athrow
      // 16c: pop
      // 16d: new java/lang/StringBuilder
      // 170: dup
      // 171: invokespecial java/lang/StringBuilder.<init> ()V
      // 174: sipush 14519
      // 177: ldc2_w 5060356249868441682
      // 17a: lload 2
      // 17b: lxor
      // 17c: invokedynamic b (IJ)Ljava/lang/String; bsm=ke3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: nop
      // 182: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 185: aload 5
      // 187: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.bt2 S
      // 18a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 18d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 190: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 193: aload 1
      // 194: bipush 1
      // 195: invokevirtual ihr.wxi (Z)V
      // 198: aload 0
      // 199: getfield ke3.xsk Lq6h;
      // 19c: invokevirtual q6h.u1k ()V
      // 19f: iload 4
      // 1a1: ifeq 1e7
      // 1a4: new java/lang/StringBuilder
      // 1a7: dup
      // 1a8: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ab: sipush 31910
      // 1ae: ldc2_w 6332711997742013509
      // 1b1: lload 2
      // 1b2: lxor
      // 1b3: invokedynamic b (IJ)Ljava/lang/String; bsm=ke3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: nop
      // 1b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bc: aload 5
      // 1be: getfield net/minecraft/network/play/client/C0FPacketConfirmTransaction.bt2 S
      // 1c1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1c4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c7: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 1ca: iload 4
      // 1cc: ifeq 1e7
      // 1cf: goto 1d6
      // 1d2: invokestatic ke3.a (Loov;)Loov;
      // 1d5: athrow
      // 1d6: aload 0
      // 1d7: getfield ke3.lsm Ljava/util/ArrayList;
      // 1da: aload 5
      // 1dc: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1df: goto 1e6
      // 1e2: invokestatic ke3.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: pop
      // 1e7: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3559573792681484876L, -2035116248941171953L, MethodHandles.lookup().lookupClass()).a(98971083480878L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 101051659942067L;
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
      String var6 = "æs\u0090Ôd(\t\fÐz¥¡·\u00ad`©\u0012à_ÛíÍ×ò\u0018\u0004Ð\u009dã´)\u0094)%W\u0090\u0013´o\u0093¯Â«\u0001\u0013wm_\u0010Û×½v\u0090qîÿñR?¡\u0019\u0093w\u00138¼]\t\u009a\u0087\\9KE,ëa\u0085ç=\u001bÌ\u0085/sÍA\u0002©Ù´Gx»~¦\u0087\u001a^HAh\b\u0003ÆÒ\u0096mf\u009eÔÒ\u008d{@\reëRñò\u0018-}M>\u0093ä\u0092ô\u00151\u000f'~C}|Á\u008eì»èÔ\b\u008f \tÄt¨fx<´Í\u0089 wâÞç\u008fKÍ¦3\u009dí\u009a\u0097\u0001\u0015\r\u009b\u0091unI(Å\u0003Û£SüAÄ\u0013\u0014\u008dÅnµhx¬ôH/xP$gµã\u0093¦2\u000eNÊïp#ê`££µ";
      int var8 = "æs\u0090Ôd(\t\fÐz¥¡·\u00ad`©\u0012à_ÛíÍ×ò\u0018\u0004Ð\u009dã´)\u0094)%W\u0090\u0013´o\u0093¯Â«\u0001\u0013wm_\u0010Û×½v\u0090qîÿñR?¡\u0019\u0093w\u00138¼]\t\u009a\u0087\\9KE,ëa\u0085ç=\u001bÌ\u0085/sÍA\u0002©Ù´Gx»~¦\u0087\u001a^HAh\b\u0003ÆÒ\u0096mf\u009eÔÒ\u008d{@\reëRñò\u0018-}M>\u0093ä\u0092ô\u00151\u000f'~C}|Á\u008eì»èÔ\b\u008f \tÄt¨fx<´Í\u0089 wâÞç\u008fKÍ¦3\u009dí\u009a\u0097\u0001\u0015\r\u009b\u0091unI(Å\u0003Û£SüAÄ\u0013\u0014\u008dÅnµhx¬ôH/xP$gµã\u0093¦2\u000eNÊïp#ê`££µ"
         .length();
      char var5 = '0';
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

                  var6 = "\u0091µ\u0080\u0005\u0082wÁ\u0005w>#¯\u0094eÔÐÁí\u001fÊ\u009eÀ\u001eò(\u009d\u0092±\f;ÏøvØ9\u000eô*)tØþm\u0096yfÊb\u0086»«\u0013\u0094\u0080À%KYü\u001e©êþA²";
                  var8 = "\u0091µ\u0080\u0005\u0082wÁ\u0005w>#¯\u0094eÔÐÁí\u001fÊ\u009eÀ\u001eò(\u009d\u0092±\f;ÏøvØ9\u000eô*)tØþm\u0096yfÊb\u0086»«\u0013\u0094\u0080À%KYü\u001e©êþA²"
                     .length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26409;
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
            throw new RuntimeException("ke3", var10);
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
         throw new RuntimeException("ke3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
