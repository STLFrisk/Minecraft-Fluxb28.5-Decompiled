import com.google.common.base.Predicate;
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
import org.lwjgl.input.Keyboard;

public class xf8 extends ShaderHelper {
   private final ShaderHelper b8z;
   private final r1l ijf;
   private jqk p19;
   private jqk b0z;
   private gt4 s51;
   private Predicate mgi = new xf8$1(this);
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public xf8(ShaderHelper var1, r1l var2) {
      this.b8z = var1;
      this.ijf = var2;
   }

   @Override
   public void updateScreen() {
      this.b0z.zf9();
      this.p19.zf9();
   }

   @Override
   public void initGui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic xf8.a J
      // 003: ldc2_w 128738220083433
      // 006: lxor
      // 007: lstore 1
      // 008: bipush 1
      // 009: invokestatic org/lwjgl/input/Keyboard.enableRepeatEvents (Z)V
      // 00c: invokestatic OpaquePredicate.c ()I
      // 00f: aload 0
      // 010: getfield xf8.khf Ljava/util/List;
      // 013: invokeinterface java/util/List.clear ()V 1
      // 018: istore 3
      // 019: aload 0
      // 01a: getfield xf8.khf Ljava/util/List;
      // 01d: new gt4
      // 020: dup
      // 021: bipush 0
      // 022: aload 0
      // 023: getfield xf8.dt7 I
      // 026: bipush 2
      // 027: idiv
      // 028: bipush 100
      // 02a: isub
      // 02b: aload 0
      // 02c: getfield xf8.o1e I
      // 02f: bipush 4
      // 030: idiv
      // 031: bipush 96
      // 033: iadd
      // 034: bipush 18
      // 036: iadd
      // 037: sipush 22771
      // 03a: ldc2_w 1722245530538136648
      // 03d: lload 1
      // 03e: lxor
      // 03f: invokedynamic c (IJ)Ljava/lang/String; bsm=xf8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: nop
      // 045: bipush 0
      // 046: anewarray 86
      // 049: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 04c: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 04f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 054: pop
      // 055: aload 0
      // 056: getfield xf8.khf Ljava/util/List;
      // 059: new gt4
      // 05c: dup
      // 05d: bipush 1
      // 05e: aload 0
      // 05f: getfield xf8.dt7 I
      // 062: bipush 2
      // 063: idiv
      // 064: bipush 100
      // 066: isub
      // 067: aload 0
      // 068: getfield xf8.o1e I
      // 06b: bipush 4
      // 06c: idiv
      // 06d: bipush 120
      // 06f: iadd
      // 070: bipush 18
      // 072: iadd
      // 073: sipush 13763
      // 076: ldc2_w 244404286341986676
      // 079: lload 1
      // 07a: lxor
      // 07b: invokedynamic c (IJ)Ljava/lang/String; bsm=xf8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: nop
      // 081: bipush 0
      // 082: anewarray 86
      // 085: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 088: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 08b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 090: pop
      // 091: aload 0
      // 092: getfield xf8.khf Ljava/util/List;
      // 095: aload 0
      // 096: new gt4
      // 099: dup
      // 09a: bipush 2
      // 09b: aload 0
      // 09c: getfield xf8.dt7 I
      // 09f: bipush 2
      // 0a0: idiv
      // 0a1: bipush 100
      // 0a3: isub
      // 0a4: aload 0
      // 0a5: getfield xf8.o1e I
      // 0a8: bipush 4
      // 0a9: idiv
      // 0aa: bipush 72
      // 0ac: iadd
      // 0ad: new java/lang/StringBuilder
      // 0b0: dup
      // 0b1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b4: sipush 3719
      // 0b7: ldc2_w 6561394553994117682
      // 0ba: lload 1
      // 0bb: lxor
      // 0bc: invokedynamic c (IJ)Ljava/lang/String; bsm=xf8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: nop
      // 0c2: bipush 0
      // 0c3: anewarray 86
      // 0c6: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: sipush 18949
      // 0cf: ldc2_w 5470797137262364339
      // 0d2: lload 1
      // 0d3: lxor
      // 0d4: invokedynamic c (IJ)Ljava/lang/String; bsm=xf8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: nop
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: aload 0
      // 0de: getfield xf8.ijf Lr1l;
      // 0e1: invokevirtual r1l.u9n ()Lr1l$pyk;
      // 0e4: invokevirtual r1l$pyk.axp ()Lekw;
      // 0e7: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f2: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 0f5: dup_x1
      // 0f6: putfield xf8.s51 Lgt4;
      // 0f9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0fe: pop
      // 0ff: aload 0
      // 100: new jqk
      // 103: dup
      // 104: bipush 0
      // 105: aload 0
      // 106: getfield xf8.fex Lowt;
      // 109: aload 0
      // 10a: getfield xf8.dt7 I
      // 10d: bipush 2
      // 10e: idiv
      // 10f: bipush 100
      // 111: isub
      // 112: bipush 66
      // 114: sipush 200
      // 117: bipush 20
      // 119: invokespecial jqk.<init> (ILowt;IIII)V
      // 11c: putfield xf8.b0z Ljqk;
      // 11f: aload 0
      // 120: getfield xf8.b0z Ljqk;
      // 123: bipush 1
      // 124: invokevirtual jqk._c6 (Z)V
      // 127: aload 0
      // 128: getfield xf8.b0z Ljqk;
      // 12b: aload 0
      // 12c: getfield xf8.ijf Lr1l;
      // 12f: getfield r1l.bx0 Ljava/lang/String;
      // 132: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 135: aload 0
      // 136: new jqk
      // 139: dup
      // 13a: bipush 1
      // 13b: aload 0
      // 13c: getfield xf8.fex Lowt;
      // 13f: aload 0
      // 140: getfield xf8.dt7 I
      // 143: bipush 2
      // 144: idiv
      // 145: bipush 100
      // 147: isub
      // 148: bipush 106
      // 14a: sipush 200
      // 14d: bipush 20
      // 14f: invokespecial jqk.<init> (ILowt;IIII)V
      // 152: putfield xf8.p19 Ljqk;
      // 155: aload 0
      // 156: getfield xf8.p19 Ljqk;
      // 159: sipush 128
      // 15c: invokevirtual jqk.z5t (I)V
      // 15f: aload 0
      // 160: getfield xf8.p19 Ljqk;
      // 163: aload 0
      // 164: getfield xf8.ijf Lr1l;
      // 167: getfield r1l.s4c Ljava/lang/String;
      // 16a: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 16d: aload 0
      // 16e: getfield xf8.p19 Ljqk;
      // 171: aload 0
      // 172: getfield xf8.mgi Lcom/google/common/base/Predicate;
      // 175: invokevirtual jqk.m00 (Lcom/google/common/base/Predicate;)V
      // 178: aload 0
      // 179: getfield xf8.khf Ljava/util/List;
      // 17c: bipush 0
      // 17d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 182: checkcast gt4
      // 185: aload 0
      // 186: getfield xf8.p19 Ljqk;
      // 189: invokevirtual jqk.xct ()Ljava/lang/String;
      // 18c: invokevirtual java/lang/String.length ()I
      // 18f: iload 3
      // 190: ifne 1b2
      // 193: ifle 1e3
      // 196: goto 19d
      // 199: invokestatic xf8.a (Loov;)Loov;
      // 19c: athrow
      // 19d: aload 0
      // 19e: getfield xf8.p19 Ljqk;
      // 1a1: invokevirtual jqk.xct ()Ljava/lang/String;
      // 1a4: ldc ":"
      // 1a6: nop
      // 1a7: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 1aa: arraylength
      // 1ab: goto 1b2
      // 1ae: invokestatic xf8.a (Loov;)Loov;
      // 1b1: athrow
      // 1b2: iload 3
      // 1b3: ifne 1d1
      // 1b6: ifle 1e3
      // 1b9: goto 1c0
      // 1bc: invokestatic xf8.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: aload 0
      // 1c1: getfield xf8.b0z Ljqk;
      // 1c4: invokevirtual jqk.xct ()Ljava/lang/String;
      // 1c7: invokevirtual java/lang/String.length ()I
      // 1ca: goto 1d1
      // 1cd: invokestatic xf8.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: iload 3
      // 1d2: ifne 1e0
      // 1d5: ifle 1e3
      // 1d8: goto 1df
      // 1db: invokestatic xf8.a (Loov;)Loov;
      // 1de: athrow
      // 1df: bipush 1
      // 1e0: goto 1e4
      // 1e3: bipush 0
      // 1e4: putfield gt4.c9a Z
      // 1e7: return
   }

   @Override
   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic xf8.a J
      // 003: ldc2_w 26101781401970
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: getfield gt4.c9a Z
      // 011: iload 4
      // 013: ifeq 02b
      // 016: ifeq 119
      // 019: goto 020
      // 01c: invokestatic xf8.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 1
      // 021: getfield gt4._me I
      // 024: goto 02b
      // 027: invokestatic xf8.a (Loov;)Loov;
      // 02a: athrow
      // 02b: bipush 2
      // 02c: iload 4
      // 02e: ifeq 0c7
      // 031: if_icmpne 0af
      // 034: goto 03b
      // 037: invokestatic xf8.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield xf8.ijf Lr1l;
      // 03f: invokestatic r1l$pyk.values ()[Lr1l$pyk;
      // 042: aload 0
      // 043: getfield xf8.ijf Lr1l;
      // 046: invokevirtual r1l.u9n ()Lr1l$pyk;
      // 049: invokevirtual r1l$pyk.ordinal ()I
      // 04c: bipush 1
      // 04d: iadd
      // 04e: invokestatic r1l$pyk.values ()[Lr1l$pyk;
      // 051: arraylength
      // 052: irem
      // 053: aaload
      // 054: invokevirtual r1l.l69 (Lr1l$pyk;)V
      // 057: aload 0
      // 058: getfield xf8.s51 Lgt4;
      // 05b: new java/lang/StringBuilder
      // 05e: dup
      // 05f: invokespecial java/lang/StringBuilder.<init> ()V
      // 062: sipush 5640
      // 065: ldc2_w 7388078312733573922
      // 068: lload 2
      // 069: lxor
      // 06a: invokedynamic c (IJ)Ljava/lang/String; bsm=xf8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: nop
      // 070: bipush 0
      // 071: anewarray 86
      // 074: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 077: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07a: sipush 16840
      // 07d: ldc2_w 597285530741003491
      // 080: lload 2
      // 081: lxor
      // 082: invokedynamic c (IJ)Ljava/lang/String; bsm=xf8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: nop
      // 088: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08b: aload 0
      // 08c: getfield xf8.ijf Lr1l;
      // 08f: invokevirtual r1l.u9n ()Lr1l$pyk;
      // 092: invokevirtual r1l$pyk.axp ()Lekw;
      // 095: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a0: putfield gt4.frg Ljava/lang/String;
      // 0a3: iload 4
      // 0a5: ifne 119
      // 0a8: goto 0af
      // 0ab: invokestatic xf8.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 1
      // 0b0: getfield gt4._me I
      // 0b3: iload 4
      // 0b5: ifeq 0ea
      // 0b8: goto 0bf
      // 0bb: invokestatic xf8.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: bipush 1
      // 0c0: goto 0c7
      // 0c3: invokestatic xf8.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: if_icmpne 0df
      // 0ca: aload 0
      // 0cb: getfield xf8.b8z Lgbe;
      // 0ce: bipush 0
      // 0cf: bipush 0
      // 0d0: invokevirtual ShaderHelper.confirmClicked (ZI)V
      // 0d3: iload 4
      // 0d5: ifne 119
      // 0d8: goto 0df
      // 0db: invokestatic xf8.a (Loov;)Loov;
      // 0de: athrow
      // 0df: aload 1
      // 0e0: getfield gt4._me I
      // 0e3: goto 0ea
      // 0e6: invokestatic xf8.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: ifne 119
      // 0ed: aload 0
      // 0ee: getfield xf8.ijf Lr1l;
      // 0f1: aload 0
      // 0f2: getfield xf8.b0z Ljqk;
      // 0f5: invokevirtual jqk.xct ()Ljava/lang/String;
      // 0f8: putfield r1l.bx0 Ljava/lang/String;
      // 0fb: aload 0
      // 0fc: getfield xf8.ijf Lr1l;
      // 0ff: aload 0
      // 100: getfield xf8.p19 Ljqk;
      // 103: invokevirtual jqk.xct ()Ljava/lang/String;
      // 106: putfield r1l.s4c Ljava/lang/String;
      // 109: aload 0
      // 10a: getfield xf8.b8z Lgbe;
      // 10d: bipush 1
      // 10e: bipush 0
      // 10f: invokevirtual ShaderHelper.confirmClicked (ZI)V
      // 112: goto 119
      // 115: invokestatic xf8.a (Loov;)Loov;
      // 118: athrow
      // 119: return
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
      // 000: aload 0
      // 001: getfield xf8.b0z Ljqk;
      // 004: iload 1
      // 005: iload 2
      // 006: invokevirtual jqk.pst (CI)Z
      // 009: pop
      // 00a: invokestatic OpaquePredicate.c ()I
      // 00d: aload 0
      // 00e: getfield xf8.p19 Ljqk;
      // 011: iload 1
      // 012: iload 2
      // 013: invokevirtual jqk.pst (CI)Z
      // 016: pop
      // 017: istore 3
      // 018: iload 2
      // 019: bipush 15
      // 01b: iload 3
      // 01c: ifne 075
      // 01f: if_icmpne 072
      // 022: goto 029
      // 025: invokestatic xf8.a (Loov;)Loov;
      // 028: athrow
      // 029: aload 0
      // 02a: getfield xf8.b0z Ljqk;
      // 02d: aload 0
      // 02e: getfield xf8.b0z Ljqk;
      // 031: invokevirtual jqk.ufo ()Z
      // 034: iload 3
      // 035: ifne 04a
      // 038: goto 03f
      // 03b: invokestatic xf8.a (Loov;)Loov;
      // 03e: athrow
      // 03f: ifne 04d
      // 042: goto 049
      // 045: invokestatic xf8.a (Loov;)Loov;
      // 048: athrow
      // 049: bipush 1
      // 04a: goto 04e
      // 04d: bipush 0
      // 04e: invokevirtual jqk._c6 (Z)V
      // 051: aload 0
      // 052: getfield xf8.p19 Ljqk;
      // 055: aload 0
      // 056: getfield xf8.p19 Ljqk;
      // 059: invokevirtual jqk.ufo ()Z
      // 05c: iload 3
      // 05d: ifne 06b
      // 060: ifne 06e
      // 063: goto 06a
      // 066: invokestatic xf8.a (Loov;)Loov;
      // 069: athrow
      // 06a: bipush 1
      // 06b: goto 06f
      // 06e: bipush 0
      // 06f: invokevirtual jqk._c6 (Z)V
      // 072: iload 2
      // 073: bipush 28
      // 075: iload 3
      // 076: ifne 08e
      // 079: if_icmpeq 091
      // 07c: goto 083
      // 07f: invokestatic xf8.a (Loov;)Loov;
      // 082: athrow
      // 083: iload 2
      // 084: sipush 156
      // 087: goto 08e
      // 08a: invokestatic xf8.a (Loov;)Loov;
      // 08d: athrow
      // 08e: if_icmpne 0a9
      // 091: aload 0
      // 092: aload 0
      // 093: getfield xf8.khf Ljava/util/List;
      // 096: bipush 0
      // 097: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 09c: checkcast gt4
      // 09f: invokevirtual xf8.actionPerformed (Lgt4;)V
      // 0a2: goto 0a9
      // 0a5: invokestatic xf8.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: getfield xf8.khf Ljava/util/List;
      // 0ad: bipush 0
      // 0ae: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0b3: checkcast gt4
      // 0b6: aload 0
      // 0b7: getfield xf8.p19 Ljqk;
      // 0ba: invokevirtual jqk.xct ()Ljava/lang/String;
      // 0bd: invokevirtual java/lang/String.length ()I
      // 0c0: iload 3
      // 0c1: ifne 0e3
      // 0c4: ifle 114
      // 0c7: goto 0ce
      // 0ca: invokestatic xf8.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield xf8.p19 Ljqk;
      // 0d2: invokevirtual jqk.xct ()Ljava/lang/String;
      // 0d5: ldc ":"
      // 0d7: nop
      // 0d8: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 0db: arraylength
      // 0dc: goto 0e3
      // 0df: invokestatic xf8.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: iload 3
      // 0e4: ifne 102
      // 0e7: ifle 114
      // 0ea: goto 0f1
      // 0ed: invokestatic xf8.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: getfield xf8.b0z Ljqk;
      // 0f5: invokevirtual jqk.xct ()Ljava/lang/String;
      // 0f8: invokevirtual java/lang/String.length ()I
      // 0fb: goto 102
      // 0fe: invokestatic xf8.a (Loov;)Loov;
      // 101: athrow
      // 102: iload 3
      // 103: ifne 111
      // 106: ifle 114
      // 109: goto 110
      // 10c: invokestatic xf8.a (Loov;)Loov;
      // 10f: athrow
      // 110: bipush 1
      // 111: goto 115
      // 114: bipush 0
      // 115: putfield gt4.c9a Z
      // 118: return
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.p19.elk(var1, var2, var3);
      this.b0z.elk(var1, var2, var3);
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 120175026000854L;
      this.xmz();
      this.poi(this.fex, fc1.gx1(b<"c">(15473, 5122664153230994426L ^ var4), new Object[0]), this.dt7 / 2, 17, 16777215);
      this.c_t(this.fex, fc1.gx1(b<"c">(5360, 5991871259116192637L ^ var4), new Object[0]), this.dt7 / 2 - 100, 53, 10526880);
      this.c_t(this.fex, fc1.gx1(b<"c">(11623, 526365150549900011L ^ var4), new Object[0]), this.dt7 / 2 - 100, 94, 10526880);
      this.b0z.dy2();
      this.p19.dy2();
      super.drawScreen(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(585378530093590808L, 7979273666355846198L, MethodHandles.lookup().lookupClass()).a(157367831213093L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 94202322902221L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "ÛxßûÈÍ»ê\u0007\u0010$·5\u00178ø\u0098\u0003g\u008e\tÀjþG\u009a\u007f)\u0097%û\u00188\u0000Ð\u0017ç¿(£(WÓ\u008cùaô·{©\u0017 \u0011£^)è\u0007\u008bh\u0003<u\u008d\u009dP\u008bÀr\u0095\u0091\u0010/Ú\tZ}t#¶£04J\u0080Ä\u0016µ\u0096\u0011\u0089û\u0099úÿtÀ\u009c¸Ø¥\u0096¶÷¬ÝNO\u0092p\u000f?õÇÏ\u000e\u0098¤þJª.{\u001f\u0097\u0085\u009b\\°T\u0010MkÁ\u0002µVá\u009d³j¶\tÄx\u0099|\u0018\u0084øoáÞ4¬\\\u0006\u0012m\f\u0000Å\u0003C\b¶|\u0081Ðà×j\u0010\u008a\u001d|?·Åa\u0088f\u008c^\u0099ª{\u001e\u0095(=\u0091ö¡ó§8´jº±\u0089/$q30\r:\u000f\u0003\u0081:Â¾[\f L\u0006®\u0017&YX\u0013\u009a\u0083áÒ";
      int var8 = "ÛxßûÈÍ»ê\u0007\u0010$·5\u00178ø\u0098\u0003g\u008e\tÀjþG\u009a\u007f)\u0097%û\u00188\u0000Ð\u0017ç¿(£(WÓ\u008cùaô·{©\u0017 \u0011£^)è\u0007\u008bh\u0003<u\u008d\u009dP\u008bÀr\u0095\u0091\u0010/Ú\tZ}t#¶£04J\u0080Ä\u0016µ\u0096\u0011\u0089û\u0099úÿtÀ\u009c¸Ø¥\u0096¶÷¬ÝNO\u0092p\u000f?õÇÏ\u000e\u0098¤þJª.{\u001f\u0097\u0085\u009b\\°T\u0010MkÁ\u0002µVá\u009d³j¶\tÄx\u0099|\u0018\u0084øoáÞ4¬\\\u0006\u0012m\f\u0000Å\u0003C\b¶|\u0081Ðà×j\u0010\u008a\u001d|?·Åa\u0088f\u008c^\u0099ª{\u001e\u0095(=\u0091ö¡ó§8´jº±\u0089/$q30\r:\u000f\u0003\u0081:Â¾[\f L\u0006®\u0017&YX\u0013\u009a\u0083áÒ"
         .length();
      char var5 = '(';
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
                     g = new String[9];
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

                  var6 = "D8\u0018jó\u0087\u0094N6¨P\u0003Ãý\u008cZ&£\u00146\u0000[\u001ck ÐÍÛ\u001d\u0010T`Oß¼î\u0012\u0007\n\u0006=ó$\\ò\u0080>\u0006L\u007fFþ\u0084¥%\u0095\u0084";
                  var8 = "D8\u0018jó\u0087\u0094N6¨P\u0003Ãý\u008cZ&£\u00146\u0000[\u001ck ÐÍÛ\u001d\u0010T`Oß¼î\u0012\u0007\n\u0006=ó$\\ò\u0080>\u0006L\u007fFþ\u0084¥%\u0095\u0084"
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30654;
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
            throw new RuntimeException("xf8", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("xf8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
