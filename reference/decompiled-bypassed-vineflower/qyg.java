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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class qyg extends zg9 {
   private static final Logger yct;
   private static final gdz ywo;
   private a7q jrm;
   private qyg$bpd ur5;
   private qyg$bpd j0o;
   private int mji;
   private ekw amw;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public qyg(jnq var1, a7q var2, t9d var3) {
      super(new y43(var1, var2, var3));
      this.jrm = var2;
      this.amw = var2.xyw();
   }

   @Override
   public void initGui() {
      super.initGui();
      int var1 = (this.dt7 - this.poy) / 2;
      int var2 = (this.o1e - this.g6l) / 2;
      this.khf.add(this.ur5 = new qyg$bpd(1, var1 + 120 + 27, var2 + 24 - 1, true));
      this.khf.add(this.j0o = new qyg$bpd(2, var1 + 36 - 19, var2 + 24 - 1, false));
      this.ur5.c9a = false;
      this.j0o.c9a = false;
   }

   @Override
   public void qw3(int var1, int var2) {
      long var3 = a ^ 119207890637243L;
      String var5 = this.amw.rnh();
      this.fex.eh6(var5, (float)(this.poy / 2 - this.fex.ezt(var5) / 2), 6.0F, 4210752);
      this.fex.eh6(fc1.gx1(b<"f">(9539, 5076209328516579921L ^ var3), new Object[0]), 8.0F, (float)(this.g6l - 96 + 2), 4210752);
   }

   @Override
   public void updateScreen() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial zg9.updateScreen ()V
      // 04: invokestatic t9d.c ()I
      // 07: aload 0
      // 08: getfield qyg.jrm La7q;
      // 0b: aload 0
      // 0c: getfield qyg.f41 Lc05;
      // 0f: getfield c05.vg8 Ll86;
      // 12: invokeinterface a7q.zyi (Lha9;)Lskn; 2
      // 17: astore 2
      // 18: istore 1
      // 19: aload 2
      // 1a: ifnull 6d
      // 1d: aload 0
      // 1e: getfield qyg.ur5 Lqyg$bpd;
      // 21: aload 0
      // 22: getfield qyg.mji I
      // 25: iload 1
      // 26: ifne 48
      // 29: goto 30
      // 2c: invokestatic qyg.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 2
      // 31: invokevirtual skn.size ()I
      // 34: bipush 1
      // 35: isub
      // 36: if_icmpge 4b
      // 39: goto 40
      // 3c: invokestatic qyg.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 48
      // 44: invokestatic qyg.a (Loov;)Loov;
      // 47: athrow
      // 48: goto 4c
      // 4b: bipush 0
      // 4c: putfield qyg$bpd.c9a Z
      // 4f: aload 0
      // 50: getfield qyg.j0o Lqyg$bpd;
      // 53: aload 0
      // 54: getfield qyg.mji I
      // 57: iload 1
      // 58: ifne 66
      // 5b: ifle 69
      // 5e: goto 65
      // 61: invokestatic qyg.a (Loov;)Loov;
      // 64: athrow
      // 65: bipush 1
      // 66: goto 6a
      // 69: bipush 0
      // 6a: putfield qyg$bpd.c9a Z
      // 6d: return
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
      // 000: getstatic qyg.a J
      // 003: ldc2_w 43240192456541
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: bipush 0
      // 00e: istore 5
      // 010: aload 1
      // 011: aload 0
      // 012: getfield qyg.ur5 Lqyg$bpd;
      // 015: iload 4
      // 017: ifne 096
      // 01a: if_acmpne 08a
      // 01d: goto 024
      // 020: invokestatic qyg.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: dup
      // 026: getfield qyg.mji I
      // 029: bipush 1
      // 02a: iadd
      // 02b: putfield qyg.mji I
      // 02e: aload 0
      // 02f: getfield qyg.jrm La7q;
      // 032: aload 0
      // 033: getfield qyg.f41 Lc05;
      // 036: getfield c05.vg8 Ll86;
      // 039: invokeinterface a7q.zyi (Lha9;)Lskn; 2
      // 03e: astore 6
      // 040: iload 4
      // 042: ifne 085
      // 045: aload 6
      // 047: ifnull 082
      // 04a: goto 051
      // 04d: invokestatic qyg.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 0
      // 052: getfield qyg.mji I
      // 055: iload 4
      // 057: ifne 083
      // 05a: goto 061
      // 05d: invokestatic qyg.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 6
      // 063: invokevirtual skn.size ()I
      // 066: if_icmplt 082
      // 069: goto 070
      // 06c: invokestatic qyg.a (Loov;)Loov;
      // 06f: athrow
      // 070: aload 0
      // 071: aload 6
      // 073: invokevirtual skn.size ()I
      // 076: bipush 1
      // 077: isub
      // 078: putfield qyg.mji I
      // 07b: goto 082
      // 07e: invokestatic qyg.a (Loov;)Loov;
      // 081: athrow
      // 082: bipush 1
      // 083: istore 5
      // 085: iload 4
      // 087: ifeq 0cc
      // 08a: aload 1
      // 08b: aload 0
      // 08c: getfield qyg.j0o Lqyg$bpd;
      // 08f: goto 096
      // 092: invokestatic qyg.a (Loov;)Loov;
      // 095: athrow
      // 096: if_acmpne 0cc
      // 099: aload 0
      // 09a: dup
      // 09b: getfield qyg.mji I
      // 09e: bipush 1
      // 09f: isub
      // 0a0: putfield qyg.mji I
      // 0a3: aload 0
      // 0a4: getfield qyg.mji I
      // 0a7: iload 4
      // 0a9: ifne 0ca
      // 0ac: goto 0b3
      // 0af: invokestatic qyg.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: ifge 0c9
      // 0b6: goto 0bd
      // 0b9: invokestatic qyg.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: bipush 0
      // 0bf: putfield qyg.mji I
      // 0c2: goto 0c9
      // 0c5: invokestatic qyg.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: bipush 1
      // 0ca: istore 5
      // 0cc: iload 5
      // 0ce: ifeq 116
      // 0d1: aload 0
      // 0d2: getfield qyg.h2l L_jc;
      // 0d5: checkcast y43
      // 0d8: aload 0
      // 0d9: getfield qyg.mji I
      // 0dc: invokevirtual y43._aw (I)V
      // 0df: new nfj
      // 0e2: dup
      // 0e3: invokestatic io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
      // 0e6: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 0e9: astore 6
      // 0eb: aload 6
      // 0ed: aload 0
      // 0ee: getfield qyg.mji I
      // 0f1: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 0f4: pop
      // 0f5: aload 0
      // 0f6: getfield qyg.f41 Lc05;
      // 0f9: invokevirtual c05.c02 ()Lp_k;
      // 0fc: new net/minecraft/network/play/client/C17PacketCustomPayload
      // 0ff: dup
      // 100: sipush 10273
      // 103: ldc2_w 8988081481745410518
      // 106: lload 2
      // 107: lxor
      // 108: invokedynamic f (IJ)Ljava/lang/String; bsm=qyg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: nop
      // 10e: aload 6
      // 110: invokespecial net/minecraft/network/play/client/C17PacketCustomPayload.<init> (Ljava/lang/String;Lnfj;)V
      // 113: invokevirtual p_k.sxi (Lmz2;)V
      // 116: return
   }

   @Override
   public void cft(float param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: fconst_1
      // 001: fconst_1
      // 002: fconst_1
      // 003: fconst_1
      // 004: invokestatic hzu.wn0 (FFFF)V
      // 007: aload 0
      // 008: getfield qyg.f41 Lc05;
      // 00b: invokevirtual c05.l22 ()Llc5;
      // 00e: getstatic qyg.ywo Lgdz;
      // 011: invokevirtual lc5.anl (Lgdz;)V
      // 014: invokestatic t9d.b ()I
      // 017: aload 0
      // 018: getfield qyg.dt7 I
      // 01b: aload 0
      // 01c: getfield qyg.poy I
      // 01f: isub
      // 020: bipush 2
      // 021: idiv
      // 022: istore 5
      // 024: aload 0
      // 025: getfield qyg.o1e I
      // 028: aload 0
      // 029: getfield qyg.g6l I
      // 02c: isub
      // 02d: bipush 2
      // 02e: idiv
      // 02f: istore 6
      // 031: aload 0
      // 032: iload 5
      // 034: iload 6
      // 036: bipush 0
      // 037: bipush 0
      // 038: aload 0
      // 039: getfield qyg.poy I
      // 03c: aload 0
      // 03d: getfield qyg.g6l I
      // 040: invokevirtual qyg.mt4 (IIIIII)V
      // 043: istore 4
      // 045: aload 0
      // 046: getfield qyg.jrm La7q;
      // 049: aload 0
      // 04a: getfield qyg.f41 Lc05;
      // 04d: getfield c05.vg8 Ll86;
      // 050: invokeinterface a7q.zyi (Lha9;)Lskn; 2
      // 055: astore 7
      // 057: aload 7
      // 059: iload 4
      // 05b: ifeq 06a
      // 05e: ifnull 11b
      // 061: goto 068
      // 064: invokestatic qyg.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 7
      // 06a: invokevirtual skn.isEmpty ()Z
      // 06d: iload 4
      // 06f: ifeq 087
      // 072: ifne 11b
      // 075: goto 07c
      // 078: invokestatic qyg.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 0
      // 07d: getfield qyg.mji I
      // 080: goto 087
      // 083: invokestatic qyg.a (Loov;)Loov;
      // 086: athrow
      // 087: istore 8
      // 089: iload 8
      // 08b: iload 4
      // 08d: ifeq 09c
      // 090: iflt 0a4
      // 093: goto 09a
      // 096: invokestatic qyg.a (Loov;)Loov;
      // 099: athrow
      // 09a: iload 8
      // 09c: aload 7
      // 09e: invokevirtual skn.size ()I
      // 0a1: if_icmplt 0a9
      // 0a4: return
      // 0a5: invokestatic qyg.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 7
      // 0ab: iload 8
      // 0ad: invokevirtual skn.get (I)Ljava/lang/Object;
      // 0b0: checkcast xxb
      // 0b3: astore 9
      // 0b5: iload 4
      // 0b7: ifeq 101
      // 0ba: aload 9
      // 0bc: invokevirtual xxb.f_e ()Z
      // 0bf: ifeq 11b
      // 0c2: goto 0c9
      // 0c5: invokestatic qyg.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: getfield qyg.f41 Lc05;
      // 0cd: invokevirtual c05.l22 ()Llc5;
      // 0d0: getstatic qyg.ywo Lgdz;
      // 0d3: invokevirtual lc5.anl (Lgdz;)V
      // 0d6: fconst_1
      // 0d7: fconst_1
      // 0d8: fconst_1
      // 0d9: fconst_1
      // 0da: invokestatic hzu.wn0 (FFFF)V
      // 0dd: invokestatic hzu.fpt ()V
      // 0e0: aload 0
      // 0e1: aload 0
      // 0e2: getfield qyg.tjm I
      // 0e5: bipush 83
      // 0e7: iadd
      // 0e8: aload 0
      // 0e9: getfield qyg.___ I
      // 0ec: bipush 21
      // 0ee: iadd
      // 0ef: sipush 212
      // 0f2: bipush 0
      // 0f3: bipush 28
      // 0f5: bipush 21
      // 0f7: invokevirtual qyg.mt4 (IIIIII)V
      // 0fa: goto 101
      // 0fd: invokestatic qyg.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: aload 0
      // 103: getfield qyg.tjm I
      // 106: bipush 83
      // 108: iadd
      // 109: aload 0
      // 10a: getfield qyg.___ I
      // 10d: bipush 51
      // 10f: iadd
      // 110: sipush 212
      // 113: bipush 0
      // 114: bipush 28
      // 116: bipush 21
      // 118: invokevirtual qyg.mt4 (IIIIII)V
      // 11b: return
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
      // 000: getstatic qyg.a J
      // 003: ldc2_w 102952557311481
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: iload 1
      // 00b: iload 2
      // 00c: fload 3
      // 00d: invokespecial zg9.drawScreen (IIF)V
      // 010: invokestatic t9d.c ()I
      // 013: aload 0
      // 014: getfield qyg.jrm La7q;
      // 017: aload 0
      // 018: getfield qyg.f41 Lc05;
      // 01b: getfield c05.vg8 Ll86;
      // 01e: invokeinterface a7q.zyi (Lha9;)Lskn; 2
      // 023: astore 7
      // 025: istore 6
      // 027: aload 7
      // 029: iload 6
      // 02b: ifne 03a
      // 02e: ifnull 2cc
      // 031: goto 038
      // 034: invokestatic qyg.a (Loov;)Loov;
      // 037: athrow
      // 038: aload 7
      // 03a: invokevirtual skn.isEmpty ()Z
      // 03d: iload 6
      // 03f: ifne 05e
      // 042: ifne 2cc
      // 045: goto 04c
      // 048: invokestatic qyg.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield qyg.dt7 I
      // 050: aload 0
      // 051: getfield qyg.poy I
      // 054: isub
      // 055: bipush 2
      // 056: idiv
      // 057: goto 05e
      // 05a: invokestatic qyg.a (Loov;)Loov;
      // 05d: athrow
      // 05e: istore 8
      // 060: aload 0
      // 061: getfield qyg.o1e I
      // 064: aload 0
      // 065: getfield qyg.g6l I
      // 068: isub
      // 069: bipush 2
      // 06a: idiv
      // 06b: istore 9
      // 06d: aload 0
      // 06e: getfield qyg.mji I
      // 071: istore 10
      // 073: aload 7
      // 075: iload 10
      // 077: invokevirtual skn.get (I)Ljava/lang/Object;
      // 07a: checkcast xxb
      // 07d: astore 11
      // 07f: aload 11
      // 081: invokevirtual xxb.k2s ()Lerg;
      // 084: astore 12
      // 086: aload 11
      // 088: invokevirtual xxb.ha2 ()Lerg;
      // 08b: astore 13
      // 08d: aload 11
      // 08f: invokevirtual xxb.fjy ()Lerg;
      // 092: astore 14
      // 094: invokestatic hzu.dp2 ()V
      // 097: invokestatic qpm.gdb ()V
      // 09a: invokestatic hzu.fpt ()V
      // 09d: invokestatic hzu.ixc ()V
      // 0a0: invokestatic hzu.avm ()V
      // 0a3: invokestatic hzu.s7q ()V
      // 0a6: aload 0
      // 0a7: getfield qyg.vs5 Ly1w;
      // 0aa: ldc 100.0
      // 0ac: nop
      // 0ad: putfield y1w.b3l F
      // 0b0: aload 0
      // 0b1: getfield qyg.vs5 Ly1w;
      // 0b4: aload 12
      // 0b6: iload 8
      // 0b8: bipush 36
      // 0ba: iadd
      // 0bb: iload 9
      // 0bd: bipush 24
      // 0bf: iadd
      // 0c0: invokevirtual y1w.px5 (Lerg;II)V
      // 0c3: aload 0
      // 0c4: getfield qyg.vs5 Ly1w;
      // 0c7: aload 0
      // 0c8: getfield qyg.fex Lowt;
      // 0cb: aload 12
      // 0cd: iload 8
      // 0cf: bipush 36
      // 0d1: iadd
      // 0d2: iload 9
      // 0d4: bipush 24
      // 0d6: iadd
      // 0d7: invokevirtual y1w.jrm (Lowt;Lerg;II)V
      // 0da: iload 6
      // 0dc: ifne 151
      // 0df: aload 13
      // 0e1: ifnull 11c
      // 0e4: goto 0eb
      // 0e7: invokestatic qyg.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield qyg.vs5 Ly1w;
      // 0ef: aload 13
      // 0f1: iload 8
      // 0f3: bipush 62
      // 0f5: iadd
      // 0f6: iload 9
      // 0f8: bipush 24
      // 0fa: iadd
      // 0fb: invokevirtual y1w.px5 (Lerg;II)V
      // 0fe: aload 0
      // 0ff: getfield qyg.vs5 Ly1w;
      // 102: aload 0
      // 103: getfield qyg.fex Lowt;
      // 106: aload 13
      // 108: iload 8
      // 10a: bipush 62
      // 10c: iadd
      // 10d: iload 9
      // 10f: bipush 24
      // 111: iadd
      // 112: invokevirtual y1w.jrm (Lowt;Lerg;II)V
      // 115: goto 11c
      // 118: invokestatic qyg.a (Loov;)Loov;
      // 11b: athrow
      // 11c: aload 0
      // 11d: getfield qyg.vs5 Ly1w;
      // 120: aload 14
      // 122: iload 8
      // 124: bipush 120
      // 126: iadd
      // 127: iload 9
      // 129: bipush 24
      // 12b: iadd
      // 12c: invokevirtual y1w.px5 (Lerg;II)V
      // 12f: aload 0
      // 130: getfield qyg.vs5 Ly1w;
      // 133: aload 0
      // 134: getfield qyg.fex Lowt;
      // 137: aload 14
      // 139: iload 8
      // 13b: bipush 120
      // 13d: iadd
      // 13e: iload 9
      // 140: bipush 24
      // 142: iadd
      // 143: invokevirtual y1w.jrm (Lowt;Lerg;II)V
      // 146: aload 0
      // 147: getfield qyg.vs5 Ly1w;
      // 14a: fconst_0
      // 14b: putfield y1w.b3l F
      // 14e: invokestatic hzu.fpt ()V
      // 151: aload 0
      // 152: bipush 36
      // 154: bipush 24
      // 156: bipush 16
      // 158: bipush 16
      // 15a: iload 1
      // 15b: iload 2
      // 15c: invokevirtual qyg.t6g (IIIIII)Z
      // 15f: ifeq 18e
      // 162: aload 12
      // 164: iload 6
      // 166: ifne 197
      // 169: goto 170
      // 16c: invokestatic qyg.a (Loov;)Loov;
      // 16f: athrow
      // 170: ifnull 18e
      // 173: goto 17a
      // 176: invokestatic qyg.a (Loov;)Loov;
      // 179: athrow
      // 17a: aload 0
      // 17b: aload 12
      // 17d: iload 1
      // 17e: iload 2
      // 17f: invokevirtual qyg.i5k (Lerg;II)V
      // 182: iload 6
      // 184: ifeq 2c0
      // 187: goto 18e
      // 18a: invokestatic qyg.a (Loov;)Loov;
      // 18d: athrow
      // 18e: aload 13
      // 190: goto 197
      // 193: invokestatic qyg.a (Loov;)Loov;
      // 196: athrow
      // 197: iload 6
      // 199: ifne 1f3
      // 19c: ifnull 1ea
      // 19f: goto 1a6
      // 1a2: invokestatic qyg.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: aload 0
      // 1a7: bipush 62
      // 1a9: bipush 24
      // 1ab: bipush 16
      // 1ad: bipush 16
      // 1af: iload 1
      // 1b0: iload 2
      // 1b1: invokevirtual qyg.t6g (IIIIII)Z
      // 1b4: ifeq 1ea
      // 1b7: goto 1be
      // 1ba: invokestatic qyg.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: aload 13
      // 1c0: iload 6
      // 1c2: ifne 1f3
      // 1c5: goto 1cc
      // 1c8: invokestatic qyg.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: ifnull 1ea
      // 1cf: goto 1d6
      // 1d2: invokestatic qyg.a (Loov;)Loov;
      // 1d5: athrow
      // 1d6: aload 0
      // 1d7: aload 13
      // 1d9: iload 1
      // 1da: iload 2
      // 1db: invokevirtual qyg.i5k (Lerg;II)V
      // 1de: iload 6
      // 1e0: ifeq 2c0
      // 1e3: goto 1ea
      // 1e6: invokestatic qyg.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: aload 14
      // 1ec: goto 1f3
      // 1ef: invokestatic qyg.a (Loov;)Loov;
      // 1f2: athrow
      // 1f3: ifnull 23a
      // 1f6: aload 0
      // 1f7: bipush 120
      // 1f9: bipush 24
      // 1fb: bipush 16
      // 1fd: bipush 16
      // 1ff: iload 1
      // 200: iload 2
      // 201: invokevirtual qyg.t6g (IIIIII)Z
      // 204: iload 6
      // 206: ifne 246
      // 209: goto 210
      // 20c: invokestatic qyg.a (Loov;)Loov;
      // 20f: athrow
      // 210: ifeq 23a
      // 213: goto 21a
      // 216: invokestatic qyg.a (Loov;)Loov;
      // 219: athrow
      // 21a: aload 14
      // 21c: ifnull 23a
      // 21f: goto 226
      // 222: invokestatic qyg.a (Loov;)Loov;
      // 225: athrow
      // 226: aload 0
      // 227: aload 14
      // 229: iload 1
      // 22a: iload 2
      // 22b: invokevirtual qyg.i5k (Lerg;II)V
      // 22e: iload 6
      // 230: ifeq 2c0
      // 233: goto 23a
      // 236: invokestatic qyg.a (Loov;)Loov;
      // 239: athrow
      // 23a: aload 11
      // 23c: invokevirtual xxb.f_e ()Z
      // 23f: goto 246
      // 242: invokestatic qyg.a (Loov;)Loov;
      // 245: athrow
      // 246: iload 6
      // 248: ifne 276
      // 24b: ifeq 2c0
      // 24e: goto 255
      // 251: invokestatic qyg.a (Loov;)Loov;
      // 254: athrow
      // 255: aload 0
      // 256: iload 6
      // 258: ifne 2a5
      // 25b: goto 262
      // 25e: invokestatic qyg.a (Loov;)Loov;
      // 261: athrow
      // 262: bipush 83
      // 264: bipush 21
      // 266: bipush 28
      // 268: bipush 21
      // 26a: iload 1
      // 26b: iload 2
      // 26c: invokevirtual qyg.t6g (IIIIII)Z
      // 26f: goto 276
      // 272: invokestatic qyg.a (Loov;)Loov;
      // 275: athrow
      // 276: ifne 29d
      // 279: aload 0
      // 27a: iload 6
      // 27c: ifne 2a5
      // 27f: goto 286
      // 282: invokestatic qyg.a (Loov;)Loov;
      // 285: athrow
      // 286: bipush 83
      // 288: bipush 51
      // 28a: bipush 28
      // 28c: bipush 21
      // 28e: iload 1
      // 28f: iload 2
      // 290: invokevirtual qyg.t6g (IIIIII)Z
      // 293: ifeq 2c0
      // 296: goto 29d
      // 299: invokestatic qyg.a (Loov;)Loov;
      // 29c: athrow
      // 29d: aload 0
      // 29e: goto 2a5
      // 2a1: invokestatic qyg.a (Loov;)Loov;
      // 2a4: athrow
      // 2a5: sipush 31859
      // 2a8: ldc2_w 5023998891593482018
      // 2ab: lload 4
      // 2ad: lxor
      // 2ae: invokedynamic f (IJ)Ljava/lang/String; bsm=qyg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b3: nop
      // 2b4: bipush 0
      // 2b5: anewarray 114
      // 2b8: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 2bb: iload 1
      // 2bc: iload 2
      // 2bd: invokevirtual qyg.xhs (Ljava/lang/String;II)V
      // 2c0: invokestatic hzu.x3w ()V
      // 2c3: invokestatic hzu.s7q ()V
      // 2c6: invokestatic hzu.m45 ()V
      // 2c9: invokestatic qpm.ne_ ()V
      // 2cc: return
   }

   public a7q tju() {
      return this.jrm;
   }

   public static gdz ak8() {
      return ywo;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3848231526089316662L, -6089942955401808594L, MethodHandles.lookup().lookupClass()).a(153056672095628L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 14128244191959L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "=Ö\u000f\u001f£QH{~\n\u0095ç¶ZmÑ@a Þ\u0001A\u0092Ê\u0091ª½ÝÙ%SÔ@hi\u0090ü\u007fG§|\u0086\u0085ó£z1 Lë\u0094÷Á;\u00adýÀ×KÊ¡\u0003çþT¼\u009eq('\u001c:×}\u0087Kl±5Â½èÑ\u008b\u0019z¶\u00982Eàe\u000eqÌª´";
      int var6 = "=Ö\u000f\u001f£QH{~\n\u0095ç¶ZmÑ@a Þ\u0001A\u0092Ê\u0091ª½ÝÙ%SÔ@hi\u0090ü\u007fG§|\u0086\u0085ó£z1 Lë\u0094÷Á;\u00adýÀ×KÊ¡\u0003çþT¼\u009eq('\u001c:×}\u0087Kl±5Â½èÑ\u008b\u0019z¶\u00982Eàe\u000eqÌª´"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = d(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     g = new String[4];
                     yct = LogManager.getLogger();
                     ywo = new gdz(b<"f">(8814, 9138412228440057362L ^ var9));
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

                  var4 = "æ ù\u0005®\u0012d\u001bô[=;SQ\u0001\u000fúõp£n\u008f\u0092¢\u0091\u0090ÿm-c¬V\u001a\u0019'A#\u009f\u009c¶(L0&è\u0090wa\\ºÈøKdø_åªª-BÓ\u0092n^ÙM\r98ôsrÀ°\u00adé\u0093+\u008bê";
                  var6 = "æ ù\u0005®\u0012d\u001bô[=;SQ\u0001\u000fúõp£n\u008f\u0092¢\u0091\u0090ÿm-c¬V\u001a\u0019'A#\u009f\u009c¶(L0&è\u0090wa\\ºÈøKdø_åªª-BÓ\u0092n^ÙM\r98ôsrÀ°\u00adé\u0093+\u008bê"
                     .length();
                  var3 = '(';
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

   private static String d(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25441;
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
            throw new RuntimeException("qyg", var10);
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
         g[var5] = d(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("qyg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
