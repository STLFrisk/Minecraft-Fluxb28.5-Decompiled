public class h_s$s03 extends cjm {
   private h_s g4s;
   public int eyh;

   public h_s$s03(h_s var1) {
      this.g4s = var1;
   }

   @Override
   public boolean vle() {
      try {
         if (this.g4s.q4v() != null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   @Override
   public void mnp() {
      this.eyh = 0;
   }

   @Override
   public void zly() {
      this.g4s.f8s(false);
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield h_s$s03.g4s Lh_s;
      // 004: invokevirtual h_s.q4v ()Lg_3;
      // 007: astore 2
      // 008: invokestatic t9d.c ()I
      // 00b: ldc2_w 64.0
      // 00e: dstore 3
      // 00f: istore 1
      // 010: aload 2
      // 011: aload 0
      // 012: getfield h_s$s03.g4s Lh_s;
      // 015: invokevirtual g_3.wxg (Li2h;)D
      // 018: dload 3
      // 019: dload 3
      // 01a: dmul
      // 01b: dcmpg
      // 01c: iload 1
      // 01d: ifne 1a1
      // 020: ifge 18b
      // 023: goto 02a
      // 026: invokestatic h_s$s03.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield h_s$s03.g4s Lh_s;
      // 02e: aload 2
      // 02f: invokevirtual h_s.gq6 (Li2h;)Z
      // 032: iload 1
      // 033: ifne 1a1
      // 036: goto 03d
      // 039: invokestatic h_s$s03.a (Loov;)Loov;
      // 03c: athrow
      // 03d: ifeq 18b
      // 040: goto 047
      // 043: invokestatic h_s$s03.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: getfield h_s$s03.g4s Lh_s;
      // 04b: getfield h_s.oay Lt9d;
      // 04e: astore 5
      // 050: aload 0
      // 051: dup
      // 052: getfield h_s$s03.eyh I
      // 055: bipush 1
      // 056: iadd
      // 057: putfield h_s$s03.eyh I
      // 05a: aload 0
      // 05b: getfield h_s$s03.eyh I
      // 05e: bipush 10
      // 060: iload 1
      // 061: ifne 093
      // 064: if_icmpne 08d
      // 067: goto 06e
      // 06a: invokestatic h_s$s03.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 5
      // 070: aconst_null
      // 071: checkcast ha9
      // 074: sipush 1007
      // 077: new mew
      // 07a: dup
      // 07b: aload 0
      // 07c: getfield h_s$s03.g4s Lh_s;
      // 07f: invokespecial mew.<init> (Li2h;)V
      // 082: bipush 0
      // 083: invokevirtual t9d.pbs (Lha9;ILmew;I)V
      // 086: goto 08d
      // 089: invokestatic h_s$s03.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield h_s$s03.eyh I
      // 091: bipush 20
      // 093: if_icmpne 187
      // 096: ldc2_w 4.0
      // 099: dstore 6
      // 09b: aload 0
      // 09c: getfield h_s$s03.g4s Lh_s;
      // 09f: fconst_1
      // 0a0: invokevirtual h_s.wej (F)Lfqr;
      // 0a3: astore 8
      // 0a5: aload 2
      // 0a6: getfield g_3.o2v D
      // 0a9: aload 0
      // 0aa: getfield h_s$s03.g4s Lh_s;
      // 0ad: getfield h_s.o2v D
      // 0b0: aload 8
      // 0b2: getfield fqr.lvi D
      // 0b5: dload 6
      // 0b7: dmul
      // 0b8: dadd
      // 0b9: dsub
      // 0ba: dstore 9
      // 0bc: aload 2
      // 0bd: invokevirtual g_3.aaw ()Lnh4;
      // 0c0: getfield nh4.bx_ D
      // 0c3: aload 2
      // 0c4: getfield g_3.ikl F
      // 0c7: fconst_2
      // 0c8: fdiv
      // 0c9: f2d
      // 0ca: dadd
      // 0cb: ldc2_w 0.5
      // 0ce: aload 0
      // 0cf: getfield h_s$s03.g4s Lh_s;
      // 0d2: getfield h_s.kfp D
      // 0d5: dadd
      // 0d6: aload 0
      // 0d7: getfield h_s$s03.g4s Lh_s;
      // 0da: getfield h_s.ikl F
      // 0dd: fconst_2
      // 0de: fdiv
      // 0df: f2d
      // 0e0: dadd
      // 0e1: dsub
      // 0e2: dstore 11
      // 0e4: aload 2
      // 0e5: getfield g_3.vbd D
      // 0e8: aload 0
      // 0e9: getfield h_s$s03.g4s Lh_s;
      // 0ec: getfield h_s.vbd D
      // 0ef: aload 8
      // 0f1: getfield fqr.bn2 D
      // 0f4: dload 6
      // 0f6: dmul
      // 0f7: dadd
      // 0f8: dsub
      // 0f9: dstore 13
      // 0fb: aload 5
      // 0fd: aconst_null
      // 0fe: checkcast ha9
      // 101: sipush 1008
      // 104: new mew
      // 107: dup
      // 108: aload 0
      // 109: getfield h_s$s03.g4s Lh_s;
      // 10c: invokespecial mew.<init> (Li2h;)V
      // 10f: bipush 0
      // 110: invokevirtual t9d.pbs (Lha9;ILmew;I)V
      // 113: new wqh
      // 116: dup
      // 117: aload 5
      // 119: aload 0
      // 11a: getfield h_s$s03.g4s Lh_s;
      // 11d: dload 9
      // 11f: dload 11
      // 121: dload 13
      // 123: invokespecial wqh.<init> (Lt9d;Lg_3;DDD)V
      // 126: astore 15
      // 128: aload 15
      // 12a: aload 0
      // 12b: getfield h_s$s03.g4s Lh_s;
      // 12e: invokevirtual h_s.nwa ()I
      // 131: putfield wqh.yur I
      // 134: aload 15
      // 136: aload 0
      // 137: getfield h_s$s03.g4s Lh_s;
      // 13a: getfield h_s.o2v D
      // 13d: aload 8
      // 13f: getfield fqr.lvi D
      // 142: dload 6
      // 144: dmul
      // 145: dadd
      // 146: putfield wqh.o2v D
      // 149: aload 15
      // 14b: aload 0
      // 14c: getfield h_s$s03.g4s Lh_s;
      // 14f: getfield h_s.kfp D
      // 152: aload 0
      // 153: getfield h_s$s03.g4s Lh_s;
      // 156: getfield h_s.ikl F
      // 159: fconst_2
      // 15a: fdiv
      // 15b: f2d
      // 15c: dadd
      // 15d: ldc2_w 0.5
      // 160: dadd
      // 161: putfield wqh.kfp D
      // 164: aload 15
      // 166: aload 0
      // 167: getfield h_s$s03.g4s Lh_s;
      // 16a: getfield h_s.vbd D
      // 16d: aload 8
      // 16f: getfield fqr.bn2 D
      // 172: dload 6
      // 174: dmul
      // 175: dadd
      // 176: putfield wqh.vbd D
      // 179: aload 5
      // 17b: aload 15
      // 17d: invokevirtual t9d.xzq (Li2h;)Z
      // 180: pop
      // 181: aload 0
      // 182: bipush -40
      // 184: putfield h_s$s03.eyh I
      // 187: iload 1
      // 188: ifeq 1b5
      // 18b: aload 0
      // 18c: iload 1
      // 18d: ifne 1b6
      // 190: goto 197
      // 193: invokestatic h_s$s03.a (Loov;)Loov;
      // 196: athrow
      // 197: getfield h_s$s03.eyh I
      // 19a: goto 1a1
      // 19d: invokestatic h_s$s03.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: ifle 1b5
      // 1a4: aload 0
      // 1a5: dup
      // 1a6: getfield h_s$s03.eyh I
      // 1a9: bipush 1
      // 1aa: isub
      // 1ab: putfield h_s$s03.eyh I
      // 1ae: goto 1b5
      // 1b1: invokestatic h_s$s03.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: aload 0
      // 1b6: getfield h_s$s03.g4s Lh_s;
      // 1b9: aload 0
      // 1ba: getfield h_s$s03.eyh I
      // 1bd: iload 1
      // 1be: ifne 1d5
      // 1c1: bipush 10
      // 1c3: if_icmple 1d8
      // 1c6: goto 1cd
      // 1c9: invokestatic h_s$s03.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: bipush 1
      // 1ce: goto 1d5
      // 1d1: invokestatic h_s$s03.a (Loov;)Loov;
      // 1d4: athrow
      // 1d5: goto 1d9
      // 1d8: bipush 0
      // 1d9: invokevirtual h_s.f8s (Z)V
      // 1dc: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
