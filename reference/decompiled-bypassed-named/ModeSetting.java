import java.util.ArrayList;
import java.util.Arrays;

public class ModeSetting extends Setting {
   public SettingCategory vke = new SettingCategory(1.0F, 0.05F);

   public ModeSetting(String var1, String var2, String var3, String[] var4) {
      this.rn2 = var1;
      this.h4c = var2;
      this.ktv = var3;
      ArrayList var5 = new ArrayList();

      try {
         var5.addAll(Arrays.asList(var4));
         if (!var5.contains(var3)) {
            var5.add(var3);
         }
      } catch (oov var6) {
         throw a(var6);
      }

      this.mh8 = var5.toArray(new String[var5.size()]);
      SettingRegistry.wig.add(this);
   }

   public String getValue() {
      return (String)this.ktv;
   }

   public void setValue(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: ifnonnull 0d
      // 08: return
      // 09: invokestatic ModeSetting.a (Loov;)Loov;
      // 0c: athrow
      // 0d: aload 0
      // 0e: iload 2
      // 0f: ifne 30
      // 12: getfield ModeSetting.mh8 [Ljava/lang/String;
      // 15: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 18: aload 1
      // 19: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 1e: ifeq 34
      // 21: goto 28
      // 24: invokestatic ModeSetting.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: goto 30
      // 2c: invokestatic ModeSetting.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 1
      // 31: putfield ModeSetting.ktv Ljava/lang/Object;
      // 34: return
   }

   public boolean isAllowedValue(String param1) {
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
      // 05: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // 08: aload 1
      // 09: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c: iload 2
      // 0d: ifne 21
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic ModeSetting.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: ireturn
      // 1c: invokestatic ModeSetting.a (Loov;)Loov;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
   }

   public SettingCategory getCategory() {
      return this.vke;
   }

   public String[] getOptions() {
      return this.mh8;
   }

   @Override
   public Object getValue() {
      return this.getValue();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
