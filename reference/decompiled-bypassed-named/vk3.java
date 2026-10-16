import java.util.Random;

public class vk3 extends e0x {
   public vk3() {
      this(p3y.zs8.up9());
   }

   public vk3(_mi var1) {
      super(p3y.zs8, var1);
      this.i3l(uja.mqu);
   }

   @Override
   public u7m j39(zfz param1, Random param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getstatic ox_.sm_ Le0x;
      // 09: iload 4
      // 0b: ifeq 26
      // 0e: if_acmpne 22
      // 11: goto 18
      // 14: invokestatic vk3.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic xbr.thr Lu7m;
      // 1b: goto 9a
      // 1e: invokestatic vk3.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getstatic ox_._dt Le0x;
      // 26: iload 4
      // 28: ifeq 43
      // 2b: if_acmpne 3f
      // 2e: goto 35
      // 31: invokestatic vk3.a (Loov;)Loov;
      // 34: athrow
      // 35: getstatic xbr.exg Lu7m;
      // 38: goto 9a
      // 3b: invokestatic vk3.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: getstatic ox_.po5 Le0x;
      // 43: iload 4
      // 45: ifeq 60
      // 48: if_acmpne 5c
      // 4b: goto 52
      // 4e: invokestatic vk3.a (Loov;)Loov;
      // 51: athrow
      // 52: getstatic xbr.nnn Lu7m;
      // 55: goto 9a
      // 58: invokestatic vk3.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getstatic ox_.aiy Le0x;
      // 60: iload 4
      // 62: ifeq 89
      // 65: if_acmpne 79
      // 68: goto 6f
      // 6b: invokestatic vk3.a (Loov;)Loov;
      // 6e: athrow
      // 6f: getstatic xbr.cu7 Lu7m;
      // 72: goto 9a
      // 75: invokestatic vk3.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 0
      // 7a: iload 4
      // 7c: ifeq 97
      // 7f: getstatic ox_.gjf Le0x;
      // 82: goto 89
      // 85: invokestatic vk3.a (Loov;)Loov;
      // 88: athrow
      // 89: if_acmpne 96
      // 8c: getstatic xbr.n2h Lu7m;
      // 8f: goto 9a
      // 92: invokestatic vk3.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 9a: areturn
   }

