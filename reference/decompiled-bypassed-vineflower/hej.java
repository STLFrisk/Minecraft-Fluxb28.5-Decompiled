import org.lwjgl.util.vector.Vector3f;

public class hej {
   public static final hej i26 = new hej(new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F));
   public final Vector3f eip;
   public final Vector3f tas;
   public final Vector3f vsl;

   public hej(Vector3f var1, Vector3f var2, Vector3f var3) {
      this.eip = new Vector3f(var1);
      this.tas = new Vector3f(var2);
      this.vsl = new Vector3f(var3);
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic hej.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic hej.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1e: iload 2
      // 1f: ifeq 37
      // 22: aload 1
      // 23: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 26: if_acmpeq 36
      // 29: goto 30
      // 2c: invokestatic hej.a (Loov;)Loov;
      // 2f: athrow
      // 30: bipush 0
      // 31: ireturn
      // 32: invokestatic hej.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 1
      // 37: checkcast hej
      // 3a: astore 3
      // 3b: aload 0
      // 3c: getfield hej.eip Lorg/lwjgl/util/vector/Vector3f;
      // 3f: aload 3
      // 40: getfield hej.eip Lorg/lwjgl/util/vector/Vector3f;
      // 43: invokevirtual org/lwjgl/util/vector/Vector3f.equals (Ljava/lang/Object;)Z
      // 46: iload 2
      // 47: ifeq 72
      // 4a: ifne 5c
      // 4d: goto 54
      // 50: invokestatic hej.a (Loov;)Loov;
      // 53: athrow
      // 54: bipush 0
      // 55: goto 88
      // 58: invokestatic hej.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield hej.vsl Lorg/lwjgl/util/vector/Vector3f;
      // 60: aload 3
      // 61: getfield hej.vsl Lorg/lwjgl/util/vector/Vector3f;
      // 64: iload 2
      // 65: ifeq 85
      // 68: invokevirtual org/lwjgl/util/vector/Vector3f.equals (Ljava/lang/Object;)Z
      // 6b: goto 72
      // 6e: invokestatic hej.a (Loov;)Loov;
      // 71: athrow
      // 72: ifne 7d
      // 75: bipush 0
      // 76: goto 88
      // 79: invokestatic hej.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 0
      // 7e: getfield hej.tas Lorg/lwjgl/util/vector/Vector3f;
      // 81: aload 3
      // 82: getfield hej.tas Lorg/lwjgl/util/vector/Vector3f;
      // 85: invokevirtual org/lwjgl/util/vector/Vector3f.equals (Ljava/lang/Object;)Z
      // 88: ireturn
   }

   @Override
   public int hashCode() {
      int var1 = this.eip.hashCode();
      var1 = 31 * var1 + this.tas.hashCode();
      return 31 * var1 + this.vsl.hashCode();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
