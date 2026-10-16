import java.io.File;
import java.util.logging.Logger;
import nl.matsv.viabackwards.ViaBackwards;
import nl.matsv.viabackwards.api.ViaBackwardsPlatform;
import us.myles.ViaVersion.api.Via;

public class t8z implements ViaBackwardsPlatform {
   public t8z() {
      ViaBackwards.init(this, new t8z$1(this));
      this.init(Minecraft.vz1().glh);
   }

   public Logger getLogger() {
      return Via.getPlatform().getLogger();
   }

   public void disable() {
   }

   public boolean isOutdated() {
      return false;
   }

   public File getDataFolder() {
      return Minecraft.vz1().glh;
   }
}
