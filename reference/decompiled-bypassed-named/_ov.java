import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class _ov extends ShaderHelper {
   private static final Logger wgw;
   private String qxv = "";
   private int mu5 = -1;
   private boolean q20;
   private boolean o1f;
   private int qp0;
   private List w2d = Lists.newArrayList();
   public jqk i7w;
   private boolean rvb;
   private int BooleanSetting;
   private int cgb;
   private String jgp = "";
   private static final long a;
   private static final String g;

   public _ov() {
   }

   public _ov(String var1) {
      this.jgp = var1;
   }

   @Override
   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.mu5 = this.f41.t43.lcg().nt9().size();
      this.i7w = new jqk(0, this.fex, 4, this.o1e - 12, this.dt7 - 4, 12);
      this.i7w.z5t(100);
      this.i7w.tge(false);
      this.i7w._c6(true);
      this.i7w.nrl(this.jgp);
      this.i7w.rca(false);
   }

   @Override
   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
      this.f41.t43.lcg().f7w();
   }

   @Override
   public void updateScreen() {
      this.i7w.zf9();
   }

   @Override
   public void dig(char param1, int param2) {
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
      // 005: bipush 0
      // 006: iload 3
      // 007: ifne 032
      // 00a: putfield _ov.o1f Z
      // 00d: iload 2
      // 00e: bipush 15
      // 010: if_icmpne 029
      // 013: goto 01a
      // 016: invokestatic _ov.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 0
      // 01b: invokevirtual _ov.mje ()V
      // 01e: iload 3
      // 01f: ifeq 035
      // 022: goto 029
      // 025: invokestatic _ov.a (Loov;)Loov;
      // 028: athrow
      // 029: aload 0
      // 02a: bipush 0
      // 02b: goto 032
      // 02e: invokestatic _ov.a (Loov;)Loov;
      // 031: athrow
      // 032: putfield _ov.q20 Z
      // 035: iload 2
      // 036: bipush 1
      // 037: iload 3
      // 038: ifne 065
      // 03b: if_icmpne 05b
      // 03e: goto 045
      // 041: invokestatic _ov.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: getfield _ov.f41 Lc05;
      // 049: aconst_null
      // 04a: checkcast ShaderHelper
      // 04d: invokevirtual Minecraft.z2i (Lgbe;)V
      // 050: iload 3
      // 051: ifeq 1a0
      // 054: goto 05b
      // 057: invokestatic _ov.a (Loov;)Loov;
      // 05a: athrow
      // 05b: iload 2
      // 05c: bipush 28
      // 05e: goto 065
      // 061: invokestatic _ov.a (Loov;)Loov;
      // 064: athrow
      // 065: iload 3
      // 066: ifne 07e
      // 069: if_icmpeq 174
      // 06c: goto 073
      // 06f: invokestatic _ov.a (Loov;)Loov;
      // 072: athrow
      // 073: iload 2
      // 074: sipush 156
      // 077: goto 07e
      // 07a: invokestatic _ov.a (Loov;)Loov;
      // 07d: athrow
      // 07e: iload 3
      // 07f: ifne 097
      // 082: if_icmpeq 174
      // 085: goto 08c
      // 088: invokestatic _ov.a (Loov;)Loov;
      // 08b: athrow
      // 08c: iload 2
      // 08d: sipush 200
      // 090: goto 097
      // 093: invokestatic _ov.a (Loov;)Loov;
      // 096: athrow
      // 097: iload 3
      // 098: ifne 0c0
      // 09b: if_icmpne 0b5
      // 09e: goto 0a5
      // 0a1: invokestatic _ov.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: bipush -1
      // 0a7: invokevirtual _ov.bbq (I)V
      // 0aa: iload 3
      // 0ab: ifeq 1a0
      // 0ae: goto 0b5
      // 0b1: invokestatic _ov.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: iload 2
      // 0b6: sipush 208
      // 0b9: goto 0c0
      // 0bc: invokestatic _ov.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: iload 3
      // 0c1: ifne 0e9
      // 0c4: if_icmpne 0de
      // 0c7: goto 0ce
      // 0ca: invokestatic _ov.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: bipush 1
      // 0d0: invokevirtual _ov.bbq (I)V
      // 0d3: iload 3
      // 0d4: ifeq 1a0
      // 0d7: goto 0de
      // 0da: invokestatic _ov.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: iload 2
      // 0df: sipush 201
      // 0e2: goto 0e9
      // 0e5: invokestatic _ov.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: iload 3
      // 0ea: ifne 134
      // 0ed: if_icmpne 11e
      // 0f0: goto 0f7
      // 0f3: invokestatic _ov.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: getfield _ov.f41 Lc05;
      // 0fb: getfield Minecraft.t43 Ld1f;
      // 0fe: invokevirtual d1f.lcg ()Lsxg;
      // 101: aload 0
      // 102: getfield _ov.f41 Lc05;
      // 105: getfield Minecraft.t43 Ld1f;
      // 108: invokevirtual d1f.lcg ()Lsxg;
      // 10b: invokevirtual sxg.gij ()I
      // 10e: bipush 1
      // 10f: isub
      // 110: invokevirtual sxg.bmo (I)V
      // 113: iload 3
      // 114: ifeq 1a0
      // 117: goto 11e
      // 11a: invokestatic _ov.a (Loov;)Loov;
      // 11d: athrow
      // 11e: iload 2
      // 11f: iload 3
      // 120: ifne 16f
      // 123: goto 12a
      // 126: invokestatic _ov.a (Loov;)Loov;
      // 129: athrow
      // 12a: sipush 209
      // 12d: goto 134
      // 130: invokestatic _ov.a (Loov;)Loov;
      // 133: athrow
      // 134: if_icmpne 15f
      // 137: aload 0
      // 138: getfield _ov.f41 Lc05;
      // 13b: getfield Minecraft.t43 Ld1f;
      // 13e: invokevirtual d1f.lcg ()Lsxg;
      // 141: aload 0
      // 142: getfield _ov.f41 Lc05;
      // 145: getfield Minecraft.t43 Ld1f;
      // 148: invokevirtual d1f.lcg ()Lsxg;
      // 14b: invokevirtual sxg.gij ()I
      // 14e: ineg
      // 14f: bipush 1
      // 150: iadd
      // 151: invokevirtual sxg.bmo (I)V
      // 154: iload 3
      // 155: ifeq 1a0
      // 158: goto 15f
      // 15b: invokestatic _ov.a (Loov;)Loov;
      // 15e: athrow
      // 15f: aload 0
      // 160: getfield _ov.i7w Ljqk;
      // 163: iload 1
      // 164: iload 2
      // 165: invokevirtual jqk.pst (CI)Z
      // 168: goto 16f
      // 16b: invokestatic _ov.a (Loov;)Loov;
      // 16e: athrow
      // 16f: pop
      // 170: iload 3
      // 171: ifeq 1a0
      // 174: aload 0
      // 175: getfield _ov.i7w Ljqk;
      // 178: invokevirtual jqk.xct ()Ljava/lang/String;
      // 17b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 17e: astore 4
      // 180: aload 4
      // 182: invokevirtual java/lang/String.length ()I
      // 185: ifle 195
      // 188: aload 0
      // 189: aload 4
      // 18b: invokevirtual _ov.sendChatMessage (Ljava/lang/String;)V
      // 18e: goto 195
      // 191: invokestatic _ov.a (Loov;)Loov;
      // 194: athrow
      // 195: aload 0
      // 196: getfield _ov.f41 Lc05;
      // 199: aconst_null
      // 19a: checkcast ShaderHelper
      // 19d: invokevirtual Minecraft.z2i (Lgbe;)V
      // 1a0: return
   }

   @Override
   public void handleMouseInput() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial ShaderHelper.handleMouseInput ()V
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: invokestatic org/lwjgl/input/Mouse.getEventDWheel ()I
      // 0a: istore 2
      // 0b: istore 1
      // 0c: iload 2
      // 0d: iload 1
      // 0e: ifne 1c
      // 11: ifeq 6a
      // 14: goto 1b
      // 17: invokestatic _ov.a (Loov;)Loov;
      // 1a: athrow
      // 1b: iload 2
      // 1c: bipush 1
      // 1d: iload 1
      // 1e: ifne 3a
      // 21: if_icmple 2d
      // 24: goto 2b
      // 27: invokestatic _ov.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 1
      // 2c: istore 2
      // 2d: iload 2
      // 2e: iload 1
      // 2f: ifne 42
      // 32: bipush -1
      // 33: goto 3a
      // 36: invokestatic _ov.a (Loov;)Loov;
      // 39: athrow
      // 3a: if_icmpge 3f
      // 3d: bipush -1
      // 3e: istore 2
      // 3f: invokestatic _ov.dmk ()Z
      // 42: iload 1
      // 43: ifne 5b
      // 46: ifne 5c
      // 49: goto 50
      // 4c: invokestatic _ov.a (Loov;)Loov;
      // 4f: athrow
      // 50: iload 2
      // 51: bipush 7
      // 53: imul
      // 54: goto 5b
      // 57: invokestatic _ov.a (Loov;)Loov;
      // 5a: athrow
      // 5b: istore 2
      // 5c: aload 0
      // 5d: getfield _ov.f41 Lc05;
      // 60: getfield Minecraft.t43 Ld1f;
      // 63: invokevirtual d1f.lcg ()Lsxg;
      // 66: iload 2
      // 67: invokevirtual sxg.bmo (I)V
      // 6a: return
   }

   @Override
   public void mouseClicked(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: iload 3
      // 06: ifne 38
      // 09: aload 0
      // 0a: getfield _ov.f41 Lc05;
      // 0d: getfield Minecraft.t43 Ld1f;
      // 10: invokevirtual d1f.lcg ()Lsxg;
      // 13: invokestatic org/lwjgl/input/Mouse.getX ()I
      // 16: invokestatic org/lwjgl/input/Mouse.getY ()I
      // 19: invokevirtual sxg.r7v (II)Lekw;
      // 1c: astore 5
      // 1e: aload 0
      // 1f: iload 4
      // 21: ifne 43
      // 24: aload 5
      // 26: invokevirtual _ov.owq (Lekw;)Z
      // 29: ifeq 38
      // 2c: goto 33
      // 2f: invokestatic _ov.a (Loov;)Loov;
      // 32: athrow
      // 33: return
      // 34: invokestatic _ov.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield _ov.i7w Ljqk;
      // 3c: iload 1
      // 3d: iload 2
      // 3e: iload 3
      // 3f: invokevirtual jqk.elk (III)V
      // 42: aload 0
      // 43: iload 1
      // 44: iload 2
      // 45: iload 3
      // 46: invokespecial ShaderHelper.mouseClicked (III)V
      // 49: return
   }

   @Override
   public void rzw(String param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: ifeq 1b
      // 08: aload 0
      // 09: getfield _ov.i7w Ljqk;
      // 0c: aload 1
      // 0d: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 10: iload 3
      // 11: ifne 2a
      // 14: goto 1b
      // 17: invokestatic _ov.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield _ov.i7w Ljqk;
      // 1f: aload 1
      // 20: invokevirtual jqk.efs (Ljava/lang/String;)V
      // 23: goto 2a
      // 26: invokestatic _ov.a (Loov;)Loov;
      // 29: athrow
      // 2a: return
   }

   public void mje() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic _ov.a J
      // 003: ldc2_w 44879373013419
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield _ov.q20 Z
      // 010: iload 3
      // 011: ifne 086
      // 014: ifeq 06f
      // 017: goto 01e
      // 01a: invokestatic _ov.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: getfield _ov.i7w Ljqk;
      // 022: aload 0
      // 023: getfield _ov.i7w Ljqk;
      // 026: bipush -1
      // 027: aload 0
      // 028: getfield _ov.i7w Ljqk;
      // 02b: invokevirtual jqk.jyp ()I
      // 02e: bipush 0
      // 02f: invokevirtual jqk.q6z (IIZ)I
      // 032: aload 0
      // 033: getfield _ov.i7w Ljqk;
      // 036: invokevirtual jqk.jyp ()I
      // 039: isub
      // 03a: invokevirtual jqk.kzc (I)V
      // 03d: aload 0
      // 03e: getfield _ov.qp0 I
      // 041: aload 0
      // 042: getfield _ov.w2d Ljava/util/List;
      // 045: invokeinterface java/util/List.size ()I 1
      // 04a: iload 3
      // 04b: ifne 10a
      // 04e: goto 055
      // 051: invokestatic _ov.a (Loov;)Loov;
      // 054: athrow
      // 055: if_icmplt 0f5
      // 058: goto 05f
      // 05b: invokestatic _ov.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: bipush 0
      // 061: putfield _ov.qp0 I
      // 064: iload 3
      // 065: ifeq 0f5
      // 068: goto 06f
      // 06b: invokestatic _ov.a (Loov;)Loov;
      // 06e: athrow
      // 06f: aload 0
      // 070: getfield _ov.i7w Ljqk;
      // 073: bipush -1
      // 074: aload 0
      // 075: getfield _ov.i7w Ljqk;
      // 078: invokevirtual jqk.jyp ()I
      // 07b: bipush 0
      // 07c: invokevirtual jqk.q6z (IIZ)I
      // 07f: goto 086
      // 082: invokestatic _ov.a (Loov;)Loov;
      // 085: athrow
      // 086: istore 4
      // 088: aload 0
      // 089: getfield _ov.w2d Ljava/util/List;
      // 08c: invokeinterface java/util/List.clear ()V 1
      // 091: aload 0
      // 092: bipush 0
      // 093: putfield _ov.qp0 I
      // 096: aload 0
      // 097: getfield _ov.i7w Ljqk;
      // 09a: invokevirtual jqk.xct ()Ljava/lang/String;
      // 09d: iload 4
      // 09f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0a2: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0a5: astore 5
      // 0a7: aload 0
      // 0a8: getfield _ov.i7w Ljqk;
      // 0ab: invokevirtual jqk.xct ()Ljava/lang/String;
      // 0ae: bipush 0
      // 0af: aload 0
      // 0b0: getfield _ov.i7w Ljqk;
      // 0b3: invokevirtual jqk.jyp ()I
      // 0b6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0b9: astore 6
      // 0bb: aload 0
      // 0bc: aload 6
      // 0be: aload 5
      // 0c0: invokespecial _ov.xyh (Ljava/lang/String;Ljava/lang/String;)V
      // 0c3: aload 0
      // 0c4: iload 3
      // 0c5: ifne 0e5
      // 0c8: getfield _ov.w2d Ljava/util/List;
      // 0cb: invokeinterface java/util/List.isEmpty ()Z 1
      // 0d0: ifeq 0df
      // 0d3: goto 0da
      // 0d6: invokestatic _ov.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: return
      // 0db: invokestatic _ov.a (Loov;)Loov;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: bipush 1
      // 0e1: putfield _ov.q20 Z
      // 0e4: aload 0
      // 0e5: getfield _ov.i7w Ljqk;
      // 0e8: iload 4
      // 0ea: aload 0
      // 0eb: getfield _ov.i7w Ljqk;
      // 0ee: invokevirtual jqk.jyp ()I
      // 0f1: isub
      // 0f2: invokevirtual jqk.kzc (I)V
      // 0f5: aload 0
      // 0f6: iload 3
      // 0f7: ifne 18d
      // 0fa: getfield _ov.w2d Ljava/util/List;
      // 0fd: invokeinterface java/util/List.size ()I 1
      // 102: bipush 1
      // 103: goto 10a
      // 106: invokestatic _ov.a (Loov;)Loov;
      // 109: athrow
      // 10a: if_icmple 18c
      // 10d: new java/lang/StringBuilder
      // 110: dup
      // 111: invokespecial java/lang/StringBuilder.<init> ()V
      // 114: astore 4
      // 116: aload 0
      // 117: getfield _ov.w2d Ljava/util/List;
      // 11a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11f: astore 5
      // 121: aload 5
      // 123: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 128: ifeq 172
      // 12b: aload 5
      // 12d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 132: checkcast java/lang/String
      // 135: astore 6
      // 137: iload 3
      // 138: ifne 1aa
      // 13b: aload 4
      // 13d: iload 3
      // 13e: ifne 16d
      // 141: goto 148
      // 144: invokestatic _ov.a (Loov;)Loov;
      // 147: athrow
      // 148: invokevirtual java/lang/StringBuilder.length ()I
      // 14b: ifle 166
      // 14e: goto 155
      // 151: invokestatic _ov.a (Loov;)Loov;
      // 154: athrow
      // 155: aload 4
      // 157: getstatic _ov.g Ljava/lang/String;
      // 15a: nop
      // 15b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15e: pop
      // 15f: goto 166
      // 162: invokestatic _ov.a (Loov;)Loov;
      // 165: athrow
      // 166: aload 4
      // 168: aload 6
      // 16a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16d: pop
      // 16e: iload 3
      // 16f: ifeq 121
      // 172: aload 0
      // 173: getfield _ov.f41 Lc05;
      // 176: getfield Minecraft.t43 Ld1f;
      // 179: invokevirtual d1f.lcg ()Lsxg;
      // 17c: new tao
      // 17f: dup
      // 180: aload 4
      // 182: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 185: invokespecial tao.<init> (Ljava/lang/String;)V
      // 188: bipush 1
      // 189: invokevirtual sxg.xkx (Lekw;I)V
      // 18c: aload 0
      // 18d: getfield _ov.i7w Ljqk;
      // 190: aload 0
      // 191: getfield _ov.w2d Ljava/util/List;
      // 194: aload 0
      // 195: dup
      // 196: getfield _ov.qp0 I
      // 199: dup_x1
      // 19a: bipush 1
      // 19b: iadd
      // 19c: putfield _ov.qp0 I
      // 19f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1a4: checkcast java/lang/String
      // 1a7: invokevirtual jqk.efs (Ljava/lang/String;)V
      // 1aa: return
   }

   private void xyh(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual java/lang/String.length ()I
      // 08: bipush 1
      // 09: if_icmplt 75
      // 0c: aconst_null
      // 0d: astore 4
      // 0f: aload 0
      // 10: getfield _ov.f41 Lc05;
      // 13: getfield Minecraft.dzk Lakm;
      // 16: iload 3
      // 17: ifne 32
      // 1a: ifnull 59
      // 1d: goto 24
      // 20: invokestatic _ov.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield _ov.f41 Lc05;
      // 28: getfield Minecraft.dzk Lakm;
      // 2b: goto 32
      // 2e: invokestatic _ov.a (Loov;)Loov;
      // 31: athrow
      // 32: iload 3
      // 33: ifne 54
      // 36: getfield akm.oyz Lakm$qs6;
      // 39: getstatic akm$qs6.i4l Lakm$qs6;
      // 3c: if_acmpne 59
      // 3f: goto 46
      // 42: invokestatic _ov.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: getfield _ov.f41 Lc05;
      // 4a: getfield Minecraft.dzk Lakm;
      // 4d: goto 54
      // 50: invokestatic _ov.a (Loov;)Loov;
      // 53: athrow
      // 54: invokevirtual akm._uf ()Lmew;
      // 57: astore 4
      // 59: aload 0
      // 5a: getfield _ov.f41 Lc05;
      // 5d: getfield Minecraft.vg8 Ll86;
      // 60: getfield EntityPlayerSP.lq7 Lp_k;
      // 63: new net/minecraft/network/play/client/C14PacketTabComplete
      // 66: dup
      // 67: aload 1
      // 68: aload 4
      // 6a: invokespecial net/minecraft/network/play/client/C14PacketTabComplete.<init> (Ljava/lang/String;Lmew;)V
      // 6d: invokevirtual p_k.sxi (Lmz2;)V
      // 70: aload 0
      // 71: bipush 1
      // 72: putfield _ov.o1f Z
      // 75: return
   }

   public void bbq(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield _ov.mu5 I
      // 04: iload 1
      // 05: iadd
      // 06: istore 3
      // 07: aload 0
      // 08: getfield _ov.f41 Lc05;
      // 0b: getfield Minecraft.t43 Ld1f;
      // 0e: invokevirtual d1f.lcg ()Lsxg;
      // 11: invokevirtual sxg.nt9 ()Ljava/util/List;
      // 14: invokeinterface java/util/List.size ()I 1
      // 19: istore 4
      // 1b: invokestatic OpaquePredicate.b ()I
      // 1e: iload 3
      // 1f: bipush 0
      // 20: iload 4
      // 22: invokestatic fe6.faa (III)I
      // 25: istore 3
      // 26: istore 2
      // 27: iload 3
      // 28: aload 0
      // 29: getfield _ov.mu5 I
      // 2c: iload 2
      // 2d: ifeq 44
      // 30: if_icmpeq bd
      // 33: goto 3a
      // 36: invokestatic _ov.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 3
      // 3b: iload 4
      // 3d: goto 44
      // 40: invokestatic _ov.a (Loov;)Loov;
      // 43: athrow
      // 44: iload 2
      // 45: ifeq 86
      // 48: if_icmpne 6e
      // 4b: goto 52
      // 4e: invokestatic _ov.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: iload 4
      // 55: putfield _ov.mu5 I
      // 58: aload 0
      // 59: getfield _ov.i7w Ljqk;
      // 5c: aload 0
      // 5d: getfield _ov.qxv Ljava/lang/String;
      // 60: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 63: iload 2
      // 64: ifne bd
      // 67: goto 6e
      // 6a: invokestatic _ov.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 0
      // 6f: iload 2
      // 70: ifeq b9
      // 73: goto 7a
      // 76: invokestatic _ov.a (Loov;)Loov;
      // 79: athrow
      // 7a: getfield _ov.mu5 I
      // 7d: iload 4
      // 7f: goto 86
      // 82: invokestatic _ov.a (Loov;)Loov;
      // 85: athrow
      // 86: if_icmpne 9b
      // 89: aload 0
      // 8a: aload 0
      // 8b: getfield _ov.i7w Ljqk;
      // 8e: invokevirtual jqk.xct ()Ljava/lang/String;
      // 91: putfield _ov.qxv Ljava/lang/String;
      // 94: goto 9b
      // 97: invokestatic _ov.a (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 0
      // 9c: getfield _ov.i7w Ljqk;
      // 9f: aload 0
      // a0: getfield _ov.f41 Lc05;
      // a3: getfield Minecraft.t43 Ld1f;
      // a6: invokevirtual d1f.lcg ()Lsxg;
      // a9: invokevirtual sxg.nt9 ()Ljava/util/List;
      // ac: iload 3
      // ad: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // b2: checkcast java/lang/String
      // b5: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // b8: aload 0
      // b9: iload 3
      // ba: putfield _ov.mu5 I
      // bd: return
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fconst_2
      // 01: aload 0
      // 02: getfield _ov.o1e I
      // 05: bipush 14
      // 07: isub
      // 08: i2f
      // 09: aload 0
      // 0a: getfield _ov.dt7 I
      // 0d: bipush 2
      // 0e: isub
      // 0f: i2f
      // 10: aload 0
      // 11: getfield _ov.o1e I
      // 14: bipush 2
      // 15: isub
      // 16: i2f
      // 17: ldc -2147483648
      // 19: nop
      // 1a: invokestatic _ov.df9 (FFFFI)V
      // 1d: invokestatic OpaquePredicate.c ()I
      // 20: aload 0
      // 21: getfield _ov.i7w Ljqk;
      // 24: invokevirtual jqk.dy2 ()V
      // 27: istore 4
      // 29: aload 0
      // 2a: getfield _ov.f41 Lc05;
      // 2d: getfield Minecraft.t43 Ld1f;
      // 30: invokevirtual d1f.lcg ()Lsxg;
      // 33: invokestatic org/lwjgl/input/Mouse.getX ()I
      // 36: invokestatic org/lwjgl/input/Mouse.getY ()I
      // 39: invokevirtual sxg.r7v (II)Lekw;
      // 3c: astore 5
      // 3e: iload 4
      // 40: ifne 79
      // 43: aload 5
      // 45: ifnull 72
      // 48: goto 4f
      // 4b: invokestatic _ov.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 5
      // 51: invokeinterface ekw.f4q ()Lpoy; 1
      // 56: invokevirtual poy.rmx ()Lxq3;
      // 59: ifnull 72
      // 5c: goto 63
      // 5f: invokestatic _ov.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: aload 5
      // 66: iload 1
      // 67: iload 2
      // 68: invokevirtual _ov.p0k (Lekw;II)V
      // 6b: goto 72
      // 6e: invokestatic _ov.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: iload 1
      // 74: iload 2
      // 75: fload 3
      // 76: invokespecial ShaderHelper.drawScreen (IIF)V
      // 79: return
   }

   public void cpv(String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 023
      // 009: getfield _ov.o1f Z
      // 00c: ifeq 129
      // 00f: goto 016
      // 012: invokestatic _ov.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: bipush 0
      // 018: putfield _ov.q20 Z
      // 01b: aload 0
      // 01c: goto 023
      // 01f: invokestatic _ov.a (Loov;)Loov;
      // 022: athrow
      // 023: getfield _ov.w2d Ljava/util/List;
      // 026: invokeinterface java/util/List.clear ()V 1
      // 02b: aload 1
      // 02c: astore 3
      // 02d: aload 3
      // 02e: arraylength
      // 02f: istore 4
      // 031: bipush 0
      // 032: istore 5
      // 034: iload 5
      // 036: iload 4
      // 038: if_icmpge 079
      // 03b: aload 3
      // 03c: iload 5
      // 03e: aaload
      // 03f: astore 6
      // 041: iload 2
      // 042: ifne 075
      // 045: aload 6
      // 047: iload 2
      // 048: ifne 093
      // 04b: goto 052
      // 04e: invokestatic _ov.a (Loov;)Loov;
      // 051: athrow
      // 052: invokevirtual java/lang/String.length ()I
      // 055: ifle 072
      // 058: goto 05f
      // 05b: invokestatic _ov.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield _ov.w2d Ljava/util/List;
      // 063: aload 6
      // 065: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 06a: pop
      // 06b: goto 072
      // 06e: invokestatic _ov.a (Loov;)Loov;
      // 071: athrow
      // 072: iinc 5 1
      // 075: iload 2
      // 076: ifeq 034
      // 079: aload 0
      // 07a: getfield _ov.i7w Ljqk;
      // 07d: invokevirtual jqk.xct ()Ljava/lang/String;
      // 080: aload 0
      // 081: getfield _ov.i7w Ljqk;
      // 084: bipush -1
      // 085: aload 0
      // 086: getfield _ov.i7w Ljqk;
      // 089: invokevirtual jqk.jyp ()I
      // 08c: bipush 0
      // 08d: invokevirtual jqk.q6z (IIZ)I
      // 090: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 093: astore 3
      // 094: aload 1
      // 095: invokestatic org/apache/commons/lang3/StringUtils.getCommonPrefix ([Ljava/lang/String;)Ljava/lang/String;
      // 098: astore 4
      // 09a: aload 4
      // 09c: invokevirtual java/lang/String.length ()I
      // 09f: iload 2
      // 0a0: ifne 116
      // 0a3: ifle 0fb
      // 0a6: goto 0ad
      // 0a9: invokestatic _ov.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 3
      // 0ae: aload 4
      // 0b0: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0b3: iload 2
      // 0b4: ifne 116
      // 0b7: goto 0be
      // 0ba: invokestatic _ov.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: ifne 0fb
      // 0c1: goto 0c8
      // 0c4: invokestatic _ov.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield _ov.i7w Ljqk;
      // 0cc: aload 0
      // 0cd: getfield _ov.i7w Ljqk;
      // 0d0: bipush -1
      // 0d1: aload 0
      // 0d2: getfield _ov.i7w Ljqk;
      // 0d5: invokevirtual jqk.jyp ()I
      // 0d8: bipush 0
      // 0d9: invokevirtual jqk.q6z (IIZ)I
      // 0dc: aload 0
      // 0dd: getfield _ov.i7w Ljqk;
      // 0e0: invokevirtual jqk.jyp ()I
      // 0e3: isub
      // 0e4: invokevirtual jqk.kzc (I)V
      // 0e7: aload 0
      // 0e8: getfield _ov.i7w Ljqk;
      // 0eb: aload 4
      // 0ed: invokevirtual jqk.efs (Ljava/lang/String;)V
      // 0f0: iload 2
      // 0f1: ifeq 129
      // 0f4: goto 0fb
      // 0f7: invokestatic _ov.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: iload 2
      // 0fd: ifne 126
      // 100: goto 107
      // 103: invokestatic _ov.a (Loov;)Loov;
      // 106: athrow
      // 107: getfield _ov.w2d Ljava/util/List;
      // 10a: invokeinterface java/util/List.size ()I 1
      // 10f: goto 116
      // 112: invokestatic _ov.a (Loov;)Loov;
      // 115: athrow
      // 116: ifle 129
      // 119: aload 0
      // 11a: bipush 1
      // 11b: putfield _ov.q20 Z
      // 11e: aload 0
      // 11f: goto 126
      // 122: invokestatic _ov.a (Loov;)Loov;
      // 125: athrow
      // 126: invokevirtual _ov.mje ()V
      // 129: return
   }

   @Override
   public boolean a99() {
      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8663459784255446520L, 1643190109845404872L, MethodHandles.lookup().lookupClass()).a(194783405400858L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 92125900923858L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u000fo\u000bâÖL¯¼".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      g = var6;
      wgw = LogManager.getLogger();
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
}
