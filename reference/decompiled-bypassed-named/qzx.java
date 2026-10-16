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

public class qzx extends Module {
   public static NumberSetting n4b;
   public static NumberSetting t2i;
   public static BooleanSetting sel;
   public static BooleanSetting kp5;
   public static BooleanSetting p__;
   public static BooleanSetting ui3;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public qzx() {
      long var1 = a ^ 31499631863982L;
      super(b<"s">(6449, 2619746946802775136L ^ var1), _aj.p3z, false, new SubEngine[0]);
      this.ugr = new Timer();
      this.kh1 = new Timer();
   }

   @EventHandler
   private void lcd(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield qzx.lva Z
      // 08: iload 2
      // 09: ifeq 49
      // 0c: ifeq 7c
      // 0f: goto 16
      // 12: invokestatic qzx.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: pop
      // 18: getstatic qzx.ek1 Lc05;
      // 1b: getfield Minecraft.vg8 Ll86;
      // 1e: dconst_0
      // 1f: putfield EntityPlayerSP.icv D
      // 22: aload 0
      // 23: pop
      // 24: getstatic qzx.ek1 Lc05;
      // 27: getfield Minecraft.vg8 Ll86;
      // 2a: dconst_0
      // 2b: putfield EntityPlayerSP.bw4 D
      // 2e: aload 1
      // 2f: dconst_0
      // 30: putfield _qa.c6l D
      // 33: aload 1
      // 34: dconst_0
      // 35: putfield _qa.faq D
      // 38: aload 0
      // 39: getfield qzx.kh1 Lnhs;
      // 3c: ldc2_w 100.0
      // 3f: invokevirtual Timer.yrv (D)Z
      // 42: goto 49
      // 45: invokestatic qzx.a (Loov;)Loov;
      // 48: athrow
      // 49: iload 2
      // 4a: ifeq 74
      // 4d: ifeq 7c
      // 50: goto 57
      // 53: invokestatic qzx.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: iload 2
      // 59: ifeq 78
      // 5c: goto 63
      // 5f: invokestatic qzx.a (Loov;)Loov;
      // 62: athrow
      // 63: pop
      // 64: getstatic qzx.ek1 Lc05;
      // 67: getfield Minecraft.vg8 Ll86;
      // 6a: getfield EntityPlayerSP.lfk Z
      // 6d: goto 74
      // 70: invokestatic qzx.a (Loov;)Loov;
      // 73: athrow
      // 74: ifeq 7c
      // 77: aload 0
      // 78: bipush 0
      // 79: putfield qzx.lva Z
      // 7c: return
   }

