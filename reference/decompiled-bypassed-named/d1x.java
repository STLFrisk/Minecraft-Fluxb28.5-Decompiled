public class d1x extends u7m {
   public u7m$vz9 lr8;

   public d1x(u7m$vz9 var1) {
      this.lr8 = var1;
      this.vgp = 1;
      this.rlr(var1.sqv());
      this.qfy(uja.zip);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, OpaquePredicate param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 9
      // 005: aload 2
      // 006: aload 4
      // 008: aload 5
      // 00a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 00d: aload 5
      // 00f: aload 1
      // 010: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 013: iload 9
      // 015: ifeq 023
      // 018: ifne 024
      // 01b: goto 022
      // 01e: invokestatic d1x.a (Loov;)Loov;
      // 021: athrow
      // 022: bipush 0
      // 023: ireturn
      // 024: aload 3
      // 025: aload 4
      // 027: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 02a: astore 10
      // 02c: aload 10
      // 02e: invokeinterface zfz.r_y ()Le0x; 1
      // 033: astore 11
      // 035: aload 5
      // 037: getstatic vt2.m3r Lvt2;
      // 03a: if_acmpeq 10b
      // 03d: aload 3
      // 03e: aload 4
      // 040: invokevirtual mew.nuv ()Lmew;
      // 043: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 046: invokeinterface zfz.r_y ()Le0x; 1
      // 04b: iload 9
      // 04d: ifeq 070
      // 050: goto 057
      // 053: invokestatic d1x.a (Loov;)Loov;
      // 056: athrow
      // 057: invokevirtual e0x.p1r ()Lp3y;
      // 05a: getstatic p3y.cei Lp3y;
      // 05d: if_acmpne 10b
      // 060: goto 067
      // 063: invokestatic d1x.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 11
      // 069: goto 070
      // 06c: invokestatic d1x.a (Loov;)Loov;
      // 06f: athrow
      // 070: getstatic ox_.l11 Lx82;
      // 073: iload 9
      // 075: ifeq 09b
      // 078: if_acmpne 096
      // 07b: goto 082
      // 07e: invokestatic d1x.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: aload 1
      // 084: aload 2
      // 085: aload 3
      // 086: aload 4
      // 088: getstatic ox_._5i Le0x;
      // 08b: invokevirtual e0x.l4i ()Lzfz;
      // 08e: invokevirtual d1x.pv_ (Lerg;Lha9;Lt9d;Lmew;Lzfz;)Z
      // 091: ireturn
      // 092: invokestatic d1x.a (Loov;)Loov;
      // 095: athrow
      // 096: aload 11
      // 098: getstatic ox_.kqk Le0x;
      // 09b: if_acmpne 10b
      // 09e: getstatic d1x$1._ec [I
      // 0a1: aload 10
      // 0a3: getstatic bx0.nln Lzb_;
      // 0a6: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0ab: checkcast bx0$b_z
      // 0ae: invokevirtual bx0$b_z.ordinal ()I
      // 0b1: iaload
      // 0b2: iload 9
      // 0b4: ifeq 10c
      // 0b7: goto 0be
      // 0ba: invokestatic d1x.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: lookupswitch 77 2 1 30 2 50
      // 0d8: invokestatic d1x.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: aload 1
      // 0de: aload 2
      // 0df: aload 3
      // 0e0: aload 4
      // 0e2: getstatic ox_._5i Le0x;
      // 0e5: invokevirtual e0x.l4i ()Lzfz;
      // 0e8: invokevirtual d1x.pv_ (Lerg;Lha9;Lt9d;Lmew;Lzfz;)Z
      // 0eb: ireturn
      // 0ec: invokestatic d1x.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: aload 1
      // 0f2: aload 2
      // 0f3: aload 3
      // 0f4: aload 4
      // 0f6: getstatic ox_.kqk Le0x;
      // 0f9: invokevirtual e0x.l4i ()Lzfz;
      // 0fc: getstatic bx0.nln Lzb_;
      // 0ff: getstatic bx0$b_z.rg3 Lbx0$b_z;
      // 102: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 107: invokevirtual d1x.pv_ (Lerg;Lha9;Lt9d;Lmew;Lzfz;)Z
      // 10a: ireturn
      // 10b: bipush 0
      // 10c: ireturn
   }

   public boolean pv_(erg param1, ha9 param2, OpaquePredicate param3, mew param4, zfz param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 3
      // 06: aload 4
      // 08: invokevirtual mew.getX ()I
      // 0b: i2f
      // 0c: ldc 0.5
      // 0e: nop
      // 0f: fadd
      // 10: f2d
      // 11: aload 4
      // 13: invokevirtual mew.getY ()I
      // 16: i2f
      // 17: ldc 0.5
      // 19: nop
      // 1a: fadd
      // 1b: f2d
      // 1c: aload 4
      // 1e: invokevirtual mew.getZ ()I
      // 21: i2f
      // 22: ldc 0.5
      // 24: nop
      // 25: fadd
      // 26: f2d
      // 27: aload 5
      // 29: invokeinterface zfz.r_y ()Le0x; 1
      // 2e: getfield e0x.zu6 Le0x$zvv;
      // 31: invokevirtual e0x$zvv.i3r ()Ljava/lang/String;
      // 34: aload 5
      // 36: invokeinterface zfz.r_y ()Le0x; 1
      // 3b: getfield e0x.zu6 Le0x$zvv;
      // 3e: invokevirtual e0x$zvv.dnt ()F
      // 41: fconst_1
      // 42: fadd
      // 43: fconst_2
      // 44: fdiv
      // 45: aload 5
      // 47: invokeinterface zfz.r_y ()Le0x; 1
      // 4c: getfield e0x.zu6 Le0x$zvv;
      // 4f: invokevirtual e0x$zvv.kjj ()F
      // 52: ldc 0.8
      // 54: nop
      // 55: fmul
      // 56: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 59: aload 3
      // 5a: getfield OpaquePredicate.v0f Z
      // 5d: iload 6
      // 5f: ifne 82
      // 62: ifeq 72
      // 65: goto 6c
      // 68: invokestatic d1x.a (Loov;)Loov;
      // 6b: athrow
      // 6c: bipush 1
      // 6d: ireturn
      // 6e: invokestatic d1x.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 3
      // 73: aload 4
      // 75: aload 5
      // 77: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 7a: pop
      // 7b: aload 1
      // 7c: bipush 1
      // 7d: aload 2
      // 7e: invokevirtual erg.ybw (ILg_3;)V
      // 81: bipush 1
      // 82: ireturn
   }

   @Override
   public boolean t0m() {
      return true;
   }

   public String zjw() {
      return this.lr8.toString();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
