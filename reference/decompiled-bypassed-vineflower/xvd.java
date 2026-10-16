public class xvd extends u7m {
   public xvd(Class var1) {
      this.yi0 = var1;
      this.qfy(uja.qqf);
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
      // 05: aload 5
      // 07: getstatic vt2.m3r Lvt2;
      // 0a: iload 9
      // 0c: ifeq 24
      // 0f: if_acmpne 1f
      // 12: goto 19
      // 15: invokestatic xvd.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic xvd.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 5
      // 21: getstatic vt2.rf3 Lvt2;
      // 24: if_acmpne 2d
      // 27: bipush 0
      // 28: ireturn
      // 29: invokestatic xvd.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 4
      // 2f: aload 5
      // 31: invokevirtual mew.offset (Lvt2;)Lmew;
      // 34: astore 10
      // 36: aload 2
      // 37: aload 10
      // 39: aload 5
      // 3b: aload 1
      // 3c: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 3f: iload 9
      // 41: ifeq 4f
      // 44: ifne 50
      // 47: goto 4e
      // 4a: invokestatic xvd.a (Loov;)Loov;
      // 4d: athrow
      // 4e: bipush 0
      // 4f: ireturn
      // 50: aload 0
      // 51: aload 3
      // 52: aload 10
      // 54: aload 5
      // 56: invokespecial xvd.sdh (Lt9d;Lmew;Lvt2;)Lrdv;
      // 59: astore 11
      // 5b: aload 11
      // 5d: iload 9
      // 5f: ifeq 6e
      // 62: ifnull b2
      // 65: goto 6c
      // 68: invokestatic xvd.a (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 11
      // 6e: invokevirtual rdv.lgc ()Z
      // 71: iload 9
      // 73: ifeq b3
      // 76: ifeq b2
      // 79: goto 80
      // 7c: invokestatic xvd.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 3
      // 81: getfield t9d.v0f Z
      // 84: iload 9
      // 86: ifeq a7
      // 89: goto 90
      // 8c: invokestatic xvd.a (Loov;)Loov;
      // 8f: athrow
      // 90: ifne a8
      // 93: goto 9a
      // 96: invokestatic xvd.a (Loov;)Loov;
      // 99: athrow
      // 9a: aload 3
      // 9b: aload 11
      // 9d: invokevirtual t9d.xzq (Li2h;)Z
      // a0: goto a7
      // a3: invokestatic xvd.a (Loov;)Loov;
      // a6: athrow
      // a7: pop
      // a8: aload 1
      // a9: dup
      // aa: getfield erg.qd2 I
      // ad: bipush 1
      // ae: isub
      // af: putfield erg.qd2 I
      // b2: bipush 1
      // b3: ireturn
   }

   private rdv sdh(t9d param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield xvd.yi0 Ljava/lang/Class;
      // 09: ldc n0_
      // 0b: nop
      // 0c: iload 4
      // 0e: ifeq 33
      // 11: if_acmpne 2c
      // 14: goto 1b
      // 17: invokestatic xvd.a (Loov;)Loov;
      // 1a: athrow
      // 1b: new n0_
      // 1e: dup
      // 1f: aload 1
      // 20: aload 2
      // 21: aload 3
      // 22: invokespecial n0_.<init> (Lt9d;Lmew;Lvt2;)V
      // 25: goto 48
      // 28: invokestatic xvd.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield xvd.yi0 Ljava/lang/Class;
      // 30: ldc co7
      // 32: nop
      // 33: if_acmpne 47
      // 36: new co7
      // 39: dup
      // 3a: aload 1
      // 3b: aload 2
      // 3c: aload 3
      // 3d: invokespecial co7.<init> (Lt9d;Lmew;Lvt2;)V
      // 40: goto 48
      // 43: invokestatic xvd.a (Loov;)Loov;
      // 46: athrow
      // 47: aconst_null
      // 48: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
