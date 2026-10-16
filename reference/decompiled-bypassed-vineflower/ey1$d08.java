import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ey1$d08 {
   private final List yvc;
   private final h2f n_a;
   private short[] jcw;
   private int f7n;
   private int zgk;
   private long n5i;
   public final ey1 wu2;
   private static final long a;
   private static final String b;

   public ey1$d08(ey1 var1, int var2, int var3) {
      this.wu2 = var1;
      this.yvc = Lists.newArrayList();
      this.jcw = new short[64];
      this.n_a = new h2f(var2, var3);
      var1.g37().kil.xw9(var2, var3);
   }

   public void n82(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ey1$d08.a J
      // 03: ldc2_w 69014552920210
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield ey1$d08.yvc Ljava/util/List;
      // 11: aload 1
      // 12: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 17: iload 4
      // 19: ifeq 70
      // 1c: ifeq 60
      // 1f: goto 26
      // 22: invokestatic ey1$d08.a (Loov;)Loov;
      // 25: athrow
      // 26: invokestatic ey1.srl ()Lorg/apache/logging/log4j/Logger;
      // 29: getstatic ey1$d08.b Ljava/lang/String;
      // 2c: nop
      // 2d: bipush 3
      // 2e: anewarray 8
      // 31: dup
      // 32: bipush 0
      // 33: aload 1
      // 34: aastore
      // 35: dup
      // 36: bipush 1
      // 37: aload 0
      // 38: getfield ey1$d08.n_a Lh2f;
      // 3b: getfield h2f.jnd I
      // 3e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 41: aastore
      // 42: dup
      // 43: bipush 2
      // 44: aload 0
      // 45: getfield ey1$d08.n_a Lh2f;
      // 48: getfield h2f.km5 I
      // 4b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4e: aastore
      // 4f: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 54: iload 4
      // 56: ifne ad
      // 59: goto 60
      // 5c: invokestatic ey1$d08.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield ey1$d08.yvc Ljava/util/List;
      // 64: invokeinterface java/util/List.isEmpty ()Z 1
      // 69: goto 70
      // 6c: invokestatic ey1$d08.a (Loov;)Loov;
      // 6f: athrow
      // 70: iload 4
      // 72: ifeq ac
      // 75: ifeq 94
      // 78: goto 7f
      // 7b: invokestatic ey1$d08.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 0
      // 80: aload 0
      // 81: getfield ey1$d08.wu2 Ley1;
      // 84: invokestatic ey1.u4y (Ley1;)Ldug;
      // 87: invokevirtual dug.p2b ()J
      // 8a: putfield ey1$d08.n5i J
      // 8d: goto 94
      // 90: invokestatic ey1$d08.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 0
      // 95: getfield ey1$d08.yvc Ljava/util/List;
      // 98: aload 1
      // 99: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9e: pop
      // 9f: aload 1
      // a0: getfield z96.u8j Ljava/util/List;
      // a3: aload 0
      // a4: getfield ey1$d08.n_a Lh2f;
      // a7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // ac: pop
      // ad: return
   }

   public void fwh(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 024
      // 009: getfield ey1$d08.yvc Ljava/util/List;
      // 00c: aload 1
      // 00d: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 012: ifeq 11d
      // 015: goto 01c
      // 018: invokestatic ey1$d08.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: goto 024
      // 020: invokestatic ey1$d08.a (Loov;)Loov;
      // 023: athrow
      // 024: getfield ey1$d08.wu2 Ley1;
      // 027: invokestatic ey1.u4y (Ley1;)Ldug;
      // 02a: aload 0
      // 02b: getfield ey1$d08.n_a Lh2f;
      // 02e: getfield h2f.jnd I
      // 031: aload 0
      // 032: getfield ey1$d08.n_a Lh2f;
      // 035: getfield h2f.km5 I
      // 038: invokevirtual dug.o5h (II)Ltts;
      // 03b: astore 3
      // 03c: aload 3
      // 03d: invokevirtual tts.sac ()Z
      // 040: iload 2
      // 041: ifeq 088
      // 044: ifeq 066
      // 047: goto 04e
      // 04a: invokestatic ey1$d08.a (Loov;)Loov;
      // 04d: athrow
      // 04e: aload 1
      // 04f: getfield z96.rhh Lmlk;
      // 052: new net/minecraft/network/play/server/S21PacketChunkData
      // 055: dup
      // 056: aload 3
      // 057: bipush 1
      // 058: bipush 0
      // 059: invokespecial net/minecraft/network/play/server/S21PacketChunkData.<init> (Ltts;ZI)V
      // 05c: invokevirtual mlk.vnf (Lmz2;)V
      // 05f: goto 066
      // 062: invokestatic ey1$d08.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: getfield ey1$d08.yvc Ljava/util/List;
      // 06a: aload 1
      // 06b: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 070: pop
      // 071: aload 1
      // 072: getfield z96.u8j Ljava/util/List;
      // 075: aload 0
      // 076: getfield ey1$d08.n_a Lh2f;
      // 079: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 07e: pop
      // 07f: aload 0
      // 080: getfield ey1$d08.yvc Ljava/util/List;
      // 083: invokeinterface java/util/List.isEmpty ()Z 1
      // 088: iload 2
      // 089: ifeq 0a4
      // 08c: ifeq 11d
      // 08f: goto 096
      // 092: invokestatic ey1$d08.a (Loov;)Loov;
      // 095: athrow
      // 096: aload 0
      // 097: getfield ey1$d08.n_a Lh2f;
      // 09a: getfield h2f.jnd I
      // 09d: goto 0a4
      // 0a0: invokestatic ey1$d08.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: i2l
      // 0a5: ldc2_w 2147483647
      // 0a8: ladd
      // 0a9: aload 0
      // 0aa: getfield ey1$d08.n_a Lh2f;
      // 0ad: getfield h2f.km5 I
      // 0b0: i2l
      // 0b1: ldc2_w 2147483647
      // 0b4: ladd
      // 0b5: bipush 32
      // 0b7: lshl
      // 0b8: lor
      // 0b9: lstore 4
      // 0bb: aload 0
      // 0bc: aload 3
      // 0bd: invokespecial ey1$d08._1r (Ltts;)V
      // 0c0: aload 0
      // 0c1: getfield ey1$d08.wu2 Ley1;
      // 0c4: invokestatic ey1.tq6 (Ley1;)Lyo9;
      // 0c7: lload 4
      // 0c9: invokevirtual yo9.wsz (J)Ljava/lang/Object;
      // 0cc: pop
      // 0cd: aload 0
      // 0ce: getfield ey1$d08.wu2 Ley1;
      // 0d1: invokestatic ey1.xsj (Ley1;)Ljava/util/List;
      // 0d4: aload 0
      // 0d5: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 0da: pop
      // 0db: aload 0
      // 0dc: iload 2
      // 0dd: ifeq 103
      // 0e0: getfield ey1$d08.f7n I
      // 0e3: ifle 102
      // 0e6: goto 0ed
      // 0e9: invokestatic ey1$d08.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield ey1$d08.wu2 Ley1;
      // 0f1: invokestatic ey1.h7m (Ley1;)Ljava/util/List;
      // 0f4: aload 0
      // 0f5: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 0fa: pop
      // 0fb: goto 102
      // 0fe: invokestatic ey1$d08.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 0
      // 103: getfield ey1$d08.wu2 Ley1;
      // 106: invokevirtual ey1.g37 ()Ldug;
      // 109: getfield dug.kil Lgvi;
      // 10c: aload 0
      // 10d: getfield ey1$d08.n_a Lh2f;
      // 110: getfield h2f.jnd I
      // 113: aload 0
      // 114: getfield ey1$d08.n_a Lh2f;
      // 117: getfield h2f.km5 I
      // 11a: invokevirtual gvi.ztg (II)V
      // 11d: return
   }

   public void bii() {
      this._1r(ey1.u4y(this.wu2).o5h(this.n_a.jnd, this.n_a.km5));
   }

   private void _1r(tts var1) {
      var1.tgk(var1.zuf() + ey1.u4y(this.wu2).p2b() - this.n5i);
      this.n5i = ey1.u4y(this.wu2).p2b();
   }

   public void gma(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield ey1$d08.f7n I
      // 09: iload 4
      // 0b: ifne 3f
      // 0e: ifne 2d
      // 11: goto 18
      // 14: invokestatic ey1$d08.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield ey1$d08.wu2 Ley1;
      // 1c: invokestatic ey1.h7m (Ley1;)Ljava/util/List;
      // 1f: aload 0
      // 20: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 25: pop
      // 26: goto 2d
      // 29: invokestatic ey1$d08.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: dup
      // 2f: getfield ey1$d08.zgk I
      // 32: bipush 1
      // 33: iload 2
      // 34: bipush 4
      // 35: ishr
      // 36: ishl
      // 37: ior
      // 38: putfield ey1$d08.zgk I
      // 3b: aload 0
      // 3c: getfield ey1$d08.f7n I
      // 3f: bipush 64
      // 41: iload 4
      // 43: ifne 61
      // 46: if_icmpge a8
      // 49: goto 50
      // 4c: invokestatic ey1$d08.a (Loov;)Loov;
      // 4f: athrow
      // 50: iload 1
      // 51: bipush 12
      // 53: ishl
      // 54: iload 3
      // 55: bipush 8
      // 57: ishl
      // 58: ior
      // 59: iload 2
      // 5a: goto 61
      // 5d: invokestatic ey1$d08.a (Loov;)Loov;
      // 60: athrow
      // 61: ior
      // 62: i2s
      // 63: istore 5
      // 65: bipush 0
      // 66: istore 6
      // 68: iload 6
      // 6a: aload 0
      // 6b: getfield ey1$d08.f7n I
      // 6e: if_icmpge 96
      // 71: aload 0
      // 72: getfield ey1$d08.jcw [S
      // 75: iload 6
      // 77: iload 4
      // 79: ifne a5
      // 7c: saload
      // 7d: iload 5
      // 7f: if_icmpne 8e
      // 82: goto 89
      // 85: invokestatic ey1$d08.a (Loov;)Loov;
      // 88: athrow
      // 89: return
      // 8a: invokestatic ey1$d08.a (Loov;)Loov;
      // 8d: athrow
      // 8e: iinc 6 1
      // 91: iload 4
      // 93: ifeq 68
      // 96: aload 0
      // 97: getfield ey1$d08.jcw [S
      // 9a: aload 0
      // 9b: dup
      // 9c: getfield ey1$d08.f7n I
      // 9f: dup_x1
      // a0: bipush 1
      // a1: iadd
      // a2: putfield ey1$d08.f7n I
      // a5: iload 5
      // a7: sastore
      // a8: return
   }

   public void aak(mz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: aload 0
      // 08: getfield ey1$d08.yvc Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge 55
      // 13: aload 0
      // 14: getfield ey1$d08.yvc Ljava/util/List;
      // 17: iload 3
      // 18: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d: checkcast z96
      // 20: astore 4
      // 22: iload 2
      // 23: ifeq 51
      // 26: aload 4
      // 28: getfield z96.u8j Ljava/util/List;
      // 2b: aload 0
      // 2c: getfield ey1$d08.n_a Lh2f;
      // 2f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 34: ifne 4e
      // 37: goto 3e
      // 3a: invokestatic ey1$d08.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 4
      // 40: getfield z96.rhh Lmlk;
      // 43: aload 1
      // 44: invokevirtual mlk.vnf (Lmz2;)V
      // 47: goto 4e
      // 4a: invokestatic ey1$d08.a (Loov;)Loov;
      // 4d: athrow
      // 4e: iinc 3 1
      // 51: iload 2
      // 52: ifne 06
      // 55: return
   }

   public void q84() {
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
      // 005: getfield ey1$d08.f7n I
      // 008: iload 1
      // 009: ifne 021
      // 00c: ifeq 291
      // 00f: goto 016
      // 012: invokestatic ey1$d08.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield ey1$d08.f7n I
      // 01a: goto 021
      // 01d: invokestatic ey1$d08.a (Loov;)Loov;
      // 020: athrow
      // 021: bipush 1
      // 022: iload 1
      // 023: ifne 0d7
      // 026: if_icmpne 0ca
      // 029: goto 030
      // 02c: invokestatic ey1$d08.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 0
      // 031: getfield ey1$d08.jcw [S
      // 034: bipush 0
      // 035: saload
      // 036: bipush 12
      // 038: ishr
      // 039: bipush 15
      // 03b: iand
      // 03c: aload 0
      // 03d: getfield ey1$d08.n_a Lh2f;
      // 040: getfield h2f.jnd I
      // 043: bipush 16
      // 045: imul
      // 046: iadd
      // 047: istore 2
      // 048: aload 0
      // 049: getfield ey1$d08.jcw [S
      // 04c: bipush 0
      // 04d: saload
      // 04e: sipush 255
      // 051: iand
      // 052: istore 3
      // 053: aload 0
      // 054: getfield ey1$d08.jcw [S
      // 057: bipush 0
      // 058: saload
      // 059: bipush 8
      // 05b: ishr
      // 05c: bipush 15
      // 05e: iand
      // 05f: aload 0
      // 060: getfield ey1$d08.n_a Lh2f;
      // 063: getfield h2f.km5 I
      // 066: bipush 16
      // 068: imul
      // 069: iadd
      // 06a: istore 4
      // 06c: new mew
      // 06f: dup
      // 070: iload 2
      // 071: iload 3
      // 072: iload 4
      // 074: invokespecial mew.<init> (III)V
      // 077: astore 5
      // 079: aload 0
      // 07a: new net/minecraft/network/play/server/S23PacketBlockChange
      // 07d: dup
      // 07e: aload 0
      // 07f: getfield ey1$d08.wu2 Ley1;
      // 082: invokestatic ey1.u4y (Ley1;)Ldug;
      // 085: aload 5
      // 087: invokespecial net/minecraft/network/play/server/S23PacketBlockChange.<init> (Lt9d;Lmew;)V
      // 08a: invokevirtual ey1$d08.aak (Lmz2;)V
      // 08d: aload 0
      // 08e: iload 1
      // 08f: ifne 0b7
      // 092: getfield ey1$d08.wu2 Ley1;
      // 095: invokestatic ey1.u4y (Ley1;)Ldug;
      // 098: aload 5
      // 09a: invokevirtual dug.getBlockState (Lmew;)Lzfz;
      // 09d: invokeinterface zfz.r_y ()Le0x; 1
      // 0a2: invokevirtual e0x.caz ()Z
      // 0a5: ifeq 0c6
      // 0a8: goto 0af
      // 0ab: invokestatic ey1$d08.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: goto 0b7
      // 0b3: invokestatic ey1$d08.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: getfield ey1$d08.wu2 Ley1;
      // 0bb: invokestatic ey1.u4y (Ley1;)Ldug;
      // 0be: aload 5
      // 0c0: invokevirtual dug.getTileEntity (Lmew;)Lpyk;
      // 0c3: invokespecial ey1$d08.gg4 (Lpyk;)V
      // 0c6: iload 1
      // 0c7: ifeq 287
      // 0ca: aload 0
      // 0cb: getfield ey1$d08.f7n I
      // 0ce: bipush 64
      // 0d0: goto 0d7
      // 0d3: invokestatic ey1$d08.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: iload 1
      // 0d8: ifne 1c4
      // 0db: if_icmpeq 1b4
      // 0de: goto 0e5
      // 0e1: invokestatic ey1$d08.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: new net/minecraft/network/play/server/S22PacketMultiBlockChange
      // 0e9: dup
      // 0ea: aload 0
      // 0eb: getfield ey1$d08.f7n I
      // 0ee: aload 0
      // 0ef: getfield ey1$d08.jcw [S
      // 0f2: aload 0
      // 0f3: getfield ey1$d08.wu2 Ley1;
      // 0f6: invokestatic ey1.u4y (Ley1;)Ldug;
      // 0f9: aload 0
      // 0fa: getfield ey1$d08.n_a Lh2f;
      // 0fd: getfield h2f.jnd I
      // 100: aload 0
      // 101: getfield ey1$d08.n_a Lh2f;
      // 104: getfield h2f.km5 I
      // 107: invokevirtual dug.o5h (II)Ltts;
      // 10a: invokespecial net/minecraft/network/play/server/S22PacketMultiBlockChange.<init> (I[SLtts;)V
      // 10d: invokevirtual ey1$d08.aak (Lmz2;)V
      // 110: bipush 0
      // 111: istore 2
      // 112: iload 2
      // 113: aload 0
      // 114: getfield ey1$d08.f7n I
      // 117: if_icmpge 1b0
      // 11a: aload 0
      // 11b: getfield ey1$d08.jcw [S
      // 11e: iload 2
      // 11f: saload
      // 120: bipush 12
      // 122: ishr
      // 123: bipush 15
      // 125: iand
      // 126: aload 0
      // 127: getfield ey1$d08.n_a Lh2f;
      // 12a: getfield h2f.jnd I
      // 12d: bipush 16
      // 12f: imul
      // 130: iadd
      // 131: istore 3
      // 132: aload 0
      // 133: getfield ey1$d08.jcw [S
      // 136: iload 2
      // 137: saload
      // 138: sipush 255
      // 13b: iand
      // 13c: istore 4
      // 13e: aload 0
      // 13f: getfield ey1$d08.jcw [S
      // 142: iload 2
      // 143: saload
      // 144: bipush 8
      // 146: ishr
      // 147: bipush 15
      // 149: iand
      // 14a: aload 0
      // 14b: getfield ey1$d08.n_a Lh2f;
      // 14e: getfield h2f.km5 I
      // 151: bipush 16
      // 153: imul
      // 154: iadd
      // 155: istore 5
      // 157: new mew
      // 15a: dup
      // 15b: iload 3
      // 15c: iload 4
      // 15e: iload 5
      // 160: invokespecial mew.<init> (III)V
      // 163: astore 6
      // 165: iload 1
      // 166: ifne 1ac
      // 169: aload 0
      // 16a: iload 1
      // 16b: ifne 28d
      // 16e: goto 175
      // 171: invokestatic ey1$d08.a (Loov;)Loov;
      // 174: athrow
      // 175: getfield ey1$d08.wu2 Ley1;
      // 178: invokestatic ey1.u4y (Ley1;)Ldug;
      // 17b: aload 6
      // 17d: invokevirtual dug.getBlockState (Lmew;)Lzfz;
      // 180: invokeinterface zfz.r_y ()Le0x; 1
      // 185: invokevirtual e0x.caz ()Z
      // 188: ifeq 1a9
      // 18b: goto 192
      // 18e: invokestatic ey1$d08.a (Loov;)Loov;
      // 191: athrow
      // 192: aload 0
      // 193: aload 0
      // 194: getfield ey1$d08.wu2 Ley1;
      // 197: invokestatic ey1.u4y (Ley1;)Ldug;
      // 19a: aload 6
      // 19c: invokevirtual dug.getTileEntity (Lmew;)Lpyk;
      // 19f: invokespecial ey1$d08.gg4 (Lpyk;)V
      // 1a2: goto 1a9
      // 1a5: invokestatic ey1$d08.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: iinc 2 1
      // 1ac: iload 1
      // 1ad: ifeq 112
      // 1b0: iload 1
      // 1b1: ifeq 287
      // 1b4: aload 0
      // 1b5: getfield ey1$d08.n_a Lh2f;
      // 1b8: getfield h2f.jnd I
      // 1bb: bipush 16
      // 1bd: goto 1c4
      // 1c0: invokestatic ey1$d08.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: imul
      // 1c5: istore 2
      // 1c6: aload 0
      // 1c7: getfield ey1$d08.n_a Lh2f;
      // 1ca: getfield h2f.km5 I
      // 1cd: bipush 16
      // 1cf: imul
      // 1d0: istore 3
      // 1d1: aload 0
      // 1d2: new net/minecraft/network/play/server/S21PacketChunkData
      // 1d5: dup
      // 1d6: aload 0
      // 1d7: getfield ey1$d08.wu2 Ley1;
      // 1da: invokestatic ey1.u4y (Ley1;)Ldug;
      // 1dd: aload 0
      // 1de: getfield ey1$d08.n_a Lh2f;
      // 1e1: getfield h2f.jnd I
      // 1e4: aload 0
      // 1e5: getfield ey1$d08.n_a Lh2f;
      // 1e8: getfield h2f.km5 I
      // 1eb: invokevirtual dug.o5h (II)Ltts;
      // 1ee: bipush 0
      // 1ef: aload 0
      // 1f0: getfield ey1$d08.zgk I
      // 1f3: invokespecial net/minecraft/network/play/server/S21PacketChunkData.<init> (Ltts;ZI)V
      // 1f6: invokevirtual ey1$d08.aak (Lmz2;)V
      // 1f9: bipush 0
      // 1fa: istore 4
      // 1fc: iload 4
      // 1fe: bipush 16
      // 200: if_icmpge 287
      // 203: aload 0
      // 204: iload 1
      // 205: ifne 28d
      // 208: getfield ey1$d08.zgk I
      // 20b: bipush 1
      // 20c: iload 4
      // 20e: ishl
      // 20f: iand
      // 210: iload 1
      // 211: ifne 230
      // 214: goto 21b
      // 217: invokestatic ey1$d08.a (Loov;)Loov;
      // 21a: athrow
      // 21b: ifeq 280
      // 21e: goto 225
      // 221: invokestatic ey1$d08.a (Loov;)Loov;
      // 224: athrow
      // 225: iload 4
      // 227: bipush 4
      // 228: ishl
      // 229: goto 230
      // 22c: invokestatic ey1$d08.a (Loov;)Loov;
      // 22f: athrow
      // 230: istore 5
      // 232: aload 0
      // 233: getfield ey1$d08.wu2 Ley1;
      // 236: invokestatic ey1.u4y (Ley1;)Ldug;
      // 239: iload 2
      // 23a: iload 5
      // 23c: iload 3
      // 23d: iload 2
      // 23e: bipush 16
      // 240: iadd
      // 241: iload 5
      // 243: bipush 16
      // 245: iadd
      // 246: iload 3
      // 247: bipush 16
      // 249: iadd
      // 24a: invokevirtual dug._12 (IIIIII)Ljava/util/List;
      // 24d: astore 6
      // 24f: bipush 0
      // 250: istore 7
      // 252: iload 7
      // 254: aload 6
      // 256: invokeinterface java/util/List.size ()I 1
      // 25b: if_icmpge 280
      // 25e: aload 0
      // 25f: aload 6
      // 261: iload 7
      // 263: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 268: checkcast pyk
      // 26b: invokespecial ey1$d08.gg4 (Lpyk;)V
      // 26e: iinc 7 1
      // 271: iload 1
      // 272: ifne 283
      // 275: iload 1
      // 276: ifeq 252
      // 279: goto 280
      // 27c: invokestatic ey1$d08.a (Loov;)Loov;
      // 27f: athrow
      // 280: iinc 4 1
      // 283: iload 1
      // 284: ifeq 1fc
      // 287: aload 0
      // 288: bipush 0
      // 289: putfield ey1$d08.f7n I
      // 28c: aload 0
      // 28d: bipush 0
      // 28e: putfield ey1$d08.zgk I
      // 291: return
   }

   private void gg4(pyk var1) {
      int var2 = t9d.b();

      pyk var10000;
      label28: {
         try {
            var10000 = var1;
            if (var2 == 0) {
               break label28;
            }

            if (var1 == null) {
               return;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var1;
      }

      mz2 var3 = var10000.ptb();

      try {
         if (var3 != null) {
            this.aak(var3);
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   public static h2f cbu(ey1$d08 var0) {
      return var0.n_a;
   }

   public static List sz3(ey1$d08 var0) {
      return var0.yvc;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4442148362835269484L, -7406862075370843507L, MethodHandles.lookup().lookupClass()).a(248261355767823L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 7734519273819L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "F\\*¹ßtâD\u0007\u009ccý]\u0000Úa\u009eõ1æ\u0006\u009dÏ|åQÅÉÇÁb¤\u009f^\u0097\u0095ðwqÞød¼UåTV\u0087·\u00056Þ%8O^".getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
