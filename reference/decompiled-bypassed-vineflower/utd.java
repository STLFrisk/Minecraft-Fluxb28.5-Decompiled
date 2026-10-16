import java.util.Random;

public class utd extends gyu {
   public utd(int var1) {
      super(var1);
      this.c1d.clear();
      this.ke4 = ox_.vd0.l4i();
      this.kro = ox_.vd0.l4i();
      this.dmv.c10 = -999;
      this.dmv.pcg = 2;
      this.dmv.oui = 50;
      this.dmv.yf6 = 10;
      this.c1d.clear();
   }

   @Override
   public void u0r(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: invokespecial gyu.u0r (Lt9d;Ljava/util/Random;Lmew;)V
      // 0c: aload 2
      // 0d: sipush 1000
      // 10: invokevirtual java/util/Random.nextInt (I)I
      // 13: iload 4
      // 15: ifeq 32
      // 18: ifne 60
      // 1b: goto 22
      // 1e: invokestatic utd.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 2
      // 23: bipush 16
      // 25: invokevirtual java/util/Random.nextInt (I)I
      // 28: bipush 8
      // 2a: iadd
      // 2b: goto 32
      // 2e: invokestatic utd.a (Loov;)Loov;
      // 31: athrow
      // 32: istore 5
      // 34: aload 2
      // 35: bipush 16
      // 37: invokevirtual java/util/Random.nextInt (I)I
      // 3a: bipush 8
      // 3c: iadd
      // 3d: istore 6
      // 3f: aload 1
      // 40: aload 3
      // 41: iload 5
      // 43: bipush 0
      // 44: iload 6
      // 46: invokevirtual mew.ec4 (III)Lmew;
      // 49: invokevirtual t9d.p9y (Lmew;)Lmew;
      // 4c: invokevirtual mew.nuv ()Lmew;
      // 4f: astore 7
      // 51: new al4
      // 54: dup
      // 55: invokespecial al4.<init> ()V
      // 58: aload 1
      // 59: aload 2
      // 5a: aload 7
      // 5c: invokevirtual al4.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 5f: pop
      // 60: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
