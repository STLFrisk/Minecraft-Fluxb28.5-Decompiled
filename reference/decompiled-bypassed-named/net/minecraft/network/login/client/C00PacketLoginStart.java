package net.minecraft.network.login.client;

import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class C00PacketLoginStart implements mz2 {
   private static int a;

   public C00PacketLoginStart() {
   }

   public C00PacketLoginStart(GameProfile var1) {
      this.xfi = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.xfi = new GameProfile((UUID)null, var1.oa5(16));
   }

   @Override
   public void ddd(nfj var1) {
      var1.p3z(this.xfi.getName());
   }

   public void tm7(ccy var1) {
      var1.v1t(this);
   }

   public GameProfile zug() {
      return this.xfi;
   }

   @Override
   public void ito(yw3 var1) {
      this.tm7((ccy)var1);
   }

   public static void b(int var0) {
      a = var0;
   }

   public static int b() {
      return a;
   }

   public static int c() {
      int var0 = b();

      try {
         return var0 == 0 ? 19 : 0;
      } catch (oov var1) {
         throw a(var1);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   static {
      if (b() != 0) {
         b(96);
      }
   }
}
