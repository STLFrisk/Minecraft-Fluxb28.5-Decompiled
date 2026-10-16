public class hc9 extends cjm {
   public hc9(gse var1, float var2) {
      this.ki9 = var1;
      this.gcq = var1.oay;
      this.guh = var2;
      this.k23(2);
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: aload 0
      // 06: getfield hc9.gcq Lt9d;
      // 09: aload 0
      // 0a: getfield hc9.ki9 Lgse;
      // 0d: aload 0
      // 0e: getfield hc9.guh F
      // 11: f2d
      // 12: invokevirtual t9d.a_q (Li2h;D)Lha9;
      // 15: putfield hc9.d77 Lha9;
      // 18: aload 0
      // 19: iload 1
      // 1a: ifeq 33
      // 1d: getfield hc9.d77 Lha9;
      // 20: ifnonnull 32
      // 23: goto 2a
      // 26: invokestatic hc9.a (Loov;)Loov;
      // 29: athrow
      // 2a: bipush 0
      // 2b: goto 3a
      // 2e: invokestatic hc9.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: aload 0
      // 34: getfield hc9.d77 Lha9;
      // 37: invokespecial hc9.t93 (Lha9;)Z
      // 3a: ireturn
   }

   @Override
   public boolean wh3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hc9.d77 Lha9;
      // 08: invokevirtual ha9.gzr ()Z
      // 0b: iload 1
      // 0c: ifne 37
      // 0f: ifne 21
      // 12: goto 19
      // 15: invokestatic hc9.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 0
      // 1a: goto 81
      // 1d: invokestatic hc9.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield hc9.ki9 Lgse;
      // 25: aload 0
      // 26: getfield hc9.d77 Lha9;
      // 29: invokevirtual gse.wxg (Li2h;)D
      // 2c: aload 0
      // 2d: getfield hc9.guh F
      // 30: aload 0
      // 31: getfield hc9.guh F
      // 34: fmul
      // 35: f2d
      // 36: dcmpl
      // 37: iload 1
      // 38: ifne 51
      // 3b: ifle 4d
      // 3e: goto 45
      // 41: invokestatic hc9.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 0
      // 46: goto 81
      // 49: invokestatic hc9.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield hc9.d9q I
      // 51: iload 1
      // 52: ifne 6e
      // 55: ifle 80
      // 58: goto 5f
      // 5b: invokestatic hc9.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: aload 0
      // 61: getfield hc9.d77 Lha9;
      // 64: invokespecial hc9.t93 (Lha9;)Z
      // 67: goto 6e
      // 6a: invokestatic hc9.a (Loov;)Loov;
      // 6d: athrow
      // 6e: iload 1
      // 6f: ifne 7d
      // 72: ifeq 80
      // 75: goto 7c
      // 78: invokestatic hc9.a (Loov;)Loov;
      // 7b: athrow
      // 7c: bipush 1
      // 7d: goto 81
      // 80: bipush 0
      // 81: ireturn
   }

   @Override
   public void mnp() {
      this.ki9.au5(true);
      this.d9q = 40 + this.ki9.mbr().nextInt(40);
   }

   @Override
   public void zly() {
      this.ki9.au5(false);
      this.d77 = null;
   }

   @Override
   public void iad() {
      this.ki9.ph8().c2i(this.d77.o2v, this.d77.kfp + (double)this.d77.c5y(), this.d77.vbd, 10.0F, (float)this.ki9.d1r());
      this.d9q--;
   }

   private boolean t93(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield ha9.up_ Ljnq;
      // 08: invokevirtual jnq.dxs ()Lerg;
      // 0b: astore 3
      // 0c: aload 3
      // 0d: ifnonnull 18
      // 10: bipush 0
      // 11: goto 4e
      // 14: invokestatic hc9.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield hc9.ki9 Lgse;
      // 1c: iload 2
      // 1d: ifeq 4a
      // 20: invokevirtual gse.j1j ()Z
      // 23: ifne 46
      // 26: goto 2d
      // 29: invokestatic hc9.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 3
      // 2e: invokevirtual erg.gn1 ()Lu7m;
      // 31: getstatic xbr.pl_ Lu7m;
      // 34: if_acmpne 46
      // 37: goto 3e
      // 3a: invokestatic hc9.a (Loov;)Loov;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 4e
      // 42: invokestatic hc9.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: getfield hc9.ki9 Lgse;
      // 4a: aload 3
      // 4b: invokevirtual gse._cv (Lerg;)Z
      // 4e: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
