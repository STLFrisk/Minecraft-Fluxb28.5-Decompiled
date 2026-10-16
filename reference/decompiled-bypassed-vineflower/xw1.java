import java.util.Random;

public class xw1 implements xcy {
   private final Random a_1 = new Random();
   private final c05 jma;
   private jp4 g31;
   private int ooz = 100;

   public xw1(c05 var1) {
      this.jma = var1;
   }

   @Override
   public void _21() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield xw1.jma Lc05;
      // 08: invokevirtual c05.e8o ()Lxw1$ial;
      // 0b: astore 2
      // 0c: aload 0
      // 0d: getfield xw1.g31 Ljp4;
      // 10: iload 1
      // 11: ifeq bb
      // 14: ifnull ac
      // 17: goto 1e
      // 1a: invokestatic xw1.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 2
      // 1f: invokevirtual xw1$ial.a1v ()Lgdz;
      // 22: aload 0
      // 23: getfield xw1.g31 Ljp4;
      // 26: invokeinterface jp4.nbp ()Lgdz; 1
      // 2b: invokevirtual gdz.equals (Ljava/lang/Object;)Z
      // 2e: iload 1
      // 2f: ifeq 83
      // 32: goto 39
      // 35: invokestatic xw1.a (Loov;)Loov;
      // 38: athrow
      // 39: ifne 6a
      // 3c: goto 43
      // 3f: invokestatic xw1.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: getfield xw1.jma Lc05;
      // 47: invokevirtual c05.yp9 ()Ldbu;
      // 4a: aload 0
      // 4b: getfield xw1.g31 Ljp4;
      // 4e: invokevirtual dbu.o81 (Ljp4;)V
      // 51: aload 0
      // 52: aload 0
      // 53: getfield xw1.a_1 Ljava/util/Random;
      // 56: bipush 0
      // 57: aload 2
      // 58: invokevirtual xw1$ial.z24 ()I
      // 5b: bipush 2
      // 5c: idiv
      // 5d: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 60: putfield xw1.ooz I
      // 63: goto 6a
      // 66: invokestatic xw1.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 0
      // 6b: iload 1
      // 6c: ifeq ad
      // 6f: getfield xw1.jma Lc05;
      // 72: invokevirtual c05.yp9 ()Ldbu;
      // 75: aload 0
      // 76: getfield xw1.g31 Ljp4;
      // 79: invokevirtual dbu.pxc (Ljp4;)Z
      // 7c: goto 83
      // 7f: invokestatic xw1.a (Loov;)Loov;
      // 82: athrow
      // 83: ifne ac
      // 86: aload 0
      // 87: aconst_null
      // 88: putfield xw1.g31 Ljp4;
      // 8b: aload 0
      // 8c: aload 0
      // 8d: getfield xw1.a_1 Ljava/util/Random;
      // 90: aload 2
      // 91: invokevirtual xw1$ial.z24 ()I
      // 94: aload 2
      // 95: invokevirtual xw1$ial.clm ()I
      // 98: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 9b: aload 0
      // 9c: getfield xw1.ooz I
      // 9f: invokestatic java/lang/Math.min (II)I
      // a2: putfield xw1.ooz I
      // a5: goto ac
      // a8: invokestatic xw1.a (Loov;)Loov;
      // ab: athrow
      // ac: aload 0
      // ad: iload 1
      // ae: ifeq bf
      // b1: getfield xw1.g31 Ljp4;
      // b4: goto bb
      // b7: invokestatic xw1.a (Loov;)Loov;
      // ba: athrow
      // bb: ifnonnull e3
      // be: aload 0
      // bf: iload 1
      // c0: ifeq df
      // c3: dup
      // c4: getfield xw1.ooz I
      // c7: dup_x1
      // c8: bipush 1
      // c9: isub
      // ca: putfield xw1.ooz I
      // cd: ifgt e3
      // d0: goto d7
      // d3: invokestatic xw1.a (Loov;)Loov;
      // d6: athrow
      // d7: aload 0
      // d8: goto df
      // db: invokestatic xw1.a (Loov;)Loov;
      // de: athrow
      // df: aload 2
      // e0: invokevirtual xw1.jjv (Lxw1$ial;)V
      // e3: return
   }

   public void jjv(xw1$ial var1) {
      this.g31 = vs1.icz(var1.a1v());
      this.jma.yp9().mak(this.g31);
      this.ooz = Integer.MAX_VALUE;
   }

   public void jnm() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 31
      // 09: getfield xw1.g31 Ljp4;
      // 0c: ifnull 35
      // 0f: goto 16
      // 12: invokestatic xw1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield xw1.jma Lc05;
      // 1a: invokevirtual c05.yp9 ()Ldbu;
      // 1d: aload 0
      // 1e: getfield xw1.g31 Ljp4;
      // 21: invokevirtual dbu.o81 (Ljp4;)V
      // 24: aload 0
      // 25: aconst_null
      // 26: putfield xw1.g31 Ljp4;
      // 29: aload 0
      // 2a: goto 31
      // 2d: invokestatic xw1.a (Loov;)Loov;
      // 30: athrow
      // 31: bipush 0
      // 32: putfield xw1.ooz I
      // 35: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
