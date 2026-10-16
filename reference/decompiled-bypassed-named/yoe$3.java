import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;

public class yoe$3 implements Runnable {
   public final GameProfile gmp;
   public final boolean frx;
   public final yoe$cdm jxy;
   public final yoe p_2;

   public yoe$3(yoe var1, GameProfile var2, boolean var3, yoe$cdm var4) {
      this.p_2 = var1;
      this.gmp = var2;
      this.frx = var3;
      this.jxy = var4;
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 07: astore 2
      // 08: aload 2
      // 09: aload 0
      // 0a: getfield yoe$3.p_2 Lyoe;
      // 0d: invokestatic yoe.pc0 (Lyoe;)Lcom/mojang/authlib/minecraft/MinecraftSessionService;
      // 10: aload 0
      // 11: getfield yoe$3.gmp Lcom/mojang/authlib/GameProfile;
      // 14: aload 0
      // 15: getfield yoe$3.frx Z
      // 18: invokeinterface com/mojang/authlib/minecraft/MinecraftSessionService.getTextures (Lcom/mojang/authlib/GameProfile;Z)Ljava/util/Map; 3
      // 1d: invokeinterface java/util/Map.putAll (Ljava/util/Map;)V 2
      // 22: goto 26
      // 25: astore 3
      // 26: aload 2
      // 27: invokeinterface java/util/Map.isEmpty ()Z 1
      // 2c: iload 1
      // 2d: ifeq 57
      // 30: ifeq 9e
      // 33: goto 3a
      // 36: invokestatic yoe$3.a (Lcom/mojang/authlib/minecraft/InsecureTextureException;)Lcom/mojang/authlib/minecraft/InsecureTextureException;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield yoe$3.gmp Lcom/mojang/authlib/GameProfile;
      // 3e: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 41: invokestatic Minecraft.vz1 ()Lc05;
      // 44: invokevirtual Minecraft.ee0 ()Lrh0;
      // 47: invokevirtual rh0.ghh ()Lcom/mojang/authlib/GameProfile;
      // 4a: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 4d: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 50: goto 57
      // 53: invokestatic yoe$3.a (Lcom/mojang/authlib/minecraft/InsecureTextureException;)Lcom/mojang/authlib/minecraft/InsecureTextureException;
      // 56: athrow
      // 57: iload 1
      // 58: ifeq 86
      // 5b: ifeq 9e
      // 5e: goto 65
      // 61: invokestatic yoe$3.a (Lcom/mojang/authlib/minecraft/InsecureTextureException;)Lcom/mojang/authlib/minecraft/InsecureTextureException;
      // 64: athrow
      // 65: aload 0
      // 66: getfield yoe$3.gmp Lcom/mojang/authlib/GameProfile;
      // 69: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 6c: invokevirtual com/mojang/authlib/properties/PropertyMap.clear ()V
      // 6f: aload 0
      // 70: getfield yoe$3.gmp Lcom/mojang/authlib/GameProfile;
      // 73: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 76: invokestatic Minecraft.vz1 ()Lc05;
      // 79: invokevirtual Minecraft.h2c ()Lcom/mojang/authlib/properties/PropertyMap;
      // 7c: invokevirtual com/mojang/authlib/properties/PropertyMap.putAll (Lcom/google/common/collect/Multimap;)Z
      // 7f: goto 86
      // 82: invokestatic yoe$3.a (Lcom/mojang/authlib/minecraft/InsecureTextureException;)Lcom/mojang/authlib/minecraft/InsecureTextureException;
      // 85: athrow
      // 86: pop
      // 87: aload 2
      // 88: aload 0
      // 89: getfield yoe$3.p_2 Lyoe;
      // 8c: invokestatic yoe.pc0 (Lyoe;)Lcom/mojang/authlib/minecraft/MinecraftSessionService;
      // 8f: aload 0
      // 90: getfield yoe$3.gmp Lcom/mojang/authlib/GameProfile;
      // 93: bipush 0
      // 94: invokeinterface com/mojang/authlib/minecraft/MinecraftSessionService.getTextures (Lcom/mojang/authlib/GameProfile;Z)Ljava/util/Map; 3
      // 99: invokeinterface java/util/Map.putAll (Ljava/util/Map;)V 2
      // 9e: invokestatic Minecraft.vz1 ()Lc05;
      // a1: new yoe$3$1
      // a4: dup
      // a5: aload 0
      // a6: aload 2
      // a7: invokespecial yoe$3$1.<init> (Lyoe$3;Ljava/util/Map;)V
      // aa: invokevirtual Minecraft.acd (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
      // ad: pop
      // ae: return
   }

   private static InsecureTextureException a(InsecureTextureException var0) {
      return var0;
   }
}
