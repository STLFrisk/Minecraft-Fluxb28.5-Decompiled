public class wir$_cj extends ed7 {
   public int v9j;
   public final wir dfe;

   public wir$_cj(wir var1) {
      super(var1.f41, var1.dt7, var1.o1e, 80, var1.o1e - 37, 24);
      this.dfe = var1;
      this.v9j = -1;
   }

   private void ae7(int var1, int var2, u7m var3, int var4) {
      this.f5e(var1 + 1, var2 + 1);
      hzu.ixc();
      qpm.gdb();
      this.dfe.vs5.s3g(new erg(var3, 1, var4), (float)(var1 + 2), (float)(var2 + 2));
      qpm.cng();
      hzu.eiq();
   }

   private void f5e(int var1, int var2) {
      this.z8n(var1, var2, 0, 0);
   }

   private void z8n(int var1, int var2, int var3, int var4) {
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.gk_.l22().anl(b0t.p24);
      float var5 = 0.0078125F;
      float var6 = 0.0078125F;
      byte var7 = 18;
      byte var8 = 18;
      jom var9 = jom.yut();
      q3g var10 = var9.zuq();
      var10.ezr(7, gnl._r5);
      var10.g5o((double)(var1 + 0), (double)(var2 + 18), (double)this.dfe.o3s)
         .h0a((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F))
         .pzw();
      var10.g5o((double)(var1 + 18), (double)(var2 + 18), (double)this.dfe.o3s)
         .h0a((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F))
         .pzw();
      var10.g5o((double)(var1 + 18), (double)(var2 + 0), (double)this.dfe.o3s)
         .h0a((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F))
         .pzw();
      var10.g5o((double)(var1 + 0), (double)(var2 + 0), (double)this.dfe.o3s)
         .h0a((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F))
         .pzw();
      var9.q7g();
   }

   @Override
   public int getSize() {
      return wir.khl().size();
   }

   @Override
   public void elementClicked(int var1, boolean var2, int var3, int var4) {
      this.v9j = var1;
      this.dfe.e5x();
      wir.djs(this.dfe).nrl(((wir$a8n)wir.khl().get(wir.kaf(this.dfe).v9j)).i34);
   }

   @Override
   public boolean isSelected(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifeq 1f
      // 09: aload 0
      // 0a: getfield wir$_cj.v9j I
      // 0d: if_icmpne 22
      // 10: goto 17
      // 13: invokestatic wir$_cj.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic wir$_cj.a (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   @Override
   public void drawBackground() {
   }

   @Override
   public void drawSlot(int var1, int var2, int var3, int var4, int var5, int var6) {
      wir$a8n var7 = (wir$a8n)wir.khl().get(var1);
      this.ae7(var2, var3, var7.xx5, var7.ap0);
      this.dfe.fex.eh6(var7.ty6, (float)(var2 + 18 + 5), (float)(var3 + 6), 16777215);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
