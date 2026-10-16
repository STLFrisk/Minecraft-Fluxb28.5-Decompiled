import de.gerrygames.viarewind.api.ViaRewindConfig;
import de.gerrygames.viarewind.api.ViaRewindConfig.CooldownIndicator;

public class h8s$1 implements ViaRewindConfig {
   public final h8s jfr;

   public h8s$1(h8s var1) {
      this.jfr = var1;
   }

   public CooldownIndicator getCooldownIndicator() {
      return CooldownIndicator.TITLE;
   }

   public boolean isReplaceAdventureMode() {
      return true;
   }

   public boolean isReplaceParticles() {
      return true;
   }
}
