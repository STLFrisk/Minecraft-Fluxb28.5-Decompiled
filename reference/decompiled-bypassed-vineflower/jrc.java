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

public class jrc extends j1s {
   public double xdn;
   public double dud;
   public double tij;
   public boolean pdq;
   public int p7e;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public jrc() {
      long var1 = a ^ 125310441288613L;
      super(a<"y">(4694, 5855789212209236683L ^ var1), a<"y">(18076, 9037151936787717632L ^ var1));
   }

   @jev
   public void e_h(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual wbh.nlg ()Lmz2;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifne 23
      // 0e: instanceof net/minecraft/network/play/server/S08PacketPlayerPosLook
      // 11: ifeq 4b
      // 14: goto 1b
      // 17: invokestatic jrc.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 3
      // 1c: goto 23
      // 1f: invokestatic jrc.a (Loov;)Loov;
      // 22: athrow
      // 23: checkcast net/minecraft/network/play/server/S08PacketPlayerPosLook
      // 26: astore 4
      // 28: aload 4
      // 2a: aload 0
      // 2b: getfield jrc.wyl Lc05;
      // 2e: getfield c05.vg8 Ll86;
      // 31: getfield l86.x5k F
      // 34: invokevirtual net/minecraft/network/play/server/S08PacketPlayerPosLook.nqk (F)V
      // 37: aload 4
      // 39: aload 0
      // 3a: getfield jrc.wyl Lc05;
      // 3d: getfield c05.vg8 Ll86;
      // 40: getfield l86.y2i F
      // 43: invokevirtual net/minecraft/network/play/server/S08PacketPlayerPosLook.yn2 (F)V
      // 46: aload 0
      // 47: bipush 1
      // 48: putfield jrc.pdq Z
      // 4b: return
   }

   @jev
   public void ni4(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: invokevirtual jrc.ka8 ()Z
      // 008: ifeq 010
      // 00b: return
      // 00c: invokestatic jrc.a (Loov;)Loov;
      // 00f: athrow
      // 010: ldc2_w 0.2
      // 013: dstore 3
      // 014: aload 0
      // 015: getfield jrc.wyl Lc05;
      // 018: getfield c05.vg8 Ll86;
      // 01b: getfield l86.x5k F
      // 01e: ldc 90.0
      // 020: nop
      // 021: fadd
      // 022: f2d
      // 023: invokestatic java/lang/Math.toRadians (D)D
      // 026: invokestatic java/lang/Math.cos (D)D
      // 029: dstore 5
      // 02b: aload 0
      // 02c: getfield jrc.wyl Lc05;
      // 02f: getfield c05.vg8 Ll86;
      // 032: getfield l86.x5k F
      // 035: ldc 90.0
      // 037: nop
      // 038: fadd
      // 039: f2d
      // 03a: invokestatic java/lang/Math.toRadians (D)D
      // 03d: invokestatic java/lang/Math.sin (D)D
      // 040: dstore 7
      // 042: aload 0
      // 043: getfield jrc.wyl Lc05;
      // 046: getfield c05.vg8 Ll86;
      // 049: getfield l86.g9g Lboa;
      // 04c: getfield boa._mw F
      // 04f: f2d
      // 050: ldc2_w 0.2
      // 053: dmul
      // 054: dload 5
      // 056: dmul
      // 057: aload 0
      // 058: getfield jrc.wyl Lc05;
      // 05b: getfield c05.vg8 Ll86;
      // 05e: getfield l86.g9g Lboa;
      // 061: getfield boa.lrp F
      // 064: f2d
      // 065: ldc2_w 0.2
      // 068: dmul
      // 069: dload 7
      // 06b: dmul
      // 06c: dadd
      // 06d: dstore 9
      // 06f: aload 0
      // 070: getfield jrc.wyl Lc05;
      // 073: getfield c05.vg8 Ll86;
      // 076: getfield l86.g9g Lboa;
      // 079: getfield boa._mw F
      // 07c: f2d
      // 07d: ldc2_w 0.2
      // 080: dmul
      // 081: dload 7
      // 083: dmul
      // 084: aload 0
      // 085: getfield jrc.wyl Lc05;
      // 088: getfield c05.vg8 Ll86;
      // 08b: getfield l86.g9g Lboa;
      // 08e: getfield boa.lrp F
      // 091: f2d
      // 092: ldc2_w 0.2
      // 095: dmul
      // 096: dload 5
      // 098: dmul
      // 099: dsub
      // 09a: dstore 11
      // 09c: aload 1
      // 09d: invokevirtual ihr.bbi ()Lmz2;
      // 0a0: astore 13
      // 0a2: aload 0
      // 0a3: getfield jrc.wyl Lc05;
      // 0a6: getfield c05.vg8 Ll86;
      // 0a9: getfield l86.cbi Z
      // 0ac: iload 2
      // 0ad: ifne 0d1
      // 0b0: ifeq 131
      // 0b3: goto 0ba
      // 0b6: invokestatic jrc.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 13
      // 0bc: iload 2
      // 0bd: ifne 0e7
      // 0c0: goto 0c7
      // 0c3: invokestatic jrc.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: instanceof net/minecraft/network/play/client/C03PacketPlayer
      // 0ca: goto 0d1
      // 0cd: invokestatic jrc.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: ifeq 131
      // 0d4: aload 0
      // 0d5: dup
      // 0d6: getfield jrc.p7e I
      // 0d9: bipush 1
      // 0da: iadd
      // 0db: putfield jrc.p7e I
      // 0de: aload 13
      // 0e0: goto 0e7
      // 0e3: invokestatic jrc.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: checkcast net/minecraft/network/play/client/C03PacketPlayer
      // 0ea: astore 14
      // 0ec: aload 0
      // 0ed: iload 2
      // 0ee: ifne 12d
      // 0f1: getfield jrc.p7e I
      // 0f4: bipush 5
      // 0f5: if_icmplt 131
      // 0f8: goto 0ff
      // 0fb: invokestatic jrc.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 14
      // 101: dload 9
      // 103: aload 14
      // 105: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.yle ()D
      // 108: dadd
      // 109: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.frn (D)V
      // 10c: aload 14
      // 10e: aload 14
      // 110: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.pow ()D
      // 113: dconst_1
      // 114: dsub
      // 115: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.ubs (D)V
      // 118: aload 14
      // 11a: dload 11
      // 11c: aload 14
      // 11e: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.i50 ()D
      // 121: dadd
      // 122: invokevirtual net/minecraft/network/play/client/C03PacketPlayer.cad (D)V
      // 125: aload 0
      // 126: goto 12d
      // 129: invokestatic jrc.a (Loov;)Loov;
      // 12c: athrow
      // 12d: bipush 0
      // 12e: putfield jrc.p7e I
      // 131: return
   }

