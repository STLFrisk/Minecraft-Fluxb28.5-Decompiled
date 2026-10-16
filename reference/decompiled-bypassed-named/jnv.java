import org.apache.commons.lang3.Validate;

public class jnv extends nga {
   public jnv(Object var1) {
      this.xhd = var1;
   }

   @Override
   public void pk2(int param1, Object param2, Object param3) {
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
      // 06: iload 4
      // 08: ifeq 29
      // 0b: getfield jnv.xhd Ljava/lang/Object;
      // 0e: aload 2
      // 0f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 12: ifeq 28
      // 15: goto 1c
      // 18: invokestatic jnv.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 3
      // 1e: putfield jnv.oe4 Ljava/lang/Object;
      // 21: goto 28
      // 24: invokestatic jnv.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: iload 1
      // 2a: aload 2
      // 2b: aload 3
      // 2c: invokespecial nga.pk2 (ILjava/lang/Object;Ljava/lang/Object;)V
      // 2f: return
   }

   public void pkl() {
      Validate.notNull(this.xhd);
   }

   @Override
   public Object _gz(Object var1) {
      Object var2 = super._gz(var1);

      try {
         if (var2 == null) {
            return this.oe4;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var2;
   }

   @Override
   public Object ju3(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: invokespecial nga.ju3 (I)Ljava/lang/Object;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifeq 24
      // 0f: ifnonnull 27
      // 12: goto 19
      // 15: invokestatic jnv.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield jnv.oe4 Ljava/lang/Object;
      // 1d: goto 24
      // 20: invokestatic jnv.a (Loov;)Loov;
      // 23: athrow
      // 24: goto 28
      // 27: aload 3
      // 28: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
