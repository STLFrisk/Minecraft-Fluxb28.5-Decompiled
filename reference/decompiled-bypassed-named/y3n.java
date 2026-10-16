import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class y3n extends ShaderHelper {
   private static final Logger f0e;
   private static final gdz bmi;
   private final ha9 jah;
   private final erg hai;
   private final boolean arx;
   private boolean srb;
   private boolean qpa;
   private int bbf;
   private int z46;
   private int jt4;
   private int bnt;
   private int qcp;
   private qhg plw;
   private String fz4;
   private List smj;
   private int nep;
   private y3n$yp7 ofi;
   private y3n$yp7 wnd;
   private gt4 pj_;
   private gt4 bi_;
   private gt4 q_q;
   private gt4 qad;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public y3n(ha9 param1, erg param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic y3n.a J
      // 003: ldc2_w 44270728908640
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: invokespecial ShaderHelper.<init> ()V
      // 00d: invokestatic OpaquePredicate.b ()I
      // 010: aload 0
      // 011: sipush 192
      // 014: putfield y3n.z46 I
      // 017: aload 0
      // 018: sipush 192
      // 01b: putfield y3n.jt4 I
      // 01e: aload 0
      // 01f: bipush 1
      // 020: putfield y3n.bnt I
      // 023: aload 0
      // 024: ldc ""
      // 026: nop
      // 027: putfield y3n.fz4 Ljava/lang/String;
      // 02a: aload 0
      // 02b: bipush -1
      // 02c: putfield y3n.nep I
      // 02f: aload 0
      // 030: aload 1
      // 031: putfield y3n.jah Lha9;
      // 034: aload 0
      // 035: aload 2
      // 036: putfield y3n.hai Lerg;
      // 039: istore 6
      // 03b: aload 0
      // 03c: iload 6
      // 03e: ifeq 0c7
      // 041: iload 3
      // 042: putfield y3n.arx Z
      // 045: aload 2
      // 046: invokevirtual erg.w8b ()Z
      // 049: ifeq 0c6
      // 04c: goto 053
      // 04f: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: aload 2
      // 054: invokevirtual erg.zso ()Lbdo;
      // 057: astore 7
      // 059: aload 0
      // 05a: aload 7
      // 05c: sipush 8499
      // 05f: ldc2_w 888995344954070032
      // 062: lload 4
      // 064: lxor
      // 065: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: nop
      // 06b: bipush 8
      // 06d: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 070: putfield y3n.plw Lqhg;
      // 073: aload 0
      // 074: getfield y3n.plw Lqhg;
      // 077: iload 6
      // 079: ifeq 0ca
      // 07c: ifnull 0c6
      // 07f: goto 086
      // 082: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: aload 0
      // 087: aload 0
      // 088: getfield y3n.plw Lqhg;
      // 08b: invokevirtual qhg.h33 ()Lgdw;
      // 08e: checkcast qhg
      // 091: putfield y3n.plw Lqhg;
      // 094: aload 0
      // 095: aload 0
      // 096: getfield y3n.plw Lqhg;
      // 099: invokevirtual qhg.vek ()I
      // 09c: putfield y3n.bnt I
      // 09f: aload 0
      // 0a0: iload 6
      // 0a2: ifeq 0c7
      // 0a5: goto 0ac
      // 0a8: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: getfield y3n.bnt I
      // 0af: bipush 1
      // 0b0: if_icmpge 0c6
      // 0b3: goto 0ba
      // 0b6: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: bipush 1
      // 0bc: putfield y3n.bnt I
      // 0bf: goto 0c6
      // 0c2: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: getfield y3n.plw Lqhg;
      // 0ca: ifnonnull 100
      // 0cd: iload 3
      // 0ce: ifeq 100
      // 0d1: goto 0d8
      // 0d4: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: new qhg
      // 0dc: dup
      // 0dd: invokespecial qhg.<init> ()V
      // 0e0: putfield y3n.plw Lqhg;
      // 0e3: aload 0
      // 0e4: getfield y3n.plw Lqhg;
      // 0e7: new bgg
      // 0ea: dup
      // 0eb: ldc ""
      // 0ed: nop
      // 0ee: invokespecial bgg.<init> (Ljava/lang/String;)V
      // 0f1: invokevirtual qhg.w2j (Lgdw;)V
      // 0f4: aload 0
      // 0f5: bipush 1
      // 0f6: putfield y3n.bnt I
      // 0f9: goto 100
      // 0fc: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: return
   }

   @Override
   public void updateScreen() {
      super.updateScreen();
      this.bbf++;
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
      // 000: getstatic y3n.a J
      // 003: ldc2_w 118505239091614
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield y3n.khf Ljava/util/List;
      // 00c: invokeinterface java/util/List.clear ()V 1
      // 011: invokestatic OpaquePredicate.c ()I
      // 014: bipush 1
      // 015: invokestatic org/lwjgl/input/Keyboard.enableRepeatEvents (Z)V
      // 018: istore 3
      // 019: aload 0
      // 01a: getfield y3n.arx Z
      // 01d: iload 3
      // 01e: ifne 175
      // 021: ifeq 12f
      // 024: goto 02b
      // 027: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: getfield y3n.khf Ljava/util/List;
      // 02f: aload 0
      // 030: new gt4
      // 033: dup
      // 034: bipush 3
      // 035: aload 0
      // 036: getfield y3n.dt7 I
      // 039: bipush 2
      // 03a: idiv
      // 03b: bipush 100
      // 03d: isub
      // 03e: bipush 4
      // 03f: aload 0
      // 040: getfield y3n.jt4 I
      // 043: iadd
      // 044: bipush 98
      // 046: bipush 20
      // 048: sipush 157
      // 04b: ldc2_w 6797962527488811844
      // 04e: lload 1
      // 04f: lxor
      // 050: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: nop
      // 056: bipush 0
      // 057: anewarray 150
      // 05a: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 05d: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 060: dup_x1
      // 061: putfield y3n.bi_ Lgt4;
      // 064: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 069: pop
      // 06a: aload 0
      // 06b: getfield y3n.khf Ljava/util/List;
      // 06e: aload 0
      // 06f: new gt4
      // 072: dup
      // 073: bipush 0
      // 074: aload 0
      // 075: getfield y3n.dt7 I
      // 078: bipush 2
      // 079: idiv
      // 07a: bipush 2
      // 07b: iadd
      // 07c: bipush 4
      // 07d: aload 0
      // 07e: getfield y3n.jt4 I
      // 081: iadd
      // 082: bipush 98
      // 084: bipush 20
      // 086: sipush 2291
      // 089: ldc2_w 2569611712173320999
      // 08c: lload 1
      // 08d: lxor
      // 08e: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: nop
      // 094: bipush 0
      // 095: anewarray 150
      // 098: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 09b: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 09e: dup_x1
      // 09f: putfield y3n.pj_ Lgt4;
      // 0a2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a7: pop
      // 0a8: aload 0
      // 0a9: getfield y3n.khf Ljava/util/List;
      // 0ac: aload 0
      // 0ad: new gt4
      // 0b0: dup
      // 0b1: bipush 5
      // 0b2: aload 0
      // 0b3: getfield y3n.dt7 I
      // 0b6: bipush 2
      // 0b7: idiv
      // 0b8: bipush 100
      // 0ba: isub
      // 0bb: bipush 4
      // 0bc: aload 0
      // 0bd: getfield y3n.jt4 I
      // 0c0: iadd
      // 0c1: bipush 98
      // 0c3: bipush 20
      // 0c5: sipush 31944
      // 0c8: ldc2_w 757157374244544276
      // 0cb: lload 1
      // 0cc: lxor
      // 0cd: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: nop
      // 0d3: bipush 0
      // 0d4: anewarray 150
      // 0d7: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0da: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 0dd: dup_x1
      // 0de: putfield y3n.q_q Lgt4;
      // 0e1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e6: pop
      // 0e7: aload 0
      // 0e8: getfield y3n.khf Ljava/util/List;
      // 0eb: aload 0
      // 0ec: new gt4
      // 0ef: dup
      // 0f0: bipush 4
      // 0f1: aload 0
      // 0f2: getfield y3n.dt7 I
      // 0f5: bipush 2
      // 0f6: idiv
      // 0f7: bipush 2
      // 0f8: iadd
      // 0f9: bipush 4
      // 0fa: aload 0
      // 0fb: getfield y3n.jt4 I
      // 0fe: iadd
      // 0ff: bipush 98
      // 101: bipush 20
      // 103: bipush 76
      // 105: ldc2_w 12017340382454679
      // 108: lload 1
      // 109: lxor
      // 10a: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: nop
      // 110: bipush 0
      // 111: anewarray 150
      // 114: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 117: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 11a: dup_x1
      // 11b: putfield y3n.qad Lgt4;
      // 11e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 123: pop
      // 124: iload 3
      // 125: ifeq 176
      // 128: goto 12f
      // 12b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: aload 0
      // 130: getfield y3n.khf Ljava/util/List;
      // 133: aload 0
      // 134: new gt4
      // 137: dup
      // 138: bipush 0
      // 139: aload 0
      // 13a: getfield y3n.dt7 I
      // 13d: bipush 2
      // 13e: idiv
      // 13f: bipush 100
      // 141: isub
      // 142: bipush 4
      // 143: aload 0
      // 144: getfield y3n.jt4 I
      // 147: iadd
      // 148: sipush 200
      // 14b: bipush 20
      // 14d: sipush 5342
      // 150: ldc2_w 2964718042780841746
      // 153: lload 1
      // 154: lxor
      // 155: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: nop
      // 15b: bipush 0
      // 15c: anewarray 150
      // 15f: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 162: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 165: dup_x1
      // 166: putfield y3n.pj_ Lgt4;
      // 169: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16e: goto 175
      // 171: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 174: athrow
      // 175: pop
      // 176: aload 0
      // 177: getfield y3n.dt7 I
      // 17a: aload 0
      // 17b: getfield y3n.z46 I
      // 17e: isub
      // 17f: bipush 2
      // 180: idiv
      // 181: istore 4
      // 183: bipush 2
      // 184: istore 5
      // 186: aload 0
      // 187: getfield y3n.khf Ljava/util/List;
      // 18a: aload 0
      // 18b: new y3n$yp7
      // 18e: dup
      // 18f: bipush 1
      // 190: iload 4
      // 192: bipush 120
      // 194: iadd
      // 195: iload 5
      // 197: sipush 154
      // 19a: iadd
      // 19b: bipush 1
      // 19c: invokespecial y3n$yp7.<init> (IIIZ)V
      // 19f: dup_x1
      // 1a0: putfield y3n.ofi Ly3n$yp7;
      // 1a3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a8: pop
      // 1a9: aload 0
      // 1aa: getfield y3n.khf Ljava/util/List;
      // 1ad: aload 0
      // 1ae: new y3n$yp7
      // 1b1: dup
      // 1b2: bipush 2
      // 1b3: iload 4
      // 1b5: bipush 38
      // 1b7: iadd
      // 1b8: iload 5
      // 1ba: sipush 154
      // 1bd: iadd
      // 1be: bipush 0
      // 1bf: invokespecial y3n$yp7.<init> (IIIZ)V
      // 1c2: dup_x1
      // 1c3: putfield y3n.wnd Ly3n$yp7;
      // 1c6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1cb: pop
      // 1cc: aload 0
      // 1cd: invokespecial y3n.kjh ()V
      // 1d0: return
   }

   @Override
   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   private void kjh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield y3n.ofi Ly3n$yp7;
      // 008: aload 0
      // 009: getfield y3n.qpa Z
      // 00c: iload 1
      // 00d: ifeq 025
      // 010: ifne 056
      // 013: goto 01a
      // 016: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 019: athrow
      // 01a: aload 0
      // 01b: getfield y3n.qcp I
      // 01e: goto 025
      // 021: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: iload 1
      // 026: ifeq 053
      // 029: aload 0
      // 02a: getfield y3n.bnt I
      // 02d: bipush 1
      // 02e: isub
      // 02f: if_icmplt 052
      // 032: goto 039
      // 035: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield y3n.arx Z
      // 03d: iload 1
      // 03e: ifeq 053
      // 041: goto 048
      // 044: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: ifeq 056
      // 04b: goto 052
      // 04e: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: bipush 1
      // 053: goto 057
      // 056: bipush 0
      // 057: putfield y3n$yp7.c1s Z
      // 05a: aload 0
      // 05b: getfield y3n.wnd Ly3n$yp7;
      // 05e: aload 0
      // 05f: getfield y3n.qpa Z
      // 062: iload 1
      // 063: ifeq 07b
      // 066: ifne 08d
      // 069: goto 070
      // 06c: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: aload 0
      // 071: getfield y3n.qcp I
      // 074: goto 07b
      // 077: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: iload 1
      // 07c: ifeq 08a
      // 07f: ifle 08d
      // 082: goto 089
      // 085: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 088: athrow
      // 089: bipush 1
      // 08a: goto 08e
      // 08d: bipush 0
      // 08e: putfield y3n$yp7.c1s Z
      // 091: aload 0
      // 092: getfield y3n.pj_ Lgt4;
      // 095: aload 0
      // 096: getfield y3n.arx Z
      // 099: iload 1
      // 09a: ifeq 0c1
      // 09d: ifeq 0c0
      // 0a0: goto 0a7
      // 0a3: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield y3n.qpa Z
      // 0ab: iload 1
      // 0ac: ifeq 0c1
      // 0af: goto 0b6
      // 0b2: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: ifne 0c4
      // 0b9: goto 0c0
      // 0bc: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: bipush 1
      // 0c1: goto 0c5
      // 0c4: bipush 0
      // 0c5: putfield gt4.c1s Z
      // 0c8: aload 0
      // 0c9: iload 1
      // 0ca: ifeq 0e2
      // 0cd: getfield y3n.arx Z
      // 0d0: ifeq 139
      // 0d3: goto 0da
      // 0d6: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: goto 0e2
      // 0de: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: getfield y3n.bi_ Lgt4;
      // 0e5: aload 0
      // 0e6: getfield y3n.qpa Z
      // 0e9: iload 1
      // 0ea: ifeq 0f8
      // 0ed: ifne 0fb
      // 0f0: goto 0f7
      // 0f3: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: bipush 1
      // 0f8: goto 0fc
      // 0fb: bipush 0
      // 0fc: putfield gt4.c1s Z
      // 0ff: aload 0
      // 100: getfield y3n.qad Lgt4;
      // 103: aload 0
      // 104: getfield y3n.qpa Z
      // 107: putfield gt4.c1s Z
      // 10a: aload 0
      // 10b: getfield y3n.q_q Lgt4;
      // 10e: aload 0
      // 10f: getfield y3n.qpa Z
      // 112: putfield gt4.c1s Z
      // 115: aload 0
      // 116: getfield y3n.q_q Lgt4;
      // 119: aload 0
      // 11a: getfield y3n.fz4 Ljava/lang/String;
      // 11d: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 120: invokevirtual java/lang/String.length ()I
      // 123: iload 1
      // 124: ifeq 132
      // 127: ifle 135
      // 12a: goto 131
      // 12d: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 130: athrow
      // 131: bipush 1
      // 132: goto 136
      // 135: bipush 0
      // 136: putfield gt4.c9a Z
      // 139: return
   }

   private void i0y(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic y3n.a J
      // 003: ldc2_w 49416790229266
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield y3n.arx Z
      // 011: iload 4
      // 013: ifne 037
      // 016: ifeq 201
      // 019: goto 020
      // 01c: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: aload 0
      // 021: iload 4
      // 023: ifne 03b
      // 026: goto 02d
      // 029: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: getfield y3n.srb Z
      // 030: goto 037
      // 033: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: ifeq 201
      // 03a: aload 0
      // 03b: getfield y3n.plw Lqhg;
      // 03e: iload 4
      // 040: ifne 058
      // 043: ifnull 201
      // 046: goto 04d
      // 049: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: aload 0
      // 04e: getfield y3n.plw Lqhg;
      // 051: goto 058
      // 054: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: invokevirtual qhg.vek ()I
      // 05b: bipush 1
      // 05c: if_icmple 0aa
      // 05f: aload 0
      // 060: getfield y3n.plw Lqhg;
      // 063: aload 0
      // 064: getfield y3n.plw Lqhg;
      // 067: invokevirtual qhg.vek ()I
      // 06a: bipush 1
      // 06b: isub
      // 06c: invokevirtual qhg.mqs (I)Ljava/lang/String;
      // 06f: astore 5
      // 071: iload 4
      // 073: ifne 0a5
      // 076: aload 5
      // 078: invokevirtual java/lang/String.length ()I
      // 07b: iload 4
      // 07d: ifne 0bd
      // 080: goto 087
      // 083: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: ifeq 094
      // 08a: goto 091
      // 08d: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: goto 0aa
      // 094: aload 0
      // 095: getfield y3n.plw Lqhg;
      // 098: aload 0
      // 099: getfield y3n.plw Lqhg;
      // 09c: invokevirtual qhg.vek ()I
      // 09f: bipush 1
      // 0a0: isub
      // 0a1: invokevirtual qhg.bf3 (I)Lgdw;
      // 0a4: pop
      // 0a5: iload 4
      // 0a7: ifeq 04d
      // 0aa: aload 0
      // 0ab: getfield y3n.hai Lerg;
      // 0ae: iload 4
      // 0b0: ifne 0f0
      // 0b3: invokevirtual erg.w8b ()Z
      // 0b6: goto 0bd
      // 0b9: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: ifeq 0e5
      // 0c0: aload 0
      // 0c1: getfield y3n.hai Lerg;
      // 0c4: invokevirtual erg.zso ()Lbdo;
      // 0c7: astore 5
      // 0c9: aload 5
      // 0cb: sipush 27243
      // 0ce: ldc2_w 6518217134336086321
      // 0d1: lload 2
      // 0d2: lxor
      // 0d3: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: nop
      // 0d9: aload 0
      // 0da: getfield y3n.plw Lqhg;
      // 0dd: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 0e0: iload 4
      // 0e2: ifeq 105
      // 0e5: aload 0
      // 0e6: getfield y3n.hai Lerg;
      // 0e9: goto 0f0
      // 0ec: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: sipush 27243
      // 0f3: ldc2_w 6518217134336086321
      // 0f6: lload 2
      // 0f7: lxor
      // 0f8: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: nop
      // 0fe: aload 0
      // 0ff: getfield y3n.plw Lqhg;
      // 102: invokevirtual erg.fvt (Ljava/lang/String;Lgdw;)V
      // 105: sipush 13288
      // 108: ldc2_w 7476755316480035006
      // 10b: lload 2
      // 10c: lxor
      // 10d: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: nop
      // 113: astore 5
      // 115: iload 1
      // 116: iload 4
      // 118: ifne 17c
      // 11b: ifeq 1d7
      // 11e: goto 125
      // 121: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: sipush 10612
      // 128: ldc2_w 3807950941677867560
      // 12b: lload 2
      // 12c: lxor
      // 12d: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: nop
      // 133: astore 5
      // 135: aload 0
      // 136: getfield y3n.hai Lerg;
      // 139: sipush 29681
      // 13c: ldc2_w 2821830758048073893
      // 13f: lload 2
      // 140: lxor
      // 141: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: nop
      // 147: new bgg
      // 14a: dup
      // 14b: aload 0
      // 14c: getfield y3n.jah Lha9;
      // 14f: invokevirtual ha9.noc ()Ljava/lang/String;
      // 152: invokespecial bgg.<init> (Ljava/lang/String;)V
      // 155: invokevirtual erg.fvt (Ljava/lang/String;Lgdw;)V
      // 158: aload 0
      // 159: getfield y3n.hai Lerg;
      // 15c: sipush 4053
      // 15f: ldc2_w 8651571910217102471
      // 162: lload 2
      // 163: lxor
      // 164: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: nop
      // 16a: new bgg
      // 16d: dup
      // 16e: aload 0
      // 16f: getfield y3n.fz4 Ljava/lang/String;
      // 172: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 175: invokespecial bgg.<init> (Ljava/lang/String;)V
      // 178: invokevirtual erg.fvt (Ljava/lang/String;Lgdw;)V
      // 17b: bipush 0
      // 17c: istore 6
      // 17e: iload 6
      // 180: aload 0
      // 181: getfield y3n.plw Lqhg;
      // 184: invokevirtual qhg.vek ()I
      // 187: if_icmpge 1cd
      // 18a: aload 0
      // 18b: getfield y3n.plw Lqhg;
      // 18e: iload 6
      // 190: invokevirtual qhg.mqs (I)Ljava/lang/String;
      // 193: astore 7
      // 195: new tao
      // 198: dup
      // 199: aload 7
      // 19b: invokespecial tao.<init> (Ljava/lang/String;)V
      // 19e: astore 8
      // 1a0: aload 8
      // 1a2: invokestatic ekw$szt.odg (Lekw;)Ljava/lang/String;
      // 1a5: astore 7
      // 1a7: aload 0
      // 1a8: getfield y3n.plw Lqhg;
      // 1ab: iload 6
      // 1ad: new bgg
      // 1b0: dup
      // 1b1: aload 7
      // 1b3: invokespecial bgg.<init> (Ljava/lang/String;)V
      // 1b6: invokevirtual qhg.z_z (ILgdw;)V
      // 1b9: iinc 6 1
      // 1bc: iload 4
      // 1be: ifne 1d7
      // 1c1: iload 4
      // 1c3: ifeq 17e
      // 1c6: goto 1cd
      // 1c9: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cc: athrow
      // 1cd: aload 0
      // 1ce: getfield y3n.hai Lerg;
      // 1d1: getstatic xbr._h5 Lu7m;
      // 1d4: invokevirtual erg.j8j (Lu7m;)V
      // 1d7: new nfj
      // 1da: dup
      // 1db: invokestatic io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
      // 1de: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 1e1: astore 6
      // 1e3: aload 6
      // 1e5: aload 0
      // 1e6: getfield y3n.hai Lerg;
      // 1e9: invokevirtual nfj.a6a (Lerg;)V
      // 1ec: aload 0
      // 1ed: getfield y3n.f41 Lc05;
      // 1f0: invokevirtual Minecraft.c02 ()Lp_k;
      // 1f3: new net/minecraft/network/play/client/C17PacketCustomPayload
      // 1f6: dup
      // 1f7: aload 5
      // 1f9: aload 6
      // 1fb: invokespecial net/minecraft/network/play/client/C17PacketCustomPayload.<init> (Ljava/lang/String;Lnfj;)V
      // 1fe: invokevirtual p_k.sxi (Lmz2;)V
      // 201: return
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: getfield gt4.c9a Z
      // 008: iload 2
      // 009: ifne 021
      // 00c: ifeq 205
      // 00f: goto 016
      // 012: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 1
      // 017: getfield gt4._me I
      // 01a: goto 021
      // 01d: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: iload 2
      // 022: ifne 055
      // 025: ifne 04a
      // 028: goto 02f
      // 02b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield y3n.f41 Lc05;
      // 033: aconst_null
      // 034: checkcast ShaderHelper
      // 037: invokevirtual Minecraft.z2i (Lgbe;)V
      // 03a: aload 0
      // 03b: bipush 0
      // 03c: invokespecial y3n.i0y (Z)V
      // 03f: iload 2
      // 040: ifeq 201
      // 043: goto 04a
      // 046: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: aload 1
      // 04b: getfield gt4._me I
      // 04e: goto 055
      // 051: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: bipush 3
      // 056: iload 2
      // 057: ifne 099
      // 05a: if_icmpne 08d
      // 05d: goto 064
      // 060: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: aload 0
      // 065: getfield y3n.arx Z
      // 068: iload 2
      // 069: ifne 098
      // 06c: goto 073
      // 06f: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: ifeq 08d
      // 076: goto 07d
      // 079: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: aload 0
      // 07e: bipush 1
      // 07f: putfield y3n.qpa Z
      // 082: iload 2
      // 083: ifeq 201
      // 086: goto 08d
      // 089: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: aload 1
      // 08e: getfield gt4._me I
      // 091: goto 098
      // 094: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: bipush 1
      // 099: iload 2
      // 09a: ifne 138
      // 09d: if_icmpne 12c
      // 0a0: goto 0a7
      // 0a3: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield y3n.qcp I
      // 0ab: iload 2
      // 0ac: ifne 0f1
      // 0af: goto 0b6
      // 0b2: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: getfield y3n.bnt I
      // 0ba: bipush 1
      // 0bb: isub
      // 0bc: if_icmpge 0db
      // 0bf: goto 0c6
      // 0c2: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: dup
      // 0c8: getfield y3n.qcp I
      // 0cb: bipush 1
      // 0cc: iadd
      // 0cd: putfield y3n.qcp I
      // 0d0: iload 2
      // 0d1: ifeq 201
      // 0d4: goto 0db
      // 0d7: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: iload 2
      // 0dd: ifne 202
      // 0e0: goto 0e7
      // 0e3: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: getfield y3n.arx Z
      // 0ea: goto 0f1
      // 0ed: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: ifeq 201
      // 0f4: aload 0
      // 0f5: invokespecial y3n.ctm ()V
      // 0f8: aload 0
      // 0f9: iload 2
      // 0fa: ifne 202
      // 0fd: goto 104
      // 100: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: getfield y3n.qcp I
      // 107: aload 0
      // 108: getfield y3n.bnt I
      // 10b: bipush 1
      // 10c: isub
      // 10d: if_icmpge 201
      // 110: goto 117
      // 113: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: aload 0
      // 118: dup
      // 119: getfield y3n.qcp I
      // 11c: bipush 1
      // 11d: iadd
      // 11e: putfield y3n.qcp I
      // 121: iload 2
      // 122: ifeq 201
      // 125: goto 12c
      // 128: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12b: athrow
      // 12c: aload 1
      // 12d: getfield gt4._me I
      // 130: bipush 2
      // 131: goto 138
      // 134: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 137: athrow
      // 138: iload 2
      // 139: ifne 180
      // 13c: if_icmpne 174
      // 13f: goto 146
      // 142: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: aload 0
      // 147: iload 2
      // 148: ifne 202
      // 14b: goto 152
      // 14e: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 151: athrow
      // 152: getfield y3n.qcp I
      // 155: ifle 201
      // 158: goto 15f
      // 15b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15e: athrow
      // 15f: aload 0
      // 160: dup
      // 161: getfield y3n.qcp I
      // 164: bipush 1
      // 165: isub
      // 166: putfield y3n.qcp I
      // 169: iload 2
      // 16a: ifeq 201
      // 16d: goto 174
      // 170: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 173: athrow
      // 174: aload 1
      // 175: getfield gt4._me I
      // 178: bipush 5
      // 179: goto 180
      // 17c: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17f: athrow
      // 180: iload 2
      // 181: ifne 1d9
      // 184: if_icmpne 1c2
      // 187: goto 18e
      // 18a: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18d: athrow
      // 18e: aload 0
      // 18f: getfield y3n.qpa Z
      // 192: iload 2
      // 193: ifne 1cd
      // 196: goto 19d
      // 199: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19c: athrow
      // 19d: ifeq 1c2
      // 1a0: goto 1a7
      // 1a3: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: bipush 1
      // 1a9: invokespecial y3n.i0y (Z)V
      // 1ac: aload 0
      // 1ad: getfield y3n.f41 Lc05;
      // 1b0: aconst_null
      // 1b1: checkcast ShaderHelper
      // 1b4: invokevirtual Minecraft.z2i (Lgbe;)V
      // 1b7: iload 2
      // 1b8: ifeq 201
      // 1bb: goto 1c2
      // 1be: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c1: athrow
      // 1c2: aload 1
      // 1c3: getfield gt4._me I
      // 1c6: goto 1cd
      // 1c9: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cc: athrow
      // 1cd: iload 2
      // 1ce: ifne 1f2
      // 1d1: bipush 4
      // 1d2: goto 1d9
      // 1d5: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d8: athrow
      // 1d9: if_icmpne 201
      // 1dc: aload 0
      // 1dd: iload 2
      // 1de: ifne 202
      // 1e1: goto 1e8
      // 1e4: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e7: athrow
      // 1e8: getfield y3n.qpa Z
      // 1eb: goto 1f2
      // 1ee: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f1: athrow
      // 1f2: ifeq 201
      // 1f5: aload 0
      // 1f6: bipush 0
      // 1f7: putfield y3n.qpa Z
      // 1fa: goto 201
      // 1fd: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 200: athrow
      // 201: aload 0
      // 202: invokespecial y3n.kjh ()V
      // 205: return
   }

   private void ctm() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield y3n.plw Lqhg;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 5b
      // 0f: goto 16
      // 12: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield y3n.plw Lqhg;
      // 1a: goto 21
      // 1d: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: iload 1
      // 22: ifeq 3f
      // 25: invokevirtual qhg.vek ()I
      // 28: bipush 50
      // 2a: if_icmpge 5b
      // 2d: goto 34
      // 30: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 0
      // 35: getfield y3n.plw Lqhg;
      // 38: goto 3f
      // 3b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: new bgg
      // 42: dup
      // 43: ldc ""
      // 45: nop
      // 46: invokespecial bgg.<init> (Ljava/lang/String;)V
      // 49: invokevirtual qhg.w2j (Lgdw;)V
      // 4c: aload 0
      // 4d: dup
      // 4e: getfield y3n.bnt I
      // 51: bipush 1
      // 52: iadd
      // 53: putfield y3n.bnt I
      // 56: aload 0
      // 57: bipush 1
      // 58: putfield y3n.srb Z
      // 5b: return
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: iload 2
      // 07: invokespecial ShaderHelper.dig (CI)V
      // 0a: aload 0
      // 0b: getfield y3n.arx Z
      // 0e: iload 3
      // 0f: ifne 32
      // 12: ifeq 53
      // 15: goto 1c
      // 18: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 3
      // 1e: ifne 4e
      // 21: goto 28
      // 24: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: getfield y3n.qpa Z
      // 2b: goto 32
      // 2e: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: ifeq 46
      // 35: aload 0
      // 36: iload 1
      // 37: iload 2
      // 38: invokespecial y3n.jtj (CI)V
      // 3b: iload 3
      // 3c: ifeq 53
      // 3f: goto 46
      // 42: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 0
      // 47: goto 4e
      // 4a: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: iload 1
      // 4f: iload 2
      // 50: invokespecial y3n.jts (CI)V
      // 53: return
   }

   private void jts(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: iload 2
      // 05: invokestatic ShaderHelper.foo (I)Z
      // 08: iload 3
      // 09: ifne 30
      // 0c: ifeq 28
      // 0f: goto 16
      // 12: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic ShaderHelper.b0r ()Ljava/lang/String;
      // 1a: invokespecial y3n.fdk (Ljava/lang/String;)V
      // 1d: iload 3
      // 1e: ifeq a1
      // 21: goto 28
      // 24: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: iload 2
      // 29: goto 30
      // 2c: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: iload 3
      // 31: ifne 8f
      // 34: lookupswitch 87 3 14 40 28 79 156 79
      // 58: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 0
      // 5d: invokespecial y3n.lcx ()Ljava/lang/String;
      // 60: astore 4
      // 62: aload 4
      // 64: invokevirtual java/lang/String.length ()I
      // 67: ifle 82
      // 6a: aload 0
      // 6b: aload 4
      // 6d: bipush 0
      // 6e: aload 4
      // 70: invokevirtual java/lang/String.length ()I
      // 73: bipush 1
      // 74: isub
      // 75: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 78: invokespecial y3n.hqq (Ljava/lang/String;)V
      // 7b: goto 82
      // 7e: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: return
      // 83: aload 0
      // 84: ldc "\n"
      // 86: nop
      // 87: invokespecial y3n.fdk (Ljava/lang/String;)V
      // 8a: return
      // 8b: iload 1
      // 8c: invokestatic _xi._m2 (C)Z
      // 8f: ifeq a1
      // 92: aload 0
      // 93: iload 1
      // 94: invokestatic java/lang/Character.toString (C)Ljava/lang/String;
      // 97: invokespecial y3n.fdk (Ljava/lang/String;)V
      // 9a: goto a1
      // 9d: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: return
   }

   private void jtj(char param1, int param2) {
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
      // 05: iload 3
      // 06: ifeq a1
      // 09: lookupswitch 145 3 14 39 28 100 156 100
      // 2c: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 0
      // 31: iload 3
      // 32: ifeq 69
      // 35: goto 3c
      // 38: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: getfield y3n.fz4 Ljava/lang/String;
      // 3f: invokevirtual java/lang/String.isEmpty ()Z
      // 42: ifne 6c
      // 45: goto 4c
      // 48: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 0
      // 4e: getfield y3n.fz4 Ljava/lang/String;
      // 51: bipush 0
      // 52: aload 0
      // 53: getfield y3n.fz4 Ljava/lang/String;
      // 56: invokevirtual java/lang/String.length ()I
      // 59: bipush 1
      // 5a: isub
      // 5b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 5e: putfield y3n.fz4 Ljava/lang/String;
      // 61: aload 0
      // 62: goto 69
      // 65: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: invokespecial y3n.kjh ()V
      // 6c: return
      // 6d: aload 0
      // 6e: iload 3
      // 6f: ifeq 8f
      // 72: getfield y3n.fz4 Ljava/lang/String;
      // 75: invokevirtual java/lang/String.isEmpty ()Z
      // 78: ifne 99
      // 7b: goto 82
      // 7e: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: aload 0
      // 83: bipush 1
      // 84: invokespecial y3n.i0y (Z)V
      // 87: aload 0
      // 88: goto 8f
      // 8b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: getfield y3n.f41 Lc05;
      // 92: aconst_null
      // 93: checkcast ShaderHelper
      // 96: invokevirtual Minecraft.z2i (Lgbe;)V
      // 99: return
      // 9a: aload 0
      // 9b: getfield y3n.fz4 Ljava/lang/String;
      // 9e: invokevirtual java/lang/String.length ()I
      // a1: iload 3
      // a2: ifeq bc
      // a5: bipush 16
      // a7: if_icmpge eb
      // aa: goto b1
      // ad: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: iload 1
      // b2: invokestatic _xi._m2 (C)Z
      // b5: goto bc
      // b8: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bb: athrow
      // bc: ifeq eb
      // bf: aload 0
      // c0: new java/lang/StringBuilder
      // c3: dup
      // c4: invokespecial java/lang/StringBuilder.<init> ()V
      // c7: aload 0
      // c8: getfield y3n.fz4 Ljava/lang/String;
      // cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ce: iload 1
      // cf: invokestatic java/lang/Character.toString (C)Ljava/lang/String;
      // d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d8: putfield y3n.fz4 Ljava/lang/String;
      // db: aload 0
      // dc: invokespecial y3n.kjh ()V
      // df: aload 0
      // e0: bipush 1
      // e1: putfield y3n.srb Z
      // e4: goto eb
      // e7: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ea: athrow
      // eb: return
   }

   private String lcx() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 1e
      // 09: getfield y3n.plw Lqhg;
      // 0c: ifnull 64
      // 0f: goto 16
      // 12: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: getfield y3n.qcp I
      // 21: iload 1
      // 22: ifeq 45
      // 25: iflt 64
      // 28: goto 2f
      // 2b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 1
      // 31: ifeq 57
      // 34: goto 3b
      // 37: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: getfield y3n.qcp I
      // 3e: goto 45
      // 41: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 0
      // 46: getfield y3n.plw Lqhg;
      // 49: invokevirtual qhg.vek ()I
      // 4c: if_icmpge 64
      // 4f: aload 0
      // 50: goto 57
      // 53: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: getfield y3n.plw Lqhg;
      // 5a: aload 0
      // 5b: getfield y3n.qcp I
      // 5e: invokevirtual qhg.mqs (I)Ljava/lang/String;
      // 61: goto 67
      // 64: ldc ""
      // 66: nop
      // 67: areturn
   }

   private void hqq(String param1) {
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
      // 05: iload 2
      // 06: ifne 1e
      // 09: getfield y3n.plw Lqhg;
      // 0c: ifnull 6e
      // 0f: goto 16
      // 12: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: getfield y3n.qcp I
      // 21: iload 2
      // 22: ifne 45
      // 25: iflt 6e
      // 28: goto 2f
      // 2b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 2
      // 31: ifne 6a
      // 34: goto 3b
      // 37: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: getfield y3n.qcp I
      // 3e: goto 45
      // 41: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 0
      // 46: getfield y3n.plw Lqhg;
      // 49: invokevirtual qhg.vek ()I
      // 4c: if_icmpge 6e
      // 4f: aload 0
      // 50: getfield y3n.plw Lqhg;
      // 53: aload 0
      // 54: getfield y3n.qcp I
      // 57: new bgg
      // 5a: dup
      // 5b: aload 1
      // 5c: invokespecial bgg.<init> (Ljava/lang/String;)V
      // 5f: invokevirtual qhg.z_z (ILgdw;)V
      // 62: aload 0
      // 63: goto 6a
      // 66: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: bipush 1
      // 6b: putfield y3n.srb Z
      // 6e: return
   }

   private void fdk(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial y3n.lcx ()Ljava/lang/String;
      // 04: astore 3
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: new java/lang/StringBuilder
      // 0b: dup
      // 0c: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f: aload 3
      // 10: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13: aload 1
      // 14: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a: astore 4
      // 1c: istore 2
      // 1d: aload 0
      // 1e: getfield y3n.fex Lowt;
      // 21: new java/lang/StringBuilder
      // 24: dup
      // 25: invokespecial java/lang/StringBuilder.<init> ()V
      // 28: aload 4
      // 2a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d: ldc ""
      // 2f: nop
      // 30: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33: getstatic syo.du0 Lsyo;
      // 36: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 39: ldc "_"
      // 3b: nop
      // 3c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 42: bipush 118
      // 44: invokevirtual owt.jdm (Ljava/lang/String;I)I
      // 47: istore 5
      // 49: iload 5
      // 4b: sipush 128
      // 4e: iload 2
      // 4f: ifne 6b
      // 52: if_icmpgt 7b
      // 55: goto 5c
      // 58: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 4
      // 5e: invokevirtual java/lang/String.length ()I
      // 61: sipush 256
      // 64: goto 6b
      // 67: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: if_icmpge 7b
      // 6e: aload 0
      // 6f: aload 4
      // 71: invokespecial y3n.hqq (Ljava/lang/String;)V
      // 74: goto 7b
      // 77: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: return
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
      // 000: getstatic y3n.a J
      // 003: ldc2_w 127122323718817
      // 006: lxor
      // 007: lstore 4
      // 009: fconst_1
      // 00a: fconst_1
      // 00b: fconst_1
      // 00c: fconst_1
      // 00d: invokestatic hzu.wn0 (FFFF)V
      // 010: aload 0
      // 011: getfield y3n.f41 Lc05;
      // 014: invokevirtual Minecraft.l22 ()Llc5;
      // 017: getstatic y3n.bmi Lgdz;
      // 01a: invokevirtual lc5.anl (Lgdz;)V
      // 01d: invokestatic OpaquePredicate.c ()I
      // 020: aload 0
      // 021: getfield y3n.dt7 I
      // 024: aload 0
      // 025: getfield y3n.z46 I
      // 028: isub
      // 029: bipush 2
      // 02a: idiv
      // 02b: istore 7
      // 02d: istore 6
      // 02f: bipush 2
      // 030: istore 8
      // 032: aload 0
      // 033: iload 7
      // 035: iload 8
      // 037: bipush 0
      // 038: bipush 0
      // 039: aload 0
      // 03a: getfield y3n.z46 I
      // 03d: aload 0
      // 03e: getfield y3n.jt4 I
      // 041: invokevirtual y3n.mt4 (IIIIII)V
      // 044: aload 0
      // 045: iload 6
      // 047: ifne 05f
      // 04a: getfield y3n.qpa Z
      // 04d: ifeq 1d9
      // 050: goto 057
      // 053: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: aload 0
      // 058: goto 05f
      // 05b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: getfield y3n.fz4 Ljava/lang/String;
      // 062: astore 9
      // 064: aload 0
      // 065: getfield y3n.arx Z
      // 068: iload 6
      // 06a: ifne 087
      // 06d: ifeq 0d5
      // 070: goto 077
      // 073: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: aload 0
      // 078: getfield y3n.bbf I
      // 07b: bipush 6
      // 07d: idiv
      // 07e: bipush 2
      // 07f: irem
      // 080: goto 087
      // 083: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: ifne 0b2
      // 08a: new java/lang/StringBuilder
      // 08d: dup
      // 08e: invokespecial java/lang/StringBuilder.<init> ()V
      // 091: aload 9
      // 093: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 096: ldc ""
      // 098: nop
      // 099: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09c: getstatic syo.du0 Lsyo;
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0a2: ldc "_"
      // 0a4: nop
      // 0a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ab: astore 9
      // 0ad: iload 6
      // 0af: ifeq 0d5
      // 0b2: new java/lang/StringBuilder
      // 0b5: dup
      // 0b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b9: aload 9
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: ldc ""
      // 0c0: nop
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: getstatic syo.qiz Lsyo;
      // 0c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0ca: ldc "_"
      // 0cc: nop
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d3: astore 9
      // 0d5: sipush 26970
      // 0d8: ldc2_w 1422606003373085106
      // 0db: lload 4
      // 0dd: lxor
      // 0de: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: nop
      // 0e4: bipush 0
      // 0e5: anewarray 150
      // 0e8: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0eb: astore 10
      // 0ed: sipush 2583
      // 0f0: aload 0
      // 0f1: getfield y3n.fex Lowt;
      // 0f4: aload 10
      // 0f6: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 0f9: istore 11
      // 0fb: ldc2_w 5196779160732267259
      // 0fe: lload 4
      // 100: lxor
      // 101: aload 0
      // 102: getfield y3n.fex Lowt;
      // 105: aload 10
      // 107: iload 7
      // 109: bipush 36
      // 10b: iadd
      // 10c: bipush 116
      // 10e: iload 11
      // 110: isub
      // 111: bipush 2
      // 112: idiv
      // 113: iadd
      // 114: i2f
      // 115: iload 8
      // 117: bipush 16
      // 119: iadd
      // 11a: bipush 16
      // 11c: iadd
      // 11d: i2f
      // 11e: bipush 0
      // 11f: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 122: pop
      // 123: aload 0
      // 124: getfield y3n.fex Lowt;
      // 127: aload 9
      // 129: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 12c: istore 12
      // 12e: aload 0
      // 12f: getfield y3n.fex Lowt;
      // 132: aload 9
      // 134: iload 7
      // 136: bipush 36
      // 138: iadd
      // 139: bipush 116
      // 13b: iload 12
      // 13d: isub
      // 13e: bipush 2
      // 13f: idiv
      // 140: iadd
      // 141: i2f
      // 142: iload 8
      // 144: bipush 48
      // 146: iadd
      // 147: i2f
      // 148: bipush 0
      // 149: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 14c: pop
      // 14d: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: nop
      // 153: bipush 1
      // 154: anewarray 150
      // 157: dup
      // 158: bipush 0
      // 159: aload 0
      // 15a: getfield y3n.jah Lha9;
      // 15d: invokevirtual ha9.noc ()Ljava/lang/String;
      // 160: aastore
      // 161: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 164: astore 13
      // 166: sipush 21123
      // 169: aload 0
      // 16a: getfield y3n.fex Lowt;
      // 16d: aload 13
      // 16f: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 172: istore 14
      // 174: ldc2_w 1543452716042267241
      // 177: lload 4
      // 179: lxor
      // 17a: aload 0
      // 17b: getfield y3n.fex Lowt;
      // 17e: new java/lang/StringBuilder
      // 181: dup
      // 182: invokespecial java/lang/StringBuilder.<init> ()V
      // 185: getstatic syo.pgp Lsyo;
      // 188: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 18b: aload 13
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 193: iload 7
      // 195: bipush 36
      // 197: iadd
      // 198: bipush 116
      // 19a: iload 14
      // 19c: isub
      // 19d: bipush 2
      // 19e: idiv
      // 19f: iadd
      // 1a0: i2f
      // 1a1: iload 8
      // 1a3: bipush 48
      // 1a5: iadd
      // 1a6: bipush 10
      // 1a8: iadd
      // 1a9: i2f
      // 1aa: bipush 0
      // 1ab: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 1ae: pop
      // 1af: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: nop
      // 1b5: bipush 0
      // 1b6: anewarray 150
      // 1b9: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1bc: astore 15
      // 1be: aload 0
      // 1bf: getfield y3n.fex Lowt;
      // 1c2: aload 15
      // 1c4: iload 7
      // 1c6: bipush 36
      // 1c8: iadd
      // 1c9: iload 8
      // 1cb: bipush 80
      // 1cd: iadd
      // 1ce: bipush 116
      // 1d0: bipush 0
      // 1d1: invokevirtual owt.bsn (Ljava/lang/String;IIII)V
      // 1d4: iload 6
      // 1d6: ifeq 4c5
      // 1d9: sipush 7752
      // 1dc: ldc2_w 4284523873241589416
      // 1df: lload 4
      // 1e1: lxor
      // 1e2: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: nop
      // 1e8: bipush 2
      // 1e9: anewarray 150
      // 1ec: dup
      // 1ed: bipush 0
      // 1ee: aload 0
      // 1ef: getfield y3n.qcp I
      // 1f2: bipush 1
      // 1f3: iadd
      // 1f4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f7: aastore
      // 1f8: dup
      // 1f9: bipush 1
      // 1fa: aload 0
      // 1fb: getfield y3n.bnt I
      // 1fe: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 201: aastore
      // 202: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 205: astore 9
      // 207: ldc ""
      // 209: nop
      // 20a: astore 10
      // 20c: aload 0
      // 20d: iload 6
      // 20f: ifne 268
      // 212: getfield y3n.plw Lqhg;
      // 215: ifnull 267
      // 218: goto 21f
      // 21b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21e: athrow
      // 21f: aload 0
      // 220: getfield y3n.qcp I
      // 223: iload 6
      // 225: ifne 26b
      // 228: goto 22f
      // 22b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22e: athrow
      // 22f: iflt 267
      // 232: goto 239
      // 235: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 238: athrow
      // 239: aload 0
      // 23a: getfield y3n.qcp I
      // 23d: iload 6
      // 23f: ifne 26b
      // 242: goto 249
      // 245: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 248: athrow
      // 249: aload 0
      // 24a: getfield y3n.plw Lqhg;
      // 24d: invokevirtual qhg.vek ()I
      // 250: if_icmpge 267
      // 253: goto 25a
      // 256: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 259: athrow
      // 25a: aload 0
      // 25b: getfield y3n.plw Lqhg;
      // 25e: aload 0
      // 25f: getfield y3n.qcp I
      // 262: invokevirtual qhg.mqs (I)Ljava/lang/String;
      // 265: astore 10
      // 267: aload 0
      // 268: getfield y3n.arx Z
      // 26b: iload 6
      // 26d: ifne 321
      // 270: ifeq 316
      // 273: goto 27a
      // 276: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 279: athrow
      // 27a: aload 0
      // 27b: getfield y3n.fex Lowt;
      // 27e: invokevirtual owt.ymt ()Z
      // 281: iload 6
      // 283: ifne 2c3
      // 286: goto 28d
      // 289: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28c: athrow
      // 28d: ifeq 2b3
      // 290: goto 297
      // 293: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 296: athrow
      // 297: new java/lang/StringBuilder
      // 29a: dup
      // 29b: invokespecial java/lang/StringBuilder.<init> ()V
      // 29e: aload 10
      // 2a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a3: ldc "_"
      // 2a5: nop
      // 2a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ac: astore 10
      // 2ae: iload 6
      // 2b0: ifeq 3c3
      // 2b3: aload 0
      // 2b4: getfield y3n.bbf I
      // 2b7: bipush 6
      // 2b9: idiv
      // 2ba: bipush 2
      // 2bb: irem
      // 2bc: goto 2c3
      // 2bf: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c2: athrow
      // 2c3: ifne 2ee
      // 2c6: new java/lang/StringBuilder
      // 2c9: dup
      // 2ca: invokespecial java/lang/StringBuilder.<init> ()V
      // 2cd: aload 10
      // 2cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d2: ldc ""
      // 2d4: nop
      // 2d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d8: getstatic syo.du0 Lsyo;
      // 2db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2de: ldc "_"
      // 2e0: nop
      // 2e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e7: astore 10
      // 2e9: iload 6
      // 2eb: ifeq 3c3
      // 2ee: new java/lang/StringBuilder
      // 2f1: dup
      // 2f2: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f5: aload 10
      // 2f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fa: ldc ""
      // 2fc: nop
      // 2fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 300: getstatic syo.qiz Lsyo;
      // 303: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 306: ldc "_"
      // 308: nop
      // 309: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 30f: astore 10
      // 311: iload 6
      // 313: ifeq 3c3
      // 316: aload 0
      // 317: getfield y3n.nep I
      // 31a: goto 321
      // 31d: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 320: athrow
      // 321: iload 6
      // 323: ifne 3cc
      // 326: aload 0
      // 327: getfield y3n.qcp I
      // 32a: if_icmpeq 3c3
      // 32d: goto 334
      // 330: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 333: athrow
      // 334: aload 0
      // 335: getfield y3n.hai Lerg;
      // 338: invokevirtual erg.zso ()Lbdo;
      // 33b: invokestatic gy5.ruq (Lbdo;)Z
      // 33e: ifeq 384
      // 341: goto 348
      // 344: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 347: athrow
      // 348: aload 10
      // 34a: invokestatic ekw$szt.wnw (Ljava/lang/String;)Lekw;
      // 34d: astore 11
      // 34f: aload 0
      // 350: aload 11
      // 352: iload 6
      // 354: ifne 363
      // 357: ifnull 371
      // 35a: goto 361
      // 35d: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 360: athrow
      // 361: aload 11
      // 363: bipush 116
      // 365: aload 0
      // 366: getfield y3n.fex Lowt;
      // 369: bipush 1
      // 36a: bipush 1
      // 36b: invokestatic p_i.vtz (Lekw;ILowt;ZZ)Ljava/util/List;
      // 36e: goto 372
      // 371: aconst_null
      // 372: putfield y3n.smj Ljava/util/List;
      // 375: goto 3bb
      // 378: astore 11
      // 37a: aload 0
      // 37b: aconst_null
      // 37c: putfield y3n.smj Ljava/util/List;
      // 37f: iload 6
      // 381: ifeq 3bb
      // 384: new tao
      // 387: dup
      // 388: new java/lang/StringBuilder
      // 38b: dup
      // 38c: invokespecial java/lang/StringBuilder.<init> ()V
      // 38f: getstatic syo.id3 Lsyo;
      // 392: invokevirtual syo.toString ()Ljava/lang/String;
      // 395: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 398: sipush 12382
      // 39b: ldc2_w 1529811970439923888
      // 39e: lload 4
      // 3a0: lxor
      // 3a1: invokedynamic i (IJ)Ljava/lang/String; bsm=y3n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: nop
      // 3a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ad: invokespecial tao.<init> (Ljava/lang/String;)V
      // 3b0: astore 11
      // 3b2: aload 0
      // 3b3: aload 11
      // 3b5: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 3b8: putfield y3n.smj Ljava/util/List;
      // 3bb: aload 0
      // 3bc: aload 0
      // 3bd: getfield y3n.qcp I
      // 3c0: putfield y3n.nep I
      // 3c3: aload 0
      // 3c4: getfield y3n.fex Lowt;
      // 3c7: aload 9
      // 3c9: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 3cc: istore 11
      // 3ce: aload 0
      // 3cf: getfield y3n.fex Lowt;
      // 3d2: aload 9
      // 3d4: iload 7
      // 3d6: iload 11
      // 3d8: isub
      // 3d9: aload 0
      // 3da: getfield y3n.z46 I
      // 3dd: iadd
      // 3de: bipush 44
      // 3e0: isub
      // 3e1: i2f
      // 3e2: iload 8
      // 3e4: bipush 16
      // 3e6: iadd
      // 3e7: i2f
      // 3e8: bipush 0
      // 3e9: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 3ec: iload 6
      // 3ee: ifne 443
      // 3f1: pop
      // 3f2: aload 0
      // 3f3: getfield y3n.smj Ljava/util/List;
      // 3f6: ifnonnull 425
      // 3f9: goto 400
      // 3fc: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ff: athrow
      // 400: aload 0
      // 401: getfield y3n.fex Lowt;
      // 404: aload 10
      // 406: iload 7
      // 408: bipush 36
      // 40a: iadd
      // 40b: iload 8
      // 40d: bipush 16
      // 40f: iadd
      // 410: bipush 16
      // 412: iadd
      // 413: bipush 116
      // 415: bipush 0
      // 416: invokevirtual owt.bsn (Ljava/lang/String;IIII)V
      // 419: iload 6
      // 41b: ifeq 4c5
      // 41e: goto 425
      // 421: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 424: athrow
      // 425: sipush 128
      // 428: aload 0
      // 429: getfield y3n.fex Lowt;
      // 42c: getfield owt.rr7 I
      // 42f: idiv
      // 430: aload 0
      // 431: getfield y3n.smj Ljava/util/List;
      // 434: invokeinterface java/util/List.size ()I 1
      // 439: invokestatic java/lang/Math.min (II)I
      // 43c: goto 443
      // 43f: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 442: athrow
      // 443: istore 12
      // 445: bipush 0
      // 446: istore 13
      // 448: iload 13
      // 44a: iload 12
      // 44c: if_icmpge 49d
      // 44f: aload 0
      // 450: getfield y3n.smj Ljava/util/List;
      // 453: iload 13
      // 455: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 45a: checkcast ekw
      // 45d: astore 14
      // 45f: aload 0
      // 460: getfield y3n.fex Lowt;
      // 463: aload 14
      // 465: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 46a: iload 7
      // 46c: bipush 36
      // 46e: iadd
      // 46f: i2f
      // 470: iload 8
      // 472: bipush 16
      // 474: iadd
      // 475: bipush 16
      // 477: iadd
      // 478: iload 13
      // 47a: aload 0
      // 47b: getfield y3n.fex Lowt;
      // 47e: getfield owt.rr7 I
      // 481: imul
      // 482: iadd
      // 483: i2f
      // 484: bipush 0
      // 485: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 488: pop
      // 489: iinc 13 1
      // 48c: iload 6
      // 48e: ifne 4cc
      // 491: iload 6
      // 493: ifeq 448
      // 496: goto 49d
      // 499: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49c: athrow
      // 49d: aload 0
      // 49e: iload 1
      // 49f: iload 2
      // 4a0: invokevirtual y3n.l46 (II)Lekw;
      // 4a3: astore 13
      // 4a5: iload 6
      // 4a7: ifne 4cc
      // 4aa: aload 13
      // 4ac: ifnull 4c5
      // 4af: goto 4b6
      // 4b2: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b5: athrow
      // 4b6: aload 0
      // 4b7: aload 13
      // 4b9: iload 1
      // 4ba: iload 2
      // 4bb: invokevirtual y3n.p0k (Lekw;II)V
      // 4be: goto 4c5
      // 4c1: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c4: athrow
      // 4c5: aload 0
      // 4c6: iload 1
      // 4c7: iload 2
      // 4c8: fload 3
      // 4c9: invokespecial ShaderHelper.drawScreen (IIF)V
      // 4cc: return
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: iload 3
      // 06: ifne 2b
      // 09: aload 0
      // 0a: iload 1
      // 0b: iload 2
      // 0c: invokevirtual y3n.l46 (II)Lekw;
      // 0f: astore 5
      // 11: aload 0
      // 12: iload 4
      // 14: ifeq 2c
      // 17: aload 5
      // 19: invokevirtual y3n.owq (Lekw;)Z
      // 1c: ifeq 2b
      // 1f: goto 26
      // 22: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: return
      // 27: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: iload 1
      // 2d: iload 2
      // 2e: iload 3
      // 2f: invokespecial ShaderHelper.mouseClicked (III)V
      // 32: return
   }

   @Override
   public boolean owq(ekw param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aconst_null
      // 14: goto 24
      // 17: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokeinterface ekw.f4q ()Lpoy; 1
      // 21: invokevirtual poy.d6b ()Ltgr;
      // 24: astore 3
      // 25: aload 3
      // 26: iload 2
      // 27: ifne 3b
      // 2a: ifnonnull 3a
      // 2d: goto 34
      // 30: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 3
      // 3b: iload 2
      // 3c: ifne 57
      // 3f: invokevirtual tgr.vex ()Ltgr$a3_;
      // 42: getstatic tgr$a3_.obh Ltgr$a3_;
      // 45: if_acmpne be
      // 48: goto 4f
      // 4b: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 3
      // 50: goto 57
      // 53: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: invokevirtual tgr.uxt ()Ljava/lang/String;
      // 5a: astore 4
      // 5c: aload 4
      // 5e: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 61: bipush 1
      // 62: isub
      // 63: istore 5
      // 65: iload 5
      // 67: iload 2
      // 68: ifne 77
      // 6b: iflt b7
      // 6e: goto 75
      // 71: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: iload 5
      // 77: aload 0
      // 78: getfield y3n.bnt I
      // 7b: iload 2
      // 7c: ifne a1
      // 7f: if_icmpge b7
      // 82: goto 89
      // 85: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: iload 5
      // 8b: iload 2
      // 8c: ifne b6
      // 8f: goto 96
      // 92: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95: athrow
      // 96: aload 0
      // 97: getfield y3n.qcp I
      // 9a: goto a1
      // 9d: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: if_icmpeq b7
      // a4: aload 0
      // a5: iload 5
      // a7: putfield y3n.qcp I
      // aa: aload 0
      // ab: invokespecial y3n.kjh ()V
      // ae: bipush 1
      // af: goto b6
      // b2: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5: athrow
      // b6: ireturn
      // b7: goto bc
      // ba: astore 5
      // bc: bipush 0
      // bd: ireturn
      // be: aload 0
      // bf: aload 1
      // c0: invokespecial ShaderHelper.owq (Lekw;)Z
      // c3: istore 4
      // c5: iload 4
      // c7: iload 2
      // c8: ifne fa
      // cb: ifeq f8
      // ce: goto d5
      // d1: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d4: athrow
      // d5: aload 3
      // d6: invokevirtual tgr.vex ()Ltgr$a3_;
      // d9: getstatic tgr$a3_.qms Ltgr$a3_;
      // dc: if_acmpne f8
      // df: goto e6
      // e2: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e5: athrow
      // e6: aload 0
      // e7: getfield y3n.f41 Lc05;
      // ea: aconst_null
      // eb: checkcast ShaderHelper
      // ee: invokevirtual Minecraft.z2i (Lgbe;)V
      // f1: goto f8
      // f4: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // f7: athrow
      // f8: iload 4
      // fa: ireturn
   }

   public ekw l46(int param1, int param2) {
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
      // 005: getfield y3n.smj Ljava/util/List;
      // 008: ifnonnull 011
      // 00b: aconst_null
      // 00c: areturn
      // 00d: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 010: athrow
      // 011: iload 1
      // 012: aload 0
      // 013: getfield y3n.dt7 I
      // 016: aload 0
      // 017: getfield y3n.z46 I
      // 01a: isub
      // 01b: bipush 2
      // 01c: idiv
      // 01d: isub
      // 01e: bipush 36
      // 020: isub
      // 021: istore 4
      // 023: iload 2
      // 024: bipush 2
      // 025: isub
      // 026: bipush 16
      // 028: isub
      // 029: bipush 16
      // 02b: isub
      // 02c: istore 5
      // 02e: iload 4
      // 030: iload 3
      // 031: ifne 040
      // 034: iflt 14d
      // 037: goto 03e
      // 03a: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: iload 5
      // 040: iload 3
      // 041: ifne 06c
      // 044: iflt 14d
      // 047: goto 04e
      // 04a: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: sipush 128
      // 051: aload 0
      // 052: getfield y3n.fex Lowt;
      // 055: getfield owt.rr7 I
      // 058: idiv
      // 059: aload 0
      // 05a: getfield y3n.smj Ljava/util/List;
      // 05d: invokeinterface java/util/List.size ()I 1
      // 062: invokestatic java/lang/Math.min (II)I
      // 065: goto 06c
      // 068: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b: athrow
      // 06c: istore 6
      // 06e: iload 4
      // 070: bipush 116
      // 072: iload 3
      // 073: ifne 099
      // 076: if_icmpgt 14b
      // 079: goto 080
      // 07c: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: iload 5
      // 082: aload 0
      // 083: getfield y3n.f41 Lc05;
      // 086: getfield Minecraft.tx1 Lowt;
      // 089: getfield owt.rr7 I
      // 08c: iload 6
      // 08e: imul
      // 08f: iload 6
      // 091: iadd
      // 092: goto 099
      // 095: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: iload 3
      // 09a: ifne 0ba
      // 09d: if_icmpge 14b
      // 0a0: goto 0a7
      // 0a3: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: iload 5
      // 0a9: aload 0
      // 0aa: getfield y3n.f41 Lc05;
      // 0ad: getfield Minecraft.tx1 Lowt;
      // 0b0: getfield owt.rr7 I
      // 0b3: goto 0ba
      // 0b6: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: idiv
      // 0bb: istore 7
      // 0bd: iload 7
      // 0bf: iload 3
      // 0c0: ifne 0cf
      // 0c3: iflt 149
      // 0c6: goto 0cd
      // 0c9: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: iload 7
      // 0cf: aload 0
      // 0d0: getfield y3n.smj Ljava/util/List;
      // 0d3: invokeinterface java/util/List.size ()I 1
      // 0d8: if_icmpge 149
      // 0db: aload 0
      // 0dc: getfield y3n.smj Ljava/util/List;
      // 0df: iload 7
      // 0e1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e6: checkcast ekw
      // 0e9: astore 8
      // 0eb: bipush 0
      // 0ec: istore 9
      // 0ee: aload 8
      // 0f0: invokeinterface ekw.iterator ()Ljava/util/Iterator; 1
      // 0f5: astore 10
      // 0f7: aload 10
      // 0f9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0fe: ifeq 149
      // 101: aload 10
      // 103: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 108: checkcast ekw
      // 10b: astore 11
      // 10d: aload 11
      // 10f: instanceof tao
      // 112: iload 3
      // 113: ifne 139
      // 116: ifeq 145
      // 119: goto 120
      // 11c: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: iload 9
      // 122: aload 0
      // 123: getfield y3n.f41 Lc05;
      // 126: getfield Minecraft.tx1 Lowt;
      // 129: aload 11
      // 12b: checkcast tao
      // 12e: invokevirtual tao.rcd ()Ljava/lang/String;
      // 131: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 134: iadd
      // 135: istore 9
      // 137: iload 9
      // 139: iload 4
      // 13b: if_icmple 145
      // 13e: aload 11
      // 140: areturn
      // 141: invokestatic y3n.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 144: athrow
      // 145: iload 3
      // 146: ifeq 0f7
      // 149: aconst_null
      // 14a: areturn
      // 14b: aconst_null
      // 14c: areturn
      // 14d: aconst_null
      // 14e: areturn
   }

   public static gdz w_a() {
      return bmi;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(9007611179033324783L, -5665295902347048915L, MethodHandles.lookup().lookupClass()).a(61375918499400L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 101287970358635L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[17];
      int var5 = 0;
      String var4 = "P\u009b§8è\u0098ù\u0093\u0001ÀL\u0006V¨\u0015G¯Ë\u008b;Y\u009e\u0086\u00045ï2)\u009c\u0002Ýö\u001d\u001cûfÑ\u0081ó\u0017\u0010=óa='\u007fÇUþ<®\u0093\u0098só\u001a\u0010]ä¹¸\u0087¦; Ë\u0016g7xX\u0017\u00ad(j'º×tµDÏé£\u0083}4H\n£ÉÁ0õ\u008a\f\u001f\u0002ª\u0089\u009bý\u0086\u0096®K®\u0080A¿\u001c\u0007d¡\u0010¿g·uþ¼¹:n\u000f\u008e\u0014ä\u0010h« \u0016_Ñf\u008f\"¦¤\t¼ù¼\u0019\u008e\u0005M3Án\u0005\u0005\u0001\\\u0086\u009e\u0013\u001bÍN\r\u000b\u008c õØÑ;{2\u0093ã\u0002=\u0011%§*²Ò\u0086\u0088½\u008f\u0088ÓÐWR-\u0088tû@Ð\u000e «\u0086ÚFÿxh\u001clSx\u008fÆ3\b>\u0099¢\u0014÷)#\u0084*ó8\u0003rJ×[\u0085 \bÃ\u0014\u0092ÿ8P\u0013ñ\u0013\u009aeé\u0085\u0087Z\n\u00adþ\u0010\u0088C¼\"\u0090l\u0096\u00001\u0011à60É\u0096D\u0088-*ÏÙ¤ào\u0096\u0013»üE\fÜ¯i\u0019q£¥\u009d\u0000:\u008dºW&l\u0004\u001cÇÿ¤\u008eÒ¤\u000e\u001e\u0081,\u001fËÐ>\u0010Ò¬F¶O\u0019å\u0002÷\u008boäÇò\u0080ô\u0018½\u0081@aäP\u0007j.@Ð\u0084\u0082ó\u008eZÂn\u0087\u0083øá\u0000~ \u0094\u00000rq\u008cÍ\u0016m¥&\u0018\u001d¾-~eµÅò\u00adí)s\u007f\u0091Ü\"0ÒH\u0012(\u0080rÁ8ÞGh\u001cr\u001bN\u009d\u009b]\u0001Cè¼µ\u0086ªY^\u009dê+§d Ñ[\u008a}?^S»1ÿi ^#L\u001d\u0000~í¹\ff\u008bÙp-I\u001d\t<F÷³îi¾Ø@\u0000á\u0087àåÎ";
      int var6 = "P\u009b§8è\u0098ù\u0093\u0001ÀL\u0006V¨\u0015G¯Ë\u008b;Y\u009e\u0086\u00045ï2)\u009c\u0002Ýö\u001d\u001cûfÑ\u0081ó\u0017\u0010=óa='\u007fÇUþ<®\u0093\u0098só\u001a\u0010]ä¹¸\u0087¦; Ë\u0016g7xX\u0017\u00ad(j'º×tµDÏé£\u0083}4H\n£ÉÁ0õ\u008a\f\u001f\u0002ª\u0089\u009bý\u0086\u0096®K®\u0080A¿\u001c\u0007d¡\u0010¿g·uþ¼¹:n\u000f\u008e\u0014ä\u0010h« \u0016_Ñf\u008f\"¦¤\t¼ù¼\u0019\u008e\u0005M3Án\u0005\u0005\u0001\\\u0086\u009e\u0013\u001bÍN\r\u000b\u008c õØÑ;{2\u0093ã\u0002=\u0011%§*²Ò\u0086\u0088½\u008f\u0088ÓÐWR-\u0088tû@Ð\u000e «\u0086ÚFÿxh\u001clSx\u008fÆ3\b>\u0099¢\u0014÷)#\u0084*ó8\u0003rJ×[\u0085 \bÃ\u0014\u0092ÿ8P\u0013ñ\u0013\u009aeé\u0085\u0087Z\n\u00adþ\u0010\u0088C¼\"\u0090l\u0096\u00001\u0011à60É\u0096D\u0088-*ÏÙ¤ào\u0096\u0013»üE\fÜ¯i\u0019q£¥\u009d\u0000:\u008dºW&l\u0004\u001cÇÿ¤\u008eÒ¤\u000e\u001e\u0081,\u001fËÐ>\u0010Ò¬F¶O\u0019å\u0002÷\u008boäÇò\u0080ô\u0018½\u0081@aäP\u0007j.@Ð\u0084\u0082ó\u008eZÂn\u0087\u0083øá\u0000~ \u0094\u00000rq\u008cÍ\u0016m¥&\u0018\u001d¾-~eµÅò\u00adí)s\u007f\u0091Ü\"0ÒH\u0012(\u0080rÁ8ÞGh\u001cr\u001bN\u009d\u009b]\u0001Cè¼µ\u0086ªY^\u009dê+§d Ñ[\u008a}?^S»1ÿi ^#L\u001d\u0000~í¹\ff\u008bÙp-I\u001d\t<F÷³îi¾Ø@\u0000á\u0087àåÎ"
         .length();
      char var3 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     g = new String[17];
                     f0e = LogManager.getLogger();
                     bmi = new gdz(b<"i">(12418, 113101487496646565L ^ var9));
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

                  var4 = "ªC)Þ\u0087ýSÀ\u009eæ½\u008eQCv:ÐI\u0011C\u009c>C\u0098\u008d\fü\u0090¡À\u0083Ñ '\u001a'¡\u0083\bÚ\u0013qupôºCÊ´\u008d/\u0091{á~\u009bV£\u001f\\iÏy\u007fß";
                  var6 = "ªC)Þ\u0087ýSÀ\u009eæ½\u008eQCv:ÐI\u0011C\u009c>C\u0098\u008d\fü\u0090¡À\u0083Ñ '\u001a'¡\u0083\bÚ\u0013qupôºCÊ´\u008d/\u0091{á~\u009bV£\u001f\\iÏy\u007fß"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22737;
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
            throw new RuntimeException("y3n", var10);
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
         throw new RuntimeException("y3n" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
