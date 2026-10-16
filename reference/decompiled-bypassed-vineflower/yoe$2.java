import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.awt.image.BufferedImage;

public class yoe$2 implements ji7 {
   public final ji7 yrc;
   public final yoe$cdm fnc;
   public final Type ecp;
   public final gdz xc7;
   public final MinecraftProfileTexture ukh;
   public final yoe iu9;

   public yoe$2(yoe var1, ji7 var2, yoe$cdm var3, Type var4, gdz var5, MinecraftProfileTexture var6) {
      this.iu9 = var1;
      this.yrc = var2;
      this.fnc = var3;
      this.ecp = var4;
      this.xc7 = var5;
      this.ukh = var6;
   }

   @Override
   public BufferedImage parseUserSkin(BufferedImage param1) {
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
      // 05: getfield yoe$2.yrc Lji7;
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifnull 28
      // 0f: goto 16
      // 12: invokestatic yoe$2.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield yoe$2.yrc Lji7;
      // 1a: goto 21
      // 1d: invokestatic yoe$2.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 1
      // 22: invokeinterface ji7.parseUserSkin (Ljava/awt/image/BufferedImage;)Ljava/awt/image/BufferedImage; 2
      // 27: astore 1
      // 28: aload 1
      // 29: areturn
   }

   @Override
   public void skinAvailable() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 27
      // 09: getfield yoe$2.yrc Lji7;
      // 0c: ifnull 26
      // 0f: goto 16
      // 12: invokestatic yoe$2.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield yoe$2.yrc Lji7;
      // 1a: invokeinterface ji7.skinAvailable ()V 1
      // 1f: goto 26
      // 22: invokestatic yoe$2.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: getfield yoe$2.fnc Lyoe$cdm;
      // 2a: iload 1
      // 2b: ifeq 43
      // 2e: ifnull 54
      // 31: goto 38
      // 34: invokestatic yoe$2.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield yoe$2.fnc Lyoe$cdm;
      // 3c: goto 43
      // 3f: invokestatic yoe$2.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: getfield yoe$2.ecp Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 47: aload 0
      // 48: getfield yoe$2.xc7 Lgdz;
      // 4b: aload 0
      // 4c: getfield yoe$2.ukh Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;
      // 4f: invokeinterface yoe$cdm.hax (Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;Lgdz;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;)V 4
      // 54: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
