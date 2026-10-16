import net.minecraft.network.login.client.C00PacketLoginStart;
import net.minecraft.network.login.client.C01PacketEncryptionResponse;
import net.minecraft.network.login.server.S00PacketDisconnect;
import net.minecraft.network.login.server.S01PacketEncryptionRequest;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.login.server.S03PacketEnableCompression;

public enum a0t$4 {
   public a0t$4(int var3) {
      this.y07(qat.yu7, S00PacketDisconnect.class);
      this.y07(qat.yu7, S01PacketEncryptionRequest.class);
      this.y07(qat.yu7, S02PacketLoginSuccess.class);
      this.y07(qat.yu7, S03PacketEnableCompression.class);
      this.y07(qat.qv9, C00PacketLoginStart.class);
      this.y07(qat.qv9, C01PacketEncryptionResponse.class);
   }
}
