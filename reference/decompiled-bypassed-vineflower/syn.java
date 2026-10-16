import java.util.Random;

public class syn extends e0x {
   public syn() {
      super(p3y.oap, _mi.xas);
      this.xl4(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
   }

   @Override
   public void tfc(t9d var1, mew var2, zfz var3) {
      var1.cjk(var2, this, this.odp(var1));
   }

   @Override
   public void z3l(t9d var1, mew var2, zfz var3, e0x var4) {
      var1.cjk(var2, this, this.odp(var1));
   }

   @Override
   public void zvy(t9d var1, mew var2, zfz var3, Random var4) {
      this.ogj(var1, var2);
   }

   private void ogj(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 1
      // 005: aload 2
      // 006: invokevirtual mew.eve ()Lmew;
      // 009: invokestatic d26._j1 (Lt9d;Lmew;)Z
      // 00c: iload 3
      // 00d: ifne 025
      // 010: ifeq 115
      // 013: goto 01a
      // 016: invokestatic syn.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 2
      // 01b: invokevirtual mew.getY ()I
      // 01e: goto 025
      // 021: invokestatic syn.a (Loov;)Loov;
      // 024: athrow
      // 025: iload 3
      // 026: ifne 035
      // 029: iflt 115
      // 02c: goto 033
      // 02f: invokestatic syn.a (Loov;)Loov;
      // 032: athrow
      // 033: bipush 32
      // 035: istore 4
      // 037: getstatic d26.trk Z
      // 03a: iload 3
      // 03b: ifne 0b9
      // 03e: ifne 0ad
      // 041: goto 048
      // 044: invokestatic syn.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 1
      // 049: aload 2
      // 04a: iload 4
      // 04c: ineg
      // 04d: iload 4
      // 04f: ineg
      // 050: iload 4
      // 052: ineg
      // 053: invokevirtual mew.ec4 (III)Lmew;
      // 056: aload 2
      // 057: iload 4
      // 059: iload 4
      // 05b: iload 4
      // 05d: invokevirtual mew.ec4 (III)Lmew;
      // 060: invokevirtual t9d.o2i (Lmew;Lmew;)Z
      // 063: iload 3
      // 064: ifne 0b9
      // 067: goto 06e
      // 06a: invokestatic syn.a (Loov;)Loov;
      // 06d: athrow
      // 06e: ifeq 0ad
      // 071: goto 078
      // 074: invokestatic syn.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 1
      // 079: new vjf
      // 07c: dup
      // 07d: aload 1
      // 07e: aload 2
      // 07f: invokevirtual mew.getX ()I
      // 082: i2f
      // 083: ldc 0.5
      // 085: nop
      // 086: fadd
      // 087: f2d
      // 088: aload 2
      // 089: invokevirtual mew.getY ()I
      // 08c: i2d
      // 08d: aload 2
      // 08e: invokevirtual mew.getZ ()I
      // 091: i2f
      // 092: ldc 0.5
      // 094: nop
      // 095: fadd
      // 096: f2d
      // 097: aload 0
      // 098: invokevirtual syn.l4i ()Lzfz;
      // 09b: invokespecial vjf.<init> (Lt9d;DDDLzfz;)V
      // 09e: invokevirtual t9d.xzq (Li2h;)Z
      // 0a1: pop
      // 0a2: iload 3
      // 0a3: ifeq 115
      // 0a6: goto 0ad
      // 0a9: invokestatic syn.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 1
      // 0ae: aload 2
      // 0af: invokevirtual t9d.i6x (Lmew;)Z
      // 0b2: goto 0b9
      // 0b5: invokestatic syn.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: pop
      // 0ba: aload 2
      // 0bb: astore 5
      // 0bd: aload 1
      // 0be: aload 5
      // 0c0: invokestatic d26._j1 (Lt9d;Lmew;)Z
      // 0c3: ifeq 0ef
      // 0c6: aload 5
      // 0c8: invokevirtual mew.getY ()I
      // 0cb: iload 3
      // 0cc: ifne 0f4
      // 0cf: iload 3
      // 0d0: ifne 0f4
      // 0d3: goto 0da
      // 0d6: invokestatic syn.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: ifle 0ef
      // 0dd: goto 0e4
      // 0e0: invokestatic syn.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 5
      // 0e6: invokevirtual mew.eve ()Lmew;
      // 0e9: astore 5
      // 0eb: iload 3
      // 0ec: ifeq 0bd
      // 0ef: aload 5
      // 0f1: invokevirtual mew.getY ()I
      // 0f4: iload 3
      // 0f5: ifne 114
      // 0f8: ifle 115
      // 0fb: goto 102
      // 0fe: invokestatic syn.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 1
      // 103: aload 5
      // 105: aload 0
      // 106: invokevirtual syn.l4i ()Lzfz;
      // 109: bipush 2
      // 10a: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 10d: goto 114
      // 110: invokestatic syn.a (Loov;)Loov;
      // 113: athrow
      // 114: pop
      // 115: return
   }

   @Override
   public boolean cl2(t9d var1, mew var2, zfz var3, ha9 var4, vt2 var5, float var6, float var7, float var8) {
      this.jlg(var1, var2);
      return true;
   }

   @Override
   public void uqb(t9d var1, mew var2, ha9 var3) {
      this.jlg(var1, var2);
   }

   private void jlg(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 1
      // 005: aload 2
      // 006: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 009: astore 4
      // 00b: aload 4
      // 00d: invokeinterface zfz.r_y ()Le0x; 1
      // 012: aload 0
      // 013: if_acmpne 1a4
      // 016: bipush 0
      // 017: istore 5
      // 019: iload 5
      // 01b: sipush 1000
      // 01e: if_icmpge 1a4
      // 021: aload 2
      // 022: aload 1
      // 023: getfield t9d.fsy Ljava/util/Random;
      // 026: bipush 16
      // 028: invokevirtual java/util/Random.nextInt (I)I
      // 02b: aload 1
      // 02c: getfield t9d.fsy Ljava/util/Random;
      // 02f: bipush 16
      // 031: invokevirtual java/util/Random.nextInt (I)I
      // 034: isub
      // 035: aload 1
      // 036: getfield t9d.fsy Ljava/util/Random;
      // 039: bipush 8
      // 03b: invokevirtual java/util/Random.nextInt (I)I
      // 03e: aload 1
      // 03f: getfield t9d.fsy Ljava/util/Random;
      // 042: bipush 8
      // 044: invokevirtual java/util/Random.nextInt (I)I
      // 047: isub
      // 048: aload 1
      // 049: getfield t9d.fsy Ljava/util/Random;
      // 04c: bipush 16
      // 04e: invokevirtual java/util/Random.nextInt (I)I
      // 051: aload 1
      // 052: getfield t9d.fsy Ljava/util/Random;
      // 055: bipush 16
      // 057: invokevirtual java/util/Random.nextInt (I)I
      // 05a: isub
      // 05b: invokevirtual mew.ec4 (III)Lmew;
      // 05e: astore 6
      // 060: iload 3
      // 061: ifeq 1a0
      // 064: aload 1
      // 065: aload 6
      // 067: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 06a: invokeinterface zfz.r_y ()Le0x; 1
      // 06f: getfield e0x.kgd Lp3y;
      // 072: getstatic p3y.cei Lp3y;
      // 075: if_acmpne 19d
      // 078: goto 07f
      // 07b: invokestatic syn.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 1
      // 080: getfield t9d.v0f Z
      // 083: iload 3
      // 084: ifeq 19b
      // 087: goto 08e
      // 08a: invokestatic syn.a (Loov;)Loov;
      // 08d: athrow
      // 08e: ifeq 185
      // 091: goto 098
      // 094: invokestatic syn.a (Loov;)Loov;
      // 097: athrow
      // 098: bipush 0
      // 099: istore 7
      // 09b: iload 7
      // 09d: sipush 128
      // 0a0: if_icmpge 181
      // 0a3: aload 1
      // 0a4: getfield t9d.fsy Ljava/util/Random;
      // 0a7: invokevirtual java/util/Random.nextDouble ()D
      // 0aa: dstore 8
      // 0ac: aload 1
      // 0ad: getfield t9d.fsy Ljava/util/Random;
      // 0b0: invokevirtual java/util/Random.nextFloat ()F
      // 0b3: ldc 0.5
      // 0b5: nop
      // 0b6: fsub
      // 0b7: ldc 0.2
      // 0b9: nop
      // 0ba: fmul
      // 0bb: fstore 10
      // 0bd: aload 1
      // 0be: getfield t9d.fsy Ljava/util/Random;
      // 0c1: invokevirtual java/util/Random.nextFloat ()F
      // 0c4: ldc 0.5
      // 0c6: nop
      // 0c7: fsub
      // 0c8: ldc 0.2
      // 0ca: nop
      // 0cb: fmul
      // 0cc: fstore 11
      // 0ce: aload 1
      // 0cf: getfield t9d.fsy Ljava/util/Random;
      // 0d2: invokevirtual java/util/Random.nextFloat ()F
      // 0d5: ldc 0.5
      // 0d7: nop
      // 0d8: fsub
      // 0d9: ldc 0.2
      // 0db: nop
      // 0dc: fmul
      // 0dd: fstore 12
      // 0df: aload 6
      // 0e1: invokevirtual mew.getX ()I
      // 0e4: i2d
      // 0e5: aload 2
      // 0e6: invokevirtual mew.getX ()I
      // 0e9: aload 6
      // 0eb: invokevirtual mew.getX ()I
      // 0ee: isub
      // 0ef: i2d
      // 0f0: dload 8
      // 0f2: dmul
      // 0f3: dadd
      // 0f4: aload 1
      // 0f5: getfield t9d.fsy Ljava/util/Random;
      // 0f8: invokevirtual java/util/Random.nextDouble ()D
      // 0fb: ldc2_w 0.5
      // 0fe: dsub
      // 0ff: dconst_1
      // 100: dmul
      // 101: dadd
      // 102: ldc2_w 0.5
      // 105: dadd
      // 106: dstore 13
      // 108: aload 6
      // 10a: invokevirtual mew.getY ()I
      // 10d: i2d
      // 10e: aload 2
      // 10f: invokevirtual mew.getY ()I
      // 112: aload 6
      // 114: invokevirtual mew.getY ()I
      // 117: isub
      // 118: i2d
      // 119: dload 8
      // 11b: dmul
      // 11c: dadd
      // 11d: aload 1
      // 11e: getfield t9d.fsy Ljava/util/Random;
      // 121: invokevirtual java/util/Random.nextDouble ()D
      // 124: dconst_1
      // 125: dmul
      // 126: dadd
      // 127: ldc2_w 0.5
      // 12a: dsub
      // 12b: dstore 15
      // 12d: aload 6
      // 12f: invokevirtual mew.getZ ()I
      // 132: i2d
      // 133: aload 2
      // 134: invokevirtual mew.getZ ()I
      // 137: aload 6
      // 139: invokevirtual mew.getZ ()I
      // 13c: isub
      // 13d: i2d
      // 13e: dload 8
      // 140: dmul
      // 141: dadd
      // 142: aload 1
      // 143: getfield t9d.fsy Ljava/util/Random;
      // 146: invokevirtual java/util/Random.nextDouble ()D
      // 149: ldc2_w 0.5
      // 14c: dsub
      // 14d: dconst_1
      // 14e: dmul
      // 14f: dadd
      // 150: ldc2_w 0.5
      // 153: dadd
      // 154: dstore 17
      // 156: aload 1
      // 157: getstatic w_0.t9k Lw_0;
      // 15a: dload 13
      // 15c: dload 15
      // 15e: dload 17
      // 160: fload 10
      // 162: f2d
      // 163: fload 11
      // 165: f2d
      // 166: fload 12
      // 168: f2d
      // 169: bipush 0
      // 16a: newarray 10
      // 16c: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 16f: iinc 7 1
      // 172: iload 3
      // 173: ifeq 19c
      // 176: iload 3
      // 177: ifne 09b
      // 17a: goto 181
      // 17d: invokestatic syn.a (Loov;)Loov;
      // 180: athrow
      // 181: iload 3
      // 182: ifne 19c
      // 185: aload 1
      // 186: aload 6
      // 188: aload 4
      // 18a: bipush 2
      // 18b: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 18e: pop
      // 18f: aload 1
      // 190: aload 2
      // 191: invokevirtual t9d.i6x (Lmew;)Z
      // 194: goto 19b
      // 197: invokestatic syn.a (Loov;)Loov;
      // 19a: athrow
      // 19b: pop
      // 19c: return
      // 19d: iinc 5 1
      // 1a0: iload 3
      // 1a1: ifne 019
      // 1a4: return
   }

   @Override
   public int odp(t9d var1) {
      return 5;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      return true;
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      return null;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
