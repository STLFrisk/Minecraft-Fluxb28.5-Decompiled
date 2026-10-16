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

public class ewo extends SubEngine {
   private int qxq;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public ewo() {
      long var1 = a ^ 62537872485324L;
      super(a<"h">(4804, 55449019584664904L ^ var1), a<"h">(14711, 6729099553300512506L ^ var1));
   }

   @EventHandler
   public void __v(TickEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield ewo.wyl Lc05;
      // 008: getfield Minecraft.vg8 Ll86;
      // 00b: iload 2
      // 00c: ifeq 0ac
      // 00f: ifnull 09a
      // 012: goto 019
      // 015: invokestatic ewo.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: iload 2
      // 01b: ifeq 09b
      // 01e: goto 025
      // 021: invokestatic ewo.a (Loov;)Loov;
      // 024: athrow
      // 025: getfield ewo.qxq I
      // 028: bipush 1
      // 029: if_icmpne 09a
      // 02c: goto 033
      // 02f: invokestatic ewo.a (Loov;)Loov;
      // 032: athrow
      // 033: aload 0
      // 034: getfield ewo.wyl Lc05;
      // 037: getfield Minecraft.vg8 Ll86;
      // 03a: getfield EntityPlayerSP.lq7 Lp_k;
      // 03d: invokevirtual p_k._m3 ()Lhv0;
      // 040: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 043: dup
      // 044: aload 0
      // 045: getfield ewo.wyl Lc05;
      // 048: getfield Minecraft.vg8 Ll86;
      // 04b: getfield EntityPlayerSP.o2v D
      // 04e: aload 0
      // 04f: getfield ewo.wyl Lc05;
      // 052: getfield Minecraft.vg8 Ll86;
      // 055: getfield EntityPlayerSP.kfp D
      // 058: ldc2_w 2.0
      // 05b: dsub
      // 05c: aload 0
      // 05d: getfield ewo.wyl Lc05;
      // 060: getfield Minecraft.vg8 Ll86;
      // 063: getfield EntityPlayerSP.vbd D
      // 066: bipush 0
      // 067: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 06a: invokevirtual hv0.k7f (Lmz2;)V
      // 06d: aload 0
      // 06e: getfield ewo.wyl Lc05;
      // 071: getfield Minecraft.vg8 Ll86;
      // 074: getfield EntityPlayerSP.lq7 Lp_k;
      // 077: invokevirtual p_k._m3 ()Lhv0;
      // 07a: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 07d: dup
      // 07e: ldc2_w -Infinity
      // 081: ldc2_w -Infinity
      // 084: ldc2_w -Infinity
      // 087: bipush 1
      // 088: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 08b: invokevirtual hv0.k7f (Lmz2;)V
      // 08e: aload 0
      // 08f: bipush 0
      // 090: putfield ewo.qxq I
      // 093: goto 09a
      // 096: invokestatic ewo.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 0
      // 09b: iload 2
      // 09c: ifeq 0b0
      // 09f: getfield ewo.wyl Lc05;
      // 0a2: getfield Minecraft.vg8 Ll86;
      // 0a5: goto 0ac
      // 0a8: invokestatic ewo.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: ifnull 1a2
      // 0af: aload 0
      // 0b0: iload 2
      // 0b1: ifeq 0cc
      // 0b4: getfield ewo.qxq I
      // 0b7: sipush 1488
      // 0ba: if_icmpne 1a2
      // 0bd: goto 0c4
      // 0c0: invokestatic ewo.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: goto 0cc
      // 0c8: invokestatic ewo.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: getfield ewo.wyl Lc05;
      // 0cf: getfield Minecraft.vg8 Ll86;
      // 0d2: getfield EntityPlayerSP.x5k F
      // 0d5: f2d
      // 0d6: invokestatic java/lang/Math.toRadians (D)D
      // 0d9: invokestatic java/lang/Math.sin (D)D
      // 0dc: dneg
      // 0dd: dstore 3
      // 0de: aload 0
      // 0df: getfield ewo.wyl Lc05;
      // 0e2: getfield Minecraft.vg8 Ll86;
      // 0e5: getfield EntityPlayerSP.x5k F
      // 0e8: f2d
      // 0e9: invokestatic java/lang/Math.toRadians (D)D
      // 0ec: invokestatic java/lang/Math.cos (D)D
      // 0ef: dstore 5
      // 0f1: aload 0
      // 0f2: getfield ewo.wyl Lc05;
      // 0f5: getfield Minecraft.vg8 Ll86;
      // 0f8: getfield EntityPlayerSP.g9g Lboa;
      // 0fb: getfield boa._mw F
      // 0fe: f2d
      // 0ff: dload 3
      // 100: dmul
      // 101: aload 0
      // 102: getfield ewo.wyl Lc05;
      // 105: getfield Minecraft.vg8 Ll86;
      // 108: getfield EntityPlayerSP.g9g Lboa;
      // 10b: getfield boa.lrp F
      // 10e: f2d
      // 10f: dload 5
      // 111: dmul
      // 112: dadd
      // 113: dstore 7
      // 115: aload 0
      // 116: getfield ewo.wyl Lc05;
      // 119: getfield Minecraft.vg8 Ll86;
      // 11c: getfield EntityPlayerSP.g9g Lboa;
      // 11f: getfield boa._mw F
      // 122: f2d
      // 123: dload 5
      // 125: dmul
      // 126: aload 0
      // 127: getfield ewo.wyl Lc05;
      // 12a: getfield Minecraft.vg8 Ll86;
      // 12d: getfield EntityPlayerSP.g9g Lboa;
      // 130: getfield boa.lrp F
      // 133: f2d
      // 134: dload 3
      // 135: dmul
      // 136: dsub
      // 137: dstore 9
      // 139: aload 0
      // 13a: getfield ewo.wyl Lc05;
      // 13d: getfield Minecraft.vg8 Ll86;
      // 140: getfield EntityPlayerSP.lq7 Lp_k;
      // 143: invokevirtual p_k._m3 ()Lhv0;
      // 146: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 149: dup
      // 14a: aload 0
      // 14b: getfield ewo.wyl Lc05;
      // 14e: getfield Minecraft.vg8 Ll86;
      // 151: getfield EntityPlayerSP.o2v D
      // 154: dload 7
      // 156: dadd
      // 157: aload 0
      // 158: getfield ewo.wyl Lc05;
      // 15b: getfield Minecraft.vg8 Ll86;
      // 15e: getfield EntityPlayerSP.kfp D
      // 161: aload 0
      // 162: getfield ewo.wyl Lc05;
      // 165: getfield Minecraft.vg8 Ll86;
      // 168: getfield EntityPlayerSP.vbd D
      // 16b: dload 9
      // 16d: dadd
      // 16e: bipush 0
      // 16f: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 172: invokevirtual hv0.k7f (Lmz2;)V
      // 175: aload 0
      // 176: getfield ewo.wyl Lc05;
      // 179: getfield Minecraft.vg8 Ll86;
      // 17c: getfield EntityPlayerSP.lq7 Lp_k;
      // 17f: invokevirtual p_k._m3 ()Lhv0;
      // 182: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 185: dup
      // 186: ldc2_w -Infinity
      // 189: aload 0
      // 18a: getfield ewo.wyl Lc05;
      // 18d: getfield Minecraft.vg8 Ll86;
      // 190: getfield EntityPlayerSP.kfp D
      // 193: ldc2_w -Infinity
      // 196: bipush 1
      // 197: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 19a: invokevirtual hv0.k7f (Lmz2;)V
      // 19d: aload 0
      // 19e: bipush 0
      // 19f: putfield ewo.qxq I
      // 1a2: return
   }

