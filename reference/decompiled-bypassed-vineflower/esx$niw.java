public class esx$niw extends esx {
   public esx$niw() {
      this.y8l(this._8_.c32().zvi(t4h, 0));
   }

   @Override
   public void z3l(t9d param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual mew.eve ()Lmew;
      // 0a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0d: invokeinterface zfz.r_y ()Le0x; 1
      // 12: invokevirtual e0x.p1r ()Lp3y;
      // 15: invokevirtual p3y.gk6 ()Z
      // 18: iload 5
      // 1a: ifeq 3b
      // 1d: ifne 3c
      // 20: goto 27
      // 23: invokestatic esx$niw.b (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: aload 2
      // 2a: aload 3
      // 2b: bipush 0
      // 2c: invokevirtual esx$niw.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 2f: aload 1
      // 30: aload 2
      // 31: invokevirtual t9d.i6x (Lmew;)Z
      // 34: goto 3b
      // 37: invokestatic esx$niw.b (Loov;)Loov;
      // 3a: athrow
      // 3b: pop
      // 3c: aload 0
      // 3d: aload 1
      // 3e: aload 2
      // 3f: aload 3
      // 40: aload 4
      // 42: invokespecial esx.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // 45: return
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(t4h, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(t4h);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{t4h});
   }

   private static oov b(oov var0) {
      return var0;
   }
}
