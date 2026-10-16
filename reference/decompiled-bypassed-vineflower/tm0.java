import com.google.common.collect.ForwardingSet;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class tm0 extends ForwardingSet implements lhm {
   @Override
   public void wqy(JsonElement param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 1e
      // 09: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 0c: ifeq 47
      // 0f: goto 16
      // 12: invokestatic tm0.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: goto 1e
      // 1a: invokestatic tm0.a (Loov;)Loov;
      // 1d: athrow
      // 1e: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 21: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 24: astore 3
      // 25: aload 3
      // 26: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b: ifeq 47
      // 2e: aload 3
      // 2f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 34: checkcast com/google/gson/JsonElement
      // 37: astore 4
      // 39: aload 0
      // 3a: aload 4
      // 3c: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 3f: invokevirtual tm0.add (Ljava/lang/Object;)Z
      // 42: pop
      // 43: iload 2
      // 44: ifne 25
      // 47: return
   }

   @Override
   public JsonElement ni6() {
      JsonArray var2 = new JsonArray();
      int var10000 = t9d.c();
      Iterator var3 = this.iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            String var4 = (String)var3.next();

            try {
               var6 = var2;
               if (var1 != 0) {
                  break;
               }

               var2.add(new JsonPrimitive(var4));
               if (var1 == 0) {
                  continue;
               }
            } catch (oov var5) {
               throw a(var5);
            }
         }

         var6 = var2;
         break;
      }

      return var6;
   }

   public Set delegate() {
      return this.sxl;
   }

   public Collection delegate() {
      return this.delegate();
   }

   public Object delegate() {
      return this.delegate();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
