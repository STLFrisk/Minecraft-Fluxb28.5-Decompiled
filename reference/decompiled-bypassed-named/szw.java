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
import org.lwjgl.input.Keyboard;

public class szw extends zg9 implements flv {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public szw(jnq var1, OpaquePredicate var2) {
      super(new y1i(var1, var2, Minecraft.vz1().vg8));
      this.nv6 = var1;
      this.n87 = (y1i)this.h2l;
   }

   @Override
   public void initGui() {
      super.initGui();
      Keyboard.enableRepeatEvents(true);
      int var1 = (this.dt7 - this.poy) / 2;
      int var2 = (this.o1e - this.g6l) / 2;
      this.gl1 = new jqk(0, this.fex, var1 + 62, var2 + 24, 103, 12);
      this.gl1.w9i(-1);
      this.gl1.cq_(-1);
      this.gl1.tge(false);
      this.gl1.z5t(30);
      this.h2l.xku(this);
      this.h2l.c_j(this);
   }

   @Override
   public void onGuiClosed() {
      super.onGuiClosed();
      Keyboard.enableRepeatEvents(false);
      this.h2l.xku(this);
   }

   @Override
   public void qw3(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic szw.a J
      // 003: ldc2_w 128820045399173
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: invokestatic hzu.fpt ()V
      // 010: invokestatic hzu.ux6 ()V
      // 013: aload 0
      // 014: getfield szw.fex Lowt;
      // 017: sipush 14764
      // 01a: ldc2_w 5752831424114670131
      // 01d: lload 3
      // 01e: lxor
      // 01f: invokedynamic q (IJ)Ljava/lang/String; bsm=szw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: bipush 0
      // 026: anewarray 132
      // 029: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 02c: ldc 60.0
      // 02e: nop
      // 02f: ldc 6.0
      // 031: nop
      // 032: ldc 4210752
      // 034: nop
      // 035: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 038: pop
      // 039: iload 5
      // 03b: ifeq 229
      // 03e: aload 0
      // 03f: getfield szw.n87 Ly1i;
      // 042: getfield y1i.vm6 I
      // 045: ifle 226
      // 048: goto 04f
      // 04b: invokestatic szw.a (Loov;)Loov;
      // 04e: athrow
      // 04f: ldc 8453920
      // 051: nop
      // 052: istore 6
      // 054: sipush 4092
      // 057: bipush 1
      // 058: istore 7
      // 05a: ldc2_w 6755383240881769570
      // 05d: lload 3
      // 05e: lxor
      // 05f: invokedynamic q (IJ)Ljava/lang/String; bsm=szw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: nop
      // 065: bipush 1
      // 066: anewarray 132
      // 069: dup
      // 06a: bipush 0
      // 06b: aload 0
      // 06c: getfield szw.n87 Ly1i;
      // 06f: getfield y1i.vm6 I
      // 072: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 075: aastore
      // 076: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 079: astore 8
      // 07b: aload 0
      // 07c: getfield szw.n87 Ly1i;
      // 07f: getfield y1i.vm6 I
      // 082: iload 5
      // 084: ifeq 0e9
      // 087: bipush 40
      // 089: if_icmplt 0d7
      // 08c: goto 093
      // 08f: invokestatic szw.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 0
      // 094: getfield szw.f41 Lc05;
      // 097: getfield Minecraft.vg8 Ll86;
      // 09a: getfield EntityPlayerSP.lls Lpj2;
      // 09d: getfield pj2.g40 Z
      // 0a0: iload 5
      // 0a2: ifeq 0e9
      // 0a5: goto 0ac
      // 0a8: invokestatic szw.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: ifne 0d7
      // 0af: goto 0b6
      // 0b2: invokestatic szw.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: sipush 31539
      // 0b9: ldc2_w 3080147830633986219
      // 0bc: lload 3
      // 0bd: lxor
      // 0be: invokedynamic q (IJ)Ljava/lang/String; bsm=szw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: nop
      // 0c4: bipush 0
      // 0c5: anewarray 132
      // 0c8: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0cb: astore 8
      // 0cd: ldc 16736352
      // 0cf: nop
      // 0d0: istore 6
      // 0d2: iload 5
      // 0d4: ifne 12d
      // 0d7: aload 0
      // 0d8: getfield szw.n87 Ly1i;
      // 0db: bipush 2
      // 0dc: invokevirtual y1i.ajr (I)Lvrx;
      // 0df: invokevirtual vrx.hf8 ()Z
      // 0e2: goto 0e9
      // 0e5: invokestatic szw.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: iload 5
      // 0eb: ifeq 119
      // 0ee: ifne 100
      // 0f1: goto 0f8
      // 0f4: invokestatic szw.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: bipush 0
      // 0f9: istore 7
      // 0fb: iload 5
      // 0fd: ifne 12d
      // 100: aload 0
      // 101: getfield szw.n87 Ly1i;
      // 104: bipush 2
      // 105: invokevirtual y1i.ajr (I)Lvrx;
      // 108: aload 0
      // 109: getfield szw.nv6 Ljnq;
      // 10c: getfield jnq.jsr Lha9;
      // 10f: invokevirtual vrx.fg6 (Lha9;)Z
      // 112: goto 119
      // 115: invokestatic szw.a (Loov;)Loov;
      // 118: athrow
      // 119: iload 5
      // 11b: ifeq 12f
      // 11e: ifne 12d
      // 121: goto 128
      // 124: invokestatic szw.a (Loov;)Loov;
      // 127: athrow
      // 128: ldc 16736352
      // 12a: nop
      // 12b: istore 6
      // 12d: iload 7
      // 12f: iload 5
      // 131: ifeq 158
      // 134: ifeq 226
      // 137: goto 13e
      // 13a: invokestatic szw.a (Loov;)Loov;
      // 13d: athrow
      // 13e: ldc -16777216
      // 140: nop
      // 141: iload 6
      // 143: ldc 16579836
      // 145: nop
      // 146: iand
      // 147: bipush 2
      // 148: ishr
      // 149: ior
      // 14a: iload 6
      // 14c: ldc -16777216
      // 14e: nop
      // 14f: iand
      // 150: ior
      // 151: goto 158
      // 154: invokestatic szw.a (Loov;)Loov;
      // 157: athrow
      // 158: istore 9
      // 15a: aload 0
      // 15b: getfield szw.poy I
      // 15e: bipush 8
      // 160: isub
      // 161: aload 0
      // 162: getfield szw.fex Lowt;
      // 165: aload 8
      // 167: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 16a: isub
      // 16b: istore 10
      // 16d: bipush 67
      // 16f: istore 11
      // 171: aload 0
      // 172: getfield szw.fex Lowt;
      // 175: invokevirtual owt.dmx ()Z
      // 178: iload 5
      // 17a: ifeq 213
      // 17d: ifeq 1cf
      // 180: goto 187
      // 183: invokestatic szw.a (Loov;)Loov;
      // 186: athrow
      // 187: iload 10
      // 189: bipush 3
      // 18a: isub
      // 18b: i2f
      // 18c: iload 11
      // 18e: bipush 2
      // 18f: isub
      // 190: i2f
      // 191: aload 0
      // 192: getfield szw.poy I
      // 195: bipush 7
      // 197: isub
      // 198: i2f
      // 199: iload 11
      // 19b: bipush 10
      // 19d: iadd
      // 19e: i2f
      // 19f: ldc -16777216
      // 1a1: nop
      // 1a2: invokestatic szw.df9 (FFFFI)V
      // 1a5: iload 10
      // 1a7: bipush 2
      // 1a8: isub
      // 1a9: i2f
      // 1aa: iload 11
      // 1ac: bipush 1
      // 1ad: isub
      // 1ae: i2f
      // 1af: aload 0
      // 1b0: getfield szw.poy I
      // 1b3: bipush 8
      // 1b5: isub
      // 1b6: i2f
      // 1b7: iload 11
      // 1b9: bipush 9
      // 1bb: iadd
      // 1bc: i2f
      // 1bd: ldc -12895429
      // 1bf: nop
      // 1c0: invokestatic szw.df9 (FFFFI)V
      // 1c3: iload 5
      // 1c5: ifne 214
      // 1c8: goto 1cf
      // 1cb: invokestatic szw.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: aload 0
      // 1d0: getfield szw.fex Lowt;
      // 1d3: aload 8
      // 1d5: iload 10
      // 1d7: i2f
      // 1d8: iload 11
      // 1da: bipush 1
      // 1db: iadd
      // 1dc: i2f
      // 1dd: iload 9
      // 1df: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 1e2: pop
      // 1e3: aload 0
      // 1e4: getfield szw.fex Lowt;
      // 1e7: aload 8
      // 1e9: iload 10
      // 1eb: bipush 1
      // 1ec: iadd
      // 1ed: i2f
      // 1ee: iload 11
      // 1f0: i2f
      // 1f1: iload 9
      // 1f3: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 1f6: pop
      // 1f7: aload 0
      // 1f8: getfield szw.fex Lowt;
      // 1fb: aload 8
      // 1fd: iload 10
      // 1ff: bipush 1
      // 200: iadd
      // 201: i2f
      // 202: iload 11
      // 204: bipush 1
      // 205: iadd
      // 206: i2f
      // 207: iload 9
      // 209: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 20c: goto 213
      // 20f: invokestatic szw.a (Loov;)Loov;
      // 212: athrow
      // 213: pop
      // 214: aload 0
      // 215: getfield szw.fex Lowt;
      // 218: aload 8
      // 21a: iload 10
      // 21c: i2f
      // 21d: iload 11
      // 21f: i2f
      // 220: iload 6
      // 222: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 225: pop
      // 226: invokestatic hzu.s7q ()V
      // 229: return
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 32
      // 09: getfield szw.gl1 Ljqk;
      // 0c: iload 1
      // 0d: iload 2
      // 0e: invokevirtual jqk.pst (CI)Z
      // 11: ifeq 2a
      // 14: goto 1b
      // 17: invokestatic szw.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokespecial szw.hbu ()V
      // 1f: iload 3
      // 20: ifne 37
      // 23: goto 2a
      // 26: invokestatic szw.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: goto 32
      // 2e: invokestatic szw.a (Loov;)Loov;
      // 31: athrow
      // 32: iload 1
      // 33: iload 2
      // 34: invokespecial zg9.dig (CI)V
      // 37: return
   }