   @EventHandler(
      jn1 = 1
   )
   private void wsq(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: getstatic qzx.ek1 Lc05;
      // 007: getfield Minecraft.vg8 Ll86;
      // 00a: ldc2_w 0.01
      // 00d: invokestatic p_c.dn6 (Lha9;D)Le0x;
      // 010: instanceof itn
      // 013: iload 2
      // 014: ifne 033
      // 017: ifeq 02f
      // 01a: goto 021
      // 01d: invokestatic qzx.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: getfield qzx.ugr Lnhs;
      // 025: invokevirtual Timer.zay ()V
      // 028: goto 02f
      // 02b: invokestatic qzx.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 1
      // 030: invokevirtual PlayerUpdateEvent.lhw ()Z
      // 033: ifne 043
      // 036: getstatic KillAura.kfa Lg_3;
      // 039: ifnull 04d
      // 03c: goto 043
      // 03f: invokestatic qzx.a (Loov;)Loov;
      // 042: athrow
      // 043: aload 0
      // 044: bipush 0
      // 045: putfield qzx.pht Z
      // 048: return
      // 049: invokestatic qzx.a (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 0
      // 04e: invokespecial qzx.la8 ()I
      // 051: istore 3
      // 052: iload 3
      // 053: iload 2
      // 054: ifne 07a
      // 057: bipush -1
      // 058: if_icmpeq 113
      // 05b: goto 062
      // 05e: invokestatic qzx.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 0
      // 063: getfield qzx.ugr Lnhs;
      // 066: getstatic qzx.t2i Lcrk;
      // 069: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 06c: invokevirtual java/lang/Float.floatValue ()F
      // 06f: f2d
      // 070: invokevirtual Timer.yrv (D)Z
      // 073: goto 07a
      // 076: invokestatic qzx.a (Loov;)Loov;
      // 079: athrow
      // 07a: iload 2
      // 07b: ifne 098
      // 07e: ifeq 113
      // 081: goto 088
      // 084: invokestatic qzx.a (Loov;)Loov;
      // 087: athrow
      // 088: getstatic qzx.sel Lcn7;
      // 08b: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 08e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 091: goto 098
      // 094: invokestatic qzx.a (Loov;)Loov;
      // 097: athrow
      // 098: iload 2
      // 099: ifne 0a9
      // 09c: ifeq 100
      // 09f: goto 0a6
      // 0a2: invokestatic qzx.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: invokestatic bk4.icg ()Z
      // 0a9: iload 2
      // 0aa: ifne 0e0
      // 0ad: ifne 100
      // 0b0: goto 0b7
      // 0b3: invokestatic qzx.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 1
      // 0b8: ldc -89.5
      // 0ba: nop
      // 0bb: invokevirtual PlayerUpdateEvent.ni7 (F)V
      // 0be: aload 0
      // 0bf: bipush 1
      // 0c0: putfield qzx.lva Z
      // 0c3: aload 0
      // 0c4: iload 2
      // 0c5: ifne 10f
      // 0c8: goto 0cf
      // 0cb: invokestatic qzx.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: pop
      // 0d0: getstatic qzx.ek1 Lc05;
      // 0d3: getfield Minecraft.vg8 Ll86;
      // 0d6: getfield EntityPlayerSP.lfk Z
      // 0d9: goto 0e0
      // 0dc: invokestatic qzx.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: ifeq 10e
      // 0e3: aload 0
      // 0e4: pop
      // 0e5: getstatic qzx.ek1 Lc05;
      // 0e8: getfield Minecraft.vg8 Ll86;
      // 0eb: invokevirtual EntityPlayerSP.xv1 ()V
      // 0ee: aload 0
      // 0ef: getfield qzx.kh1 Lnhs;
      // 0f2: invokevirtual Timer.zay ()V
      // 0f5: iload 2
      // 0f6: ifeq 10e
      // 0f9: goto 100
      // 0fc: invokestatic qzx.a (Loov;)Loov;
      // 0ff: athrow
      // 100: aload 1
      // 101: ldc 89.5
      // 103: nop
      // 104: invokevirtual PlayerUpdateEvent.ni7 (F)V
      // 107: goto 10e
      // 10a: invokestatic qzx.a (Loov;)Loov;
      // 10d: athrow
      // 10e: aload 0
      // 10f: bipush 1
      // 110: putfield qzx.pht Z
      // 113: return
   }

