public class xyl extends u7m {
   public xyl() {
      this.qfy(uja.qes);
      this.cb3(1);
      this.rlr(25);
   }

   @Override
   public boolean t0m() {
      return true;
   }

   @Override
   public boolean dya() {
      return true;
   }

   @Override
   public erg r__(erg param1, OpaquePredicate param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifne b8
      // 0b: invokevirtual ha9.i0e ()Z
      // 0e: ifeq b7
      // 11: goto 18
      // 14: invokestatic xyl.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 3
      // 19: iload 4
      // 1b: ifne b8
      // 1e: goto 25
      // 21: invokestatic xyl.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield ha9.hzp Li2h;
      // 28: instanceof _gj
      // 2b: ifeq b7
      // 2e: goto 35
      // 31: invokestatic xyl.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 3
      // 36: getfield ha9.hzp Li2h;
      // 39: checkcast _gj
      // 3c: astore 5
      // 3e: iload 4
      // 40: ifne c3
      // 43: aload 5
      // 45: invokevirtual _gj.hl4 ()Lbdv;
      // 48: invokevirtual bdv.k3c ()Z
      // 4b: ifeq b7
      // 4e: goto 55
      // 51: invokestatic xyl.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 1
      // 56: iload 4
      // 58: ifne c4
      // 5b: goto 62
      // 5e: invokestatic xyl.a (Loov;)Loov;
      // 61: athrow
      // 62: invokevirtual erg.mg5 ()I
      // 65: aload 1
      // 66: invokevirtual erg.j6_ ()I
      // 69: isub
      // 6a: bipush 7
      // 6c: if_icmplt b7
      // 6f: goto 76
      // 72: invokestatic xyl.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 5
      // 78: invokevirtual _gj.hl4 ()Lbdv;
      // 7b: invokevirtual bdv.ri3 ()V
      // 7e: aload 1
      // 7f: bipush 7
      // 81: aload 3
      // 82: invokevirtual erg.ybw (ILg_3;)V
      // 85: aload 1
      // 86: iload 4
      // 88: ifne c4
      // 8b: goto 92
      // 8e: invokestatic xyl.a (Loov;)Loov;
      // 91: athrow
      // 92: getfield erg.qd2 I
      // 95: ifne b7
      // 98: goto 9f
      // 9b: invokestatic xyl.a (Loov;)Loov;
      // 9e: athrow
      // 9f: new erg
      // a2: dup
      // a3: getstatic xbr.kru Lyab;
      // a6: invokespecial erg.<init> (Lu7m;)V
      // a9: astore 6
      // ab: aload 6
      // ad: aload 1
      // ae: invokevirtual erg.zso ()Lbdo;
      // b1: invokevirtual erg.b67 (Lbdo;)V
      // b4: aload 6
      // b6: areturn
      // b7: aload 3
      // b8: getstatic l9p.foo [L_ss;
      // bb: aload 0
      // bc: invokestatic u7m._lo (Lu7m;)I
      // bf: aaload
      // c0: invokevirtual ha9.aex (L_ss;)V
      // c3: aload 1
      // c4: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
