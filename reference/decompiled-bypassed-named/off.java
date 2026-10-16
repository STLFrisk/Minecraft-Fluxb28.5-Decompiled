public class off extends dxd {
   private final rqh ono;
   private final Minecraft qst;
   private final dxd$v9l[] _6c;
   private int myv;

   public off(rqh param1, Minecraft param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 2
      // 02: aload 1
      // 03: getfield rqh.dt7 I
      // 06: aload 1
      // 07: getfield rqh.o1e I
      // 0a: bipush 63
      // 0c: aload 1
      // 0d: getfield rqh.o1e I
      // 10: bipush 32
      // 12: isub
      // 13: bipush 20
      // 15: invokespecial dxd.<init> (Lc05;IIIII)V
      // 18: aload 0
      // 19: bipush 0
      // 1a: putfield off.myv I
      // 1d: invokestatic OpaquePredicate.c ()I
      // 20: aload 0
      // 21: aload 1
      // 22: putfield off.ono Lrqh;
      // 25: aload 0
      // 26: aload 2
      // 27: putfield off.qst Lc05;
      // 2a: istore 3
      // 2b: aload 2
      // 2c: getfield Minecraft.oxn Lmoh;
      // 2f: getfield moh.wf7 [Lm7l;
      // 32: invokestatic org/apache/commons/lang3/ArrayUtils.clone ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 35: checkcast [Lm7l;
      // 38: checkcast [Lm7l;
      // 3b: astore 4
      // 3d: aload 0
      // 3e: aload 4
      // 40: arraylength
      // 41: invokestatic m7l.s9n ()Ljava/util/Set;
      // 44: invokeinterface java/util/Set.size ()I 1
      // 49: iadd
      // 4a: anewarray 11
      // 4d: putfield off._6c [Ldxd$v9l;
      // 50: aload 4
      // 52: checkcast [Ljava/lang/Object;
      // 55: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;)V
      // 58: bipush 0
      // 59: istore 5
      // 5b: aconst_null
      // 5c: astore 6
      // 5e: aload 4
      // 60: astore 7
      // 62: aload 7
      // 64: arraylength
      // 65: istore 8
      // 67: bipush 0
      // 68: istore 9
      // 6a: iload 9
      // 6c: iload 8
      // 6e: if_icmpge fe
      // 71: aload 7
      // 73: iload 9
      // 75: aaload
      // 76: astore 10
      // 78: aload 10
      // 7a: invokevirtual m7l.sai ()Ljava/lang/String;
      // 7d: astore 11
      // 7f: aload 11
      // 81: aload 6
      // 83: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 86: iload 3
      // 87: ifne bf
      // 8a: ifne ac
      // 8d: goto 94
      // 90: invokestatic off.c (Loov;)Loov;
      // 93: athrow
      // 94: aload 11
      // 96: astore 6
      // 98: aload 0
      // 99: getfield off._6c [Ldxd$v9l;
      // 9c: iload 5
      // 9e: iinc 5 1
      // a1: new off$hfv
      // a4: dup
      // a5: aload 0
      // a6: aload 11
      // a8: invokespecial off$hfv.<init> (Loff;Ljava/lang/String;)V
      // ab: aastore
      // ac: aload 2
      // ad: getfield Minecraft.tx1 Lowt;
      // b0: aload 10
      // b2: invokevirtual m7l.j16 ()Ljava/lang/String;
      // b5: bipush 0
      // b6: anewarray 101
      // b9: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // bc: invokevirtual owt.ezt (Ljava/lang/String;)I
      // bf: istore 12
      // c1: iload 3
      // c2: ifne fa
      // c5: iload 12
      // c7: aload 0
      // c8: getfield off.myv I
      // cb: if_icmple e2
      // ce: goto d5
      // d1: invokestatic off.c (Loov;)Loov;
      // d4: athrow
      // d5: aload 0
      // d6: iload 12
      // d8: putfield off.myv I
      // db: goto e2
      // de: invokestatic off.c (Loov;)Loov;
      // e1: athrow
      // e2: aload 0
      // e3: getfield off._6c [Ldxd$v9l;
      // e6: iload 5
      // e8: iinc 5 1
      // eb: new off$sp0
      // ee: dup
      // ef: aload 0
      // f0: aload 10
      // f2: aconst_null
      // f3: invokespecial off$sp0.<init> (Loff;Lm7l;Loff$1;)V
      // f6: aastore
      // f7: iinc 9 1
      // fa: iload 3
      // fb: ifeq 6a
      // fe: return
   }

   @Override
   public int getSize() {
      return this._6c.length;
   }

   @Override
   public dxd$v9l jb4(int var1) {
      return this._6c[var1];
   }

   @Override
   public int getScrollBarX() {
      return super.getScrollBarX() + 15;
   }

   @Override
   public int getListWidth() {
      return super.getListWidth() + 32;
   }

   public static Minecraft tx_(off var0) {
      return var0.qst;
   }

   public static rqh dj4(off var0) {
      return var0.ono;
   }

   public static int a26(off var0) {
      return var0.myv;
   }

   private static oov c(oov var0) {
      return var0;
   }
}
