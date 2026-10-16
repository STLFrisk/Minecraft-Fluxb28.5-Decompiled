public class yig$3 extends m75 {
   public final yig yax;

   public yig$3(yig var1) {
      this.yax = var1;
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokeinterface zfz.q2y ()Lcom/google/common/collect/ImmutableMap; 1
      // 0a: invokestatic com/google/common/collect/Maps.newLinkedHashMap (Ljava/util/Map;)Ljava/util/LinkedHashMap;
      // 0d: astore 3
      // 0e: aload 1
      // 0f: getstatic gkj.tzc Lqx_;
      // 12: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 17: iload 2
      // 18: ifeq 38
      // 1b: getstatic vt2.rf3 Lvt2;
      // 1e: if_acmpeq 39
      // 21: goto 28
      // 24: invokestatic yig$3.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 3
      // 29: getstatic gkj.tkz L_ku;
      // 2c: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 31: goto 38
      // 34: invokestatic yig$3.a (Loov;)Loov;
      // 37: athrow
      // 38: pop
      // 39: new zlz
      // 3c: dup
      // 3d: getstatic e0x.db8 Ljnv;
      // 40: aload 1
      // 41: invokeinterface zfz.r_y ()Le0x; 1
      // 46: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 49: checkcast gdz
      // 4c: aload 0
      // 4d: aload 3
      // 4e: invokevirtual yig$3.iir (Ljava/util/Map;)Ljava/lang/String;
      // 51: invokespecial zlz.<init> (Lgdz;Ljava/lang/String;)V
      // 54: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
