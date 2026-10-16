public class aba {
   public float oc2;
   public int vx9;
   public float au3;
   public float qeu = 1.0F;
   public float ffk;

   public aba(float var1) {
      this.oc2 = var1;
      this.an2 = c05.qgs();
      this.rw4 = System.nanoTime() / 1000000L;
   }

   public void g6r() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic c05.qgs ()J
      // 003: lstore 2
      // 004: lload 2
      // 005: aload 0
      // 006: getfield aba.an2 J
      // 009: lsub
      // 00a: lstore 4
      // 00c: invokestatic t9d.b ()I
      // 00f: invokestatic java/lang/System.nanoTime ()J
      // 012: ldc2_w 1000000
      // 015: ldiv
      // 016: lstore 6
      // 018: istore 1
      // 019: lload 6
      // 01b: l2d
      // 01c: ldc2_w 1000.0
      // 01f: ddiv
      // 020: dstore 8
      // 022: lload 4
      // 024: ldc2_w 1000
      // 027: lcmp
      // 028: iload 1
      // 029: ifeq 041
      // 02c: ifgt 0cf
      // 02f: goto 036
      // 032: invokestatic aba.a (Loov;)Loov;
      // 035: athrow
      // 036: lload 4
      // 038: lconst_0
      // 039: lcmp
      // 03a: goto 041
      // 03d: invokestatic aba.a (Loov;)Loov;
      // 040: athrow
      // 041: iload 1
      // 042: ifeq 069
      // 045: iflt 0cf
      // 048: goto 04f
      // 04b: invokestatic aba.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 0
      // 050: dup
      // 051: getfield aba.fap J
      // 054: lload 4
      // 056: ladd
      // 057: putfield aba.fap J
      // 05a: aload 0
      // 05b: getfield aba.fap J
      // 05e: ldc2_w 1000
      // 061: lcmp
      // 062: goto 069
      // 065: invokestatic aba.a (Loov;)Loov;
      // 068: athrow
      // 069: iload 1
      // 06a: ifeq 0bb
      // 06d: ifle 0aa
      // 070: goto 077
      // 073: invokestatic aba.a (Loov;)Loov;
      // 076: athrow
      // 077: lload 6
      // 079: aload 0
      // 07a: getfield aba.rw4 J
      // 07d: lsub
      // 07e: lstore 10
      // 080: aload 0
      // 081: getfield aba.fap J
      // 084: l2d
      // 085: lload 10
      // 087: l2d
      // 088: ddiv
      // 089: dstore 12
      // 08b: aload 0
      // 08c: dup
      // 08d: getfield aba.yd_ D
      // 090: dload 12
      // 092: aload 0
      // 093: getfield aba.yd_ D
      // 096: dsub
      // 097: ldc2_w 0.20000000298023224
      // 09a: dmul
      // 09b: dadd
      // 09c: putfield aba.yd_ D
      // 09f: aload 0
      // 0a0: lload 6
      // 0a2: putfield aba.rw4 J
      // 0a5: aload 0
      // 0a6: lconst_0
      // 0a7: putfield aba.fap J
      // 0aa: aload 0
      // 0ab: iload 1
      // 0ac: ifeq 0dd
      // 0af: getfield aba.fap J
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: goto 0bb
      // 0b7: invokestatic aba.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: ifge 0dc
      // 0be: aload 0
      // 0bf: lload 6
      // 0c1: putfield aba.rw4 J
      // 0c4: iload 1
      // 0c5: ifne 0dc
      // 0c8: goto 0cf
      // 0cb: invokestatic aba.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: dload 8
      // 0d2: putfield aba.nkw D
      // 0d5: goto 0dc
      // 0d8: invokestatic aba.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: lload 2
      // 0de: putfield aba.an2 J
      // 0e1: dload 8
      // 0e3: aload 0
      // 0e4: getfield aba.nkw D
      // 0e7: dsub
      // 0e8: aload 0
      // 0e9: getfield aba.yd_ D
      // 0ec: dmul
      // 0ed: dstore 10
      // 0ef: aload 0
      // 0f0: dload 8
      // 0f2: putfield aba.nkw D
      // 0f5: dload 10
      // 0f7: dconst_0
      // 0f8: dconst_1
      // 0f9: invokestatic fe6.lft (DDD)D
      // 0fc: dstore 10
      // 0fe: aload 0
      // 0ff: aload 0
      // 100: getfield aba.ffk F
      // 103: f2d
      // 104: dload 10
      // 106: aload 0
      // 107: getfield aba.qeu F
      // 10a: f2d
      // 10b: dmul
      // 10c: aload 0
      // 10d: getfield aba.oc2 F
      // 110: f2d
      // 111: dmul
      // 112: dadd
      // 113: d2f
      // 114: putfield aba.ffk F
      // 117: aload 0
      // 118: aload 0
      // 119: getfield aba.ffk F
      // 11c: f2i
      // 11d: putfield aba.vx9 I
      // 120: aload 0
      // 121: dup
      // 122: getfield aba.ffk F
      // 125: aload 0
      // 126: getfield aba.vx9 I
      // 129: i2f
      // 12a: fsub
      // 12b: putfield aba.ffk F
      // 12e: aload 0
      // 12f: iload 1
      // 130: ifeq 150
      // 133: getfield aba.vx9 I
      // 136: bipush 10
      // 138: if_icmple 14f
      // 13b: goto 142
      // 13e: invokestatic aba.a (Loov;)Loov;
      // 141: athrow
      // 142: aload 0
      // 143: bipush 10
      // 145: putfield aba.vx9 I
      // 148: goto 14f
      // 14b: invokestatic aba.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 0
      // 150: aload 0
      // 151: getfield aba.ffk F
      // 154: putfield aba.au3 F
      // 157: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
