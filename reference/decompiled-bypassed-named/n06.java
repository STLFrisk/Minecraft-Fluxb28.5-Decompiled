import io.netty.buffer.ByteBuf;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import us.myles.ViaVersion.api.Via;
import us.myles.ViaVersion.api.ViaAPI;
import us.myles.ViaVersion.api.boss.BossBar;
import us.myles.ViaVersion.api.boss.BossColor;
import us.myles.ViaVersion.api.boss.BossStyle;
import us.myles.ViaVersion.api.data.UserConnection;
import us.myles.ViaVersion.api.protocol.ProtocolRegistry;

public class n06 implements ViaAPI {
   public int getPlayerVersion(UUID var1) {
      int var2 = OpaquePredicate.c();
      UserConnection var3 = Via.getManager().getConnection(var1);

      label34: {
         try {
            if (var2 != 0) {
               return var3.getProtocolInfo().getProtocolVersion();
            }

            if (var3 == null) {
               break label34;
            }
         } catch (Exception var6) {
            throw a(var6);
         }

         return var3.getProtocolInfo().getProtocolVersion();
      }

      try {
         return Via.getManager().getInjector().getServerProtocolVersion();
      } catch (Exception var5) {
         throw new AssertionError(var5);
      }
   }

   public boolean isInjected(UUID var1) {
      return Via.getManager().isClientConnected(var1);
   }

   public String getVersion() {
      return Via.getPlatform().getPluginVersion();
   }

   public void sendRawPacket(UUID var1, ByteBuf var2) {
      UserConnection var3 = Via.getManager().getConnection(var1);
      var3.sendRawPacket(var2);
   }

   public BossBar createBossBar(String var1, BossColor var2, BossStyle var3) {
      return new un6(var1, 1.0F, var2, var3);
   }

   public BossBar createBossBar(String var1, float var2, BossColor var3, BossStyle var4) {
      return new un6(var1, var2, var3, var4);
   }

   public SortedSet getSupportedVersions() {
      TreeSet var1 = new TreeSet(ProtocolRegistry.getSupportedVersions());
      var1.removeAll(Via.getPlatform().getConf().getBlockedProtocols());
      return var1;
   }

   public void sendRawPacket(Object var1, ByteBuf var2) {
      this.sendRawPacket((UUID)var1, var2);
   }

   public int getPlayerVersion(Object var1) {
      return this.getPlayerVersion((UUID)var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
