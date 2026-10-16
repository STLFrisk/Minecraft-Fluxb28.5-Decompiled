import java.util.Map;

public class yoe$3$1 implements Runnable {
   public final Map q67;
   public final yoe$3 ghd;

   public yoe$3$1(yoe$3 var1, Map var2) {
      this.ghd = var1;
      this.q67 = var2;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield yoe$3$1.q67 Ljava/util/Map;
      // 08: getstatic com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.SKIN Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 0b: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 10: iload 1
      // 11: ifne 60
      // 14: ifeq 49
      // 17: goto 1e
      // 1a: invokestatic yoe$3$1.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield yoe$3$1.ghd Lyoe$3;
      // 22: getfield yoe$3.p_2 Lyoe;
      // 25: aload 0
      // 26: getfield yoe$3$1.q67 Ljava/util/Map;
      // 29: getstatic com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.SKIN Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 2c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 31: checkcast com/mojang/authlib/minecraft/MinecraftProfileTexture
      // 34: getstatic com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.SKIN Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 37: aload 0
      // 38: getfield yoe$3$1.ghd Lyoe$3;
      // 3b: getfield yoe$3.jxy Lyoe$cdm;
      // 3e: invokevirtual yoe.guc (Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;Lyoe$cdm;)Lgdz;
      // 41: pop
      // 42: goto 49
      // 45: invokestatic yoe$3$1.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: iload 1
      // 4b: ifne 64
      // 4e: getfield yoe$3$1.q67 Ljava/util/Map;
      // 51: getstatic com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.CAPE Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 54: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 59: goto 60
      // 5c: invokestatic yoe$3$1.a (Loov;)Loov;
      // 5f: athrow
      // 60: ifeq 87
      // 63: aload 0
      // 64: getfield yoe$3$1.ghd Lyoe$3;
      // 67: getfield yoe$3.p_2 Lyoe;
      // 6a: aload 0
      // 6b: getfield yoe$3$1.q67 Ljava/util/Map;
      // 6e: getstatic com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.CAPE Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 71: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 76: checkcast com/mojang/authlib/minecraft/MinecraftProfileTexture
      // 79: getstatic com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.CAPE Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 7c: aload 0
      // 7d: getfield yoe$3$1.ghd Lyoe$3;
      // 80: getfield yoe$3.jxy Lyoe$cdm;
      // 83: invokevirtual yoe.guc (Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;Lyoe$cdm;)Lgdz;
      // 86: pop
      // 87: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
