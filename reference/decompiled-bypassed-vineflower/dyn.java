public class dyn extends stu {
   public dyn(e0x var1) {
      super(var1, false);
   }

   @Override
   public erg r__(erg param1, t9d param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: aload 2
      // 007: aload 3
      // 008: bipush 1
      // 009: invokevirtual dyn.tbt (Lt9d;Lha9;Z)Lakm;
      // 00c: astore 5
      // 00e: aload 5
      // 010: iload 4
      // 012: ifeq 027
      // 015: ifnonnull 025
      // 018: goto 01f
      // 01b: invokestatic dyn.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 1
      // 020: areturn
      // 021: invokestatic dyn.a (Loov;)Loov;
      // 024: athrow
      // 025: aload 5
      // 027: iload 4
      // 029: ifeq 045
      // 02c: getfield akm.oyz Lakm$qs6;
      // 02f: getstatic akm$qs6.i4l Lakm$qs6;
      // 032: if_acmpne 137
      // 035: goto 03c
      // 038: invokestatic dyn.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 5
      // 03e: goto 045
      // 041: invokestatic dyn.a (Loov;)Loov;
      // 044: athrow
      // 045: invokevirtual akm._uf ()Lmew;
      // 048: astore 6
      // 04a: aload 2
      // 04b: aload 3
      // 04c: aload 6
      // 04e: invokevirtual t9d.q2p (Lha9;Lmew;)Z
      // 051: iload 4
      // 053: ifeq 07a
      // 056: ifne 066
      // 059: goto 060
      // 05c: invokestatic dyn.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 1
      // 061: areturn
      // 062: invokestatic dyn.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 3
      // 067: aload 6
      // 069: aload 5
      // 06b: getfield akm.m_f Lvt2;
      // 06e: invokevirtual mew.offset (Lvt2;)Lmew;
      // 071: aload 5
      // 073: getfield akm.m_f Lvt2;
      // 076: aload 1
      // 077: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 07a: ifne 083
      // 07d: aload 1
      // 07e: areturn
      // 07f: invokestatic dyn.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 6
      // 085: invokevirtual mew.nuv ()Lmew;
      // 088: astore 7
      // 08a: aload 2
      // 08b: aload 6
      // 08d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 090: astore 8
      // 092: aload 8
      // 094: iload 4
      // 096: ifeq 0b7
      // 099: invokeinterface zfz.r_y ()Le0x; 1
      // 09e: invokevirtual e0x.p1r ()Lp3y;
      // 0a1: getstatic p3y.six Lp3y;
      // 0a4: if_acmpne 137
      // 0a7: goto 0ae
      // 0aa: invokestatic dyn.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 8
      // 0b0: goto 0b7
      // 0b3: invokestatic dyn.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: getstatic hmv.nfg L_ku;
      // 0ba: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0bf: checkcast java/lang/Integer
      // 0c2: invokevirtual java/lang/Integer.intValue ()I
      // 0c5: iload 4
      // 0c7: ifeq 0e1
      // 0ca: ifne 137
      // 0cd: goto 0d4
      // 0d0: invokestatic dyn.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: aload 2
      // 0d5: aload 7
      // 0d7: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 0da: goto 0e1
      // 0dd: invokestatic dyn.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: iload 4
      // 0e3: ifeq 117
      // 0e6: ifeq 137
      // 0e9: goto 0f0
      // 0ec: invokestatic dyn.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 2
      // 0f1: aload 7
      // 0f3: getstatic ox_.r67 Le0x;
      // 0f6: invokevirtual e0x.l4i ()Lzfz;
      // 0f9: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 0fc: pop
      // 0fd: aload 3
      // 0fe: iload 4
      // 100: ifeq 12c
      // 103: goto 10a
      // 106: invokestatic dyn.a (Loov;)Loov;
      // 109: athrow
      // 10a: getfield ha9.lls Lpj2;
      // 10d: getfield pj2.g40 Z
      // 110: goto 117
      // 113: invokestatic dyn.a (Loov;)Loov;
      // 116: athrow
      // 117: ifne 12b
      // 11a: aload 1
      // 11b: dup
      // 11c: getfield erg.qd2 I
      // 11f: bipush 1
      // 120: isub
      // 121: putfield erg.qd2 I
      // 124: goto 12b
      // 127: invokestatic dyn.a (Loov;)Loov;
      // 12a: athrow
      // 12b: aload 3
      // 12c: getstatic l9p.foo [L_ss;
      // 12f: aload 0
      // 130: invokestatic u7m._lo (Lu7m;)I
      // 133: aaload
      // 134: invokevirtual ha9.aex (L_ss;)V
      // 137: aload 1
      // 138: areturn
   }

   @Override
   public int bu9(erg var1, int var2) {
      return ox_.r67.ieb(ox_.r67.kig(var1.j6_()));
   }

   private static oov a(oov var0) {
      return var0;
   }
}
