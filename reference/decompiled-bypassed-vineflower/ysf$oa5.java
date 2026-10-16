import java.util.Random;

public class ysf$oa5 implements ysf$rj4 {
   public erg wo5;
   public ysf$czd uvu;

   public ysf$oa5(u7m var1, ysf$czd var2) {
      this.wo5 = new erg(var1);
      this.uvu = var2;
   }

   public ysf$oa5(erg var1, ysf$czd var2) {
      this.wo5 = var1;
      this.uvu = var2;
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
      // 08: getfield ysf$oa5.uvu Lysf$czd;
      // 0b: iload 3
      // 0c: ifeq 24
      // 0f: ifnull 2a
      // 12: goto 19
      // 15: invokestatic ysf$oa5.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield ysf$oa5.uvu Lysf$czd;
      // 1d: goto 24
      // 20: invokestatic ysf$oa5.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 2
      // 25: invokevirtual ysf$czd.l5_ (Ljava/util/Random;)I
      // 28: istore 4
      // 2a: iload 4
      // 2c: ifge 5b
      // 2f: new erg
      // 32: dup
      // 33: getstatic xbr.cu7 Lu7m;
      // 36: bipush 1
      // 37: bipush 0
      // 38: invokespecial erg.<init> (Lu7m;II)V
      // 3b: astore 5
      // 3d: new erg
      // 40: dup
      // 41: aload 0
      // 42: getfield ysf$oa5.wo5 Lerg;
      // 45: invokevirtual erg.gn1 ()Lu7m;
      // 48: iload 4
      // 4a: ineg
      // 4b: aload 0
      // 4c: getfield ysf$oa5.wo5 Lerg;
      // 4f: invokevirtual erg.j6_ ()I
      // 52: invokespecial erg.<init> (Lu7m;II)V
      // 55: astore 6
      // 57: iload 3
      // 58: ifne 82
      // 5b: new erg
      // 5e: dup
      // 5f: getstatic xbr.cu7 Lu7m;
      // 62: iload 4
      // 64: bipush 0
      // 65: invokespecial erg.<init> (Lu7m;II)V
      // 68: astore 5
      // 6a: new erg
      // 6d: dup
      // 6e: aload 0
      // 6f: getfield ysf$oa5.wo5 Lerg;
      // 72: invokevirtual erg.gn1 ()Lu7m;
      // 75: bipush 1
      // 76: aload 0
      // 77: getfield ysf$oa5.wo5 Lerg;
      // 7a: invokevirtual erg.j6_ ()I
      // 7d: invokespecial erg.<init> (Lu7m;II)V
      // 80: astore 6
      // 82: aload 1
      // 83: new xxb
      // 86: dup
      // 87: aload 5
      // 89: aload 6
      // 8b: invokespecial xxb.<init> (Lerg;Lerg;)V
      // 8e: invokevirtual skn.add (Ljava/lang/Object;)Z
      // 91: pop
      // 92: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
