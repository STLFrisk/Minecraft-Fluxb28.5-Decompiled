package net.minecraft.network.login.client;

import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class C01PacketEncryptionResponse implements mz2 {
   public C01PacketEncryptionResponse() {
      this.oev = new byte[0];
      this.xkd = new byte[0];
   }

   public C01PacketEncryptionResponse(SecretKey var1, PublicKey var2, byte[] var3) {
      int var10000 = C00PacketLoginStart.c();
      this.oev = new byte[0];
      int var4 = var10000;

      try {
         this.xkd = new byte[0];
         this.oev = vk8.hbe(var2, var1.getEncoded());
         this.xkd = vk8.hbe(var2, var3);
         if (var4 == 0) {
            i2h.b(new i2h[2]);
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   @Override
   public void ajj(nfj var1) {
      this.oev = var1.z7_();
      this.xkd = var1.z7_();
   }

   @Override
   public void ddd(nfj var1) {
      int var2 = C00PacketLoginStart.b();

      try {
         var1.a4q(this.oev);
         var1.a4q(this.xkd);
         if (i2h.b() != null) {
            C00PacketLoginStart.b(++var2);
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   public void jkj(ccy var1) {
      var1.dmy(this);
   }

   public SecretKey pv8(PrivateKey var1) {
      return vk8.im3(var1, this.oev);
   }

   public byte[] ttx(PrivateKey param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/login/client/C00PacketLoginStart.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 1f
      // 09: ifnonnull 1e
      // 0c: goto 13
      // 0f: invokestatic net/minecraft/network/login/client/C01PacketEncryptionResponse.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: getfield net/minecraft/network/login/client/C01PacketEncryptionResponse.xkd [B
      // 17: goto 26
      // 1a: invokestatic net/minecraft/network/login/client/C01PacketEncryptionResponse.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 0
      // 20: getfield net/minecraft/network/login/client/C01PacketEncryptionResponse.xkd [B
      // 23: invokestatic vk8.u8s (Ljava/security/Key;[B)[B
      // 26: areturn
   }

   @Override
   public void ito(yw3 var1) {
      this.jkj((ccy)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
