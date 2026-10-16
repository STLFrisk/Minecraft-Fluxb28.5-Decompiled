import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;

public class lhs implements TypeAdapterFactory {
   public TypeAdapter create(Gson var1, TypeToken var2) {
      int var3 = OpaquePredicate.b();
      Class var4 = var2.getRawType();

      try {
         if (!var4.isEnum()) {
            return null;
         }
      } catch (oov var10) {
         throw a(var10);
      }

      HashMap var5 = Maps.newHashMap();

      for (Object var9 : var4.getEnumConstants()) {
         var5.put(this.a03(var9), var9);
         if (var3 == 0) {
            break;
         }
      }

      return new lhs$1(this, var5);
   }

   private String a03(Object param1) {
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
      // 05: iload 2
      // 06: ifeq 2b
      // 09: instanceof java/lang/Enum
      // 0c: ifeq 2a
      // 0f: goto 16
      // 12: invokestatic lhs.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast java/lang/Enum
      // 1a: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 1d: getstatic java/util/Locale.US Ljava/util/Locale;
      // 20: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 23: goto 34
      // 26: invokestatic lhs.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 2e: getstatic java/util/Locale.US Ljava/util/Locale;
      // 31: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 34: areturn
   }

   public static String b0r(lhs var0, Object var1) {
      return var0.a03(var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
