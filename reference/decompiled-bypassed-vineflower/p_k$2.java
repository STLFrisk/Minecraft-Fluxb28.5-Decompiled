import com.google.common.util.concurrent.FutureCallback;
import net.minecraft.network.play.client.C19PacketResourcePackStatus;
import net.minecraft.network.play.client.C19PacketResourcePackStatus$lun;

public class p_k$2 implements FutureCallback {
   public final String qka;
   public final p_k siu;

   public p_k$2(p_k var1, String var2) {
      this.siu = var1;
      this.qka = var2;
   }

   public void onSuccess(Object var1) {
      p_k.c1i(this.siu).k7f(new C19PacketResourcePackStatus(this.qka, C19PacketResourcePackStatus$lun.q9e));
   }

   public void onFailure(Throwable var1) {
      p_k.c1i(this.siu).k7f(new C19PacketResourcePackStatus(this.qka, C19PacketResourcePackStatus$lun.htm));
   }
}
