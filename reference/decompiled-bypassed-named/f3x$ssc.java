import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class f3x$ssc extends ed7 {
   public int d4i;
   public List _1h;
   public Comparator otn;
   public int c9s;
   public int uh5;
   public final f3x gw_;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public f3x$ssc(f3x var1, Minecraft var2) {
      super(var2, var1.dt7, var1.o1e, 32, var1.o1e - 64, 20);
      this.gw_ = var1;
      this.d4i = -1;
      this.c9s = -1;
      this.fai(false);
      this.lfu(true, 20);
   }

   @Override
   public void elementClicked(int var1, boolean var2, int var3, int var4) {
   }

   @Override
   public boolean isSelected(int var1) {
      return false;
   }

   @Override
   public void drawBackground() {
      this.gw_.xmz();
   }

   @Override
   public void xwh(int param1, int param2, jom param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: bipush 0
      // 006: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 009: iload 4
      // 00b: ifeq 034
      // 00e: ifne 024
      // 011: goto 018
      // 014: invokestatic f3x$ssc.c (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: bipush -1
      // 01a: putfield f3x$ssc.d4i I
      // 01d: goto 024
      // 020: invokestatic f3x$ssc.c (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: iload 4
      // 027: ifeq 05e
      // 02a: getfield f3x$ssc.d4i I
      // 02d: goto 034
      // 030: invokestatic f3x$ssc.c (Loov;)Loov;
      // 033: athrow
      // 034: ifne 056
      // 037: aload 0
      // 038: getfield f3x$ssc.gw_ Lf3x;
      // 03b: iload 1
      // 03c: bipush 115
      // 03e: iadd
      // 03f: bipush 18
      // 041: isub
      // 042: iload 2
      // 043: bipush 1
      // 044: iadd
      // 045: bipush 0
      // 046: bipush 0
      // 047: invokestatic f3x._e5 (Lf3x;IIII)V
      // 04a: iload 4
      // 04c: ifne 071
      // 04f: goto 056
      // 052: invokestatic f3x$ssc.c (Loov;)Loov;
      // 055: athrow
      // 056: aload 0
      // 057: goto 05e
      // 05a: invokestatic f3x$ssc.c (Loov;)Loov;
      // 05d: athrow
      // 05e: getfield f3x$ssc.gw_ Lf3x;
      // 061: iload 1
      // 062: bipush 115
      // 064: iadd
      // 065: bipush 18
      // 067: isub
      // 068: iload 2
      // 069: bipush 1
      // 06a: iadd
      // 06b: bipush 0
      // 06c: bipush 18
      // 06e: invokestatic f3x._e5 (Lf3x;IIII)V
      // 071: aload 0
      // 072: iload 4
      // 074: ifeq 0ad
      // 077: getfield f3x$ssc.d4i I
      // 07a: bipush 1
      // 07b: if_icmpne 0a5
      // 07e: goto 085
      // 081: invokestatic f3x$ssc.c (Loov;)Loov;
      // 084: athrow
      // 085: aload 0
      // 086: getfield f3x$ssc.gw_ Lf3x;
      // 089: iload 1
      // 08a: sipush 165
      // 08d: iadd
      // 08e: bipush 18
      // 090: isub
      // 091: iload 2
      // 092: bipush 1
      // 093: iadd
      // 094: bipush 0
      // 095: bipush 0
      // 096: invokestatic f3x._e5 (Lf3x;IIII)V
      // 099: iload 4
      // 09b: ifne 0c1
      // 09e: goto 0a5
      // 0a1: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: goto 0ad
      // 0a9: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0ac: athrow
      // 0ad: getfield f3x$ssc.gw_ Lf3x;
      // 0b0: iload 1
      // 0b1: sipush 165
      // 0b4: iadd
      // 0b5: bipush 18
      // 0b7: isub
      // 0b8: iload 2
      // 0b9: bipush 1
      // 0ba: iadd
      // 0bb: bipush 0
      // 0bc: bipush 18
      // 0be: invokestatic f3x._e5 (Lf3x;IIII)V
      // 0c1: aload 0
      // 0c2: iload 4
      // 0c4: ifeq 0fd
      // 0c7: getfield f3x$ssc.d4i I
      // 0ca: bipush 2
      // 0cb: if_icmpne 0f5
      // 0ce: goto 0d5
      // 0d1: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: getfield f3x$ssc.gw_ Lf3x;
      // 0d9: iload 1
      // 0da: sipush 215
      // 0dd: iadd
      // 0de: bipush 18
      // 0e0: isub
      // 0e1: iload 2
      // 0e2: bipush 1
      // 0e3: iadd
      // 0e4: bipush 0
      // 0e5: bipush 0
      // 0e6: invokestatic f3x._e5 (Lf3x;IIII)V
      // 0e9: iload 4
      // 0eb: ifne 111
      // 0ee: goto 0f5
      // 0f1: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: goto 0fd
      // 0f9: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0fc: athrow
      // 0fd: getfield f3x$ssc.gw_ Lf3x;
      // 100: iload 1
      // 101: sipush 215
      // 104: iadd
      // 105: bipush 18
      // 107: isub
      // 108: iload 2
      // 109: bipush 1
      // 10a: iadd
      // 10b: bipush 0
      // 10c: bipush 18
      // 10e: invokestatic f3x._e5 (Lf3x;IIII)V
      // 111: aload 0
      // 112: getfield f3x$ssc.c9s I
      // 115: iload 4
      // 117: ifeq 12e
      // 11a: bipush -1
      // 11b: if_icmpeq 19b
      // 11e: goto 125
      // 121: invokestatic f3x$ssc.c (Loov;)Loov;
      // 124: athrow
      // 125: bipush 79
      // 127: goto 12e
      // 12a: invokestatic f3x$ssc.c (Loov;)Loov;
      // 12d: athrow
      // 12e: istore 5
      // 130: bipush 18
      // 132: istore 6
      // 134: aload 0
      // 135: getfield f3x$ssc.c9s I
      // 138: bipush 1
      // 139: iload 4
      // 13b: ifeq 15e
      // 13e: if_icmpne 152
      // 141: goto 148
      // 144: invokestatic f3x$ssc.c (Loov;)Loov;
      // 147: athrow
      // 148: sipush 129
      // 14b: istore 5
      // 14d: iload 4
      // 14f: ifne 172
      // 152: aload 0
      // 153: getfield f3x$ssc.c9s I
      // 156: bipush 2
      // 157: goto 15e
      // 15a: invokestatic f3x$ssc.c (Loov;)Loov;
      // 15d: athrow
      // 15e: iload 4
      // 160: ifeq 183
      // 163: if_icmpne 172
      // 166: goto 16d
      // 169: invokestatic f3x$ssc.c (Loov;)Loov;
      // 16c: athrow
      // 16d: sipush 179
      // 170: istore 5
      // 172: aload 0
      // 173: iload 4
      // 175: ifeq 18b
      // 178: getfield f3x$ssc.uh5 I
      // 17b: bipush 1
      // 17c: goto 183
      // 17f: invokestatic f3x$ssc.c (Loov;)Loov;
      // 182: athrow
      // 183: if_icmpne 18a
      // 186: bipush 36
      // 188: istore 6
      // 18a: aload 0
      // 18b: getfield f3x$ssc.gw_ Lf3x;
      // 18e: iload 1
      // 18f: iload 5
      // 191: iadd
      // 192: iload 2
      // 193: bipush 1
      // 194: iadd
      // 195: iload 6
      // 197: bipush 0
      // 198: invokestatic f3x._e5 (Lf3x;IIII)V
      // 19b: return
   }

   @Override
   public void n_7(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic f3x$ssc.b J
      // 003: ldc2_w 64649867826477
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: bipush -1
      // 00f: putfield f3x$ssc.d4i I
      // 012: iload 1
      // 013: bipush 79
      // 015: iload 5
      // 017: ifeq 059
      // 01a: if_icmplt 04e
      // 01d: goto 024
      // 020: invokestatic f3x$ssc.c (Loov;)Loov;
      // 023: athrow
      // 024: iload 1
      // 025: bipush 115
      // 027: iload 5
      // 029: ifeq 059
      // 02c: goto 033
      // 02f: invokestatic f3x$ssc.c (Loov;)Loov;
      // 032: athrow
      // 033: if_icmpge 04e
      // 036: goto 03d
      // 039: invokestatic f3x$ssc.c (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: bipush 0
      // 03f: putfield f3x$ssc.d4i I
      // 042: iload 5
      // 044: ifne 0d3
      // 047: goto 04e
      // 04a: invokestatic f3x$ssc.c (Loov;)Loov;
      // 04d: athrow
      // 04e: iload 1
      // 04f: sipush 129
      // 052: goto 059
      // 055: invokestatic f3x$ssc.c (Loov;)Loov;
      // 058: athrow
      // 059: iload 5
      // 05b: ifeq 0aa
      // 05e: if_icmplt 093
      // 061: goto 068
      // 064: invokestatic f3x$ssc.c (Loov;)Loov;
      // 067: athrow
      // 068: iload 1
      // 069: sipush 165
      // 06c: iload 5
      // 06e: ifeq 0aa
      // 071: goto 078
      // 074: invokestatic f3x$ssc.c (Loov;)Loov;
      // 077: athrow
      // 078: if_icmpge 093
      // 07b: goto 082
      // 07e: invokestatic f3x$ssc.c (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: bipush 1
      // 084: putfield f3x$ssc.d4i I
      // 087: iload 5
      // 089: ifne 0d3
      // 08c: goto 093
      // 08f: invokestatic f3x$ssc.c (Loov;)Loov;
      // 092: athrow
      // 093: iload 1
      // 094: iload 5
      // 096: ifeq 0e3
      // 099: goto 0a0
      // 09c: invokestatic f3x$ssc.c (Loov;)Loov;
      // 09f: athrow
      // 0a0: sipush 179
      // 0a3: goto 0aa
      // 0a6: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0a9: athrow
      // 0aa: if_icmplt 0d3
      // 0ad: iload 1
      // 0ae: iload 5
      // 0b0: ifeq 0e3
      // 0b3: goto 0ba
      // 0b6: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0b9: athrow
      // 0ba: sipush 215
      // 0bd: if_icmpge 0d3
      // 0c0: goto 0c7
      // 0c3: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: bipush 2
      // 0c9: putfield f3x$ssc.d4i I
      // 0cc: goto 0d3
      // 0cf: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: iload 5
      // 0d6: ifeq 0f6
      // 0d9: getfield f3x$ssc.d4i I
      // 0dc: goto 0e3
      // 0df: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0e2: athrow
      // 0e3: iflt 118
      // 0e6: aload 0
      // 0e7: aload 0
      // 0e8: getfield f3x$ssc.d4i I
      // 0eb: invokevirtual f3x$ssc.arl (I)V
      // 0ee: aload 0
      // 0ef: goto 0f6
      // 0f2: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0f5: athrow
      // 0f6: getfield f3x$ssc.gk_ Lc05;
      // 0f9: invokevirtual Minecraft.yp9 ()Ldbu;
      // 0fc: new gdz
      // 0ff: dup
      // 100: sipush 16056
      // 103: ldc2_w 490160580773121533
      // 106: lload 3
      // 107: lxor
      // 108: invokedynamic p (IJ)Ljava/lang/String; bsm=f3x$ssc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: nop
      // 10e: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 111: fconst_1
      // 112: invokestatic vs1._e_ (Lgdz;F)Lvs1;
      // 115: invokevirtual dbu.mak (Ljp4;)V
      // 118: return
   }

   @Override
   public final int getSize() {
      return this._1h.size();
   }

   public final rlk ak8(int var1) {
      return (rlk)this._1h.get(var1);
   }

   public abstract String g30(int var1);

   public void v4c(_ss param1, int param2, int param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: iload 5
      // 08: ifne 16
      // 0b: ifnull 6a
      // 0e: goto 15
      // 11: invokestatic f3x$ssc.c (Loov;)Loov;
      // 14: athrow
      // 15: aload 1
      // 16: aload 0
      // 17: getfield f3x$ssc.gw_ Lf3x;
      // 1a: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 1d: aload 1
      // 1e: invokevirtual ik0.zgq (L_ss;)I
      // 21: invokevirtual _ss.rbf (I)Ljava/lang/String;
      // 24: astore 6
      // 26: aload 0
      // 27: getfield f3x$ssc.gw_ Lf3x;
      // 2a: aload 0
      // 2b: getfield f3x$ssc.gw_ Lf3x;
      // 2e: invokestatic f3x.xj2 (Lf3x;)Lowt;
      // 31: aload 6
      // 33: iload 2
      // 34: aload 0
      // 35: getfield f3x$ssc.gw_ Lf3x;
      // 38: invokestatic f3x.qpj (Lf3x;)Lowt;
      // 3b: aload 6
      // 3d: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 40: isub
      // 41: iload 3
      // 42: bipush 5
      // 43: iadd
      // 44: iload 4
      // 46: iload 5
      // 48: ifne 61
      // 4b: ifeq 5f
      // 4e: goto 55
      // 51: invokestatic f3x$ssc.c (Loov;)Loov;
      // 54: athrow
      // 55: ldc 16777215
      // 57: nop
      // 58: goto 62
      // 5b: invokestatic f3x$ssc.c (Loov;)Loov;
      // 5e: athrow
      // 5f: ldc 9474192
      // 61: nop
      // 62: invokevirtual f3x.c_t (Lowt;Ljava/lang/String;III)V
      // 65: iload 5
      // 67: ifeq ae
      // 6a: ldc "-"
      // 6c: nop
      // 6d: astore 6
      // 6f: aload 0
      // 70: getfield f3x$ssc.gw_ Lf3x;
      // 73: aload 0
      // 74: getfield f3x$ssc.gw_ Lf3x;
      // 77: invokestatic f3x.k8c (Lf3x;)Lowt;
      // 7a: aload 6
      // 7c: iload 2
      // 7d: aload 0
      // 7e: getfield f3x$ssc.gw_ Lf3x;
      // 81: invokestatic f3x._bu (Lf3x;)Lowt;
      // 84: aload 6
      // 86: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 89: isub
      // 8a: iload 3
      // 8b: bipush 5
      // 8c: iadd
      // 8d: iload 4
      // 8f: iload 5
      // 91: ifne aa
      // 94: ifeq a8
      // 97: goto 9e
      // 9a: invokestatic f3x$ssc.c (Loov;)Loov;
      // 9d: athrow
      // 9e: ldc 16777215
      // a0: nop
      // a1: goto ab
      // a4: invokestatic f3x$ssc.c (Loov;)Loov;
      // a7: athrow
      // a8: ldc 9474192
      // aa: nop
      // ab: invokevirtual f3x.c_t (Lowt;Ljava/lang/String;III)V
      // ae: return
   }

   @Override
   public void fbo(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: iload 2
      // 005: aload 0
      // 006: getfield f3x$ssc.vem I
      // 009: iload 3
      // 00a: ifne 02e
      // 00d: if_icmplt 1e6
      // 010: goto 017
      // 013: invokestatic f3x$ssc.c (Loov;)Loov;
      // 016: athrow
      // 017: iload 2
      // 018: iload 3
      // 019: ifne 03e
      // 01c: goto 023
      // 01f: invokestatic f3x$ssc.c (Loov;)Loov;
      // 022: athrow
      // 023: aload 0
      // 024: getfield f3x$ssc.chj I
      // 027: goto 02e
      // 02a: invokestatic f3x$ssc.c (Loov;)Loov;
      // 02d: athrow
      // 02e: if_icmpgt 1e6
      // 031: aload 0
      // 032: iload 1
      // 033: iload 2
      // 034: invokevirtual f3x$ssc.dwe (II)I
      // 037: goto 03e
      // 03a: invokestatic f3x$ssc.c (Loov;)Loov;
      // 03d: athrow
      // 03e: istore 4
      // 040: aload 0
      // 041: getfield f3x$ssc.wde I
      // 044: bipush 2
      // 045: idiv
      // 046: bipush 92
      // 048: isub
      // 049: bipush 16
      // 04b: isub
      // 04c: istore 5
      // 04e: iload 4
      // 050: iload 3
      // 051: ifne 05f
      // 054: iflt 09a
      // 057: goto 05e
      // 05a: invokestatic f3x$ssc.c (Loov;)Loov;
      // 05d: athrow
      // 05e: iload 1
      // 05f: iload 5
      // 061: bipush 40
      // 063: iadd
      // 064: iload 3
      // 065: ifne 082
      // 068: if_icmplt 085
      // 06b: goto 072
      // 06e: invokestatic f3x$ssc.c (Loov;)Loov;
      // 071: athrow
      // 072: iload 1
      // 073: iload 5
      // 075: bipush 40
      // 077: iadd
      // 078: bipush 20
      // 07a: iadd
      // 07b: goto 082
      // 07e: invokestatic f3x$ssc.c (Loov;)Loov;
      // 081: athrow
      // 082: if_icmple 086
      // 085: return
      // 086: aload 0
      // 087: iload 4
      // 089: invokevirtual f3x$ssc.ak8 (I)Lrlk;
      // 08c: astore 6
      // 08e: aload 0
      // 08f: aload 6
      // 091: iload 1
      // 092: iload 2
      // 093: invokevirtual f3x$ssc.nl7 (Lrlk;II)V
      // 096: iload 3
      // 097: ifeq 1e6
      // 09a: ldc ""
      // 09c: nop
      // 09d: astore 6
      // 09f: iload 1
      // 0a0: iload 5
      // 0a2: bipush 115
      // 0a4: iadd
      // 0a5: bipush 18
      // 0a7: isub
      // 0a8: iload 3
      // 0a9: ifne 0ed
      // 0ac: if_icmplt 0dc
      // 0af: goto 0b6
      // 0b2: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0b5: athrow
      // 0b6: iload 1
      // 0b7: iload 5
      // 0b9: bipush 115
      // 0bb: iadd
      // 0bc: iload 3
      // 0bd: ifne 0ed
      // 0c0: goto 0c7
      // 0c3: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0c6: athrow
      // 0c7: if_icmpgt 0dc
      // 0ca: goto 0d1
      // 0cd: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: bipush 0
      // 0d3: invokevirtual f3x$ssc.g30 (I)Ljava/lang/String;
      // 0d6: astore 6
      // 0d8: iload 3
      // 0d9: ifeq 15a
      // 0dc: iload 1
      // 0dd: iload 5
      // 0df: sipush 165
      // 0e2: iadd
      // 0e3: bipush 18
      // 0e5: isub
      // 0e6: goto 0ed
      // 0e9: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0ec: athrow
      // 0ed: iload 3
      // 0ee: ifne 133
      // 0f1: if_icmplt 122
      // 0f4: goto 0fb
      // 0f7: invokestatic f3x$ssc.c (Loov;)Loov;
      // 0fa: athrow
      // 0fb: iload 1
      // 0fc: iload 5
      // 0fe: sipush 165
      // 101: iadd
      // 102: iload 3
      // 103: ifne 133
      // 106: goto 10d
      // 109: invokestatic f3x$ssc.c (Loov;)Loov;
      // 10c: athrow
      // 10d: if_icmpgt 122
      // 110: goto 117
      // 113: invokestatic f3x$ssc.c (Loov;)Loov;
      // 116: athrow
      // 117: aload 0
      // 118: bipush 1
      // 119: invokevirtual f3x$ssc.g30 (I)Ljava/lang/String;
      // 11c: astore 6
      // 11e: iload 3
      // 11f: ifeq 15a
      // 122: iload 1
      // 123: iload 5
      // 125: sipush 215
      // 128: iadd
      // 129: bipush 18
      // 12b: isub
      // 12c: goto 133
      // 12f: invokestatic f3x$ssc.c (Loov;)Loov;
      // 132: athrow
      // 133: iload 3
      // 134: ifne 14f
      // 137: if_icmplt 152
      // 13a: goto 141
      // 13d: invokestatic f3x$ssc.c (Loov;)Loov;
      // 140: athrow
      // 141: iload 1
      // 142: iload 5
      // 144: sipush 215
      // 147: iadd
      // 148: goto 14f
      // 14b: invokestatic f3x$ssc.c (Loov;)Loov;
      // 14e: athrow
      // 14f: if_icmple 153
      // 152: return
      // 153: aload 0
      // 154: bipush 2
      // 155: invokevirtual f3x$ssc.g30 (I)Ljava/lang/String;
      // 158: astore 6
      // 15a: new java/lang/StringBuilder
      // 15d: dup
      // 15e: invokespecial java/lang/StringBuilder.<init> ()V
      // 161: ldc ""
      // 163: nop
      // 164: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 167: aload 6
      // 169: bipush 0
      // 16a: anewarray 205
      // 16d: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 173: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 176: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 179: astore 6
      // 17b: aload 6
      // 17d: invokevirtual java/lang/String.length ()I
      // 180: iload 3
      // 181: ifne 199
      // 184: ifle 1e6
      // 187: goto 18e
      // 18a: invokestatic f3x$ssc.c (Loov;)Loov;
      // 18d: athrow
      // 18e: iload 1
      // 18f: bipush 12
      // 191: iadd
      // 192: goto 199
      // 195: invokestatic f3x$ssc.c (Loov;)Loov;
      // 198: athrow
      // 199: istore 7
      // 19b: iload 2
      // 19c: bipush 12
      // 19e: isub
      // 19f: istore 8
      // 1a1: aload 0
      // 1a2: getfield f3x$ssc.gw_ Lf3x;
      // 1a5: invokestatic f3x.p8s (Lf3x;)Lowt;
      // 1a8: aload 6
      // 1aa: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 1ad: istore 9
      // 1af: aload 0
      // 1b0: getfield f3x$ssc.gw_ Lf3x;
      // 1b3: iload 7
      // 1b5: bipush 3
      // 1b6: isub
      // 1b7: iload 8
      // 1b9: bipush 3
      // 1ba: isub
      // 1bb: iload 7
      // 1bd: iload 9
      // 1bf: iadd
      // 1c0: bipush 3
      // 1c1: iadd
      // 1c2: iload 8
      // 1c4: bipush 8
      // 1c6: iadd
      // 1c7: bipush 3
      // 1c8: iadd
      // 1c9: ldc -1073741824
      // 1cb: nop
      // 1cc: ldc -1073741824
      // 1ce: nop
      // 1cf: invokevirtual f3x.flp (IIIIII)V
      // 1d2: aload 0
      // 1d3: getfield f3x$ssc.gw_ Lf3x;
      // 1d6: invokestatic f3x.z4q (Lf3x;)Lowt;
      // 1d9: aload 6
      // 1db: iload 7
      // 1dd: i2f
      // 1de: iload 8
      // 1e0: i2f
      // 1e1: bipush -1
      // 1e2: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 1e5: pop
      // 1e6: return
   }

   public void nl7(rlk param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic f3x$ssc.b J
      // 03: ldc2_w 132869379243730
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: istore 6
      // 0e: aload 1
      // 0f: iload 6
      // 11: ifeq 1f
      // 14: ifnull e2
      // 17: goto 1e
      // 1a: invokestatic f3x$ssc.c (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokevirtual rlk.u3i ()Lu7m;
      // 22: astore 7
      // 24: new erg
      // 27: dup
      // 28: aload 7
      // 2a: invokespecial erg.<init> (Lu7m;)V
      // 2d: astore 8
      // 2f: aload 8
      // 31: invokevirtual erg.ozi ()Ljava/lang/String;
      // 34: astore 9
      // 36: new java/lang/StringBuilder
      // 39: dup
      // 3a: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d: ldc ""
      // 3f: nop
      // 40: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 43: new java/lang/StringBuilder
      // 46: dup
      // 47: invokespecial java/lang/StringBuilder.<init> ()V
      // 4a: aload 9
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: sipush 19106
      // 52: ldc2_w 5943909162880651801
      // 55: lload 4
      // 57: lxor
      // 58: invokedynamic p (IJ)Ljava/lang/String; bsm=f3x$ssc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: nop
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 64: bipush 0
      // 65: anewarray 205
      // 68: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 71: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 74: astore 10
      // 76: aload 10
      // 78: invokevirtual java/lang/String.length ()I
      // 7b: iload 6
      // 7d: ifeq 95
      // 80: ifle e2
      // 83: goto 8a
      // 86: invokestatic f3x$ssc.c (Loov;)Loov;
      // 89: athrow
      // 8a: iload 2
      // 8b: bipush 12
      // 8d: iadd
      // 8e: goto 95
      // 91: invokestatic f3x$ssc.c (Loov;)Loov;
      // 94: athrow
      // 95: istore 11
      // 97: iload 3
      // 98: bipush 12
      // 9a: isub
      // 9b: istore 12
      // 9d: aload 0
      // 9e: getfield f3x$ssc.gw_ Lf3x;
      // a1: invokestatic f3x.pl3 (Lf3x;)Lowt;
      // a4: aload 10
      // a6: invokevirtual owt.ezt (Ljava/lang/String;)I
      // a9: istore 13
      // ab: aload 0
      // ac: getfield f3x$ssc.gw_ Lf3x;
      // af: iload 11
      // b1: bipush 3
      // b2: isub
      // b3: iload 12
      // b5: bipush 3
      // b6: isub
      // b7: iload 11
      // b9: iload 13
      // bb: iadd
      // bc: bipush 3
      // bd: iadd
      // be: iload 12
      // c0: bipush 8
      // c2: iadd
      // c3: bipush 3
      // c4: iadd
      // c5: ldc -1073741824
      // c7: nop
      // c8: ldc -1073741824
      // ca: nop
      // cb: invokevirtual f3x.flp (IIIIII)V
      // ce: aload 0
      // cf: getfield f3x$ssc.gw_ Lf3x;
      // d2: invokestatic f3x.esu (Lf3x;)Lowt;
      // d5: aload 10
      // d7: iload 11
      // d9: i2f
      // da: iload 12
      // dc: i2f
      // dd: bipush -1
      // de: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // e1: pop
      // e2: return
   }

   public void arl(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: aload 0
      // 06: getfield f3x$ssc.c9s I
      // 09: iload 2
      // 0a: ifeq 43
      // 0d: if_icmpeq 2c
      // 10: goto 17
      // 13: invokestatic f3x$ssc.c (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield f3x$ssc.c9s I
      // 1c: aload 0
      // 1d: bipush -1
      // 1e: putfield f3x$ssc.uh5 I
      // 21: iload 2
      // 22: ifne 67
      // 25: goto 2c
      // 28: invokestatic f3x$ssc.c (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: iload 2
      // 2e: ifeq 63
      // 31: goto 38
      // 34: invokestatic f3x$ssc.c (Loov;)Loov;
      // 37: athrow
      // 38: getfield f3x$ssc.uh5 I
      // 3b: bipush -1
      // 3c: goto 43
      // 3f: invokestatic f3x$ssc.c (Loov;)Loov;
      // 42: athrow
      // 43: if_icmpne 56
      // 46: aload 0
      // 47: bipush 1
      // 48: putfield f3x$ssc.uh5 I
      // 4b: iload 2
      // 4c: ifne 67
      // 4f: goto 56
      // 52: invokestatic f3x$ssc.c (Loov;)Loov;
      // 55: athrow
      // 56: aload 0
      // 57: bipush -1
      // 58: putfield f3x$ssc.c9s I
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic f3x$ssc.c (Loov;)Loov;
      // 62: athrow
      // 63: bipush 0
      // 64: putfield f3x$ssc.uh5 I
      // 67: aload 0
      // 68: getfield f3x$ssc._1h Ljava/util/List;
      // 6b: aload 0
      // 6c: getfield f3x$ssc.otn Ljava/util/Comparator;
      // 6f: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 72: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2417605254302032756L, -5563795385313032329L, MethodHandles.lookup().lookupClass()).a(49378974354022L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 25184943080328L;
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
      String var6 = "\u009b*\u0080¸¤7¹û¥û¼t\\ÜZÕ(ööéX\u007f9½kÏ\u001fM§\u009a¡\u0012¢\u0018j´s\u0099±³½>¦\u008f-=\u0085\t*\u000e¥\"ß \u008e8à";
      int var8 = "\u009b*\u0080¸¤7¹û¥û¼t\\ÜZÕ(ööéX\u007f9½kÏ\u001fM§\u009a¡\u0012¢\u0018j´s\u0099±³½>¦\u008f-=\u0085\t*\u000e¥\"ß \u008e8à".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov c(oov var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8642;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("f3x$ssc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("f3x$ssc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
