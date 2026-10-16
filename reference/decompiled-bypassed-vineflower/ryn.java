import net.minecraft.network.login.server.S00PacketDisconnect;
import net.minecraft.network.login.server.S01PacketEncryptionRequest;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.login.server.S03PacketEnableCompression;

public interface ryn extends yw3 {
   void gtz(S01PacketEncryptionRequest var1);

   void ib2(S02PacketLoginSuccess var1);

   void d2u(S00PacketDisconnect var1);

   void c37(S03PacketEnableCompression var1);
}
