import com.mojang.authlib.GameProfile;
import net.minecraft.network.play.client.C18PacketSpectate;

public class rze implements sjk {
   public rze(GameProfile var1) {
      this.g2d = var1;
      this.qvx = x0l.to8(var1.getName());
      x0l.m1h(this.qvx, var1.getName());
   }

   @Override
   public void z9x(al9 var1) {
      Minecraft.vz1().c02().sxi(new C18PacketSpectate(this.g2d.getId()));
   }

   @Override
   public ekw s34() {
      return new tao(this.g2d.getName());
   }

   @Override
   public void b6x(float var1, int var2) {
      Minecraft.vz1().l22().anl(this.qvx);
      hzu.wn0(1.0F, 1.0F, 1.0F, (float)var2 / 255.0F);
      b0t.oc3(2.0F, 2.0F, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
      b0t.oc3(2.0F, 2.0F, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
   }

   @Override
   public boolean v4p() {
      return true;
   }
}
