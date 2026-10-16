public class bvu extends u7m {
   private static final m1p ko3 = new bvu$1();
   private final _f3$c3d c9z;

   public bvu(_f3$c3d var1) {
      this.vgp = 1;
      this.c9z = var1;
      this.qfy(uja.qes);
      okn.r4s.emn(this, ko3);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, t9d param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 3
      // 06: aload 4
      // 08: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0b: astore 10
      // 0d: aload 10
      // 0f: invokestatic y0y.al_ (Lzfz;)Z
      // 12: iload 9
      // 14: ifeq f3
      // 17: ifeq f2
      // 1a: goto 21
      // 1d: invokestatic bvu.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 3
      // 22: getfield t9d.v0f Z
      // 25: iload 9
      // 27: ifeq f1
      // 2a: goto 31
      // 2d: invokestatic bvu.a (Loov;)Loov;
      // 30: athrow
      // 31: ifne e6
      // 34: goto 3b
      // 37: invokestatic bvu.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 10
      // 3d: iload 9
      // 3f: ifeq 64
      // 42: goto 49
      // 45: invokestatic bvu.a (Loov;)Loov;
      // 48: athrow
      // 49: invokeinterface zfz.r_y ()Le0x; 1
      // 4e: instanceof y0y
      // 51: ifeq 7c
      // 54: goto 5b
      // 57: invokestatic bvu.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 10
      // 5d: goto 64
      // 60: invokestatic bvu.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 10
      // 66: invokeinterface zfz.r_y ()Le0x; 1
      // 6b: checkcast y0y
      // 6e: invokevirtual y0y.fvr ()Lxny;
      // 71: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 76: checkcast y0y$_zr
      // 79: goto 7f
      // 7c: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 7f: astore 11
      // 81: dconst_0
      // 82: dstore 12
      // 84: aload 11
      // 86: invokevirtual y0y$_zr.t1s ()Z
      // 89: ifeq 91
      // 8c: ldc2_w 0.5
      // 8f: dstore 12
      // 91: aload 3
      // 92: aload 4
      // 94: invokevirtual mew.getX ()I
      // 97: i2d
      // 98: ldc2_w 0.5
      // 9b: dadd
      // 9c: aload 4
      // 9e: invokevirtual mew.getY ()I
      // a1: i2d
      // a2: ldc2_w 0.0625
      // a5: dadd
      // a6: dload 12
      // a8: dadd
      // a9: aload 4
      // ab: invokevirtual mew.getZ ()I
      // ae: i2d
      // af: ldc2_w 0.5
      // b2: dadd
      // b3: aload 0
      // b4: getfield bvu.c9z L_f3$c3d;
      // b7: invokestatic _f3._cl (Lt9d;DDDL_f3$c3d;)L_f3;
      // ba: astore 14
      // bc: aload 1
      // bd: invokevirtual erg.x4w ()Z
      // c0: iload 9
      // c2: ifeq e5
      // c5: ifeq df
      // c8: goto cf
      // cb: invokestatic bvu.a (Loov;)Loov;
      // ce: athrow
      // cf: aload 14
      // d1: aload 1
      // d2: invokevirtual erg.zow ()Ljava/lang/String;
      // d5: invokevirtual _f3.x84 (Ljava/lang/String;)V
      // d8: goto df
      // db: invokestatic bvu.a (Loov;)Loov;
      // de: athrow
      // df: aload 3
      // e0: aload 14
      // e2: invokevirtual t9d.xzq (Li2h;)Z
      // e5: pop
      // e6: aload 1
      // e7: dup
      // e8: getfield erg.qd2 I
      // eb: bipush 1
      // ec: isub
      // ed: putfield erg.qd2 I
      // f0: bipush 1
      // f1: ireturn
      // f2: bipush 0
      // f3: ireturn
   }

   public static _f3$c3d l02(bvu var0) {
      return var0.c9z;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
