public class sl_ implements gnj {
   public sl_(d6z var1) {
      this.jqp = var1;
   }

   public void m7p(dge param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 1
      // 06: invokevirtual dge.h5u ()Z
      // 09: iload 9
      // 0b: ifeq 2f
      // 0e: ifne 5b
      // 11: goto 18
      // 14: invokestatic sl_.a (Loov;)Loov;
      // 17: athrow
      // 18: fconst_1
      // 19: fconst_1
      // 1a: fconst_1
      // 1b: fconst_1
      // 1c: invokestatic hzu.wn0 (FFFF)V
      // 1f: invokestatic hzu.j6u ()V
      // 22: invokestatic hzu.spd ()V
      // 25: sipush 770
      // 28: goto 2f
      // 2b: invokestatic sl_.a (Loov;)Loov;
      // 2e: athrow
      // 2f: sipush 771
      // 32: invokestatic hzu.ru7 (II)V
      // 35: aload 0
      // 36: getfield sl_.noz Lg6r;
      // 39: aload 0
      // 3a: getfield sl_.jqp Ld6z;
      // 3d: invokevirtual d6z.fy4 ()Lg6r;
      // 40: invokevirtual g6r.jxr (Lg6r;)V
      // 43: aload 0
      // 44: getfield sl_.noz Lg6r;
      // 47: aload 1
      // 48: fload 2
      // 49: fload 3
      // 4a: fload 5
      // 4c: fload 6
      // 4e: fload 7
      // 50: fload 8
      // 52: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 55: invokestatic hzu.ux6 ()V
      // 58: invokestatic hzu.piz ()V
      // 5b: return
   }

   @Override
   public boolean shouldCombineTextures() {
      return true;
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.m7p((dge)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
