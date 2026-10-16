public class ConfigName {
   public static String w40() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: invokestatic Minecraft.vz1 ()Lc05;
      // 07: invokevirtual Minecraft.fcm ()Lr1l;
      // 0a: iload 0
      // 0b: ifne 26
      // 0e: ifnonnull 20
      // 11: goto 18
      // 14: invokestatic ConfigName.a (Loov;)Loov;
      // 17: athrow
      // 18: ldc_w "hypixel_best_config"
      // 1b: areturn
      // 1c: invokestatic ConfigName.a (Loov;)Loov;
      // 1f: athrow
      // 20: invokestatic Minecraft.vz1 ()Lc05;
      // 23: invokevirtual Minecraft.fcm ()Lr1l;
      // 26: getfield r1l.s4c Ljava/lang/String;
      // 29: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 2c: areturn
   }

   public static boolean v80() {
      return Minecraft.vz1().y8_();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
