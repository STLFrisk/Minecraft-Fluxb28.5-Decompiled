import java.util.Random;

public class rrw extends e0x {
   public rrw() {
      this(p3y.nc7);
   }

   public rrw(p3y var1) {
      this(var1, var1.up9());
   }

   public rrw(p3y var1, _mi var2) {
      super(var1, var2);
      this._p_(true);
      float var3 = 0.2F;
      this.xl4(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 3.0F, 0.5F + var3);
      this.i3l(uja.qqf);
   }

   @Override
   public boolean ctq(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial e0x.ctq (Lt9d;Lmew;)Z
      // 0a: iload 3
      // 0b: ifeq 30
      // 0e: ifeq 42
      // 11: goto 18
      // 14: invokestatic rrw.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokevirtual mew.eve ()Lmew;
      // 1e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 21: invokeinterface zfz.r_y ()Le0x; 1
      // 26: invokevirtual rrw.ib4 (Le0x;)Z
      // 29: goto 30
      // 2c: invokestatic rrw.b (Loov;)Loov;
      // 2f: athrow
      // 30: iload 3
      // 31: ifeq 3f
      // 34: ifeq 42
      // 37: goto 3e
      // 3a: invokestatic rrw.b (Loov;)Loov;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 43
      // 42: bipush 0
      // 43: ireturn
   }

   public boolean ib4(e0x param1) {
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
      // 05: getstatic ox_.l11 Lx82;
      // 08: iload 2
      // 09: ifeq 21
      // 0c: if_acmpeq 3d
      // 0f: goto 16
      // 12: invokestatic rrw.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getstatic ox_.kqk Le0x;
      // 1a: goto 21
      // 1d: invokestatic rrw.b (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 3a
      // 25: if_acmpeq 3d
      // 28: goto 2f
      // 2b: invokestatic rrw.b (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: getstatic ox_._5i Le0x;
      // 33: goto 3a
      // 36: invokestatic rrw.b (Loov;)Loov;
      // 39: athrow
      // 3a: if_acmpne 45
      // 3d: bipush 1
      // 3e: goto 46
      // 41: invokestatic rrw.b (Loov;)Loov;
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
   }

   @Override
   public void z3l(OpaquePredicate var1, mew var2, zfz var3, e0x var4) {
      super.z3l(var1, var2, var3, var4);
      this.swr(var1, var2, var3);
   }

   @Override
   public void zvy(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
      this.swr(var1, var2, var3);
   }

   public void swr(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: invokevirtual rrw._h0 (Lt9d;Lmew;Lzfz;)Z
      // 0c: iload 4
      // 0e: ifeq 36
      // 11: ifne 37
      // 14: goto 1b
      // 17: invokestatic rrw.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: aload 2
      // 1e: aload 3
      // 1f: bipush 0
      // 20: invokevirtual rrw.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 23: aload 1
      // 24: aload 2
      // 25: getstatic ox_.ibw Le0x;
      // 28: invokevirtual e0x.l4i ()Lzfz;
      // 2b: bipush 3
      // 2c: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 2f: goto 36
      // 32: invokestatic rrw.b (Loov;)Loov;
      // 35: athrow
      // 36: pop
      // 37: return
   }

   public boolean _h0(OpaquePredicate var1, mew var2, zfz var3) {
      return this.ib4(var1.getBlockState(var2.eve()).r_y());
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   private static oov b(oov var0) {
      return var0;
   }
}
