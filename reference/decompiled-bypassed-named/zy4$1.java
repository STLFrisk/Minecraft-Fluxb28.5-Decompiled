import com.google.common.base.Predicate;

public class zy4$1 implements Predicate {
   public final zy4 x2i;

   public zy4$1(zy4 var1) {
      this.x2i = var1;
   }

   public boolean hi5(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: instanceof ha9
      // 08: iload 2
      // 09: ifeq 26
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic zy4$1.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic zy4$1.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast ha9
      // 20: getfield ha9.lls Lpj2;
      // 23: getfield pj2.lez Z
      // 26: iload 2
      // 27: ifeq 35
      // 2a: ifeq 36
      // 2d: goto 34
      // 30: invokestatic zy4$1.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: aload 0
      // 37: getfield zy4$1.x2i Lzy4;
      // 3a: invokevirtual zy4.nzg ()D
      // 3d: dstore 3
      // 3e: aload 1
      // 3f: invokevirtual EntityLivingBase.hzv ()Z
      // 42: iload 2
      // 43: ifeq 5a
      // 46: ifeq 56
      // 49: goto 50
      // 4c: invokestatic zy4$1.a (Loov;)Loov;
      // 4f: athrow
      // 50: dload 3
      // 51: ldc2_w 0.800000011920929
      // 54: dmul
      // 55: dstore 3
      // 56: aload 1
      // 57: invokevirtual EntityLivingBase.h5u ()Z
      // 5a: iload 2
      // 5b: ifeq a9
      // 5e: ifeq 9b
      // 61: goto 68
      // 64: invokestatic zy4$1.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 1
      // 69: checkcast ha9
      // 6c: invokevirtual ha9.ws9 ()F
      // 6f: fstore 5
      // 71: fload 5
      // 73: iload 2
      // 74: ifeq 8f
      // 77: ldc 0.1
      // 79: nop
      // 7a: fcmpg
      // 7b: ifge 91
      // 7e: goto 85
      // 81: invokestatic zy4$1.a (Loov;)Loov;
      // 84: athrow
      // 85: ldc 0.1
      // 87: nop
      // 88: goto 8f
      // 8b: invokestatic zy4$1.a (Loov;)Loov;
      // 8e: athrow
      // 8f: fstore 5
      // 91: dload 3
      // 92: ldc 0.7
      // 94: nop
      // 95: fload 5
      // 97: fmul
      // 98: f2d
      // 99: dmul
      // 9a: dstore 3
      // 9b: aload 1
      // 9c: aload 0
      // 9d: getfield zy4$1.x2i Lzy4;
      // a0: invokestatic zy4.sd_ (Lzy4;)Lyqv;
      // a3: invokevirtual EntityLivingBase.tm6 (Li2h;)F
      // a6: f2d
      // a7: dload 3
      // a8: dcmpl
      // a9: iload 2
      // aa: ifeq b8
      // ad: ifle bb
      // b0: goto b7
      // b3: invokestatic zy4$1.a (Loov;)Loov;
      // b6: athrow
      // b7: bipush 0
      // b8: goto cb
      // bb: aload 0
      // bc: getfield zy4$1.x2i Lzy4;
      // bf: invokestatic zy4.sd_ (Lzy4;)Lyqv;
      // c2: aload 1
      // c3: checkcast Entity
      // c6: bipush 0
      // c7: bipush 1
      // c8: invokestatic wel.u2d (Lyqv;Lg_3;ZZ)Z
      // cb: ireturn
   }

   public boolean apply(Object var1) {
      return this.hi5((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