   @EventHandler
   private void yz9(Event param1) {
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
      // 005: getfield qzx.pht Z
      // 008: iload 2
      // 009: ifeq 020
      // 00c: ifne 017
      // 00f: goto 016
      // 012: invokestatic qzx.a (Loov;)Loov;
      // 015: athrow
      // 016: return
      // 017: aload 0
      // 018: bipush 0
      // 019: putfield qzx.pht Z
      // 01c: aload 0
      // 01d: invokespecial qzx.la8 ()I
      // 020: istore 3
      // 021: iload 3
      // 022: iload 2
      // 023: ifeq 049
      // 026: bipush -1
      // 027: if_icmpeq 112
      // 02a: goto 031
      // 02d: invokestatic qzx.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 0
      // 032: getfield qzx.ugr Lnhs;
      // 035: getstatic qzx.t2i Lcrk;
      // 038: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 03b: invokevirtual java/lang/Float.floatValue ()F
      // 03e: f2d
      // 03f: invokevirtual Timer.yrv (D)Z
      // 042: goto 049
      // 045: invokestatic qzx.a (Loov;)Loov;
      // 048: athrow
      // 049: iload 2
      // 04a: ifeq 069
      // 04d: ifeq 112
      // 050: goto 057
      // 053: invokestatic qzx.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: pop
      // 059: getstatic qzx.ek1 Lc05;
      // 05c: getfield Minecraft.vg8 Ll86;
      // 05f: getfield EntityPlayerSP.fcv Z
      // 062: goto 069
      // 065: invokestatic qzx.a (Loov;)Loov;
      // 068: athrow
      // 069: iload 2
      // 06a: ifeq 08c
      // 06d: ifeq 112
      // 070: goto 077
      // 073: invokestatic qzx.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 0
      // 078: pop
      // 079: getstatic qzx.ek1 Lc05;
      // 07c: getfield Minecraft.vg8 Ll86;
      // 07f: getfield EntityPlayerSP.up_ Ljnq;
      // 082: getfield jnq.nb5 I
      // 085: goto 08c
      // 088: invokestatic qzx.a (Loov;)Loov;
      // 08b: athrow
      // 08c: istore 4
      // 08e: iload 2
      // 08f: ifeq 10d
      // 092: iload 3
      // 093: bipush 9
      // 095: if_icmpge 112
      // 098: goto 09f
      // 09b: invokestatic qzx.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: pop
      // 0a1: getstatic qzx.ek1 Lc05;
      // 0a4: getfield Minecraft.vg8 Ll86;
      // 0a7: getfield EntityPlayerSP.lq7 Lp_k;
      // 0aa: new net/minecraft/network/play/client/C09PacketHeldItemChange
      // 0ad: dup
      // 0ae: iload 3
      // 0af: invokespecial net/minecraft/network/play/client/C09PacketHeldItemChange.<init> (I)V
      // 0b2: invokevirtual p_k.sxi (Lmz2;)V
      // 0b5: aload 0
      // 0b6: pop
      // 0b7: getstatic qzx.ek1 Lc05;
      // 0ba: getfield Minecraft.vg8 Ll86;
      // 0bd: getfield EntityPlayerSP.lq7 Lp_k;
      // 0c0: new net/minecraft/network/play/client/C08PacketPlayerBlockPlacement
      // 0c3: dup
      // 0c4: aload 0
      // 0c5: pop
      // 0c6: getstatic qzx.ek1 Lc05;
      // 0c9: getfield Minecraft.vg8 Ll86;
      // 0cc: getfield EntityPlayerSP.up_ Ljnq;
      // 0cf: invokevirtual jnq.dxs ()Lerg;
      // 0d2: invokespecial net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.<init> (Lerg;)V
      // 0d5: invokevirtual p_k.sxi (Lmz2;)V
      // 0d8: aload 0
      // 0d9: pop
      // 0da: getstatic qzx.ek1 Lc05;
      // 0dd: getfield Minecraft.vg8 Ll86;
      // 0e0: getfield EntityPlayerSP.lq7 Lp_k;
      // 0e3: new net/minecraft/network/play/client/C09PacketHeldItemChange
      // 0e6: dup
      // 0e7: iload 4
      // 0e9: invokespecial net/minecraft/network/play/client/C09PacketHeldItemChange.<init> (I)V
      // 0ec: invokevirtual p_k.sxi (Lmz2;)V
      // 0ef: aload 0
      // 0f0: pop
      // 0f1: getstatic qzx.ek1 Lc05;
      // 0f4: getfield Minecraft.vg8 Ll86;
      // 0f7: getfield EntityPlayerSP.up_ Ljnq;
      // 0fa: iload 4
      // 0fc: putfield jnq.nb5 I
      // 0ff: aload 0
      // 100: getfield qzx.ugr Lnhs;
      // 103: invokevirtual Timer.zay ()V
      // 106: goto 10d
      // 109: invokestatic qzx.a (Loov;)Loov;
      // 10c: athrow
      // 10d: aload 0
      // 10e: iload 3
      // 10f: putfield qzx.qt9 I
      // 112: return
   }

