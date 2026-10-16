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
import net.minecraft.network.play.server.S08PacketPlayerPosLook;

public class Speed extends Module {
   public static NumberSetting dcr;
   public static BooleanSetting gam;
   public static BooleanSetting fvs;
   public static BooleanSetting ebv;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public Speed() {
      long var1 = a ^ 75038121398523L;
      super(
         b<"i">(13412, 2252120879461533152L ^ var1),
         _aj._lm,
         true,
         new SubEngine[]{new egi(), new llv(), new j_r(), new uw3(), new sq8(), new j_r(), new _hv(), new fi5(), new z_c(), new tnf(), new vbi()}
      );
   }

   public static void o0x(_qa param0, double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: invokestatic Minecraft.vz1 ()Lc05;
      // 007: astore 4
      // 009: getstatic ModuleRegistry.kd6 Lohv;
      // 00c: invokevirtual Speed.isEnabled ()Z
      // 00f: iload 3
      // 010: ifeq 02a
      // 013: ifeq 08d
      // 016: goto 01d
      // 019: invokestatic Speed.a (Loov;)Loov;
      // 01c: athrow
      // 01d: getstatic ModuleRegistry.r0d Lvxv;
      // 020: invokevirtual vxv.isEnabled ()Z
      // 023: goto 02a
      // 026: invokestatic Speed.a (Loov;)Loov;
      // 029: athrow
      // 02a: iload 3
      // 02b: ifeq 045
      // 02e: ifeq 08d
      // 031: goto 038
      // 034: invokestatic Speed.a (Loov;)Loov;
      // 037: athrow
      // 038: getstatic vxv.mt1 Lcn7;
      // 03b: invokevirtual BooleanSetting.g7m ()Z
      // 03e: goto 045
      // 041: invokestatic Speed.a (Loov;)Loov;
      // 044: athrow
      // 045: iload 3
      // 046: ifeq 070
      // 049: ifeq 073
      // 04c: goto 053
      // 04f: invokestatic Speed.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 4
      // 055: iload 3
      // 056: ifeq 08f
      // 059: goto 060
      // 05c: invokestatic Speed.a (Loov;)Loov;
      // 05f: athrow
      // 060: getfield Minecraft.oxn Lmoh;
      // 063: getfield moh.nfb Lm7l;
      // 066: invokevirtual m7l.t9w ()Z
      // 069: goto 070
      // 06c: invokestatic Speed.a (Loov;)Loov;
      // 06f: athrow
      // 070: ifeq 08d
      // 073: getstatic KillAura.kfa Lg_3;
      // 076: ifnull 08d
      // 079: goto 080
      // 07c: invokestatic Speed.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 0
      // 081: dload 1
      // 082: getstatic KillAura.kfa Lg_3;
      // 085: invokestatic vxv.kax (L_qa;DLi2h;)V
      // 088: return
      // 089: invokestatic Speed.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 4
      // 08f: getfield Minecraft.vg8 Ll86;
      // 092: getfield EntityPlayerSP.g9g Lboa;
      // 095: getfield boa._mw F
      // 098: f2d
      // 099: dstore 5
      // 09b: aload 4
      // 09d: getfield Minecraft.vg8 Ll86;
      // 0a0: getfield EntityPlayerSP.g9g Lboa;
      // 0a3: getfield boa.lrp F
      // 0a6: f2d
      // 0a7: dstore 7
      // 0a9: aload 4
      // 0ab: getfield Minecraft.vg8 Ll86;
      // 0ae: getfield EntityPlayerSP.x5k F
      // 0b1: fstore 9
      // 0b3: dload 5
      // 0b5: dconst_0
      // 0b6: dcmpl
      // 0b7: iload 3
      // 0b8: ifeq 109
      // 0bb: ifne 0f3
      // 0be: goto 0c5
      // 0c1: invokestatic Speed.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: dload 7
      // 0c7: dconst_0
      // 0c8: dcmpl
      // 0c9: iload 3
      // 0ca: ifeq 109
      // 0cd: goto 0d4
      // 0d0: invokestatic Speed.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: ifne 0f3
      // 0d7: goto 0de
      // 0da: invokestatic Speed.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: dconst_0
      // 0e0: invokevirtual _qa.oz6 (D)V
      // 0e3: aload 0
      // 0e4: dconst_0
      // 0e5: invokevirtual _qa.sqi (D)V
      // 0e8: iload 3
      // 0e9: ifne 21e
      // 0ec: goto 0f3
      // 0ef: invokestatic Speed.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: dload 5
      // 0f5: iload 3
      // 0f6: ifeq 1d5
      // 0f9: goto 100
      // 0fc: invokestatic Speed.a (Loov;)Loov;
      // 0ff: athrow
      // 100: dconst_0
      // 101: dcmpl
      // 102: goto 109
      // 105: invokestatic Speed.a (Loov;)Loov;
      // 108: athrow
      // 109: ifeq 1c8
      // 10c: dload 7
      // 10e: dconst_0
      // 10f: dcmpl
      // 110: iload 3
      // 111: ifeq 15a
      // 114: goto 11b
      // 117: invokestatic Speed.a (Loov;)Loov;
      // 11a: athrow
      // 11b: ifle 14f
      // 11e: goto 125
      // 121: invokestatic Speed.a (Loov;)Loov;
      // 124: athrow
      // 125: fload 9
      // 127: dload 5
      // 129: dconst_0
      // 12a: dcmpl
      // 12b: iload 3
      // 12c: ifeq 142
      // 12f: goto 136
      // 132: invokestatic Speed.a (Loov;)Loov;
      // 135: athrow
      // 136: ifle 145
      // 139: goto 140
      // 13c: invokestatic Speed.a (Loov;)Loov;
      // 13f: athrow
      // 140: bipush -45
      // 142: goto 147
      // 145: bipush 45
      // 147: i2f
      // 148: fadd
      // 149: fstore 9
      // 14b: iload 3
      // 14c: ifne 18e
      // 14f: dload 7
      // 151: dconst_0
      // 152: dcmpg
      // 153: goto 15a
      // 156: invokestatic Speed.a (Loov;)Loov;
      // 159: athrow
      // 15a: iload 3
      // 15b: ifeq 195
      // 15e: ifge 18e
      // 161: goto 168
      // 164: invokestatic Speed.a (Loov;)Loov;
      // 167: athrow
      // 168: fload 9
      // 16a: dload 5
      // 16c: dconst_0
      // 16d: dcmpl
      // 16e: iload 3
      // 16f: ifeq 185
      // 172: goto 179
      // 175: invokestatic Speed.a (Loov;)Loov;
      // 178: athrow
      // 179: ifle 188
      // 17c: goto 183
      // 17f: invokestatic Speed.a (Loov;)Loov;
      // 182: athrow
      // 183: bipush 45
      // 185: goto 18a
      // 188: bipush -45
      // 18a: i2f
      // 18b: fadd
      // 18c: fstore 9
      // 18e: dconst_0
      // 18f: dstore 7
      // 191: dload 5
      // 193: dconst_0
      // 194: dcmpl
      // 195: iload 3
      // 196: ifeq 1c0
      // 199: ifle 1aa
      // 19c: goto 1a3
      // 19f: invokestatic Speed.a (Loov;)Loov;
      // 1a2: athrow
      // 1a3: dconst_1
      // 1a4: dstore 5
      // 1a6: iload 3
      // 1a7: ifne 1c8
      // 1aa: dload 5
      // 1ac: iload 3
      // 1ad: ifeq 1d5
      // 1b0: goto 1b7
      // 1b3: invokestatic Speed.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: dconst_0
      // 1b8: dcmpg
      // 1b9: goto 1c0
      // 1bc: invokestatic Speed.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: ifge 1c8
      // 1c3: ldc2_w -1.0
      // 1c6: dstore 5
      // 1c8: fload 9
      // 1ca: ldc 90.0
      // 1cc: nop
      // 1cd: fadd
      // 1ce: f2d
      // 1cf: invokestatic java/lang/Math.toRadians (D)D
      // 1d2: invokestatic java/lang/Math.cos (D)D
      // 1d5: dstore 10
      // 1d7: fload 9
      // 1d9: ldc 90.0
      // 1db: nop
      // 1dc: fadd
      // 1dd: f2d
      // 1de: invokestatic java/lang/Math.toRadians (D)D
      // 1e1: invokestatic java/lang/Math.sin (D)D
      // 1e4: dstore 12
      // 1e6: aload 0
      // 1e7: aload 4
      // 1e9: getfield Minecraft.vg8 Ll86;
      // 1ec: dload 5
      // 1ee: dload 1
      // 1ef: dmul
      // 1f0: dload 10
      // 1f2: dmul
      // 1f3: dload 7
      // 1f5: dload 1
      // 1f6: dmul
      // 1f7: dload 12
      // 1f9: dmul
      // 1fa: dadd
      // 1fb: dup2_x1
      // 1fc: putfield EntityPlayerSP.icv D
      // 1ff: invokevirtual _qa.oz6 (D)V
      // 202: aload 0
      // 203: aload 4
      // 205: getfield Minecraft.vg8 Ll86;
      // 208: dload 5
      // 20a: dload 1
      // 20b: dmul
      // 20c: dload 12
      // 20e: dmul
      // 20f: dload 7
      // 211: dload 1
      // 212: dmul
      // 213: dload 10
      // 215: dmul
      // 216: dsub
      // 217: dup2_x1
      // 218: putfield EntityPlayerSP.bw4 D
      // 21b: invokevirtual _qa.sqi (D)V
      // 21e: return
   }

