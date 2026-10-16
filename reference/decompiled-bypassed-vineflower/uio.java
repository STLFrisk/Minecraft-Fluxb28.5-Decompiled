import java.util.Random;

public class uio extends cdu {
   private ldj$vn8 gv2;

   public void r91(ldj$vn8 var1) {
      this.gv2 = var1;
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
      // 00: bipush 0
      // 01: istore 5
      // 03: invokestatic t9d.c ()I
      // 06: bipush 0
      // 07: istore 6
      // 09: istore 4
      // 0b: iload 6
      // 0d: bipush 64
      // 0f: if_icmpge d8
      // 12: aload 3
      // 13: aload 2
      // 14: bipush 8
      // 16: invokevirtual java/util/Random.nextInt (I)I
      // 19: aload 2
      // 1a: bipush 8
      // 1c: invokevirtual java/util/Random.nextInt (I)I
      // 1f: isub
      // 20: aload 2
      // 21: bipush 4
      // 22: invokevirtual java/util/Random.nextInt (I)I
      // 25: aload 2
      // 26: bipush 4
      // 27: invokevirtual java/util/Random.nextInt (I)I
      // 2a: isub
      // 2b: aload 2
      // 2c: bipush 8
      // 2e: invokevirtual java/util/Random.nextInt (I)I
      // 31: aload 2
      // 32: bipush 8
      // 34: invokevirtual java/util/Random.nextInt (I)I
      // 37: isub
      // 38: invokevirtual mew.ec4 (III)Lmew;
      // 3b: astore 7
      // 3d: iload 4
      // 3f: ifne d3
      // 42: aload 1
      // 43: aload 7
      // 45: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 48: iload 4
      // 4a: ifne da
      // 4d: goto 54
      // 50: invokestatic uio.a (Loov;)Loov;
      // 53: athrow
      // 54: ifeq d0
      // 57: goto 5e
      // 5a: invokestatic uio.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 1
      // 5f: getfield t9d.vzz Lupn;
      // 62: invokevirtual upn.qyc ()Z
      // 65: iload 4
      // 67: ifne a9
      // 6a: goto 71
      // 6d: invokestatic uio.a (Loov;)Loov;
      // 70: athrow
      // 71: ifeq 99
      // 74: goto 7b
      // 77: invokestatic uio.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 7
      // 7d: invokevirtual mew.getY ()I
      // 80: iload 4
      // 82: ifne a9
      // 85: goto 8c
      // 88: invokestatic uio.a (Loov;)Loov;
      // 8b: athrow
      // 8c: sipush 254
      // 8f: if_icmpge d0
      // 92: goto 99
      // 95: invokestatic uio.a (Loov;)Loov;
      // 98: athrow
      // 99: getstatic ox_.s4_ Lldj;
      // 9c: aload 1
      // 9d: aload 7
      // 9f: invokevirtual ldj.ctq (Lt9d;Lmew;)Z
      // a2: goto a9
      // a5: invokestatic uio.a (Loov;)Loov;
      // a8: athrow
      // a9: iload 4
      // ab: ifne ce
      // ae: ifeq d0
      // b1: goto b8
      // b4: invokestatic uio.a (Loov;)Loov;
      // b7: athrow
      // b8: getstatic ox_.s4_ Lldj;
      // bb: aload 1
      // bc: aload 7
      // be: aload 0
      // bf: getfield uio.gv2 Lldj$vn8;
      // c2: bipush 2
      // c3: invokevirtual ldj.opz (Lt9d;Lmew;Lldj$vn8;I)V
      // c6: bipush 1
      // c7: goto ce
      // ca: invokestatic uio.a (Loov;)Loov;
      // cd: athrow
      // ce: istore 5
      // d0: iinc 6 1
      // d3: iload 4
      // d5: ifeq 0b
      // d8: iload 5
      // da: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
