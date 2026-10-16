import java.util.Random;

public class n43 extends cdu {
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
      // 05: bipush 0
      // 06: istore 5
      // 08: iload 5
      // 0a: bipush 10
      // 0c: if_icmpge bb
      // 0f: aload 3
      // 10: aload 2
      // 11: bipush 8
      // 13: invokevirtual java/util/Random.nextInt (I)I
      // 16: aload 2
      // 17: bipush 8
      // 19: invokevirtual java/util/Random.nextInt (I)I
      // 1c: isub
      // 1d: aload 2
      // 1e: bipush 4
      // 1f: invokevirtual java/util/Random.nextInt (I)I
      // 22: aload 2
      // 23: bipush 4
      // 24: invokevirtual java/util/Random.nextInt (I)I
      // 27: isub
      // 28: aload 2
      // 29: bipush 8
      // 2b: invokevirtual java/util/Random.nextInt (I)I
      // 2e: aload 2
      // 2f: bipush 8
      // 31: invokevirtual java/util/Random.nextInt (I)I
      // 34: isub
      // 35: invokevirtual mew.ec4 (III)Lmew;
      // 38: astore 6
      // 3a: iload 4
      // 3c: ifne b6
      // 3f: aload 1
      // 40: aload 6
      // 42: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 45: iload 4
      // 47: ifne bc
      // 4a: goto 51
      // 4d: invokestatic n43.a (Loov;)Loov;
      // 50: athrow
      // 51: ifeq b3
      // 54: goto 5b
      // 57: invokestatic n43.a (Loov;)Loov;
      // 5a: athrow
      // 5b: bipush 1
      // 5c: aload 2
      // 5d: aload 2
      // 5e: bipush 3
      // 5f: invokevirtual java/util/Random.nextInt (I)I
      // 62: bipush 1
      // 63: iadd
      // 64: invokevirtual java/util/Random.nextInt (I)I
      // 67: iadd
      // 68: istore 7
      // 6a: bipush 0
      // 6b: istore 8
      // 6d: iload 8
      // 6f: iload 7
      // 71: if_icmpge b3
      // 74: getstatic ox_.hio Lkuv;
      // 77: aload 1
      // 78: aload 6
      // 7a: invokevirtual kuv.cwa (Lt9d;Lmew;)Z
      // 7d: iload 4
      // 7f: ifne 0a
      // 82: iload 4
      // 84: ifne aa
      // 87: ifeq ab
      // 8a: goto 91
      // 8d: invokestatic n43.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 1
      // 92: aload 6
      // 94: iload 8
      // 96: invokevirtual mew.z89 (I)Lmew;
      // 99: getstatic ox_.hio Lkuv;
      // 9c: invokevirtual kuv.l4i ()Lzfz;
      // 9f: bipush 2
      // a0: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // a3: goto aa
      // a6: invokestatic n43.a (Loov;)Loov;
      // a9: athrow
      // aa: pop
      // ab: iinc 8 1
      // ae: iload 4
      // b0: ifeq 6d
      // b3: iinc 5 1
      // b6: iload 4
      // b8: ifeq 08
      // bb: bipush 1
      // bc: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
