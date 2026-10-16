public class yig$5 extends m75 {
   public final yig svj;

   public yig$5(yig var1) {
      this.svj = var1;
   }

   @Override
   public zlz htt(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokeinterface zfz.q2y ()Lcom/google/common/collect/ImmutableMap; 1
      // 06: invokestatic com/google/common/collect/Maps.newLinkedHashMap (Ljava/util/Map;)Ljava/util/LinkedHashMap;
      // 09: astore 3
      // 0a: invokestatic OpaquePredicate.c ()I
      // 0d: getstatic bx0.nln Lzb_;
      // 10: aload 3
      // 11: getstatic bx0.nln Lzb_;
      // 14: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 19: checkcast bx0$b_z
      // 1c: invokevirtual zb_.a1v (Ljava/lang/Enum;)Ljava/lang/String;
      // 1f: astore 4
      // 21: istore 2
      // 22: getstatic bx0$b_z.sos Lbx0$b_z;
      // 25: iload 2
      // 26: ifne 4c
      // 29: aload 1
      // 2a: getstatic bx0.nln Lzb_;
      // 2d: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 32: if_acmpeq 4d
      // 35: goto 3c
      // 38: invokestatic yig$5.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 3
      // 3d: getstatic bx0.g1_ Lh76;
      // 40: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 45: goto 4c
      // 48: invokestatic yig$5.a (Loov;)Loov;
      // 4b: athrow
      // 4c: pop
      // 4d: new zlz
      // 50: dup
      // 51: aload 4
      // 53: aload 0
      // 54: aload 3
      // 55: invokevirtual yig$5.iir (Ljava/util/Map;)Ljava/lang/String;
      // 58: invokespecial zlz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 5b: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
