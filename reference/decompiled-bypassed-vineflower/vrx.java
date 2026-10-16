public class vrx {
   public final rsi k0y;
   public int zfh;
   public int nuz;
   public int b0m;

   public vrx(rsi var1, int var2, int var3, int var4) {
      this.k0y = var1;
      this.db9 = var2;
      this.nuz = var3;
      this.b0m = var4;
   }

   public void _0c(erg param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 14
      // 09: ifnull 5d
      // 0c: goto 13
      // 0f: invokestatic vrx.b (Loov;)Loov;
      // 12: athrow
      // 13: aload 2
      // 14: iload 3
      // 15: ifne 23
      // 18: ifnull 5d
      // 1b: goto 22
      // 1e: invokestatic vrx.b (Loov;)Loov;
      // 21: athrow
      // 22: aload 1
      // 23: iload 3
      // 24: ifne 40
      // 27: invokevirtual erg.gn1 ()Lu7m;
      // 2a: aload 2
      // 2b: invokevirtual erg.gn1 ()Lu7m;
      // 2e: if_acmpne 5d
      // 31: goto 38
      // 34: invokestatic vrx.b (Loov;)Loov;
      // 37: athrow
      // 38: aload 2
      // 39: goto 40
      // 3c: invokestatic vrx.b (Loov;)Loov;
      // 3f: athrow
      // 40: getfield erg.qd2 I
      // 43: aload 1
      // 44: getfield erg.qd2 I
      // 47: isub
      // 48: istore 4
      // 4a: iload 4
      // 4c: ifle 5d
      // 4f: aload 0
      // 50: aload 1
      // 51: iload 4
      // 53: invokevirtual vrx.f2o (Lerg;I)V
      // 56: goto 5d
      // 59: invokestatic vrx.b (Loov;)Loov;
      // 5c: athrow
      // 5d: return
   }

   public void f2o(erg var1, int var2) {
   }

   public void erq(erg var1) {
   }

   public void g1d(ha9 var1, erg var2) {
      this.vc1();
   }

   public boolean xvl(erg var1) {
      return true;
   }

   public erg x4s() {
      return this.k0y.ibn(this.db9);
   }

   public boolean hf8() {
      try {
         if (this.x4s() != null) {
            return true;
         }
      } catch (oov var1) {
         throw b(var1);
      }

      return false;
   }

   public void yn7(erg var1) {
      this.k0y.cxl(this.db9, var1);
      this.vc1();
   }

   public void vc1() {
      this.k0y.r5t();
   }

   public int c1r() {
      return this.k0y.v6l();
   }

   public int n29(erg var1) {
      return this.c1r();
   }

   public String i8b() {
      return null;
   }

   public erg xtx(int var1) {
      return this.k0y.afc(this.db9, var1);
   }

   public boolean a6m(rsi param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 0
      // 06: getfield vrx.k0y Lrsi;
      // 09: if_acmpne 31
      // 0c: iload 2
      // 0d: iload 3
      // 0e: ifeq 2e
      // 11: goto 18
      // 14: invokestatic vrx.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield vrx.db9 I
      // 1c: if_icmpne 31
      // 1f: goto 26
      // 22: invokestatic vrx.b (Loov;)Loov;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2e
      // 2a: invokestatic vrx.b (Loov;)Loov;
      // 2d: athrow
      // 2e: goto 32
      // 31: bipush 0
      // 32: ireturn
   }

   public boolean fg6(ha9 var1) {
      return true;
   }

   public boolean rt1() {
      return true;
   }

   private static oov b(oov var0) {
      return var0;
   }
}
