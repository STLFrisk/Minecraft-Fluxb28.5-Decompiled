public final class yxu {
   private final m1c xl8 = new m1c();
   private final grn yph = new grn();
   private static yxu w2y;
   private iw2 liu;

   private yxu(iw2 var1) {
      this.wzp(var1);
   }

   public void wzp(iw2 param1) {
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
      // 05: iload 2
      // 06: ifeq 1e
      // 09: ifnull 22
      // 0c: goto 13
      // 0f: invokestatic yxu.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: getfield yxu.liu Liw2;
      // 17: goto 1e
      // 1a: invokestatic yxu.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: if_acmpne 27
      // 22: return
      // 23: invokestatic yxu.a (Loov;)Loov;
      // 26: athrow
      // 27: getstatic yxu$1.y5v [I
      // 2a: aload 1
      // 2b: invokevirtual iw2.ordinal ()I
      // 2e: iaload
      // 2f: lookupswitch 57 2 1 25 2 43
      // 48: aload 0
      // 49: getfield yxu.yph Lgrn;
      // 4c: invokevirtual grn._kh ()V
      // 4f: iload 2
      // 50: ifne 68
      // 53: goto 5a
      // 56: invokestatic yxu.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield yxu.yph Lgrn;
      // 5e: invokevirtual grn.puk ()V
      // 61: goto 68
      // 64: invokestatic yxu.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: aload 0
      // 6a: getfield yxu.xl8 Lm1c;
      // 6d: aload 1
      // 6e: invokevirtual m1c.zoz (Liw2;)Liw2;
      // 71: putfield yxu.liu Liw2;
      // 74: return
   }

   public iw2 wet() {
      return this.liu;
   }

   public static yxu g3c() {
      return ol1(iw2.ot_);
   }

   public static yxu vtm() {
      return ol1(iw2.ltn);
   }

   private static yxu ol1(iw2 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic yxu.w2y Lyxu;
      // 07: iload 1
      // 08: ifeq 2e
      // 0b: ifnonnull 2b
      // 0e: goto 15
      // 11: invokestatic yxu.a (Loov;)Loov;
      // 14: athrow
      // 15: new yxu
      // 18: dup
      // 19: aload 0
      // 1a: invokespecial yxu.<init> (Liw2;)V
      // 1d: putstatic yxu.w2y Lyxu;
      // 20: iload 1
      // 21: ifne 4e
      // 24: goto 2b
      // 27: invokestatic yxu.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getstatic yxu.w2y Lyxu;
      // 2e: iload 1
      // 2f: ifeq 51
      // 32: invokevirtual yxu.wet ()Liw2;
      // 35: aload 0
      // 36: if_acmpeq 4e
      // 39: goto 40
      // 3c: invokestatic yxu.a (Loov;)Loov;
      // 3f: athrow
      // 40: getstatic yxu.w2y Lyxu;
      // 43: aload 0
      // 44: invokevirtual yxu.wzp (Liw2;)V
      // 47: goto 4e
      // 4a: invokestatic yxu.a (Loov;)Loov;
      // 4d: athrow
      // 4e: getstatic yxu.w2y Lyxu;
      // 51: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
