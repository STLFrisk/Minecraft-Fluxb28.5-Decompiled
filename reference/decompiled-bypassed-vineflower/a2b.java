public class a2b extends eur {
   public a2b() {
      this(0.0F, false);
   }

   public a2b(float var1, boolean var2) {
      int var3 = t9d.c();
      super(var1, 0.0F, 64, 32);
      if (var3 == 0) {
         try {
            if (var2) {
               return;
            }

            this.xwb = new tf8(this, 40, 16);
            this.xwb.q3x(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
            this.xwb.i50(-5.0F, 2.0F, 0.0F);
            this.hd2 = new tf8(this, 40, 16);
            this.hd2.hsi = true;
            this.hd2.q3x(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
            this.hd2.i50(5.0F, 2.0F, 0.0F);
            this.v3l = new tf8(this, 0, 16);
            this.v3l.q3x(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
            this.v3l.i50(-2.0F, 12.0F, 0.0F);
            this.zv5 = new tf8(this, 0, 16);
            this.zv5.hsi = true;
            this.zv5.q3x(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
         } catch (oov var4) {
            throw a(var4);
         }
      }

      this.zv5.i50(2.0F, 12.0F, 0.0F);
   }

   @Override
   public void v3g(g_3 param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: checkcast jzg
      // 0a: invokevirtual jzg.su3 ()I
      // 0d: iload 5
      // 0f: ifne 25
      // 12: bipush 1
      // 13: if_icmpne 28
      // 16: goto 1d
      // 19: invokestatic a2b.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto 25
      // 21: invokestatic a2b.a (Loov;)Loov;
      // 24: athrow
      // 25: goto 29
      // 28: bipush 0
      // 29: putfield a2b.bxg Z
      // 2c: aload 0
      // 2d: aload 1
      // 2e: fload 2
      // 2f: fload 3
      // 30: fload 4
      // 32: invokespecial eur.v3g (Lg_3;FFF)V
      // 35: return
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      super.ltd(var1, var2, var3, var4, var5, var6, var7);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
