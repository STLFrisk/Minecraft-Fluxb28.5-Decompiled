import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import java.util.Map;

public class yoe$1 extends CacheLoader {
   public final yoe av1;

   public yoe$1(yoe var1) {
      this.av1 = var1;
   }

   public Map usa(GameProfile var1) {
      return Minecraft.vz1().b8q().getTextures(var1, false);
   }

   public Object load(Object var1) {
      return this.usa((GameProfile)var1);
   }
}
