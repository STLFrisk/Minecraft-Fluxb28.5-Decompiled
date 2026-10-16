import java.util.Random;

public class y3g extends cdu {
   @Override
   public boolean v3g(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 3
      // 07: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0a: invokeinterface zfz.r_y ()Le0x; 1
      // 0f: dup
      // 10: astore 5
      // 12: invokevirtual e0x.p1r ()Lp3y;
      // 15: getstatic p3y.cei Lp3y;
      // 18: if_acmpeq 26
      // 1b: aload 5
      // 1d: invokevirtual e0x.p1r ()Lp3y;
      // 20: getstatic p3y.hh1 Lp3y;
      // 23: if_acmpne 4a
      // 26: aload 3
      // 27: invokevirtual mew.getY ()I
      // 2a: iload 4
      // 2c: ifne 4b
      // 2f: goto 36
      // 32: invokestatic y3g.a (Loov;)Loov;
      // 35: athrow
      // 36: ifle 4a
      // 39: goto 40
      // 3c: invokestatic y3g.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 3
      // 41: invokevirtual mew.eve ()Lmew;
      // 44: astore 3
      // 45: iload 4
      // 47: ifeq 05
      // 4a: bipush 0
      // 4b: istore 6
      // 4d: iload 6
      // 4f: bipush 4
      // 50: if_icmpge e1
      // 53: aload 3
      // 54: aload 2
      // 55: bipush 8
      // 57: invokevirtual java/util/Random.nextInt (I)I
      // 5a: aload 2
      // 5b: bipush 8
      // 5d: invokevirtual java/util/Random.nextInt (I)I
      // 60: isub
      // 61: aload 2
      // 62: bipush 4
      // 63: invokevirtual java/util/Random.nextInt (I)I
      // 66: aload 2
      // 67: bipush 4
      // 68: invokevirtual java/util/Random.nextInt (I)I
      // 6b: isub
      // 6c: aload 2
      // 6d: bipush 8
      // 6f: invokevirtual java/util/Random.nextInt (I)I
      // 72: aload 2
      // 73: bipush 8
      // 75: invokevirtual java/util/Random.nextInt (I)I
      // 78: isub
      // 79: invokevirtual mew.ec4 (III)Lmew;
      // 7c: astore 7
      // 7e: iload 4
      // 80: ifne dc
      // 83: aload 1
      // 84: aload 7
      // 86: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 89: iload 4
      // 8b: ifne e2
      // 8e: goto 95
      // 91: invokestatic y3g.a (Loov;)Loov;
      // 94: athrow
      // 95: ifeq d9
      // 98: goto 9f
      // 9b: invokestatic y3g.a (Loov;)Loov;
      // 9e: athrow
      // 9f: getstatic ox_.rx7 Lutc;
      // a2: aload 1
      // a3: aload 7
      // a5: getstatic ox_.rx7 Lutc;
      // a8: invokevirtual utc.l4i ()Lzfz;
      // ab: invokevirtual utc._h0 (Lt9d;Lmew;Lzfz;)Z
      // ae: iload 4
      // b0: ifne d8
      // b3: goto ba
      // b6: invokestatic y3g.a (Loov;)Loov;
      // b9: athrow
      // ba: ifeq d9
      // bd: goto c4
      // c0: invokestatic y3g.a (Loov;)Loov;
      // c3: athrow
      // c4: aload 1
      // c5: aload 7
      // c7: getstatic ox_.rx7 Lutc;
      // ca: invokevirtual utc.l4i ()Lzfz;
      // cd: bipush 2
      // ce: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // d1: goto d8
      // d4: invokestatic y3g.a (Loov;)Loov;
      // d7: athrow
      // d8: pop
      // d9: iinc 6 1
      // dc: iload 4
      // de: ifeq 4d
      // e1: bipush 1
      // e2: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
