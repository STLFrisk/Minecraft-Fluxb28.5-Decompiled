import java.util.Random;

public class mkf extends cdu {
   public mkf(rrw var1) {
      this.jdy = var1;
   }

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
      // 0a: bipush 64
      // 0c: if_icmpge db
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
      // 3c: ifne d6
      // 3f: aload 1
      // 40: aload 6
      // 42: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 45: iload 4
      // 47: ifne dc
      // 4a: goto 51
      // 4d: invokestatic mkf.a (Loov;)Loov;
      // 50: athrow
      // 51: ifeq d3
      // 54: goto 5b
      // 57: invokestatic mkf.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 1
      // 5c: getfield t9d.vzz Lupn;
      // 5f: invokevirtual upn.qyc ()Z
      // 62: iload 4
      // 64: ifne ae
      // 67: goto 6e
      // 6a: invokestatic mkf.a (Loov;)Loov;
      // 6d: athrow
      // 6e: ifeq 96
      // 71: goto 78
      // 74: invokestatic mkf.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 6
      // 7a: invokevirtual mew.getY ()I
      // 7d: iload 4
      // 7f: ifne ae
      // 82: goto 89
      // 85: invokestatic mkf.a (Loov;)Loov;
      // 88: athrow
      // 89: sipush 255
      // 8c: if_icmpge d3
      // 8f: goto 96
      // 92: invokestatic mkf.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: getfield mkf.jdy Lrrw;
      // 9a: aload 1
      // 9b: aload 6
      // 9d: aload 0
      // 9e: getfield mkf.jdy Lrrw;
      // a1: invokevirtual rrw.l4i ()Lzfz;
      // a4: invokevirtual rrw._h0 (Lt9d;Lmew;Lzfz;)Z
      // a7: goto ae
      // aa: invokestatic mkf.a (Loov;)Loov;
      // ad: athrow
      // ae: iload 4
      // b0: ifne d2
      // b3: ifeq d3
      // b6: goto bd
      // b9: invokestatic mkf.a (Loov;)Loov;
      // bc: athrow
      // bd: aload 1
      // be: aload 6
      // c0: aload 0
      // c1: getfield mkf.jdy Lrrw;
      // c4: invokevirtual rrw.l4i ()Lzfz;
      // c7: bipush 2
      // c8: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // cb: goto d2
      // ce: invokestatic mkf.a (Loov;)Loov;
      // d1: athrow
      // d2: pop
      // d3: iinc 5 1
      // d6: iload 4
      // d8: ifeq 08
      // db: bipush 1
      // dc: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