   @EventHandler
   public void cz5(TickEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 20
      // 09: pop
      // 0a: getstatic qzx.ek1 Lc05;
      // 0d: getfield Minecraft.u0y Lgbe;
      // 10: ifnull 1f
      // 13: goto 1a
      // 16: invokestatic qzx.a (Loov;)Loov;
      // 19: athrow
      // 1a: return
      // 1b: invokestatic qzx.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokespecial qzx.la8 ()I
      // 23: istore 3
      // 24: iload 3
      // 25: bipush -1
      // 26: iload 2
      // 27: ifeq 3e
      // 2a: if_icmpeq 81
      // 2d: goto 34
      // 30: invokestatic qzx.a (Loov;)Loov;
      // 33: athrow
      // 34: iload 3
      // 35: bipush 8
      // 37: goto 3e
      // 3a: invokestatic qzx.a (Loov;)Loov;
      // 3d: athrow
      // 3e: iload 2
      // 3f: ifeq 6a
      // 42: if_icmple 81
      // 45: goto 4c
      // 48: invokestatic qzx.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: iload 2
      // 4e: ifeq 76
      // 51: goto 58
      // 54: invokestatic qzx.a (Loov;)Loov;
      // 57: athrow
      // 58: pop
      // 59: getstatic qzx.ek1 Lc05;
      // 5c: getfield Minecraft.vg8 Ll86;
      // 5f: getfield EntityPlayerSP.g25 I
      // 62: bipush 4
      // 63: goto 6a
      // 66: invokestatic qzx.a (Loov;)Loov;
      // 69: athrow
      // 6a: irem
      // 6b: ifne 81
      // 6e: aload 0
      // 6f: goto 76
      // 72: invokestatic qzx.a (Loov;)Loov;
      // 75: athrow
      // 76: iload 3
      // 77: aload 0
      // 78: getfield qzx.qt9 I
      // 7b: invokestatic amb.rk5 (I)I
      // 7e: invokespecial qzx.k23 (II)V
      // 81: return
   }

   private void k23(int var1, int var2) {
      ek1.l7q.efg(ek1.vg8.fv9.h7l, var1, var2, 2, ek1.vg8);
   }

