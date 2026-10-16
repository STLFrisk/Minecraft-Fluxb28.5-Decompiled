import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.net.Proxy;

public class w4q extends YggdrasilAuthenticationService {
   public String s_2;

   public w4q(Proxy var1, String var2, String var3) {
      super(var1, var2);
      this.s_2 = var3;
   }

   public MinecraftSessionService createMinecraftSessionService() {
      return new sms(this, this.s_2);
   }
}