   @jev
   public void ghr(w1x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual w1x.jqi ()Lnh4;
      // 08: iload 2
      // 09: ifeq 2c
      // 0c: ifnull 4c
      // 0f: goto 16
      // 12: invokestatic jrc.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: iload 2
      // 18: ifeq 48
      // 1b: goto 22
      // 1e: invokestatic jrc.a (Loov;)Loov;
      // 21: athrow
      // 22: invokevirtual w1x.jqi ()Lnh4;
      // 25: goto 2c
      // 28: invokestatic jrc.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getfield nh4.i2c D
      // 2f: aload 0
      // 30: getfield jrc.wyl Lc05;
      // 33: getfield c05.vg8 Ll86;
      // 36: getfield l86.l29 Lnh4;
      // 39: getfield nh4.bx_ D
      // 3c: dcmpl
      // 3d: ifle 4c
      // 40: aload 1
      // 41: goto 48
      // 44: invokestatic jrc.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 1
      // 49: invokevirtual w1x.wxi (Z)V
      // 4c: return
   }

   @jev
   public void x0d(q8e param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 0.4
      // 003: dstore 3
      // 004: aload 0
      // 005: getfield jrc.wyl Lc05;
      // 008: getfield c05.vg8 Ll86;
      // 00b: getfield l86.x5k F
      // 00e: ldc 90.0
      // 010: nop
      // 011: fadd
      // 012: f2d
      // 013: invokestatic java/lang/Math.toRadians (D)D
      // 016: invokestatic java/lang/Math.cos (D)D
      // 019: dstore 5
      // 01b: invokestatic t9d.b ()I
      // 01e: aload 0
      // 01f: getfield jrc.wyl Lc05;
      // 022: getfield c05.vg8 Ll86;
      // 025: getfield l86.x5k F
      // 028: ldc 90.0
      // 02a: nop
      // 02b: fadd
      // 02c: f2d
      // 02d: invokestatic java/lang/Math.toRadians (D)D
      // 030: invokestatic java/lang/Math.sin (D)D
      // 033: dstore 7
      // 035: aload 0
      // 036: getfield jrc.wyl Lc05;
      // 039: getfield c05.vg8 Ll86;
      // 03c: getfield l86.g9g Lboa;
      // 03f: getfield boa._mw F
      // 042: f2d
      // 043: dload 3
      // 044: dmul
      // 045: dload 5
      // 047: dmul
      // 048: aload 0
      // 049: getfield jrc.wyl Lc05;
      // 04c: getfield c05.vg8 Ll86;
      // 04f: getfield l86.g9g Lboa;
      // 052: getfield boa.lrp F
      // 055: f2d
      // 056: dload 3
      // 057: dmul
      // 058: dload 7
      // 05a: dmul
      // 05b: dadd
      // 05c: dstore 9
      // 05e: istore 2
      // 05f: aload 0
      // 060: getfield jrc.wyl Lc05;
      // 063: getfield c05.vg8 Ll86;
      // 066: getfield l86.g9g Lboa;
      // 069: getfield boa._mw F
      // 06c: f2d
      // 06d: dload 3
      // 06e: dmul
      // 06f: dload 7
      // 071: dmul
      // 072: aload 0
      // 073: getfield jrc.wyl Lc05;
      // 076: getfield c05.vg8 Ll86;
      // 079: getfield l86.g9g Lboa;
      // 07c: getfield boa.lrp F
      // 07f: f2d
      // 080: dload 3
      // 081: dmul
      // 082: dload 5
      // 084: dmul
      // 085: dsub
      // 086: dstore 11
      // 088: aload 0
      // 089: getfield jrc.wyl Lc05;
      // 08c: getfield c05.vg8 Ll86;
      // 08f: getfield l86.cbi Z
      // 092: iload 2
      // 093: ifeq 1ee
      // 096: ifeq 1df
      // 099: goto 0a0
      // 09c: invokestatic jrc.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield jrc.wyl Lc05;
      // 0a4: getfield c05.vg8 Ll86;
      // 0a7: invokevirtual l86.z2m ()Z
      // 0aa: iload 2
      // 0ab: ifeq 1ee
      // 0ae: goto 0b5
      // 0b1: invokestatic jrc.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: ifne 1df
      // 0b8: goto 0bf
      // 0bb: invokestatic jrc.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: invokevirtual jrc.ka8 ()Z
      // 0c3: iload 2
      // 0c4: ifeq 1ee
      // 0c7: goto 0ce
      // 0ca: invokestatic jrc.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: ifne 1df
      // 0d1: goto 0d8
      // 0d4: invokestatic jrc.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: getfield jrc.wyl Lc05;
      // 0dc: getfield c05.vg8 Ll86;
      // 0df: getfield l86.lq7 Lp_k;
      // 0e2: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 0e5: dup
      // 0e6: aload 0
      // 0e7: getfield jrc.wyl Lc05;
      // 0ea: getfield c05.vg8 Ll86;
      // 0ed: getfield l86.o2v D
      // 0f0: dload 9
      // 0f2: dadd
      // 0f3: aload 0
      // 0f4: getfield jrc.wyl Lc05;
      // 0f7: getfield c05.vg8 Ll86;
      // 0fa: getfield l86.kfp D
      // 0fd: aload 0
      // 0fe: getfield jrc.wyl Lc05;
      // 101: getfield c05.vg8 Ll86;
      // 104: getfield l86.vbd D
      // 107: dload 11
      // 109: dadd
      // 10a: bipush 0
      // 10b: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 10e: invokevirtual p_k.sxi (Lmz2;)V
      // 111: bipush 1
      // 112: istore 13
      // 114: iload 13
      // 116: bipush 11
      // 118: if_icmpge 15d
      // 11b: aload 0
      // 11c: getfield jrc.wyl Lc05;
      // 11f: getfield c05.vg8 Ll86;
      // 122: getfield l86.lq7 Lp_k;
      // 125: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 128: dup
      // 129: aload 0
      // 12a: getfield jrc.wyl Lc05;
      // 12d: getfield c05.vg8 Ll86;
      // 130: getfield l86.o2v D
      // 133: ldc2_w 1.7976931348623157E308
      // 136: iload 13
      // 138: i2d
      // 139: dmul
      // 13a: aload 0
      // 13b: getfield jrc.wyl Lc05;
      // 13e: getfield c05.vg8 Ll86;
      // 141: getfield l86.vbd D
      // 144: bipush 0
      // 145: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 148: invokevirtual p_k.sxi (Lmz2;)V
      // 14b: iinc 13 1
      // 14e: iload 2
      // 14f: ifeq 21f
      // 152: iload 2
      // 153: ifne 114
      // 156: goto 15d
      // 159: invokestatic jrc.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 0
      // 15e: getfield jrc.wyl Lc05;
      // 161: getfield c05.vg8 Ll86;
      // 164: getfield l86.o2v D
      // 167: dstore 13
      // 169: aload 0
      // 16a: getfield jrc.wyl Lc05;
      // 16d: getfield c05.vg8 Ll86;
      // 170: getfield l86.kfp D
      // 173: dstore 15
      // 175: aload 0
      // 176: getfield jrc.wyl Lc05;
      // 179: getfield c05.vg8 Ll86;
      // 17c: getfield l86.lq7 Lp_k;
      // 17f: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 182: dup
      // 183: dload 13
      // 185: dload 15
      // 187: aload 0
      // 188: invokevirtual jrc.igq ()Z
      // 18b: ifeq 198
      // 18e: ldc2_w 9000.0
      // 191: goto 19b
      // 194: invokestatic jrc.a (Loov;)Loov;
      // 197: athrow
      // 198: ldc2_w 0.1
      // 19b: dsub
      // 19c: aload 0
      // 19d: getfield jrc.wyl Lc05;
      // 1a0: getfield c05.vg8 Ll86;
      // 1a3: getfield l86.vbd D
      // 1a6: bipush 0
      // 1a7: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 1aa: invokevirtual p_k.sxi (Lmz2;)V
      // 1ad: aload 0
      // 1ae: getfield jrc.wyl Lc05;
      // 1b1: getfield c05.vg8 Ll86;
      // 1b4: aload 0
      // 1b5: getfield jrc.wyl Lc05;
      // 1b8: getfield c05.vg8 Ll86;
      // 1bb: getfield l86.o2v D
      // 1be: dload 9
      // 1c0: dadd
      // 1c1: aload 0
      // 1c2: getfield jrc.wyl Lc05;
      // 1c5: getfield c05.vg8 Ll86;
      // 1c8: getfield l86.kfp D
      // 1cb: aload 0
      // 1cc: getfield jrc.wyl Lc05;
      // 1cf: getfield c05.vg8 Ll86;
      // 1d2: getfield l86.vbd D
      // 1d5: dload 11
      // 1d7: dadd
      // 1d8: invokevirtual l86.m6_ (DDD)V
      // 1db: iload 2
      // 1dc: ifne 21f
      // 1df: aload 0
      // 1e0: iload 2
      // 1e1: ifeq 1f2
      // 1e4: invokevirtual jrc.ka8 ()Z
      // 1e7: goto 1ee
      // 1ea: invokestatic jrc.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: ifeq 21f
      // 1f1: aload 0
      // 1f2: getfield jrc.wyl Lc05;
      // 1f5: getfield c05.vg8 Ll86;
      // 1f8: aload 0
      // 1f9: getfield jrc.wyl Lc05;
      // 1fc: getfield c05.vg8 Ll86;
      // 1ff: getfield l86.o2v D
      // 202: dload 9
      // 204: dadd
      // 205: aload 0
      // 206: getfield jrc.wyl Lc05;
      // 209: getfield c05.vg8 Ll86;
      // 20c: getfield l86.kfp D
      // 20f: aload 0
      // 210: getfield jrc.wyl Lc05;
      // 213: getfield c05.vg8 Ll86;
      // 216: getfield l86.vbd D
      // 219: dload 11
      // 21b: dadd
      // 21c: invokevirtual l86.m6_ (DDD)V
      // 21f: return
   }