   public static boolean ibt() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic q0r.hhm Lc05;
      // 003: getfield Minecraft.vg8 Ll86;
      // 006: astore 1
      // 007: getstatic q0r.hhm Lc05;
      // 00a: getfield Minecraft.tij Lkh3;
      // 00d: astore 2
      // 00e: invokestatic OpaquePredicate.c ()I
      // 011: aload 1
      // 012: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 015: astore 3
      // 016: istore 0
      // 017: aload 3
      // 018: getfield nh4.rlc D
      // 01b: invokestatic fe6.jqf (D)I
      // 01e: istore 4
      // 020: iload 4
      // 022: aload 3
      // 023: getfield nh4.t_2 D
      // 026: invokestatic fe6.jqf (D)I
      // 029: bipush 1
      // 02a: iadd
      // 02b: if_icmpge 122
      // 02e: aload 3
      // 02f: getfield nh4.bx_ D
      // 032: invokestatic fe6.jqf (D)I
      // 035: iload 0
      // 036: ifne 123
      // 039: istore 5
      // 03b: iload 5
      // 03d: aload 3
      // 03e: getfield nh4.i2c D
      // 041: invokestatic fe6.jqf (D)I
      // 044: bipush 1
      // 045: iadd
      // 046: if_icmpge 11b
      // 049: aload 3
      // 04a: getfield nh4.t8n D
      // 04d: invokestatic fe6.jqf (D)I
      // 050: iload 0
      // 051: ifne 022
      // 054: istore 6
      // 056: iload 6
      // 058: aload 3
      // 059: getfield nh4.oqj D
      // 05c: invokestatic fe6.jqf (D)I
      // 05f: bipush 1
      // 060: iadd
      // 061: if_icmpge 114
      // 064: aload 2
      // 065: new mew
      // 068: dup
      // 069: iload 4
      // 06b: iload 5
      // 06d: iload 6
      // 06f: invokespecial mew.<init> (III)V
      // 072: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 075: invokeinterface zfz.r_y ()Le0x; 1
      // 07a: astore 7
      // 07c: iload 0
      // 07d: ifne 117
      // 080: iload 0
      // 081: ifne 110
      // 084: goto 08b
      // 087: invokestatic ewo.a (Loov;)Loov;
      // 08a: athrow
      // 08b: aload 7
      // 08d: ifnull 10d
      // 090: goto 097
      // 093: invokestatic ewo.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 7
      // 099: iload 0
      // 09a: ifne 0ba
      // 09d: goto 0a4
      // 0a0: invokestatic ewo.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: instanceof n47
      // 0a7: ifne 10d
      // 0aa: goto 0b1
      // 0ad: invokestatic ewo.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 7
      // 0b3: goto 0ba
      // 0b6: invokestatic ewo.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 2
      // 0bb: new mew
      // 0be: dup
      // 0bf: iload 4
      // 0c1: iload 5
      // 0c3: iload 6
      // 0c5: invokespecial mew.<init> (III)V
      // 0c8: aload 2
      // 0c9: new mew
      // 0cc: dup
      // 0cd: iload 4
      // 0cf: iload 5
      // 0d1: iload 6
      // 0d3: invokespecial mew.<init> (III)V
      // 0d6: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 0d9: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 0dc: dup
      // 0dd: astore 8
      // 0df: iload 0
      // 0e0: ifne 0f8
      // 0e3: ifnull 10d
      // 0e6: goto 0ed
      // 0e9: invokestatic ewo.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 1
      // 0ee: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 0f1: goto 0f8
      // 0f4: invokestatic ewo.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: aload 8
      // 0fa: invokevirtual nh4.epq (Lnh4;)Z
      // 0fd: iload 0
      // 0fe: ifne 10c
      // 101: ifeq 10d
      // 104: goto 10b
      // 107: invokestatic ewo.a (Loov;)Loov;
      // 10a: athrow
      // 10b: bipush 1
      // 10c: ireturn
      // 10d: iinc 6 1
      // 110: iload 0
      // 111: ifeq 056
      // 114: iinc 5 1
      // 117: iload 0
      // 118: ifeq 03b
      // 11b: iinc 4 1
      // 11e: iload 0
      // 11f: ifeq 020
      // 122: bipush 0
      // 123: ireturn
   }

   @EventHandler
   public void z8o(w1x var1) {
      try {
         if (ibt()) {
            var1.wfu(null);
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   public void s42(c7q var1) {
      var1.wxi(true);
   }

   @EventHandler
   public void odj(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 0.3
      // 003: dstore 3
      // 004: aload 0
      // 005: getfield ewo.wyl Lc05;
      // 008: getfield Minecraft.vg8 Ll86;
      // 00b: getfield EntityPlayerSP.x5k F
      // 00e: f2d
      // 00f: invokestatic java/lang/Math.toRadians (D)D
      // 012: invokestatic java/lang/Math.sin (D)D
      // 015: dneg
      // 016: dstore 5
      // 018: invokestatic OpaquePredicate.b ()I
      // 01b: aload 0
      // 01c: getfield ewo.wyl Lc05;
      // 01f: getfield Minecraft.vg8 Ll86;
      // 022: getfield EntityPlayerSP.x5k F
      // 025: f2d
      // 026: invokestatic java/lang/Math.toRadians (D)D
      // 029: invokestatic java/lang/Math.cos (D)D
      // 02c: dstore 7
      // 02e: istore 2
      // 02f: aload 0
      // 030: getfield ewo.wyl Lc05;
      // 033: getfield Minecraft.vg8 Ll86;
      // 036: getfield EntityPlayerSP.g9g Lboa;
      // 039: getfield boa._mw F
      // 03c: f2d
      // 03d: ldc2_w 0.3
      // 040: dmul
      // 041: dload 5
      // 043: dmul
      // 044: aload 0
      // 045: getfield ewo.wyl Lc05;
      // 048: getfield Minecraft.vg8 Ll86;
      // 04b: getfield EntityPlayerSP.g9g Lboa;
      // 04e: getfield boa.lrp F
      // 051: f2d
      // 052: ldc2_w 0.3
      // 055: dmul
      // 056: dload 7
      // 058: dmul
      // 059: dadd
      // 05a: dstore 9
      // 05c: aload 0
      // 05d: getfield ewo.wyl Lc05;
      // 060: getfield Minecraft.vg8 Ll86;
      // 063: getfield EntityPlayerSP.g9g Lboa;
      // 066: getfield boa._mw F
      // 069: f2d
      // 06a: ldc2_w 0.3
      // 06d: dmul
      // 06e: dload 7
      // 070: dmul
      // 071: aload 0
      // 072: getfield ewo.wyl Lc05;
      // 075: getfield Minecraft.vg8 Ll86;
      // 078: getfield EntityPlayerSP.g9g Lboa;
      // 07b: getfield boa.lrp F
      // 07e: f2d
      // 07f: ldc2_w 0.3
      // 082: dmul
      // 083: dload 5
      // 085: dmul
      // 086: dsub
      // 087: dstore 11
      // 089: aload 0
      // 08a: getfield ewo.wyl Lc05;
      // 08d: getfield Minecraft.vg8 Ll86;
      // 090: getfield EntityPlayerSP.cbi Z
      // 093: iload 2
      // 094: ifeq 0b2
      // 097: ifeq 185
      // 09a: goto 0a1
      // 09d: invokestatic ewo.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield ewo.wyl Lc05;
      // 0a5: getfield Minecraft.vg8 Ll86;
      // 0a8: invokevirtual EntityPlayerSP.z2m ()Z
      // 0ab: goto 0b2
      // 0ae: invokestatic ewo.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: iload 2
      // 0b3: ifeq 105
      // 0b6: ifne 185
      // 0b9: goto 0c0
      // 0bc: invokestatic ewo.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield ewo.wyl Lc05;
      // 0c4: invokevirtual Minecraft.c02 ()Lp_k;
      // 0c7: invokevirtual p_k._m3 ()Lhv0;
      // 0ca: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 0cd: dup
      // 0ce: aload 0
      // 0cf: getfield ewo.wyl Lc05;
      // 0d2: getfield Minecraft.vg8 Ll86;
      // 0d5: getfield EntityPlayerSP.o2v D
      // 0d8: dload 9
      // 0da: dadd
      // 0db: aload 0
      // 0dc: getfield ewo.wyl Lc05;
      // 0df: getfield Minecraft.vg8 Ll86;
      // 0e2: getfield EntityPlayerSP.kfp D
      // 0e5: ldc2_w 0.001
      // 0e8: dadd
      // 0e9: aload 0
      // 0ea: getfield ewo.wyl Lc05;
      // 0ed: getfield Minecraft.vg8 Ll86;
      // 0f0: getfield EntityPlayerSP.vbd D
      // 0f3: dload 11
      // 0f5: dadd
      // 0f6: bipush 0
      // 0f7: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 0fa: invokevirtual hv0.r92 (Lmz2;)V
      // 0fd: bipush 1
      // 0fe: goto 105
      // 101: invokestatic ewo.a (Loov;)Loov;
      // 104: athrow
      // 105: istore 13
      // 107: iload 13
      // 109: bipush 10
      // 10b: if_icmpge 157
      // 10e: aload 0
      // 10f: getfield ewo.wyl Lc05;
      // 112: invokevirtual Minecraft.c02 ()Lp_k;
      // 115: invokevirtual p_k._m3 ()Lhv0;
      // 118: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 11b: dup
      // 11c: aload 0
      // 11d: getfield ewo.wyl Lc05;
      // 120: getfield Minecraft.vg8 Ll86;
      // 123: getfield EntityPlayerSP.o2v D
      // 126: aload 0
      // 127: getfield ewo.wyl Lc05;
      // 12a: getfield Minecraft.vg8 Ll86;
      // 12d: getfield EntityPlayerSP.kfp D
      // 130: ldc2_w 0.22
      // 133: dsub
      // 134: aload 0
      // 135: getfield ewo.wyl Lc05;
      // 138: getfield Minecraft.vg8 Ll86;
      // 13b: getfield EntityPlayerSP.vbd D
      // 13e: bipush 0
      // 13f: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 142: invokevirtual hv0.r92 (Lmz2;)V
      // 145: iinc 13 1
      // 148: iload 2
      // 149: ifeq 185
      // 14c: iload 2
      // 14d: ifne 107
      // 150: goto 157
      // 153: invokestatic ewo.a (Loov;)Loov;
      // 156: athrow
      // 157: aload 0
      // 158: getfield ewo.wyl Lc05;
      // 15b: getfield Minecraft.vg8 Ll86;
      // 15e: aload 0
      // 15f: getfield ewo.wyl Lc05;
      // 162: getfield Minecraft.vg8 Ll86;
      // 165: getfield EntityPlayerSP.o2v D
      // 168: dload 9
      // 16a: dadd
      // 16b: aload 0
      // 16c: getfield ewo.wyl Lc05;
      // 16f: getfield Minecraft.vg8 Ll86;
      // 172: getfield EntityPlayerSP.kfp D
      // 175: aload 0
      // 176: getfield ewo.wyl Lc05;
      // 179: getfield Minecraft.vg8 Ll86;
      // 17c: getfield EntityPlayerSP.vbd D
      // 17f: dload 11
      // 181: dadd
      // 182: invokevirtual EntityPlayerSP.m6_ (DDD)V
      // 185: return
   }

   @EventHandler
   public void c33(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ewo.a J
      // 03: ldc2_w 44116036704418
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual wbh.nlg ()Lmz2;
      // 11: iload 4
      // 13: ifne 2e
      // 16: instanceof net/minecraft/network/play/server/S02PacketChat
      // 19: ifeq 5d
      // 1c: goto 23
      // 1f: invokestatic ewo.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: invokevirtual wbh.nlg ()Lmz2;
      // 27: goto 2e
      // 2a: invokestatic ewo.a (Loov;)Loov;
      // 2d: athrow
      // 2e: checkcast net/minecraft/network/play/server/S02PacketChat
      // 31: astore 5
      // 33: aload 5
      // 35: invokevirtual net/minecraft/network/play/server/S02PacketChat.m4c ()Lekw;
      // 38: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 3d: sipush 25393
      // 40: ldc2_w 1707011847292147664
      // 43: lload 2
      // 44: lxor
      // 45: invokedynamic h (IJ)Ljava/lang/String; bsm=ewo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: nop
      // 4b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 4e: ifeq 5d
      // 51: aload 1
      // 52: bipush 1
      // 53: invokevirtual wbh.wxi (Z)V
      // 56: goto 5d
      // 59: invokestatic ewo.a (Loov;)Loov;
      // 5c: athrow
      // 5d: return
   }

   @EventHandler
   public void qjz(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: invokestatic ewo.ibt ()Z
      // 07: iload 2
      // 08: ifeq 29
      // 0b: ifeq f5
      // 0e: goto 15
      // 11: invokestatic ewo.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: getfield ewo.wyl Lc05;
      // 19: getfield Minecraft.oxn Lmoh;
      // 1c: getfield moh.nfb Lm7l;
      // 1f: invokevirtual m7l.t9w ()Z
      // 22: goto 29
      // 25: invokestatic ewo.a (Loov;)Loov;
      // 28: athrow
      // 29: iload 2
      // 2a: ifeq 78
      // 2d: ifeq 59
      // 30: goto 37
      // 33: invokestatic ewo.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield ewo.wyl Lc05;
      // 3b: getfield Minecraft.vg8 Ll86;
      // 3e: astore 3
      // 3f: aload 3
      // 40: getfield EntityPlayerSP.mop D
      // 43: ldc2_w 0.09000000357627869
      // 46: dadd
      // 47: dstore 4
      // 49: aload 3
      // 4a: dload 4
      // 4c: putfield EntityPlayerSP.mop D
      // 4f: aload 1
      // 50: dload 4
      // 52: putfield _qa.wam D
      // 55: iload 2
      // 56: ifne b7
      // 59: aload 0
      // 5a: getfield ewo.wyl Lc05;
      // 5d: iload 2
      // 5e: ifeq a6
      // 61: goto 68
      // 64: invokestatic ewo.a (Loov;)Loov;
      // 67: athrow
      // 68: getfield Minecraft.oxn Lmoh;
      // 6b: getfield moh.e5o Lm7l;
      // 6e: invokevirtual m7l.t9w ()Z
      // 71: goto 78
      // 74: invokestatic ewo.a (Loov;)Loov;
      // 77: athrow
      // 78: ifeq 9b
      // 7b: aload 0
      // 7c: getfield ewo.wyl Lc05;
      // 7f: getfield Minecraft.vg8 Ll86;
      // 82: astore 3
      // 83: aload 3
      // 84: getfield EntityPlayerSP.mop D
      // 87: dconst_0
      // 88: dsub
      // 89: dstore 4
      // 8b: aload 3
      // 8c: dload 4
      // 8e: putfield EntityPlayerSP.mop D
      // 91: aload 1
      // 92: dload 4
      // 94: putfield _qa.wam D
      // 97: iload 2
      // 98: ifne b7
      // 9b: aload 0
      // 9c: getfield ewo.wyl Lc05;
      // 9f: goto a6
      // a2: invokestatic ewo.a (Loov;)Loov;
      // a5: athrow
      // a6: getfield Minecraft.vg8 Ll86;
      // a9: astore 3
      // aa: dconst_0
      // ab: dstore 4
      // ad: aload 3
      // ae: dconst_0
      // af: putfield EntityPlayerSP.mop D
      // b2: aload 1
      // b3: dconst_0
      // b4: putfield _qa.wam D
      // b7: ldc2_w 0.3
      // ba: invokestatic q0r.setOwner (D)V
      // bd: aload 0
      // be: getfield ewo.wyl Lc05;
      // c1: getfield Minecraft.vg8 Ll86;
      // c4: iload 2
      // c5: ifeq ea
      // c8: getfield EntityPlayerSP.g25 I
      // cb: bipush 2
      // cc: irem
      // cd: ifne f5
      // d0: goto d7
      // d3: invokestatic ewo.a (Loov;)Loov;
      // d6: athrow
      // d7: aload 0
      // d8: getfield ewo.wyl Lc05;
      // db: getfield Minecraft.vg8 Ll86;
      // de: astore 3
      // df: aload 3
      // e0: getfield EntityPlayerSP.mop D
      // e3: ldc2_w 0.09000000357627869
      // e6: dadd
      // e7: dstore 4
      // e9: aload 3
      // ea: dload 4
      // ec: putfield EntityPlayerSP.mop D
      // ef: aload 1
      // f0: dload 4
      // f2: putfield _qa.wam D
      // f5: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7564401688318625076L, 4764161629604835484L, MethodHandles.lookup().lookupClass()).a(81963348875418L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 46409884270891L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "ÛÄ4\u0013ÍU\u0088sç}VÓ\u0098\u0001(0\u0010\rb\u000fÅm±\rv\u008c\u0081\u0002¼õ-Û-0;ð-/3¡ÿÎR;Dº¿WyaW\t½ÍsæÕä\u0003¦Ò\u000f6wû6ó\\\u0011~×\\\u008f\u009d=·\u0012u\u001b³\u000f6";
      int var8 = "ÛÄ4\u0013ÍU\u0088sç}VÓ\u0098\u0001(0\u0010\rb\u000fÅm±\rv\u008c\u0081\u0002¼õ-Û-0;ð-/3¡ÿÎR;Dº¿WyaW\t½ÍsæÕä\u0003¦Ò\u000f6wû6ó\\\u0011~×\\\u008f\u009d=·\u0012u\u001b³\u000f6"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13873;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ewo", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("ewo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
