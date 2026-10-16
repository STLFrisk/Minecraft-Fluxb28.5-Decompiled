import java.util.Random;

public class ysf$uow implements ysf$rj4 {
   public erg wb2;
   public ysf$czd lhg;

   public ysf$uow(u7m var1, ysf$czd var2) {
      this.wb2 = new erg(var1);
      this.lhg = var2;
   }

   @Override
   public void mu_(skn param1, Random param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: bipush 1
      // 05: istore 4
      // 07: aload 0
      // 08: getfield ysf$uow.lhg Lysf$czd;
      // 0b: iload 3
      // 0c: ifeq 24
      // 0f: ifnull 2a
      // 12: goto 19
      // 15: invokestatic ysf$uow.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield ysf$uow.lhg Lysf$czd;
      // 1d: goto 24
      // 20: invokestatic ysf$uow.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 2
      // 25: invokevirtual ysf$czd.l5_ (Ljava/util/Random;)I
      // 28: istore 4
      // 2a: new erg
      // 2d: dup
      // 2e: getstatic xbr.cu7 Lu7m;
      // 31: iload 4
      // 33: bipush 0
      // 34: invokespecial erg.<init> (Lu7m;II)V
      // 37: astore 5
      // 39: new erg
      // 3c: dup
      // 3d: aload 0
      // 3e: getfield ysf$uow.wb2 Lerg;
      // 41: invokevirtual erg.gn1 ()Lu7m;
      // 44: bipush 1
      // 45: aload 0
      // 46: getfield ysf$uow.wb2 Lerg;
      // 49: invokevirtual erg.j6_ ()I
      // 4c: invokespecial erg.<init> (Lu7m;II)V
      // 4f: astore 6
      // 51: aload 2
      // 52: aload 6
      // 54: bipush 5
      // 55: aload 2
      // 56: bipush 15
      // 58: invokevirtual java/util/Random.nextInt (I)I
      // 5b: iadd
      // 5c: invokestatic hc0.xm8 (Ljava/util/Random;Lerg;I)Lerg;
      // 5f: astore 6
      // 61: aload 1
      // 62: new xxb
      // 65: dup
      // 66: aload 5
      // 68: aload 6
      // 6a: invokespecial xxb.<init> (Lerg;Lerg;)V
      // 6d: invokevirtual skn.add (Ljava/lang/Object;)Z
      // 70: pop
      // 71: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
