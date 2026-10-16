import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0CPacketInput;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.client.C10PacketCreativeInventoryAction;
import net.minecraft.network.play.client.C11PacketEnchantItem;
import net.minecraft.network.play.client.C12PacketUpdateSign;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;
import net.minecraft.network.play.client.C14PacketTabComplete;
import net.minecraft.network.play.client.C15PacketClientSettings;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.client.C18PacketSpectate;
import net.minecraft.network.play.client.C19PacketResourcePackStatus;

public interface no5 extends yw3 {
   void vk9(C0APacketAnimation var1);

   void lad(C01PacketChatMessage var1);

   void w_f(C14PacketTabComplete var1);

   void zgf(C16PacketClientStatus var1);

   void myd(C15PacketClientSettings var1);

   void wp_(C0FPacketConfirmTransaction var1);

   void gtn(C11PacketEnchantItem var1);

   void u0n(C0EPacketClickWindow var1);

   void ebs(C0DPacketCloseWindow var1);

   void e0i(C17PacketCustomPayload var1);

   void x66(C02PacketUseEntity var1);

   void qoc(C00PacketKeepAlive var1);

   void cs0(C03PacketPlayer var1);

   void kh5(C13PacketPlayerAbilities var1);

   void c9j(C07PacketPlayerDigging var1);

   void z1g(C0BPacketEntityAction var1);

   void k2j(C0CPacketInput var1);

   void gd3(C09PacketHeldItemChange var1);

   void ppm(C10PacketCreativeInventoryAction var1);

   void qmt(C12PacketUpdateSign var1);

   void k4i(C08PacketPlayerBlockPlacement var1);

   void pnp(C18PacketSpectate var1);

   void cy5(C19PacketResourcePackStatus var1);
}
