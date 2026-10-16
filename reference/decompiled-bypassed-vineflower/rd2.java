import net.minecraft.network.handshake.client.C00Handshake;

public class rd2 implements hp4 {
   public rd2(vr1 var1, hv0 var2) {
      this.qa2 = var1;
      this.snz = var2;
   }

   @Override
   public void cpq(C00Handshake var1) {
      this.snz.hlc(var1.l4u());
      this.snz.kbj(new x_b(this.qa2, this.snz));
   }

   @Override
   public void az3(ekw var1) {
   }
}
