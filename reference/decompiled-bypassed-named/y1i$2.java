public class y1i$2 extends vrx {
   public final OpaquePredicate vbp;
   public final mew fbd;
   public final y1i m_1;

   public y1i$2(y1i var1, rsi var2, int var3, int var4, int var5, OpaquePredicate var6, mew var7) {
      super(var2, var3, var4, var5);
      this.m_1 = var1;
      this.vbp = var6;
      this.fbd = var7;
   }

   @Override
   public boolean xvl(erg var1) {
      return false;
   }

   @Override
   public boolean fg6(ha9 param1) {
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
      // 05: getfield ha9.lls Lpj2;
      // 08: getfield pj2.g40 Z
      // 0b: iload 2
      // 0c: ifeq 47
      // 0f: ifne 39
      // 12: goto 19
      // 15: invokestatic y1i$2.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: getfield ha9.op5 I
      // 1d: iload 2
      // 1e: ifeq 47
      // 21: goto 28
      // 24: invokestatic y1i$2.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield y1i$2.m_1 Ly1i;
      // 2c: getfield y1i.vm6 I
      // 2f: if_icmplt 72
      // 32: goto 39
      // 35: invokestatic y1i$2.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield y1i$2.m_1 Ly1i;
      // 3d: getfield y1i.vm6 I
      // 40: goto 47
      // 43: invokestatic y1i$2.a (Loov;)Loov;
      // 46: athrow
      // 47: iload 2
      // 48: ifeq 60
      // 4b: ifle 72
      // 4e: goto 55
      // 51: invokestatic y1i$2.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: invokevirtual y1i$2.hf8 ()Z
      // 59: goto 60
      // 5c: invokestatic y1i$2.a (Loov;)Loov;
      // 5f: athrow
      // 60: iload 2
      // 61: ifeq 6f
      // 64: ifeq 72
      // 67: goto 6e
      // 6a: invokestatic y1i$2.a (Loov;)Loov;
      // 6d: athrow
      // 6e: bipush 1
      // 6f: goto 73
      // 72: bipush 0
      // 73: ireturn
   }

   @Override
   public void g1d(ha9 param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 1
      // 005: getfield ha9.lls Lpj2;
      // 008: getfield pj2.g40 Z
      // 00b: iload 3
      // 00c: ifne 04f
      // 00f: ifne 02c
      // 012: goto 019
      // 015: invokestatic y1i$2.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 1
      // 01a: aload 0
      // 01b: getfield y1i$2.m_1 Ly1i;
      // 01e: getfield y1i.vm6 I
      // 021: ineg
      // 022: invokevirtual ha9.odj (I)V
      // 025: goto 02c
      // 028: invokestatic y1i$2.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield y1i$2.m_1 Ly1i;
      // 030: invokestatic y1i.xe0 (Ly1i;)Lrsi;
      // 033: bipush 0
      // 034: aconst_null
      // 035: checkcast erg
      // 038: invokeinterface rsi.cxl (ILerg;)V 3
      // 03d: aload 0
      // 03e: getfield y1i$2.m_1 Ly1i;
      // 041: iload 3
      // 042: ifne 0dd
      // 045: invokestatic y1i.qan (Ly1i;)I
      // 048: goto 04f
      // 04b: invokestatic y1i$2.a (Loov;)Loov;
      // 04e: athrow
      // 04f: ifle 0d2
      // 052: aload 0
      // 053: getfield y1i$2.m_1 Ly1i;
      // 056: invokestatic y1i.xe0 (Ly1i;)Lrsi;
      // 059: bipush 1
      // 05a: invokeinterface rsi.ibn (I)Lerg; 2
      // 05f: astore 4
      // 061: aload 4
      // 063: iload 3
      // 064: ifne 073
      // 067: ifnull 0b6
      // 06a: goto 071
      // 06d: invokestatic y1i$2.a (Loov;)Loov;
      // 070: athrow
      // 071: aload 4
      // 073: iload 3
      // 074: ifne 094
      // 077: getfield erg.qd2 I
      // 07a: aload 0
      // 07b: getfield y1i$2.m_1 Ly1i;
      // 07e: invokestatic y1i.qan (Ly1i;)I
      // 081: if_icmple 0b6
      // 084: goto 08b
      // 087: invokestatic y1i$2.a (Loov;)Loov;
      // 08a: athrow
      // 08b: aload 4
      // 08d: goto 094
      // 090: invokestatic y1i$2.a (Loov;)Loov;
      // 093: athrow
      // 094: dup
      // 095: getfield erg.qd2 I
      // 098: aload 0
      // 099: getfield y1i$2.m_1 Ly1i;
      // 09c: invokestatic y1i.qan (Ly1i;)I
      // 09f: isub
      // 0a0: putfield erg.qd2 I
      // 0a3: aload 0
      // 0a4: getfield y1i$2.m_1 Ly1i;
      // 0a7: invokestatic y1i.xe0 (Ly1i;)Lrsi;
      // 0aa: bipush 1
      // 0ab: aload 4
      // 0ad: invokeinterface rsi.cxl (ILerg;)V 3
      // 0b2: iload 3
      // 0b3: ifeq 0ce
      // 0b6: aload 0
      // 0b7: getfield y1i$2.m_1 Ly1i;
      // 0ba: invokestatic y1i.xe0 (Ly1i;)Lrsi;
      // 0bd: bipush 1
      // 0be: aconst_null
      // 0bf: checkcast erg
      // 0c2: invokeinterface rsi.cxl (ILerg;)V 3
      // 0c7: goto 0ce
      // 0ca: invokestatic y1i$2.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: iload 3
      // 0cf: ifeq 0ea
      // 0d2: aload 0
      // 0d3: getfield y1i$2.m_1 Ly1i;
      // 0d6: goto 0dd
      // 0d9: invokestatic y1i$2.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: invokestatic y1i.xe0 (Ly1i;)Lrsi;
      // 0e0: bipush 1
      // 0e1: aconst_null
      // 0e2: checkcast erg
      // 0e5: invokeinterface rsi.cxl (ILerg;)V 3
      // 0ea: aload 0
      // 0eb: getfield y1i$2.m_1 Ly1i;
      // 0ee: bipush 0
      // 0ef: putfield y1i.vm6 I
      // 0f2: aload 0
      // 0f3: getfield y1i$2.vbp Lt9d;
      // 0f6: aload 0
      // 0f7: getfield y1i$2.fbd Lmew;
      // 0fa: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0fd: astore 4
      // 0ff: aload 1
      // 100: getfield ha9.lls Lpj2;
      // 103: getfield pj2.g40 Z
      // 106: iload 3
      // 107: ifne 1ff
      // 10a: ifne 1e6
      // 10d: goto 114
      // 110: invokestatic y1i$2.a (Loov;)Loov;
      // 113: athrow
      // 114: aload 0
      // 115: getfield y1i$2.vbp Lt9d;
      // 118: getfield OpaquePredicate.v0f Z
      // 11b: iload 3
      // 11c: ifne 1ff
      // 11f: goto 126
      // 122: invokestatic y1i$2.a (Loov;)Loov;
      // 125: athrow
      // 126: ifne 1e6
      // 129: goto 130
      // 12c: invokestatic y1i$2.a (Loov;)Loov;
      // 12f: athrow
      // 130: aload 4
      // 132: invokeinterface zfz.r_y ()Le0x; 1
      // 137: getstatic ox_.g04 Le0x;
      // 13a: if_acmpne 1e6
      // 13d: goto 144
      // 140: invokestatic y1i$2.a (Loov;)Loov;
      // 143: athrow
      // 144: aload 1
      // 145: invokevirtual ha9.mbr ()Ljava/util/Random;
      // 148: invokevirtual java/util/Random.nextFloat ()F
      // 14b: ldc 0.12
      // 14d: nop
      // 14e: fcmpg
      // 14f: iload 3
      // 150: ifne 1ff
      // 153: goto 15a
      // 156: invokestatic y1i$2.a (Loov;)Loov;
      // 159: athrow
      // 15a: ifge 1e6
      // 15d: goto 164
      // 160: invokestatic y1i$2.a (Loov;)Loov;
      // 163: athrow
      // 164: aload 4
      // 166: getstatic zsh.he4 L_ku;
      // 169: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 16e: checkcast java/lang/Integer
      // 171: invokevirtual java/lang/Integer.intValue ()I
      // 174: istore 5
      // 176: iinc 5 1
      // 179: iload 5
      // 17b: iload 3
      // 17c: ifne 1d2
      // 17f: bipush 2
      // 180: if_icmple 1b0
      // 183: goto 18a
      // 186: invokestatic y1i$2.a (Loov;)Loov;
      // 189: athrow
      // 18a: aload 0
      // 18b: getfield y1i$2.vbp Lt9d;
      // 18e: aload 0
      // 18f: getfield y1i$2.fbd Lmew;
      // 192: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 195: pop
      // 196: aload 0
      // 197: getfield y1i$2.vbp Lt9d;
      // 19a: sipush 1020
      // 19d: aload 0
      // 19e: getfield y1i$2.fbd Lmew;
      // 1a1: bipush 0
      // 1a2: invokevirtual OpaquePredicate.qca (ILmew;I)V
      // 1a5: iload 3
      // 1a6: ifeq 1e2
      // 1a9: goto 1b0
      // 1ac: invokestatic y1i$2.a (Loov;)Loov;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: getfield y1i$2.vbp Lt9d;
      // 1b4: aload 0
      // 1b5: getfield y1i$2.fbd Lmew;
      // 1b8: aload 4
      // 1ba: getstatic zsh.he4 L_ku;
      // 1bd: iload 5
      // 1bf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c2: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1c7: bipush 2
      // 1c8: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 1cb: goto 1d2
      // 1ce: invokestatic y1i$2.a (Loov;)Loov;
      // 1d1: athrow
      // 1d2: pop
      // 1d3: aload 0
      // 1d4: getfield y1i$2.vbp Lt9d;
      // 1d7: sipush 1021
      // 1da: aload 0
      // 1db: getfield y1i$2.fbd Lmew;
      // 1de: bipush 0
      // 1df: invokevirtual OpaquePredicate.qca (ILmew;I)V
      // 1e2: iload 3
      // 1e3: ifeq 218
      // 1e6: aload 0
      // 1e7: getfield y1i$2.vbp Lt9d;
      // 1ea: iload 3
      // 1eb: ifne 20d
      // 1ee: goto 1f5
      // 1f1: invokestatic y1i$2.a (Loov;)Loov;
      // 1f4: athrow
      // 1f5: getfield OpaquePredicate.v0f Z
      // 1f8: goto 1ff
      // 1fb: invokestatic y1i$2.a (Loov;)Loov;
      // 1fe: athrow
      // 1ff: ifne 218
      // 202: aload 0
      // 203: getfield y1i$2.vbp Lt9d;
      // 206: goto 20d
      // 209: invokestatic y1i$2.a (Loov;)Loov;
      // 20c: athrow
      // 20d: sipush 1021
      // 210: aload 0
      // 211: getfield y1i$2.fbd Lmew;
      // 214: bipush 0
      // 215: invokevirtual OpaquePredicate.qca (ILmew;I)V
      // 218: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
