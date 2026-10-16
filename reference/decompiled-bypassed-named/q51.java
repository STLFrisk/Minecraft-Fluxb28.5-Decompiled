public class q51 extends vrx {
   public q51(ha9 var1, a7q var2, u42 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.hlw = var1;
      this.qi5 = var2;
      this.tx3 = var3;
   }

   @Override
   public boolean xvl(erg var1) {
      return false;
   }

   @Override
   public erg xtx(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 32
      // 09: invokevirtual q51.hf8 ()Z
      // 0c: ifeq 31
      // 0f: goto 16
      // 12: invokestatic q51.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: dup
      // 18: getfield q51.wqf I
      // 1b: iload 1
      // 1c: aload 0
      // 1d: invokevirtual q51.x4s ()Lerg;
      // 20: getfield erg.qd2 I
      // 23: invokestatic java/lang/Math.min (II)I
      // 26: iadd
      // 27: putfield q51.wqf I
      // 2a: goto 31
      // 2d: invokestatic q51.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: iload 1
      // 33: invokespecial vrx.xtx (I)Lerg;
      // 36: areturn
   }

   @Override
   public void f2o(erg var1, int var2) {
      this.wqf += var2;
      this.erq(var1);
   }

   @Override
   public void erq(erg var1) {
      var1.fie(this.hlw.oay, this.hlw, this.wqf);
      this.wqf = 0;
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
      // 00: aload 0
      // 01: aload 2
      // 02: invokevirtual q51.erq (Lerg;)V
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: aload 0
      // 09: getfield q51.tx3 Lu42;
      // 0c: invokevirtual u42.ces ()Lxxb;
      // 0f: astore 4
      // 11: istore 3
      // 12: aload 4
      // 14: ifnull d7
      // 17: aload 0
      // 18: getfield q51.tx3 Lu42;
      // 1b: bipush 0
      // 1c: invokevirtual u42.ibn (I)Lerg;
      // 1f: astore 5
      // 21: aload 0
      // 22: getfield q51.tx3 Lu42;
      // 25: bipush 1
      // 26: invokevirtual u42.ibn (I)Lerg;
      // 29: astore 6
      // 2b: aload 0
      // 2c: iload 3
      // 2d: ifne 6a
      // 30: aload 4
      // 32: aload 5
      // 34: aload 6
      // 36: invokespecial q51.pn_ (Lxxb;Lerg;Lerg;)Z
      // 39: ifne 62
      // 3c: goto 43
      // 3f: invokestatic q51.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: iload 3
      // 45: ifne 6a
      // 48: goto 4f
      // 4b: invokestatic q51.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 4
      // 51: aload 6
      // 53: aload 5
      // 55: invokespecial q51.pn_ (Lxxb;Lerg;Lerg;)Z
      // 58: ifeq d7
      // 5b: goto 62
      // 5e: invokestatic q51.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 0
      // 63: goto 6a
      // 66: invokestatic q51.a (Loov;)Loov;
      // 69: athrow
      // 6a: getfield q51.qi5 La7q;
      // 6d: aload 4
      // 6f: invokeinterface a7q.wyy (Lxxb;)V 2
      // 74: aload 1
      // 75: getstatic l9p.ld2 L_ss;
      // 78: invokevirtual ha9.aex (L_ss;)V
      // 7b: aload 5
      // 7d: iload 3
      // 7e: ifne aa
      // 81: ifnull a8
      // 84: goto 8b
      // 87: invokestatic q51.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 5
      // 8d: iload 3
      // 8e: ifne aa
      // 91: goto 98
      // 94: invokestatic q51.a (Loov;)Loov;
      // 97: athrow
      // 98: getfield erg.qd2 I
      // 9b: ifgt a8
      // 9e: goto a5
      // a1: invokestatic q51.a (Loov;)Loov;
      // a4: athrow
      // a5: aconst_null
      // a6: astore 5
      // a8: aload 6
      // aa: iload 3
      // ab: ifne ba
      // ae: ifnull c3
      // b1: goto b8
      // b4: invokestatic q51.a (Loov;)Loov;
      // b7: athrow
      // b8: aload 6
      // ba: getfield erg.qd2 I
      // bd: ifgt c3
      // c0: aconst_null
      // c1: astore 6
      // c3: aload 0
      // c4: getfield q51.tx3 Lu42;
      // c7: bipush 0
      // c8: aload 5
      // ca: invokevirtual u42.cxl (ILerg;)V
      // cd: aload 0
      // ce: getfield q51.tx3 Lu42;
      // d1: bipush 1
      // d2: aload 6
      // d4: invokevirtual u42.cxl (ILerg;)V
      // d7: return
   }

   private boolean pn_(xxb param1, erg param2, erg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual xxb.k2s ()Lerg;
      // 04: astore 5
      // 06: invokestatic OpaquePredicate.c ()I
      // 09: aload 1
      // 0a: invokevirtual xxb.ha2 ()Lerg;
      // 0d: astore 6
      // 0f: istore 4
      // 11: aload 2
      // 12: iload 4
      // 14: ifne 22
      // 17: ifnull da
      // 1a: goto 21
      // 1d: invokestatic q51.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 2
      // 22: iload 4
      // 24: ifne 42
      // 27: invokevirtual erg.gn1 ()Lu7m;
      // 2a: aload 5
      // 2c: invokevirtual erg.gn1 ()Lu7m;
      // 2f: if_acmpne da
      // 32: goto 39
      // 35: invokestatic q51.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 6
      // 3b: goto 42
      // 3e: invokestatic q51.a (Loov;)Loov;
      // 41: athrow
      // 42: iload 4
      // 44: ifne ab
      // 47: ifnull a9
      // 4a: goto 51
      // 4d: invokestatic q51.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 3
      // 52: iload 4
      // 54: ifne ab
      // 57: goto 5e
      // 5a: invokestatic q51.a (Loov;)Loov;
      // 5d: athrow
      // 5e: ifnull a9
      // 61: goto 68
      // 64: invokestatic q51.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 6
      // 6a: iload 4
      // 6c: ifne ab
      // 6f: goto 76
      // 72: invokestatic q51.a (Loov;)Loov;
      // 75: athrow
      // 76: invokevirtual erg.gn1 ()Lu7m;
      // 79: aload 3
      // 7a: invokevirtual erg.gn1 ()Lu7m;
      // 7d: if_acmpne a9
      // 80: goto 87
      // 83: invokestatic q51.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 2
      // 88: dup
      // 89: getfield erg.qd2 I
      // 8c: aload 5
      // 8e: getfield erg.qd2 I
      // 91: isub
      // 92: putfield erg.qd2 I
      // 95: aload 3
      // 96: dup
      // 97: getfield erg.qd2 I
      // 9a: aload 6
      // 9c: getfield erg.qd2 I
      // 9f: isub
      // a0: putfield erg.qd2 I
      // a3: bipush 1
      // a4: ireturn
      // a5: invokestatic q51.a (Loov;)Loov;
      // a8: athrow
      // a9: aload 6
      // ab: iload 4
      // ad: ifne bb
      // b0: ifnonnull da
      // b3: goto ba
      // b6: invokestatic q51.a (Loov;)Loov;
      // b9: athrow
      // ba: aload 3
      // bb: iload 4
      // bd: ifne cb
      // c0: ifnonnull da
      // c3: goto ca
      // c6: invokestatic q51.a (Loov;)Loov;
      // c9: athrow
      // ca: aload 2
      // cb: dup
      // cc: getfield erg.qd2 I
      // cf: aload 5
      // d1: getfield erg.qd2 I
      // d4: isub
      // d5: putfield erg.qd2 I
      // d8: bipush 1
      // d9: ireturn
      // da: bipush 0
      // db: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
