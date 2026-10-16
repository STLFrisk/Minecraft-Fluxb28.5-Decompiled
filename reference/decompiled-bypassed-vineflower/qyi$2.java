public class qyi$2 extends vrx {
   public final zfo mto;
   public final qyi gse;

   public qyi$2(qyi var1, rsi var2, int var3, int var4, int var5, zfo var6) {
      super(var2, var3, var4, var5);
      this.gse = var1;
      this.mto = var6;
   }

   @Override
   public boolean xvl(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial vrx.xvl (Lerg;)Z
      // 09: iload 2
      // 0a: ifeq 25
      // 0d: ifeq 53
      // 10: goto 17
      // 13: invokestatic qyi$2.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield qyi$2.mto Lzfo;
      // 1b: invokevirtual zfo.sp4 ()Z
      // 1e: goto 25
      // 21: invokestatic qyi$2.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 2
      // 26: ifeq 41
      // 29: ifeq 53
      // 2c: goto 33
      // 2f: invokestatic qyi$2.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 1
      // 34: invokevirtual erg.gn1 ()Lu7m;
      // 37: invokestatic zfo._as (Lu7m;)Z
      // 3a: goto 41
      // 3d: invokestatic qyi$2.a (Loov;)Loov;
      // 40: athrow
      // 41: iload 2
      // 42: ifeq 50
      // 45: ifeq 53
      // 48: goto 4f
      // 4b: invokestatic qyi$2.a (Loov;)Loov;
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   @Override
   public boolean rt1() {
      return this.mto.sp4();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