   @EventHandler
   public void zwn(TickEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic Speed.a J
      // 03: ldc2_w 98193030481052
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: getstatic Speed.fvs Lcn7;
      // 10: invokevirtual BooleanSetting.g7m ()Z
      // 13: iload 4
      // 15: ifne 4e
      // 18: ifeq 41
      // 1b: goto 22
      // 1e: invokestatic Speed.a (Loov;)Loov;
      // 21: athrow
      // 22: getstatic Speed.ek1 Lc05;
      // 25: getfield Minecraft.vg8 Ll86;
      // 28: invokevirtual EntityPlayerSP.mwv ()Z
      // 2b: iload 4
      // 2d: ifne 4e
      // 30: goto 37
      // 33: invokestatic Speed.a (Loov;)Loov;
      // 36: athrow
      // 37: ifne 70
      // 3a: goto 41
      // 3d: invokestatic Speed.a (Loov;)Loov;
      // 40: athrow
      // 41: getstatic Speed.ebv Lcn7;
      // 44: invokevirtual BooleanSetting.g7m ()Z
      // 47: goto 4e
      // 4a: invokestatic Speed.a (Loov;)Loov;
      // 4d: athrow
      // 4e: iload 4
      // 50: ifne 6d
      // 53: ifeq b1
      // 56: goto 5d
      // 59: invokestatic Speed.a (Loov;)Loov;
      // 5c: athrow
      // 5d: getstatic Speed.ek1 Lc05;
      // 60: getfield Minecraft.vg8 Ll86;
      // 63: invokevirtual EntityPlayerSP.z2m ()Z
      // 66: goto 6d
      // 69: invokestatic Speed.a (Loov;)Loov;
      // 6c: athrow
      // 6d: ifeq b1
      // 70: sipush 10524
      // 73: ldc2_w 2595125164681825530
      // 76: lload 2
      // 77: lxor
      // 78: invokedynamic i (IJ)Ljava/lang/String; bsm=Speed.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: nop
      // 7e: new java/lang/StringBuilder
      // 81: dup
      // 82: invokespecial java/lang/StringBuilder.<init> ()V
      // 85: aload 0
      // 86: invokevirtual Speed.m2d ()Ljava/lang/String;
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: sipush 19161
      // 8f: ldc2_w 2721467770869870395
      // 92: lload 2
      // 93: lxor
      // 94: invokedynamic i (IJ)Ljava/lang/String; bsm=Speed.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: nop
      // 9a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a0: getstatic jgv$vro.ak0 Ljgv$vro;
      // a3: invokestatic zet.gn0 (Ljava/lang/String;Ljava/lang/String;Ljgv$vro;)V
      // a6: aload 0
      // a7: invokevirtual Speed.disable ()V
      // aa: goto b1
      // ad: invokestatic Speed.a (Loov;)Loov;
      // b0: athrow
      // b1: return
   }

