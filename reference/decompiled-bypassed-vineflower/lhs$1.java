import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

public class lhs$1 extends TypeAdapter {
   public final Map rdq;
   public final lhs scj;

   public lhs$1(lhs var1, Map var2) {
      this.scj = var1;
      this.rdq = var2;
   }

   public void write(JsonWriter param1, Object param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: ifnonnull 18
      // 08: aload 1
      // 09: invokevirtual com/google/gson/stream/JsonWriter.nullValue ()Lcom/google/gson/stream/JsonWriter;
      // 0c: pop
      // 0d: iload 3
      // 0e: ifeq 2c
      // 11: goto 18
      // 14: invokestatic lhs$1.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: aload 0
      // 1a: getfield lhs$1.scj Llhs;
      // 1d: aload 2
      // 1e: invokestatic lhs.b0r (Llhs;Ljava/lang/Object;)Ljava/lang/String;
      // 21: invokevirtual com/google/gson/stream/JsonWriter.value (Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
      // 24: pop
      // 25: goto 2c
      // 28: invokestatic lhs$1.a (Loov;)Loov;
      // 2b: athrow
      // 2c: return
   }

   public Object read(JsonReader param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual com/google/gson/stream/JsonReader.peek ()Lcom/google/gson/stream/JsonToken;
      // 08: iload 2
      // 09: ifne 30
      // 0c: getstatic com/google/gson/stream/JsonToken.NULL Lcom/google/gson/stream/JsonToken;
      // 0f: if_acmpne 23
      // 12: goto 19
      // 15: invokestatic lhs$1.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual com/google/gson/stream/JsonReader.nextNull ()V
      // 1d: aconst_null
      // 1e: areturn
      // 1f: invokestatic lhs$1.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield lhs$1.rdq Ljava/util/Map;
      // 27: aload 1
      // 28: invokevirtual com/google/gson/stream/JsonReader.nextString ()Ljava/lang/String;
      // 2b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 30: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
