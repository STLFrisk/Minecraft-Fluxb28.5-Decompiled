import com.google.common.base.Predicate;

public class _z_$1 implements Predicate {
   public final _z_ h3t;

   public _z_$1(_z_ var1) {
      this.h3t = var1;
   }

   public boolean q7h(Entity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield _z_$1.h3t L_z_;
      // 08: invokevirtual _z_.f_m ()D
      // 0b: dstore 3
      // 0c: aload 1
      // 0d: invokevirtual Entity.hzv ()Z
      // 10: iload 2
      // 11: ifne 28
      // 14: ifeq 24
      // 17: goto 1e
      // 1a: invokestatic _z_$1.a (Loov;)Loov;
      // 1d: athrow
      // 1e: dload 3
      // 1f: ldc2_w 0.800000011920929
      // 22: dmul
      // 23: dstore 3
      // 24: aload 1
      // 25: invokevirtual Entity.h5u ()Z
      // 28: iload 2
      // 29: ifne 4c
      // 2c: ifeq 3e
      // 2f: goto 36
      // 32: invokestatic _z_$1.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 0
      // 37: goto 6b
      // 3a: invokestatic _z_$1.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 1
      // 3f: aload 0
      // 40: getfield _z_$1.h3t L_z_;
      // 43: invokestatic _z_.g3s (L_z_;)Lyqv;
      // 46: invokevirtual Entity.tm6 (Li2h;)F
      // 49: f2d
      // 4a: dload 3
      // 4b: dcmpl
      // 4c: iload 2
      // 4d: ifne 5b
      // 50: ifle 5e
      // 53: goto 5a
      // 56: invokestatic _z_$1.a (Loov;)Loov;
      // 59: athrow
      // 5a: bipush 0
      // 5b: goto 6b
      // 5e: aload 0
      // 5f: getfield _z_$1.h3t L_z_;
      // 62: invokestatic _z_.g3s (L_z_;)Lyqv;
      // 65: aload 1
      // 66: bipush 0
      // 67: bipush 1
      // 68: invokestatic wel.u2d (Lyqv;Lg_3;ZZ)Z
      // 6b: ireturn
   }

   public boolean apply(Object var1) {
      return this.q7h((Entity)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
