package net.minecraft.network.login.server;

import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class S02PacketLoginSuccess implements mz2 {
   public S02PacketLoginSuccess() {
   }

   public S02PacketLoginSuccess(GameProfile var1) {
      this.pte = var1;
   }

   @Override
   public void ajj(nfj var1) {
      String var3 = var1.oa5(36);
      S00PacketDisconnect.b();
      String var4 = var1.oa5(16);
      UUID var5 = UUID.fromString(var3);

      try {
         this.pte = new GameProfile(var5, var4);
         if (i2h.b() != null) {
            S00PacketDisconnect.b(new i2h[1]);
         }
      } catch (oov var6) {
         throw a(var6);
      }
   }

   @Override
   public void ddd(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/login/server/S00PacketDisconnect.b ()[Li2h;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield net/minecraft/network/login/server/S02PacketLoginSuccess.pte Lcom/mojang/authlib/GameProfile;
      // 08: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 0b: astore 3
      // 0c: aload 1
      // 0d: aload 3
      // 0e: aload 2
      // 0f: ifnonnull 27
      // 12: ifnonnull 26
      // 15: goto 1c
      // 18: invokestatic net/minecraft/network/login/server/S02PacketLoginSuccess.a (Loov;)Loov;
      // 1b: athrow
      // 1c: ldc ""
      // 1e: nop
      // 1f: goto 2a
      // 22: invokestatic net/minecraft/network/login/server/S02PacketLoginSuccess.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 3
      // 27: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 2a: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 2d: pop
      // 2e: aload 1
      // 2f: aload 0
      // 30: getfield net/minecraft/network/login/server/S02PacketLoginSuccess.pte Lcom/mojang/authlib/GameProfile;
      // 33: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 36: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 39: pop
      // 3a: aload 2
      // 3b: ifnull 4c
      // 3e: bipush 5
      // 3f: anewarray 78
      // 42: invokestatic i2h.b ([Li2h;)V
      // 45: goto 4c
      // 48: invokestatic net/minecraft/network/login/server/S02PacketLoginSuccess.a (Loov;)Loov;
      // 4b: athrow
      // 4c: return
   }

   public void pas(ryn var1) {
      var1.ib2(this);
   }

   public GameProfile jji() {
      return this.pte;
   }

   @Override
   public void ito(yw3 var1) {
      this.pas((ryn)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
