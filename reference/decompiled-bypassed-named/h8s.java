import de.gerrygames.viarewind.api.ViaRewindPlatform;
import java.util.logging.Logger;
import us.myles.ViaVersion.api.Via;

public class h8s implements ViaRewindPlatform {
   public h8s() {
      this.init(new h8s$1(this));
   }

   public Logger getLogger() {
      return Via.getPlatform().getLogger();
   }
}
