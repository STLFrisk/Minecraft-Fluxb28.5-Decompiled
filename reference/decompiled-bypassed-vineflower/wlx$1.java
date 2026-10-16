import net.minecraft.network.play.server.S44PacketWorldBorder;
import net.minecraft.network.play.server.S44PacketWorldBorder$yf2;

public class wlx$1 implements l04 {
   public final wlx jv7;

   public wlx$1(wlx var1) {
      this.jv7 = var1;
   }

   @Override
   public void aod(w5i var1, double var2) {
      this.jv7.v3l(new S44PacketWorldBorder(var1, S44PacketWorldBorder$yf2.usb));
   }

   @Override
   public void qe2(w5i var1, double var2, double var4, long var6) {
      this.jv7.v3l(new S44PacketWorldBorder(var1, S44PacketWorldBorder$yf2.q9x));
   }

   @Override
   public void o_5(w5i var1, double var2, double var4) {
      this.jv7.v3l(new S44PacketWorldBorder(var1, S44PacketWorldBorder$yf2.ts3));
   }

   @Override
   public void zm9(w5i var1, int var2) {
      this.jv7.v3l(new S44PacketWorldBorder(var1, S44PacketWorldBorder$yf2.nm1));
   }

   @Override
   public void kcs(w5i var1, int var2) {
      this.jv7.v3l(new S44PacketWorldBorder(var1, S44PacketWorldBorder$yf2.ddg));
   }

   @Override
   public void rz9(w5i var1, double var2) {
   }

   @Override
   public void zxa(w5i var1, double var2) {
   }
}
