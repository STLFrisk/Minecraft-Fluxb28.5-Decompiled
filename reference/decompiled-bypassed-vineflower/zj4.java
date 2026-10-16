import us.myles.ViaVersion.api.protocol.SimpleProtocol;
import us.myles.ViaVersion.packets.State;

public class zj4 extends SimpleProtocol {
   public static final zj4 q95 = new zj4();

   public void registerPackets() {
      this.registerIncoming(State.HANDSHAKE, 0, 0, new zj4$1(this));
   }
}
