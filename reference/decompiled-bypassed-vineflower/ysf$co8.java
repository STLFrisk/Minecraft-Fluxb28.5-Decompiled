import java.util.Random;

public class ysf$co8 implements ysf$rj4 {
   public erg lre;
   public ysf$czd gyi;
   public erg yhe;
   public ysf$czd w9y;

   public ysf$co8(u7m var1, ysf$czd var2, u7m var3, ysf$czd var4) {
      this.lre = new erg(var1);
      this.gyi = var2;
      this.yhe = new erg(var3);
      this.w9y = var4;
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
      // 08: getfield ysf$co8.gyi Lysf$czd;
      // 0b: iload 3
      // 0c: ifeq 24
      // 0f: ifnull 2a
      // 12: goto 19
      // 15: invokestatic ysf$co8.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield ysf$co8.gyi Lysf$czd;
      // 1d: goto 24
      // 20: invokestatic ysf$co8.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 2
      // 25: invokevirtual ysf$czd.l5_ (Ljava/util/Random;)I
      // 28: istore 4
      // 2a: bipush 1
      // 2b: istore 5
      // 2d: iload 3
      // 2e: ifeq 8d
      // 31: aload 0
      // 32: getfield ysf$co8.w9y Lysf$czd;
      // 35: ifnull 49
      // 38: goto 3f
      // 3b: invokestatic ysf$co8.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield ysf$co8.w9y Lysf$czd;
      // 43: aload 2
      // 44: invokevirtual ysf$czd.l5_ (Ljava/util/Random;)I
      // 47: istore 5
      // 49: aload 1
      // 4a: new xxb
      // 4d: dup
      // 4e: new erg
      // 51: dup
      // 52: aload 0
      // 53: getfield ysf$co8.lre Lerg;
      // 56: invokevirtual erg.gn1 ()Lu7m;
      // 59: iload 4
      // 5b: aload 0
      // 5c: getfield ysf$co8.lre Lerg;
      // 5f: invokevirtual erg.j6_ ()I
      // 62: invokespecial erg.<init> (Lu7m;II)V
      // 65: new erg
      // 68: dup
      // 69: getstatic xbr.cu7 Lu7m;
      // 6c: invokespecial erg.<init> (Lu7m;)V
      // 6f: new erg
      // 72: dup
      // 73: aload 0
      // 74: getfield ysf$co8.yhe Lerg;
      // 77: invokevirtual erg.gn1 ()Lu7m;
      // 7a: iload 5
      // 7c: aload 0
      // 7d: getfield ysf$co8.yhe Lerg;
      // 80: invokevirtual erg.j6_ ()I
      // 83: invokespecial erg.<init> (Lu7m;II)V
      // 86: invokespecial xxb.<init> (Lerg;Lerg;Lerg;)V
      // 89: invokevirtual skn.add (Ljava/lang/Object;)Z
      // 8c: pop
      // 8d: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