   public boolean igq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield jrc.wyl Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: invokevirtual l86.aaw ()Lnh4;
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifeq 37
      // 14: ifnonnull 24
      // 17: goto 1e
      // 1a: invokestatic jrc.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic jrc.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 2
      // 25: ldc2_w 0.01
      // 28: dconst_0
      // 29: ldc2_w 0.01
      // 2c: invokevirtual nh4.va6 (DDD)Lnh4;
      // 2f: dconst_0
      // 30: ldc2_w -0.01
      // 33: dconst_0
      // 34: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 37: astore 2
      // 38: bipush 0
      // 39: istore 3
      // 3a: aload 2
      // 3b: getfield nh4.bx_ D
      // 3e: d2i
      // 3f: istore 4
      // 41: aload 2
      // 42: getfield nh4.rlc D
      // 45: invokestatic fe6.jqf (D)I
      // 48: istore 5
      // 4a: iload 5
      // 4c: aload 2
      // 4d: getfield nh4.t_2 D
      // 50: dconst_1
      // 51: dadd
      // 52: invokestatic fe6.jqf (D)I
      // 55: if_icmpge df
      // 58: aload 2
      // 59: getfield nh4.t8n D
      // 5c: invokestatic fe6.jqf (D)I
      // 5f: iload 1
      // 60: ifeq e0
      // 63: istore 6
      // 65: iload 6
      // 67: aload 2
      // 68: getfield nh4.oqj D
      // 6b: dconst_1
      // 6c: dadd
      // 6d: invokestatic fe6.jqf (D)I
      // 70: if_icmpge d8
      // 73: aload 0
      // 74: getfield jrc.wyl Lc05;
      // 77: getfield c05.tij Lkh3;
      // 7a: new mew
      // 7d: dup
      // 7e: iload 5
      // 80: iload 4
      // 82: iload 6
      // 84: invokespecial mew.<init> (III)V
      // 87: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 8a: invokeinterface zfz.r_y ()Le0x; 1
      // 8f: astore 7
      // 91: iload 1
      // 92: ifeq db
      // 95: iload 1
      // 96: ifeq d4
      // 99: goto a0
      // 9c: invokestatic jrc.a (Loov;)Loov;
      // 9f: athrow
      // a0: aload 7
      // a2: getstatic ox_.ibw Le0x;
      // a5: if_acmpeq d1
      // a8: goto af
      // ab: invokestatic jrc.a (Loov;)Loov;
      // ae: athrow
      // af: aload 7
      // b1: instanceof hmv
      // b4: iload 1
      // b5: ifeq d0
      // b8: goto bf
      // bb: invokestatic jrc.a (Loov;)Loov;
      // be: athrow
      // bf: ifne cf
      // c2: goto c9
      // c5: invokestatic jrc.a (Loov;)Loov;
      // c8: athrow
      // c9: bipush 0
      // ca: ireturn
      // cb: invokestatic jrc.a (Loov;)Loov;
      // ce: athrow
      // cf: bipush 1
      // d0: istore 3
      // d1: iinc 6 1
      // d4: iload 1
      // d5: ifne 65
      // d8: iinc 5 1
      // db: iload 1
      // dc: ifne 4a
      // df: iload 3
      // e0: ireturn
   }

   public boolean ka8() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield jrc.wyl Lc05;
      // 008: getfield c05.vg8 Ll86;
      // 00b: getfield l86.l29 Lnh4;
      // 00e: getfield nh4.rlc D
      // 011: invokestatic fe6.jqf (D)I
      // 014: istore 2
      // 015: iload 2
      // 016: aload 0
      // 017: getfield jrc.wyl Lc05;
      // 01a: getfield c05.vg8 Ll86;
      // 01d: getfield l86.l29 Lnh4;
      // 020: getfield nh4.t_2 D
      // 023: invokestatic fe6.jqf (D)I
      // 026: bipush 1
      // 027: iadd
      // 028: if_icmpge 179
      // 02b: aload 0
      // 02c: getfield jrc.wyl Lc05;
      // 02f: getfield c05.vg8 Ll86;
      // 032: getfield l86.l29 Lnh4;
      // 035: getfield nh4.bx_ D
      // 038: invokestatic fe6.jqf (D)I
      // 03b: iload 1
      // 03c: ifne 17a
      // 03f: istore 3
      // 040: iload 3
      // 041: aload 0
      // 042: getfield jrc.wyl Lc05;
      // 045: getfield c05.vg8 Ll86;
      // 048: getfield l86.l29 Lnh4;
      // 04b: getfield nh4.i2c D
      // 04e: invokestatic fe6.jqf (D)I
      // 051: bipush 1
      // 052: iadd
      // 053: if_icmpge 172
      // 056: aload 0
      // 057: getfield jrc.wyl Lc05;
      // 05a: getfield c05.vg8 Ll86;
      // 05d: getfield l86.l29 Lnh4;
      // 060: getfield nh4.t8n D
      // 063: invokestatic fe6.jqf (D)I
      // 066: iload 1
      // 067: ifne 016
      // 06a: istore 4
      // 06c: iload 4
      // 06e: aload 0
      // 06f: getfield jrc.wyl Lc05;
      // 072: getfield c05.vg8 Ll86;
      // 075: getfield l86.l29 Lnh4;
      // 078: getfield nh4.oqj D
      // 07b: invokestatic fe6.jqf (D)I
      // 07e: bipush 1
      // 07f: iadd
      // 080: if_icmpge 16b
      // 083: aload 0
      // 084: getfield jrc.wyl Lc05;
      // 087: getfield c05.tij Lkh3;
      // 08a: new mew
      // 08d: dup
      // 08e: iload 2
      // 08f: iload 3
      // 090: iload 4
      // 092: invokespecial mew.<init> (III)V
      // 095: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 098: invokeinterface zfz.r_y ()Le0x; 1
      // 09d: astore 5
      // 09f: iload 1
      // 0a0: ifne 16e
      // 0a3: iload 1
      // 0a4: ifne 167
      // 0a7: goto 0ae
      // 0aa: invokestatic jrc.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 5
      // 0b0: ifnull 164
      // 0b3: goto 0ba
      // 0b6: invokestatic jrc.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 5
      // 0bc: iload 1
      // 0bd: ifne 0dd
      // 0c0: goto 0c7
      // 0c3: invokestatic jrc.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: instanceof n47
      // 0ca: ifne 164
      // 0cd: goto 0d4
      // 0d0: invokestatic jrc.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: aload 5
      // 0d6: goto 0dd
      // 0d9: invokestatic jrc.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield jrc.wyl Lc05;
      // 0e1: getfield c05.tij Lkh3;
      // 0e4: new mew
      // 0e7: dup
      // 0e8: iload 2
      // 0e9: iload 3
      // 0ea: iload 4
      // 0ec: invokespecial mew.<init> (III)V
      // 0ef: aload 0
      // 0f0: getfield jrc.wyl Lc05;
      // 0f3: getfield c05.tij Lkh3;
      // 0f6: new mew
      // 0f9: dup
      // 0fa: iload 2
      // 0fb: iload 3
      // 0fc: iload 4
      // 0fe: invokespecial mew.<init> (III)V
      // 101: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 104: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 107: astore 6
      // 109: aload 5
      // 10b: instanceof a4v
      // 10e: ifeq 12e
      // 111: new nh4
      // 114: dup
      // 115: iload 2
      // 116: i2d
      // 117: iload 3
      // 118: i2d
      // 119: iload 4
      // 11b: i2d
      // 11c: iload 2
      // 11d: bipush 1
      // 11e: iadd
      // 11f: i2d
      // 120: iload 3
      // 121: bipush 1
      // 122: iadd
      // 123: i2d
      // 124: iload 4
      // 126: bipush 1
      // 127: iadd
      // 128: i2d
      // 129: invokespecial nh4.<init> (DDDDDD)V
      // 12c: astore 6
      // 12e: aload 6
      // 130: iload 1
      // 131: ifne 14f
      // 134: ifnull 164
      // 137: goto 13e
      // 13a: invokestatic jrc.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: getfield jrc.wyl Lc05;
      // 142: getfield c05.vg8 Ll86;
      // 145: getfield l86.l29 Lnh4;
      // 148: goto 14f
      // 14b: invokestatic jrc.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 6
      // 151: invokevirtual nh4.epq (Lnh4;)Z
      // 154: iload 1
      // 155: ifne 163
      // 158: ifeq 164
      // 15b: goto 162
      // 15e: invokestatic jrc.a (Loov;)Loov;
      // 161: athrow
      // 162: bipush 1
      // 163: ireturn
      // 164: iinc 4 1
      // 167: iload 1
      // 168: ifeq 06c
      // 16b: iinc 3 1
      // 16e: iload 1
      // 16f: ifeq 040
      // 172: iinc 2 1
      // 175: iload 1
      // 176: ifeq 015
      // 179: bipush 0
      // 17a: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6912676943673007164L, 3186850612437528383L, MethodHandles.lookup().lookupClass()).a(55928152839567L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 123138168726096L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "W¼ñ0hdE¯É\u0097\u001d{k\u0081ï´\u0010\u008aÞµj>Ææã*¯\u0086Ú£>ëX";
      int var8 = "W¼ñ0hdE¯É\u0097\u001d{k\u0081ï´\u0010\u008aÞµj>Ææã*¯\u0086Ú£>ëX".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19537;
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
            throw new RuntimeException("jrc", var10);
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
         throw new RuntimeException("jrc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
