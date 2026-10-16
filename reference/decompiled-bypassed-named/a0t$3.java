import net.minecraft.network.status.client.C00PacketServerQuery;
import net.minecraft.network.status.client.C01PacketPing;
import net.minecraft.network.status.server.S00PacketServerInfo;
import net.minecraft.network.status.server.S01PacketPong;

public enum a0t$3 {
   public a0t$3(int var3) {
      this.y07(qat.qv9, C00PacketServerQuery.class);
      this.y07(qat.yu7, S00PacketServerInfo.class);
      this.y07(qat.qv9, C01PacketPing.class);
      this.y07(qat.yu7, S01PacketPong.class);
   }
}
