import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class vd3$y_1 implements JsonDeserializer, JsonSerializer {
   public final vd3 gmw;

   private vd3$y_1(vd3 var1) {
      this.gmw = var1;
   }

   public JsonElement gbn(syv var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var1.jqb(var4);
      return var4;
   }

   public syv deserialize(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifeq 20
      // 0b: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 0e: ifeq 33
      // 11: goto 18
      // 14: invokestatic vd3$y_1.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: goto 20
      // 1c: invokestatic vd3$y_1.a (Loov;)Loov;
      // 1f: athrow
      // 20: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 23: astore 5
      // 25: aload 0
      // 26: getfield vd3$y_1.gmw Lvd3;
      // 29: aload 5
      // 2b: invokevirtual vd3.fna (Lcom/google/gson/JsonObject;)Lsyv;
      // 2e: astore 6
      // 30: aload 6
      // 32: areturn
      // 33: aconst_null
      // 34: areturn
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.deserialize(var1, var2, var3);
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.gbn((syv)var1, var2, var3);
   }

   public vd3$y_1(vd3 var1, vd3$1 var2) {
      this(var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
