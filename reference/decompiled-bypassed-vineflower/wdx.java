public class wdx {
   public wdx(mew var1, int var2, int var3, int var4) {
      this(var1, utn(var2, var3), var4);
   }

   private static vt2 utn(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: iload 0
      // 05: iload 2
      // 06: ifeq 1e
      // 09: ifge 1d
      // 0c: goto 13
      // 0f: invokestatic wdx.a (Loov;)Loov;
      // 12: athrow
      // 13: getstatic vt2.te4 Lvt2;
      // 16: goto 47
      // 19: invokestatic wdx.a (Loov;)Loov;
      // 1c: athrow
      // 1d: iload 0
      // 1e: iload 2
      // 1f: ifeq 37
      // 22: ifle 36
      // 25: goto 2c
      // 28: invokestatic wdx.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getstatic vt2.zk4 Lvt2;
      // 2f: goto 47
      // 32: invokestatic wdx.a (Loov;)Loov;
      // 35: athrow
      // 36: iload 1
      // 37: ifge 44
      // 3a: getstatic vt2.z9q Lvt2;
      // 3d: goto 47
      // 40: invokestatic wdx.a (Loov;)Loov;
      // 43: athrow
      // 44: getstatic vt2.mxp Lvt2;
      // 47: areturn
   }

   public wdx(mew var1, vt2 var2, int var3) {
      this.ohs = var1;
      this.d1b = var2;
      this.ibp = var1.offset(var2, 2);
      this.pk4 = var3;
   }

   public int v_6(int var1, int var2, int var3) {
      return (int)this.ohs.p4e((double)var1, (double)var2, (double)var3);
   }

   public int kjj(mew var1) {
      return (int)var1.t0u(this._d5());
   }

   public int qhc(mew var1) {
      return (int)this.ibp.t0u(var1);
   }

   public boolean d6z(mew var1) {
      int var3 = var1.getX() - this.ohs.getX();
      int var10000 = t9d.b();
      int var4 = var1.getZ() - this.ohs.getY();
      int var2 = var10000;

      try {
         var10000 = var3 * this.d1b.n67() + var4 * this.d1b.ozy();
         if (var2 == 0) {
            return (boolean)var10000;
         }

         if (var10000 >= 0) {
            return (boolean)1;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return (boolean)0;
   }

   public void hek() {
      this.vmd = 0;
   }

   public void ikc() {
      this.vmd++;
   }

   public int coz() {
      return this.vmd;
   }

   public mew _d5() {
      return this.ohs;
   }

   public mew mwv() {
      return this.ibp;
   }

   public int xd8() {
      return this.d1b.n67() * 2;
   }

   public int xu8() {
      return this.d1b.ozy() * 2;
   }

   public int ebj() {
      return this.pk4;
   }

   public void zt0(int var1) {
      this.pk4 = var1;
   }

   public boolean ker() {
      return this.qk6;
   }

   public void ycl(boolean var1) {
      this.qk6 = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
