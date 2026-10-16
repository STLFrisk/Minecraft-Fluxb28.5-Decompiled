public class t5_$aw2 extends ed7 {
   public int p7d;
   public final t5_ g4w;

   public t5_$aw2(t5_ var1) {
      super(var1.f41, var1.dt7, var1.o1e, 80, var1.o1e - 32, 38);
      this.g4w = var1;
      this.p7d = -1;
   }

   @Override
   public int getSize() {
      return t5_.k3v().size();
   }

   @Override
   public void elementClicked(int var1, boolean var2, int var3, int var4) {
      this.p7d = var1;
      this.g4w.k4j();
      t5_.zpn(this.g4w).nrl(((t5_$ftc)t5_.k3v().get(t5_.w3d(this.g4w).p7d)).fol.toString());
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
      // 0a: getfield t5_$aw2.p7d I
      // 0d: if_icmpne 22
      // 10: goto 17
      // 13: invokestatic t5_$aw2.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic t5_$aw2.a (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   @Override
   public void drawBackground() {
   }

   private void ol1(int var1, int var2, gdz var3) {
      int var4 = var1 + 5;
      this.g4w.yaj(var4 - 1, var4 + 32, var2 - 1, -2039584);
      this.g4w.yaj(var4 - 1, var4 + 32, var2 + 32, -6250336);
      this.g4w.x3f(var4 - 1, var2 - 1, var2 + 32, -2039584);
      this.g4w.x3f(var4 + 32, var2 - 1, var2 + 32, -6250336);
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.gk_.l22().anl(var3);
      byte var5 = 32;
      byte var6 = 32;
      jom var7 = jom.yut();
      q3g var8 = var7.zuq();
      var8.ezr(7, gnl._r5);
      var8.g5o((double)(var4 + 0), (double)(var2 + 32), 0.0).h0a(0.0, 1.0).pzw();
      var8.g5o((double)(var4 + 32), (double)(var2 + 32), 0.0).h0a(1.0, 1.0).pzw();
      var8.g5o((double)(var4 + 32), (double)(var2 + 0), 0.0).h0a(1.0, 0.0).pzw();
      var8.g5o((double)(var4 + 0), (double)(var2 + 0), 0.0).h0a(0.0, 0.0).pzw();
      var7.q7g();
   }

   @Override
   public void drawSlot(int var1, int var2, int var3, int var4, int var5, int var6) {
      t5_$ftc var7 = (t5_$ftc)t5_.k3v().get(var1);
      this.ol1(var2, var3, var7.reg);
      this.g4w.fex.eh6(var7.d19, (float)(var2 + 32 + 10), (float)(var3 + 14), 16777215);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