   @Override
   public int bzr(Random var1) {
      try {
         if (this == ox_.po5) {
            return 4 + var1.nextInt(5);
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return 1;
   }

   @Override
   public int osi(int param1, Random param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: iload 1
      // 05: iload 3
      // 06: ifne 70
      // 09: ifle 6b
      // 0c: goto 13
      // 0f: invokestatic vk3.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: iload 3
      // 15: ifne 6c
      // 18: goto 1f
      // 1b: invokestatic vk3.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 22: aload 0
      // 23: aload 0
      // 24: invokevirtual vk3.w_4 ()Lg92;
      // 27: invokevirtual g92.k64 ()Lcom/google/common/collect/ImmutableList;
      // 2a: invokevirtual com/google/common/collect/ImmutableList.iterator ()Lcom/google/common/collect/UnmodifiableIterator;
      // 2d: invokevirtual com/google/common/collect/UnmodifiableIterator.next ()Ljava/lang/Object;
      // 30: checkcast zfz
      // 33: aload 2
      // 34: iload 1
      // 35: invokevirtual vk3.j39 (Lzfz;Ljava/util/Random;I)Lu7m;
      // 38: if_acmpeq 6b
      // 3b: goto 42
      // 3e: invokestatic vk3.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 2
      // 43: iload 1
      // 44: bipush 2
      // 45: iadd
      // 46: invokevirtual java/util/Random.nextInt (I)I
      // 49: bipush 1
      // 4a: isub
      // 4b: istore 4
      // 4d: iload 4
      // 4f: iload 3
      // 50: ifne 6a
      // 53: ifge 60
      // 56: goto 5d
      // 59: invokestatic vk3.a (Loov;)Loov;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: istore 4
      // 60: aload 0
      // 61: aload 2
      // 62: invokevirtual vk3.bzr (Ljava/util/Random;)I
      // 65: iload 4
      // 67: bipush 1
      // 68: iadd
      // 69: imul
      // 6a: ireturn
      // 6b: aload 0
      // 6c: aload 2
      // 6d: invokevirtual vk3.bzr (Ljava/util/Random;)I
      // 70: ireturn
   }

   @Override
   public void ix7(OpaquePredicate param1, mew param2, zfz param3, float param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: fload 4
      // 0b: iload 5
      // 0d: invokespecial e0x.ix7 (Lt9d;Lmew;Lzfz;FI)V
      // 10: aload 0
      // 11: aload 3
      // 12: aload 1
      // 13: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 16: iload 5
      // 18: invokevirtual vk3.j39 (Lzfz;Ljava/util/Random;I)Lu7m;
      // 1b: aload 0
      // 1c: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 1f: if_acmpeq f5
      // 22: bipush 0
      // 23: istore 7
      // 25: aload 0
      // 26: getstatic ox_.sm_ Le0x;
      // 29: iload 6
      // 2b: ifne 53
      // 2e: if_acmpne 48
      // 31: goto 38
      // 34: invokestatic vk3.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 1
      // 39: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 3c: bipush 0
      // 3d: bipush 2
      // 3e: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 41: istore 7
      // 43: iload 6
      // 45: ifeq ed
      // 48: aload 0
      // 49: getstatic ox_._dt Le0x;
      // 4c: goto 53
      // 4f: invokestatic vk3.a (Loov;)Loov;
      // 52: athrow
      // 53: iload 6
      // 55: ifne 7e
      // 58: if_acmpne 73
      // 5b: goto 62
      // 5e: invokestatic vk3.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 1
      // 63: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 66: bipush 3
      // 67: bipush 7
      // 69: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 6c: istore 7
      // 6e: iload 6
      // 70: ifeq ed
      // 73: aload 0
      // 74: getstatic ox_.aiy Le0x;
      // 77: goto 7e
      // 7a: invokestatic vk3.a (Loov;)Loov;
      // 7d: athrow
      // 7e: iload 6
      // 80: ifne a9
      // 83: if_acmpne 9e
      // 86: goto 8d
      // 89: invokestatic vk3.a (Loov;)Loov;
      // 8c: athrow
      // 8d: aload 1
      // 8e: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 91: bipush 3
      // 92: bipush 7
      // 94: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 97: istore 7
      // 99: iload 6
      // 9b: ifeq ed
      // 9e: aload 0
      // 9f: getstatic ox_.po5 Le0x;
      // a2: goto a9
      // a5: invokestatic vk3.a (Loov;)Loov;
      // a8: athrow
      // a9: iload 6
      // ab: ifne df
      // ae: if_acmpne c8
      // b1: goto b8
      // b4: invokestatic vk3.a (Loov;)Loov;
      // b7: athrow
      // b8: aload 1
      // b9: getfield OpaquePredicate.fsy Ljava/util/Random;
      // bc: bipush 2
      // bd: bipush 5
      // be: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // c1: istore 7
      // c3: iload 6
      // c5: ifeq ed
      // c8: aload 0
      // c9: iload 6
      // cb: ifne ee
      // ce: goto d5
      // d1: invokestatic vk3.a (Loov;)Loov;
      // d4: athrow
      // d5: getstatic ox_.gjf Le0x;
      // d8: goto df
      // db: invokestatic vk3.a (Loov;)Loov;
      // de: athrow
      // df: if_acmpne ed
      // e2: aload 1
      // e3: getfield OpaquePredicate.fsy Ljava/util/Random;
      // e6: bipush 2
      // e7: bipush 5
      // e8: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // eb: istore 7
      // ed: aload 0
      // ee: aload 1
      // ef: aload 2
      // f0: iload 7
      // f2: invokevirtual vk3.u9y (Lt9d;Lmew;I)V
      // f5: return
   }

   @Override
   public int qu2(OpaquePredicate var1, mew var2) {
      return 0;
   }

   @Override
   public int crg(zfz var1) {
      try {
         if (this == ox_.po5) {
            return qvg.o71.b9d();
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return 0;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
