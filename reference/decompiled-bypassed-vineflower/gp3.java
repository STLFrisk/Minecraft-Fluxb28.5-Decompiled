import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class gp3 {
   public static final Gson smu = new GsonBuilder()
      .registerTypeAdapter(gp3.class, new gp3$edv())
      .registerTypeAdapter(gp3$by5.class, new gp3$by5$sau())
      .create();
   private final Map rfi;

   public static gp3 sxy(Reader var0) {
      return (gp3)smu.fromJson(var0, gp3.class);
   }

   public gp3(Collection var1) {
      int var10000 = t9d.c();
      this.rfi = Maps.newHashMap();
      Iterator var3 = var1.iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         gp3$nnc var4 = (gp3$nnc)var3.next();
         this.rfi.put(gp3$nnc.npp(var4), var4);
         if (var2 != 0) {
            break;
         }
      }
   }

   public gp3(List var1) {
      int var10000 = t9d.b();
      this.rfi = Maps.newHashMap();
      int var2 = var10000;

      for (gp3 var4 : var1) {
         this.rfi.putAll(var4.rfi);
         if (var2 == 0) {
            break;
         }
      }
   }

   public gp3$nnc yjm(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield gp3.rfi Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast gp3$nnc
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifne 2f
      // 17: ifnonnull 2e
      // 1a: goto 21
      // 1d: invokestatic gp3.a (Lgp3$ac5;)Lgp3$ac5;
      // 20: athrow
      // 21: new gp3$ac5
      // 24: dup
      // 25: aload 0
      // 26: invokespecial gp3$ac5.<init> (Lgp3;)V
      // 29: athrow
      // 2a: invokestatic gp3.a (Lgp3$ac5;)Lgp3$ac5;
      // 2d: athrow
      // 2e: aload 3
      // 2f: areturn
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic gp3.a (Lgp3$ac5;)Lgp3$ac5;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic gp3.a (Lgp3$ac5;)Lgp3$ac5;
      // 19: athrow
      // 1a: aload 1
      // 1b: instanceof gp3
      // 1e: iload 2
      // 1f: ifne 40
      // 22: ifeq 3f
      // 25: goto 2c
      // 28: invokestatic gp3.a (Lgp3$ac5;)Lgp3$ac5;
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast gp3
      // 30: astore 3
      // 31: aload 0
      // 32: getfield gp3.rfi Ljava/util/Map;
      // 35: aload 3
      // 36: getfield gp3.rfi Ljava/util/Map;
      // 39: invokeinterface java/util/Map.equals (Ljava/lang/Object;)Z 2
      // 3e: ireturn
      // 3f: bipush 0
      // 40: ireturn
   }

   @Override
   public int hashCode() {
      return this.rfi.hashCode();
   }

   private static gp3$ac5 a(gp3$ac5 var0) {
      return var0;
   }
}
