import java.util.Comparator;

public class s24$tx3 implements Comparator {
   private final EntityLivingBase u7e;

   public s24$tx3(EntityLivingBase var1) {
      this.u7e = var1;
   }

   public int ke0(EntityLivingBase param1, EntityLivingBase param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield s24$tx3.u7e Li2h;
      // 04: aload 1
      // 05: invokevirtual EntityLivingBase.wxg (Li2h;)D
      // 08: dstore 4
      // 0a: invokestatic OpaquePredicate.c ()I
      // 0d: aload 0
      // 0e: getfield s24$tx3.u7e Li2h;
      // 11: aload 2
      // 12: invokevirtual EntityLivingBase.wxg (Li2h;)D
      // 15: dstore 6
      // 17: istore 3
      // 18: dload 4
      // 1a: dload 6
      // 1c: dcmpg
      // 1d: iload 3
      // 1e: ifne 38
      // 21: ifge 33
      // 24: goto 2b
      // 27: invokestatic s24$tx3.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush -1
      // 2c: goto 4b
      // 2f: invokestatic s24$tx3.a (Loov;)Loov;
      // 32: athrow
      // 33: dload 4
      // 35: dload 6
      // 37: dcmpl
      // 38: iload 3
      // 39: ifne 47
      // 3c: ifle 4a
      // 3f: goto 46
      // 42: invokestatic s24$tx3.a (Loov;)Loov;
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4b
      // 4a: bipush 0
      // 4b: ireturn
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.ke0((EntityLivingBase)var1, (EntityLivingBase)var2);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