   private void hbu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic szw.a J
      // 03: ldc2_w 131525220598741
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield szw.gl1 Ljqk;
      // 10: invokevirtual jqk.xct ()Ljava/lang/String;
      // 13: astore 4
      // 15: aload 0
      // 16: getfield szw.n87 Ly1i;
      // 19: bipush 0
      // 1a: invokevirtual y1i.ajr (I)Lvrx;
      // 1d: astore 5
      // 1f: iload 3
      // 20: ifeq ce
      // 23: aload 5
      // 25: ifnull 94
      // 28: goto 2f
      // 2b: invokestatic szw.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 5
      // 31: invokevirtual vrx.hf8 ()Z
      // 34: iload 3
      // 35: ifeq 58
      // 38: goto 3f
      // 3b: invokestatic szw.a (Loov;)Loov;
      // 3e: athrow
      // 3f: ifeq 94
      // 42: goto 49
      // 45: invokestatic szw.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 5
      // 4b: invokevirtual vrx.x4s ()Lerg;
      // 4e: invokevirtual erg.x4w ()Z
      // 51: goto 58
      // 54: invokestatic szw.a (Loov;)Loov;
      // 57: athrow
      // 58: iload 3
      // 59: ifeq 85
      // 5c: ifne 94
      // 5f: goto 66
      // 62: invokestatic szw.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 4
      // 68: iload 3
      // 69: ifeq 92
      // 6c: goto 73
      // 6f: invokestatic szw.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 5
      // 75: invokevirtual vrx.x4s ()Lerg;
      // 78: invokevirtual erg.zow ()Ljava/lang/String;
      // 7b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7e: goto 85
      // 81: invokestatic szw.a (Loov;)Loov;
      // 84: athrow
      // 85: ifeq 94
      // 88: ldc ""
      // 8a: nop
      // 8b: goto 92
      // 8e: invokestatic szw.a (Loov;)Loov;
      // 91: athrow
      // 92: astore 4
      // 94: aload 0
      // 95: getfield szw.n87 Ly1i;
      // 98: aload 4
      // 9a: invokevirtual y1i.gj2 (Ljava/lang/String;)V
      // 9d: aload 0
      // 9e: getfield szw.f41 Lc05;
      // a1: getfield Minecraft.vg8 Ll86;
      // a4: getfield EntityPlayerSP.lq7 Lp_k;
      // a7: new net/minecraft/network/play/client/C17PacketCustomPayload
      // aa: dup
      // ab: sipush 5724
      // ae: ldc2_w 4021622311646089872
      // b1: lload 1
      // b2: lxor
      // b3: invokedynamic q (IJ)Ljava/lang/String; bsm=szw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: nop
      // b9: new nfj
      // bc: dup
      // bd: invokestatic io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
      // c0: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // c3: aload 4
      // c5: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // c8: invokespecial net/minecraft/network/play/client/C17PacketCustomPayload.<init> (Ljava/lang/String;Lnfj;)V
      // cb: invokevirtual p_k.sxi (Lmz2;)V
      // ce: return
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.gl1.elk(var1, var2, var3);
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      super.drawScreen(var1, var2, var3);
      hzu.fpt();
      hzu.ux6();
      this.gl1.dy2();
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
      // 00: fconst_1
      // 01: fconst_1
      // 02: fconst_1
      // 03: fconst_1
      // 04: invokestatic hzu.wn0 (FFFF)V
      // 07: invokestatic OpaquePredicate.b ()I
      // 0a: aload 0
      // 0b: getfield szw.f41 Lc05;
      // 0e: invokevirtual Minecraft.l22 ()Llc5;
      // 11: getstatic szw.hpb Lgdz;
      // 14: invokevirtual lc5.anl (Lgdz;)V
      // 17: aload 0
      // 18: getfield szw.dt7 I
      // 1b: aload 0
      // 1c: getfield szw.poy I
      // 1f: isub
      // 20: bipush 2
      // 21: idiv
      // 22: istore 5
      // 24: istore 4
      // 26: aload 0
      // 27: getfield szw.o1e I
      // 2a: aload 0
      // 2b: getfield szw.g6l I
      // 2e: isub
      // 2f: bipush 2
      // 30: idiv
      // 31: istore 6
      // 33: aload 0
      // 34: iload 5
      // 36: iload 6
      // 38: bipush 0
      // 39: bipush 0
      // 3a: aload 0
      // 3b: getfield szw.poy I
      // 3e: aload 0
      // 3f: getfield szw.g6l I
      // 42: invokevirtual szw.mt4 (IIIIII)V
      // 45: aload 0
      // 46: iload 5
      // 48: bipush 59
      // 4a: iadd
      // 4b: iload 6
      // 4d: bipush 20
      // 4f: iadd
      // 50: bipush 0
      // 51: aload 0
      // 52: getfield szw.g6l I
      // 55: aload 0
      // 56: getfield szw.n87 Ly1i;
      // 59: bipush 0
      // 5a: invokevirtual y1i.ajr (I)Lvrx;
      // 5d: invokevirtual vrx.hf8 ()Z
      // 60: iload 4
      // 62: ifeq 70
      // 65: ifeq 73
      // 68: goto 6f
      // 6b: invokestatic szw.a (Loov;)Loov;
      // 6e: athrow
      // 6f: bipush 0
      // 70: goto 75
      // 73: bipush 16
      // 75: iadd
      // 76: bipush 110
      // 78: bipush 16
      // 7a: invokevirtual szw.mt4 (IIIIII)V
      // 7d: aload 0
      // 7e: getfield szw.n87 Ly1i;
      // 81: bipush 0
      // 82: invokevirtual y1i.ajr (I)Lvrx;
      // 85: invokevirtual vrx.hf8 ()Z
      // 88: iload 4
      // 8a: ifeq d6
      // 8d: ifne b8
      // 90: goto 97
      // 93: invokestatic szw.a (Loov;)Loov;
      // 96: athrow
      // 97: aload 0
      // 98: getfield szw.n87 Ly1i;
      // 9b: bipush 1
      // 9c: invokevirtual y1i.ajr (I)Lvrx;
      // 9f: invokevirtual vrx.hf8 ()Z
      // a2: iload 4
      // a4: ifeq d6
      // a7: goto ae
      // aa: invokestatic szw.a (Loov;)Loov;
      // ad: athrow
      // ae: ifeq f0
      // b1: goto b8
      // b4: invokestatic szw.a (Loov;)Loov;
      // b7: athrow
      // b8: aload 0
      // b9: iload 4
      // bb: ifeq da
      // be: goto c5
      // c1: invokestatic szw.a (Loov;)Loov;
      // c4: athrow
      // c5: getfield szw.n87 Ly1i;
      // c8: bipush 2
      // c9: invokevirtual y1i.ajr (I)Lvrx;
      // cc: invokevirtual vrx.hf8 ()Z
      // cf: goto d6
      // d2: invokestatic szw.a (Loov;)Loov;
      // d5: athrow
      // d6: ifne f0
      // d9: aload 0
      // da: iload 5
      // dc: bipush 99
      // de: iadd
      // df: iload 6
      // e1: bipush 45
      // e3: iadd
      // e4: aload 0
      // e5: getfield szw.poy I
      // e8: bipush 0
      // e9: bipush 28
      // eb: bipush 21
      // ed: invokevirtual szw.mt4 (IIIIII)V
      // f0: return
   }

   @Override
   public void ynq(_jc var1, List var2) {
      this.r83(var1, 0, var1.ajr(0).x4s());
   }

   @Override
   public void r83(_jc param1, int param2, erg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: iload 2
      // 06: ifne 58
      // 09: aload 0
      // 0a: getfield szw.gl1 Ljqk;
      // 0d: aload 3
      // 0e: iload 4
      // 10: ifeq 2f
      // 13: goto 1a
      // 16: invokestatic szw.a (Loov;)Loov;
      // 19: athrow
      // 1a: ifnonnull 2e
      // 1d: goto 24
      // 20: invokestatic szw.a (Loov;)Loov;
      // 23: athrow
      // 24: ldc ""
      // 26: nop
      // 27: goto 32
      // 2a: invokestatic szw.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 3
      // 2f: invokevirtual erg.zow ()Ljava/lang/String;
      // 32: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 35: aload 0
      // 36: getfield szw.gl1 Ljqk;
      // 39: aload 3
      // 3a: ifnull 45
      // 3d: bipush 1
      // 3e: goto 46
      // 41: invokestatic szw.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 0
      // 46: invokevirtual jqk.gpc (Z)V
      // 49: aload 3
      // 4a: ifnull 58
      // 4d: aload 0
      // 4e: invokespecial szw.hbu ()V
      // 51: goto 58
      // 54: invokestatic szw.a (Loov;)Loov;
      // 57: athrow
      // 58: return
   }

   @Override
   public void vhx(_jc var1, int var2, int var3) {
   }

   @Override
   public void pr4(_jc var1, rsi var2) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3303370668765603173L, -2560151187688632905L, MethodHandles.lookup().lookupClass()).a(255206442928436L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 19107648017507L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = ";ñôsè[J3m\u0092ê:|+ËÛ¸\r\u008eÇF\fó2@¦\u0098ñ®ì,½æ.R8òÔ°\u0014Ìª³û\u0002\u0005nK¢@³\u0094\u0003¯²\u00ad\u009cZ\u0011P[Êq\u0018Åº½\u001f}\u0004pcR\u0016)%qd\u0096ê ¬ü!\u001e®\u0087ïì(U£ØÕè4\u0081 ïì«©Ä\u001a£Wf+ãfkþ2/\t¤\n\u0015\u0006ÐÚ(\u008c\u001a\u0013)R\u009b,Ë";
      int var6 = ";ñôsè[J3m\u0092ê:|+ËÛ¸\r\u008eÇF\fó2@¦\u0098ñ®ì,½æ.R8òÔ°\u0014Ìª³û\u0002\u0005nK¢@³\u0094\u0003¯²\u00ad\u009cZ\u0011P[Êq\u0018Åº½\u001f}\u0004pcR\u0016)%qd\u0096ê ¬ü!\u001e®\u0087ïì(U£ØÕè4\u0081 ïì«©Ä\u001a£Wf+ãfkþ2/\t¤\n\u0015\u0006ÐÚ(\u008c\u001a\u0013)R\u009b,Ë"
         .length();
      char var3 = 24;
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
                     g = new String[5];
                     hpb = new gdz(b<"q">(756, 4727856396086235535L ^ var9));
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

                  var4 = "\u0001\u0004\u0000\b\u001a\u0017\u009b£Y\u0019îÌ\u0004(¹ºx(i\u001eiéÛe@\u0007üÑ\u0005\u001dB2®3e\u000f¬\u0007  86\u0094ÕîTïzn>\f¸B«´\u0018\u009eÀ\u0082:ïû7:\u0092ÖP\u0080\u0085LÜIYÖ\r\u0087\u0096\u0087Ñ©\u001f\u000eÙ¸\u0012ð\u0080LO¤Üè´ÇÌdæ";
                  var6 = "\u0001\u0004\u0000\b\u001a\u0017\u009b£Y\u0019îÌ\u0004(¹ºx(i\u001eiéÛe@\u0007üÑ\u0005\u001dB2®3e\u000f¬\u0007  86\u0094ÕîTïzn>\f¸B«´\u0018\u009eÀ\u0082:ïû7:\u0092ÖP\u0080\u0085LÜIYÖ\r\u0087\u0096\u0087Ñ©\u001f\u000eÙ¸\u0012ð\u0080LO¤Üè´ÇÌdæ"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2028;
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
            throw new RuntimeException("szw", var10);
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
         throw new RuntimeException("szw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
