public class fkf$r79 {
   public _aj bv5;
   public float fcm;
   public float rbx;
   public final fkf a07;

   public fkf$r79(fkf var1, _aj var2) {
      this.a07 = var1;
      this.bv5 = var2;
   }

   public void tmz(float var1, float var2) {
      jsr.rs4.fzf(this.bv5.name(), var1 + 25.0F, var2 + 6.5F, z7e.a2_.k0y);
      jsr.mxa.fzf(this.bv5.h2b, var1 + 10.0F, var2 + 8.0F, z7e.a2_.k0y);
   }

   public void g2i(float var1, float var2) {
      this.fcm = var1;
      this.rbx = var2;
      jsr.rs4.fzf(this.bv5.name(), var1 + 25.0F, var2 + 6.5F, z7e.kks.k0y);
      jsr.mxa.fzf(this.bv5.h2b, var1 + 10.0F, var2 + 8.0F, z7e.kks.k0y);
   }

   public void x5_(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield fkf$r79.a07 Lfkf;
      // 08: iload 3
      // 09: ifeq 46
      // 0c: iload 1
      // 0d: i2f
      // 0e: iload 2
      // 0f: i2f
      // 10: aload 0
      // 11: getfield fkf$r79.fcm F
      // 14: ldc 0.5
      // 16: nop
      // 17: fsub
      // 18: aload 0
      // 19: getfield fkf$r79.rbx F
      // 1c: aload 0
      // 1d: getfield fkf$r79.fcm F
      // 20: ldc 99.5
      // 22: nop
      // 23: fadd
      // 24: aload 0
      // 25: getfield fkf$r79.rbx F
      // 28: ldc 25.0
      // 2a: nop
      // 2b: fadd
      // 2c: invokevirtual fkf.imv (FFFFFF)Z
      // 2f: ifeq ae
      // 32: goto 39
      // 35: invokestatic fkf$r79.a (Loov;)Loov;
      // 38: athrow
      // 39: getstatic zwr.qkk Lzwr;
      // 3c: invokevirtual zwr.ch4 ()Lfkf;
      // 3f: goto 46
      // 42: invokestatic fkf$r79.a (Loov;)Loov;
      // 45: athrow
      // 46: iload 3
      // 47: ifeq 65
      // 4a: getfield fkf.h6q Lfkf$r79;
      // 4d: aload 0
      // 4e: if_acmpeq ae
      // 51: goto 58
      // 54: invokestatic fkf$r79.a (Loov;)Loov;
      // 57: athrow
      // 58: getstatic zwr.qkk Lzwr;
      // 5b: invokevirtual zwr.ch4 ()Lfkf;
      // 5e: goto 65
      // 61: invokestatic fkf$r79.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: putfield fkf.h6q Lfkf$r79;
      // 69: getstatic kgt.vuo Ljava/util/ArrayList;
      // 6c: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 6f: astore 4
      // 71: aload 4
      // 73: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 78: ifeq ae
      // 7b: aload 4
      // 7d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 82: checkcast ar7
      // 85: astore 5
      // 87: aload 5
      // 89: aload 5
      // 8b: invokevirtual ar7.klu ()Z
      // 8e: ifeq 9b
      // 91: ldc 218.0
      // 93: nop
      // 94: goto 9e
      // 97: invokestatic fkf$r79.a (Loov;)Loov;
      // 9a: athrow
      // 9b: ldc 222.0
      // 9d: nop
      // 9e: putfield ar7.l7d F
      // a1: aload 5
      // a3: getfield ar7.abe Llva;
      // a6: fconst_0
      // a7: invokevirtual lva.lna (F)V
      // aa: iload 3
      // ab: ifne 71
      // ae: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