   private int la8() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qzx.a J
      // 003: ldc2_w 31109935789192
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: bipush 0
      // 00d: istore 4
      // 00f: iload 4
      // 011: bipush 36
      // 013: if_icmpge 151
      // 016: aload 0
      // 017: pop
      // 018: iload 3
      // 019: ifne 14d
      // 01c: getstatic qzx.ek1 Lc05;
      // 01f: getfield Minecraft.vg8 Ll86;
      // 022: getfield EntityPlayerSP.up_ Ljnq;
      // 025: getfield jnq.c41 [Lerg;
      // 028: iload 4
      // 02a: aaload
      // 02b: iload 3
      // 02c: ifne 177
      // 02f: goto 036
      // 032: invokestatic qzx.a (Loov;)Loov;
      // 035: athrow
      // 036: ifnull 14a
      // 039: goto 040
      // 03c: invokestatic qzx.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 0
      // 041: pop
      // 042: getstatic qzx.ek1 Lc05;
      // 045: getfield Minecraft.vg8 Ll86;
      // 048: getfield EntityPlayerSP.up_ Ljnq;
      // 04b: getfield jnq.c41 [Lerg;
      // 04e: iload 4
      // 050: aaload
      // 051: astore 5
      // 053: aload 5
      // 055: invokevirtual erg.gn1 ()Lu7m;
      // 058: astore 6
      // 05a: aload 6
      // 05c: iload 3
      // 05d: ifne 076
      // 060: instanceof dgn
      // 063: ifne 074
      // 066: goto 06d
      // 069: invokestatic qzx.a (Loov;)Loov;
      // 06c: athrow
      // 06d: goto 14a
      // 070: invokestatic qzx.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 6
      // 076: checkcast dgn
      // 079: aload 5
      // 07b: invokevirtual dgn.cf0 (Lerg;)Ljava/util/List;
      // 07e: astore 7
      // 080: aload 7
      // 082: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 087: astore 8
      // 089: aload 8
      // 08b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 090: ifeq 14a
      // 093: aload 8
      // 095: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09a: checkcast sdj
      // 09d: astore 9
      // 09f: aload 0
      // 0a0: pop
      // 0a1: getstatic qzx.ek1 Lc05;
      // 0a4: getfield Minecraft.vg8 Ll86;
      // 0a7: invokevirtual EntityPlayerSP.i55 ()F
      // 0aa: getstatic qzx.n4b Lcrk;
      // 0ad: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 0b0: invokevirtual java/lang/Float.floatValue ()F
      // 0b3: fcmpg
      // 0b4: iload 3
      // 0b5: ifne 011
      // 0b8: iload 3
      // 0b9: ifne 0d2
      // 0bc: ifge 146
      // 0bf: goto 0c6
      // 0c2: invokestatic qzx.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 9
      // 0c8: invokevirtual sdj._na ()I
      // 0cb: goto 0d2
      // 0ce: invokestatic qzx.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: iload 3
      // 0d3: ifne 145
      // 0d6: getstatic mcs.az0 Lmcs;
      // 0d9: getfield mcs.zr9 I
      // 0dc: if_icmpeq 143
      // 0df: goto 0e6
      // 0e2: invokestatic qzx.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: getstatic qzx.kp5 Lcn7;
      // 0e9: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 0ec: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ef: iload 3
      // 0f0: ifne 110
      // 0f3: goto 0fa
      // 0f6: invokestatic qzx.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: ifeq 146
      // 0fd: goto 104
      // 100: invokestatic qzx.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 9
      // 106: invokevirtual sdj._na ()I
      // 109: goto 110
      // 10c: invokestatic qzx.a (Loov;)Loov;
      // 10f: athrow
      // 110: iload 3
      // 111: ifne 135
      // 114: getstatic mcs.kkg Lmcs;
      // 117: getfield mcs.zr9 I
      // 11a: if_icmpne 146
      // 11d: goto 124
      // 120: invokestatic qzx.a (Loov;)Loov;
      // 123: athrow
      // 124: aload 0
      // 125: getstatic mcs.kkg Lmcs;
      // 128: getfield mcs.zr9 I
      // 12b: invokespecial qzx.rkn (I)Z
      // 12e: goto 135
      // 131: invokestatic qzx.a (Loov;)Loov;
      // 134: athrow
      // 135: iload 3
      // 136: ifne 145
      // 139: ifne 146
      // 13c: goto 143
      // 13f: invokestatic qzx.a (Loov;)Loov;
      // 142: athrow
      // 143: iload 4
      // 145: ireturn
      // 146: iload 3
      // 147: ifeq 089
      // 14a: iinc 4 1
      // 14d: iload 3
      // 14e: ifeq 00f
      // 151: bipush 0
      // 152: istore 4
      // 154: iload 4
      // 156: bipush 36
      // 158: if_icmpge 287
      // 15b: aload 0
      // 15c: pop
      // 15d: iload 3
      // 15e: ifne 283
      // 161: getstatic qzx.ek1 Lc05;
      // 164: getfield Minecraft.vg8 Ll86;
      // 167: getfield EntityPlayerSP.up_ Ljnq;
      // 16a: getfield jnq.c41 [Lerg;
      // 16d: iload 4
      // 16f: aaload
      // 170: goto 177
      // 173: invokestatic qzx.a (Loov;)Loov;
      // 176: athrow
      // 177: ifnull 280
      // 17a: aload 0
      // 17b: pop
      // 17c: getstatic qzx.ek1 Lc05;
      // 17f: getfield Minecraft.vg8 Ll86;
      // 182: getfield EntityPlayerSP.up_ Ljnq;
      // 185: getfield jnq.c41 [Lerg;
      // 188: iload 4
      // 18a: aaload
      // 18b: astore 5
      // 18d: aload 5
      // 18f: invokevirtual erg.gn1 ()Lu7m;
      // 192: astore 6
      // 194: aload 6
      // 196: iload 3
      // 197: ifne 1b0
      // 19a: instanceof dgn
      // 19d: ifne 1ae
      // 1a0: goto 1a7
      // 1a3: invokestatic qzx.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: goto 280
      // 1aa: invokestatic qzx.a (Loov;)Loov;
      // 1ad: athrow
      // 1ae: aload 6
      // 1b0: checkcast dgn
      // 1b3: aload 5
      // 1b5: invokevirtual dgn.cf0 (Lerg;)Ljava/util/List;
      // 1b8: astore 7
      // 1ba: aload 7
      // 1bc: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1c1: astore 8
      // 1c3: aload 8
      // 1c5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1ca: ifeq 280
      // 1cd: aload 8
      // 1cf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d4: checkcast sdj
      // 1d7: astore 9
      // 1d9: aload 9
      // 1db: invokevirtual sdj._na ()I
      // 1de: iload 3
      // 1df: ifne 206
      // 1e2: getstatic mcs.uwx Lmcs;
      // 1e5: getfield mcs.zr9 I
      // 1e8: iload 3
      // 1e9: ifne 158
      // 1ec: goto 1f3
      // 1ef: invokestatic qzx.a (Loov;)Loov;
      // 1f2: athrow
      // 1f3: if_icmpne 27c
      // 1f6: getstatic qzx.p__ Lcn7;
      // 1f9: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 1fc: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1ff: goto 206
      // 202: invokestatic qzx.a (Loov;)Loov;
      // 205: athrow
      // 206: iload 3
      // 207: ifne 225
      // 20a: ifeq 27c
      // 20d: goto 214
      // 210: invokestatic qzx.a (Loov;)Loov;
      // 213: athrow
      // 214: aload 0
      // 215: getstatic mcs.uwx Lmcs;
      // 218: getfield mcs.zr9 I
      // 21b: invokespecial qzx.rkn (I)Z
      // 21e: goto 225
      // 221: invokestatic qzx.a (Loov;)Loov;
      // 224: athrow
      // 225: iload 3
      // 226: ifne 250
      // 229: ifne 27c
      // 22c: goto 233
      // 22f: invokestatic qzx.a (Loov;)Loov;
      // 232: athrow
      // 233: aload 5
      // 235: invokevirtual erg.zow ()Ljava/lang/String;
      // 238: sipush 25208
      // 23b: ldc2_w 4035810164247876358
      // 23e: lload 1
      // 23f: lxor
      // 240: invokedynamic s (IJ)Ljava/lang/String; bsm=qzx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: nop
      // 246: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 249: goto 250
      // 24c: invokestatic qzx.a (Loov;)Loov;
      // 24f: athrow
      // 250: iload 3
      // 251: ifne 27b
      // 254: ifeq 279
      // 257: goto 25e
      // 25a: invokestatic qzx.a (Loov;)Loov;
      // 25d: athrow
      // 25e: getstatic qzx.ui3 Lcn7;
      // 261: invokevirtual BooleanSetting.g7m ()Z
      // 264: iload 3
      // 265: ifne 27b
      // 268: goto 26f
      // 26b: invokestatic qzx.a (Loov;)Loov;
      // 26e: athrow
      // 26f: ifne 27c
      // 272: goto 279
      // 275: invokestatic qzx.a (Loov;)Loov;
      // 278: athrow
      // 279: iload 4
      // 27b: ireturn
      // 27c: iload 3
      // 27d: ifeq 1c3
      // 280: iinc 4 1
      // 283: iload 3
      // 284: ifeq 154
      // 287: bipush -1
      // 288: ireturn
   }

   private boolean rkn(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: pop
      // 02: invokestatic OpaquePredicate.b ()I
      // 05: getstatic qzx.ek1 Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: invokevirtual EntityPlayerSP.g5i ()Ljava/util/Collection;
      // 0e: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 13: astore 3
      // 14: istore 2
      // 15: aload 3
      // 16: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b: ifeq 55
      // 1e: aload 3
      // 1f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 24: astore 4
      // 26: aload 4
      // 28: checkcast sdj
      // 2b: invokevirtual sdj._na ()I
      // 2e: iload 2
      // 2f: ifeq 56
      // 32: iload 2
      // 33: ifeq 50
      // 36: goto 3d
      // 39: invokestatic qzx.a (Loov;)Loov;
      // 3c: athrow
      // 3d: iload 1
      // 3e: if_icmpne 51
      // 41: goto 48
      // 44: invokestatic qzx.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 1
      // 49: goto 50
      // 4c: invokestatic qzx.a (Loov;)Loov;
      // 4f: athrow
      // 50: ireturn
      // 51: iload 2
      // 52: ifne 15
      // 55: bipush 0
      // 56: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6143247431831484058L, -1385544913704415555L, MethodHandles.lookup().lookupClass()).a(88938709482737L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 84011649359790L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[11];
      int var5 = 0;
      String var4 = "i´ûrîë\u001dÅ\"Ï¯Ü\u0015i\u0014ñ\u0018\u0007ºR`@_\r\u001c¥!\u0001\u0004MêX\u0004\u000bí\nU&j\u001b8\u0010?Ö\n&®í\u008aìLÎBÅö\u0099zà\u0010«\u0096¡Mk¾\u0012\u0098§\u0013vÏC¯\u0083û\u0010×ìm®\u0091\u0013\u008c\u0082\u001d÷\u0098Ùzô\u0013í ¸VâÒ¢\u008dNt!¢0\u0081Âö,\u009dàö\u008d\u001a\u0012\u0088ªt~@i¿Üe\u0010\u0095\u00109\u009bô=P\u008dK\u0091\u000b\r\u001fÆ£\u0093m\f\u0010ÿ8]È[6x\u00064v¶\u009d\u009eE³\u009e\u0010)\u0082³Æþ1VG¯\u0001É\u0007B\u008ce¹";
      int var6 = "i´ûrîë\u001dÅ\"Ï¯Ü\u0015i\u0014ñ\u0018\u0007ºR`@_\r\u001c¥!\u0001\u0004MêX\u0004\u000bí\nU&j\u001b8\u0010?Ö\n&®í\u008aìLÎBÅö\u0099zà\u0010«\u0096¡Mk¾\u0012\u0098§\u0013vÏC¯\u0083û\u0010×ìm®\u0091\u0013\u008c\u0082\u001d÷\u0098Ùzô\u0013í ¸VâÒ¢\u008dNt!¢0\u0081Âö,\u009dàö\u008d\u001a\u0012\u0088ªt~@i¿Üe\u0010\u0095\u00109\u009bô=P\u008dK\u0091\u000b\r\u001fÆ£\u0093m\f\u0010ÿ8]È[6x\u00064v¶\u009d\u009eE³\u009e\u0010)\u0082³Æþ1VG¯\u0001É\u0007B\u008ce¹"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[11];
                     n4b = new NumberSetting(
                        b<"s">(25649, 2727859783821459043L ^ var9),
                        b<"s">(18374, 6172722404500135312L ^ var9),
                        13.0F,
                        1.0F,
                        20.0F,
                        1.0F,
                        b<"s">(29806, 6870444516367232570L ^ var9)
                     );
                     t2i = new NumberSetting(
                        b<"s">(6449, 2619798906909590368L ^ var9),
                        b<"s">(31551, 6590352350168473956L ^ var9),
                        500.0F,
                        100.0F,
                        1500.0F,
                        50.0F,
                        b<"s">(19220, 1464266926896075076L ^ var9)
                     );
                     sel = new BooleanSetting(b<"s">(6449, 2619798906909590368L ^ var9), b<"s">(21014, 5091305370804045891L ^ var9), false);
                     kp5 = new BooleanSetting(b<"s">(6449, 2619798906909590368L ^ var9), b<"s">(27630, 8209364941503787453L ^ var9), true);
                     p__ = new BooleanSetting(b<"s">(6449, 2619798906909590368L ^ var9), b<"s">(27922, 3934133162920965957L ^ var9), false);
                     ui3 = new BooleanSetting(b<"s">(6449, 2619798906909590368L ^ var9), b<"s">(10829, 1612304613960396823L ^ var9), true);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "ã%X\u0095\u0093\u001a\u0083'rc\r\u0016\u0091\u0019Õ÷\u0010\u001f\u008d\u0085\u0096v²ðµ\u0085=9\u0097Tù÷k";
                  var6 = "ã%X\u0095\u0093\u001a\u0083'rc\r\u0016\u0091\u0019Õ÷\u0010\u001f\u008d\u0085\u0096v²ðµ\u0085=9\u0097Tù÷k".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21379;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("qzx", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("qzx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
