import com.mojang.authlib.GameProfile;
import java.util.Date;

public class kr3$ccc {
   private final GameProfile lri;
   private final Date ipu;
   public final kr3 d4n;

   private kr3$ccc(kr3 var1, GameProfile var2, Date var3) {
      this.d4n = var1;
      this.lri = var2;
      this.ipu = var3;
   }

   public GameProfile mhm() {
      return this.lri;
   }

   public Date ojz() {
      return this.ipu;
   }

   public kr3$ccc(kr3 var1, GameProfile var2, Date var3, kr3$1 var4) {
      this(var1, var2, var3);
   }

   public static Date gqe(kr3$ccc var0) {
      return var0.ipu;
   }
}
