import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Mouse;

public class nm6 {
   public String jg7;
   public String l8j;
   public boolean tru;
   public int ait;
   public int po6;
   public int oe7;
   public int ybp;
   private int xt9;
   private int w1e;
   private boolean jfx;
   public int mut;
   private float a23;
   public boolean yg5;
   private int dmu;
   private boolean jzv;
   private int dle;
   private boolean fzt;
   private boolean pae;
   public List yys = new ArrayList();
   public sbi esm = new sbi(20);
   public float vs1;
   public float y93;
   public float z11;
   public float _m2;

   public nm6(String var1, int var2, int var3) {
      this.ait = var2;
      this.po6 = var3;
      this.jg7 = var1;
      this.l8j = var1;
      this.oe7 = jvy.s15;
      this.ybp = jvy.nwy;
   }

   public void met() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 2
      // 002: getstatic jvy.nwy I
      // 005: istore 3
      // 006: invokestatic t9d.c ()I
      // 009: aload 0
      // 00a: getfield nm6.yys Ljava/util/List;
      // 00d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 012: astore 5
      // 014: istore 1
      // 015: aload 5
      // 017: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01c: ifeq 070
      // 01f: aload 5
      // 021: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 026: checkcast ak9
      // 029: astore 4
      // 02b: aload 4
      // 02d: iload 3
      // 02e: putfield ak9.ijd I
      // 031: iload 3
      // 032: aload 4
      // 034: invokevirtual ak9.eke ()Z
      // 037: iload 1
      // 038: ifne 0e3
      // 03b: iload 1
      // 03c: ifne 05c
      // 03f: goto 046
      // 042: invokestatic nm6.a (Loov;)Loov;
      // 045: athrow
      // 046: ifeq 05f
      // 049: goto 050
      // 04c: invokestatic nm6.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 4
      // 052: getfield ak9.c1c I
      // 055: goto 05c
      // 058: invokestatic nm6.a (Loov;)Loov;
      // 05b: athrow
      // 05c: goto 060
      // 05f: bipush 0
      // 060: iadd
      // 061: istore 3
      // 062: iload 2
      // 063: aload 4
      // 065: getfield ak9.vms I
      // 068: invokestatic java/lang/Math.max (II)I
      // 06b: istore 2
      // 06c: iload 1
      // 06d: ifeq 015
      // 070: aload 0
      // 071: getstatic jvy.s15 I
      // 074: iload 2
      // 075: invokestatic java/lang/Math.max (II)I
      // 078: putfield nm6.oe7 I
      // 07b: aload 0
      // 07c: getfield nm6.yys Ljava/util/List;
      // 07f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 084: astore 5
      // 086: aload 5
      // 088: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08d: ifeq 0b4
      // 090: aload 5
      // 092: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 097: checkcast ak9
      // 09a: astore 4
      // 09c: aload 4
      // 09e: aload 0
      // 09f: getfield nm6.oe7 I
      // 0a2: putfield ak9.vms I
      // 0a5: iload 1
      // 0a6: ifne 0c8
      // 0a9: iload 1
      // 0aa: ifeq 086
      // 0ad: goto 0b4
      // 0b0: invokestatic nm6.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: getstatic jvy.rz5 I
      // 0b8: iload 3
      // 0b9: invokestatic java/lang/Math.min (II)I
      // 0bc: putfield nm6.ybp I
      // 0bf: aload 0
      // 0c0: iload 3
      // 0c1: getstatic jvy.nwy I
      // 0c4: isub
      // 0c5: putfield nm6.dmu I
      // 0c8: aload 0
      // 0c9: getfield nm6.dle I
      // 0cc: iload 1
      // 0cd: ifne 10c
      // 0d0: aload 0
      // 0d1: getfield nm6.dmu I
      // 0d4: getstatic jvy.rz5 I
      // 0d7: getstatic jvy.nwy I
      // 0da: isub
      // 0db: isub
      // 0dc: goto 0e3
      // 0df: invokestatic nm6.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: if_icmple 0fd
      // 0e6: aload 0
      // 0e7: aload 0
      // 0e8: getfield nm6.dmu I
      // 0eb: getstatic jvy.rz5 I
      // 0ee: getstatic jvy.nwy I
      // 0f1: isub
      // 0f2: isub
      // 0f3: putfield nm6.dle I
      // 0f6: goto 0fd
      // 0f9: invokestatic nm6.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: iload 1
      // 0ff: ifne 110
      // 102: getfield nm6.dle I
      // 105: goto 10c
      // 108: invokestatic nm6.a (Loov;)Loov;
      // 10b: athrow
      // 10c: ifge 114
      // 10f: aload 0
      // 110: bipush 0
      // 111: putfield nm6.dle I
      // 114: return
   }

   public void c7j(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield nm6.tru Z
      // 008: iload 3
      // 009: ifne 034
      // 00c: ifne 025
      // 00f: goto 016
      // 012: invokestatic nm6.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield nm6.esm Lsbi;
      // 01a: bipush 0
      // 01b: invokevirtual sbi.qtk (Z)V
      // 01e: goto 025
      // 021: invokestatic nm6.a (Loov;)Loov;
      // 024: athrow
      // 025: aload 0
      // 026: iload 3
      // 027: ifne 053
      // 02a: getfield nm6.jfx Z
      // 02d: goto 034
      // 030: invokestatic nm6.a (Loov;)Loov;
      // 033: athrow
      // 034: ifeq 052
      // 037: aload 0
      // 038: iload 1
      // 039: aload 0
      // 03a: getfield nm6.xt9 I
      // 03d: isub
      // 03e: putfield nm6.ait I
      // 041: aload 0
      // 042: iload 2
      // 043: aload 0
      // 044: getfield nm6.w1e I
      // 047: isub
      // 048: putfield nm6.po6 I
      // 04b: goto 052
      // 04e: invokestatic nm6.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: aload 0
      // 054: getfield nm6.dmu I
      // 057: getstatic jvy.nwy I
      // 05a: iadd
      // 05b: iload 3
      // 05c: ifne 074
      // 05f: getstatic jvy.rz5 I
      // 062: if_icmple 077
      // 065: goto 06c
      // 068: invokestatic nm6.a (Loov;)Loov;
      // 06b: athrow
      // 06c: bipush 1
      // 06d: goto 074
      // 070: invokestatic nm6.a (Loov;)Loov;
      // 073: athrow
      // 074: goto 078
      // 077: bipush 0
      // 078: putfield nm6.yg5 Z
      // 07b: aload 0
      // 07c: getfield nm6.yys Ljava/util/List;
      // 07f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 084: astore 4
      // 086: aload 4
      // 088: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08d: ifeq 0b2
      // 090: aload 4
      // 092: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 097: checkcast ak9
      // 09a: astore 5
      // 09c: aload 5
      // 09e: iload 1
      // 09f: iload 2
      // 0a0: invokevirtual ak9.c2n (II)V
      // 0a3: iload 3
      // 0a4: ifne 16d
      // 0a7: iload 3
      // 0a8: ifeq 086
      // 0ab: goto 0b2
      // 0ae: invokestatic nm6.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield nm6.yg5 Z
      // 0b6: iload 3
      // 0b7: ifne 179
      // 0ba: ifeq 16d
      // 0bd: goto 0c4
      // 0c0: invokestatic nm6.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: getfield nm6.jzv Z
      // 0c8: iload 3
      // 0c9: ifne 179
      // 0cc: goto 0d3
      // 0cf: invokestatic nm6.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: ifeq 16d
      // 0d6: goto 0dd
      // 0d9: invokestatic nm6.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: iload 2
      // 0df: aload 0
      // 0e0: getfield nm6.po6 I
      // 0e3: isub
      // 0e4: i2f
      // 0e5: getstatic jvy.nwy I
      // 0e8: bipush 3
      // 0e9: iadd
      // 0ea: i2f
      // 0eb: getstatic jvy.dbl I
      // 0ee: i2f
      // 0ef: fconst_2
      // 0f0: fdiv
      // 0f1: fadd
      // 0f2: getstatic jvy.rz5 I
      // 0f5: bipush 3
      // 0f6: isub
      // 0f7: i2f
      // 0f8: getstatic jvy.dbl I
      // 0fb: i2f
      // 0fc: fconst_2
      // 0fd: fdiv
      // 0fe: fsub
      // 0ff: fconst_0
      // 100: fconst_1
      // 101: invokestatic rak.u1m (FFFFF)F
      // 104: putfield nm6.a23 F
      // 107: aload 0
      // 108: getfield nm6.a23 F
      // 10b: fconst_1
      // 10c: fcmpl
      // 10d: iload 3
      // 10e: ifne 13f
      // 111: goto 118
      // 114: invokestatic nm6.a (Loov;)Loov;
      // 117: athrow
      // 118: ifle 12e
      // 11b: goto 122
      // 11e: invokestatic nm6.a (Loov;)Loov;
      // 121: athrow
      // 122: aload 0
      // 123: fconst_1
      // 124: putfield nm6.a23 F
      // 127: goto 12e
      // 12a: invokestatic nm6.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 0
      // 12f: iload 3
      // 130: ifne 166
      // 133: getfield nm6.a23 F
      // 136: fconst_0
      // 137: fcmpg
      // 138: goto 13f
      // 13b: invokestatic nm6.a (Loov;)Loov;
      // 13e: athrow
      // 13f: ifge 14e
      // 142: aload 0
      // 143: fconst_0
      // 144: putfield nm6.a23 F
      // 147: goto 14e
      // 14a: invokestatic nm6.a (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 0
      // 14f: aload 0
      // 150: getfield nm6.a23 F
      // 153: aload 0
      // 154: getfield nm6.dmu I
      // 157: getstatic jvy.rz5 I
      // 15a: getstatic jvy.nwy I
      // 15d: isub
      // 15e: isub
      // 15f: i2f
      // 160: fmul
      // 161: f2i
      // 162: putfield nm6.mut I
      // 165: aload 0
      // 166: aload 0
      // 167: getfield nm6.mut I
      // 16a: putfield nm6.dle I
      // 16d: aload 0
      // 16e: getfield nm6.dle I
      // 171: aload 0
      // 172: getfield nm6.mut I
      // 175: isub
      // 176: invokestatic java/lang/Math.abs (I)I
      // 179: bipush 4
      // 17a: iload 3
      // 17b: ifne 1c1
      // 17e: if_icmpge 1b2
      // 181: goto 188
      // 184: invokestatic nm6.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 0
      // 189: aload 0
      // 18a: getfield nm6.dle I
      // 18d: putfield nm6.mut I
      // 190: aload 0
      // 191: aload 0
      // 192: getfield nm6.mut I
      // 195: i2f
      // 196: aload 0
      // 197: getfield nm6.dmu I
      // 19a: getstatic jvy.rz5 I
      // 19d: getstatic jvy.nwy I
      // 1a0: isub
      // 1a1: isub
      // 1a2: i2f
      // 1a3: fdiv
      // 1a4: putfield nm6.a23 F
      // 1a7: iload 3
      // 1a8: ifeq 240
      // 1ab: goto 1b2
      // 1ae: invokestatic nm6.a (Loov;)Loov;
      // 1b1: athrow
      // 1b2: aload 0
      // 1b3: getfield nm6.mut I
      // 1b6: aload 0
      // 1b7: getfield nm6.dle I
      // 1ba: goto 1c1
      // 1bd: invokestatic nm6.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: iload 3
      // 1c2: ifne 215
      // 1c5: if_icmple 1fb
      // 1c8: goto 1cf
      // 1cb: invokestatic nm6.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: aload 0
      // 1d0: dup
      // 1d1: getfield nm6.mut I
      // 1d4: bipush 4
      // 1d5: isub
      // 1d6: putfield nm6.mut I
      // 1d9: aload 0
      // 1da: aload 0
      // 1db: getfield nm6.mut I
      // 1de: i2f
      // 1df: aload 0
      // 1e0: getfield nm6.dmu I
      // 1e3: getstatic jvy.rz5 I
      // 1e6: getstatic jvy.nwy I
      // 1e9: isub
      // 1ea: isub
      // 1eb: i2f
      // 1ec: fdiv
      // 1ed: putfield nm6.a23 F
      // 1f0: iload 3
      // 1f1: ifeq 240
      // 1f4: goto 1fb
      // 1f7: invokestatic nm6.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: aload 0
      // 1fc: iload 3
      // 1fd: ifne 22a
      // 200: goto 207
      // 203: invokestatic nm6.a (Loov;)Loov;
      // 206: athrow
      // 207: getfield nm6.mut I
      // 20a: aload 0
      // 20b: getfield nm6.dle I
      // 20e: goto 215
      // 211: invokestatic nm6.a (Loov;)Loov;
      // 214: athrow
      // 215: if_icmpge 240
      // 218: aload 0
      // 219: dup
      // 21a: getfield nm6.mut I
      // 21d: bipush 4
      // 21e: iadd
      // 21f: putfield nm6.mut I
      // 222: aload 0
      // 223: goto 22a
      // 226: invokestatic nm6.a (Loov;)Loov;
      // 229: athrow
      // 22a: aload 0
      // 22b: getfield nm6.mut I
      // 22e: i2f
      // 22f: aload 0
      // 230: getfield nm6.dmu I
      // 233: getstatic jvy.rz5 I
      // 236: getstatic jvy.nwy I
      // 239: isub
      // 23a: isub
      // 23b: i2f
      // 23c: fdiv
      // 23d: putfield nm6.a23 F
      // 240: return
   }

   public void mm6(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield nm6.jfx Z
      // 008: iload 3
      // 009: ifeq 064
      // 00c: ifeq 049
      // 00f: goto 016
      // 012: invokestatic nm6.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield nm6.esm Lsbi;
      // 01a: iload 3
      // 01b: ifeq 041
      // 01e: goto 025
      // 021: invokestatic nm6.a (Loov;)Loov;
      // 024: athrow
      // 025: invokevirtual sbi.ds7 ()D
      // 028: ldc2_w 0.5
      // 02b: dcmpl
      // 02c: ifle 076
      // 02f: goto 036
      // 032: invokestatic nm6.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: getfield nm6.esm Lsbi;
      // 03a: goto 041
      // 03d: invokestatic nm6.a (Loov;)Loov;
      // 040: athrow
      // 041: bipush 0
      // 042: invokevirtual sbi.qtk (Z)V
      // 045: iload 3
      // 046: ifne 076
      // 049: aload 0
      // 04a: getfield nm6.esm Lsbi;
      // 04d: iload 3
      // 04e: ifeq 072
      // 051: goto 058
      // 054: invokestatic nm6.a (Loov;)Loov;
      // 057: athrow
      // 058: invokevirtual sbi.ds7 ()D
      // 05b: dconst_1
      // 05c: dcmpg
      // 05d: goto 064
      // 060: invokestatic nm6.a (Loov;)Loov;
      // 063: athrow
      // 064: ifge 076
      // 067: aload 0
      // 068: getfield nm6.esm Lsbi;
      // 06b: goto 072
      // 06e: invokestatic nm6.a (Loov;)Loov;
      // 071: athrow
      // 072: bipush 1
      // 073: invokevirtual sbi.qtk (Z)V
      // 076: new java/awt/Color
      // 079: dup
      // 07a: getstatic jvy.ck5 Z
      // 07d: ifeq 08a
      // 080: getstatic jvy.ts6 I
      // 083: goto 08d
      // 086: invokestatic nm6.a (Loov;)Loov;
      // 089: athrow
      // 08a: getstatic jvy.cnm I
      // 08d: invokespecial java/awt/Color.<init> (I)V
      // 090: astore 4
      // 092: new java/awt/Color
      // 095: dup
      // 096: aload 4
      // 098: invokevirtual java/awt/Color.getRed ()I
      // 09b: aload 4
      // 09d: invokevirtual java/awt/Color.getGreen ()I
      // 0a0: aload 4
      // 0a2: invokevirtual java/awt/Color.getBlue ()I
      // 0a5: aload 0
      // 0a6: getfield nm6.esm Lsbi;
      // 0a9: invokevirtual sbi.ds7 ()D
      // 0ac: ldc2_w 255.0
      // 0af: dmul
      // 0b0: d2i
      // 0b1: invokespecial java/awt/Color.<init> (IIII)V
      // 0b4: invokevirtual java/awt/Color.getRGB ()I
      // 0b7: istore 5
      // 0b9: getstatic jvy.nwy I
      // 0bc: istore 6
      // 0be: ldc 1.5
      // 0c0: nop
      // 0c1: fstore 7
      // 0c3: aload 0
      // 0c4: getfield nm6.ait I
      // 0c7: i2f
      // 0c8: ldc 1.5
      // 0ca: nop
      // 0cb: fsub
      // 0cc: aload 0
      // 0cd: getfield nm6.po6 I
      // 0d0: i2f
      // 0d1: aload 0
      // 0d2: getfield nm6.oe7 I
      // 0d5: i2f
      // 0d6: ldc 3.0
      // 0d8: nop
      // 0d9: fadd
      // 0da: iload 6
      // 0dc: i2f
      // 0dd: iload 5
      // 0df: invokestatic mkt.uk7 (FFFFI)V
      // 0e2: fconst_1
      // 0e3: fconst_1
      // 0e4: fconst_1
      // 0e5: fconst_1
      // 0e6: invokestatic hzu.wn0 (FFFF)V
      // 0e9: invokestatic hzu.if9 ()V
      // 0ec: getstatic jsr.eum Lcyb;
      // 0ef: aload 0
      // 0f0: getfield nm6.jg7 Ljava/lang/String;
      // 0f3: aload 0
      // 0f4: getfield nm6.ait I
      // 0f7: aload 0
      // 0f8: getfield nm6.oe7 I
      // 0fb: bipush 2
      // 0fc: isub
      // 0fd: i2d
      // 0fe: ldc2_w 2.0
      // 101: ddiv
      // 102: d2i
      // 103: iadd
      // 104: i2f
      // 105: aload 0
      // 106: getfield nm6.po6 I
      // 109: iload 6
      // 10b: bipush 2
      // 10c: idiv
      // 10d: iadd
      // 10e: i2f
      // 10f: getstatic jsr.eum Lcyb;
      // 112: aload 0
      // 113: getfield nm6.jg7 Ljava/lang/String;
      // 116: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 119: fconst_2
      // 11a: fdiv
      // 11b: fsub
      // 11c: ldc 0.5
      // 11e: nop
      // 11f: fadd
      // 120: ldc 16777215
      // 122: nop
      // 123: invokevirtual cyb.os_ (Ljava/lang/String;FFI)V
      // 126: bipush 0
      // 127: istore 8
      // 129: aload 0
      // 12a: getfield nm6.yys Ljava/util/List;
      // 12d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 132: astore 9
      // 134: aload 9
      // 136: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13b: ifeq 197
      // 13e: aload 9
      // 140: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 145: checkcast ak9
      // 148: astore 10
      // 14a: aload 10
      // 14c: invokevirtual ak9.kt6 ()Z
      // 14f: iload 3
      // 150: ifeq 19b
      // 153: iload 3
      // 154: ifeq 174
      // 157: goto 15e
      // 15a: invokestatic nm6.a (Loov;)Loov;
      // 15d: athrow
      // 15e: ifeq 193
      // 161: goto 168
      // 164: invokestatic nm6.a (Loov;)Loov;
      // 167: athrow
      // 168: aload 10
      // 16a: invokevirtual ak9.eke ()Z
      // 16d: goto 174
      // 170: invokestatic nm6.a (Loov;)Loov;
      // 173: athrow
      // 174: iload 3
      // 175: ifeq 191
      // 178: ifeq 193
      // 17b: goto 182
      // 17e: invokestatic nm6.a (Loov;)Loov;
      // 181: athrow
      // 182: iload 8
      // 184: aload 10
      // 186: getfield ak9.c1c I
      // 189: iadd
      // 18a: goto 191
      // 18d: invokestatic nm6.a (Loov;)Loov;
      // 190: athrow
      // 191: istore 8
      // 193: iload 3
      // 194: ifne 134
      // 197: aload 0
      // 198: getfield nm6.yg5 Z
      // 19b: iload 3
      // 19c: ifeq 1b6
      // 19f: ifeq 1b2
      // 1a2: goto 1a9
      // 1a5: invokestatic nm6.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: getstatic jvy.rz5 I
      // 1ac: getstatic jvy.nwy I
      // 1af: isub
      // 1b0: istore 8
      // 1b2: aload 0
      // 1b3: getfield nm6.ait I
      // 1b6: i2f
      // 1b7: aload 0
      // 1b8: getfield nm6.po6 I
      // 1bb: iload 6
      // 1bd: iadd
      // 1be: i2f
      // 1bf: aload 0
      // 1c0: getfield nm6.oe7 I
      // 1c3: i2f
      // 1c4: iload 8
      // 1c6: i2f
      // 1c7: getstatic jvy.ck5 Z
      // 1ca: iload 3
      // 1cb: ifeq 1db
      // 1ce: ifeq 1de
      // 1d1: goto 1d8
      // 1d4: invokestatic nm6.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: getstatic jvy.seg I
      // 1db: goto 1e1
      // 1de: getstatic jvy.ogc I
      // 1e1: invokestatic mkt.uk7 (FFFFI)V
      // 1e4: invokestatic hzu.vtj ()V
      // 1e7: aload 0
      // 1e8: getfield nm6.ait I
      // 1eb: i2f
      // 1ec: aload 0
      // 1ed: getfield nm6.po6 I
      // 1f0: i2f
      // 1f1: aload 0
      // 1f2: getfield nm6.ybp I
      // 1f5: getstatic jvy.nwy I
      // 1f8: isub
      // 1f9: i2d
      // 1fa: d2f
      // 1fb: fadd
      // 1fc: getstatic jvy.nwy I
      // 1ff: i2f
      // 200: fadd
      // 201: aload 0
      // 202: getfield nm6.oe7 I
      // 205: i2f
      // 206: aload 0
      // 207: getfield nm6.ybp I
      // 20a: getstatic jvy.nwy I
      // 20d: isub
      // 20e: i2f
      // 20f: invokestatic mkt.zxh (FFFF)V
      // 212: aload 0
      // 213: aload 0
      // 214: getfield nm6.ait I
      // 217: i2f
      // 218: putfield nm6.vs1 F
      // 21b: aload 0
      // 21c: aload 0
      // 21d: getfield nm6.po6 I
      // 220: i2f
      // 221: aload 0
      // 222: getfield nm6.ybp I
      // 225: getstatic jvy.nwy I
      // 228: isub
      // 229: i2d
      // 22a: d2f
      // 22b: fadd
      // 22c: getstatic jvy.nwy I
      // 22f: i2f
      // 230: fadd
      // 231: putfield nm6.y93 F
      // 234: aload 0
      // 235: aload 0
      // 236: getfield nm6.oe7 I
      // 239: i2f
      // 23a: putfield nm6.z11 F
      // 23d: aload 0
      // 23e: aload 0
      // 23f: getfield nm6.ybp I
      // 242: getstatic jvy.nwy I
      // 245: isub
      // 246: i2f
      // 247: putfield nm6._m2 F
      // 24a: aload 0
      // 24b: getfield nm6.yys Ljava/util/List;
      // 24e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 253: astore 9
      // 255: aload 9
      // 257: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 25c: ifeq 294
      // 25f: aload 9
      // 261: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 266: checkcast ak9
      // 269: astore 10
      // 26b: aload 10
      // 26d: iload 3
      // 26e: ifeq 28b
      // 271: invokevirtual ak9.kt6 ()Z
      // 274: iload 3
      // 275: ifeq 298
      // 278: goto 27f
      // 27b: invokestatic nm6.a (Loov;)Loov;
      // 27e: athrow
      // 27f: ifeq 290
      // 282: goto 289
      // 285: invokestatic nm6.a (Loov;)Loov;
      // 288: athrow
      // 289: aload 10
      // 28b: iload 1
      // 28c: iload 2
      // 28d: invokevirtual ak9.ta0 (II)V
      // 290: iload 3
      // 291: ifne 255
      // 294: aload 0
      // 295: getfield nm6.yg5 Z
      // 298: iload 3
      // 299: ifeq 2cf
      // 29c: ifeq 2f2
      // 29f: goto 2a6
      // 2a2: invokestatic nm6.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: aload 0
      // 2a7: getfield nm6.a23 F
      // 2aa: fconst_0
      // 2ab: fconst_1
      // 2ac: fconst_1
      // 2ad: getstatic jvy.rz5 I
      // 2b0: getstatic jvy.nwy I
      // 2b3: isub
      // 2b4: getstatic jvy.dbl I
      // 2b7: isub
      // 2b8: i2f
      // 2b9: fconst_1
      // 2ba: fsub
      // 2bb: invokestatic rak.u1m (FFFFF)F
      // 2be: f2i
      // 2bf: aload 0
      // 2c0: getfield nm6.po6 I
      // 2c3: iadd
      // 2c4: getstatic jvy.nwy I
      // 2c7: iadd
      // 2c8: goto 2cf
      // 2cb: invokestatic nm6.a (Loov;)Loov;
      // 2ce: athrow
      // 2cf: istore 9
      // 2d1: aload 0
      // 2d2: getfield nm6.ait I
      // 2d5: aload 0
      // 2d6: getfield nm6.oe7 I
      // 2d9: iadd
      // 2da: getstatic jvy.ynu I
      // 2dd: isub
      // 2de: bipush 1
      // 2df: isub
      // 2e0: i2f
      // 2e1: iload 9
      // 2e3: i2f
      // 2e4: getstatic jvy.ynu I
      // 2e7: i2f
      // 2e8: getstatic jvy.dbl I
      // 2eb: i2f
      // 2ec: getstatic jvy.hb0 I
      // 2ef: invokestatic mkt.uk7 (FFFFI)V
      // 2f2: invokestatic mkt.dkk ()V
      // 2f5: return
   }

   public void vsr(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: iload 1
      // 007: iload 2
      // 008: invokevirtual nm6.au1 (II)Z
      // 00b: iload 4
      // 00d: ifne 266
      // 010: ifeq 24f
      // 013: goto 01a
      // 016: invokestatic nm6.a (Loov;)Loov;
      // 019: athrow
      // 01a: getstatic jvy.nwy I
      // 01d: istore 5
      // 01f: aload 0
      // 020: iload 1
      // 021: i2f
      // 022: iload 2
      // 023: i2f
      // 024: aload 0
      // 025: getfield nm6.ait I
      // 028: aload 0
      // 029: getfield nm6.oe7 I
      // 02c: iadd
      // 02d: iload 5
      // 02f: isub
      // 030: i2f
      // 031: aload 0
      // 032: getfield nm6.po6 I
      // 035: i2f
      // 036: aload 0
      // 037: getfield nm6.ait I
      // 03a: aload 0
      // 03b: getfield nm6.oe7 I
      // 03e: iadd
      // 03f: i2f
      // 040: aload 0
      // 041: getfield nm6.po6 I
      // 044: iload 5
      // 046: iadd
      // 047: i2f
      // 048: invokestatic rak.c38 (FFFFFF)Z
      // 04b: putfield nm6.fzt Z
      // 04e: aload 0
      // 04f: getfield nm6.pae Z
      // 052: iload 4
      // 054: ifne 087
      // 057: ifne 083
      // 05a: goto 061
      // 05d: invokestatic nm6.a (Loov;)Loov;
      // 060: athrow
      // 061: iload 3
      // 062: iload 4
      // 064: ifne 087
      // 067: goto 06e
      // 06a: invokestatic nm6.a (Loov;)Loov;
      // 06d: athrow
      // 06e: ifeq 083
      // 071: goto 078
      // 074: invokestatic nm6.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 0
      // 079: invokevirtual nm6.xsv ()V
      // 07c: goto 083
      // 07f: invokestatic nm6.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 0
      // 084: getfield nm6.fzt Z
      // 087: iload 4
      // 089: ifne 0de
      // 08c: ifeq 0bb
      // 08f: goto 096
      // 092: invokestatic nm6.a (Loov;)Loov;
      // 095: athrow
      // 096: aload 0
      // 097: getfield nm6.pae Z
      // 09a: iload 4
      // 09c: ifne 0de
      // 09f: goto 0a6
      // 0a2: invokestatic nm6.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: ifne 0bb
      // 0a9: goto 0b0
      // 0ac: invokestatic nm6.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: iload 3
      // 0b1: ifeq 0bb
      // 0b4: goto 0bb
      // 0b7: invokestatic nm6.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: iload 1
      // 0bc: i2f
      // 0bd: iload 2
      // 0be: i2f
      // 0bf: aload 0
      // 0c0: getfield nm6.ait I
      // 0c3: i2f
      // 0c4: aload 0
      // 0c5: getfield nm6.po6 I
      // 0c8: i2f
      // 0c9: aload 0
      // 0ca: getfield nm6.ait I
      // 0cd: aload 0
      // 0ce: getfield nm6.oe7 I
      // 0d1: iadd
      // 0d2: i2f
      // 0d3: aload 0
      // 0d4: getfield nm6.po6 I
      // 0d7: iload 5
      // 0d9: iadd
      // 0da: i2f
      // 0db: invokestatic rak.c38 (FFFFFF)Z
      // 0de: istore 6
      // 0e0: aload 0
      // 0e1: getfield nm6.fzt Z
      // 0e4: iload 4
      // 0e6: ifne 169
      // 0e9: ifne 161
      // 0ec: goto 0f3
      // 0ef: invokestatic nm6.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: iload 6
      // 0f5: iload 4
      // 0f7: ifne 169
      // 0fa: goto 101
      // 0fd: invokestatic nm6.a (Loov;)Loov;
      // 100: athrow
      // 101: ifeq 161
      // 104: goto 10b
      // 107: invokestatic nm6.a (Loov;)Loov;
      // 10a: athrow
      // 10b: aload 0
      // 10c: getfield nm6.pae Z
      // 10f: iload 4
      // 111: ifne 169
      // 114: goto 11b
      // 117: invokestatic nm6.a (Loov;)Loov;
      // 11a: athrow
      // 11b: ifne 161
      // 11e: goto 125
      // 121: invokestatic nm6.a (Loov;)Loov;
      // 124: athrow
      // 125: iload 3
      // 126: iload 4
      // 128: ifne 169
      // 12b: goto 132
      // 12e: invokestatic nm6.a (Loov;)Loov;
      // 131: athrow
      // 132: ifeq 161
      // 135: goto 13c
      // 138: invokestatic nm6.a (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 0
      // 13d: bipush 1
      // 13e: putfield nm6.jfx Z
      // 141: aload 0
      // 142: iload 1
      // 143: aload 0
      // 144: getfield nm6.ait I
      // 147: isub
      // 148: putfield nm6.xt9 I
      // 14b: aload 0
      // 14c: iload 2
      // 14d: aload 0
      // 14e: getfield nm6.po6 I
      // 151: isub
      // 152: putfield nm6.w1e I
      // 155: iload 4
      // 157: ifeq 184
      // 15a: goto 161
      // 15d: invokestatic nm6.a (Loov;)Loov;
      // 160: athrow
      // 161: iload 3
      // 162: goto 169
      // 165: invokestatic nm6.a (Loov;)Loov;
      // 168: athrow
      // 169: iload 4
      // 16b: ifne 186
      // 16e: ifne 184
      // 171: goto 178
      // 174: invokestatic nm6.a (Loov;)Loov;
      // 177: athrow
      // 178: aload 0
      // 179: bipush 0
      // 17a: putfield nm6.jfx Z
      // 17d: goto 184
      // 180: invokestatic nm6.a (Loov;)Loov;
      // 183: athrow
      // 184: iload 6
      // 186: ifne 1eb
      // 189: aload 0
      // 18a: getfield nm6.yys Ljava/util/List;
      // 18d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 192: astore 8
      // 194: aload 8
      // 196: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19b: ifeq 24a
      // 19e: aload 8
      // 1a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a5: checkcast ak9
      // 1a8: astore 7
      // 1aa: iload 4
      // 1ac: ifne 295
      // 1af: aload 7
      // 1b1: invokevirtual ak9.kt6 ()Z
      // 1b4: iload 4
      // 1b6: ifne 1db
      // 1b9: goto 1c0
      // 1bc: invokestatic nm6.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: ifeq 194
      // 1c3: goto 1ca
      // 1c6: invokestatic nm6.a (Loov;)Loov;
      // 1c9: athrow
      // 1ca: aload 7
      // 1cc: iload 4
      // 1ce: ifne 1e0
      // 1d1: invokevirtual ak9.eke ()Z
      // 1d4: goto 1db
      // 1d7: invokestatic nm6.a (Loov;)Loov;
      // 1da: athrow
      // 1db: ifeq 194
      // 1de: aload 7
      // 1e0: iload 1
      // 1e1: iload 2
      // 1e2: iload 3
      // 1e3: invokevirtual ak9.x6o (IIZ)V
      // 1e6: iload 4
      // 1e8: ifeq 194
      // 1eb: aload 0
      // 1ec: getfield nm6.yys Ljava/util/List;
      // 1ef: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1f4: astore 8
      // 1f6: aload 8
      // 1f8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1fd: ifeq 24a
      // 200: aload 8
      // 202: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 207: checkcast ak9
      // 20a: astore 7
      // 20c: iload 4
      // 20e: ifne 295
      // 211: aload 7
      // 213: invokevirtual ak9.kt6 ()Z
      // 216: iload 4
      // 218: ifne 23d
      // 21b: goto 222
      // 21e: invokestatic nm6.a (Loov;)Loov;
      // 221: athrow
      // 222: ifeq 1f6
      // 225: goto 22c
      // 228: invokestatic nm6.a (Loov;)Loov;
      // 22b: athrow
      // 22c: aload 7
      // 22e: iload 4
      // 230: ifne 242
      // 233: invokevirtual ak9.eke ()Z
      // 236: goto 23d
      // 239: invokestatic nm6.a (Loov;)Loov;
      // 23c: athrow
      // 23d: ifeq 1f6
      // 240: aload 7
      // 242: invokevirtual ak9.vx9 ()V
      // 245: iload 4
      // 247: ifeq 1f6
      // 24a: iload 4
      // 24c: ifeq 290
      // 24f: aload 0
      // 250: iload 4
      // 252: ifne 28d
      // 255: goto 25c
      // 258: invokestatic nm6.a (Loov;)Loov;
      // 25b: athrow
      // 25c: getfield nm6.jfx Z
      // 25f: goto 266
      // 262: invokestatic nm6.a (Loov;)Loov;
      // 265: athrow
      // 266: ifeq 285
      // 269: iload 3
      // 26a: ifne 290
      // 26d: goto 274
      // 270: invokestatic nm6.a (Loov;)Loov;
      // 273: athrow
      // 274: aload 0
      // 275: bipush 0
      // 276: putfield nm6.jfx Z
      // 279: iload 4
      // 27b: ifeq 290
      // 27e: goto 285
      // 281: invokestatic nm6.a (Loov;)Loov;
      // 284: athrow
      // 285: aload 0
      // 286: goto 28d
      // 289: invokestatic nm6.a (Loov;)Loov;
      // 28c: athrow
      // 28d: invokevirtual nm6.g1l ()V
      // 290: aload 0
      // 291: iload 3
      // 292: putfield nm6.pae Z
      // 295: return
   }

   public void xsv() {
      ArrayList var1 = new ArrayList();
      var1.addAll(zwr.qkk.e6d().brz);
      var1.remove(this);
      var1.add(0, this);
      zwr.qkk.e6d().brz = var1;
   }

   public void bxr(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 1
      // 07: iload 2
      // 08: invokevirtual nm6.au1 (II)Z
      // 0b: iload 4
      // 0d: ifeq 1d
      // 10: ifeq f1
      // 13: goto 1a
      // 16: invokestatic nm6.a (Loov;)Loov;
      // 19: athrow
      // 1a: invokestatic org/lwjgl/input/Mouse.getEventDWheel ()I
      // 1d: istore 5
      // 1f: iload 5
      // 21: iload 4
      // 23: ifeq 32
      // 26: ifeq c8
      // 29: goto 30
      // 2c: invokestatic nm6.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 5
      // 32: iload 4
      // 34: ifeq 52
      // 37: ifle 49
      // 3a: goto 41
      // 3d: invokestatic nm6.a (Loov;)Loov;
      // 40: athrow
      // 41: bipush -1
      // 42: istore 5
      // 44: iload 4
      // 46: ifne 64
      // 49: iload 5
      // 4b: goto 52
      // 4e: invokestatic nm6.a (Loov;)Loov;
      // 51: athrow
      // 52: iload 4
      // 54: ifeq 77
      // 57: ifge 64
      // 5a: goto 61
      // 5d: invokestatic nm6.a (Loov;)Loov;
      // 60: athrow
      // 61: bipush 1
      // 62: istore 5
      // 64: aload 0
      // 65: dup
      // 66: getfield nm6.dle I
      // 69: iload 5
      // 6b: getstatic jvy.nwy I
      // 6e: imul
      // 6f: iadd
      // 70: putfield nm6.dle I
      // 73: aload 0
      // 74: getfield nm6.dle I
      // 77: iload 4
      // 79: ifeq b9
      // 7c: aload 0
      // 7d: getfield nm6.dmu I
      // 80: getstatic jvy.rz5 I
      // 83: getstatic jvy.nwy I
      // 86: isub
      // 87: isub
      // 88: if_icmple a9
      // 8b: goto 92
      // 8e: invokestatic nm6.a (Loov;)Loov;
      // 91: athrow
      // 92: aload 0
      // 93: aload 0
      // 94: getfield nm6.dmu I
      // 97: getstatic jvy.rz5 I
      // 9a: getstatic jvy.nwy I
      // 9d: isub
      // 9e: isub
      // 9f: putfield nm6.dle I
      // a2: goto a9
      // a5: invokestatic nm6.a (Loov;)Loov;
      // a8: athrow
      // a9: aload 0
      // aa: iload 4
      // ac: ifeq c9
      // af: getfield nm6.dle I
      // b2: goto b9
      // b5: invokestatic nm6.a (Loov;)Loov;
      // b8: athrow
      // b9: ifge c8
      // bc: aload 0
      // bd: bipush 0
      // be: putfield nm6.dle I
      // c1: goto c8
      // c4: invokestatic nm6.a (Loov;)Loov;
      // c7: athrow
      // c8: aload 0
      // c9: getfield nm6.yys Ljava/util/List;
      // cc: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // d1: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, nm6.gqv (Lak9;)Z, (Lak9;)Z ]
      // d6: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // db: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, nm6.nc1 (Lak9;)Lu_s;, (Lak9;)Lu_s; ]
      // e0: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // e5: iload 1
      // e6: iload 2
      // e7: invokedynamic accept (II)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, nm6.irz (IILu_s;)V, (Lu_s;)V ]
      // ec: invokeinterface java/util/stream/Stream.forEach (Ljava/util/function/Consumer;)V 2
      // f1: return
   }

   public void dz1() {
   }

   public boolean zd3(int var1, int var2) {
      return rak.c38((float)var1, (float)var2, (float)this.ait, (float)this.po6, (float)(this.ait + this.oe7), (float)(this.po6 + this.ybp));
   }

   public boolean au1(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 4
      // 03: invokestatic t9d.c ()I
      // 06: getstatic zwr.qkk Lzwr;
      // 09: invokevirtual zwr.e6d ()Ljvy;
      // 0c: getfield jvy.brz Ljava/util/List;
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 5
      // 16: istore 3
      // 17: aload 5
      // 19: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e: ifeq 6f
      // 21: aload 5
      // 23: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 28: checkcast nm6
      // 2b: astore 6
      // 2d: aload 6
      // 2f: getfield nm6.tru Z
      // 32: iload 3
      // 33: ifne 94
      // 36: iload 3
      // 37: ifne 64
      // 3a: goto 41
      // 3d: invokestatic nm6.a (Loov;)Loov;
      // 40: athrow
      // 41: ifeq 6b
      // 44: goto 4b
      // 47: invokestatic nm6.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 6
      // 4d: iload 3
      // 4e: ifne 69
      // 51: goto 58
      // 54: invokestatic nm6.a (Loov;)Loov;
      // 57: athrow
      // 58: iload 1
      // 59: iload 2
      // 5a: invokevirtual nm6.zd3 (II)Z
      // 5d: goto 64
      // 60: invokestatic nm6.a (Loov;)Loov;
      // 63: athrow
      // 64: ifeq 6b
      // 67: aload 6
      // 69: astore 4
      // 6b: iload 3
      // 6c: ifeq 17
      // 6f: aload 4
      // 71: iload 3
      // 72: ifne 81
      // 75: ifnull 93
      // 78: goto 7f
      // 7b: invokestatic nm6.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 4
      // 81: getfield nm6.l8j Ljava/lang/String;
      // 84: aload 0
      // 85: getfield nm6.l8j Ljava/lang/String;
      // 88: if_acmpne 93
      // 8b: bipush 1
      // 8c: goto 94
      // 8f: invokestatic nm6.a (Loov;)Loov;
      // 92: athrow
      // 93: bipush 0
      // 94: ireturn
   }

   public void e79() {
      this.ait = Math.max(this.ait, 0);
      this.po6 = Math.max(this.po6, 0);
      this.ait = Math.min(this.ait, mkt.b_f() - jvy.s15);
      this.po6 = Math.min(this.po6, mkt.e_m() - jvy.nwy);
   }

   public void g1l() {
      this.fzt = false;
      this.jfx = false;
      this.yys.stream().filter(nm6::u57).forEach(ak9::vx9);
   }

   public boolean bdz(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield nm6.yg5 Z
      // 08: iload 3
      // 09: ifne 23
      // 0c: ifeq 7c
      // 0f: goto 16
      // 12: invokestatic nm6.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: iload 2
      // 19: invokevirtual nm6.au1 (II)Z
      // 1c: goto 23
      // 1f: invokestatic nm6.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 3
      // 24: ifne 6a
      // 27: ifeq 7c
      // 2a: goto 31
      // 2d: invokestatic nm6.a (Loov;)Loov;
      // 30: athrow
      // 31: iload 1
      // 32: i2f
      // 33: iload 2
      // 34: i2f
      // 35: aload 0
      // 36: getfield nm6.ait I
      // 39: aload 0
      // 3a: getfield nm6.oe7 I
      // 3d: iadd
      // 3e: getstatic jvy.ynu I
      // 41: isub
      // 42: i2f
      // 43: aload 0
      // 44: getfield nm6.po6 I
      // 47: getstatic jvy.nwy I
      // 4a: iadd
      // 4b: i2f
      // 4c: aload 0
      // 4d: getfield nm6.ait I
      // 50: aload 0
      // 51: getfield nm6.oe7 I
      // 54: iadd
      // 55: i2f
      // 56: aload 0
      // 57: getfield nm6.po6 I
      // 5a: aload 0
      // 5b: getfield nm6.ybp I
      // 5e: iadd
      // 5f: i2f
      // 60: invokestatic rak.c38 (FFFFFF)Z
      // 63: goto 6a
      // 66: invokestatic nm6.a (Loov;)Loov;
      // 69: athrow
      // 6a: iload 3
      // 6b: ifne 79
      // 6e: ifeq 7c
      // 71: goto 78
      // 74: invokestatic nm6.a (Loov;)Loov;
      // 77: athrow
      // 78: bipush 1
      // 79: goto 7d
      // 7c: bipush 0
      // 7d: ireturn
   }

   public int s1s() {
      return this.oe7;
   }

   public int fs7() {
      return this.ybp;
   }

   private static boolean u57(ak9 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual ak9.kt6 ()Z
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic nm6.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual ak9.eke ()Z
      // 1a: goto 21
      // 1d: invokestatic nm6.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 30
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic nm6.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   private static void irz(int var0, int var1, u_s var2) {
      var2.ugh(var0, var1, Mouse.getEventDWheel());
   }

   private static u_s nc1(ak9 var0) {
      return (u_s)var0;
   }

   private static boolean gqv(ak9 var0) {
      return var0 instanceof u_s;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
