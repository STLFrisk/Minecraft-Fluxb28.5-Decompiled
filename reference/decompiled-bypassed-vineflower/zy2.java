import java.util.BitSet;
import java.util.Set;

public class zy2 {
   private static final int qbb;
   private static final int l3z;
   private static final int r52;
   private final BitSet x7t = new BitSet(4096);
   private static final int[] xt0;
   private int de0 = 4096;

   public void fzu(mew var1) {
      this.x7t.set(pj8(var1), true);
      this.de0--;
   }

   private static int pj8(mew var0) {
      return enx(var0.getX() & 15, var0.getY() & 15, var0.getZ() & 15);
   }

   private static int enx(int var0, int var1, int var2) {
      return var0 << 0 | var1 << 8 | var2 << 4;
   }

   public jcs bsi() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: new jcs
      // 07: dup
      // 08: invokespecial jcs.<init> ()V
      // 0b: astore 2
      // 0c: sipush 4096
      // 0f: aload 0
      // 10: getfield zy2.de0 I
      // 13: isub
      // 14: iload 1
      // 15: ifeq 40
      // 18: sipush 256
      // 1b: if_icmpge 35
      // 1e: goto 25
      // 21: invokestatic zy2.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 2
      // 26: bipush 1
      // 27: invokevirtual jcs.f2e (Z)V
      // 2a: iload 1
      // 2b: ifne 9a
      // 2e: goto 35
      // 31: invokestatic zy2.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield zy2.de0 I
      // 39: goto 40
      // 3c: invokestatic zy2.a (Loov;)Loov;
      // 3f: athrow
      // 40: ifne 53
      // 43: aload 2
      // 44: bipush 0
      // 45: invokevirtual jcs.f2e (Z)V
      // 48: iload 1
      // 49: ifne 9a
      // 4c: goto 53
      // 4f: invokestatic zy2.a (Loov;)Loov;
      // 52: athrow
      // 53: getstatic zy2.xt0 [I
      // 56: astore 3
      // 57: aload 3
      // 58: arraylength
      // 59: istore 4
      // 5b: bipush 0
      // 5c: istore 5
      // 5e: iload 5
      // 60: iload 4
      // 62: if_icmpge 9a
      // 65: aload 3
      // 66: iload 5
      // 68: iaload
      // 69: istore 6
      // 6b: iload 1
      // 6c: ifeq 96
      // 6f: aload 0
      // 70: getfield zy2.x7t Ljava/util/BitSet;
      // 73: iload 6
      // 75: invokevirtual java/util/BitSet.get (I)Z
      // 78: ifne 93
      // 7b: goto 82
      // 7e: invokestatic zy2.a (Loov;)Loov;
      // 81: athrow
      // 82: aload 2
      // 83: aload 0
      // 84: iload 6
      // 86: invokespecial zy2.scr (I)Ljava/util/Set;
      // 89: invokevirtual jcs.k_i (Ljava/util/Set;)V
      // 8c: goto 93
      // 8f: invokestatic zy2.a (Loov;)Loov;
      // 92: athrow
      // 93: iinc 5 1
      // 96: iload 1
      // 97: ifne 5e
      // 9a: aload 2
      // 9b: areturn
   }

   public Set ehq(mew var1) {
      return this.scr(pj8(var1));
   }

   private Set scr(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc vt2
      // 02: nop
      // 03: invokestatic java/util/EnumSet.noneOf (Ljava/lang/Class;)Ljava/util/EnumSet;
      // 06: astore 3
      // 07: invokestatic t9d.c ()I
      // 0a: new java/util/ArrayDeque
      // 0d: dup
      // 0e: sipush 384
      // 11: invokespecial java/util/ArrayDeque.<init> (I)V
      // 14: astore 4
      // 16: istore 2
      // 17: aload 4
      // 19: iload 1
      // 1a: invokestatic p0z.cng (I)Ljava/lang/Integer;
      // 1d: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
      // 22: pop
      // 23: aload 0
      // 24: getfield zy2.x7t Ljava/util/BitSet;
      // 27: iload 1
      // 28: bipush 1
      // 29: invokevirtual java/util/BitSet.set (IZ)V
      // 2c: aload 4
      // 2e: invokeinterface java/util/Queue.isEmpty ()Z 1
      // 33: ifne cc
      // 36: aload 4
      // 38: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
      // 3d: checkcast java/lang/Integer
      // 40: invokevirtual java/lang/Integer.intValue ()I
      // 43: istore 5
      // 45: aload 0
      // 46: iload 5
      // 48: aload 3
      // 49: invokespecial zy2.ngf (ILjava/util/Set;)V
      // 4c: getstatic vt2.vbu [Lvt2;
      // 4f: astore 6
      // 51: aload 6
      // 53: arraylength
      // 54: istore 7
      // 56: bipush 0
      // 57: istore 8
      // 59: iload 8
      // 5b: iload 7
      // 5d: if_icmpge c8
      // 60: aload 6
      // 62: iload 8
      // 64: aaload
      // 65: astore 9
      // 67: aload 0
      // 68: iload 5
      // 6a: aload 9
      // 6c: invokespecial zy2.xgc (ILvt2;)I
      // 6f: istore 10
      // 71: iload 2
      // 72: ifne c4
      // 75: iload 10
      // 77: iload 2
      // 78: ifne 33
      // 7b: goto 82
      // 7e: invokestatic zy2.a (Loov;)Loov;
      // 81: athrow
      // 82: iflt c1
      // 85: aload 0
      // 86: getfield zy2.x7t Ljava/util/BitSet;
      // 89: iload 10
      // 8b: invokevirtual java/util/BitSet.get (I)Z
      // 8e: iload 2
      // 8f: ifne c0
      // 92: goto 99
      // 95: invokestatic zy2.a (Loov;)Loov;
      // 98: athrow
      // 99: ifne c1
      // 9c: goto a3
      // 9f: invokestatic zy2.a (Loov;)Loov;
      // a2: athrow
      // a3: aload 0
      // a4: getfield zy2.x7t Ljava/util/BitSet;
      // a7: iload 10
      // a9: bipush 1
      // aa: invokevirtual java/util/BitSet.set (IZ)V
      // ad: aload 4
      // af: iload 10
      // b1: invokestatic p0z.cng (I)Ljava/lang/Integer;
      // b4: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
      // b9: goto c0
      // bc: invokestatic zy2.a (Loov;)Loov;
      // bf: athrow
      // c0: pop
      // c1: iinc 8 1
      // c4: iload 2
      // c5: ifeq 59
      // c8: iload 2
      // c9: ifeq 2c
      // cc: aload 3
      // cd: areturn
   }

   private void ngf(int param1, Set param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: iload 1
      // 005: bipush 0
      // 006: ishr
      // 007: bipush 15
      // 009: iand
      // 00a: istore 4
      // 00c: iload 4
      // 00e: iload 3
      // 00f: ifeq 03a
      // 012: ifne 031
      // 015: goto 01c
      // 018: invokestatic zy2.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 2
      // 01d: getstatic vt2.te4 Lvt2;
      // 020: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 025: pop
      // 026: iload 3
      // 027: ifne 05b
      // 02a: goto 031
      // 02d: invokestatic zy2.a (Loov;)Loov;
      // 030: athrow
      // 031: iload 4
      // 033: goto 03a
      // 036: invokestatic zy2.a (Loov;)Loov;
      // 039: athrow
      // 03a: bipush 15
      // 03c: iload 3
      // 03d: ifeq 061
      // 040: if_icmpne 05b
      // 043: goto 04a
      // 046: invokestatic zy2.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 2
      // 04b: getstatic vt2.zk4 Lvt2;
      // 04e: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 053: pop
      // 054: goto 05b
      // 057: invokestatic zy2.a (Loov;)Loov;
      // 05a: athrow
      // 05b: iload 1
      // 05c: bipush 8
      // 05e: ishr
      // 05f: bipush 15
      // 061: iand
      // 062: istore 5
      // 064: iload 5
      // 066: iload 3
      // 067: ifeq 092
      // 06a: ifne 089
      // 06d: goto 074
      // 070: invokestatic zy2.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 2
      // 075: getstatic vt2.m3r Lvt2;
      // 078: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 07d: pop
      // 07e: iload 3
      // 07f: ifne 0b3
      // 082: goto 089
      // 085: invokestatic zy2.a (Loov;)Loov;
      // 088: athrow
      // 089: iload 5
      // 08b: goto 092
      // 08e: invokestatic zy2.a (Loov;)Loov;
      // 091: athrow
      // 092: bipush 15
      // 094: iload 3
      // 095: ifeq 0b8
      // 098: if_icmpne 0b3
      // 09b: goto 0a2
      // 09e: invokestatic zy2.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 2
      // 0a3: getstatic vt2.rf3 Lvt2;
      // 0a6: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0ab: pop
      // 0ac: goto 0b3
      // 0af: invokestatic zy2.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: iload 1
      // 0b4: bipush 4
      // 0b5: ishr
      // 0b6: bipush 15
      // 0b8: iand
      // 0b9: istore 6
      // 0bb: iload 6
      // 0bd: iload 3
      // 0be: ifeq 0e9
      // 0c1: ifne 0e0
      // 0c4: goto 0cb
      // 0c7: invokestatic zy2.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 2
      // 0cc: getstatic vt2.z9q Lvt2;
      // 0cf: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0d4: pop
      // 0d5: iload 3
      // 0d6: ifne 10a
      // 0d9: goto 0e0
      // 0dc: invokestatic zy2.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: iload 6
      // 0e2: goto 0e9
      // 0e5: invokestatic zy2.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: iload 3
      // 0ea: ifeq 109
      // 0ed: bipush 15
      // 0ef: if_icmpne 10a
      // 0f2: goto 0f9
      // 0f5: invokestatic zy2.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 2
      // 0fa: getstatic vt2.mxp Lvt2;
      // 0fd: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 102: goto 109
      // 105: invokestatic zy2.a (Loov;)Loov;
      // 108: athrow
      // 109: pop
      // 10a: return
   }

   private int xgc(int param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: getstatic zy2$1.dxl [I
      // 007: aload 2
      // 008: invokevirtual vt2.ordinal ()I
      // 00b: iaload
      // 00c: iload 3
      // 00d: ifne 10c
      // 010: tableswitch 251 1 6 44 84 119 151 185 217
      // 038: invokestatic zy2.a (Loov;)Loov;
      // 03b: athrow
      // 03c: iload 1
      // 03d: bipush 8
      // 03f: ishr
      // 040: bipush 15
      // 042: iand
      // 043: iload 3
      // 044: ifne 063
      // 047: goto 04e
      // 04a: invokestatic zy2.a (Loov;)Loov;
      // 04d: athrow
      // 04e: ifne 05e
      // 051: goto 058
      // 054: invokestatic zy2.a (Loov;)Loov;
      // 057: athrow
      // 058: bipush -1
      // 059: ireturn
      // 05a: invokestatic zy2.a (Loov;)Loov;
      // 05d: athrow
      // 05e: iload 1
      // 05f: getstatic zy2.r52 I
      // 062: isub
      // 063: ireturn
      // 064: iload 1
      // 065: bipush 8
      // 067: ishr
      // 068: bipush 15
      // 06a: iand
      // 06b: bipush 15
      // 06d: iload 3
      // 06e: ifne 085
      // 071: if_icmpne 081
      // 074: goto 07b
      // 077: invokestatic zy2.a (Loov;)Loov;
      // 07a: athrow
      // 07b: bipush -1
      // 07c: ireturn
      // 07d: invokestatic zy2.a (Loov;)Loov;
      // 080: athrow
      // 081: iload 1
      // 082: getstatic zy2.r52 I
      // 085: iadd
      // 086: ireturn
      // 087: iload 1
      // 088: bipush 4
      // 089: ishr
      // 08a: bipush 15
      // 08c: iand
      // 08d: iload 3
      // 08e: ifne 0a6
      // 091: ifne 0a1
      // 094: goto 09b
      // 097: invokestatic zy2.a (Loov;)Loov;
      // 09a: athrow
      // 09b: bipush -1
      // 09c: ireturn
      // 09d: invokestatic zy2.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: iload 1
      // 0a2: getstatic zy2.l3z I
      // 0a5: isub
      // 0a6: ireturn
      // 0a7: iload 1
      // 0a8: bipush 4
      // 0a9: ishr
      // 0aa: bipush 15
      // 0ac: iand
      // 0ad: bipush 15
      // 0af: iload 3
      // 0b0: ifne 0c7
      // 0b3: if_icmpne 0c3
      // 0b6: goto 0bd
      // 0b9: invokestatic zy2.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: bipush -1
      // 0be: ireturn
      // 0bf: invokestatic zy2.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: iload 1
      // 0c4: getstatic zy2.l3z I
      // 0c7: iadd
      // 0c8: ireturn
      // 0c9: iload 1
      // 0ca: bipush 0
      // 0cb: ishr
      // 0cc: bipush 15
      // 0ce: iand
      // 0cf: iload 3
      // 0d0: ifne 0e8
      // 0d3: ifne 0e3
      // 0d6: goto 0dd
      // 0d9: invokestatic zy2.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: bipush -1
      // 0de: ireturn
      // 0df: invokestatic zy2.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: iload 1
      // 0e4: getstatic zy2.qbb I
      // 0e7: isub
      // 0e8: ireturn
      // 0e9: iload 1
      // 0ea: bipush 0
      // 0eb: ishr
      // 0ec: bipush 15
      // 0ee: iand
      // 0ef: bipush 15
      // 0f1: iload 3
      // 0f2: ifne 109
      // 0f5: if_icmpne 105
      // 0f8: goto 0ff
      // 0fb: invokestatic zy2.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: bipush -1
      // 100: ireturn
      // 101: invokestatic zy2.a (Loov;)Loov;
      // 104: athrow
      // 105: iload 1
      // 106: getstatic zy2.qbb I
      // 109: iadd
      // 10a: ireturn
      // 10b: bipush -1
      // 10c: ireturn
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 16.0
      // 03: dconst_0
      // 04: invokestatic java/lang/Math.pow (DD)D
      // 07: d2i
      // 08: putstatic zy2.qbb I
      // 0b: ldc2_w 16.0
      // 0e: dconst_1
      // 0f: invokestatic java/lang/Math.pow (DD)D
      // 12: d2i
      // 13: putstatic zy2.l3z I
      // 16: ldc2_w 16.0
      // 19: ldc2_w 2.0
      // 1c: invokestatic java/lang/Math.pow (DD)D
      // 1f: d2i
      // 20: putstatic zy2.r52 I
      // 23: sipush 1352
      // 26: newarray 10
      // 28: putstatic zy2.xt0 [I
      // 2b: bipush 0
      // 2c: istore 0
      // 2d: bipush 15
      // 2f: istore 1
      // 30: bipush 0
      // 31: istore 2
      // 32: bipush 0
      // 33: istore 3
      // 34: iload 3
      // 35: bipush 16
      // 37: if_icmpge c3
      // 3a: bipush 0
      // 3b: istore 4
      // 3d: iload 4
      // 3f: bipush 16
      // 41: if_icmpge bd
      // 44: bipush 0
      // 45: istore 5
      // 47: iload 5
      // 49: bipush 16
      // 4b: if_icmpge b7
      // 4e: iload 3
      // 4f: ifeq 9a
      // 52: goto 59
      // 55: invokestatic zy2.a (Loov;)Loov;
      // 58: athrow
      // 59: iload 3
      // 5a: bipush 15
      // 5c: if_icmpeq 9a
      // 5f: goto 66
      // 62: invokestatic zy2.a (Loov;)Loov;
      // 65: athrow
      // 66: iload 4
      // 68: ifeq 9a
      // 6b: goto 72
      // 6e: invokestatic zy2.a (Loov;)Loov;
      // 71: athrow
      // 72: iload 4
      // 74: bipush 15
      // 76: if_icmpeq 9a
      // 79: goto 80
      // 7c: invokestatic zy2.a (Loov;)Loov;
      // 7f: athrow
      // 80: iload 5
      // 82: ifeq 9a
      // 85: goto 8c
      // 88: invokestatic zy2.a (Loov;)Loov;
      // 8b: athrow
      // 8c: iload 5
      // 8e: bipush 15
      // 90: if_icmpne b1
      // 93: goto 9a
      // 96: invokestatic zy2.a (Loov;)Loov;
      // 99: athrow
      // 9a: getstatic zy2.xt0 [I
      // 9d: iload 2
      // 9e: iinc 2 1
      // a1: iload 3
      // a2: iload 4
      // a4: iload 5
      // a6: invokestatic zy2.enx (III)I
      // a9: iastore
      // aa: goto b1
      // ad: invokestatic zy2.a (Loov;)Loov;
      // b0: athrow
      // b1: iinc 5 1
      // b4: goto 47
      // b7: iinc 4 1
      // ba: goto 3d
      // bd: iinc 3 1
      // c0: goto 34
      // c3: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