   @EventHandler
   public void f7v(wbh param1) {
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
      // 05: invokevirtual wbh.nlg ()Lmz2;
      // 08: instanceof net/minecraft/network/play/server/S08PacketPlayerPosLook
      // 0b: iload 2
      // 0c: ifeq 26
      // 0f: ifeq 34
      // 12: goto 19
      // 15: invokestatic Speed.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic Speed.gam Lcn7;
      // 1c: invokevirtual BooleanSetting.g7m ()Z
      // 1f: goto 26
      // 22: invokestatic Speed.a (Loov;)Loov;
      // 25: athrow
      // 26: ifeq 34
      // 29: aload 0
      // 2a: invokevirtual Speed.toggle ()V
      // 2d: goto 34
      // 30: invokestatic Speed.a (Loov;)Loov;
      // 33: athrow
      // 34: return
   }

   @EventHandler
   public void _od(wbh var1) {
      try {
         if (var1.vip instanceof S08PacketPlayerPosLook) {
            this.ej6(500);
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   public static double reg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: ldc2_w 0.2872
      // 07: dstore 1
      // 08: getstatic Speed.ek1 Lc05;
      // 0b: getfield Minecraft.vg8 Ll86;
      // 0e: iload 0
      // 0f: ifeq 29
      // 12: ifnull 61
      // 15: goto 1c
      // 18: invokestatic Speed.a (Loov;)Loov;
      // 1b: athrow
      // 1c: getstatic Speed.ek1 Lc05;
      // 1f: getfield Minecraft.vg8 Ll86;
      // 22: goto 29
      // 25: invokestatic Speed.a (Loov;)Loov;
      // 28: athrow
      // 29: getstatic mcs.uwx Lmcs;
      // 2c: invokevirtual EntityPlayerSP.cab (Lmcs;)Z
      // 2f: iload 0
      // 30: ifeq 53
      // 33: ifeq 61
      // 36: goto 3d
      // 39: invokestatic Speed.a (Loov;)Loov;
      // 3c: athrow
      // 3d: getstatic Speed.ek1 Lc05;
      // 40: getfield Minecraft.vg8 Ll86;
      // 43: getstatic mcs.uwx Lmcs;
      // 46: invokevirtual EntityPlayerSP.dhd (Lmcs;)Lsdj;
      // 49: invokevirtual sdj.tus ()I
      // 4c: goto 53
      // 4f: invokestatic Speed.a (Loov;)Loov;
      // 52: athrow
      // 53: istore 3
      // 54: dload 1
      // 55: dconst_1
      // 56: ldc2_w 0.2
      // 59: iload 3
      // 5a: bipush 1
      // 5b: iadd
      // 5c: i2d
      // 5d: dmul
      // 5e: dadd
      // 5f: dmul
      // 60: dstore 1
      // 61: dload 1
      // 62: dreturn
   }

   public static void qjs(_qa param0, double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic Speed.ek1 Lc05;
      // 003: getfield Minecraft.vg8 Ll86;
      // 006: getfield EntityPlayerSP.ooc F
      // 009: f2d
      // 00a: dstore 4
      // 00c: invokestatic OpaquePredicate.c ()I
      // 00f: getstatic Speed.ek1 Lc05;
      // 012: getfield Minecraft.vg8 Ll86;
      // 015: getfield EntityPlayerSP.z66 F
      // 018: f2d
      // 019: dstore 6
      // 01b: istore 3
      // 01c: getstatic Speed.ek1 Lc05;
      // 01f: getfield Minecraft.vg8 Ll86;
      // 022: getfield EntityPlayerSP.x5k F
      // 025: fstore 8
      // 027: dload 4
      // 029: dconst_0
      // 02a: dcmpl
      // 02b: iload 3
      // 02c: ifne 072
      // 02f: ifne 067
      // 032: goto 039
      // 035: invokestatic Speed.a (Loov;)Loov;
      // 038: athrow
      // 039: dload 6
      // 03b: dconst_0
      // 03c: dcmpl
      // 03d: iload 3
      // 03e: ifne 072
      // 041: goto 048
      // 044: invokestatic Speed.a (Loov;)Loov;
      // 047: athrow
      // 048: ifne 067
      // 04b: goto 052
      // 04e: invokestatic Speed.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: dconst_0
      // 054: invokevirtual _qa.oz6 (D)V
      // 057: aload 0
      // 058: dconst_0
      // 059: invokevirtual _qa.sqi (D)V
      // 05c: iload 3
      // 05d: ifeq 18e
      // 060: goto 067
      // 063: invokestatic Speed.a (Loov;)Loov;
      // 066: athrow
      // 067: dload 4
      // 069: dconst_0
      // 06a: dcmpl
      // 06b: goto 072
      // 06e: invokestatic Speed.a (Loov;)Loov;
      // 071: athrow
      // 072: iload 3
      // 073: ifne 08b
      // 076: ifeq 13c
      // 079: goto 080
      // 07c: invokestatic Speed.a (Loov;)Loov;
      // 07f: athrow
      // 080: dload 6
      // 082: dconst_0
      // 083: dcmpl
      // 084: goto 08b
      // 087: invokestatic Speed.a (Loov;)Loov;
      // 08a: athrow
      // 08b: iload 3
      // 08c: ifne 0ce
      // 08f: ifle 0c3
      // 092: goto 099
      // 095: invokestatic Speed.a (Loov;)Loov;
      // 098: athrow
      // 099: fload 8
      // 09b: dload 4
      // 09d: dconst_0
      // 09e: dcmpl
      // 09f: iload 3
      // 0a0: ifne 0b6
      // 0a3: goto 0aa
      // 0a6: invokestatic Speed.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: ifle 0b9
      // 0ad: goto 0b4
      // 0b0: invokestatic Speed.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: bipush -45
      // 0b6: goto 0bb
      // 0b9: bipush 45
      // 0bb: i2f
      // 0bc: fadd
      // 0bd: fstore 8
      // 0bf: iload 3
      // 0c0: ifeq 102
      // 0c3: dload 6
      // 0c5: dconst_0
      // 0c6: dcmpg
      // 0c7: goto 0ce
      // 0ca: invokestatic Speed.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: iload 3
      // 0cf: ifne 109
      // 0d2: ifge 102
      // 0d5: goto 0dc
      // 0d8: invokestatic Speed.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: fload 8
      // 0de: dload 4
      // 0e0: dconst_0
      // 0e1: dcmpl
      // 0e2: iload 3
      // 0e3: ifne 0f9
      // 0e6: goto 0ed
      // 0e9: invokestatic Speed.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: ifle 0fc
      // 0f0: goto 0f7
      // 0f3: invokestatic Speed.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: bipush 45
      // 0f9: goto 0fe
      // 0fc: bipush -45
      // 0fe: i2f
      // 0ff: fadd
      // 100: fstore 8
      // 102: dconst_0
      // 103: dstore 6
      // 105: dload 4
      // 107: dconst_0
      // 108: dcmpl
      // 109: iload 3
      // 10a: ifne 134
      // 10d: ifle 11e
      // 110: goto 117
      // 113: invokestatic Speed.a (Loov;)Loov;
      // 116: athrow
      // 117: dconst_1
      // 118: dstore 4
      // 11a: iload 3
      // 11b: ifeq 13c
      // 11e: dload 4
      // 120: iload 3
      // 121: ifne 13a
      // 124: goto 12b
      // 127: invokestatic Speed.a (Loov;)Loov;
      // 12a: athrow
      // 12b: dconst_0
      // 12c: dcmpg
      // 12d: goto 134
      // 130: invokestatic Speed.a (Loov;)Loov;
      // 133: athrow
      // 134: ifge 13c
      // 137: ldc2_w -1.0
      // 13a: dstore 4
      // 13c: aload 0
      // 13d: dload 4
      // 13f: dload 1
      // 140: dmul
      // 141: fload 8
      // 143: ldc 90.0
      // 145: nop
      // 146: fadd
      // 147: f2d
      // 148: invokestatic java/lang/Math.toRadians (D)D
      // 14b: invokestatic java/lang/Math.cos (D)D
      // 14e: dmul
      // 14f: dload 6
      // 151: dload 1
      // 152: dmul
      // 153: fload 8
      // 155: ldc 90.0
      // 157: nop
      // 158: fadd
      // 159: f2d
      // 15a: invokestatic java/lang/Math.toRadians (D)D
      // 15d: invokestatic java/lang/Math.sin (D)D
      // 160: dmul
      // 161: dadd
      // 162: invokevirtual _qa.oz6 (D)V
      // 165: aload 0
      // 166: dload 4
      // 168: dload 1
      // 169: dmul
      // 16a: fload 8
      // 16c: ldc 90.0
      // 16e: nop
      // 16f: fadd
      // 170: f2d
      // 171: invokestatic java/lang/Math.toRadians (D)D
      // 174: invokestatic java/lang/Math.sin (D)D
      // 177: dmul
      // 178: dload 6
      // 17a: dload 1
      // 17b: dmul
      // 17c: fload 8
      // 17e: ldc 90.0
      // 180: nop
      // 181: fadd
      // 182: f2d
      // 183: invokestatic java/lang/Math.toRadians (D)D
      // 186: invokestatic java/lang/Math.cos (D)D
      // 189: dmul
      // 18a: dsub
      // 18b: invokevirtual _qa.sqi (D)V
      // 18e: return
   }

   public static void ns1(_qa param0, double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dconst_1
      // 01: dstore 4
      // 03: dconst_0
      // 04: dstore 6
      // 06: getstatic Speed.ek1 Lc05;
      // 09: getfield Minecraft.vg8 Ll86;
      // 0c: getfield EntityPlayerSP.x5k F
      // 0f: fstore 8
      // 11: invokestatic OpaquePredicate.b ()I
      // 14: aload 0
      // 15: dload 4
      // 17: dload 1
      // 18: dmul
      // 19: fload 8
      // 1b: ldc 90.0
      // 1d: nop
      // 1e: fadd
      // 1f: f2d
      // 20: invokestatic java/lang/Math.toRadians (D)D
      // 23: invokestatic java/lang/Math.cos (D)D
      // 26: dmul
      // 27: dload 6
      // 29: dload 1
      // 2a: dmul
      // 2b: fload 8
      // 2d: ldc 90.0
      // 2f: nop
      // 30: fadd
      // 31: f2d
      // 32: invokestatic java/lang/Math.toRadians (D)D
      // 35: invokestatic java/lang/Math.sin (D)D
      // 38: dmul
      // 39: dadd
      // 3a: invokevirtual _qa.oz6 (D)V
      // 3d: istore 3
      // 3e: aload 0
      // 3f: dload 4
      // 41: dload 1
      // 42: dmul
      // 43: fload 8
      // 45: ldc 90.0
      // 47: nop
      // 48: fadd
      // 49: f2d
      // 4a: invokestatic java/lang/Math.toRadians (D)D
      // 4d: invokestatic java/lang/Math.sin (D)D
      // 50: dmul
      // 51: dload 6
      // 53: dload 1
      // 54: dmul
      // 55: fload 8
      // 57: ldc 90.0
      // 59: nop
      // 5a: fadd
      // 5b: f2d
      // 5c: invokestatic java/lang/Math.toRadians (D)D
      // 5f: invokestatic java/lang/Math.cos (D)D
      // 62: dmul
      // 63: dsub
      // 64: invokevirtual _qa.sqi (D)V
      // 67: getstatic ModuleRegistry.r0d Lvxv;
      // 6a: invokevirtual vxv.isEnabled ()Z
      // 6d: ifeq b6
      // 70: getstatic KillAura.kfa Lg_3;
      // 73: iload 3
      // 74: ifeq 8b
      // 77: goto 7e
      // 7a: invokestatic Speed.a (Loov;)Loov;
      // 7d: athrow
      // 7e: ifnull b6
      // 81: goto 88
      // 84: invokestatic Speed.a (Loov;)Loov;
      // 87: athrow
      // 88: getstatic KillAura.kfa Lg_3;
      // 8b: getstatic Speed.ek1 Lc05;
      // 8e: getfield Minecraft.vg8 Ll86;
      // 91: invokevirtual Entity.tm6 (Li2h;)F
      // 94: getstatic ModuleRegistry.r0d Lvxv;
      // 97: pop
      // 98: getstatic vxv.khf Lcrk;
      // 9b: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 9e: invokevirtual java/lang/Float.floatValue ()F
      // a1: fcmpg
      // a2: ifgt b6
      // a5: getstatic ModuleRegistry.r0d Lvxv;
      // a8: pop
      // a9: aload 0
      // aa: dload 1
      // ab: getstatic KillAura.kfa Lg_3;
      // ae: invokestatic vxv.kax (L_qa;DLi2h;)V
      // b1: return
      // b2: invokestatic Speed.a (Loov;)Loov;
      // b5: athrow
      // b6: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6678047089483248065L, 6377543673892262126L, MethodHandles.lookup().lookupClass()).a(17653171989332L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 14033611620056L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "ÕÅ°{\fÅíóïÆÍ(ðP¾b 6\u0082×T\u0091è¤Ù)tÌ\f$lrj,Ç\u00152&\u0081Ãì\u0088\u0004Ö«\u0099yt\u0017 rõs¸\u0011CK\"\u008a\u0013et5ÙÛs\u000f×>÷¿ìDmç1¬\u0099q¼#¾ 6Ü\u0087C\u009fY\u001bÆb0å|\b\u0012ðsÈ\u0099\u001c3|Ï\u0010\u009cÙ&2\u008cüï\u008d\n(^Å~¶7I=\u0000\\ï¤ø\u0086¹\u009c$Q¿\u0098!Ú!úx\u0013t\u0099?cö\u0018ÉI\u0004ð\f\u0010ª\u0000¤\u0010z1ê\"\u0015¹Âó\u009b\rQäêÏqe";
      int var6 = "ÕÅ°{\fÅíóïÆÍ(ðP¾b 6\u0082×T\u0091è¤Ù)tÌ\f$lrj,Ç\u00152&\u0081Ãì\u0088\u0004Ö«\u0099yt\u0017 rõs¸\u0011CK\"\u008a\u0013et5ÙÛs\u000f×>÷¿ìDmç1¬\u0099q¼#¾ 6Ü\u0087C\u009fY\u001bÆb0å|\b\u0012ðsÈ\u0099\u001c3|Ï\u0010\u009cÙ&2\u008cüï\u008d\n(^Å~¶7I=\u0000\\ï¤ø\u0086¹\u009c$Q¿\u0098!Ú!úx\u0013t\u0099?cö\u0018ÉI\u0004ð\f\u0010ª\u0000¤\u0010z1ê\"\u0015¹Âó\u009b\rQäêÏqe"
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
                     g = new String[8];
                     dcr = new NumberSetting(b<"i">(28905, 5308827805788548941L ^ var9), b<"i">(11710, 8294093349732512285L ^ var9), 1.5F, 0.1F, 5.0F, 0.1F);
                     gam = new BooleanSetting(b<"i">(13412, 2252201125421181891L ^ var9), b<"i">(28248, 8608594876001038840L ^ var9), true);
                     fvs = new BooleanSetting(b<"i">(13412, 2252201125421181891L ^ var9), b<"i">(28961, 8491786041904606852L ^ var9), true);
                     ebv = new BooleanSetting(b<"i">(13412, 2252201125421181891L ^ var9), b<"i">(27325, 7341545564528227612L ^ var9), true);
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

                  var4 = "yR©ðKE\u001cK\u0018vsþ\u008a©97 `åa4ÍJ\u0006Ì?\u0011\u000e\u0082\u00134¤ñ×\u008d±_\u009e\u007fÚ\u000fÎ>»µ\u0086õÒe";
                  var6 = "yR©ðKE\u001cK\u0018vsþ\u008a©97 `åa4ÍJ\u0006Ì?\u0011\u000e\u0082\u00134¤ñ×\u008d±_\u009e\u007fÚ\u000fÎ>»µ\u0086õÒe".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6198;
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
            throw new RuntimeException("Speed", var10);
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
         throw new RuntimeException("Speed" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
